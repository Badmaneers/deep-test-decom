package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.n */
/* loaded from: classes.dex */
public final class C0994n extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4077a;

    public C0994n(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4077a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f4077a.setAnimationProgress(this.f4077a.f4010g + ((-this.f4077a.f4010g) * f));
        this.f4077a.m3451a(f);
    }
}
