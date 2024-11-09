package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* compiled from: Fragment.java */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
final class C0699k implements Parcelable.ClassLoaderCreator<Fragment.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Fragment.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Fragment.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Fragment.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Fragment.SavedState(parcel, null);
    }
}
