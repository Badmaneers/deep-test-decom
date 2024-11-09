package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager;

/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.r */
/* loaded from: classes.dex */
final class C1111r implements Parcelable.ClassLoaderCreator<ViewPager.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ViewPager.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ViewPager.SavedState(parcel, null);
    }
}
