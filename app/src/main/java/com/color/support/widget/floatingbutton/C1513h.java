package com.color.support.widget.floatingbutton;

import android.animation.Animator;
import com.color.support.widget.floatingbutton.ColorFloatingButton;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.h */
/* loaded from: classes.dex */
public final class C1513h implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ int f7243a;

    /* renamed from: b */
    final /* synthetic */ boolean f7244b;

    /* renamed from: c */
    final /* synthetic */ ColorFloatingButtonLabel f7245c;

    /* renamed from: d */
    final /* synthetic */ int f7246d;

    /* renamed from: e */
    final /* synthetic */ ColorFloatingButton f7247e;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1513h(ColorFloatingButton colorFloatingButton, int i, boolean z, ColorFloatingButtonLabel colorFloatingButtonLabel, int i2) {
        this.f7247e = colorFloatingButton;
        this.f7243a = i;
        this.f7244b = z;
        this.f7245c = colorFloatingButtonLabel;
        this.f7246d = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShapeableImageView shapeableImageView;
        ColorFloatingButton.InstanceState instanceState;
        if (ColorFloatingButton.m5070b(this.f7247e, this.f7243a)) {
            instanceState = this.f7247e.f7178b;
            instanceState.f7204b = true;
            this.f7247e.setOnActionSelectedListener(null);
        }
        ColorFloatingButton.m5060a(this.f7247e, this.f7245c, this.f7246d);
        shapeableImageView = this.f7247e.f7181e;
        shapeableImageView.setClickable(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int m5065b;
        ShapeableImageView shapeableImageView;
        ColorFloatingButton.InstanceState instanceState;
        ColorFloatingButtonLabel colorFloatingButtonLabel = this.f7245c;
        m5065b = ColorFloatingButton.m5065b(this.f7247e.getContext(), (this.f7243a * 72) + 88);
        colorFloatingButtonLabel.setTranslationY(m5065b);
        this.f7245c.getChildColorFloatingButton().setPivotX(this.f7245c.getChildColorFloatingButton().getWidth() / 2.0f);
        this.f7245c.getChildColorFloatingButton().setPivotY(this.f7245c.getChildColorFloatingButton().getHeight() / 2.0f);
        this.f7245c.setPivotX(this.f7245c.getWidth());
        this.f7245c.setPivotY(this.f7245c.getHeight());
        shapeableImageView = this.f7247e.f7181e;
        shapeableImageView.setClickable(true);
        if (ColorFloatingButton.m5064a(this.f7247e, this.f7243a)) {
            instanceState = this.f7247e.f7178b;
            instanceState.f7204b = false;
        }
    }
}
