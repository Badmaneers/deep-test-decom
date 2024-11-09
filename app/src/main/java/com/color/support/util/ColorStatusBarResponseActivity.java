package com.color.support.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public class ColorStatusBarResponseActivity extends Activity {

    /* renamed from: a */
    private BroadcastReceiver f5802a;

    /* renamed from: b */
    private final String f5803b = "ColorStatusBarResponseActivity";

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f5802a = new C1347l(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.color.clicktop");
        registerReceiver(this.f5802a, intentFilter);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.f5802a);
    }
}
