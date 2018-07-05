package com;

import android.app.Application;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public class MyApplication extends Application{


    private static IWXAPI mWxApi;
    private String WX_APPID = "";

    @Override
    public void onCreate() {
        super.onCreate();
        mWxApi = WXAPIFactory.createWXAPI(this, WX_APPID, true);
        mWxApi.registerApp(WX_APPID);
    }
}
