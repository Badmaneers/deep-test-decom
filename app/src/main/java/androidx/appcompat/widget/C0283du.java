package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;

/* compiled from: Toolbar.java */
/* renamed from: androidx.appcompat.widget.du */
/* loaded from: classes.dex */
final class C0283du implements Parcelable.ClassLoaderCreator<Toolbar.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Toolbar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, null);
    }
}
