package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;

/* compiled from: ListPreference.java */
/* renamed from: androidx.preference.e */
/* loaded from: classes.dex */
final class C0800e implements Parcelable.Creator<ListPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ListPreference.SavedState[] newArray(int i) {
        return new ListPreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ListPreference.SavedState createFromParcel(Parcel parcel) {
        return new ListPreference.SavedState(parcel);
    }
}
