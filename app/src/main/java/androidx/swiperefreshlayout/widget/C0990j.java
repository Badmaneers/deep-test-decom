package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.j */
/* loaded from: classes.dex */
public final class C0990j extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f4071a;

    /* renamed from: b */
    final /* synthetic */ int f4072b;

    /* renamed from: c */
    final /* synthetic */ SwipeRefreshLayout f4073c;

    public C0990j(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f4073c = swipeRefreshLayout;
        this.f4071a = i;
        this.f4072b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f4073c.f4014k.setAlpha((int) (this.f4071a + ((this.f4072b - this.f4071a) * f)));
    }
}
