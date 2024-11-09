package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: CoordinatorLayout.java */
/* renamed from: androidx.coordinatorlayout.widget.h */
/* loaded from: classes.dex */
final class C0396h implements Parcelable.ClassLoaderCreator<CoordinatorLayout.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ CoordinatorLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CoordinatorLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CoordinatorLayout.SavedState(parcel, null);
    }
}
