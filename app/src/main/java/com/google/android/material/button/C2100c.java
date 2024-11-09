package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.button.MaterialButton;

/* compiled from: MaterialButton.java */
/* renamed from: com.google.android.material.button.c */
/* loaded from: classes.dex */
final class C2100c implements Parcelable.ClassLoaderCreator<MaterialButton.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ MaterialButton.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new MaterialButton.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MaterialButton.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MaterialButton.SavedState(parcel, null);
    }
}
