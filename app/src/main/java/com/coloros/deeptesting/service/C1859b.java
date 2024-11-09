package com.coloros.deeptesting.service;

import android.content.Context;
import android.os.SystemProperties;
import com.coloros.deeptesting.p064a.C1842h;
import com.coloros.neton.BuildConfig;
import com.google.p066a.p067a.InterfaceC1894b;

/* compiled from: RequestService.java */
/* renamed from: com.coloros.deeptesting.service.b */
/* loaded from: classes.dex */
public final class C1859b {

    /* renamed from: a */
    @InterfaceC1894b(m6054a = "pcb")
    private String f8616a;

    /* renamed from: b */
    @InterfaceC1894b(m6054a = "imei")
    private String f8617b;

    /* renamed from: c */
    @InterfaceC1894b(m6054a = "model")
    private String f8618c;

    /* renamed from: d */
    @InterfaceC1894b(m6054a = "otaVersion")
    private String f8619d;

    /* renamed from: e */
    @InterfaceC1894b(m6054a = "clientStatus")
    private int f8620e;

    /* renamed from: f */
    @InterfaceC1894b(m6054a = "adbDvice")
    private String f8621f;

    /* renamed from: a */
    public final void m5991a(Context context) {
        this.f8617b = C1842h.m5964c(context);
        String str = SystemProperties.get("ro.product.name", BuildConfig.FLAVOR);
        if (str == BuildConfig.FLAVOR) {
            str = SystemProperties.get("ro.product.model", BuildConfig.FLAVOR);
        }
        this.f8618c = str;
        String str2 = SystemProperties.get("ro.build.version.ota", BuildConfig.FLAVOR);
        if ((SystemProperties.getInt("oppo.rus.debug.boot", 0) == 1) && str2 != null && str2.contains("PDTTest")) {
            str2 = str2.replace("PDTTest", BuildConfig.FLAVOR);
        }
        this.f8619d = str2;
        this.f8616a = C1842h.m5963b();
        this.f8620e = 0;
        this.f8621f = SystemProperties.get("ro.oppo.operator", BuildConfig.FLAVOR);
    }
}
