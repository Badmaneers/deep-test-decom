package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.p024g.C0538w;

/* compiled from: Fade.java */
/* renamed from: androidx.transition.s */
/* loaded from: classes.dex */
final class C1061s extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f4243a;

    /* renamed from: b */
    private boolean f4244b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1061s(View view) {
        this.f4243a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (C0538w.m1894w(this.f4243a) && this.f4243a.getLayerType() == 0) {
            this.f4244b = true;
            this.f4243a.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1030bf.m3553a(this.f4243a, 1.0f);
        if (this.f4244b) {
            this.f4243a.setLayerType(0, null);
        }
    }
}
