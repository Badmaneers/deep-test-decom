package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1090a();

    /* renamed from: a */
    private final InterfaceC1093d f4358a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ParcelImpl(Parcel parcel) {
        this.f4358a = new C1092c(parcel).m3656i();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C1092c(parcel).m3641b(this.f4358a);
    }
}
