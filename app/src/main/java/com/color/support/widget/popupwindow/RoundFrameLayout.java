package com.color.support.widget.popupwindow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a */
    private Path f7518a;

    /* renamed from: b */
    private Paint f7519b;

    /* renamed from: c */
    private RectF f7520c;

    /* renamed from: d */
    private float f7521d;

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundFrameLayout);
        this.f7521d = obtainStyledAttributes.getDimension(R.styleable.RoundFrameLayout_rfRadius, 0.0f);
        obtainStyledAttributes.recycle();
        this.f7518a = new Path();
        this.f7519b = new Paint(1);
        this.f7520c = new RectF();
        this.f7519b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public void setRadius(float f) {
        this.f7521d = f;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7520c.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(m5323a());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        canvas.saveLayer(this.f7520c, null, 31);
        super.dispatchDraw(canvas);
        canvas.drawPath(m5323a(), this.f7519b);
        canvas.restore();
    }

    /* renamed from: a */
    private Path m5323a() {
        this.f7518a.reset();
        this.f7518a.addRoundRect(this.f7520c, this.f7521d, this.f7521d, Path.Direction.CW);
        return this.f7518a;
    }
}
