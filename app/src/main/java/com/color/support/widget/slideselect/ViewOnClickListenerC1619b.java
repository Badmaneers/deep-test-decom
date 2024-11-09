package com.color.support.widget.slideselect;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSlideSelectView.java */
/* renamed from: com.color.support.widget.slideselect.b */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1619b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorSlideSelectView f7767a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1619b(ColorSlideSelectView colorSlideSelectView) {
        this.f7767a = colorSlideSelectView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorSelectListView colorSelectListView;
        colorSelectListView = this.f7767a.f7749e;
        colorSelectListView.setTriggerSource(1);
        ColorSlideSelectView.m5428b(this.f7767a);
    }
}
