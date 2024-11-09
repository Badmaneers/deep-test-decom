package color.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.l */
/* loaded from: classes.dex */
public final class C1183l extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f4806a;

    /* renamed from: b */
    final /* synthetic */ C1179h f4807b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1183l(C1179h c1179h, int i) {
        this.f4807b = c1179h;
        this.f4806a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4807b.f4773a = this.f4806a;
        this.f4807b.f4774b = 0.0f;
    }
}
