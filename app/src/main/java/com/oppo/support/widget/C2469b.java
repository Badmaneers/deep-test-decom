package com.oppo.support.widget;

import android.widget.PopupWindow;
import com.facebook.rebound.C1878i;
import com.facebook.rebound.C1879j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OppoTouchSearchView.java */
/* renamed from: com.oppo.support.widget.b */
/* loaded from: classes.dex */
public final class C2469b extends C1878i {

    /* renamed from: a */
    final /* synthetic */ OppoTouchSearchView f10826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2469b(OppoTouchSearchView oppoTouchSearchView) {
        this.f10826a = oppoTouchSearchView;
    }

    @Override // com.facebook.rebound.C1878i, com.facebook.rebound.InterfaceC1883n
    /* renamed from: a */
    public final void mo3804a(C1879j c1879j) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        PopupWindow popupWindow3;
        double m6021c = c1879j.m6021c();
        popupWindow = this.f10826a.f10758G;
        if (popupWindow != null) {
            popupWindow2 = this.f10826a.f10758G;
            if (popupWindow2.getContentView() != null) {
                popupWindow3 = this.f10826a.f10758G;
                popupWindow3.getContentView().setAlpha((float) m6021c);
            }
        }
    }
}
