package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter;

/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
final class C0307p implements Parcelable.Creator<ActionMenuPresenter.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActionMenuPresenter.SavedState[] newArray(int i) {
        return new ActionMenuPresenter.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionMenuPresenter.SavedState createFromParcel(Parcel parcel) {
        return new ActionMenuPresenter.SavedState(parcel);
    }
}
