package com.color.support.widget.snackbar;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSnackBar.java */
/* renamed from: com.color.support.widget.snackbar.a */
/* loaded from: classes.dex */
public final class C1628a implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorSnackBar f7803a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1628a(ColorSnackBar colorSnackBar) {
        this.f7803a = colorSnackBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ViewGroup viewGroup;
        InterfaceC1630c interfaceC1630c;
        ViewGroup viewGroup2;
        View view2;
        InterfaceC1630c unused;
        view = this.f7803a.f7796s;
        view.setVisibility(8);
        viewGroup = this.f7803a.f7792o;
        if (viewGroup != null) {
            viewGroup2 = this.f7803a.f7792o;
            view2 = this.f7803a.f7796s;
            viewGroup2.removeView(view2);
        }
        interfaceC1630c = this.f7803a.f7802y;
        if (interfaceC1630c != null) {
            unused = this.f7803a.f7802y;
        }
    }
}
