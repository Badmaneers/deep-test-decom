package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: RangeDateSelector.java */
/* renamed from: com.google.android.material.datepicker.ao */
/* loaded from: classes.dex */
final class C2145ao implements Parcelable.Creator<RangeDateSelector> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RangeDateSelector[] newArray(int i) {
        return new RangeDateSelector[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RangeDateSelector createFromParcel(Parcel parcel) {
        RangeDateSelector rangeDateSelector = new RangeDateSelector();
        rangeDateSelector.f9549c = (Long) parcel.readValue(Long.class.getClassLoader());
        rangeDateSelector.f9550d = (Long) parcel.readValue(Long.class.getClassLoader());
        return rangeDateSelector;
    }
}
