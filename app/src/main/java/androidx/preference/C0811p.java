package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.PreferenceGroup;

/* compiled from: PreferenceGroup.java */
/* renamed from: androidx.preference.p */
/* loaded from: classes.dex */
final class C0811p implements Parcelable.Creator<PreferenceGroup.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PreferenceGroup.SavedState[] newArray(int i) {
        return new PreferenceGroup.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PreferenceGroup.SavedState createFromParcel(Parcel parcel) {
        return new PreferenceGroup.SavedState(parcel);
    }
}
