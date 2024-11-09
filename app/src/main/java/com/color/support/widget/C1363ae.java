package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.ae */
/* loaded from: classes.dex */
public final class C1363ae extends AbstractC1636y {

    /* renamed from: a */
    final /* synthetic */ C1635x f6920a;

    /* renamed from: b */
    final /* synthetic */ int f6921b;

    /* renamed from: c */
    final /* synthetic */ C1361ac f6922c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363ae(C1361ac c1361ac, C1635x c1635x, int i) {
        super((byte) 0);
        this.f6922c = c1361ac;
        this.f6920a = c1635x;
        this.f6921b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ColorExpandableListView colorExpandableListView;
        this.f6920a.m5444a();
        C1361ac.m4874b(this.f6922c, this.f6921b);
        colorExpandableListView = this.f6922c.f6911b;
        super/*android.widget.ExpandableListView*/.collapseGroup(this.f6921b);
        this.f6920a.setTag(0);
    }
}
