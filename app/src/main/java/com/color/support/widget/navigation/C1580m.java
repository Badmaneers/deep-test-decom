package com.color.support.widget.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.navigation.ColorNavigationView;

/* compiled from: ColorNavigationView.java */
/* renamed from: com.color.support.widget.navigation.m */
/* loaded from: classes.dex */
final class C1580m implements Parcelable.ClassLoaderCreator<ColorNavigationView.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ColorNavigationView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ColorNavigationView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ColorNavigationView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ColorNavigationView.SavedState(parcel, null);
    }
}
