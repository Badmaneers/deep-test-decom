package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Month.java */
/* renamed from: com.google.android.material.datepicker.af */
/* loaded from: classes.dex */
final class C2136af implements Parcelable.Creator<Month> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Month[] newArray(int i) {
        return new Month[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Month createFromParcel(Parcel parcel) {
        return Month.m6815a(parcel.readInt(), parcel.readInt());
    }
}
