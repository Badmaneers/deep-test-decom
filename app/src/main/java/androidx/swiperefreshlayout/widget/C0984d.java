package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircularProgressDrawable.java */
/* renamed from: androidx.swiperefreshlayout.widget.d */
/* loaded from: classes.dex */
public final class C0984d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0986f f4043a;

    /* renamed from: b */
    final /* synthetic */ C0983c f4044b;

    public C0984d(C0983c c0983c, C0986f c0986f) {
        this.f4044b = c0983c;
        this.f4043a = c0986f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0983c.m3457a(floatValue, this.f4043a);
        this.f4044b.m3459a(floatValue, this.f4043a, false);
        this.f4044b.invalidateSelf();
    }
}
