package com.color.support.dialog.panel;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.dialog.panel.ColorGuideBehavior;

/* compiled from: ColorGuideBehavior.java */
/* renamed from: com.color.support.dialog.panel.k */
/* loaded from: classes.dex */
final class C1328k implements Parcelable.ClassLoaderCreator<ColorGuideBehavior.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ColorGuideBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ColorGuideBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ColorGuideBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ColorGuideBehavior.SavedState(parcel, (ClassLoader) null);
    }
}
