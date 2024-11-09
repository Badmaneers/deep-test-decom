package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* compiled from: BottomNavigationView.java */
/* renamed from: com.google.android.material.bottomnavigation.i */
/* loaded from: classes.dex */
final class C2091i implements Parcelable.ClassLoaderCreator<BottomNavigationView.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ BottomNavigationView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomNavigationView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BottomNavigationView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BottomNavigationView.SavedState(parcel, null);
    }
}
