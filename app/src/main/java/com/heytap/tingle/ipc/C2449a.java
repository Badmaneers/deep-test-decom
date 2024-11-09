package com.heytap.tingle.ipc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: BinderExt.java */
/* renamed from: com.heytap.tingle.ipc.a */
/* loaded from: classes.dex */
final class C2449a implements Parcelable.Creator<BinderExt> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BinderExt[] newArray(int i) {
        return new BinderExt[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BinderExt createFromParcel(Parcel parcel) {
        return new BinderExt(parcel);
    }
}
