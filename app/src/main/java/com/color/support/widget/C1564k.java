package com.color.support.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorDatePicker.java */
/* renamed from: com.color.support.widget.k */
/* loaded from: classes.dex */
public final class C1564k implements InterfaceC1422cj {

    /* renamed from: a */
    final /* synthetic */ ColorDatePicker f7438a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1564k(ColorDatePicker colorDatePicker) {
        this.f7438a = colorDatePicker;
    }

    @Override // com.color.support.widget.InterfaceC1422cj
    /* renamed from: a */
    public final void mo4924a(ColorNumberPicker colorNumberPicker, int i, int i2) {
        C1566m c1566m;
        C1566m c1566m2;
        ColorNumberPicker colorNumberPicker2;
        ColorNumberPicker colorNumberPicker3;
        ColorNumberPicker colorNumberPicker4;
        C1566m c1566m3;
        C1566m c1566m4;
        C1566m c1566m5;
        C1566m c1566m6;
        c1566m = this.f7438a.f5962m;
        c1566m2 = this.f7438a.f5965p;
        c1566m.m5281a(c1566m2);
        colorNumberPicker2 = this.f7438a.f5953d;
        if (colorNumberPicker == colorNumberPicker2) {
            c1566m6 = this.f7438a.f5962m;
            c1566m6.m5278a(5, i2);
        } else {
            colorNumberPicker3 = this.f7438a.f5954e;
            if (colorNumberPicker == colorNumberPicker3) {
                c1566m4 = this.f7438a.f5962m;
                c1566m4.m5278a(2, i2);
            } else {
                colorNumberPicker4 = this.f7438a.f5955f;
                if (colorNumberPicker == colorNumberPicker4) {
                    c1566m3 = this.f7438a.f5962m;
                    c1566m3.m5278a(1, i2);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        ColorDatePicker colorDatePicker = this.f7438a;
        c1566m5 = this.f7438a.f5962m;
        colorDatePicker.setDate(c1566m5);
        this.f7438a.m4451e();
        ColorDatePicker.m4440a();
        ColorDatePicker.m4453g(this.f7438a);
    }
}
