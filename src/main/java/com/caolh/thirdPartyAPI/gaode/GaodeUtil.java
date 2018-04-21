package com.caolh.thirdPartyAPI.gaode;


import com.caolh.utils.HttpclientUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by 2018.1.19 on 2018/1/24.
 */
public class GaodeUtil  extends HttpclientUtil implements  GaodeInterface{
   private HttpclientUtil httpclientUtil = new HttpclientUtil();

    public static void main(String[] args)throws Exception {
        GaodeUtil GaodeUtil  = new GaodeUtil();
        GaodeUtil.GeographicInverseCoding("116.38","39.90");
    }

    /**
     * 根据经纬度得到 中文地理位置
     * @return
     */
   public  Map GeographicInverseCoding(String longitude,String latitude) throws Exception{
       NameValuePair pair0= new BasicNameValuePair("key",key);
//       NameValuePair pair1 = new BasicNameValuePair("output","xml");
       NameValuePair pair2 = new BasicNameValuePair("location",longitude+","+latitude);
//       NameValuePair pair3 = new BasicNameValuePair("radius","1000");
//       NameValuePair pair4 = new BasicNameValuePair("extensions","all");

       ArrayList<NameValuePair> pairs = new ArrayList<NameValuePair>();
       pairs.add(pair0);pairs.add(pair2);
     //  pairs.add(pair1);pairs.add(pair3);pairs.add(pair4);
       HttpPost httpPost = getHttpPost(pairs,GeographicInverseCoding_Url);
        Map resMap = httpclientEex(httpPost);
       System.out.println(resMap);
       return null;
   }
}



