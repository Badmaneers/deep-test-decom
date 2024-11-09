package color.support.p043v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;
import color.support.p043v7.internal.widget.ColorBaseSpinner;

/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.q */
/* loaded from: classes.dex */
final class C1250q implements Parcelable.ClassLoaderCreator<ColorBaseSpinner.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ColorBaseSpinner.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ColorBaseSpinner.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ColorBaseSpinner.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ColorBaseSpinner.SavedState(parcel, null);
    }
}
