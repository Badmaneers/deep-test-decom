package com.color.support.widget;

import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNumberPicker.java */
/* renamed from: com.color.support.widget.cm */
/* loaded from: classes.dex */
public final class C1425cm implements InterfaceC1420ch {

    /* renamed from: a */
    final StringBuilder f7032a = new StringBuilder();

    /* renamed from: b */
    final Object[] f7033b = new Object[1];

    /* renamed from: c */
    Formatter f7034c = new Formatter(this.f7032a, Locale.getDefault());

    /* renamed from: d */
    final /* synthetic */ ColorNumberPicker f7035d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1425cm(ColorNumberPicker colorNumberPicker) {
        this.f7035d = colorNumberPicker;
    }

    @Override // com.color.support.widget.InterfaceC1420ch
    /* renamed from: a */
    public final String mo4952a(int i) {
        this.f7033b[0] = Integer.valueOf(i);
        this.f7032a.delete(0, this.f7032a.length());
        this.f7034c.format("%02d", this.f7033b);
        return this.f7034c.toString();
    }
}
