package com.infect.backend.utils;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DataRequest {

    private static final String KEY = "7d900b241b39bf06d81bfc22d476f3ce";
    public static final String STATISICS = "http://api.tianapi.com/txapi/ncovcity/index";

    /**
     * @param httpUrl 请求接口
     * @param httpArg 参数
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?key=" + KEY + ((httpArg == null) ? "" : httpArg);

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
