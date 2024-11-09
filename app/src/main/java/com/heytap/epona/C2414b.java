package com.heytap.epona;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ExceptionInfo.java */
/* renamed from: com.heytap.epona.b */
/* loaded from: classes.dex */
final class C2414b implements Parcelable.Creator<ExceptionInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ExceptionInfo[] newArray(int i) {
        return new ExceptionInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ExceptionInfo createFromParcel(Parcel parcel) {
        return new ExceptionInfo(parcel, (byte) 0);
    }
}
