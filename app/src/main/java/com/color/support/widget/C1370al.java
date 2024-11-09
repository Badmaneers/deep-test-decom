package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ColorExpandableRecyclerView;

/* compiled from: ColorExpandableRecyclerView.java */
/* renamed from: com.color.support.widget.al */
/* loaded from: classes.dex */
final class C1370al implements Parcelable.Creator<ColorExpandableRecyclerView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ColorExpandableRecyclerView.SavedState[] newArray(int i) {
        return new ColorExpandableRecyclerView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ColorExpandableRecyclerView.SavedState createFromParcel(Parcel parcel) {
        return new ColorExpandableRecyclerView.SavedState(parcel, (byte) 0);
    }
}
