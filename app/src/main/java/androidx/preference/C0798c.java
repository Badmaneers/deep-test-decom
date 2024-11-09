package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;

/* compiled from: EditTextPreference.java */
/* renamed from: androidx.preference.c */
/* loaded from: classes.dex */
final class C0798c implements Parcelable.Creator<EditTextPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EditTextPreference.SavedState[] newArray(int i) {
        return new EditTextPreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EditTextPreference.SavedState createFromParcel(Parcel parcel) {
        return new EditTextPreference.SavedState(parcel);
    }
}
