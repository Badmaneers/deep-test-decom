package com.color.support.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* compiled from: ColorCutoutDrawable.java */
/* renamed from: com.color.support.widget.i */
/* loaded from: classes.dex */
public final class C1562i extends GradientDrawable {

    /* renamed from: a */
    private final Paint f7399a = new Paint(1);

    /* renamed from: b */
    private final RectF f7400b;

    /* renamed from: c */
    private int f7401c;

    public C1562i() {
        this.f7399a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7399a.setColor(-1);
        this.f7399a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f7400b = new RectF();
    }

    /* renamed from: a */
    public final boolean m5223a() {
        return !this.f7400b.isEmpty();
    }

    /* renamed from: b */
    public final RectF m5224b() {
        return this.f7400b;
    }

    /* renamed from: a */
    private void m5221a(float f, float f2, float f3, float f4) {
        if (f == this.f7400b.left && f2 == this.f7400b.top && f3 == this.f7400b.right && f4 == this.f7400b.bottom) {
            return;
        }
        this.f7400b.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m5222a(RectF rectF) {
        m5221a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: c */
    public final void m5225c() {
        m5221a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, null);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f7401c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.f7401c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f7400b, this.f7399a);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f7401c);
    }
}
