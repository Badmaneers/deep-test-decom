package com.color.support.dialog.panel;

import android.os.Parcel;
import android.os.Parcelable;
import com.color.support.dialog.panel.ColorBottomSheetBehavior;

/* compiled from: ColorBottomSheetBehavior.java */
/* renamed from: com.color.support.dialog.panel.e */
/* loaded from: classes.dex */
final class C1322e implements Parcelable.ClassLoaderCreator<ColorBottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ ColorBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ColorBottomSheetBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ColorBottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ColorBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }
}
