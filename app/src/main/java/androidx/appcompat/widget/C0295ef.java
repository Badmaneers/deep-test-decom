package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.p024g.C0538w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtils.java */
/* renamed from: androidx.appcompat.widget.ef */
/* loaded from: classes.dex */
public final class C0295ef {

    /* renamed from: a */
    private static Method f1421a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1421a = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f1421a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m987a(View view) {
        return C0538w.m1878h(view) == 1;
    }

    /* renamed from: a */
    public static void m986a(View view, Rect rect, Rect rect2) {
        if (f1421a != null) {
            try {
                f1421a.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: b */
    public static void m988b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            }
        }
    }
}
