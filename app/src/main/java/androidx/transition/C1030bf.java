package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* renamed from: androidx.transition.bf */
/* loaded from: classes.dex */
public final class C1030bf {

    /* renamed from: a */
    static final Property<View, Float> f4171a;

    /* renamed from: b */
    static final Property<View, Rect> f4172b;

    /* renamed from: c */
    private static final C1038bn f4173c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4173c = new C1037bm();
        } else if (Build.VERSION.SDK_INT >= 23) {
            f4173c = new C1036bl();
        } else if (Build.VERSION.SDK_INT >= 22) {
            f4173c = new C1035bk();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f4173c = new C1034bj();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f4173c = new C1033bi();
        } else {
            f4173c = new C1038bn();
        }
        f4171a = new C1031bg(Float.class, "translationAlpha");
        f4172b = new C1032bh(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static InterfaceC1029be m3552a(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1028bd(view);
        }
        return C1026bb.m3545c(view);
    }

    /* renamed from: b */
    public static InterfaceC1045bu m3557b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1044bt(view);
        }
        return new C1043bs(view.getWindowToken());
    }

    /* renamed from: a */
    public static void m3553a(View view, float f) {
        f4173c.mo3563a(view, f);
    }

    /* renamed from: c */
    public static float m3559c(View view) {
        return f4173c.mo3562a(view);
    }

    /* renamed from: d */
    public static void m3560d(View view) {
        f4173c.mo3564b(view);
    }

    /* renamed from: e */
    public static void m3561e(View view) {
        f4173c.mo3565c(view);
    }

    /* renamed from: a */
    public static void m3554a(View view, int i) {
        f4173c.mo3569a(view, i);
    }

    /* renamed from: a */
    public static void m3556a(View view, Matrix matrix) {
        f4173c.mo3566a(view, matrix);
    }

    /* renamed from: b */
    public static void m3558b(View view, Matrix matrix) {
        f4173c.mo3567b(view, matrix);
    }

    /* renamed from: a */
    public static void m3555a(View view, int i, int i2, int i3, int i4) {
        f4173c.mo3568a(view, i, i2, i3, i4);
    }
}
