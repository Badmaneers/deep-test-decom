package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableSparseIntArray.java */
/* renamed from: com.google.android.material.internal.z */
/* loaded from: classes.dex */
final class C2281z implements Parcelable.Creator<ParcelableSparseIntArray> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableSparseIntArray[] newArray(int i) {
        return new ParcelableSparseIntArray[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableSparseIntArray createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt);
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        parcel.readIntArray(iArr);
        parcel.readIntArray(iArr2);
        for (int i = 0; i < readInt; i++) {
            parcelableSparseIntArray.put(iArr[i], iArr2[i]);
        }
        return parcelableSparseIntArray;
    }
}
