package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeDrawable;

/* compiled from: BadgeDrawable.java */
/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes.dex */
final class C2064a implements Parcelable.Creator<BadgeDrawable.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BadgeDrawable.SavedState[] newArray(int i) {
        return new BadgeDrawable.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BadgeDrawable.SavedState createFromParcel(Parcel parcel) {
        return new BadgeDrawable.SavedState(parcel);
    }
}
