package com.example.cctutil;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.*;
import com.qcloud.cos.region.Region;
import com.qcloud.cos.transfer.Download;
import com.qcloud.cos.transfer.TransferManager;
import com.qcloud.cos.transfer.Upload;
import sun.nio.ch.IOUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 腾讯云对象存储服务
 *
 * @author caic
 * @version 1.0 创建时间：2018-01-26 13:59
 */
public class TencentCOS {

    private static COSClient cosClient;
    // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
    private static final String bucketName = "cctread-1256010222";

    //开发者访问 COS 服务时拥有的用户维度唯一资源标识，用以标识资源
    private static final String AppId = "1256010222";

    //开发者拥有的项目身份识别 ID，用以身份认证
    private static final String SecretId = "AKIDBNPH0ZPAE7oKgq6dHk28C757CHBtfmyz";

    //开发者拥有的项目身份密钥
    private static final String SecretKey = "zoUzOm7XtCbyFPSPFybBev121tZ4MSN6";

    //服务器所属区域
    private static final String region_name = "ap-beijing";

    //线程池
    private static ExecutorService threadPool = Executors.newFixedThreadPool(32);

    /**
     * 创建客户端连接
     */
    private static void createClient() {
        if (cosClient != null) {
            return;
        }
        // 1 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials(SecretId, SecretKey);
        // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region(region_name));
        // 3 生成cos客户端
        cosClient = new COSClient(cred, clientConfig);

        //return cosclient;
    }

    /**
     * 上传文件
     *
     * @param file 需要上传的文件
     * @param key  服务器文件路径
     */
    public static void uploadFile(File file, String key) {
        createClient();
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        //File localFile = new File("D:/test.txt");
        // 指定要上传到 COS 上的路径
        //String key = "/upload_single_demo.txt";
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
    }

    /**
     * 下载文件
     *
     * @param file 指定要下载到的本地路径
     * @param key  服务器文件路径
     */
    public static void downloadFile(File file, String key) {
        createClient();
        // 指定要下载到的本地路径
        //File downFile = new File("E:/test.txt");
        //String key = "/upload_single_demo.txt";
        // 指定要下载的文件所在的 bucket 和路径
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        ObjectMetadata downObjectMeta = cosClient.getObject(getObjectRequest, file);
    }

    /**
     * 删除文件
     *
     * @param key 服务器文件路径
     */
    public static void deleteFile(String key) {
        createClient();
        // 指定要删除的 bucket 和路径
        cosClient.deleteObject(bucketName, key);
    }

    public static void closeClient() {
        if (cosClient == null) {
            return;
        }
        // 关闭客户端(关闭后台线程)
        cosClient.shutdown();
    }

    /**
     * 异步上传文件
     *
     * @param file 需要上传的文件
     * @param key  服务器文件路径
     */
    public static void upload(File file, String key) {
        createClient();
        // 传入一个threadpool, 若不传入线程池, 默认TransferManager中会生成一个单线程的线程池。
        TransferManager transferManager = new TransferManager(cosClient, threadPool);
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
        // 本地文件上传
        Upload upload = transferManager.upload(putObjectRequest);
        // 等待传输结束（如果想同步的等待上传结束，则调用 waitForCompletion）
        try {
            UploadResult uploadResult = upload.waitForUploadResult();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 关闭 TransferManger
        transferManager.shutdownNow();
    }

    /**
     * 异步下载文件
     *
     * @param file 下载的文件
     * @param key  服务器文件路径
     */
    public static void download(File file, String key) {
        createClient();
        // 传入一个threadpool, 若不传入线程池, 默认TransferManager中会生成一个单线程的线程池。
        TransferManager transferManager = new TransferManager(cosClient, threadPool);
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        // 下载文件
        Download download = transferManager.download(getObjectRequest, file);
        // 等待传输结束（如果想同步的等待上传结束，则调用 waitForCompletion）
        try {
            download.waitForCompletion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 关闭 TransferManger
        transferManager.shutdownNow();
    }

    /**
     * 使用流下载文本文件
     *
     * @param txtPath 文件名称
     * @return 文本内容
     * @书名命名格式 书名_作者名_章节编号
     */
    public String getObject(String txtPath) {
        String str = null;
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, txtPath);
            COSObject cosObject = cosClient.getObject(getObjectRequest);
            COSObjectInputStream cosObjectInput = cosObject.getObjectContent();
            //str = IOUtil.inputStreamToString(cosObjectInput, "GBK");
            str = inputStreamToString(cosObjectInput, "GBK");
            cosObjectInput.close();
        } catch (CosServiceException cse) {
            //String msg = "文件" + txtPath + "不存在";
            //log.error(msg + "-" + cse);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return str;
    }

    /**
     * 依据编码转换流为字符串
     *
     * @param is
     * @param encoding
     * @return
     * @throws IOException
     */
    public static String inputStreamToString(InputStream is, String encoding) throws IOException {
        int count = is.available();
        byte[] b = new byte[count];
        int readCount = 0;
        while (readCount < count) {
            readCount += is.read(b, readCount, count - readCount);
        }
        return new String(b, 0, count, encoding);
    }

    public static void main(String args[]) {

    }
}
