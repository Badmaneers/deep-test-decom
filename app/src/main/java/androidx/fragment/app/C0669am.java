package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentTabHost;

/* compiled from: FragmentTabHost.java */
/* renamed from: androidx.fragment.app.am */
/* loaded from: classes.dex */
final class C0669am implements Parcelable.Creator<FragmentTabHost.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentTabHost.SavedState[] newArray(int i) {
        return new FragmentTabHost.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FragmentTabHost.SavedState createFromParcel(Parcel parcel) {
        return new FragmentTabHost.SavedState(parcel);
    }
}
