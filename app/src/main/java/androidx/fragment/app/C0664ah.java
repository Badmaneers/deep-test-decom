package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentManagerState.java */
/* renamed from: androidx.fragment.app.ah */
/* loaded from: classes.dex */
final class C0664ah implements Parcelable.Creator<FragmentManagerState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }
}
