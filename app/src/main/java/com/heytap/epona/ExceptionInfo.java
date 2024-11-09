package com.heytap.epona;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class ExceptionInfo implements Parcelable {
    public static final Parcelable.Creator<ExceptionInfo> CREATOR = new C2414b();

    /* renamed from: a */
    private String f10641a;

    /* renamed from: b */
    private String f10642b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ExceptionInfo(Parcel parcel, byte b) {
        this(parcel);
    }

    private ExceptionInfo(Parcel parcel) {
        this.f10641a = parcel.readString();
        this.f10642b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10641a);
        parcel.writeString(this.f10642b);
    }
}
