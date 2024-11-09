package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.x */
/* loaded from: classes.dex */
final class C1141x implements Parcelable.ClassLoaderCreator<ViewPager2.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ViewPager2.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m3769a(parcel, classLoader);
    }

    /* renamed from: a */
    private static ViewPager2.SavedState m3769a(Parcel parcel, ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 ? new ViewPager2.SavedState(parcel, classLoader) : new ViewPager2.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ViewPager2.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3769a(parcel, null);
    }
}
