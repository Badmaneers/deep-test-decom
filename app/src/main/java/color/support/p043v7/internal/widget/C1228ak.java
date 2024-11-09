package color.support.p043v7.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import color.support.p043v7.widget.C1301v;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ak */
/* loaded from: classes.dex */
final class C1228ak extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1256w f5224a;

    /* renamed from: b */
    private final C1301v f5225b;

    public C1228ak(C1256w c1256w, C1301v c1301v) {
        this.f5224a = c1256w;
        this.f5225b = c1301v;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5224a.f5279b.f5178N = null;
        if (this.f5225b != null) {
            this.f5225b.m4282b();
        }
    }
}
