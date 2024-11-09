package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: TextInputLayout.java */
/* renamed from: com.google.android.material.textfield.an */
/* loaded from: classes.dex */
final class C2376an implements Parcelable.ClassLoaderCreator<TextInputLayout.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ TextInputLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TextInputLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TextInputLayout.SavedState(parcel, null);
    }
}
