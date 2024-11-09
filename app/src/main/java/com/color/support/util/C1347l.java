package com.color.support.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: ColorStatusBarResponseActivity.java */
/* renamed from: com.color.support.util.l */
/* loaded from: classes.dex */
final class C1347l extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ColorStatusBarResponseActivity f5827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1347l(ColorStatusBarResponseActivity colorStatusBarResponseActivity) {
        this.f5827a = colorStatusBarResponseActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.i("ColorStatusBarResponseActivity", "The broadcast receiever was registered successfully and receives the broadcast");
        Log.i("ColorStatusBarResponseActivity", "onStatusBarClicked is called at time :" + System.currentTimeMillis());
    }
}
