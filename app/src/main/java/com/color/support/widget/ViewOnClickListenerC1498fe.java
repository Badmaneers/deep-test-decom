package com.color.support.widget;

import android.view.View;

/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fe */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1498fe implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f7163a;

    /* renamed from: b */
    final /* synthetic */ ExpandableRecyclerConnector f7164b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1498fe(ExpandableRecyclerConnector expandableRecyclerConnector, int i) {
        this.f7164b = expandableRecyclerConnector;
        this.f7163a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorExpandableRecyclerView colorExpandableRecyclerView;
        colorExpandableRecyclerView = this.f7164b.f6731j;
        colorExpandableRecyclerView.m4489a(this.f7163a);
    }
}
