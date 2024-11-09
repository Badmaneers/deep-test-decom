package com.color.support.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLunarDatePicker.java */
/* renamed from: com.color.support.widget.bz */
/* loaded from: classes.dex */
public final class C1411bz implements InterfaceC1422cj {

    /* renamed from: a */
    final /* synthetic */ ColorLunarDatePicker f7004a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1411bz(ColorLunarDatePicker colorLunarDatePicker) {
        this.f7004a = colorLunarDatePicker;
    }

    @Override // com.color.support.widget.InterfaceC1422cj
    /* renamed from: a */
    public final void mo4924a(ColorNumberPicker colorNumberPicker, int i, int i2) {
        C1413ca c1413ca;
        C1413ca c1413ca2;
        C1413ca c1413ca3;
        C1413ca c1413ca4;
        C1413ca c1413ca5;
        ColorNumberPicker colorNumberPicker2;
        ColorNumberPicker colorNumberPicker3;
        ColorNumberPicker colorNumberPicker4;
        C1413ca c1413ca6;
        C1413ca c1413ca7;
        C1413ca c1413ca8;
        C1413ca c1413ca9;
        c1413ca = this.f7004a.f6251n;
        c1413ca2 = this.f7004a.f6252o;
        c1413ca.m4931a(c1413ca2);
        c1413ca3 = this.f7004a.f6251n;
        int m4927a = c1413ca3.m4927a(1);
        c1413ca4 = this.f7004a.f6251n;
        int m4927a2 = c1413ca4.m4927a(2) + 1;
        c1413ca5 = this.f7004a.f6251n;
        C1416cd.m4944a(m4927a, m4927a2, c1413ca5.m4927a(5));
        colorNumberPicker2 = this.f7004a.f6244g;
        if (colorNumberPicker == colorNumberPicker2) {
            c1413ca9 = this.f7004a.f6251n;
            c1413ca9.m4935b(5, i, i2);
        } else {
            colorNumberPicker3 = this.f7004a.f6245h;
            if (colorNumberPicker == colorNumberPicker3) {
                c1413ca7 = this.f7004a.f6251n;
                c1413ca7.m4935b(2, i, i2);
            } else {
                colorNumberPicker4 = this.f7004a.f6246i;
                if (colorNumberPicker == colorNumberPicker4) {
                    c1413ca6 = this.f7004a.f6251n;
                    c1413ca6.m4935b(1, i, i2);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        ColorLunarDatePicker colorLunarDatePicker = this.f7004a;
        c1413ca8 = this.f7004a.f6251n;
        colorLunarDatePicker.setDate(c1413ca8);
        this.f7004a.m4576c();
        ColorLunarDatePicker.m4570a();
        ColorLunarDatePicker.m4580g(this.f7004a);
    }
}
