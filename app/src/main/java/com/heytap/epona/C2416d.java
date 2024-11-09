package com.heytap.epona;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Request.java */
/* renamed from: com.heytap.epona.d */
/* loaded from: classes.dex */
final class C2416d implements Parcelable.Creator<Request> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Request[] newArray(int i) {
        return new Request[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Request createFromParcel(Parcel parcel) {
        return new Request(parcel, (byte) 0);
    }
}
