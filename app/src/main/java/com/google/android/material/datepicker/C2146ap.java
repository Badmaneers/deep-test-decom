package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* compiled from: SingleDateSelector.java */
/* renamed from: com.google.android.material.datepicker.ap */
/* loaded from: classes.dex */
final class C2146ap extends AbstractC2158f {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2141ak f9582a;

    /* renamed from: b */
    final /* synthetic */ SingleDateSelector f9583b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2146ap(SingleDateSelector singleDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, InterfaceC2141ak interfaceC2141ak) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f9583b = singleDateSelector;
        this.f9582a = interfaceC2141ak;
    }

    @Override // com.google.android.material.datepicker.AbstractC2158f
    /* renamed from: a */
    final void mo6845a(Long l) {
        if (l != null) {
            this.f9583b.mo6806a(l.longValue());
        } else {
            this.f9583b.f9553a = null;
        }
        this.f9582a.mo6834a(this.f9583b.m6833e());
    }
}
