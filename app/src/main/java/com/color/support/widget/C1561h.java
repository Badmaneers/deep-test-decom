package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ColorCircleProgressBar;

/* compiled from: ColorCircleProgressBar.java */
/* renamed from: com.color.support.widget.h */
/* loaded from: classes.dex */
final class C1561h implements Parcelable.Creator<ColorCircleProgressBar.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorCircleProgressBar.SavedState[] newArray(int i) {
        return new ColorCircleProgressBar.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorCircleProgressBar.SavedState createFromParcel(Parcel parcel) {
        return new ColorCircleProgressBar.SavedState(parcel, (byte) 0);
    }
}
