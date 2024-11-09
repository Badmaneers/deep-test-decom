package color.support.design.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;
import com.color.support.util.C1339d;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.h */
/* loaded from: classes.dex */
public final class C1179h extends LinearLayout {

    /* renamed from: a */
    int f4773a;

    /* renamed from: b */
    float f4774b;

    /* renamed from: c */
    final /* synthetic */ ColorTabLayout f4775c;

    /* renamed from: d */
    private int f4776d;

    /* renamed from: e */
    private final Paint f4777e;

    /* renamed from: f */
    private int f4778f;

    /* renamed from: g */
    private int f4779g;

    /* renamed from: h */
    private int f4780h;

    /* renamed from: i */
    private ValueAnimator f4781i;

    /* renamed from: j */
    private int f4782j;

    /* renamed from: k */
    private int f4783k;

    /* renamed from: l */
    private int f4784l;

    /* renamed from: m */
    private final Paint f4785m;

    /* renamed from: n */
    private boolean f4786n;

    /* renamed from: o */
    private float f4787o;

    /* renamed from: p */
    private int f4788p;

    /* renamed from: a */
    public static /* synthetic */ float m3888a(C1179h c1179h, float f) {
        c1179h.f4787o = f;
        return f;
    }

    /* renamed from: a */
    public static /* synthetic */ int m3889a(C1179h c1179h, int i) {
        c1179h.f4782j = i;
        return i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m3891a(C1179h c1179h) {
        c1179h.m3894b();
    }

    /* renamed from: b */
    public static /* synthetic */ int m3893b(C1179h c1179h, int i) {
        c1179h.f4783k = i;
        return i;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m3895b(C1179h c1179h) {
        c1179h.f4786n = false;
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ int m3897c(C1179h c1179h, int i) {
        c1179h.f4784l = i;
        return i;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m3898c(C1179h c1179h) {
        return c1179h.f4786n;
    }

    /* renamed from: d */
    public static /* synthetic */ int m3900d(C1179h c1179h, int i) {
        c1179h.f4788p = i;
        return i;
    }

    /* renamed from: d */
    public static /* synthetic */ Paint m3901d(C1179h c1179h) {
        return c1179h.f4785m;
    }

    /* renamed from: e */
    public static /* synthetic */ int m3902e(C1179h c1179h) {
        return c1179h.f4783k;
    }

    /* renamed from: f */
    public static /* synthetic */ int m3903f(C1179h c1179h) {
        return c1179h.f4782j;
    }

    /* renamed from: g */
    public static /* synthetic */ int m3904g(C1179h c1179h) {
        return c1179h.f4784l;
    }

    /* renamed from: h */
    public static /* synthetic */ Paint m3905h(C1179h c1179h) {
        return c1179h.f4777e;
    }

    /* renamed from: i */
    public static /* synthetic */ int m3906i(C1179h c1179h) {
        return c1179h.f4780h;
    }

    /* renamed from: j */
    public static /* synthetic */ int m3907j(C1179h c1179h) {
        return c1179h.f4779g;
    }

    /* renamed from: k */
    public static /* synthetic */ int m3908k(C1179h c1179h) {
        return c1179h.f4776d;
    }

    /* renamed from: l */
    public static /* synthetic */ float m3909l(C1179h c1179h) {
        return c1179h.f4787o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1179h(ColorTabLayout colorTabLayout, Context context) {
        super(context);
        this.f4775c = colorTabLayout;
        this.f4773a = -1;
        this.f4778f = -1;
        this.f4779g = -1;
        this.f4780h = -1;
        this.f4788p = -1;
        setWillNotDraw(false);
        this.f4777e = new Paint();
        this.f4785m = new Paint();
        setGravity(17);
    }

    /* renamed from: a */
    public final void m3910a(int i) {
        this.f4777e.setColor(i);
        C0538w.m1874f(this.f4775c);
    }

    /* renamed from: b */
    public final void m3913b(int i) {
        if (this.f4776d != i) {
            this.f4776d = i;
            C0538w.m1874f(this.f4775c);
        }
    }

    /* renamed from: a */
    public final void m3911a(int i, float f) {
        if (this.f4781i != null && this.f4781i.isRunning()) {
            this.f4781i.cancel();
        }
        this.f4773a = i;
        this.f4774b = f;
        m3894b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.f4778f == i) {
            return;
        }
        requestLayout();
        this.f4778f = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        TextView textView;
        TextView textView2;
        int i21;
        TextView textView3;
        TextView textView4;
        int i22;
        TextView textView5;
        float f2;
        TextView textView6;
        TextView textView7;
        if (View.MeasureSpec.getMode(i) == 0) {
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getMode(i);
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i23 = 0;
        if (this.f4775c.f4697k == 1) {
            z = this.f4775c.f4684U;
            if (z) {
                for (int i24 = 0; i24 < childCount; i24++) {
                    C1186o c1186o = (C1186o) getChildAt(i24);
                    textView6 = c1186o.f4823c;
                    if (textView6 != null) {
                        textView7 = c1186o.f4823c;
                        textView7.setTextSize(0, this.f4775c.f4693g);
                    }
                    measureChildWithMargins(c1186o, i, 0, i2, 0);
                }
                int i25 = 0;
                while (i23 < childCount) {
                    View childAt = getChildAt(i23);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    i25 += layoutParams.leftMargin + childAt.getMeasuredWidth() + layoutParams.rightMargin;
                    i23++;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i25, 1073741824), i2);
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870911, RecyclerView.UNDEFINED_DURATION);
            this.f4786n = false;
            f = this.f4775c.f4682S;
            this.f4787o = f;
            int i26 = 0;
            int i27 = 0;
            while (true) {
                if (i26 >= childCount) {
                    break;
                }
                C1186o c1186o2 = (C1186o) getChildAt(i26);
                m3890a(c1186o2, 0, 0, -2);
                textView4 = c1186o2.f4823c;
                if (textView4 != null) {
                    textView5 = c1186o2.f4823c;
                    f2 = this.f4775c.f4683T;
                    textView5.setTextSize(0, f2);
                }
                c1186o2.measure(makeMeasureSpec, i2);
                int measuredWidth = c1186o2.getMeasuredWidth();
                i22 = this.f4775c.f4664A;
                if (measuredWidth > i22) {
                    this.f4786n = true;
                    break;
                } else {
                    i27 += measuredWidth;
                    i26++;
                }
            }
            int i28 = childCount - 1;
            i7 = this.f4775c.f4679P;
            i8 = this.f4775c.f4680Q;
            int i29 = (size - (i7 * i28)) - (i8 * 2);
            if (!this.f4786n && i27 > i29) {
                this.f4786n = true;
            }
            if (this.f4786n) {
                this.f4775c.f4693g = this.f4775c.f4694h;
                for (int i30 = 0; i30 < childCount; i30++) {
                    C1186o c1186o3 = (C1186o) getChildAt(i30);
                    textView = c1186o3.f4823c;
                    if (textView != null) {
                        textView2 = c1186o3.f4823c;
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                        i21 = this.f4775c.f4685V;
                        layoutParams2.height = i21;
                        textView3 = c1186o3.f4823c;
                        textView3.setTextSize(0, this.f4775c.f4694h);
                        this.f4787o = 1.0f;
                    }
                }
                i17 = this.f4775c.f4664A;
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, RecyclerView.UNDEFINED_DURATION);
                i27 = 0;
                for (int i31 = 0; i31 < childCount; i31++) {
                    View childAt2 = getChildAt(i31);
                    childAt2.measure(makeMeasureSpec2, i2);
                    i27 += childAt2.getMeasuredWidth();
                }
                if (i27 > i29) {
                    i18 = this.f4775c.f4679P;
                    int i32 = i18 / 2;
                    for (int i33 = 0; i33 < childCount; i33++) {
                        View childAt3 = getChildAt(i33);
                        if (i33 == 0) {
                            i20 = i32;
                            i19 = 0;
                        } else if (i33 == i28) {
                            i19 = i32;
                            i20 = 0;
                        } else {
                            i19 = i32;
                            i20 = i19;
                        }
                        m3890a(childAt3, i19, i20, childAt3.getMeasuredWidth());
                    }
                }
            }
            int childCount2 = getChildCount();
            int i34 = size - i27;
            int i35 = i34 / (childCount2 + 1);
            i9 = this.f4775c.f4680Q;
            if (i35 < i9) {
                i10 = this.f4775c.f4680Q;
                int i36 = i34 - (i10 * 2);
                int i37 = childCount2 - 1;
                int i38 = (i36 / i37) / 2;
                for (int i39 = 0; i39 < childCount2; i39++) {
                    View childAt4 = getChildAt(i39);
                    if (i39 == 0) {
                        i12 = i38;
                        i11 = 0;
                    } else if (i39 == i37) {
                        i11 = i38;
                        i12 = 0;
                    } else {
                        i11 = i38;
                        i12 = i11;
                    }
                    m3890a(childAt4, i11, i12, childAt4.getMeasuredWidth());
                }
            } else {
                int i40 = i35 / 2;
                for (int i41 = 0; i41 < childCount2; i41++) {
                    View childAt5 = getChildAt(i41);
                    if (i41 == 0) {
                        i16 = this.f4775c.f4680Q;
                        i13 = i35 - i16;
                        i14 = i40;
                    } else if (i41 == childCount2 - 1) {
                        i15 = this.f4775c.f4680Q;
                        i14 = i35 - i15;
                        i13 = i40;
                    } else {
                        i13 = i40;
                        i14 = i13;
                    }
                    m3890a(childAt5, i13, i14, childAt5.getMeasuredWidth());
                }
            }
        } else {
            i3 = this.f4775c.f4664A;
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
            i4 = this.f4775c.f4679P;
            int i42 = i4 / 2;
            for (int i43 = 0; i43 < childCount; i43++) {
                View childAt6 = getChildAt(i43);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) childAt6.getLayoutParams();
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams3.setMarginStart(0);
                    layoutParams3.setMarginEnd(0);
                } else {
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
                childAt6.measure(makeMeasureSpec3, i2);
                if (i43 == 0) {
                    i6 = i42;
                    i5 = 0;
                } else if (i43 == childCount - 1) {
                    i5 = i42;
                    i6 = 0;
                } else {
                    i5 = i42;
                    i6 = i5;
                }
                m3890a(childAt6, i5, i6, childAt6.getMeasuredWidth());
            }
        }
        int i44 = 0;
        while (i23 < childCount) {
            View childAt7 = getChildAt(i23);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) childAt7.getLayoutParams();
            i44 += layoutParams4.leftMargin + childAt7.getMeasuredWidth() + layoutParams4.rightMargin;
            i23++;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i44, 1073741824), i2);
    }

