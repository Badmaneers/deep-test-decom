package com.color.support.widget.progressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1337b;
import com.color.support.util.C1346k;

/* loaded from: classes.dex */
public class ColorHorizontalProgressBar extends ProgressBar {

    /* renamed from: a */
    private static final int f7564a = Color.argb(12, 0, 0, 0);

    /* renamed from: b */
    private static final int f7565b = Color.parseColor("#FF2AD181");

    /* renamed from: c */
    private Paint f7566c;

    /* renamed from: d */
    private ColorStateList f7567d;

    /* renamed from: e */
    private ColorStateList f7568e;

    /* renamed from: f */
    private RectF f7569f;

    /* renamed from: g */
    private RectF f7570g;

    /* renamed from: h */
    private int f7571h;

    /* renamed from: i */
    private Path f7572i;

    /* renamed from: j */
    private Path f7573j;

    public ColorHorizontalProgressBar(Context context) {
        this(context, null);
    }

    public ColorHorizontalProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorHorizontalProgressBarStyle);
    }

    public ColorHorizontalProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.colorHorizontalProgressBarStyle);
        this.f7566c = new Paint();
        this.f7569f = new RectF();
        this.f7570g = new RectF();
        this.f7571h = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorHorizontalProgressBar, i, 0);
        this.f7567d = obtainStyledAttributes.getColorStateList(R.styleable.f5059x1bd9b4b6);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f7568e = obtainStyledAttributes.getColorStateList(R.styleable.f5060x778c9357);
        } else {
            this.f7568e = C1346k.m4404a(C1337b.m4374a(context, R.attr.colorTintControlNormal), getResources().getColor(R.color.color_seekbar_progress_color_disabled));
        }
        obtainStyledAttributes.recycle();
        this.f7566c.setDither(true);
        this.f7566c.setAntiAlias(true);
        setLayerType(1, this.f7566c);
        this.f7572i = new Path();
        this.f7573j = new Path();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        this.f7571h = paddingRight >= paddingTop ? paddingTop / 2 : paddingRight / 2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f7573j.reset();
        this.f7572i.reset();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.f7566c.setColor(m5336a(this.f7567d, f7564a));
        this.f7569f.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(this.f7569f, this.f7571h, this.f7571h, this.f7566c);
        this.f7572i.addRoundRect(this.f7569f, this.f7571h, this.f7571h, Path.Direction.CCW);
        boolean z = Build.VERSION.SDK_INT >= 19;
        float progress = getProgress() / getMax();
        if (isLayoutRtl()) {
            if (z) {
                this.f7570g.set(Math.round((getWidth() - getPaddingRight()) - (progress * width)), getPaddingTop(), r1 + width, getHeight() - getPaddingBottom());
            } else {
                this.f7570g.set(getPaddingLeft() + ((1.0f - progress) * width), getPaddingTop(), getPaddingLeft() + width, getHeight() - getPaddingBottom());
            }
        } else if (z) {
            this.f7570g.set(Math.round(getPaddingLeft() - ((1.0f - progress) * width)), getPaddingTop(), r1 + width, getHeight() - getPaddingBottom());
        } else {
            this.f7570g.set(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + (progress * width), getHeight() - getPaddingBottom());
        }
        this.f7566c.setColor(m5336a(this.f7568e, f7565b));
        if (Build.VERSION.SDK_INT >= 19) {
            this.f7573j.addRoundRect(this.f7570g, this.f7571h, this.f7571h, Path.Direction.CCW);
            this.f7573j.op(this.f7572i, Path.Op.INTERSECT);
            canvas.drawPath(this.f7573j, this.f7566c);
            return;
        }
        canvas.drawRoundRect(this.f7570g, this.f7571h, this.f7571h, this.f7566c);
    }

    /* renamed from: a */
    private int m5336a(ColorStateList colorStateList, int i) {
        return colorStateList == null ? i : colorStateList.getColorForState(getDrawableState(), i);
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }
}
