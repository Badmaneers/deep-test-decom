package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* compiled from: CalendarConstraints.java */
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
final class C2130a implements Parcelable.Creator<CalendarConstraints> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CalendarConstraints[] newArray(int i) {
        return new CalendarConstraints[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CalendarConstraints createFromParcel(Parcel parcel) {
        return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (byte) 0);
    }
}
