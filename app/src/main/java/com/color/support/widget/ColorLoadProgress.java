package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.p024g.C0538w;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorLoadProgress extends AppCompatButton {

    /* renamed from: g */
    private static final int[] f6142g = {R.attr.color_state_default};

    /* renamed from: h */
    private static final int[] f6143h = {R.attr.color_state_wait};

    /* renamed from: i */
    private static final int[] f6144i = {R.attr.color_state_fail};

    /* renamed from: j */
    private static final int[] f6145j = {R.attr.color_state_ing};

    /* renamed from: t */
    private static final DecelerateInterpolator f6146t = new DecelerateInterpolator();

    /* renamed from: a */
    public int f6147a;

    /* renamed from: b */
    public int f6148b;

    /* renamed from: c */
    public int f6149c;

    /* renamed from: e */
    protected boolean f6150e;

    /* renamed from: f */
    protected float f6151f;

    /* renamed from: k */
    private final String f6152k;

    /* renamed from: l */
    private final boolean f6153l;

    /* renamed from: m */
    private int f6154m;

    /* renamed from: n */
    private Drawable f6155n;

    /* renamed from: o */
    private boolean f6156o;

    /* renamed from: p */
    private InterfaceC1391bf f6157p;

    /* renamed from: q */
    private InterfaceC1391bf f6158q;

    /* renamed from: r */
    private RunnableC1390be f6159r;

    /* renamed from: s */
    private final AccessibilityManager f6160s;

    public ColorLoadProgress(Context context) {
        this(context, null);
    }

    public ColorLoadProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorLoadProgressStyle);
    }

    public ColorLoadProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6152k = "ColorLoadProgress";
        this.f6153l = false;
        this.f6150e = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorLoadProgress, i, 0);
        int integer = obtainStyledAttributes.getInteger(R.styleable.ColorLoadProgress_colorState, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ColorLoadProgress_colorDefaultDrawable);
        if (drawable != null) {
            setButtonDrawable(drawable);
        }
        setProgress(obtainStyledAttributes.getInt(R.styleable.ColorLoadProgress_colorProgress, this.f6148b));
        setState(integer);
        obtainStyledAttributes.recycle();
        this.f6148b = 0;
        this.f6149c = 100;
        if (C0538w.m1876g(this) == 0) {
            C0538w.m1840a((View) this, 1);
        }
        this.f6160s = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > this.f6149c) {
            i = this.f6149c;
        }
        if (i != this.f6148b) {
            this.f6148b = i;
        }
        if (this.f6150e) {
            this.f6150e = false;
        }
        invalidate();
        if (this.f6160s != null && this.f6160s.isEnabled() && this.f6160s.isTouchExplorationEnabled()) {
            if (this.f6159r == null) {
                this.f6159r = new RunnableC1390be(this, (byte) 0);
            } else {
                removeCallbacks(this.f6159r);
            }
            postDelayed(this.f6159r, 10L);
        }
    }

    public int getProgress() {
        return this.f6148b;
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.f6149c) {
            this.f6149c = i;
            if (this.f6148b > i) {
                this.f6148b = i;
            }
            invalidate();
        }
    }

    public int getMax() {
        return this.f6149c;
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.f6154m) {
            this.f6154m = i;
            setButtonDrawable(this.f6154m != 0 ? getResources().getDrawable(this.f6154m) : null);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (drawable != null) {
            if (this.f6155n != null) {
                this.f6155n.setCallback(null);
                unscheduleDrawable(this.f6155n);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
            this.f6155n = drawable;
            this.f6155n.setState(null);
            setMinHeight(this.f6155n.getIntrinsicHeight());
        }
        refreshDrawableState();
    }

    public void setState(int i) {
        if (this.f6147a != i) {
            this.f6147a = i;
            refreshDrawableState();
            if (this.f6156o) {
                return;
            }
            this.f6156o = true;
            this.f6156o = false;
        }
    }

    public void setOnStateChangeListener(InterfaceC1391bf interfaceC1391bf) {
        this.f6157p = interfaceC1391bf;
    }

    void setOnStateChangeWidgetListener(InterfaceC1391bf interfaceC1391bf) {
        this.f6158q = interfaceC1391bf;
    }

    public int getState() {
        return this.f6147a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (this.f6159r != null) {
            removeCallbacks(this.f6159r);
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (getState() == 0) {
            mergeDrawableStates(onCreateDrawableState, f6142g);
        }
        if (getState() == 1) {
            mergeDrawableStates(onCreateDrawableState, f6145j);
        }
        if (getState() == 2) {
            mergeDrawableStates(onCreateDrawableState, f6143h);
        }
        if (getState() == 3) {
            mergeDrawableStates(onCreateDrawableState, f6144i);
        }
        return onCreateDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6155n != null) {
            this.f6155n.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6155n;
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f6155n != null) {
            this.f6155n.jumpToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1392bg();

        /* renamed from: a */
        int f6161a;

        /* renamed from: b */
        int f6162b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6161a = ((Integer) parcel.readValue(null)).intValue();
            this.f6162b = ((Integer) parcel.readValue(null)).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f6161a));
            parcel.writeValue(Integer.valueOf(this.f6162b));
        }

        public String toString() {
            return "CompoundButton.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " mState = " + this.f6161a + " mProgress = " + this.f6162b + "}";
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        setFreezesText(true);
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6161a = getState();
        savedState.f6162b = this.f6148b;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.f6161a);
        setProgress(savedState.f6162b);
        requestLayout();
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f6147a == 0) {
            setState(1);
        } else if (this.f6147a == 1) {
            setState(2);
        } else if (this.f6147a == 2) {
            setState(1);
        } else if (this.f6147a == 3) {
            setState(1);
        }
        return super.performClick();
    }
}
