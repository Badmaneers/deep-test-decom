package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ColorDatePicker;

/* compiled from: ColorDatePicker.java */
/* renamed from: com.color.support.widget.o */
/* loaded from: classes.dex */
final class C1583o implements Parcelable.Creator<ColorDatePicker.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorDatePicker.SavedState[] newArray(int i) {
        return new ColorDatePicker.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorDatePicker.SavedState createFromParcel(Parcel parcel) {
        return new ColorDatePicker.SavedState(parcel, (byte) 0);
    }
}
