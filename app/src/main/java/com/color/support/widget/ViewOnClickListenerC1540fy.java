package com.color.support.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OppoTimePicker.java */
/* renamed from: com.color.support.widget.fy */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1540fy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OppoTimePicker f7292a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1540fy(OppoTimePicker oppoTimePicker) {
        this.f7292a = oppoTimePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        view.requestFocus();
        OppoTimePicker oppoTimePicker = this.f7292a;
        z = this.f7292a.f6754i;
        oppoTimePicker.f6754i = !z;
        this.f7292a.m4810b();
    }
}
