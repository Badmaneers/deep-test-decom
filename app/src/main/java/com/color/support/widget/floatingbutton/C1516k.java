package com.color.support.widget.floatingbutton;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.floatingbutton.ColorFloatingButton;

/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.k */
/* loaded from: classes.dex */
final class C1516k implements Parcelable.Creator<ColorFloatingButton.InstanceState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorFloatingButton.InstanceState[] newArray(int i) {
        return new ColorFloatingButton.InstanceState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorFloatingButton.InstanceState createFromParcel(Parcel parcel) {
        return new ColorFloatingButton.InstanceState(parcel);
    }
}
