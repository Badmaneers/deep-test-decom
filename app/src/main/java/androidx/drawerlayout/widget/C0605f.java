package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: DrawerLayout.java */
/* renamed from: androidx.drawerlayout.widget.f */
/* loaded from: classes.dex */
final class C0605f implements Parcelable.ClassLoaderCreator<DrawerLayout.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ DrawerLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DrawerLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DrawerLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel, null);
    }
}
