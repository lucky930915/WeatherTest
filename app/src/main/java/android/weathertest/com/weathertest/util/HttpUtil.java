package android.weathertest.com.weathertest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by gyn on 18-4-12.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        //1.初始化一个OkHttpClient
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
