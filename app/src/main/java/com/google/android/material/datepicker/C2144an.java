package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* compiled from: RangeDateSelector.java */
/* renamed from: com.google.android.material.datepicker.an */
/* loaded from: classes.dex */
final class C2144an extends AbstractC2158f {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f9578a;

    /* renamed from: b */
    final /* synthetic */ TextInputLayout f9579b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC2141ak f9580c;

    /* renamed from: d */
    final /* synthetic */ RangeDateSelector f9581d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2144an(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, InterfaceC2141ak interfaceC2141ak) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f9581d = rangeDateSelector;
        this.f9578a = textInputLayout2;
        this.f9579b = textInputLayout3;
        this.f9580c = interfaceC2141ak;
    }

    @Override // com.google.android.material.datepicker.AbstractC2158f
    /* renamed from: a */
    final void mo6845a(Long l) {
        this.f9581d.f9552f = l;
        RangeDateSelector.m6825a(this.f9581d, this.f9578a, this.f9579b, this.f9580c);
    }

    @Override // com.google.android.material.datepicker.AbstractC2158f
    /* renamed from: a */
    final void mo6844a() {
        this.f9581d.f9552f = null;
        RangeDateSelector.m6825a(this.f9581d, this.f9578a, this.f9579b, this.f9580c);
    }
}
