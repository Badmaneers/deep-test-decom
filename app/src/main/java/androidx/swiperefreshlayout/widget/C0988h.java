package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.h */
/* loaded from: classes.dex */
final class C0988h extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4069a;

    public C0988h(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4069a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f4069a.setAnimationProgress(f);
    }
}
