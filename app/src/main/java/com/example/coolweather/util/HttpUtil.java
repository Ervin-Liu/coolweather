package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Describe: Http util
 * <p>
 * Created by Ervin Liu on 2021/02/27---10:24
 **/
public class HttpUtil {
    /**
     * 通过okhttp获取数据
     * @param address
     * @param callback
     */
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                                    .url(address)
                                    .build();
        client.newCall(request).enqueue(callback);
    }
}
