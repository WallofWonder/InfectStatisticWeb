package com.infect.backend.utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DataRequest {

    private static final String API_KEY0 = "7d900b241b39bf06d81bfc22d476f3ce";
    private static final String API_KEY1 = "12739a780bcb4c12bb01e0a21f4a1a96";
    private static final String API_KEY2 = "bc66a1953377e5be79d1941747e8c6dd";
    public static final String PROVINCE_AND_CITY_STATISICS = "http://api.tianapi.com/txapi/ncovcity/index";
    public static final String NATION_STATISICS_AND_NEWS = "http://api.tianapi.com/txapi/ncov/index";

    /**
     * @param httpUrl 请求接口
     * @param httpArg 参数
     * @param tag     apiKey选择标识
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg, int tag) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        String apiKey = "";

        if (tag == 0) {
            apiKey = API_KEY0;
        }
        else if (tag == 1) {
            apiKey = API_KEY1;
        }
        else if (tag == 2) {
            apiKey = API_KEY2;
        }
        httpUrl = httpUrl + "?key="
                + apiKey
                + ((httpArg == null) ? "" : httpArg);

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
