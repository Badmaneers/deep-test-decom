package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fh */
/* loaded from: classes.dex */
public final class C1501fh extends AbstractC1504fk {

    /* renamed from: a */
    final /* synthetic */ C1503fj f7171a;

    /* renamed from: b */
    final /* synthetic */ int f7172b;

    /* renamed from: c */
    final /* synthetic */ ExpandableRecyclerConnector f7173c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501fh(ExpandableRecyclerConnector expandableRecyclerConnector, C1503fj c1503fj, int i) {
        super((byte) 0);
        this.f7173c = expandableRecyclerConnector;
        this.f7171a = c1503fj;
        this.f7172b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7171a.m5044a();
        ExpandableRecyclerConnector.m4790a(this.f7173c, this.f7172b);
        this.f7173c.m4805f(this.f7172b);
        this.f7171a.setTag(0);
    }
}
