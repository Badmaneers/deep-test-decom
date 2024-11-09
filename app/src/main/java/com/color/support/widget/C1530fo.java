package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.widget.ExpandableRecyclerConnector;

/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fo */
/* loaded from: classes.dex */
final class C1530fo implements Parcelable.Creator<ExpandableRecyclerConnector.GroupMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ExpandableRecyclerConnector.GroupMetadata[] newArray(int i) {
        return new ExpandableRecyclerConnector.GroupMetadata[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ExpandableRecyclerConnector.GroupMetadata createFromParcel(Parcel parcel) {
        return ExpandableRecyclerConnector.GroupMetadata.m4806a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
    }
}
