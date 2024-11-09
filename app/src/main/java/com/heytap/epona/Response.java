package com.heytap.epona;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Response implements Parcelable {
    public static final Parcelable.Creator<Response> CREATOR = new C2417e();

    /* renamed from: a */
    private final int f10648a;

    /* renamed from: b */
    private final String f10649b;

    /* renamed from: c */
    private Bundle f10650c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Response(Parcel parcel, byte b) {
        this(parcel);
    }

    private Response(Parcel parcel) {
        this.f10648a = parcel.readInt();
        this.f10649b = parcel.readString();
        this.f10650c = parcel.readBundle(getClass().getClassLoader());
    }

    public String toString() {
        return "Request{Code=" + this.f10648a + ",Message=" + this.f10649b + ",Bundle=" + this.f10650c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10648a);
        parcel.writeString(this.f10649b);
        parcel.writeBundle(this.f10650c);
    }
}
