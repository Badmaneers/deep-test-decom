package color.support.p043v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;
import color.support.p043v7.internal.widget.AbsSpinnerCompat;

/* compiled from: AbsSpinnerCompat.java */
/* renamed from: color.support.v7.internal.widget.b */
/* loaded from: classes.dex */
final class C1235b implements Parcelable.ClassLoaderCreator<AbsSpinnerCompat.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ AbsSpinnerCompat.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AbsSpinnerCompat.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AbsSpinnerCompat.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AbsSpinnerCompat.SavedState(parcel, null);
    }
}
