package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.az */
/* loaded from: classes.dex */
final class C0207az implements Parcelable.Creator<AppCompatSpinner.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppCompatSpinner.SavedState[] newArray(int i) {
        return new AppCompatSpinner.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AppCompatSpinner.SavedState createFromParcel(Parcel parcel) {
        return new AppCompatSpinner.SavedState(parcel);
    }
}
