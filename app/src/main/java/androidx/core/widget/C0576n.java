package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* renamed from: androidx.core.widget.n */
/* loaded from: classes.dex */
public final class C0576n {

    /* renamed from: a */
    private static Method f2517a;

    /* renamed from: b */
    private static boolean f2518b;

    /* renamed from: c */
    private static Field f2519c;

    /* renamed from: d */
    private static boolean f2520d;

    /* renamed from: a */
    public static void m2042a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0521f.m1777a(i3, C0538w.m1878h(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m2043a(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!f2520d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2519c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2520d = true;
            }
            if (f2519c != null) {
                try {
                    f2519c.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2041a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f2518b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2517a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2518b = true;
        }
        if (f2517a != null) {
            try {
                f2517a.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }
}
