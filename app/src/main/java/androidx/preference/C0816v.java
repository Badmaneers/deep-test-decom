package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.SeekBarPreference;

/* compiled from: SeekBarPreference.java */
/* renamed from: androidx.preference.v */
/* loaded from: classes.dex */
final class C0816v implements Parcelable.Creator<SeekBarPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SeekBarPreference.SavedState[] newArray(int i) {
        return new SeekBarPreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SeekBarPreference.SavedState createFromParcel(Parcel parcel) {
        return new SeekBarPreference.SavedState(parcel);
    }
}
