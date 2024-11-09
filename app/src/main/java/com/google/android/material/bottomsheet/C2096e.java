package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetBehavior.java */
/* renamed from: com.google.android.material.bottomsheet.e */
/* loaded from: classes.dex */
final class C2096e implements Parcelable.ClassLoaderCreator<BottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ BottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomSheetBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }
}
