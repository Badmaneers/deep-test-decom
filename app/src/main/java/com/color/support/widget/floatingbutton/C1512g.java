package com.color.support.widget.floatingbutton;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import androidx.dynamicanimation.p031a.C0610ab;
import com.color.support.widget.floatingbutton.ColorFloatingButton;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.g */
/* loaded from: classes.dex */
public final class C1512g implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ int f7237a;

    /* renamed from: b */
    final /* synthetic */ ObjectAnimator f7238b;

    /* renamed from: c */
    final /* synthetic */ C0610ab f7239c;

    /* renamed from: d */
    final /* synthetic */ ColorFloatingButtonLabel f7240d;

    /* renamed from: e */
    final /* synthetic */ int f7241e;

    /* renamed from: f */
    final /* synthetic */ ColorFloatingButton f7242f;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1512g(ColorFloatingButton colorFloatingButton, int i, ObjectAnimator objectAnimator, C0610ab c0610ab, ColorFloatingButtonLabel colorFloatingButtonLabel, int i2) {
        this.f7242f = colorFloatingButton;
        this.f7237a = i;
        this.f7238b = objectAnimator;
        this.f7239c = c0610ab;
        this.f7240d = colorFloatingButtonLabel;
        this.f7241e = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShapeableImageView shapeableImageView;
        ColorFloatingButton.InstanceState instanceState;
        if (ColorFloatingButton.m5064a(this.f7242f, this.f7237a)) {
            instanceState = this.f7242f.f7178b;
            instanceState.f7204b = true;
            this.f7242f.setOnActionSelectedListener(null);
        }
        this.f7238b.start();
        this.f7239c.m2188e();
        shapeableImageView = this.f7242f.f7181e;
        shapeableImageView.setClickable(false);
        this.f7240d.setVisibility(this.f7241e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShapeableImageView shapeableImageView;
        ColorFloatingButton.InstanceState instanceState;
        InterfaceC1517l interfaceC1517l;
        shapeableImageView = this.f7242f.f7181e;
        shapeableImageView.setClickable(true);
        if (ColorFloatingButton.m5070b(this.f7242f, this.f7237a)) {
            instanceState = this.f7242f.f7178b;
            instanceState.f7204b = false;
            ColorFloatingButton colorFloatingButton = this.f7242f;
            interfaceC1517l = this.f7242f.f7198v;
            colorFloatingButton.setOnActionSelectedListener(interfaceC1517l);
        }
    }
}
