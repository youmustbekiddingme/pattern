package com.caolh.httpclientPool2;


import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {
    @Autowired
    private CloseableHttpClient httpClient;

    @Test
    public void  ttt(){
        long start = System.currentTimeMillis();
        String[] urisToGet = {
                "http://uri.amap.com/marker?position=121.287689,31.234527&name=park&src=mypage&coordinate=gaode&callnative=0",
                "http://www.163.com/",
                "http://www.qq.com/",
                "http://www.bswifi.com/",
                "https://www.csdn.net/"

        };
        String mykey="697a039c96fbeab24501e8c8b5ab5bd5";
        String url_gaode="http://restapi.amap.com/v3/geocode/regeo?key="+mykey+"&location=116.481488,39.990464&poitype=商务写字楼&radius=1000&extensions=all&batch=false&roadlevel=0";
        //创建线程池测试
        try {
            ///int pagecount = urisToGet.length;
            int pagecount = 60;  //怎么证明是  单例的？  连接池 里的数目？？？
            ExecutorService executors = Executors.newFixedThreadPool(pagecount);
            CountDownLatch countDownLatch = new CountDownLatch(pagecount);
            for(int i = 0; i< pagecount;i++){
                HttpGet httpget = new HttpGet(url_gaode);//
                config(httpget);
               //System.out.println(httpClient+"client2=======================================================");
                //启动线程抓取
                executors.execute(new AppTest.GetRunnable(httpClient,httpget,countDownLatch));
            }

            countDownLatch.await();
            executors.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("=====================================");
         //  System.out.println("线程" + Thread.currentThread().getName() + "," + System.currentTimeMillis() + ", 所有线程已完成，开始进入下一步！");
        }

        long end = System.currentTimeMillis();
        System.out.println("consume -> " + (end - start));

    }

    /**
     * 单个线程去执行 http请求
     */
    static class GetRunnable implements Runnable {
        private CountDownLatch countDownLatch;
        private final CloseableHttpClient httpClient;
        private final HttpGet httpget;

        public GetRunnable(CloseableHttpClient httpClient, HttpGet httpget, CountDownLatch countDownLatch){
            this.httpClient = httpClient;
            this.httpget = httpget;

            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            CloseableHttpResponse response = null;
            try {
                response = httpClient.execute(httpget, HttpClientContext.create());
                HttpEntity entity = response.getEntity();
            System.out.println(EntityUtils.toString(entity, "utf-8")) ;
                EntityUtils.consume(entity);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
                System.out.println(countDownLatch);
                try {
                    if(response != null)
                        response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    /**
     * 设置http 请求超时时间
     * @param httpRequestBase
     */
    private static void config(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("User-Agent", "Mozilla/5.0");
        httpRequestBase.setHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        httpRequestBase.setHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");//"en-US,en;q=0.5");
        httpRequestBase.setHeader("Accept-Charset", "ISO-8859-1,utf-8,gbk,gb2312;q=0.7,*;q=0.7");

        // 配置请求的超时设置
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(5000)   //从httplclient连接池获取连接的超时时间
                .setConnectTimeout(5000)   //与服务器建立连接的超时时间
                .setSocketTimeout(5000)   //与服务器建立连接后，获取响应结果的超时时间
                .build();
        httpRequestBase.setConfig(requestConfig);
    }
}
