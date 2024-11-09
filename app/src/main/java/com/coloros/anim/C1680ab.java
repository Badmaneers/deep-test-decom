package com.coloros.anim;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.anim.EffectiveAnimationView;

/* compiled from: EffectiveAnimationView.java */
/* renamed from: com.coloros.anim.ab */
/* loaded from: classes.dex */
final class C1680ab implements Parcelable.Creator<EffectiveAnimationView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EffectiveAnimationView.SavedState[] newArray(int i) {
        return new EffectiveAnimationView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EffectiveAnimationView.SavedState createFromParcel(Parcel parcel) {
        return new EffectiveAnimationView.SavedState(parcel, (byte) 0);
    }
}
