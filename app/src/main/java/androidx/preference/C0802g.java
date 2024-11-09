package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.MultiSelectListPreference;

/* compiled from: MultiSelectListPreference.java */
/* renamed from: androidx.preference.g */
/* loaded from: classes.dex */
final class C0802g implements Parcelable.Creator<MultiSelectListPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MultiSelectListPreference.SavedState[] newArray(int i) {
        return new MultiSelectListPreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MultiSelectListPreference.SavedState createFromParcel(Parcel parcel) {
        return new MultiSelectListPreference.SavedState(parcel);
    }
}
