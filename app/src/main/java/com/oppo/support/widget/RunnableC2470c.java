package com.oppo.support.widget;

import android.widget.PopupWindow;
import com.facebook.rebound.C1879j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OppoTouchSearchView.java */
/* renamed from: com.oppo.support.widget.c */
/* loaded from: classes.dex */
public final class RunnableC2470c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ OppoTouchSearchView f10827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2470c(OppoTouchSearchView oppoTouchSearchView) {
        this.f10827a = oppoTouchSearchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1879j c1879j;
        PopupWindow popupWindow;
        c1879j = this.f10827a.f10775aA;
        if (c1879j.m6022d() == 0.0d) {
            popupWindow = this.f10827a.f10758G;
            popupWindow.dismiss();
        }
    }
}
