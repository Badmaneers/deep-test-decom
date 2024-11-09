package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.p023f.C0478i;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* compiled from: CompositeDateValidator.java */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
final class C2157e implements Parcelable.Creator<CompositeDateValidator> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CompositeDateValidator[] newArray(int i) {
        return new CompositeDateValidator[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CompositeDateValidator createFromParcel(Parcel parcel) {
        return new CompositeDateValidator((List) C0478i.m1620a(parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader())), (byte) 0);
    }
}
