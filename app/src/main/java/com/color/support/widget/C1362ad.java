package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.ad */
/* loaded from: classes.dex */
public final class C1362ad extends AbstractC1636y {

    /* renamed from: a */
    final /* synthetic */ C1635x f6917a;

    /* renamed from: b */
    final /* synthetic */ int f6918b;

    /* renamed from: c */
    final /* synthetic */ C1361ac f6919c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362ad(C1361ac c1361ac, C1635x c1635x, int i) {
        super((byte) 0);
        this.f6919c = c1361ac;
        this.f6917a = c1635x;
        this.f6918b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6917a.m5444a();
        C1361ac.m4874b(this.f6919c, this.f6918b);
        this.f6919c.notifyDataSetChanged();
        this.f6917a.setTag(0);
    }
}
