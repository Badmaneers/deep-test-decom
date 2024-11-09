package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.i */
/* loaded from: classes.dex */
final class C0989i extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4070a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0989i(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4070a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f4070a.setAnimationProgress(1.0f - f);
    }
}
