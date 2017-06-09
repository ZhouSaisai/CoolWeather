package com.zhouss.www.coolweather.util;

/**
 * Created by zs on 2017/6/9.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
