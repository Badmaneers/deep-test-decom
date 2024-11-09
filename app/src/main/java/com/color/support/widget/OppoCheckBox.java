package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C0295ef;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;

/* loaded from: classes.dex */
public class OppoCheckBox extends AppCompatButton {

    /* renamed from: g */
    private static final int[] f6738g = {R.attr.oppo_state_allSelect};

    /* renamed from: h */
    private static final int[] f6739h = {R.attr.oppo_state_partSelect};

    /* renamed from: a */
    private int f6740a;

    /* renamed from: b */
    private int f6741b;

    /* renamed from: c */
    private boolean f6742c;

    /* renamed from: e */
    private Drawable f6743e;

    /* renamed from: f */
    private InterfaceC1535ft f6744f;

    public OppoCheckBox(Context context) {
        this(context, null);
    }

    public OppoCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.oppoCheckBoxStyle);
    }

    public OppoCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OppoCheckBox, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.OppoCheckBox_oppoButton);
        if (drawable != null) {
            setButtonDrawable(drawable);
        }
        setState(obtainStyledAttributes.getInteger(R.styleable.OppoCheckBox_oppoState, 0));
        obtainStyledAttributes.recycle();
    }

    @ViewDebug.ExportedProperty
    public int getState() {
        return this.f6740a;
    }

    public void setState(int i) {
        if (this.f6740a != i) {
            this.f6740a = i;
            refreshDrawableState();
            if (this.f6742c) {
                return;
            }
            this.f6742c = true;
            this.f6742c = false;
        }
    }

    public void setOnStateChangeListener(InterfaceC1535ft interfaceC1535ft) {
        this.f6744f = interfaceC1535ft;
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.f6741b) {
            this.f6741b = i;
            setButtonDrawable(this.f6741b != 0 ? getResources().getDrawable(this.f6741b) : null);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (drawable != null) {
            if (this.f6743e != null) {
                this.f6743e.setCallback(null);
                unscheduleDrawable(this.f6743e);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
            this.f6743e = drawable;
            this.f6743e.setState(null);
            setMinHeight(this.f6743e.getIntrinsicHeight());
        }
        refreshDrawableState();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(OppoCheckBox.class.getName());
        if (this.f6740a == 2) {
            accessibilityEvent.setChecked(true);
        } else {
            accessibilityEvent.setChecked(false);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(OppoCheckBox.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        if (this.f6740a == 2) {
            accessibilityNodeInfo.setChecked(true);
        } else {
            accessibilityNodeInfo.setChecked(false);
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        Drawable drawable;
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return (C0295ef.m987a(this) || (drawable = this.f6743e) == null) ? compoundPaddingLeft : compoundPaddingLeft + drawable.getIntrinsicWidth();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        Drawable drawable;
        int compoundPaddingRight = super.getCompoundPaddingRight();
        return (!C0295ef.m987a(this) || (drawable = this.f6743e) == null) ? compoundPaddingRight : compoundPaddingRight + drawable.getIntrinsicWidth();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int height;
        super.onDraw(canvas);
        Drawable drawable = this.f6743e;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (gravity != 16) {
                height = gravity != 80 ? 0 : getHeight() - intrinsicHeight;
            } else {
                height = (getHeight() - intrinsicHeight) / 2;
            }
            int i = intrinsicHeight + height;
            int width = C0295ef.m987a(this) ? getWidth() - intrinsicWidth : 0;
            if (C0295ef.m987a(this)) {
                intrinsicWidth = getWidth();
            }
            drawable.setBounds(width, height, intrinsicWidth, i);
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (getState() == 1) {
            mergeDrawableStates(onCreateDrawableState, f6739h);
        }
        if (getState() == 2) {
            mergeDrawableStates(onCreateDrawableState, f6738g);
        }
        return onCreateDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6743e != null) {
            this.f6743e.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6743e;
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f6743e != null) {
            this.f6743e.jumpToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1536fu();

        /* renamed from: a */
        int f6745a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6745a = ((Integer) parcel.readValue(null)).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f6745a));
        }

        public String toString() {
            return "CompoundButton.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " state=" + this.f6745a + "}";
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        setFreezesText(true);
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6745a = getState();
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.f6745a);
        requestLayout();
    }

    @Override // android.view.View
    public boolean performClick() {
        setState(this.f6740a >= 2 ? 0 : 2);
        return super.performClick();
    }
}
