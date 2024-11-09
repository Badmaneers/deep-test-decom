package androidx.core.p024g;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* compiled from: LayoutInflaterCompat.java */
/* renamed from: androidx.core.g.i */
/* loaded from: classes.dex */
public final class C0524i {

    /* renamed from: a */
    private static Field f2368a;

    /* renamed from: b */
    private static boolean f2369b;

    /* renamed from: b */
    private static void m1784b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2369b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2368a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f2369b = true;
        }
        if (f2368a != null) {
            try {
                f2368a.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m1783a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m1784b(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m1784b(layoutInflater, factory2);
            }
        }
    }
}
