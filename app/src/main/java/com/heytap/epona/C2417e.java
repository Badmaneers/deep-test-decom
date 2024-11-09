package com.heytap.epona;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Response.java */
/* renamed from: com.heytap.epona.e */
/* loaded from: classes.dex */
final class C2417e implements Parcelable.Creator<Response> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Response[] newArray(int i) {
        return new Response[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Response createFromParcel(Parcel parcel) {
        return new Response(parcel, (byte) 0);
    }
}
