package com.color.support.widget;

import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTimePicker.java */
/* renamed from: com.color.support.widget.et */
/* loaded from: classes.dex */
public final class C1486et implements InterfaceC1422cj {

    /* renamed from: a */
    final /* synthetic */ ColorTimePicker f7127a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1486et(ColorTimePicker colorTimePicker) {
        this.f7127a = colorTimePicker;
    }

    @Override // com.color.support.widget.InterfaceC1422cj
    /* renamed from: a */
    public final void mo4924a(ColorNumberPicker colorNumberPicker, int i, int i2) {
        boolean z;
        Calendar calendar;
        InterfaceC1489ew interfaceC1489ew;
        Calendar calendar2;
        InterfaceC1489ew unused;
        Calendar unused2;
        z = this.f7127a.f6714v;
        if (z) {
            calendar2 = this.f7127a.f6694b;
            calendar2.set(12, colorNumberPicker.getValue() * 5);
        } else {
            calendar = this.f7127a.f6694b;
            calendar.set(12, colorNumberPicker.getValue());
        }
        interfaceC1489ew = this.f7127a.f6715w;
        if (interfaceC1489ew != null) {
            unused = this.f7127a.f6715w;
            unused2 = this.f7127a.f6694b;
        }
    }
}
