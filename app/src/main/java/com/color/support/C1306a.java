package com.color.support;

import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: RippleDrawableUtil.java */
/* renamed from: com.color.support.a */
/* loaded from: classes.dex */
public final class C1306a {
    /* renamed from: a */
    public static void m4283a(RippleDrawable rippleDrawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i);
            return;
        }
        try {
            Method declaredMethod = Class.forName("android.graphics.drawable.RippleDrawable").getDeclaredMethod("setMaxRadius", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(rippleDrawable, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}
