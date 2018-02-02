package com.example.cctutil.cos;

import com.example.cctutil.io.IOUtil;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.*;
import com.qcloud.cos.transfer.Download;
import com.qcloud.cos.transfer.TransferManager;
import com.qcloud.cos.transfer.Upload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;


/**
 * 腾讯对象云存储服务
 *
 * @author caic
 * @version 2.0 创建时间：2018-01-26 13:59
 * @version2.0updateRemark 修改java文件编码为UTF-8，原GBK编码汉字无法转换
 */
public class TencentCOS {

    private static final Logger log = LoggerFactory.getLogger(TencentCOS.class);

    /**
     * 桶名
     */
    private static final String bucketName = "cctread-1256010222";

    /**
     * 上传文件
     *
     * @param file 需要上传的文件
     * @param key  服务器文件路径
     */
    public static void uploadFile(File file, String key) {
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        //File localFile = new File("D:/test.txt");
        // 指定要上传到 cos 上的路径
        //String key = "/upload_single_demo.txt";
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
        PutObjectResult putObjectResult = getCosClient().putObject(putObjectRequest);
    }

    /**
     * 下载文件
     *
     * @param file 指定要下载到的本地路径
     * @param key  服务器文件路径
     */
    public static void downloadFile(File file, String key) {
        // 指定要下载到的本地路径
        //File downFile = new File("E:/test.txt");
        //String key = "/upload_single_demo.txt";
        // 指定要下载的文件所在的 bucket 和路径
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        ObjectMetadata downObjectMeta = getCosClient().getObject(getObjectRequest, file);
    }

    /**
     * 删除文件
     *
     * @param key 服务器文件路径
     */
    public static void deleteFile(String key) {
        // 指定要删除的 bucket 和路径
        getCosClient().deleteObject(bucketName, key);
    }

    public static void closeClient() {
        if (getCosClient() == null) {
            return;
        }
        // 关闭客户端(关闭后台线程)
        getCosClient().shutdown();
    }

    /**
     * 异步上传文件
     *
     * @param file 需要上传的文件
     * @param key  服务器文件路径
     */
    public static void upload(File file, String key) {
        // 传入一个threadpool, 若不传入线程池, 默认TransferManager中会生成一个单线程的线程池。
        TransferManager transferManager = new TransferManager(getCosClient(), getThreadPool());
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
        // 传入一个threadpool, 若不传入线程池, 默认TransferManager中会生成一个单线程的线程池。
        TransferManager transferManager = new TransferManager(getCosClient(), getThreadPool());
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
    public static String getObject(String txtPath) {
        String str = null;
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, txtPath);
            COSObject cosObject = getCosClient().getObject(getObjectRequest);
            COSObjectInputStream cosObjectInput = cosObject.getObjectContent();
            str = IOUtil.inputStreamToString(cosObjectInput, "GBK");
            cosObjectInput.close();
        } catch (CosServiceException cse) {
            String msg = "文件" + txtPath + "不存在";
            log.error(msg + "-" + cse);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return str;
    }

    /**
     * 使用流上传文本
     *
     * @param text    文本内容
     * @param txtPath 文件名
     * @书名命名格式 书名_作者名_章节编号
     */
    public static void putObject(String text, String txtPath) {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            //文本转字节流
            byteArrayInputStream = new ByteArrayInputStream(text.getBytes("GBK"));

            ObjectMetadata objectMetadata = new ObjectMetadata();
            //获取流长度
            int count = byteArrayInputStream.available();
            objectMetadata.setContentLength(count);
            objectMetadata.setContentType("application/text");
            getCosClient().putObject(bucketName, txtPath, byteArrayInputStream, objectMetadata);
            log.info("上传<" + txtPath + ">成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static COSClient getCosClient() {
        return TenCentCosClient.getCosClient();
    }

    public static ExecutorService getThreadPool() {
        return TenCentCosClient.getThreadPool();
    }


}
