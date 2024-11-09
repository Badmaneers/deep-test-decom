package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapHelper.java */
/* renamed from: androidx.recyclerview.widget.cl */
/* loaded from: classes.dex */
public final class C0886cl extends C0830aj {

    /* renamed from: f */
    final /* synthetic */ AbstractC0884cj f3642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0886cl(AbstractC0884cj abstractC0884cj, Context context) {
        super(context);
        this.f3642f = abstractC0884cj;
    }

    @Override // androidx.recyclerview.widget.C0830aj, androidx.recyclerview.widget.AbstractC0872by
    /* renamed from: a */
    protected final void mo2954a(View view, C0873bz c0873bz) {
        if (this.f3642f.f3637a == null) {
            return;
        }
        int[] mo2964a = this.f3642f.mo2964a(this.f3642f.f3637a.getLayoutManager(), view);
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
}
