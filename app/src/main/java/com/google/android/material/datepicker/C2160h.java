package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DateValidatorPointBackward.java */
/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
final class C2160h implements Parcelable.Creator<DateValidatorPointBackward> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DateValidatorPointBackward[] newArray(int i) {
        return new DateValidatorPointBackward[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DateValidatorPointBackward createFromParcel(Parcel parcel) {
        return new DateValidatorPointBackward(parcel.readLong(), (byte) 0);
    }
}