    /* renamed from: a */
    private void m3890a(View view, int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i3;
        if (m3892a()) {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i;
        } else {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i2;
        }
    }

    /* renamed from: a */
    private boolean m3892a() {
        return C0538w.m1878h(this) == 1;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4775c.f4684U = true;
        if (this.f4781i != null && this.f4781i.isRunning()) {
            this.f4781i.cancel();
            m3914b(this.f4773a, Math.round((1.0f - this.f4781i.getAnimatedFraction()) * ((float) this.f4781i.getDuration())));
        } else {
            m3894b();
        }
        this.f4775c.m3861a(this.f4773a, 0.0f, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3894b() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.design.widget.C1179h.m3894b():void");
    }

    /* renamed from: c */
    private int m3896c(int i) {
        int width = ((this.f4775c.getWidth() - this.f4775c.getPaddingLeft()) - this.f4775c.getPaddingRight()) - getWidth();
        return (!m3892a() || width <= 0) ? i : i + width;
    }

    /* renamed from: d */
    private int m3899d(int i) {
        int width = ((this.f4775c.getWidth() - this.f4775c.getPaddingLeft()) - this.f4775c.getPaddingRight()) - getWidth();
        return (!m3892a() || width <= 0) ? i : i + width;
    }

    /* renamed from: a */
    public final void m3912a(int i, int i2) {
        int i3 = (i + i2) / 2;
        int i4 = ((int) ((i2 - i) * this.f4787o)) / 2;
        int i5 = i3 - i4;
        int i6 = i3 + i4;
        if (i5 == this.f4779g && i6 == this.f4780h) {
            return;
        }
        this.f4779g = i5;
        this.f4780h = i6;
        C0538w.m1874f(this.f4775c);
    }

    /* renamed from: b */
    public final void m3914b(int i, int i2) {
        TextView textView;
        int i3;
        int i4;
        int i5;
        TextView textView2;
        int i6;
        int i7;
        if (this.f4781i != null && this.f4781i.isRunning()) {
            this.f4781i.cancel();
        }
        boolean z = C0538w.m1878h(this) == 1;
        View childAt = getChildAt(i);
        if (childAt == null) {
            m3894b();
            return;
        }
        C1186o c1186o = (C1186o) childAt;
        C1186o c1186o2 = (C1186o) getChildAt(this.f4775c.getSelectedTabPosition());
        textView = c1186o.f4823c;
        if (textView != null) {
            textView2 = c1186o.f4823c;
            int i8 = this.f4779g;
            int i9 = this.f4780h;
            int left = c1186o.getLeft() + textView2.getLeft();
            i6 = this.f4775c.f4681R;
            int m3896c = m3896c(left - i6);
            int left2 = c1186o.getLeft() + textView2.getRight();
            i7 = this.f4775c.f4681R;
            int m3899d = m3899d(left2 + i7);
            int min = (int) (Math.min(i9 - i8, m3899d - m3896c) * 0.3d);
            int i10 = ((((i9 + i8) / 2) + ((m3896c + m3899d) / 2)) - min) / 2;
            int m3823a = ColorTabLayout.m3823a(i, this.f4773a);
            if (this.f4788p != -1) {
                m3823a = this.f4788p;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4781i = valueAnimator;
            valueAnimator.setDuration(m3823a);
            valueAnimator.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
            valueAnimator.setIntValues(0, 1);
            valueAnimator.addUpdateListener(new C1180i(this, textView2, new ArgbEvaluator(), c1186o2, min, i9, i8, i10, m3899d, m3896c));
            valueAnimator.addListener(new C1181j(this, i));
            valueAnimator.start();
            return;
        }
        int left3 = childAt.getLeft();
        int right = childAt.getRight();
        if (Math.abs(i - this.f4773a) <= 1) {
            i4 = this.f4779g;
            i5 = this.f4780h;
        } else {
            int m3865b = this.f4775c.m3865b(24);
            if (i < this.f4773a) {
                if (!z) {
                    i3 = m3865b + right;
                    i4 = i3;
                }
                i4 = left3 - m3865b;
            } else {
                if (z) {
                    i3 = m3865b + right;
                    i4 = i3;
                }
                i4 = left3 - m3865b;
            }
            i5 = i4;
        }
        if (i4 == left3 && i5 == right) {
            return;
        }
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.f4781i = valueAnimator2;
        valueAnimator2.setInterpolator(C1163a.f4716b);
        valueAnimator2.setDuration(i2);
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        valueAnimator2.addUpdateListener(new C1182k(this, i4, left3, i5, right));
        valueAnimator2.addListener(new C1183l(this, i));
        valueAnimator2.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        C1339d c1339d;
        C1339d c1339d2;
        float f;
        float f2;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        C1339d c1339d3;
        RectF rectF5;
        super.onDraw(canvas);
        for (int i = 0; i < this.f4775c.getTabCount(); i++) {
            C1184m m3859a = this.f4775c.m3859a(i);
            if (m3859a != null && m3859a.m3915a() != 0) {
                c1339d = this.f4775c.f4699n;
                int m4378a = c1339d.m4378a(m3859a.m3915a(), m3859a.m3919b());
                c1339d2 = this.f4775c.f4699n;
                int m4377a = c1339d2.m4377a(m3859a.m3915a());
                int i2 = m3859a.m3915a() == 1 ? m4378a / 2 : this.f4775c.f4686W;
                int i3 = m4377a / 2;
                if (m3892a()) {
                    f = m3859a.f4809b.getX() + i2;
                    f2 = f - m4378a;
                } else {
                    float x = (m3859a.f4809b.getX() + m3859a.f4809b.getWidth()) - i2;
                    f = x + m4378a;
                    f2 = x;
                }
                float y = m3859a.f4809b.getY() - i3;
                rectF = this.f4775c.f4700o;
                rectF.left = f2;
                rectF2 = this.f4775c.f4700o;
                rectF2.top = y;
                rectF3 = this.f4775c.f4700o;
                rectF3.right = f;
                rectF4 = this.f4775c.f4700o;
                rectF4.bottom = m4377a + y;
                c1339d3 = this.f4775c.f4699n;
                int m3915a = m3859a.m3915a();
                int m3919b = m3859a.m3919b();
                rectF5 = this.f4775c.f4700o;
                c1339d3.m4379a(canvas, m3915a, m3919b, rectF5);
            }
        }
    }
}
