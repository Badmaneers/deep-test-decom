package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: MaterialTextInputPicker.java */
/* renamed from: com.google.android.material.datepicker.ad */
/* loaded from: classes.dex */
public final class C2134ad<S> extends AbstractC2142al<S> {

    /* renamed from: a */
    private DateSelector<S> f9557a;

    /* renamed from: b */
    private CalendarConstraints f9558b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> C2134ad<T> m6835a(DateSelector<T> dateSelector, CalendarConstraints calendarConstraints) {
        C2134ad<T> c2134ad = new C2134ad<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c2134ad.m2301e(bundle);
        return c2134ad;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d */
    public final void mo2299d(Bundle bundle) {
        super.mo2299d(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9557a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9558b);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final void mo2280a(Bundle bundle) {
        super.mo2280a(bundle);
        if (bundle == null) {
            bundle = m2312m();
        }
        this.f9557a = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9558b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final View mo2273a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f9557a.mo6803a(layoutInflater, viewGroup, this.f9558b, new C2135ae(this));
    }
}
