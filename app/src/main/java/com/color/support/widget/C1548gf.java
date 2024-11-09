package com.color.support.widget;

import android.view.WindowManager;
import color.support.p043v7.widget.InterfaceC1303x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SecurityKeyboardView.java */
/* renamed from: com.color.support.widget.gf */
/* loaded from: classes.dex */
public final class C1548gf implements InterfaceC1303x {

    /* renamed from: a */
    final /* synthetic */ SecurityKeyboardView f7350a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1548gf(SecurityKeyboardView securityKeyboardView) {
        this.f7350a = securityKeyboardView;
    }

    @Override // color.support.p043v7.widget.InterfaceC1303x
    /* renamed from: a */
    public final void mo4106a(WindowManager.LayoutParams layoutParams) {
        layoutParams.flags |= 8192;
        layoutParams.setTitle("ColorSecurityPopupWindow");
    }
}
