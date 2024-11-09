package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: a */
    protected boolean f9878a;

    /* renamed from: b */
    boolean f9879b;

    /* renamed from: c */
    private Drawable f9880c;

    /* renamed from: d */
    private final Rect f9881d;

    /* renamed from: e */
    private final Rect f9882e;

    /* renamed from: f */
    private int f9883f;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9881d = new Rect();
        this.f9882e = new Rect();
        this.f9883f = 119;
        this.f9878a = true;
        this.f9879b = false;
        TypedArray m7095a = C2243al.m7095a(context, attributeSet, R.styleable.ForegroundLinearLayout, i, 0, new int[0]);
        this.f9883f = m7095a.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f9883f);
        Drawable drawable = m7095a.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f9878a = m7095a.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        m7095a.recycle();
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f9883f;
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f9883f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f9883f = i;
            if (this.f9883f == 119 && this.f9880c != null) {
                this.f9880c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9880c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f9880c != null) {
            this.f9880c.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f9880c == null || !this.f9880c.isStateful()) {
            return;
        }
        this.f9880c.setState(getDrawableState());
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        if (this.f9880c != drawable) {
            if (this.f9880c != null) {
                this.f9880c.setCallback(null);
                unscheduleDrawable(this.f9880c);
            }
            this.f9880c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f9883f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f9880c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f9879b = z | this.f9879b;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9879b = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9880c != null) {
            Drawable drawable = this.f9880c;
            if (this.f9879b) {
                this.f9879b = false;
                Rect rect = this.f9881d;
                Rect rect2 = this.f9882e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f9878a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f9883f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f9880c != null) {
            this.f9880c.setHotspot(f, f2);
        }
    }
}
