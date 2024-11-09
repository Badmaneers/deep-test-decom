package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableSparseArray.java */
/* renamed from: com.google.android.material.internal.x */
/* loaded from: classes.dex */
final class C2279x implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSparseArray[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, null);
    }
}
