package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* compiled from: Preference.java */
/* renamed from: androidx.preference.i */
/* loaded from: classes.dex */
final class C0804i implements Parcelable.Creator<Preference.BaseSavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Preference.BaseSavedState[] newArray(int i) {
        return new Preference.BaseSavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Preference.BaseSavedState createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }
}
