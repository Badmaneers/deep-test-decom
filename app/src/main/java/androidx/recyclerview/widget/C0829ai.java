package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: LinearLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.ai */
/* loaded from: classes.dex */
final class C0829ai implements Parcelable.Creator<LinearLayoutManager.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LinearLayoutManager.SavedState[] newArray(int i) {
        return new LinearLayoutManager.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LinearLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager.SavedState(parcel);
    }
}
