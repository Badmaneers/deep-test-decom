package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.C2306s;
import com.google.android.material.p082k.InterfaceC2288ad;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC2288ad {

    /* renamed from: a */
    private static final int f9855a = R.style.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: b */
    private final C2306s f9856b;

    /* renamed from: c */
    private final RectF f9857c;

    /* renamed from: d */
    private final RectF f9858d;

    /* renamed from: e */
    private final Paint f9859e;

    /* renamed from: f */
    private final Paint f9860f;

    /* renamed from: g */
    private final Path f9861g;

    /* renamed from: h */
    private ColorStateList f9862h;

    /* renamed from: i */
    private C2303p f9863i;

    /* renamed from: j */
    private int f9864j;

    /* renamed from: k */
    private Path f9865k;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9855a), attributeSet, i);
        this.f9856b = new C2306s();
        this.f9861g = new Path();
        Context context2 = getContext();
        this.f9860f = new Paint();
        this.f9860f.setAntiAlias(true);
        this.f9860f.setColor(-1);
        this.f9860f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f9857c = new RectF();
        this.f9858d = new RectF();
        this.f9865k = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.ShapeableImageView, i, f9855a);
        this.f9862h = C2221d.m7045a(context2, obtainStyledAttributes, R.styleable.ShapeableImageView_strokeColor);
        this.f9864j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_strokeWidth, 0);
        this.f9859e = new Paint();
        this.f9859e.setStyle(Paint.Style.STROKE);
        this.f9859e.setAntiAlias(true);
        this.f9863i = C2303p.m7300a(context2, attributeSet, i, f9855a).m7327a();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2230a(this));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f9865k, this.f9860f);
        this.f9859e.setStrokeWidth(this.f9864j);
        int colorForState = this.f9862h.getColorForState(getDrawableState(), this.f9862h.getDefaultColor());
        if (this.f9864j <= 0 || colorForState == 0) {
            return;
        }
        this.f9859e.setColor(colorForState);
        canvas.drawPath(this.f9861g, this.f9859e);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9857c.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        this.f9856b.m7355a(this.f9863i, 1.0f, this.f9857c, this.f9861g);
        this.f9865k.rewind();
        this.f9865k.addPath(this.f9861g);
        this.f9858d.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f9865k.addRect(this.f9858d, Path.Direction.CCW);
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public void setShapeAppearanceModel(C2303p c2303p) {
        this.f9863i = c2303p;
        requestLayout();
    }

    public C2303p getShapeAppearanceModel() {
        return this.f9863i;
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C0057a.m45a(getContext(), i));
    }

    public ColorStateList getStrokeColor() {
        return this.f9862h;
    }

    public void setStrokeWidth(int i) {
        if (this.f9864j != i) {
            this.f9864j = i;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public int getStrokeWidth() {
        return this.f9864j;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9862h = colorStateList;
        invalidate();
    }
}
