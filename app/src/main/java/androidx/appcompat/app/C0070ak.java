package androidx.appcompat.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ak */
/* loaded from: classes.dex */
final class C0070ak implements Parcelable.ClassLoaderCreator<AppCompatDelegateImpl.PanelFeatureState.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.m142a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.m142a(parcel, null);
    }
}
