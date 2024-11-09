package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompat.java */
/* renamed from: androidx.core.widget.e */
/* loaded from: classes.dex */
public final class C0567e {

    /* renamed from: a */
    private static Field f2512a;

    /* renamed from: b */
    private static boolean f2513b;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m2036a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof InterfaceC0579q) {
            ((InterfaceC0579q) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ColorStateList m2035a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof InterfaceC0579q) {
            return ((InterfaceC0579q) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static Drawable m2037b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2513b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2512a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2513b = true;
        }
        if (f2512a != null) {
            try {
                return (Drawable) f2512a.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2512a = null;
            }
        }
        return null;
    }
}
