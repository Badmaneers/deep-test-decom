package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* compiled from: StaggeredGridLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.cq */
/* loaded from: classes.dex */
final class C0891cq implements Parcelable.Creator<StaggeredGridLayoutManager.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager.SavedState[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.SavedState(parcel);
    }
}
