package com.heytap.shield.p088b;

import android.util.Log;

/* compiled from: PLog.java */
/* renamed from: com.heytap.shield.b.b */
/* loaded from: classes.dex */
public final class C2443b {

    /* renamed from: a */
    private static boolean f10725a = true;

    /* renamed from: a */
    public static void m7789a(String str) {
        if (f10725a) {
            Log.d("AppPlatform.Shield", str);
        }
    }

    /* renamed from: b */
    public static void m7791b(String str) {
        Log.e("AppPlatform.Shield", str);
    }

    /* renamed from: c */
    public static void m7792c(String str) {
        if (f10725a) {
            Log.i("AppPlatform.Shield", str);
        }
    }

    /* renamed from: a */
    public static boolean m7790a() {
        return f10725a;
    }
}
