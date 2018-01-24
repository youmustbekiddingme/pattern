package com.caolh.utils;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/**
 * Httpclient 工具
 */
public class HttpclientUtil {

    /**
     * 通过NameValuePair设置httppost
     *
     * @param list
     * @param url
     * @return
     * @throws Exception
     */
    protected HttpPost getHttpPost(List<NameValuePair> list, String url) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        HttpEntity requestEntity = new UrlEncodedFormEntity(list);
        httpPost.setEntity(requestEntity);
        return httpPost;
    }

    /**
     * 通过MultipartEntity 设置httppost
     *
     * @param multipartEntity
     * @param url
     * @return
     */
    protected HttpPost getHttpPost(MultipartEntity multipartEntity, String url) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(multipartEntity);
        return httpPost;
    }


    /**
     * 执行httppost请求
     *
     * @param httpPost
     * @return
     */
    public Map httpclientEex(HttpPost httpPost) {
        HttpClient httpClient = HttpClients.createDefault();
        String resString = "{\"status\":\"-1\"}";
        Gson gson = new Gson();
        Map mapTest =  gson.fromJson(resString,Map.class);
        System.out.println(mapTest);
        try {
            HttpResponse response = httpClient.execute(httpPost);
            //if (response.getStatusLine().getStatusCode() == 200)
            HttpEntity entity = response.getEntity();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(entity.getContent()));
            resString = reader.readLine();
            Map map = gson.fromJson(resString, Map.class);
            return map;

        } catch (Exception e) {
            resString = e.getMessage();
            throw new RuntimeException(resString);
        }

    }
}
