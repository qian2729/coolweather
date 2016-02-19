package cn.codingforfun.coolweather.util;

/**
 * Created by liuzongqian on 16/2/19.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
