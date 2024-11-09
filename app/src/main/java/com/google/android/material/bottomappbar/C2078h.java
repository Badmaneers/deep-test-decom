package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.h */
/* loaded from: classes.dex */
public final class C2078h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f9181a;

    /* renamed from: b */
    final /* synthetic */ ActionMenuView f9182b;

    /* renamed from: c */
    final /* synthetic */ int f9183c;

    /* renamed from: d */
    final /* synthetic */ boolean f9184d;

    /* renamed from: e */
    final /* synthetic */ BottomAppBar f9185e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2078h(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f9185e = bottomAppBar;
        this.f9182b = actionMenuView;
        this.f9183c = i;
        this.f9184d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9181a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f9181a) {
            return;
        }
        this.f9185e.m6402a(this.f9182b, this.f9183c, this.f9184d);
    }
}
