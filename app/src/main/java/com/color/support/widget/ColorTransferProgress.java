package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0295ef;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorTransferProgress extends ColorLoadProgress {

    /* renamed from: g */
    private Paint f6716g;

    /* renamed from: h */
    private int f6717h;

    /* renamed from: i */
    private int f6718i;

    /* renamed from: j */
    private PaintFlagsDrawFilter f6719j;

    /* renamed from: k */
    private Path f6720k;

    /* renamed from: l */
    private Drawable f6721l;

    public ColorTransferProgress(Context context) {
        this(context, null);
    }

    public ColorTransferProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorLoadProgressStyle);
    }

    public ColorTransferProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6719j = null;
        this.f6720k = null;
        this.f6718i = getResources().getDimensionPixelSize(R.dimen.color_upload_or_download_strokewidth);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorLoadProgress, i, 0);
        this.f6721l = obtainStyledAttributes.getDrawable(R.styleable.ColorLoadProgress_colorDefaultDrawable);
        this.f6717h = obtainStyledAttributes.getColor(R.styleable.ColorLoadProgress_colorLoadProgressColor, -1);
        obtainStyledAttributes.recycle();
        this.f6716g = new Paint();
        this.f6716g.setStyle(Paint.Style.STROKE);
        this.f6716g.setStrokeWidth(this.f6718i);
        this.f6716g.setAntiAlias(true);
        this.f6716g.setDither(true);
        this.f6716g.setColor(this.f6717h);
        this.f6719j = new PaintFlagsDrawFilter(0, 3);
        this.f6720k = new Path();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f6721l.getIntrinsicWidth(), this.f6721l.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.color.support.widget.ColorLoadProgress, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        float f = (this.f6148b * 360.0f) / this.f6149c;
        Drawable drawable = this.f6721l;
        if (this.f6721l != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            i3 = drawable.getIntrinsicWidth();
            if (gravity != 16) {
                i = gravity != 80 ? 0 : getHeight() - intrinsicHeight;
            } else {
                i = (getHeight() - intrinsicHeight) / 2;
            }
            i2 = intrinsicHeight + i;
            r3 = C0295ef.m987a(this) ? getWidth() - i3 : 0;
            if (C0295ef.m987a(this)) {
                i3 = getWidth();
            }
            drawable.setBounds(r3, i, i3, i2);
            drawable.draw(canvas);
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        Rect rect = new Rect(r3 + (this.f6718i / 2), i + (this.f6718i / 2), i3 - (this.f6718i / 2), i2 - (this.f6718i / 2));
        this.f6720k.reset();
        this.f6720k.addArc(new RectF(rect), 270.0f, f);
        canvas.drawPath(this.f6720k, this.f6716g);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(this.f6149c);
        accessibilityEvent.setCurrentItemIndex(this.f6148b);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
