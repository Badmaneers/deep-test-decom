package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.InterfaceC0731k;
import androidx.lifecycle.InterfaceC0733m;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0731k {

    /* renamed from: a */
    private static int f40a;

    /* renamed from: b */
    private static Field f41b;

    /* renamed from: c */
    private static Field f42c;

    /* renamed from: d */
    private static Field f43d;

    /* renamed from: e */
    private Activity f44e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f44e = activity;
    }

    @Override // androidx.lifecycle.InterfaceC0731k
    /* renamed from: a */
    public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
        if (enumC0729i != EnumC0729i.ON_DESTROY) {
            return;
        }
        if (f40a == 0) {
            try {
                f40a = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f42c = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f43d = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f41b = declaredField3;
                declaredField3.setAccessible(true);
                f40a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f40a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f44e.getSystemService("input_method");
            try {
                Object obj = f41b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f42c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f43d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
