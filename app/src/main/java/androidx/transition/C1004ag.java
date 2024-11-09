package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transition.java */
/* renamed from: androidx.transition.ag */
/* loaded from: classes.dex */
public final class C1004ag extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AbstractC1001ad f4125a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1004ag(AbstractC1001ad abstractC1001ad) {
        this.f4125a = abstractC1001ad;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4125a.m3513h();
        animator.removeListener(this);
    }
}
