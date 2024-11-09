package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1337b;
import com.color.support.util.C1338c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ColorCircleProgressBar extends View {

    /* renamed from: A */
    private float f5922A;

    /* renamed from: a */
    private int f5923a;

    /* renamed from: b */
    private int f5924b;

    /* renamed from: c */
    private int f5925c;

    /* renamed from: d */
    private int f5926d;

    /* renamed from: e */
    private int f5927e;

    /* renamed from: f */
    private int f5928f;

    /* renamed from: g */
    private int f5929g;

    /* renamed from: h */
    private int f5930h;

    /* renamed from: i */
    private int f5931i;

    /* renamed from: j */
    private int f5932j;

    /* renamed from: k */
    private int f5933k;

    /* renamed from: l */
    private int f5934l;

    /* renamed from: m */
    private int f5935m;

    /* renamed from: n */
    private int f5936n;

    /* renamed from: o */
    private float f5937o;

    /* renamed from: p */
    private float f5938p;

    /* renamed from: q */
    private float f5939q;

    /* renamed from: r */
    private Context f5940r;

    /* renamed from: s */
    private RunnableC1493f f5941s;

    /* renamed from: t */
    private AccessibilityManager f5942t;

    /* renamed from: u */
    private Paint f5943u;

    /* renamed from: v */
    private ArrayList<C1542g> f5944v;

    /* renamed from: w */
    private Paint f5945w;

    /* renamed from: x */
    private int f5946x;

    /* renamed from: y */
    private int f5947y;

    /* renamed from: z */
    private RectF f5948z;

    public ColorCircleProgressBar(Context context) {
        this(context, null);
    }

    public ColorCircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorCircleProgressBarStyle);
    }

    public ColorCircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5925c = 0;
        this.f5926d = 0;
        this.f5927e = 0;
        this.f5928f = 0;
        this.f5929g = 0;
        this.f5930h = 100;
        this.f5931i = 0;
        this.f5932j = 0;
        this.f5933k = -1;
        this.f5937o = 1.0f;
        this.f5944v = new ArrayList<>();
        C1338c.m4375a(this, false);
        this.f5940r = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.colorCircleProgressBar, i, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_loading_view_default_length);
        this.f5925c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.colorCircleProgressBar_colorCircleProgressBarWidth, dimensionPixelSize);
        this.f5926d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.colorCircleProgressBar_colorCircleProgressBarHeight, dimensionPixelSize);
        this.f5927e = obtainStyledAttributes.getInteger(R.styleable.colorCircleProgressBar_colorCircleProgressBarType, 0);
        int m4374a = C1337b.m4374a(context, R.attr.colorTintControlNormal);
        int m4374a2 = C1337b.m4374a(context, R.attr.colorTintLightNormal);
        this.f5923a = obtainStyledAttributes.getColor(R.styleable.colorCircleProgressBar_colorCircleProgressBarColor, m4374a);
        this.f5924b = obtainStyledAttributes.getColor(R.styleable.colorCircleProgressBar_colorCircleProgressBarBgCircleColor, m4374a2);
        this.f5931i = obtainStyledAttributes.getInteger(R.styleable.colorCircleProgressBar_colorCircleProgress, this.f5931i);
        this.f5930h = obtainStyledAttributes.getInteger(R.styleable.colorCircleProgressBar_colorCircleMax, this.f5930h);
        obtainStyledAttributes.recycle();
        this.f5934l = context.getResources().getDimensionPixelSize(R.dimen.color_circle_loading_strokewidth);
        this.f5935m = context.getResources().getDimensionPixelSize(R.dimen.color_circle_loading_medium_strokewidth);
        this.f5936n = context.getResources().getDimensionPixelSize(R.dimen.color_circle_loading_large_strokewidth);
        this.f5928f = this.f5934l;
        if (1 == this.f5927e) {
            this.f5928f = this.f5935m;
        } else if (2 == this.f5927e) {
            this.f5928f = this.f5936n;
        }
        this.f5929g = this.f5928f >> 1;
        this.f5938p = this.f5925c >> 1;
        this.f5939q = this.f5926d >> 1;
        m4435a();
    }

    /* renamed from: a */
    private void m4435a() {
        if (Build.VERSION.SDK_INT > 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        for (int i = 0; i < 360; i++) {
            this.f5944v.add(new C1542g(this));
        }
        this.f5945w = new Paint(1);
        this.f5945w.setColor(this.f5924b);
        this.f5945w.setStyle(Paint.Style.STROKE);
        this.f5943u = new Paint(1);
        this.f5943u.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5943u.setColor(this.f5923a);
        this.f5943u.setStyle(Paint.Style.STROKE);
        this.f5943u.setStrokeWidth(this.f5928f);
        this.f5943u.setStrokeCap(Paint.Cap.ROUND);
        setProgress(this.f5931i);
        setMax(this.f5930h);
        this.f5942t = (AccessibilityManager) this.f5940r.getSystemService("accessibility");
    }

    /* renamed from: b */
    private void m4436b() {
        if (this.f5930h > 0) {
            this.f5932j = (int) (this.f5931i / (this.f5930h / 360.0f));
            if (360 - this.f5932j < 2) {
                this.f5932j = 360;
            }
            this.f5933k = this.f5932j;
        } else {
            this.f5932j = 0;
            this.f5933k = 0;
        }
        invalidate();
    }

    public void setProgress(int i) {
        Log.i("ColorCircleProgressBar", "setProgress: ".concat(String.valueOf(i)));
        if (i < 0) {
            i = 0;
        }
        if (i > this.f5930h) {
            i = this.f5930h;
        }
        if (i != this.f5931i) {
            this.f5931i = i;
        }
        m4436b();
        if (this.f5942t != null && this.f5942t.isEnabled() && this.f5942t.isTouchExplorationEnabled()) {
            if (this.f5941s == null) {
                this.f5941s = new RunnableC1493f(this, (byte) 0);
            } else {
                removeCallbacks(this.f5941s);
            }
            postDelayed(this.f5941s, 10L);
        }
    }

    public int getProgress() {
        return this.f5931i;
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.f5930h) {
            this.f5930h = i;
            if (this.f5931i > i) {
                this.f5931i = i;
            }
        }
        m4436b();
    }

    public int getMax() {
        return this.f5930h;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f5925c, this.f5926d);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (this.f5941s != null) {
            removeCallbacks(this.f5941s);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5949a = this.f5931i;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5946x = this.f5928f / 2;
        this.f5947y = getWidth() / 2;
        this.f5922A = this.f5947y - this.f5946x;
        this.f5948z = new RectF(this.f5947y - this.f5922A, this.f5947y - this.f5922A, this.f5947y + this.f5922A, this.f5947y + this.f5922A);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.f5949a);
        requestLayout();
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1561h();

        /* renamed from: a */
        int f5949a;

        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5949a = ((Integer) parcel.readValue(null)).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f5949a));
        }

        public String toString() {
            return "ColorCircleProgressBar.SavedState { " + Integer.toHexString(System.identityHashCode(this)) + " mProgress = " + this.f5949a + " }";
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f5945w.setStrokeWidth(this.f5928f);
        canvas.drawCircle(this.f5947y, this.f5947y, this.f5922A, this.f5945w);
        canvas.save();
        canvas.rotate(-90.0f, this.f5947y, this.f5947y);
        canvas.drawArc(this.f5948z, 0.0f, this.f5932j, false, this.f5943u);
        canvas.restore();
    }
}
