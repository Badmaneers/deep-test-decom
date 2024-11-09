package color.support.design.widget;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p023f.C0476g;
import androidx.core.p023f.C0477h;
import androidx.core.p023f.InterfaceC0475f;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.AbstractC1094a;
import androidx.viewpager.widget.ViewPager;
import color.support.p041a.p042a.AbstractC1153a;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1337b;
import com.color.support.util.C1339d;
import com.color.support.util.C1346k;
import java.util.ArrayList;
import java.util.Iterator;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorTabLayout extends HorizontalScrollView {

    /* renamed from: m */
    private static final InterfaceC0475f<C1184m> f4663m = new C0477h(16);

    /* renamed from: A */
    private final int f4664A;

    /* renamed from: B */
    private InterfaceC1177f f4665B;

    /* renamed from: C */
    private final ArrayList<InterfaceC1177f> f4666C;

    /* renamed from: D */
    private InterfaceC1177f f4667D;

    /* renamed from: E */
    private ValueAnimator f4668E;

    /* renamed from: F */
    private ArgbEvaluator f4669F;

    /* renamed from: G */
    private AbstractC1094a f4670G;

    /* renamed from: H */
    private DataSetObserver f4671H;

    /* renamed from: I */
    private C1185n f4672I;

    /* renamed from: J */
    private C1176e f4673J;

    /* renamed from: K */
    private boolean f4674K;

    /* renamed from: L */
    private final InterfaceC0475f<C1186o> f4675L;

    /* renamed from: M */
    private int f4676M;

    /* renamed from: N */
    private int f4677N;

    /* renamed from: O */
    private int f4678O;

    /* renamed from: P */
    private int f4679P;

    /* renamed from: Q */
    private int f4680Q;

    /* renamed from: R */
    private int f4681R;

    /* renamed from: S */
    private float f4682S;

    /* renamed from: T */
    private float f4683T;

    /* renamed from: U */
    private boolean f4684U;

    /* renamed from: V */
    private int f4685V;

    /* renamed from: W */
    private int f4686W;

    /* renamed from: a */
    int f4687a;

    /* renamed from: b */
    int f4688b;

    /* renamed from: c */
    int f4689c;

    /* renamed from: d */
    int f4690d;

    /* renamed from: e */
    int f4691e;

    /* renamed from: f */
    ColorStateList f4692f;

    /* renamed from: g */
    float f4693g;

    /* renamed from: h */
    float f4694h;

    /* renamed from: i */
    final int f4695i;

    /* renamed from: j */
    int f4696j;

    /* renamed from: k */
    int f4697k;

    /* renamed from: l */
    ViewPager f4698l;

    /* renamed from: n */
    private C1339d f4699n;

    /* renamed from: o */
    private RectF f4700o;

    /* renamed from: p */
    private int f4701p;

    /* renamed from: q */
    private int f4702q;

    /* renamed from: r */
    private int f4703r;

    /* renamed from: s */
    private int f4704s;

    /* renamed from: t */
    private int f4705t;

    /* renamed from: u */
    private int f4706u;

    /* renamed from: v */
    private float f4707v;

    /* renamed from: w */
    private final ArrayList<C1184m> f4708w;

    /* renamed from: x */
    private C1184m f4709x;

    /* renamed from: y */
    private final C1179h f4710y;

    /* renamed from: z */
    private final int f4711z;

    public void setTabGravity(int i) {
    }

    public ColorTabLayout(Context context) {
        this(context, null);
    }

    public ColorTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4706u = 0;
        this.f4707v = 0.0f;
        this.f4708w = new ArrayList<>();
        this.f4666C = new ArrayList<>();
        this.f4669F = new ArgbEvaluator();
        this.f4675L = new C0476g(12);
        setHorizontalScrollBarEnabled(false);
        this.f4710y = new C1179h(this, context);
        super.addView(this.f4710y, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorTabLayout, i, 0);
        this.f4710y.m3913b(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabIndicatorHeight, 0));
        this.f4677N = obtainStyledAttributes.getColor(R.styleable.ColorTabLayout_colorTabIndicatorColor, 0);
        this.f4710y.m3910a(this.f4677N);
        setIndicatorBackgroundHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabIndicatorBackgroundHeight, 0));
        setIndicatorBackgroundColor(obtainStyledAttributes.getColor(R.styleable.ColorTabLayout_colorTabIndicatorBackgroundColor, 0));
        setIndicatorBackgroundPaddingLeft(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabIndicatorBackgroundPaddingLeft, 0));
        setIndicatorBackgroundPaddingRight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabIndicatorBackgroundPaddingRight, 0));
        setIndicatorWidthRatio(obtainStyledAttributes.getFloat(R.styleable.ColorTabLayout_colorTabIndicatorWidthRatio, 0.0f));
        this.f4676M = getResources().getDimensionPixelOffset(R.dimen.color_tablayout_default_resize_height);
        this.f4685V = getResources().getDimensionPixelOffset(R.dimen.tablayout_long_text_view_height);
        this.f4679P = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorTabLayout_colorTabMinDivider, (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.f4680Q = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorTabLayout_colorTabMinMargin, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.f4681R = getResources().getDimensionPixelOffset(R.dimen.color_tablayout_indicator_padding);
        C0538w.m1863b(this, this.f4680Q, 0, this.f4680Q, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabPadding, -1);
        this.f4690d = dimensionPixelSize;
        this.f4689c = dimensionPixelSize;
        this.f4688b = dimensionPixelSize;
        this.f4687a = dimensionPixelSize;
        this.f4687a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabPaddingStart, this.f4687a);
        this.f4688b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabPaddingTop, this.f4688b);
        this.f4689c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabPaddingEnd, this.f4689c);
        this.f4690d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabPaddingBottom, this.f4690d);
        this.f4687a = Math.max(0, this.f4687a);
        this.f4688b = Math.max(0, this.f4688b);
        this.f4689c = Math.max(0, this.f4689c);
        this.f4690d = Math.max(0, this.f4690d);
        this.f4691e = obtainStyledAttributes.getResourceId(R.styleable.ColorTabLayout_colorTabTextAppearance, R.style.TextAppearance_Design_ColorTab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f4691e, R.styleable.TextAppearance);
        try {
            this.f4693g = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            this.f4683T = this.f4693g;
            this.f4692f = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(R.styleable.ColorTabLayout_colorTabTextColor)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f4692f = obtainStyledAttributes.getColorStateList(R.styleable.ColorTabLayout_colorTabTextColor);
                } else {
                    this.f4692f = C1346k.m4405a(getResources().getColor(R.color.color_tab_text_color_normal), C1337b.m4374a(getContext(), R.attr.colorTintControlDisabled), C1337b.m4374a(getContext(), R.attr.colorTintControlNormal), C1337b.m4374a(getContext(), R.attr.colorTintControlNormal));
                }
            }
            this.f4678O = C1337b.m4374a(getContext(), R.attr.colorTintControlDisabled);
            if (obtainStyledAttributes.hasValue(R.styleable.ColorTabLayout_colorTabSelectedTextColor)) {
                this.f4692f = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, new int[]{-16842913, -16842910}, EMPTY_STATE_SET}, new int[]{obtainStyledAttributes.getColor(R.styleable.ColorTabLayout_colorTabSelectedTextColor, 0), this.f4678O, this.f4692f.getDefaultColor()});
            }
            this.f4711z = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabMinWidth, -1);
            this.f4664A = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorTabLayout_colorTabMaxWidth, -1);
            this.f4695i = obtainStyledAttributes.getResourceId(R.styleable.ColorTabLayout_colorTabBackground, 0);
            this.f4697k = obtainStyledAttributes.getInt(R.styleable.ColorTabLayout_colorTabMode, 1);
            this.f4696j = obtainStyledAttributes.getInt(R.styleable.ColorTabLayout_colorTabGravity, 0);
            obtainStyledAttributes.recycle();
            this.f4694h = getResources().getDimensionPixelSize(R.dimen.tablayout_small_text_size);
            m3850g();
            this.f4701p = this.f4692f.getDefaultColor();
            this.f4702q = this.f4692f.getColorForState(new int[]{android.R.attr.state_enabled, android.R.attr.state_selected}, C1337b.m4374a(getContext(), R.attr.colorTintControlNormal));
            this.f4703r = Math.abs(Color.red(this.f4702q) - Color.red(this.f4701p));
            this.f4704s = Math.abs(Color.green(this.f4702q) - Color.green(this.f4701p));
            this.f4705t = Math.abs(Color.blue(this.f4702q) - Color.blue(this.f4701p));
            this.f4699n = new C1339d(context, attributeSet, R.styleable.ColorHintRedDot, 0, R.style.Widget_ColorSupport_ColorHintRedDot_Small);
            this.f4700o = new RectF();
            this.f4686W = context.getResources().getDimensionPixelSize(R.dimen.color_dot_horizontal_offset);
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f4710y.m3910a(i);
        this.f4677N = i;
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f4710y.m3913b(i);
    }

    private void setScrollPosition$4867b5c2(int i) {
        m3861a(i, 0.0f, true, true);
    }

    /* renamed from: a */
    public final void m3861a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f4710y.getChildCount()) {
            return;
        }
        if (z2) {
            this.f4710y.m3911a(i, f);
        } else if (this.f4710y.f4773a != getSelectedTabPosition()) {
            this.f4710y.f4773a = getSelectedTabPosition();
            this.f4710y.m3894b();
        }
        if (this.f4668E != null && this.f4668E.isRunning()) {
            this.f4668E.cancel();
        }
        scrollTo(m3833b(i, f), 0);
        if (z) {
            m3825a(round, f);
        }
    }

    private float getScrollPosition() {
        return r1.f4773a + this.f4710y.f4774b;
    }

    /* renamed from: b */
    private void m3837b(C1184m c1184m, boolean z) {
        int size = this.f4708w.size();
        if (c1184m.f4808a != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m3830a(c1184m, size);
        this.f4710y.addView(c1184m.f4809b, c1184m.m3923e(), new LinearLayout.LayoutParams(-2, -2));
        if (z) {
            c1184m.m3925g();
        }
    }

    /* renamed from: a */
    private void m3828a(TabItem tabItem) {
        C1184m m3834b = m3834b();
        if (tabItem.f4712a != null) {
            m3834b.m3917a(tabItem.f4712a);
        }
        if (tabItem.f4713b != null) {
            m3834b.m3916a(tabItem.f4713b);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            m3834b.m3920b(tabItem.getContentDescription());
        }
        m3837b(m3834b, this.f4708w.isEmpty());
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC1177f interfaceC1177f) {
        if (this.f4665B != null) {
            m3836b(this.f4665B);
        }
        this.f4665B = interfaceC1177f;
        if (interfaceC1177f != null) {
            m3829a(interfaceC1177f);
        }
    }

    /* renamed from: a */
    private void m3829a(InterfaceC1177f interfaceC1177f) {
        if (this.f4666C.contains(interfaceC1177f)) {
            return;
        }
        this.f4666C.add(interfaceC1177f);
    }

    /* renamed from: b */
    private void m3836b(InterfaceC1177f interfaceC1177f) {
        this.f4666C.remove(interfaceC1177f);
    }

    /* renamed from: b */
    private C1184m m3834b() {
        C1184m mo1617a = f4663m.mo1617a();
        if (mo1617a == null) {
            mo1617a = new C1184m();
        }
        mo1617a.f4808a = this;
        mo1617a.f4809b = m3835b(mo1617a);
        return mo1617a;
    }

    public int getTabCount() {
        return this.f4708w.size();
    }

    /* renamed from: a */
    public final C1184m m3859a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f4708w.get(i);
    }

    public int getSelectedTabPosition() {
        if (this.f4709x != null) {
            return this.f4709x.m3923e();
        }
        return -1;
    }

    /* renamed from: c */
    private void m3840c() {
        int childCount = this.f4710y.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C1186o c1186o = (C1186o) this.f4710y.getChildAt(childCount);
            this.f4710y.removeViewAt(childCount);
            if (c1186o != null) {
                c1186o.m3934a((C1184m) null);
                c1186o.setSelected(false);
                this.f4675L.mo1618a(c1186o);
            }
            requestLayout();
        }
        Iterator<C1184m> it = this.f4708w.iterator();
        while (it.hasNext()) {
            C1184m next = it.next();
            it.remove();
            next.m3929k();
            f4663m.mo1618a(next);
        }
        this.f4709x = null;
        C1179h.m3895b(this.f4710y);
        this.f4684U = false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4684U = false;
    }

    public void setTabMode(int i) {
        if (i != this.f4697k) {
            this.f4697k = i;
            m3850g();
        }
    }

    public int getTabMode() {
        return this.f4697k;
    }

    public int getTabGravity() {
        return this.f4696j;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f4692f != colorStateList) {
            this.f4692f = colorStateList;
            int size = this.f4708w.size();
            for (int i = 0; i < size; i++) {
                this.f4708w.get(i).m3928j();
            }
        }
    }

    public ColorStateList getTabTextColors() {
        return this.f4692f;
    }

    /* renamed from: a */
    private void m3827a(ViewPager viewPager, boolean z) {
        if (this.f4698l != null) {
            if (this.f4672I != null) {
                this.f4698l.m3696b(this.f4672I);
            }
            if (this.f4673J != null) {
                this.f4698l.m3695b(this.f4673J);
            }
        }
        if (this.f4667D != null) {
            m3836b(this.f4667D);
            this.f4667D = null;
        }
        if (viewPager != null) {
            this.f4698l = viewPager;
            if (this.f4672I == null) {
                this.f4672I = new C1185n(this);
            }
            this.f4672I.m3930a();
            viewPager.m3693a(this.f4672I);
            this.f4667D = new C1187p(viewPager);
            m3829a(this.f4667D);
            if (viewPager.getAdapter() != null) {
                m3862a(viewPager.getAdapter(), true);
            }
            if (this.f4673J == null) {
                this.f4673J = new C1176e(this);
            }
            this.f4673J.m3886a();
            viewPager.m3692a(this.f4673J);
            setScrollPosition$4867b5c2(viewPager.getCurrentItem());
        } else {
            this.f4698l = null;
            m3862a((AbstractC1094a) null, false);
        }
        this.f4674K = z;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1094a abstractC1094a) {
        m3862a(abstractC1094a, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4698l == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m3827a((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4674K) {
            setupWithViewPager(null);
            this.f4674K = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f4710y.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: a */
    public final void m3862a(AbstractC1094a abstractC1094a, boolean z) {
        if (this.f4670G != null && this.f4671H != null) {
            this.f4670G.m3701b(this.f4671H);
        }
        this.f4670G = abstractC1094a;
        if (z && abstractC1094a != null) {
            if (this.f4671H == null) {
                this.f4671H = new C1178g(this);
            }
            abstractC1094a.m3700a(this.f4671H);
        }
        m3860a();
    }

    /* renamed from: a */
    public final void m3860a() {
        int currentItem;
        m3840c();
        if (this.f4670G != null) {
            int m3699a = this.f4670G.m3699a();
            if (this.f4670G instanceof AbstractC1153a) {
                for (int i = 0; i < m3699a; i++) {
                    m3837b(m3834b().m3917a((CharSequence) null), false);
                }
            } else {
                for (int i2 = 0; i2 < m3699a; i2++) {
                    m3837b(m3834b().m3917a((CharSequence) null), false);
                }
            }
            if (this.f4698l == null || m3699a <= 0 || (currentItem = this.f4698l.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m3864a(m3859a(currentItem), true);
        }
    }

    /* renamed from: b */
    private C1186o m3835b(C1184m c1184m) {
        C1186o mo1617a = this.f4675L != null ? this.f4675L.mo1617a() : null;
        if (mo1617a == null) {
            mo1617a = new C1186o(this, getContext());
        }
        mo1617a.m3934a(c1184m);
        mo1617a.setFocusable(true);
        mo1617a.setMinimumWidth(getTabMinWidth());
        return mo1617a;
    }

    /* renamed from: a */
    private void m3830a(C1184m c1184m, int i) {
        c1184m.m3918a(i);
        this.f4708w.add(i, c1184m);
        int size = this.f4708w.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f4708w.get(i).m3918a(i);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m3826a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m3826a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3826a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3826a(view);
    }

    /* renamed from: a */
    private void m3826a(View view) {
        if (view instanceof TabItem) {
            m3828a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: b */
    public final int m3865b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int m3865b = m3865b(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(m3865b, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(m3865b, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            setMeasuredDimension(0, 0);
            return;
        }
        switch (this.f4697k) {
            case 0:
                getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(536870911, RecyclerView.UNDEFINED_DURATION), i2);
                break;
            case 1:
                getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                break;
        }
        if (this.f4710y != null) {
            z = this.f4710y.f4786n;
            if (z) {
                View childAt = getChildAt(0);
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 > this.f4676M) {
                    size2 = this.f4676M;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            }
        }
        setMeasuredDimension(size, getChildAt(0).getMeasuredHeight());
    }

    /* renamed from: c */
    private void m3841c(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C0538w.m1819C(this)) {
            C1179h c1179h = this.f4710y;
            int childCount = c1179h.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (c1179h.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int m3833b = m3833b(i, 0.0f);
                if (scrollX != m3833b) {
                    m3844d();
                    this.f4668E.setIntValues(scrollX, m3833b);
                    this.f4668E.start();
                }
                this.f4710y.m3914b(i, ResponseCode.CODE_3XX_MULTIPLE_CHOICES);
                return;
            }
        }
        setScrollPosition$4867b5c2(i);
    }

    /* renamed from: d */
    private void m3844d() {
        if (this.f4668E == null) {
            this.f4668E = new ValueAnimator();
            this.f4668E.setInterpolator(C1163a.f4716b);
            this.f4668E.setDuration(300L);
            this.f4668E.addUpdateListener(new C1175d(this));
        }
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m3844d();
        this.f4668E.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f4710y.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f4710y.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private void m3825a(int i, float f) {
        TextView textView;
        C1186o c1186o;
        float f2;
        TextView textView2;
        TextView textView3;
        if (Math.abs(f - this.f4707v) > 0.5d || f == 0.0f) {
            this.f4706u = i;
        }
        this.f4707v = f;
        if (i != this.f4706u) {
            C1186o c1186o2 = (C1186o) this.f4710y.getChildAt(i);
            if (f >= 0.5f) {
                c1186o = (C1186o) this.f4710y.getChildAt(i - 1);
                f2 = (f - 0.5f) / 0.5f;
            } else {
                c1186o = (C1186o) this.f4710y.getChildAt(i + 1);
                f2 = (0.5f - f) / 0.5f;
            }
            textView2 = c1186o.f4823c;
            textView2.setTextColor(((Integer) this.f4669F.evaluate(f2, Integer.valueOf(this.f4702q), Integer.valueOf(this.f4701p))).intValue());
            textView3 = c1186o2.f4823c;
            textView3.setTextColor(((Integer) this.f4669F.evaluate(f2, Integer.valueOf(this.f4701p), Integer.valueOf(this.f4702q))).intValue());
        }
        if (f != 0.0f || i >= getTabCount()) {
            return;
        }
        int i2 = 0;
        while (i2 < getTabCount()) {
            View childAt = this.f4710y.getChildAt(i2);
            textView = ((C1186o) childAt).f4823c;
            textView.setTextColor(this.f4692f);
            childAt.setSelected(i2 == i);
            i2++;
        }
    }

    /* renamed from: a */
    public final void m3863a(C1184m c1184m) {
        m3864a(c1184m, true);
    }

    /* renamed from: a */
    public final void m3864a(C1184m c1184m, boolean z) {
        C1184m c1184m2 = this.f4709x;
        if (c1184m2 == c1184m) {
            if (c1184m2 != null) {
                m3848f();
                return;
            }
            return;
        }
        int m3923e = c1184m != null ? c1184m.m3923e() : -1;
        if (z) {
            if ((c1184m2 == null || c1184m2.m3923e() == -1) && m3923e != -1) {
                setScrollPosition$4867b5c2(m3923e);
            } else {
                m3841c(m3923e);
            }
            if (m3923e != -1) {
                setSelectedTabView(m3923e);
            }
            this.f4706u = m3923e;
        }
        if (c1184m2 != null) {
            m3846e();
        }
        this.f4709x = c1184m;
        if (c1184m != null) {
            m3842c(c1184m);
        }
    }

    /* renamed from: c */
    private void m3842c(C1184m c1184m) {
        for (int size = this.f4666C.size() - 1; size >= 0; size--) {
            this.f4666C.get(size).mo3887a(c1184m);
        }
    }

    /* renamed from: e */
    private void m3846e() {
        for (int size = this.f4666C.size() - 1; size >= 0; size--) {
            this.f4666C.get(size);
        }
    }

    /* renamed from: f */
    private void m3848f() {
        for (int size = this.f4666C.size() - 1; size >= 0; size--) {
            this.f4666C.get(size);
        }
    }

    /* renamed from: b */
    private int m3833b(int i, float f) {
        int i2;
        int i3 = 0;
        if (getWidth() == 0) {
            return 0;
        }
        View childAt = this.f4710y.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f4710y.getChildCount() ? this.f4710y.getChildAt(i4) : null;
        if (childAt != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i2 = layoutParams.rightMargin + childAt.getWidth() + layoutParams.leftMargin;
        } else {
            i2 = 0;
        }
        if (childAt2 != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            i3 = layoutParams2.rightMargin + childAt2.getWidth() + layoutParams2.leftMargin;
        }
        int width = (i2 / 2) - (getWidth() / 2);
        if (childAt != null) {
            width += childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin;
        }
        int i5 = (int) ((i2 + i3) * 0.5f * f);
        return C0538w.m1878h(this) == 0 ? width + i5 : width - i5;
    }

    /* renamed from: g */
    private void m3850g() {
        C1179h.m3895b(this.f4710y);
        m3852h();
    }

    /* renamed from: h */
    private void m3852h() {
        for (int i = 0; i < this.f4710y.getChildCount(); i++) {
            View childAt = this.f4710y.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            C0538w.m1863b(childAt, this.f4687a, this.f4688b, this.f4689c, this.f4690d);
            childAt.requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Paint paint4;
        int i6;
        int i7;
        int i8;
        Paint paint5;
        super.dispatchDraw(canvas);
        if (this.f4710y != null) {
            paint = this.f4710y.f4785m;
            if (paint != null) {
                i6 = this.f4710y.f4783k;
                float scrollX = i6 + getScrollX();
                int height = getHeight();
                i7 = this.f4710y.f4782j;
                float f = height - i7;
                int width = getWidth() + getScrollX();
                i8 = this.f4710y.f4784l;
                float height2 = getHeight();
                paint5 = this.f4710y.f4785m;
                canvas.drawRect(scrollX, f, width - i8, height2, paint5);
            }
            paint2 = this.f4710y.f4777e;
            if (paint2 != null) {
                paint3 = this.f4710y.f4777e;
                canvas.drawText(" ", 0.0f, 0.0f, paint3);
                i = this.f4710y.f4780h;
                i2 = this.f4710y.f4779g;
                if (i > i2) {
                    int paddingLeft = getPaddingLeft();
                    i3 = this.f4710y.f4779g;
                    int i9 = paddingLeft + i3;
                    int paddingLeft2 = getPaddingLeft();
                    i4 = this.f4710y.f4780h;
                    int i10 = paddingLeft2 + i4;
                    int scrollX2 = (getScrollX() + getPaddingLeft()) - this.f4681R;
                    int scrollX3 = ((getScrollX() + getWidth()) - getPaddingRight()) + this.f4681R;
                    boolean z = false;
                    if (i10 > scrollX2 && i9 < scrollX3) {
                        z = true;
                    }
                    if (z) {
                        if (i9 < scrollX2) {
                            i9 = scrollX2;
                        }
                        if (i10 > scrollX3) {
                            i10 = scrollX3;
                        }
                        float f2 = i9;
                        int height3 = getHeight();
                        i5 = this.f4710y.f4776d;
                        float height4 = getHeight();
                        paint4 = this.f4710y.f4777e;
                        canvas.drawRect(f2, height3 - i5, i10, height4, paint4);
                    }
                }
            }
        }
    }

    private int getDefaultHeight() {
        int size = this.f4708w.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C1184m c1184m = this.f4708w.get(i);
                if (c1184m != null && c1184m.m3922d() != null && !TextUtils.isEmpty(c1184m.m3924f())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z ? 72 : 48;
    }

    private int getTabMinWidth() {
        if (this.f4711z != -1) {
            return this.f4711z;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setIndicatorBackgroundHeight(int i) {
        if (this.f4710y == null) {
            return;
        }
        this.f4710y.f4782j = i;
    }

    public void setIndicatorBackgroundColor(int i) {
        Paint paint;
        if (this.f4710y == null) {
            return;
        }
        paint = this.f4710y.f4785m;
        paint.setColor(i);
    }

    public void setIndicatorBackgroundPaddingLeft(int i) {
        if (this.f4710y == null) {
            return;
        }
        this.f4710y.f4783k = i;
    }

    public void setIndicatorBackgroundPaddingRight(int i) {
        if (this.f4710y == null) {
            return;
        }
        this.f4710y.f4784l = i;
    }

    public void setTabTextSize(float f) {
        if (this.f4710y != null) {
            if (this.f4710y == null ? false : this.f4710y.f4786n) {
                this.f4683T = f;
                this.f4693g = f;
            } else if (this.f4683T <= 0.0f) {
                this.f4683T = f;
                this.f4693g = f;
            } else if (f <= this.f4683T) {
                this.f4693g = f;
            }
        }
    }

    public float getTabTextSize() {
        return this.f4693g;
    }

    public int getIndicatorBackgroundHeight() {
        int i;
        if (this.f4710y == null) {
            return -1;
        }
        i = this.f4710y.f4782j;
        return i;
    }

    public void setIndicatorWidthRatio(float f) {
        if (this.f4710y == null) {
            return;
        }
        this.f4682S = f;
        this.f4710y.f4787o = f;
    }

    public int getIndicatorBackgroundPaddingLeft() {
        int i;
        if (this.f4710y == null) {
            return -1;
        }
        i = this.f4710y.f4783k;
        return i;
    }

    public int getIndicatorBackgroundPaddingRight() {
        int i;
        if (this.f4710y == null) {
            return -1;
        }
        i = this.f4710y.f4784l;
        return i;
    }

    public float getIndicatorWidthRatio() {
        float f;
        if (this.f4710y == null) {
            return -1.0f;
        }
        f = this.f4710y.f4787o;
        return f;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f4710y.m3910a(z ? this.f4677N : getContext().getResources().getColor(R.color.colorTabIndicatorDisableColor));
        for (int i = 0; i < getTabCount(); i++) {
            C1184m m3859a = m3859a(i);
            if (m3859a != null && m3859a.f4809b != null) {
                m3859a.f4809b.setEnabled(z);
            }
        }
    }

    public void setIndicatorAnimTime(int i) {
        if (this.f4710y != null) {
            this.f4710y.f4788p = i;
        }
    }

    /* renamed from: a */
    public static int m3823a(int i, int i2) {
        return Math.min(ResponseCode.CODE_3XX_MULTIPLE_CHOICES, (Math.abs(i - i2) * 50) + 150);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m3827a(viewPager, false);
    }
}
