package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p011b.C0318a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transition.java */
/* renamed from: androidx.transition.af */
/* loaded from: classes.dex */
public final class C1003af extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0318a f4123a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1001ad f4124b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1003af(AbstractC1001ad abstractC1001ad, C0318a c0318a) {
        this.f4124b = abstractC1001ad;
        this.f4123a = c0318a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4124b.f4104f.add(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4123a.remove(animator);
        this.f4124b.f4104f.remove(animator);
    }
}
