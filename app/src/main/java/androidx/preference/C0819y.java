package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.TwoStatePreference;

/* compiled from: TwoStatePreference.java */
/* renamed from: androidx.preference.y */
/* loaded from: classes.dex */
final class C0819y implements Parcelable.Creator<TwoStatePreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TwoStatePreference.SavedState[] newArray(int i) {
        return new TwoStatePreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TwoStatePreference.SavedState createFromParcel(Parcel parcel) {
        return new TwoStatePreference.SavedState(parcel);
    }
}
