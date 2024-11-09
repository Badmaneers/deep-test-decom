package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;

/* compiled from: BottomNavigationPresenter.java */
/* renamed from: com.google.android.material.bottomnavigation.d */
/* loaded from: classes.dex */
final class C2086d implements Parcelable.Creator<BottomNavigationPresenter.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BottomNavigationPresenter.SavedState[] newArray(int i) {
        return new BottomNavigationPresenter.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BottomNavigationPresenter.SavedState createFromParcel(Parcel parcel) {
        return new BottomNavigationPresenter.SavedState(parcel);
    }
}
