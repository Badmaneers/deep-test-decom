package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

/* compiled from: NestedScrollView.java */
/* renamed from: androidx.core.widget.m */
/* loaded from: classes.dex */
final class C0575m implements Parcelable.Creator<NestedScrollView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NestedScrollView.SavedState[] newArray(int i) {
        return new NestedScrollView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NestedScrollView.SavedState createFromParcel(Parcel parcel) {
        return new NestedScrollView.SavedState(parcel);
    }
}
