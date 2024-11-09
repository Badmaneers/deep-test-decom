package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fg */
/* loaded from: classes.dex */
public final class C1500fg extends AbstractC1504fk {

    /* renamed from: a */
    final /* synthetic */ C1503fj f7167a;

    /* renamed from: b */
    final /* synthetic */ int f7168b;

    /* renamed from: c */
    final /* synthetic */ int f7169c;

    /* renamed from: d */
    final /* synthetic */ ExpandableRecyclerConnector f7170d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500fg(ExpandableRecyclerConnector expandableRecyclerConnector, C1503fj c1503fj, int i, int i2) {
        super((byte) 0);
        this.f7170d = expandableRecyclerConnector;
        this.f7167a = c1503fj;
        this.f7168b = i;
        this.f7169c = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7167a.m5044a();
        ExpandableRecyclerConnector.m4790a(this.f7170d, this.f7168b);
        this.f7170d.m4792a(true, true);
        this.f7170d.m3016a(this.f7169c - 1, (this.f7170d.mo3020b() - this.f7169c) + 1);
        this.f7167a.setTag(0);
    }
}
