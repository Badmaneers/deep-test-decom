package com.coloros.deeptesting.p064a;

import android.os.SystemProperties;
import android.util.Log;

/* compiled from: OppoLog.java */
/* renamed from: com.coloros.deeptesting.a.g */
/* loaded from: classes.dex */
public final class C1841g {

    /* renamed from: a */
    private static final boolean f8569a = SystemProperties.getBoolean("persist.sys.assert.panic", false);

    /* renamed from: a */
    public static void m5952a(String str, String str2) {
        if (f8569a) {
            Log.d("DeepTesting", str + ":" + str2);
        }
    }

    /* renamed from: b */
    public static void m5953b(String str, String str2) {
        if (f8569a) {
            Log.i("DeepTesting", str + ":" + str2);
        }
    }

    /* renamed from: c */
    public static void m5954c(String str, String str2) {
        if (f8569a) {
            Log.e("DeepTesting", str + ":" + str2);
        }
    }
}
