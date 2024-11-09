package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.widget.C0287dy;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p023f.C0476g;
import androidx.core.p023f.C0477h;
import androidx.core.p023f.InterfaceC0475f;
import androidx.core.p024g.C0525j;
import androidx.core.p024g.C0536u;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.C0484e;
import androidx.core.p024g.p025a.C0485f;
import androidx.core.widget.C0577o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.AbstractC1094a;
import androidx.viewpager.widget.InterfaceC1103j;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C2065b;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.theme.p084a.C2402a;
import java.util.ArrayList;
import java.util.Iterator;
import neton.client.Utils.ResponseCode;

@InterfaceC1103j
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: x */
    private static final int f10343x = R.style.Widget_Design_TabLayout;

    /* renamed from: y */
    private static final InterfaceC0475f<C2358i> f10344y = new C0477h(16);

    /* renamed from: A */
    private C2358i f10345A;

    /* renamed from: B */
    private final RectF f10346B;

    /* renamed from: C */
    private final int f10347C;

    /* renamed from: D */
    private final int f10348D;

    /* renamed from: E */
    private final int f10349E;

    /* renamed from: F */
    private int f10350F;

    /* renamed from: G */
    private InterfaceC2352c f10351G;

    /* renamed from: H */
    private final ArrayList<InterfaceC2352c> f10352H;

    /* renamed from: I */
    private InterfaceC2352c f10353I;

    /* renamed from: J */
    private ValueAnimator f10354J;

    /* renamed from: K */
    private AbstractC1094a f10355K;

    /* renamed from: L */
    private DataSetObserver f10356L;

    /* renamed from: M */
    private C2359j f10357M;

    /* renamed from: N */
    private C2351b f10358N;

    /* renamed from: O */
    private boolean f10359O;

    /* renamed from: P */
    private final InterfaceC0475f<TabView> f10360P;

    /* renamed from: a */
    final C2355f f10361a;

    /* renamed from: b */
    int f10362b;

    /* renamed from: c */
    int f10363c;

    /* renamed from: d */
    int f10364d;

    /* renamed from: e */
    int f10365e;

    /* renamed from: f */
    int f10366f;

    /* renamed from: g */
    ColorStateList f10367g;

    /* renamed from: h */
    ColorStateList f10368h;

    /* renamed from: i */
    ColorStateList f10369i;

    /* renamed from: j */
    Drawable f10370j;

    /* renamed from: k */
    PorterDuff.Mode f10371k;

    /* renamed from: l */
    float f10372l;

    /* renamed from: m */
    float f10373m;

    /* renamed from: n */
    final int f10374n;

    /* renamed from: o */
    int f10375o;

    /* renamed from: p */
    int f10376p;

    /* renamed from: q */
    int f10377q;

    /* renamed from: r */
    int f10378r;

    /* renamed from: s */
    int f10379s;

    /* renamed from: t */
    boolean f10380t;

    /* renamed from: u */
    boolean f10381u;

    /* renamed from: v */
    boolean f10382v;

    /* renamed from: w */
    ViewPager f10383w;

    /* renamed from: z */
    private final ArrayList<C2358i> f10384z;

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f10343x), attributeSet, i);
        this.f10384z = new ArrayList<>();
        this.f10346B = new RectF();
        this.f10375o = Integer.MAX_VALUE;
        this.f10352H = new ArrayList<>();
        this.f10360P = new C0476g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        this.f10361a = new C2355f(this, context2);
        super.addView(this.f10361a, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.TabLayout, i, f10343x, R.styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C2295h c2295h = new C2295h();
            c2295h.m7282g(ColorStateList.valueOf(colorDrawable.getColor()));
            c2295h.m7276a(context2);
            c2295h.m7288r(C0538w.m1888q(this));
            C0538w.m1846a(this, c2295h);
        }
        this.f10361a.m7530b(m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        this.f10361a.m7527a(m7095a.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C2221d.m7047b(context2, m7095a, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(m7095a.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(m7095a.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.f10365e = dimensionPixelSize;
        this.f10364d = dimensionPixelSize;
        this.f10363c = dimensionPixelSize;
        this.f10362b = dimensionPixelSize;
        this.f10362b = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, this.f10362b);
        this.f10363c = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.f10363c);
        this.f10364d = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.f10364d);
        this.f10365e = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.f10365e);
        this.f10366f = m7095a.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(this.f10366f, androidx.appcompat.R.styleable.TextAppearance);
        try {
            this.f10372l = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.f10367g = C2221d.m7045a(context2, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (m7095a.hasValue(R.styleable.TabLayout_tabTextColor)) {
                this.f10367g = C2221d.m7045a(context2, m7095a, R.styleable.TabLayout_tabTextColor);
            }
            if (m7095a.hasValue(R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f10367g = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{m7095a.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0), this.f10367g.getDefaultColor()});
            }
            this.f10368h = C2221d.m7045a(context2, m7095a, R.styleable.TabLayout_tabIconTint);
            this.f10371k = C2250as.m7109a(m7095a.getInt(R.styleable.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.f10369i = C2221d.m7045a(context2, m7095a, R.styleable.TabLayout_tabRippleColor);
            this.f10377q = m7095a.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, ResponseCode.CODE_3XX_MULTIPLE_CHOICES);
            this.f10347C = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.f10348D = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.f10374n = m7095a.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.f10350F = m7095a.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.f10379s = m7095a.getInt(R.styleable.TabLayout_tabMode, 1);
            this.f10376p = m7095a.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.f10380t = m7095a.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.f10382v = m7095a.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            m7095a.recycle();
            Resources resources = getResources();
            this.f10373m = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f10349E = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m7491i();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f10361a.m7527a(i);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f10361a.m7530b(i);
    }

    private void setScrollPosition$4867b5c2(int i) {
        m7494a(i, 0.0f, true, true);
    }

    /* renamed from: a */
    public final void m7494a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f10361a.getChildCount()) {
            return;
        }
        if (z2) {
            this.f10361a.m7528a(i, f);
        }
        if (this.f10354J != null && this.f10354J.isRunning()) {
            this.f10354J.cancel();
        }
        scrollTo(m7470a(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    /* renamed from: b */
    private void m7482b(C2358i c2358i, boolean z) {
        int size = this.f10384z.size();
        if (c2358i.f10417a != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m7477a(c2358i, size);
        TabView tabView = c2358i.f10418b;
        tabView.setSelected(false);
        tabView.setActivated(false);
        C2355f c2355f = this.f10361a;
        int m7542c = c2358i.m7542c();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m7473a(layoutParams);
        c2355f.addView(tabView, m7542c, layoutParams);
        if (z) {
            c2358i.m7545f();
        }
    }

    /* renamed from: a */
    private void m7475a(TabItem tabItem) {
        C2358i m7479b = m7479b();
        if (tabItem.f10340a != null) {
            m7479b.m7538a(tabItem.f10340a);
        }
        if (tabItem.f10341b != null) {
            m7479b.m7536a(tabItem.f10341b);
        }
        if (tabItem.f10342c != 0) {
            m7479b.m7537a(LayoutInflater.from(m7479b.f10418b.getContext()).inflate(tabItem.f10342c, (ViewGroup) m7479b.f10418b, false));
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            m7479b.m7541b(tabItem.getContentDescription());
        }
        m7482b(m7479b, this.f10384z.isEmpty());
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2353d interfaceC2353d) {
        setOnTabSelectedListener((InterfaceC2352c) interfaceC2353d);
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2352c interfaceC2352c) {
        if (this.f10351G != null) {
            m7481b(this.f10351G);
        }
        this.f10351G = interfaceC2352c;
        if (interfaceC2352c != null) {
            m7476a(interfaceC2352c);
        }
    }

    @Deprecated
    /* renamed from: a */
    private void m7476a(InterfaceC2352c interfaceC2352c) {
        if (this.f10352H.contains(interfaceC2352c)) {
            return;
        }
        this.f10352H.add(interfaceC2352c);
    }

    @Deprecated
    /* renamed from: b */
    private void m7481b(InterfaceC2352c interfaceC2352c) {
        this.f10352H.remove(interfaceC2352c);
    }

    /* renamed from: b */
    private C2358i m7479b() {
        C2358i m7483c = m7483c();
        m7483c.f10417a = this;
        m7483c.f10418b = m7478b(m7483c);
        return m7483c;
    }

    /* renamed from: c */
    private static C2358i m7483c() {
        C2358i mo1617a = f10344y.mo1617a();
        return mo1617a == null ? new C2358i() : mo1617a;
    }

    public int getTabCount() {
        return this.f10384z.size();
    }

    /* renamed from: a */
    public final C2358i m7492a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f10384z.get(i);
    }

    public int getSelectedTabPosition() {
        if (this.f10345A != null) {
            return this.f10345A.m7542c();
        }
        return -1;
    }

    /* renamed from: d */
    private void m7486d() {
        int childCount = this.f10361a.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) this.f10361a.getChildAt(childCount);
            this.f10361a.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f10360P.mo1618a(tabView);
            }
            requestLayout();
        }
        Iterator<C2358i> it = this.f10384z.iterator();
        while (it.hasNext()) {
            C2358i next = it.next();
            it.remove();
            next.m7548i();
            f10344y.mo1618a(next);
        }
        this.f10345A = null;
    }

    public void setTabMode(int i) {
        if (i != this.f10379s) {
            this.f10379s = i;
            m7491i();
        }
    }

    public int getTabMode() {
        return this.f10379s;
    }

    public void setTabGravity(int i) {
        if (this.f10376p != i) {
            this.f10376p = i;
            m7491i();
        }
    }

    public int getTabGravity() {
        return this.f10376p;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f10378r != i) {
            this.f10378r = i;
            C0538w.m1874f(this.f10361a);
        }
    }

    public int getTabIndicatorGravity() {
        return this.f10378r;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f10381u = z;
        C0538w.m1874f(this.f10361a);
    }

    public void setInlineLabel(boolean z) {
        if (this.f10380t != z) {
            this.f10380t = z;
            for (int i = 0; i < this.f10361a.getChildCount(); i++) {
                View childAt = this.f10361a.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m7519b();
                }
            }
            m7491i();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f10382v != z) {
            this.f10382v = z;
            for (int i = 0; i < this.f10361a.getChildCount(); i++) {
                View childAt = this.f10361a.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m7499a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f10367g != colorStateList) {
            this.f10367g = colorStateList;
            m7487e();
        }
    }

    public ColorStateList getTabTextColors() {
        return this.f10367g;
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f10368h != colorStateList) {
            this.f10368h = colorStateList;
            m7487e();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C0057a.m45a(getContext(), i));
    }

    public ColorStateList getTabIconTint() {
        return this.f10368h;
    }

    public ColorStateList getTabRippleColor() {
        return this.f10369i;
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f10369i != colorStateList) {
            this.f10369i = colorStateList;
            for (int i = 0; i < this.f10361a.getChildCount(); i++) {
                View childAt = this.f10361a.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m7499a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C0057a.m45a(getContext(), i));
    }

    public Drawable getTabSelectedIndicator() {
        return this.f10370j;
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f10370j != drawable) {
            this.f10370j = drawable;
            C0538w.m1874f(this.f10361a);
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C0057a.m46b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* renamed from: a */
    private void m7474a(ViewPager viewPager, boolean z) {
        if (this.f10383w != null) {
            if (this.f10357M != null) {
                this.f10383w.m3696b(this.f10357M);
            }
            if (this.f10358N != null) {
                this.f10383w.m3695b(this.f10358N);
            }
        }
        if (this.f10353I != null) {
            m7481b(this.f10353I);
            this.f10353I = null;
        }
        if (viewPager != null) {
            this.f10383w = viewPager;
            if (this.f10357M == null) {
                this.f10357M = new C2359j(this);
            }
            this.f10357M.m7549a();
            viewPager.m3693a(this.f10357M);
            this.f10353I = new C2361l(viewPager);
            m7476a(this.f10353I);
            AbstractC1094a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m7495a(adapter, true);
            }
            if (this.f10358N == null) {
                this.f10358N = new C2351b(this);
            }
            this.f10358N.m7520a();
            viewPager.m3692a(this.f10358N);
            setScrollPosition$4867b5c2(viewPager.getCurrentItem());
        } else {
            this.f10383w = null;
            m7495a((AbstractC1094a) null, false);
        }
        this.f10359O = z;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1094a abstractC1094a) {
        m7495a(abstractC1094a, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7293a(this);
        if (this.f10383w == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m7474a((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10359O) {
            setupWithViewPager(null);
            this.f10359O = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f10361a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: a */
    public final void m7495a(AbstractC1094a abstractC1094a, boolean z) {
        if (this.f10355K != null && this.f10356L != null) {
            this.f10355K.m3701b(this.f10356L);
        }
        this.f10355K = abstractC1094a;
        if (z && abstractC1094a != null) {
            if (this.f10356L == null) {
                this.f10356L = new C2354e(this);
            }
            abstractC1094a.m3700a(this.f10356L);
        }
        m7493a();
    }

    /* renamed from: a */
    public final void m7493a() {
        int currentItem;
        m7486d();
        if (this.f10355K != null) {
            int m3699a = this.f10355K.m3699a();
            for (int i = 0; i < m3699a; i++) {
                m7482b(m7479b().m7538a((CharSequence) null), false);
            }
            if (this.f10383w == null || m3699a <= 0 || (currentItem = this.f10383w.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m7497a(m7492a(currentItem), true);
        }
    }

    /* renamed from: e */
    private void m7487e() {
        int size = this.f10384z.size();
        for (int i = 0; i < size; i++) {
            this.f10384z.get(i).m7547h();
        }
    }

    /* renamed from: b */
    private TabView m7478b(C2358i c2358i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TabView mo1617a = this.f10360P != null ? this.f10360P.mo1617a() : null;
        if (mo1617a == null) {
            mo1617a = new TabView(getContext());
        }
        mo1617a.setTab(c2358i);
        mo1617a.setFocusable(true);
        mo1617a.setMinimumWidth(getTabMinWidth());
        charSequence = c2358i.f10422f;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence3 = c2358i.f10421e;
            mo1617a.setContentDescription(charSequence3);
        } else {
            charSequence2 = c2358i.f10422f;
            mo1617a.setContentDescription(charSequence2);
        }
        return mo1617a;
    }

    /* renamed from: a */
    private void m7477a(C2358i c2358i, int i) {
        c2358i.m7539a(i);
        this.f10384z.add(i, c2358i);
        int size = this.f10384z.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f10384z.get(i).m7539a(i);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m7472a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m7472a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m7472a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m7472a(view);
    }

    /* renamed from: a */
    private void m7472a(View view) {
        if (view instanceof TabItem) {
            m7475a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: a */
    private void m7473a(LinearLayout.LayoutParams layoutParams) {
        if (this.f10379s == 1 && this.f10376p == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2299l.m7294a(this, f);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0482c.m1635a(accessibilityNodeInfo).m1653a(C0484e.m1714a(1, getTabCount(), 1));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f10361a.getChildCount(); i++) {
            View childAt = this.f10361a.getChildAt(i);
            if (childAt instanceof TabView) {
                TabView.m7503a((TabView) childAt, canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:            if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:            r5 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:            if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L61;     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C2250as.m7108a(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r4) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r5)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L61
            int r1 = r6.f10348D
            if (r1 <= 0) goto L52
            int r0 = r6.f10348D
            goto L5f
        L52:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C2250as.m7108a(r1, r2)
            float r0 = r0 - r1
            int r0 = (int) r0
        L5f:
            r6.f10375o = r0
        L61:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r4) goto Lab
            android.view.View r7 = r6.getChildAt(r5)
            int r0 = r6.f10379s
            switch(r0) {
                case 0: goto L80;
                case 1: goto L74;
                case 2: goto L80;
                default: goto L73;
            }
        L73:
            goto L8b
        L74:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8b
        L7e:
            r5 = r4
            goto L8b
        L80:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8b
            goto L7e
        L8b:
            if (r5 == 0) goto Lab
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = getChildMeasureSpec(r8, r0, r1)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            r7.measure(r6, r8)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    private void m7480b(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C0538w.m1819C(this)) {
            C2355f c2355f = this.f10361a;
            int childCount = c2355f.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (c2355f.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int m7470a = m7470a(i, 0.0f);
                if (scrollX != m7470a) {
                    m7488f();
                    this.f10354J.setIntValues(scrollX, m7470a);
                    this.f10354J.start();
                }
                this.f10361a.m7531b(i, this.f10377q);
                return;
            }
        }
        setScrollPosition$4867b5c2(i);
    }

    /* renamed from: f */
    private void m7488f() {
        if (this.f10354J == null) {
            this.f10354J = new ValueAnimator();
            this.f10354J.setInterpolator(C2032a.f8974b);
            this.f10354J.setDuration(this.f10377q);
            this.f10354J.addUpdateListener(new C2350a(this));
        }
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m7488f();
        this.f10354J.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f10361a.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f10361a.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final void m7496a(C2358i c2358i) {
        m7497a(c2358i, true);
    }

    /* renamed from: a */
    public final void m7497a(C2358i c2358i, boolean z) {
        C2358i c2358i2 = this.f10345A;
        if (c2358i2 == c2358i) {
            if (c2358i2 != null) {
                m7490h();
                m7480b(c2358i.m7542c());
                return;
            }
            return;
        }
        int m7542c = c2358i != null ? c2358i.m7542c() : -1;
        if (z) {
            if ((c2358i2 == null || c2358i2.m7542c() == -1) && m7542c != -1) {
                setScrollPosition$4867b5c2(m7542c);
            } else {
                m7480b(m7542c);
            }
            if (m7542c != -1) {
                setSelectedTabView(m7542c);
            }
        }
        this.f10345A = c2358i;
        if (c2358i2 != null) {
            m7489g();
        }
        if (c2358i != null) {
            m7485c(c2358i);
        }
    }

    /* renamed from: c */
    private void m7485c(C2358i c2358i) {
        for (int size = this.f10352H.size() - 1; size >= 0; size--) {
            this.f10352H.get(size).mo7521a(c2358i);
        }
    }

    /* renamed from: g */
    private void m7489g() {
        for (int size = this.f10352H.size() - 1; size >= 0; size--) {
            this.f10352H.get(size);
        }
    }

    /* renamed from: h */
    private void m7490h() {
        for (int size = this.f10352H.size() - 1; size >= 0; size--) {
            this.f10352H.get(size);
        }
    }

    /* renamed from: a */
    private int m7470a(int i, float f) {
        if (this.f10379s != 0 && this.f10379s != 2) {
            return 0;
        }
        View childAt = this.f10361a.getChildAt(i);
        int i2 = i + 1;
        View childAt2 = i2 < this.f10361a.getChildCount() ? this.f10361a.getChildAt(i2) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i3 = (int) ((width + width2) * 0.5f * f);
        return C0538w.m1878h(this) == 0 ? left + i3 : left - i3;
    }

    /* renamed from: i */
    private void m7491i() {
        C0538w.m1863b(this.f10361a, (this.f10379s == 0 || this.f10379s == 2) ? Math.max(0, this.f10350F - this.f10362b) : 0, 0, 0, 0);
        switch (this.f10379s) {
            case 0:
                m7484c(this.f10376p);
                break;
            case 1:
            case 2:
                if (this.f10376p == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.f10361a.setGravity(1);
                break;
        }
        m7498a(true);
    }

    /* renamed from: c */
    private void m7484c(int i) {
        switch (i) {
            case 0:
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                break;
            case 1:
                this.f10361a.setGravity(1);
                return;
            case 2:
                break;
            default:
                return;
        }
        this.f10361a.setGravity(8388611);
    }

    /* renamed from: a */
    public final void m7498a(boolean z) {
        for (int i = 0; i < this.f10361a.getChildCount(); i++) {
            View childAt = this.f10361a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m7473a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public final class TabView extends LinearLayout {

        /* renamed from: b */
        private C2358i f10386b;

        /* renamed from: c */
        private TextView f10387c;

        /* renamed from: d */
        private ImageView f10388d;

        /* renamed from: e */
        private View f10389e;

        /* renamed from: f */
        private BadgeDrawable f10390f;

        /* renamed from: g */
        private View f10391g;

        /* renamed from: h */
        private TextView f10392h;

        /* renamed from: i */
        private ImageView f10393i;

        /* renamed from: j */
        private Drawable f10394j;

        /* renamed from: k */
        private int f10395k;

        public TabView(Context context) {
            super(context);
            this.f10395k = 2;
            m7499a(context);
            C0538w.m1863b(this, TabLayout.this.f10362b, TabLayout.this.f10363c, TabLayout.this.f10364d, TabLayout.this.f10365e);
            setGravity(17);
            setOrientation(!TabLayout.this.f10380t ? 1 : 0);
            setClickable(true);
            C0538w.m1851a(this, C0536u.m1815a(getContext()));
        }

        /* renamed from: a */
        public void m7499a(Context context) {
            if (TabLayout.this.f10374n != 0) {
                this.f10394j = C0057a.m46b(context, TabLayout.this.f10374n);
                if (this.f10394j != null && this.f10394j.isStateful()) {
                    this.f10394j.setState(getDrawableState());
                }
            } else {
                this.f10394j = null;
            }
            Drawable gradientDrawable = new GradientDrawable();
            ((GradientDrawable) gradientDrawable).setColor(0);
            if (TabLayout.this.f10369i != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m7064a = C2229c.m7064a(TabLayout.this.f10369i);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.f10382v) {
                        gradientDrawable = null;
                    }
                    if (TabLayout.this.f10382v) {
                        gradientDrawable2 = null;
                    }
                    gradientDrawable = new RippleDrawable(m7064a, gradientDrawable, gradientDrawable2);
                } else {
                    Drawable m1933f = C0546a.m1933f(gradientDrawable2);
                    C0546a.m1922a(m1933f, m7064a);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, m1933f});
                }
            }
            C0538w.m1846a(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            boolean z = false;
            if (this.f10394j != null && this.f10394j.isStateful()) {
                z = false | this.f10394j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f10386b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f10386b.m7545f();
            return true;
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f10387c != null) {
                this.f10387c.setSelected(z);
            }
            if (this.f10388d != null) {
                this.f10388d.setSelected(z);
            }
            if (this.f10391g != null) {
                this.f10391g.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.f10390f != null && this.f10390f.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f10390f.m6360c()));
            }
            C0482c m1635a = C0482c.m1635a(accessibilityNodeInfo);
            m1635a.m1661b(C0485f.m1715a(0, 1, this.f10386b.m7542c(), 1, isSelected()));
            if (isSelected()) {
                m1635a.m1685h(false);
                m1635a.m1663b(C0483d.f2303e);
            }
            m1635a.m1687i("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f10375o, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i, i2);
            if (this.f10387c != null) {
                float f = TabLayout.this.f10372l;
                int i3 = this.f10395k;
                boolean z = true;
                if (this.f10388d != null && this.f10388d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f10387c != null && this.f10387c.getLineCount() > 1) {
                    f = TabLayout.this.f10373m;
                }
                float textSize = this.f10387c.getTextSize();
                int lineCount = this.f10387c.getLineCount();
                int m2044a = C0577o.m2044a(this.f10387c);
                if (f != textSize || (m2044a >= 0 && i3 != m2044a)) {
                    if (TabLayout.this.f10379s == 1 && f > textSize && lineCount == 1 && ((layout = this.f10387c.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f10387c.setTextSize(0, f);
                        this.f10387c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        final void setTab(C2358i c2358i) {
            if (c2358i != this.f10386b) {
                this.f10386b = c2358i;
                m7518a();
            }
        }

        /* renamed from: a */
        public final void m7518a() {
            CharSequence charSequence;
            CharSequence charSequence2;
            C2358i c2358i = this.f10386b;
            Drawable drawable = null;
            View m7535a = c2358i != null ? c2358i.m7535a() : null;
            if (m7535a != null) {
                ViewParent parent = m7535a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m7535a);
                    }
                    addView(m7535a);
                }
                this.f10391g = m7535a;
                if (this.f10387c != null) {
                    this.f10387c.setVisibility(8);
                }
                if (this.f10388d != null) {
                    this.f10388d.setVisibility(8);
                    this.f10388d.setImageDrawable(null);
                }
                this.f10392h = (TextView) m7535a.findViewById(android.R.id.text1);
                if (this.f10392h != null) {
                    this.f10395k = C0577o.m2044a(this.f10392h);
                }
                this.f10393i = (ImageView) m7535a.findViewById(android.R.id.icon);
            } else {
                if (this.f10391g != null) {
                    removeView(this.f10391g);
                    this.f10391g = null;
                }
                this.f10392h = null;
                this.f10393i = null;
            }
            if (this.f10391g == null) {
                if (this.f10388d == null) {
                    m7510c();
                }
                if (c2358i != null && c2358i.m7540b() != null) {
                    drawable = C0546a.m1933f(c2358i.m7540b()).mutate();
                }
                if (drawable != null) {
                    C0546a.m1922a(drawable, TabLayout.this.f10368h);
                    if (TabLayout.this.f10371k != null) {
                        C0546a.m1925a(drawable, TabLayout.this.f10371k);
                    }
                }
                if (this.f10387c == null) {
                    m7513d();
                    this.f10395k = C0577o.m2044a(this.f10387c);
                }
                C0577o.m2048a(this.f10387c, TabLayout.this.f10366f);
                if (TabLayout.this.f10367g != null) {
                    this.f10387c.setTextColor(TabLayout.this.f10367g);
                }
                m7501a(this.f10387c, this.f10388d);
                m7515f();
                m7500a(this.f10388d);
                m7500a(this.f10387c);
            } else if (this.f10392h != null || this.f10393i != null) {
                m7501a(this.f10392h, this.f10393i);
            }
            if (c2358i != null) {
                charSequence = c2358i.f10422f;
                if (!TextUtils.isEmpty(charSequence)) {
                    charSequence2 = c2358i.f10422f;
                    setContentDescription(charSequence2);
                }
            }
            setSelected(c2358i != null && c2358i.m7546g());
        }

        /* renamed from: c */
        private void m7510c() {
            FrameLayout frameLayout;
            if (C2065b.f9124a) {
                frameLayout = m7514e();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            this.f10388d = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            frameLayout.addView(this.f10388d, 0);
        }

        /* renamed from: d */
        private void m7513d() {
            FrameLayout frameLayout;
            if (C2065b.f9124a) {
                frameLayout = m7514e();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            this.f10387c = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            frameLayout.addView(this.f10387c);
        }

        /* renamed from: e */
        private FrameLayout m7514e() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f10390f == null) {
                this.f10390f = BadgeDrawable.m6342a(getContext());
            }
            m7515f();
            if (this.f10390f == null) {
                throw new IllegalStateException("Unable to create badge");
            }
            return this.f10390f;
        }

        private BadgeDrawable getBadge() {
            return this.f10390f;
        }

        /* renamed from: a */
        private void m7500a(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2360k(this, view));
        }

        /* renamed from: f */
        private void m7515f() {
            if (m7517h()) {
                if (this.f10391g == null) {
                    if (this.f10388d != null && this.f10386b != null && this.f10386b.m7540b() != null) {
                        if (this.f10389e != this.f10388d) {
                            m7516g();
                            m7508b(this.f10388d);
                            return;
                        } else {
                            m7511c(this.f10388d);
                            return;
                        }
                    }
                    if (this.f10387c != null && this.f10386b != null && this.f10386b.m7544e() == 1) {
                        if (this.f10389e != this.f10387c) {
                            m7516g();
                            m7508b(this.f10387c);
                            return;
                        } else {
                            m7511c(this.f10387c);
                            return;
                        }
                    }
                }
                m7516g();
            }
        }

        /* renamed from: b */
        private void m7508b(View view) {
            if (m7517h() && view != null) {
                m7505a(false);
                C2065b.m6382a(this.f10390f, view, m7512d(view));
                this.f10389e = view;
            }
        }

        /* renamed from: g */
        private void m7516g() {
            if (m7517h()) {
                m7505a(true);
                if (this.f10389e != null) {
                    C2065b.m6383b(this.f10390f, this.f10389e, m7512d(this.f10389e));
                    this.f10389e = null;
                }
            }
        }

        /* renamed from: a */
        private void m7505a(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: b */
        final void m7519b() {
            setOrientation(!TabLayout.this.f10380t ? 1 : 0);
            if (this.f10392h != null || this.f10393i != null) {
                m7501a(this.f10392h, this.f10393i);
            } else {
                m7501a(this.f10387c, this.f10388d);
            }
        }

        /* renamed from: a */
        private void m7501a(TextView textView, ImageView imageView) {
            int i;
            Drawable mutate = (this.f10386b == null || this.f10386b.m7540b() == null) ? null : C0546a.m1933f(this.f10386b.m7540b()).mutate();
            CharSequence m7543d = this.f10386b != null ? this.f10386b.m7543d() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m7543d);
            if (textView != null) {
                if (z) {
                    textView.setText(m7543d);
                    i = this.f10386b.f10425i;
                    if (i == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m7108a = (z && imageView.getVisibility() == 0) ? (int) C2250as.m7108a(getContext(), 8) : 0;
                if (TabLayout.this.f10380t) {
                    if (m7108a != C0525j.m1787b(marginLayoutParams)) {
                        C0525j.m1788b(marginLayoutParams, m7108a);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m7108a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m7108a;
                    C0525j.m1788b(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            CharSequence charSequence = this.f10386b != null ? this.f10386b.f10422f : null;
            if (z) {
                charSequence = null;
            }
            C0287dy.m973a(this, charSequence);
        }

        /* renamed from: c */
        public void m7511c(View view) {
            if (m7517h() && view == this.f10389e) {
                C2065b.m6384c(this.f10390f, view, m7512d(view));
            }
        }

        /* renamed from: h */
        public boolean m7517h() {
            return this.f10390f != null;
        }

        /* renamed from: d */
        private FrameLayout m7512d(View view) {
            if ((view == this.f10388d || view == this.f10387c) && C2065b.f9124a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f10387c, this.f10388d, this.f10391g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public final C2358i getTab() {
            return this.f10386b;
        }

        /* renamed from: a */
        static /* synthetic */ void m7503a(TabView tabView, Canvas canvas) {
            if (tabView.f10394j != null) {
                tabView.f10394j.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f10394j.draw(canvas);
            }
        }
    }

    private int getDefaultHeight() {
        int size = this.f10384z.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C2358i c2358i = this.f10384z.get(i);
                if (c2358i != null && c2358i.m7540b() != null && !TextUtils.isEmpty(c2358i.m7543d())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f10380t) ? 48 : 72;
    }

    private int getTabMinWidth() {
        if (this.f10347C != -1) {
            return this.f10347C;
        }
        if (this.f10379s == 0 || this.f10379s == 2) {
            return this.f10349E;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    int getTabMaxWidth() {
        return this.f10375o;
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m7474a(viewPager, false);
    }
}
