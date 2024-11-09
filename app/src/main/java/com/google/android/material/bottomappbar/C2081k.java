package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.k */
/* loaded from: classes.dex */
final class C2081k implements Parcelable.ClassLoaderCreator<BottomAppBar.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ BottomAppBar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomAppBar.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BottomAppBar.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BottomAppBar.SavedState(parcel, null);
    }
}
