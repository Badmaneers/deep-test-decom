package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes.dex */
public final class C0917v extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0914s f3767a;

    /* renamed from: b */
    private boolean f3768b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0917v(C0914s c0914s) {
        this.f3767a = c0914s;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3768b) {
            this.f3768b = false;
        } else if (((Float) this.f3767a.f3749i.getAnimatedValue()).floatValue() == 0.0f) {
            this.f3767a.f3750j = 0;
            this.f3767a.m3325a(0);
        } else {
            this.f3767a.f3750j = 2;
            this.f3767a.m3324a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3768b = true;
    }
}
