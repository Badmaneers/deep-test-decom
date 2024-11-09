package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes.dex */
public final class C0918w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0914s f3769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0918w(C0914s c0914s) {
        this.f3769a = c0914s;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f3769a.f3741a.setAlpha(floatValue);
        this.f3769a.f3742b.setAlpha(floatValue);
        this.f3769a.m3324a();
    }
}
