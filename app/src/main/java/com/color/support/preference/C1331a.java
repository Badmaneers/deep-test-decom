package com.color.support.preference;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.preference.ColorInputPreference;

/* compiled from: ColorInputPreference.java */
/* renamed from: com.color.support.preference.a */
/* loaded from: classes.dex */
final class C1331a implements Parcelable.Creator<ColorInputPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorInputPreference.SavedState[] newArray(int i) {
        return new ColorInputPreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorInputPreference.SavedState createFromParcel(Parcel parcel) {
        return new ColorInputPreference.SavedState(parcel);
    }
}
