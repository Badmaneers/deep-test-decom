package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.OppoTimePicker;

/* compiled from: OppoTimePicker.java */
/* renamed from: com.color.support.widget.gb */
/* loaded from: classes.dex */
final class C1544gb implements Parcelable.Creator<OppoTimePicker.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OppoTimePicker.SavedState[] newArray(int i) {
        return new OppoTimePicker.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OppoTimePicker.SavedState createFromParcel(Parcel parcel) {
        return new OppoTimePicker.SavedState(parcel, (byte) 0);
    }
}
