package com.coloros.neton;

import android.text.TextUtils;
import neton.Interceptor;
import neton.Response;
import neton.client.Utils.LogUtil;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class OppoSetInterceptor implements Interceptor {
    @Override // neton.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        setOppoSet(proceed);
        return proceed;
    }

    private void setOppoSet(Response response) {
        String str;
        String stringData = ConfigManager.getInstance().getStringData(Constants.KEY_HEADER_SET);
        if (response == null || !response.isSuccessful()) {
            str = null;
        } else {
            str = response.header(Constants.KEY_HEADER_SET);
            LogUtil.m7844d("setOppoSet--response:".concat(String.valueOf(str)));
        }
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(stringData)) {
            return;
        }
        LogUtil.m7844d("setOppoSet--final:".concat(String.valueOf(str)));
        ConfigManager.getInstance().setStringData(Constants.KEY_HEADER_SET, str);
    }
}
