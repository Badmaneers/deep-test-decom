package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelImpl.java */
/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
final class C1090a implements Parcelable.Creator<ParcelImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelImpl[] newArray(int i) {
        return new ParcelImpl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }
}
