package com.color.support.widget;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTimePicker.java */
/* renamed from: com.color.support.widget.er */
/* loaded from: classes.dex */
public final class C1484er implements InterfaceC1422cj {

    /* renamed from: a */
    final /* synthetic */ ColorTimePicker f7125a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1484er(ColorTimePicker colorTimePicker) {
        this.f7125a = colorTimePicker;
    }

    @Override // com.color.support.widget.InterfaceC1422cj
    /* renamed from: a */
    public final void mo4924a(ColorNumberPicker colorNumberPicker, int i, int i2) {
        Calendar calendar;
        InterfaceC1489ew interfaceC1489ew;
        InterfaceC1489ew unused;
        Calendar unused2;
        this.f7125a.f6713u = colorNumberPicker.getValue();
        calendar = this.f7125a.f6694b;
        calendar.set(9, colorNumberPicker.getValue());
        interfaceC1489ew = this.f7125a.f6715w;
        if (interfaceC1489ew != null) {
            unused = this.f7125a.f6715w;
            unused2 = this.f7125a.f6694b;
        }
    }
}
