package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* compiled from: StaggeredGridLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.cp */
/* loaded from: classes.dex */
final class C0890cp implements Parcelable.Creator<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
    }
}
