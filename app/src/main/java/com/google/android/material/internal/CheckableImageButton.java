package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f9869a = {R.attr.state_checked};

    /* renamed from: b */
    private boolean f9870b;

    /* renamed from: c */
    private boolean f9871c;

    /* renamed from: d */
    private boolean f9872d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9871c = true;
        this.f9872d = true;
        C0538w.m1849a(this, new C2231a(this));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f9871c || this.f9870b == z) {
            return;
        }
        this.f9870b = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9870b;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9870b);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f9872d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f9870b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f9869a.length), f9869a);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9873a = this.f9870b;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        setChecked(savedState.f9873a);
    }

    public void setCheckable(boolean z) {
        if (this.f9871c != z) {
            this.f9871c = z;
            sendAccessibilityEvent(0);
        }
    }

    /* renamed from: a */
    public final boolean m7069a() {
        return this.f9871c;
    }

    public void setPressable(boolean z) {
        this.f9872d = z;
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2257b();

        /* renamed from: a */
        boolean f9873a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9873a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9873a ? 1 : 0);
        }
    }
}
