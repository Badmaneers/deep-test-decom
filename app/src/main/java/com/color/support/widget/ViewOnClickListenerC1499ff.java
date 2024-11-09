package com.color.support.widget;

import android.view.View;

/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.ff */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1499ff implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f7165a;

    /* renamed from: b */
    final /* synthetic */ ExpandableRecyclerConnector f7166b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1499ff(ExpandableRecyclerConnector expandableRecyclerConnector, int i) {
        this.f7166b = expandableRecyclerConnector;
        this.f7165a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorExpandableRecyclerView colorExpandableRecyclerView;
        colorExpandableRecyclerView = this.f7166b.f6731j;
        colorExpandableRecyclerView.m4489a(this.f7165a);
    }
}
