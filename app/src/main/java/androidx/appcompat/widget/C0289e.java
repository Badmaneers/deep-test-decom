package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionBarOverlayLayout.java */
/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public final class C0289e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f1409a;

    public C0289e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1409a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1409a.f777c = null;
        this.f1409a.f776b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1409a.f777c = null;
        this.f1409a.f776b = false;
    }
}
