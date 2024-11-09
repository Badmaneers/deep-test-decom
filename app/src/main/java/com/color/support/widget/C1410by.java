package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ColorLockPatternView;

/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.by */
/* loaded from: classes.dex */
final class C1410by implements Parcelable.Creator<ColorLockPatternView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorLockPatternView.SavedState[] newArray(int i) {
        return new ColorLockPatternView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorLockPatternView.SavedState createFromParcel(Parcel parcel) {
        return new ColorLockPatternView.SavedState(parcel, (byte) 0);
    }
}
