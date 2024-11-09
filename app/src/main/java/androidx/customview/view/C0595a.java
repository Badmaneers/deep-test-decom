package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState.java */
/* renamed from: androidx.customview.view.a */
/* loaded from: classes.dex */
final class C0595a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m2150a(parcel, classLoader);
    }

    /* renamed from: a */
    private static AbsSavedState m2150a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return AbsSavedState.f2573c;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AbsSavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2150a(parcel, null);
    }
}
