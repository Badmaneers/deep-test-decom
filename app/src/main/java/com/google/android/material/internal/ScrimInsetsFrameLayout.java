package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    Drawable f9895a;

    /* renamed from: b */
    Rect f9896b;

    /* renamed from: c */
    private Rect f9897c;

    /* renamed from: d */
    private boolean f9898d;

    /* renamed from: e */
    private boolean f9899e;

    /* renamed from: a */
    public void mo7074a(C0514ao c0514ao) {
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9897c = new Rect();
        this.f9898d = true;
        this.f9899e = true;
        TypedArray m7095a = C2243al.m7095a(context, attributeSet, R.styleable.ScrimInsetsFrameLayout, i, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f9895a = m7095a.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        m7095a.recycle();
        setWillNotDraw(true);
        C0538w.m1850a(this, new C2232aa(this));
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f9895a = drawable;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f9898d = z;
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f9899e = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f9896b == null || this.f9895a == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f9898d) {
            this.f9897c.set(0, 0, width, this.f9896b.top);
            this.f9895a.setBounds(this.f9897c);
            this.f9895a.draw(canvas);
        }
        if (this.f9899e) {
            this.f9897c.set(0, height - this.f9896b.bottom, width, height);
            this.f9895a.setBounds(this.f9897c);
            this.f9895a.draw(canvas);
        }
        this.f9897c.set(0, this.f9896b.top, this.f9896b.left, height - this.f9896b.bottom);
        this.f9895a.setBounds(this.f9897c);
        this.f9895a.draw(canvas);
        this.f9897c.set(width - this.f9896b.right, this.f9896b.top, width, height - this.f9896b.bottom);
        this.f9895a.setBounds(this.f9897c);
        this.f9895a.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9895a != null) {
            this.f9895a.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9895a != null) {
            this.f9895a.setCallback(null);
        }
    }
}
