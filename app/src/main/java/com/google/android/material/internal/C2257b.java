package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: CheckableImageButton.java */
/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes.dex */
final class C2257b implements Parcelable.ClassLoaderCreator<CheckableImageButton.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ CheckableImageButton.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckableImageButton.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CheckableImageButton.SavedState(parcel, null);
    }
}
