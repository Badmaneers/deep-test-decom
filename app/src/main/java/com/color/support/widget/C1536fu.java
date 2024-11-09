package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.OppoCheckBox;

/* compiled from: OppoCheckBox.java */
/* renamed from: com.color.support.widget.fu */
/* loaded from: classes.dex */
final class C1536fu implements Parcelable.Creator<OppoCheckBox.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OppoCheckBox.SavedState[] newArray(int i) {
        return new OppoCheckBox.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OppoCheckBox.SavedState createFromParcel(Parcel parcel) {
        return new OppoCheckBox.SavedState(parcel, (byte) 0);
    }
}
