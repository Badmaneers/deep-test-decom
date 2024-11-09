package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* compiled from: RangeDateSelector.java */
/* renamed from: com.google.android.material.datepicker.am */
/* loaded from: classes.dex */
final class C2143am extends AbstractC2158f {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f9574a;

    /* renamed from: b */
    final /* synthetic */ TextInputLayout f9575b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC2141ak f9576c;

    /* renamed from: d */
    final /* synthetic */ RangeDateSelector f9577d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143am(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, InterfaceC2141ak interfaceC2141ak) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f9577d = rangeDateSelector;
        this.f9574a = textInputLayout2;
        this.f9575b = textInputLayout3;
        this.f9576c = interfaceC2141ak;
    }

    @Override // com.google.android.material.datepicker.AbstractC2158f
    /* renamed from: a */
    final void mo6845a(Long l) {
        this.f9577d.f9551e = l;
        RangeDateSelector.m6825a(this.f9577d, this.f9574a, this.f9575b, this.f9576c);
    }

    @Override // com.google.android.material.datepicker.AbstractC2158f
    /* renamed from: a */
    final void mo6844a() {
        this.f9577d.f9551e = null;
        RangeDateSelector.m6825a(this.f9577d, this.f9574a, this.f9575b, this.f9576c);
    }
}
