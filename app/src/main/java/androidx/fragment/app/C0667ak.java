package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentState.java */
/* renamed from: androidx.fragment.app.ak */
/* loaded from: classes.dex */
final class C0667ak implements Parcelable.Creator<FragmentState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }
}
