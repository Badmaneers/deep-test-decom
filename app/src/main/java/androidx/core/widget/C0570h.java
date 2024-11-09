package androidx.core.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.java */
/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public final class C0570h {
    /* renamed from: a */
    public static void m2038a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
