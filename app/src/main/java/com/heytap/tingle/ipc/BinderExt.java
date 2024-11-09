package com.heytap.tingle.ipc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class BinderExt implements Parcelable {
    public static final Parcelable.Creator<BinderExt> CREATOR = new C2449a();

    /* renamed from: a */
    private IBinder f10731a;

    /* renamed from: b */
    private String f10732b;

    /* renamed from: c */
    private int f10733c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BinderExt(Parcel parcel) {
        this.f10731a = parcel.readStrongBinder();
        this.f10732b = parcel.readString();
        this.f10733c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f10731a);
        parcel.writeString(this.f10732b);
        parcel.writeInt(this.f10733c);
    }
}
