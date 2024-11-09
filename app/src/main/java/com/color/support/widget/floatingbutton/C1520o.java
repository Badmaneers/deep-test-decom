package com.color.support.widget.floatingbutton;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ColorFloatingButtonItem.java */
/* renamed from: com.color.support.widget.floatingbutton.o */
/* loaded from: classes.dex */
final class C1520o implements Parcelable.Creator<ColorFloatingButtonItem> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorFloatingButtonItem[] newArray(int i) {
        return new ColorFloatingButtonItem[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorFloatingButtonItem createFromParcel(Parcel parcel) {
        return new ColorFloatingButtonItem(parcel);
    }
}
