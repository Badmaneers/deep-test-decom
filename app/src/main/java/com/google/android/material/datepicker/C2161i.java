package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DateValidatorPointForward.java */
/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
final class C2161i implements Parcelable.Creator<DateValidatorPointForward> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DateValidatorPointForward[] newArray(int i) {
        return new DateValidatorPointForward[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DateValidatorPointForward createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong(), (byte) 0);
    }
}
