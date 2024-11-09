package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PagerSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.ar */
/* loaded from: classes.dex */
final class C0838ar extends C0830aj {

    /* renamed from: f */
    final /* synthetic */ C0837aq f3507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0838ar(C0837aq c0837aq, Context context) {
        super(context);
        this.f3507f = c0837aq;
    }

    @Override // androidx.recyclerview.widget.C0830aj, androidx.recyclerview.widget.AbstractC0872by
    /* renamed from: a */
    protected final void mo2954a(View view, C0873bz c0873bz) {
        int[] mo2964a = this.f3507f.mo2964a(this.f3507f.f3637a.getLayoutManager(), view);
        int i = mo2964a[0];
        int i2 = mo2964a[1];
        int a2 = m2951a(Math.max(Math.abs(i), Math.abs(i2)));
        if (a2 > 0) {
            c0873bz.m3187a(i, i2, a2, this.f3492b);
        }
    }

    @Override // androidx.recyclerview.widget.C0830aj
    /* renamed from: a */
    protected final float mo2950a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C0830aj
    /* renamed from: b */
    public final int mo2955b(int i) {
        return Math.min(100, super.mo2955b(i));
    }
}
