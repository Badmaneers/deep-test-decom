package com.color.support.widget;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorDatePicker.java */
/* renamed from: com.color.support.widget.l */
/* loaded from: classes.dex */
public final class C1565l implements InterfaceC1420ch {

    /* renamed from: a */
    int f7439a;

    /* renamed from: b */
    String f7440b;

    /* renamed from: c */
    final /* synthetic */ ColorDatePicker f7441c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1565l(ColorDatePicker colorDatePicker, int i, String str) {
        this.f7441c = colorDatePicker;
        this.f7439a = i;
        this.f7440b = str;
    }

    @Override // com.color.support.widget.InterfaceC1420ch
    /* renamed from: a */
    public final String mo4952a(int i) {
        String[] strArr;
        if (this.f7440b.equals("MONTH")) {
            if (Locale.getDefault().getLanguage().equals("en")) {
                strArr = this.f7441c.f5960k;
                return strArr[i];
            }
            return (i + 1) + this.f7441c.getResources().getString(this.f7439a);
        }
        return i + this.f7441c.getResources().getString(this.f7439a);
    }
}
