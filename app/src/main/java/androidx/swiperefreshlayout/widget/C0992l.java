package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.l */
/* loaded from: classes.dex */
public final class C0992l extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4075a;

    public C0992l(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4075a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        if (!this.f4075a.f4016m) {
            i = this.f4075a.f4012i - Math.abs(this.f4075a.f4011h);
        } else {
            i = this.f4075a.f4012i;
        }
        this.f4075a.setTargetOffsetTopAndBottom((this.f4075a.f4009f + ((int) ((i - this.f4075a.f4009f) * f))) - this.f4075a.f4008e.getTop());
        this.f4075a.f4014k.m3458a(1.0f - f);
    }
}
