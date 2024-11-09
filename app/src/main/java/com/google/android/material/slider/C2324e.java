package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.slider.Slider;

/* compiled from: Slider.java */
/* renamed from: com.google.android.material.slider.e */
/* loaded from: classes.dex */
final class C2324e implements Parcelable.Creator<Slider.SliderState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Slider.SliderState[] newArray(int i) {
        return new Slider.SliderState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Slider.SliderState createFromParcel(Parcel parcel) {
        return new Slider.SliderState(parcel, (byte) 0);
    }
}
