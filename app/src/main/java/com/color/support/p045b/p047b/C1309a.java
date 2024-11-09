package com.color.support.p045b.p047b;

import android.os.Build;
import android.util.Log;
import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: AbsListViewNative.java */
/* renamed from: com.color.support.b.b.a */
/* loaded from: classes.dex */
public final class C1309a {

    /* renamed from: a */
    private static final boolean f5558a;

    static {
        f5558a = Build.VERSION.SDK_INT >= 29 || (Build.VERSION.SDK_INT == 28 && "Q".equals(Build.VERSION.CODENAME));
    }

    /* renamed from: a */
    public static int m4287a(AbsListView absListView) {
        int i;
        try {
            if (f5558a) {
                i = ((Integer) Class.forName("com.color.inner.widget.AbsListViewWrapper").getDeclaredMethod("getTouchMode", AbsListView.class).invoke(null, absListView)).intValue();
            } else {
                Field declaredField = AbsListView.class.getDeclaredField("mTouchMode");
                declaredField.setAccessible(true);
                i = declaredField.getInt(absListView);
            }
            return i;
        } catch (Throwable th) {
            Log.d("AbsListViewNative", th.toString());
            return -1;
        }
    }

    /* renamed from: b */
    public static void m4288b(AbsListView absListView) {
        try {
            if (f5558a) {
                Class.forName("com.color.inner.widget.AbsListViewWrapper").getDeclaredMethod("setTouchMode", AbsListView.class, Integer.TYPE).invoke(null, absListView, 0);
                return;
            }
            Field declaredField = AbsListView.class.getDeclaredField("mTouchMode");
            declaredField.setAccessible(true);
            declaredField.setInt(absListView, 0);
        } catch (Throwable th) {
            Log.d("AbsListViewNative", th.toString());
        }
    }
}
