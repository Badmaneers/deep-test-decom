package com.color.support.widget.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.navigation.ColorNavigationPresenter;

/* compiled from: ColorNavigationPresenter.java */
/* renamed from: com.color.support.widget.navigation.f */
/* loaded from: classes.dex */
final class C1573f implements Parcelable.Creator<ColorNavigationPresenter.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorNavigationPresenter.SavedState[] newArray(int i) {
        return new ColorNavigationPresenter.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorNavigationPresenter.SavedState createFromParcel(Parcel parcel) {
        return new ColorNavigationPresenter.SavedState(parcel);
    }
}
