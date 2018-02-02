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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.nio.ch.IOUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * ��Ѷ�ƶ���洢����
 *
 * @updateRemark 修改java文件编码为UTF-8，原GBK编码汉字无法转换
 * @author caic
 * @version 1.0 ����ʱ�䣺2018-01-26 13:59
 */
public class TencentCOS {

    private static final Logger log = LoggerFactory.getLogger(TencentCOS.class);

    private static COSClient cosClient;
    // bucket����������Ϊ{name}-{appid} ���˴���д�Ĵ洢Ͱ���Ʊ���Ϊ�˸�ʽ
    private static final String bucketName = "cctread-1256010222";

    //�����߷��� COS ����ʱӵ�е��û�ά��Ψһ��Դ��ʶ�����Ա�ʶ��Դ
    private static final String AppId = "1256010222";

    //������ӵ�е���Ŀ���ʶ�� ID�����������֤
    private static final String SecretId = "AKIDBNPH0ZPAE7oKgq6dHk28C757CHBtfmyz";

    //������ӵ�е���Ŀ�����Կ
    private static final String SecretKey = "zoUzOm7XtCbyFPSPFybBev121tZ4MSN6";

    //��������������
    private static final String region_name = "ap-beijing";

    //�̳߳�
    private static ExecutorService threadPool = Executors.newFixedThreadPool(32);

    /**
     * �����ͻ�������
     */
    private static void createClient() {
        if (cosClient != null) {
            return;
        }
        // 1 ��ʼ���û������Ϣ(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials(SecretId, SecretKey);
        // 2 ����bucket������, COS����ļ������� https://cloud.tencent.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region(region_name));
        // 3 ����cos�ͻ���
        cosClient = new COSClient(cred, clientConfig);

        //return cosclient;
    }

    /**
     * �ϴ��ļ�
     *
     * @param file ��Ҫ�ϴ����ļ�
     * @param key  �������ļ�·��
     */
    public static void uploadFile(File file, String key) {
        createClient();
        // ���ļ��ϴ�, ���֧�� 5 GB, ������С�ļ��ϴ�, ���� 20 M ���µ��ļ�ʹ�øýӿ�
        // ���ļ��ϴ������ API �ĵ��߼� API �ϴ�
        //File localFile = new File("D:/test.txt");
        // ָ��Ҫ�ϴ��� COS �ϵ�·��
        //String key = "/upload_single_demo.txt";
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
    }

    /**
     * �����ļ�
     *
     * @param file ָ��Ҫ���ص��ı���·��
     * @param key  �������ļ�·��
     */
    public static void downloadFile(File file, String key) {
        createClient();
        // ָ��Ҫ���ص��ı���·��
        //File downFile = new File("E:/test.txt");
        //String key = "/upload_single_demo.txt";
        // ָ��Ҫ���ص��ļ����ڵ� bucket ��·��
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        ObjectMetadata downObjectMeta = cosClient.getObject(getObjectRequest, file);
    }

    /**
     * ɾ���ļ�
     *
     * @param key �������ļ�·��
     */
    public static void deleteFile(String key) {
        createClient();
        // ָ��Ҫɾ���� bucket ��·��
        cosClient.deleteObject(bucketName, key);
    }

    public static void closeClient() {
        if (cosClient == null) {
            return;
        }
        // �رտͻ���(�رպ�̨�߳�)
        cosClient.shutdown();
    }

    /**
     * �첽�ϴ��ļ�
     *
     * @param file ��Ҫ�ϴ����ļ�
     * @param key  �������ļ�·��
     */
    public static void upload(File file, String key) {
        createClient();
        // ����һ��threadpool, ���������̳߳�, Ĭ��TransferManager�л�����һ�����̵߳��̳߳ء�
        TransferManager transferManager = new TransferManager(cosClient, threadPool);
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
        // �����ļ��ϴ�
        Upload upload = transferManager.upload(putObjectRequest);
        // �ȴ���������������ͬ���ĵȴ��ϴ������������ waitForCompletion��
        try {
            UploadResult uploadResult = upload.waitForUploadResult();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // �ر� TransferManger
        transferManager.shutdownNow();
    }

    /**
     * �첽�����ļ�
     *
     * @param file ���ص��ļ�
     * @param key  �������ļ�·��
     */
    public static void download(File file, String key) {
        createClient();
        // ����һ��threadpool, ���������̳߳�, Ĭ��TransferManager�л�����һ�����̵߳��̳߳ء�
        TransferManager transferManager = new TransferManager(cosClient, threadPool);
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        // �����ļ�
        Download download = transferManager.download(getObjectRequest, file);
        // �ȴ���������������ͬ���ĵȴ��ϴ������������ waitForCompletion��
        try {
            download.waitForCompletion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // �ر� TransferManger
        transferManager.shutdownNow();
    }

    /**
     * ʹ���������ı��ļ�
     *
     * @param txtPath �ļ�����
     * @return �ı�����
     * @����������ʽ ����_������_�½ڱ��
     */
    public static String getObject(String txtPath) {
        createClient();
        String str = null;
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, txtPath);
            COSObject cosObject = cosClient.getObject(getObjectRequest);
            COSObjectInputStream cosObjectInput = cosObject.getObjectContent();
            //str = IOUtil.inputStreamToString(cosObjectInput, "GBK");
            str = inputStreamToString(cosObjectInput, "GBK");
            cosObjectInput.close();
        } catch (CosServiceException cse) {
            String msg = "�ļ�" + txtPath + "������";
            log.error(msg + "-" + cse);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return str;
    }

    /**
     * ���ݱ���ת����Ϊ�ַ���
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
