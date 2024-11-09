package com.color.support.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OppoTimePicker.java */
/* renamed from: com.color.support.widget.fz */
/* loaded from: classes.dex */
public final class C1541fz implements InterfaceC1422cj {

    /* renamed from: a */
    final /* synthetic */ OppoTimePicker f7293a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1541fz(OppoTimePicker oppoTimePicker) {
        this.f7293a = oppoTimePicker;
    }

    @Override // com.color.support.widget.InterfaceC1422cj
    /* renamed from: a */
    public final void mo4924a(ColorNumberPicker colorNumberPicker, int i, int i2) {
        boolean z;
        colorNumberPicker.requestFocus();
        OppoTimePicker oppoTimePicker = this.f7293a;
        z = this.f7293a.f6754i;
        oppoTimePicker.f6754i = !z;
        this.f7293a.m4810b();
        this.f7293a.m4814d();
    }
}
