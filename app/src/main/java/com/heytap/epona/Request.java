package com.heytap.epona;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Request implements Parcelable {
    public static final Parcelable.Creator<Request> CREATOR = new C2416d();

    /* renamed from: a */
    private final String f10645a;

    /* renamed from: b */
    private final String f10646b;

    /* renamed from: c */
    private Bundle f10647c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Request(Parcel parcel, byte b) {
        this(parcel);
    }

    private Request(Parcel parcel) {
        this.f10647c = new Bundle();
        this.f10645a = parcel.readString();
        this.f10646b = parcel.readString();
        this.f10647c = parcel.readBundle(getClass().getClassLoader());
    }

    public String toString() {
        return "Request{Component=" + this.f10645a + ",Action=" + this.f10646b + ",Bundle=" + this.f10647c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10645a);
        parcel.writeString(this.f10646b);
        parcel.writeBundle(this.f10647c);
    }
}
