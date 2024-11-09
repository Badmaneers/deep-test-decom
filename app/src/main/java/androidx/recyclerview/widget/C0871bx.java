package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bx */
/* loaded from: classes.dex */
final class C0871bx implements Parcelable.ClassLoaderCreator<RecyclerView.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecyclerView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RecyclerView.SavedState(parcel, null);
    }
}
