package com.color.support.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSlideView.java */
/* renamed from: com.color.support.widget.ef */
/* loaded from: classes.dex */
public final class C1472ef extends ColorSlideDeleteAnimation {

    /* renamed from: a */
    final /* synthetic */ ColorSlideView f7118a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1472ef(ColorSlideView colorSlideView, View view, int i, int i2, int i3) {
        super(view, i, i2, i3);
        this.f7118a = colorSlideView;
    }

    @Override // com.color.support.widget.ColorSlideDeleteAnimation
    /* renamed from: b */
    public final void mo4737b() {
        InterfaceC1474eh interfaceC1474eh;
        InterfaceC1474eh unused;
        interfaceC1474eh = this.f7118a.f6578aj;
        if (interfaceC1474eh != null) {
            ColorSlideView.m4751d(this.f7118a);
            unused = this.f7118a.f6578aj;
        }
    }
}
