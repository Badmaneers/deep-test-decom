package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.p011b.C0328n;

/* loaded from: classes.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C2349a();

    /* renamed from: a */
    public final C0328n<String, Bundle> f10333a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f10333a = new C0328n<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f10333a = new C0328n<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f10333a.put(strArr[i], bundleArr[i]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f10333a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f10333a.m1061b(i2);
            bundleArr[i2] = this.f10333a.m1062c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f10333a + "}";
    }
}
