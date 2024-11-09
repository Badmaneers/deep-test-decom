package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollbarHelper.java */
/* renamed from: androidx.recyclerview.widget.ch */
/* loaded from: classes.dex */
public final class C0882ch {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m3233a(C0876cb c0876cb, AbstractC0834an abstractC0834an, View view, View view2, AbstractC0856bi abstractC0856bi, boolean z, boolean z2) {
        int max;
        if (abstractC0856bi.m3121v() == 0 || c0876cb.m3190a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(AbstractC0856bi.m3069e(view), AbstractC0856bi.m3069e(view2));
        int max2 = Math.max(AbstractC0856bi.m3069e(view), AbstractC0856bi.m3069e(view2));
        if (z2) {
            max = Math.max(0, (c0876cb.m3190a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC0834an.mo2971b(view2) - abstractC0834an.mo2968a(view)) / (Math.abs(AbstractC0856bi.m3069e(view) - AbstractC0856bi.m3069e(view2)) + 1))) + (abstractC0834an.mo2975d() - abstractC0834an.mo2968a(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m3232a(C0876cb c0876cb, AbstractC0834an abstractC0834an, View view, View view2, AbstractC0856bi abstractC0856bi, boolean z) {
        if (abstractC0856bi.m3121v() == 0 || c0876cb.m3190a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0856bi.m3069e(view) - AbstractC0856bi.m3069e(view2)) + 1;
        }
        return Math.min(abstractC0834an.mo2981g(), abstractC0834an.mo2971b(view2) - abstractC0834an.mo2968a(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m3234b(C0876cb c0876cb, AbstractC0834an abstractC0834an, View view, View view2, AbstractC0856bi abstractC0856bi, boolean z) {
        if (abstractC0856bi.m3121v() == 0 || c0876cb.m3190a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0876cb.m3190a();
        }
        return (int) (((abstractC0834an.mo2971b(view2) - abstractC0834an.mo2968a(view)) / (Math.abs(AbstractC0856bi.m3069e(view) - AbstractC0856bi.m3069e(view2)) + 1)) * c0876cb.m3190a());
    }
}
