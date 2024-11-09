package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;

/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.dd */
/* loaded from: classes.dex */
final class C0266dd implements Parcelable.ClassLoaderCreator<SearchView.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, null);
    }
}
