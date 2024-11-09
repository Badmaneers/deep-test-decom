package com.color.support.util;

import android.util.Log;

/* compiled from: ColorOSVersionUtil.java */
/* renamed from: com.color.support.util.f */
/* loaded from: classes.dex */
public final class C1341f {
    /* renamed from: a */
    public static int m4383a() {
        try {
            Class<?> cls = Class.forName("com.color.os.ColorBuild");
            if (cls == null) {
                return 0;
            }
            return ((Integer) cls.getDeclaredMethod("getColorOSVERSION", new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception e) {
            Log.e("ColorOSVersionUtil", "getColorOSVersionCode failed. error = " + e.getMessage());
            return 0;
        }
    }
}
