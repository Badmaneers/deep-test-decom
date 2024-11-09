package com.color.support.p045b.p046a;

import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewNative.java */
/* renamed from: com.color.support.b.a.a */
/* loaded from: classes.dex */
public final class C1308a {

    /* renamed from: a */
    private static final boolean f5557a;

    static {
        f5557a = Build.VERSION.SDK_INT >= 29 || (Build.VERSION.SDK_INT == 28 && "Q".equals(Build.VERSION.CODENAME));
    }

    /* renamed from: a */
    public static void m4285a(View view, int i) {
        try {
            if (f5557a) {
                Class.forName("com.color.inner.view.ViewWrapper").getDeclaredMethod("setScrollYForColor", View.class, Integer.TYPE).invoke(null, view, Integer.valueOf(i));
                return;
            }
            Field declaredField = View.class.getDeclaredField("mScrollY");
            declaredField.setAccessible(true);
            declaredField.setInt(view, i);
        } catch (Throwable th) {
            Log.d("ViewNative", th.toString());
        }
    }

    /* renamed from: b */
    public static void m4286b(View view, int i) {
        try {
            if (f5557a) {
                Class.forName("com.color.inner.view.ViewWrapper").getDeclaredMethod("setScrollXForColor", View.class, Integer.TYPE).invoke(null, view, Integer.valueOf(i));
                return;
            }
            Field declaredField = View.class.getDeclaredField("mScrollX");
            declaredField.setAccessible(true);
            declaredField.setInt(view, i);
        } catch (Throwable th) {
            Log.d("ViewNative", th.toString());
        }
    }
}
