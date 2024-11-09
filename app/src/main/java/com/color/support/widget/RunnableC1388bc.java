package com.color.support.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorListView.java */
/* renamed from: com.color.support.widget.bc */
/* loaded from: classes.dex */
public final class RunnableC1388bc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorListView f6955a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1388bc(ColorListView colorListView) {
        this.f6955a = colorListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f6955a.f6138h;
        if (!z) {
            this.f6955a.m4521a(this.f6955a.getLastVisiblePosition() + 1, this.f6955a.getPaddingBottom());
        } else {
            this.f6955a.setSelection(this.f6955a.getFirstVisiblePosition() - 1);
        }
    }
}
