package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationView;

/* compiled from: NavigationView.java */
/* renamed from: com.google.android.material.navigation.d */
/* loaded from: classes.dex */
final class C2319d implements Parcelable.ClassLoaderCreator<NavigationView.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ NavigationView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new NavigationView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NavigationView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NavigationView.SavedState(parcel, null);
    }
}
