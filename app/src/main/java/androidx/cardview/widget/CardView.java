package androidx.cardview.widget;

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
public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f1530e = {R.attr.colorBackground};

    /* renamed from: f */
    private static final InterfaceC0343h f1531f;

    /* renamed from: a */
    int f1532a;

    /* renamed from: b */
    int f1533b;

    /* renamed from: c */
    final Rect f1534c;

    /* renamed from: d */
    final Rect f1535d;

    /* renamed from: g */
    private boolean f1536g;

    /* renamed from: h */
    private boolean f1537h;

    /* renamed from: i */
    private final InterfaceC0342g f1538i;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1531f = new C0339d();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f1531f = new C0337b();
        } else {
            f1531f = new C0340e();
        }
        f1531f.mo1091a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.cardview.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color2;
        ColorStateList valueOf;
        this.f1534c = new Rect();
        this.f1535d = new Rect();
        this.f1538i = new C0336a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.CardView, i, androidx.cardview.R.style.CardView);
        if (obtainStyledAttributes.hasValue(androidx.cardview.R.styleable.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(androidx.cardview.R.styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1530e);
            int color3 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color3, fArr);
            if (fArr[2] > 0.5f) {
                color2 = getResources().getColor(androidx.cardview.R.color.cardview_light_background);
            } else {
                color2 = getResources().getColor(androidx.cardview.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f1536g = obtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        this.f1537h = obtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPadding, 0);
        this.f1534c.left = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1534c.top = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1534c.right = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1534c.bottom = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1532a = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minWidth, 0);
        this.f1533b = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1531f.mo1096a(this.f1538i, context, colorStateList, dimension, dimension2, f);
    }

    public boolean getUseCompatPadding() {
        return this.f1536g;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1536g != z) {
            this.f1536g = z;
            f1531f.mo1105g(this.f1538i);
        }
    }

    /* renamed from: a */
    public void mo1083a(int i, int i2, int i3, int i4) {
        this.f1534c.set(i, i2, i3, i4);
        f1531f.mo1104f(this.f1538i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(f1531f instanceof C0339d)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f1531f.mo1098b(this.f1538i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f1531f.mo1100c(this.f1538i)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f1532a = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f1533b = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        f1531f.mo1097a(this.f1538i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1531f.mo1097a(this.f1538i, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1531f.mo1107i(this.f1538i);
    }

    public int getContentPaddingLeft() {
        return this.f1534c.left;
    }

    public int getContentPaddingRight() {
        return this.f1534c.right;
    }

    public int getContentPaddingTop() {
        return this.f1534c.top;
    }

    public int getContentPaddingBottom() {
        return this.f1534c.bottom;
    }

    public void setRadius(float f) {
        f1531f.mo1095a(this.f1538i, f);
    }

    public float getRadius() {
        return f1531f.mo1102d(this.f1538i);
    }

    public void setCardElevation(float f) {
        f1531f.mo1101c(this.f1538i, f);
    }

    public float getCardElevation() {
        return f1531f.mo1103e(this.f1538i);
    }

    public void setMaxCardElevation(float f) {
        f1531f.mo1099b(this.f1538i, f);
    }

    public float getMaxCardElevation() {
        return f1531f.mo1094a(this.f1538i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1537h;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1537h) {
            this.f1537h = z;
            f1531f.mo1106h(this.f1538i);
        }
    }
}
