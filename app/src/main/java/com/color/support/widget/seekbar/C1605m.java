package com.color.support.widget.seekbar;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.m */
/* loaded from: classes.dex */
public final class C1605m implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorSectionSeekBar f7719a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1605m(ColorSectionSeekBar colorSectionSeekBar) {
        this.f7719a = colorSectionSeekBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        boolean z2;
        float f;
        z = this.f7719a.f7633N;
        if (z) {
            this.f7719a.m5396a();
            ColorSectionSeekBar.m5389n(this.f7719a);
        }
        z2 = this.f7719a.f7634O;
        if (z2) {
            ColorSectionSeekBar.m5391p(this.f7719a);
            ColorSectionSeekBar colorSectionSeekBar = this.f7719a;
            f = this.f7719a.f7659x;
            colorSectionSeekBar.m5363a(f, true);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z;
        z = this.f7719a.f7633N;
        if (z) {
            this.f7719a.m5396a();
            ColorSectionSeekBar.m5389n(this.f7719a);
        }
    }
}
