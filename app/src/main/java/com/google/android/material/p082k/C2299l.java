package com.google.android.material.p082k;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2250as;

/* compiled from: MaterialShapeUtils.java */
/* renamed from: com.google.android.material.k.l */
/* loaded from: classes.dex */
public final class C2299l {
    /* renamed from: a */
    public static void m7294a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C2295h) {
            ((C2295h) background).m7288r(f);
        }
    }

    /* renamed from: a */
    public static void m7293a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C2295h) {
            m7295a(view, (C2295h) background);
        }
    }

    /* renamed from: a */
    public static void m7295a(View view, C2295h c2295h) {
        if (c2295h.m7263Q()) {
            c2295h.m7287q(C2250as.m7114c(view));
        }
    }

    /* renamed from: a */
    public static C2291d m7292a(int i) {
        switch (i) {
            case 0:
                return new C2302o();
            case 1:
                return new C2292e();
            default:
                return new C2302o();
        }
    }
}
