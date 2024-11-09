package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ScrollingTabContainerView.java */
/* renamed from: androidx.appcompat.widget.co */
/* loaded from: classes.dex */
public final class C0250co extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ScrollingTabContainerView f1302a;

    /* renamed from: b */
    private boolean f1303b = false;

    /* renamed from: c */
    private int f1304c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0250co(ScrollingTabContainerView scrollingTabContainerView) {
        this.f1302a = scrollingTabContainerView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1302a.setVisibility(0);
        this.f1303b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1303b) {
            return;
        }
        this.f1302a.f933e = null;
        this.f1302a.setVisibility(this.f1304c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1303b = true;
    }
}
