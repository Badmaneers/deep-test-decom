package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableSparseBooleanArray.java */
/* renamed from: com.google.android.material.internal.y */
/* loaded from: classes.dex */
final class C2280y implements Parcelable.Creator<ParcelableSparseBooleanArray> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableSparseBooleanArray[] newArray(int i) {
        return new ParcelableSparseBooleanArray[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableSparseBooleanArray createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt);
        int[] iArr = new int[readInt];
        boolean[] zArr = new boolean[readInt];
        parcel.readIntArray(iArr);
        parcel.readBooleanArray(zArr);
        for (int i = 0; i < readInt; i++) {
            parcelableSparseBooleanArray.put(iArr[i], zArr[i]);
        }
        return parcelableSparseBooleanArray;
    }
}
