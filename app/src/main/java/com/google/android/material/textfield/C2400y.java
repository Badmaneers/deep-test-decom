package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* renamed from: com.google.android.material.textfield.y */
/* loaded from: classes.dex */
public final class C2400y extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f10598a;

    /* renamed from: b */
    final /* synthetic */ TextView f10599b;

    /* renamed from: c */
    final /* synthetic */ int f10600c;

    /* renamed from: d */
    final /* synthetic */ TextView f10601d;

    /* renamed from: e */
    final /* synthetic */ C2399x f10602e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2400y(C2399x c2399x, int i, TextView textView, int i2, TextView textView2) {
        this.f10602e = c2399x;
        this.f10598a = i;
        this.f10599b = textView;
        this.f10600c = i2;
        this.f10601d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        TextView textView2;
        this.f10602e.f10584i = this.f10598a;
        C2399x.m7652a(this.f10602e);
        if (this.f10599b != null) {
            this.f10599b.setVisibility(4);
            if (this.f10600c == 1) {
                textView = this.f10602e.f10588m;
                if (textView != null) {
                    textView2 = this.f10602e.f10588m;
                    textView2.setText((CharSequence) null);
                }
            }
        }
        if (this.f10601d != null) {
            this.f10601d.setTranslationY(0.0f);
            this.f10601d.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f10601d != null) {
            this.f10601d.setVisibility(0);
        }
    }
}
