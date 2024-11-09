package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0542a;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.C2306s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BorderDrawable.java */
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes.dex */
public final class C2193c extends Drawable {

    /* renamed from: a */
    float f9731a;

    /* renamed from: i */
    private int f9739i;

    /* renamed from: j */
    private int f9740j;

    /* renamed from: k */
    private int f9741k;

    /* renamed from: l */
    private int f9742l;

    /* renamed from: m */
    private int f9743m;

    /* renamed from: o */
    private C2303p f9745o;

    /* renamed from: p */
    private ColorStateList f9746p;

    /* renamed from: b */
    private final C2306s f9732b = new C2306s();

    /* renamed from: d */
    private final Path f9734d = new Path();

    /* renamed from: e */
    private final Rect f9735e = new Rect();

    /* renamed from: f */
    private final RectF f9736f = new RectF();

    /* renamed from: g */
    private final RectF f9737g = new RectF();

    /* renamed from: h */
    private final C2194d f9738h = new C2194d(this, (byte) 0);

    /* renamed from: n */
    private boolean f9744n = true;

    /* renamed from: c */
    private final Paint f9733c = new Paint(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2193c(C2303p c2303p) {
        this.f9745o = c2303p;
        this.f9733c.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final void m6990a(float f) {
        if (this.f9731a != f) {
            this.f9731a = f;
            this.f9733c.setStrokeWidth(f * 1.3333f);
            this.f9744n = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6992a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f9743m = colorStateList.getColorForState(getState(), this.f9743m);
        }
        this.f9746p = colorStateList;
        this.f9744n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9733c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6991a(int i, int i2, int i3, int i4) {
        this.f9739i = i;
        this.f9740j = i2;
        this.f9741k = i3;
        this.f9742l = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f9744n) {
            Paint paint = this.f9733c;
            copyBounds(this.f9735e);
            float height = this.f9731a / r1.height();
            paint.setShader(new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{C0542a.m1900a(this.f9739i, this.f9743m), C0542a.m1900a(this.f9740j, this.f9743m), C0542a.m1900a(C0542a.m1904b(this.f9740j, 0), this.f9743m), C0542a.m1900a(C0542a.m1904b(this.f9742l, 0), this.f9743m), C0542a.m1900a(this.f9742l, this.f9743m), C0542a.m1900a(this.f9741k, this.f9743m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f9744n = false;
        }
        float strokeWidth = this.f9733c.getStrokeWidth() / 2.0f;
        copyBounds(this.f9735e);
        this.f9736f.set(this.f9735e);
        float min = Math.min(this.f9745o.m7308f().mo7225a(m6989a()), this.f9736f.width() / 2.0f);
        if (this.f9745o.m7303a(m6989a())) {
            this.f9736f.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f9736f, min, min, this.f9733c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f9745o.m7303a(m6989a())) {
            outline.setRoundRect(getBounds(), this.f9745o.m7308f().mo7225a(m6989a()));
            return;
        }
        copyBounds(this.f9735e);
        this.f9736f.set(this.f9735e);
        this.f9732b.m7355a(this.f9745o, 1.0f, this.f9736f, this.f9734d);
        if (this.f9734d.isConvex()) {
            outline.setConvexPath(this.f9734d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (!this.f9745o.m7303a(m6989a())) {
            return true;
        }
        int round = Math.round(this.f9731a);
        rect.set(round, round, round, round);
        return true;
    }

    /* renamed from: a */
    private RectF m6989a() {
        this.f9737g.set(getBounds());
        return this.f9737g;
    }

    /* renamed from: a */
    public final void m6993a(C2303p c2303p) {
        this.f9745o = c2303p;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9733c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9731a > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f9744n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.f9746p != null && this.f9746p.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        if (this.f9746p != null && (colorForState = this.f9746p.getColorForState(iArr, this.f9743m)) != this.f9743m) {
            this.f9744n = true;
            this.f9743m = colorForState;
        }
        if (this.f9744n) {
            invalidateSelf();
        }
        return this.f9744n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f9738h;
    }
}
