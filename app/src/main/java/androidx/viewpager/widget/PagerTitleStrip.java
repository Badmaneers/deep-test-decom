package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.C0577o;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

@InterfaceC1103j
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: n */
    private static final int[] f4386n = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: o */
    private static final int[] f4387o = {R.attr.textAllCaps};

    /* renamed from: a */
    ViewPager f4388a;

    /* renamed from: b */
    TextView f4389b;

    /* renamed from: c */
    TextView f4390c;

    /* renamed from: d */
    TextView f4391d;

    /* renamed from: e */
    float f4392e;

    /* renamed from: f */
    int f4393f;

    /* renamed from: g */
    private int f4394g;

    /* renamed from: h */
    private int f4395h;

    /* renamed from: i */
    private int f4396i;

    /* renamed from: j */
    private boolean f4397j;

    /* renamed from: k */
    private boolean f4398k;

    /* renamed from: l */
    private final C1097d f4399l;

    /* renamed from: m */
    private WeakReference<AbstractC1094a> f4400m;

    /* renamed from: p */
    private int f4401p;

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1098e(textView.getContext()));
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4394g = -1;
        this.f4392e = -1.0f;
        this.f4399l = new C1097d(this);
        TextView textView = new TextView(context);
        this.f4389b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f4390c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f4391d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4386n);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C0577o.m2048a(this.f4389b, resourceId);
            C0577o.m2048a(this.f4390c, resourceId);
            C0577o.m2048a(this.f4391d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            this.f4389b.setTextSize(0, f);
            this.f4390c.setTextSize(0, f);
            this.f4391d.setTextSize(0, f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color2 = obtainStyledAttributes.getColor(2, 0);
            this.f4389b.setTextColor(color2);
            this.f4390c.setTextColor(color2);
            this.f4391d.setTextColor(color2);
        }
        this.f4396i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f4393f = this.f4390c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f4389b.setEllipsize(TextUtils.TruncateAt.END);
        this.f4390c.setEllipsize(TextUtils.TruncateAt.END);
        this.f4391d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f4387o);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f4389b);
            setSingleLineAllCaps(this.f4390c);
            setSingleLineAllCaps(this.f4391d);
        } else {
            this.f4389b.setSingleLine();
            this.f4390c.setSingleLine();
            this.f4391d.setSingleLine();
        }
        this.f4395h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.f4395h = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.f4395h;
    }

    public void setNonPrimaryAlpha(float f) {
        this.f4401p = ((int) (f * 255.0f)) & 255;
        int i = (this.f4401p << 24) | (this.f4393f & 16777215);
        this.f4389b.setTextColor(i);
        this.f4391d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f4393f = i;
        this.f4390c.setTextColor(i);
        int i2 = (this.f4401p << 24) | (this.f4393f & 16777215);
        this.f4389b.setTextColor(i2);
        this.f4391d.setTextColor(i2);
    }

    public void setGravity(int i) {
        this.f4396i = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC1094a adapter = viewPager.getAdapter();
        viewPager.m3697c(this.f4399l);
        viewPager.m3692a((InterfaceC1107n) this.f4399l);
        this.f4388a = viewPager;
        m3659a(this.f4400m != null ? this.f4400m.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4388a != null) {
            m3659a(this.f4388a.getAdapter(), null);
            this.f4388a.m3697c((InterfaceC1108o) null);
            this.f4388a.m3695b((InterfaceC1107n) this.f4399l);
            this.f4388a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3658a(int i) {
        this.f4397j = true;
        this.f4389b.setText((CharSequence) null);
        this.f4390c.setText((CharSequence) null);
        this.f4391d.setText((CharSequence) null);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), RecyclerView.UNDEFINED_DURATION);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), RecyclerView.UNDEFINED_DURATION);
        this.f4389b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4390c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4391d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4394g = i;
        if (!this.f4398k) {
            mo3657a(i, this.f4392e, false);
        }
        this.f4397j = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4397j) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3659a(AbstractC1094a abstractC1094a, AbstractC1094a abstractC1094a2) {
        if (abstractC1094a != null) {
            abstractC1094a.m3701b(this.f4399l);
            this.f4400m = null;
        }
        if (abstractC1094a2 != null) {
            abstractC1094a2.m3700a(this.f4399l);
            this.f4400m = new WeakReference<>(abstractC1094a2);
        }
        if (this.f4388a != null) {
            this.f4394g = -1;
            this.f4392e = -1.0f;
            m3658a(this.f4388a.getCurrentItem());
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3657a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i != this.f4394g) {
            this.f4388a.getAdapter();
            m3658a(i);
        } else if (!z && f == this.f4392e) {
            return;
        }
        this.f4398k = true;
        int measuredWidth = this.f4389b.getMeasuredWidth();
        int measuredWidth2 = this.f4390c.getMeasuredWidth();
        int measuredWidth3 = this.f4391d.getMeasuredWidth();
        int i5 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = paddingRight + i5;
        int i7 = (width - (paddingLeft + i5)) - i6;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i8 = ((width - i6) - ((int) (i7 * f2))) - i5;
        int i9 = measuredWidth2 + i8;
        int baseline = this.f4389b.getBaseline();
        int baseline2 = this.f4390c.getBaseline();
        int baseline3 = this.f4391d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i10 = max - baseline;
        int i11 = max - baseline2;
        int i12 = max - baseline3;
        int max2 = Math.max(Math.max(this.f4389b.getMeasuredHeight() + i10, this.f4390c.getMeasuredHeight() + i11), this.f4391d.getMeasuredHeight() + i12);
        int i13 = this.f4396i & 112;
        if (i13 == 16) {
            int i14 = (((height - paddingTop) - paddingBottom) - max2) / 2;
            i2 = i10 + i14;
            i3 = i11 + i14;
            i4 = i14 + i12;
        } else if (i13 != 80) {
            i2 = i10 + paddingTop;
            i3 = i11 + paddingTop;
            i4 = paddingTop + i12;
        } else {
            int i15 = (height - paddingBottom) - max2;
            i2 = i10 + i15;
            i3 = i11 + i15;
            i4 = i15 + i12;
        }
        this.f4390c.layout(i8, i3, i9, this.f4390c.getMeasuredHeight() + i3);
        int min = Math.min(paddingLeft, (i8 - this.f4395h) - measuredWidth);
        this.f4389b.layout(min, i2, measuredWidth + min, this.f4389b.getMeasuredHeight() + i2);
        int max3 = Math.max((width - paddingRight) - measuredWidth3, i9 + this.f4395h);
        this.f4391d.layout(max3, i4, max3 + measuredWidth3, this.f4391d.getMeasuredHeight() + i4);
        this.f4392e = f;
        this.f4398k = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f4389b.measure(childMeasureSpec2, childMeasureSpec);
        this.f4390c.measure(childMeasureSpec2, childMeasureSpec);
        this.f4391d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(getMinHeight(), this.f4390c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.f4390c.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f4388a != null) {
            mo3657a(this.f4394g, this.f4392e >= 0.0f ? this.f4392e : 0.0f, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
