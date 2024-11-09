package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ColorLunarDatePicker;

/* compiled from: ColorLunarDatePicker.java */
/* renamed from: com.color.support.widget.cc */
/* loaded from: classes.dex */
final class C1415cc implements Parcelable.Creator<ColorLunarDatePicker.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorLunarDatePicker.SavedState[] newArray(int i) {
        return new ColorLunarDatePicker.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorLunarDatePicker.SavedState createFromParcel(Parcel parcel) {
        return new ColorLunarDatePicker.SavedState(parcel, (byte) 0);
    }
}
