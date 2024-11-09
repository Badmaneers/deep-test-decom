package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ColorLoadProgress;

/* compiled from: ColorLoadProgress.java */
/* renamed from: com.color.support.widget.bg */
/* loaded from: classes.dex */
final class C1392bg implements Parcelable.Creator<ColorLoadProgress.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorLoadProgress.SavedState[] newArray(int i) {
        return new ColorLoadProgress.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorLoadProgress.SavedState createFromParcel(Parcel parcel) {
        return new ColorLoadProgress.SavedState(parcel, (byte) 0);
    }
}
