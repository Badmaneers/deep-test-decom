package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

/* compiled from: SlidingPaneLayout.java */
/* renamed from: androidx.slidingpanelayout.widget.f */
/* loaded from: classes.dex */
final class C0980f implements Parcelable.ClassLoaderCreator<SlidingPaneLayout.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ SlidingPaneLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SlidingPaneLayout.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SlidingPaneLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SlidingPaneLayout.SavedState(parcel);
    }
}
