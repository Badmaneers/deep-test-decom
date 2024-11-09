package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.m */
/* loaded from: classes.dex */
public final class C0993m extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4076a;

    public C0993m(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4076a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f4076a.m3451a(f);
    }
}
