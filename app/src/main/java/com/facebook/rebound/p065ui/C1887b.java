package com.facebook.rebound.p065ui;

import com.facebook.rebound.C1879j;
import com.facebook.rebound.InterfaceC1883n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpringConfiguratorView.java */
/* renamed from: com.facebook.rebound.ui.b */
/* loaded from: classes.dex */
public final class C1887b implements InterfaceC1883n {

    /* renamed from: a */
    final /* synthetic */ SpringConfiguratorView f8685a;

    private C1887b(SpringConfiguratorView springConfiguratorView) {
        this.f8685a = springConfiguratorView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1887b(SpringConfiguratorView springConfiguratorView, byte b) {
        this(springConfiguratorView);
    }

    @Override // com.facebook.rebound.InterfaceC1883n
    /* renamed from: a */
    public final void mo3804a(C1879j c1879j) {
        float f;
        float f2;
        float m6021c = (float) c1879j.m6021c();
        f = this.f8685a.f8675f;
        f2 = this.f8685a.f8674e;
        this.f8685a.setTranslationY((m6021c * (f2 - f)) + f);
    }
}
