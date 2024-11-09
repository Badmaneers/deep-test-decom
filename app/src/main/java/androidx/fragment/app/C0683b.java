package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: BackStackState.java */
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
final class C0683b implements Parcelable.Creator<BackStackState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }
}
