package color.support.p043v7.widget.cardview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ColorCardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f5363e = {R.attr.colorBackground};

    /* renamed from: f */
    private static final InterfaceC1272g f5364f;

    /* renamed from: a */
    int f5365a;

    /* renamed from: b */
    int f5366b;

    /* renamed from: c */
    final Rect f5367c;

    /* renamed from: d */
    final Rect f5368d;

    /* renamed from: g */
    private boolean f5369g;

    /* renamed from: h */
    private boolean f5370h;

    /* renamed from: i */
    private final InterfaceC1271f f5371i;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f5364f = new C1268c();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f5364f = new C1266a();
        } else {
            f5364f = new C1269d();
        }
        f5364f.mo4148a();
    }

    public ColorCardView(Context context) {
        super(context);
        this.f5367c = new Rect();
        this.f5368d = new Rect();
        this.f5371i = new C1273h(this);
        m4144a(context, null, 0);
    }

    public ColorCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5367c = new Rect();
        this.f5368d = new Rect();
        this.f5371i = new C1273h(this);
        m4144a(context, attributeSet, 0);
    }

    public ColorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5367c = new Rect();
        this.f5368d = new Rect();
        this.f5371i = new C1273h(this);
        m4144a(context, attributeSet, i);
    }

    public boolean getUseCompatPadding() {
        return this.f5369g;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5369g != z) {
            this.f5369g = z;
            f5364f.mo4162f(this.f5371i);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(f5364f instanceof C1268c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f5364f.mo4156b(this.f5371i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f5364f.mo4158c(this.f5371i)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private void m4144a(Context context, AttributeSet attributeSet, int i) {
        int color2;
        ColorStateList valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorCardView, i, 0);
        if (obtainStyledAttributes.hasValue(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f5363e);
            int color3 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color3, fArr);
            if (fArr[2] > 0.5f) {
                color2 = getResources().getColor(color.support.p043v7.appcompat.R.color.cardview_light_background);
            } else {
                color2 = getResources().getColor(color.support.p043v7.appcompat.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardMaxElevation, 0.0f);
        this.f5369g = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardUseCompatPadding, false);
        this.f5370h = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorCardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_contentPadding, 0);
        this.f5367c.left = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_contentPaddingLeft, dimensionPixelSize);
        this.f5367c.top = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_contentPaddingTop, dimensionPixelSize);
        this.f5367c.right = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_contentPaddingRight, dimensionPixelSize);
        this.f5367c.bottom = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f5365a = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_android_minWidth, 0);
        this.f5366b = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorCardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f5364f.mo4154a(this.f5371i, context, colorStateList, dimension, dimension2, f);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f5365a = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f5366b = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        f5364f.mo4155a(this.f5371i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f5364f.mo4155a(this.f5371i, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return f5364f.mo4164h(this.f5371i);
    }

    public int getContentPaddingLeft() {
        return this.f5367c.left;
    }

    public int getContentPaddingRight() {
        return this.f5367c.right;
    }

    public int getContentPaddingTop() {
        return this.f5367c.top;
    }

    public int getContentPaddingBottom() {
        return this.f5367c.bottom;
    }

    public void setRadius(float f) {
        f5364f.mo4153a(this.f5371i, f);
    }

    public float getRadius() {
        return f5364f.mo4160d(this.f5371i);
    }

    public void setCardElevation(float f) {
        f5364f.mo4159c(this.f5371i, f);
    }

    public float getCardElevation() {
        return f5364f.mo4161e(this.f5371i);
    }

    public void setMaxCardElevation(float f) {
        f5364f.mo4157b(this.f5371i, f);
    }

    public float getMaxCardElevation() {
        return f5364f.mo4152a(this.f5371i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f5370h;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f5370h) {
            this.f5370h = z;
            f5364f.mo4163g(this.f5371i);
        }
    }
}
