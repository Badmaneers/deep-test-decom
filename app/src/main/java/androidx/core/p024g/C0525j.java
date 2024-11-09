package androidx.core.p024g;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat.java */
/* renamed from: androidx.core.g.j */
/* loaded from: classes.dex */
public final class C0525j {
    /* renamed from: a */
    public static int m1785a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    /* renamed from: b */
    public static int m1787b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: a */
    public static void m1786a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    /* renamed from: b */
    public static void m1788b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }
}
