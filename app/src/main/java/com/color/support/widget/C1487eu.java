package com.color.support.widget;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTimePicker.java */
/* renamed from: com.color.support.widget.eu */
/* loaded from: classes.dex */
public final class C1487eu implements InterfaceC1422cj {

    /* renamed from: a */
    final /* synthetic */ ColorTimePicker f7128a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1487eu(ColorTimePicker colorTimePicker) {
        this.f7128a = colorTimePicker;
    }

    @Override // com.color.support.widget.InterfaceC1422cj
    /* renamed from: a */
    public final void mo4924a(ColorNumberPicker colorNumberPicker, int i, int i2) {
        Date m4779c;
        Calendar calendar;
        Calendar calendar2;
        Calendar calendar3;
        InterfaceC1489ew interfaceC1489ew;
        InterfaceC1489ew unused;
        Calendar unused2;
        m4779c = this.f7128a.m4779c(colorNumberPicker.getValue());
        if (m4779c != null) {
            calendar = this.f7128a.f6694b;
            calendar.set(2, m4779c.getMonth());
            calendar2 = this.f7128a.f6694b;
            calendar2.set(5, m4779c.getDate());
            calendar3 = this.f7128a.f6694b;
            calendar3.set(1, m4779c.getYear() + 1900);
            interfaceC1489ew = this.f7128a.f6715w;
            if (interfaceC1489ew != null) {
                unused = this.f7128a.f6715w;
                unused2 = this.f7128a.f6694b;
            }
        }
    }
}
