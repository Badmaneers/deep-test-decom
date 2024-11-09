package com.color.support.widget;

import android.view.View;

/* compiled from: ColorSlideView.java */
/* renamed from: com.color.support.widget.ee */
/* loaded from: classes.dex */
final class C1471ee extends ColorSlideDeleteAnimation {

    /* renamed from: a */
    final /* synthetic */ ColorSlideView f7117a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1471ee(ColorSlideView colorSlideView, View view, int i, int i2, int i3) {
        super(view, i, i2, i3);
        this.f7117a = colorSlideView;
    }

    @Override // com.color.support.widget.ColorSlideDeleteAnimation
    /* renamed from: b */
    public final void mo4737b() {
        InterfaceC1474eh interfaceC1474eh;
        InterfaceC1474eh unused;
        interfaceC1474eh = this.f7117a.f6578aj;
        if (interfaceC1474eh != null) {
            ColorSlideView.m4751d(this.f7117a);
            unused = this.f7117a.f6578aj;
        }
    }
}
