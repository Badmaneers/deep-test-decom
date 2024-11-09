package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: SingleDateSelector.java */
/* renamed from: com.google.android.material.datepicker.aq */
/* loaded from: classes.dex */
final class C2147aq implements Parcelable.Creator<SingleDateSelector> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SingleDateSelector[] newArray(int i) {
        return new SingleDateSelector[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SingleDateSelector createFromParcel(Parcel parcel) {
        SingleDateSelector singleDateSelector = new SingleDateSelector();
        singleDateSelector.f9553a = (Long) parcel.readValue(Long.class.getClassLoader());
        return singleDateSelector;
    }
}
