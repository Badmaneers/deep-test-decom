package androidx.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.widget.ColorDrawerLayout;

/* compiled from: ColorDrawerLayout.java */
/* renamed from: androidx.widget.h */
/* loaded from: classes.dex */
final class C1150h implements Parcelable.ClassLoaderCreator<ColorDrawerLayout.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ColorDrawerLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ColorDrawerLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ColorDrawerLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ColorDrawerLayout.SavedState(parcel, null);
    }
}
