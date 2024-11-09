package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.InterfaceC0390b;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p018b.C0418a;
import androidx.core.p023f.C0472c;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0526k;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.theme.p084a.C2402a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC0390b {

    /* renamed from: a */
    private static final int f8996a = R.style.Widget_Design_AppBarLayout;

    /* renamed from: b */
    private int f8997b;

    /* renamed from: c */
    private int f8998c;

    /* renamed from: d */
    private int f8999d;

    /* renamed from: e */
    private int f9000e;

    /* renamed from: f */
    private boolean f9001f;

    /* renamed from: g */
    private int f9002g;

    /* renamed from: h */
    private C0514ao f9003h;

    /* renamed from: i */
    private List<InterfaceC2050h> f9004i;

    /* renamed from: j */
    private boolean f9005j;

    /* renamed from: k */
    private boolean f9006k;

    /* renamed from: l */
    private boolean f9007l;

    /* renamed from: m */
    private boolean f9008m;

    /* renamed from: n */
    private int f9009n;

    /* renamed from: o */
    private WeakReference<View> f9010o;

    /* renamed from: p */
    private ValueAnimator f9011p;

    /* renamed from: q */
    private int[] f9012q;

    /* renamed from: r */
    private Drawable f9013r;

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m6265a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m6265a(layoutParams);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f8996a), attributeSet, i);
        this.f8998c = -1;
        this.f8999d = -1;
        this.f9000e = -1;
        this.f9002g = 0;
        Context context2 = getContext();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C2062t.m6336a(this);
            C2062t.m6338a(this, attributeSet, i, f8996a);
        }
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.AppBarLayout, i, f8996a, new int[0]);
        C0538w.m1846a(this, m7095a.getDrawable(R.styleable.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C2295h c2295h = new C2295h();
            c2295h.m7282g(ColorStateList.valueOf(colorDrawable.getColor()));
            c2295h.m7276a(context2);
            C0538w.m1846a(this, c2295h);
        }
        if (m7095a.hasValue(R.styleable.AppBarLayout_expanded)) {
            m6266a(m7095a.getBoolean(R.styleable.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && m7095a.hasValue(R.styleable.AppBarLayout_elevation)) {
            C2062t.m6337a(this, m7095a.getDimensionPixelSize(R.styleable.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (m7095a.hasValue(R.styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(m7095a.getBoolean(R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (m7095a.hasValue(R.styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(m7095a.getBoolean(R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f9008m = m7095a.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
        this.f9009n = m7095a.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(m7095a.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
        m7095a.recycle();
        C0538w.m1850a(this, new C2043a(this));
    }

    public void setStatusBarForeground(Drawable drawable) {
        if (this.f9013r != drawable) {
            if (this.f9013r != null) {
                this.f9013r.setCallback(null);
            }
            this.f9013r = drawable != null ? drawable.mutate() : null;
            if (this.f9013r != null) {
                if (this.f9013r.isStateful()) {
                    this.f9013r.setState(getDrawableState());
                }
                C0546a.m1929b(this.f9013r, C0538w.m1878h(this));
                this.f9013r.setVisible(getVisibility() == 0, false);
                this.f9013r.setCallback(this);
            }
            m6267d();
            C0538w.m1874f(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0057a.m46b(getContext(), i));
    }

    public Drawable getStatusBarForeground() {
        return this.f9013r;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m6268e()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f8997b);
            this.f9013r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9013r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9013r;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f9013r != null) {
            this.f9013r.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0538w.m1893v(this) && m6271h()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0418a.m1478a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m6269f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:            if (r4 != false) goto L82;     */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = androidx.core.p024g.C0538w.m1893v(r1)
            r3 = 1
            if (r2 == 0) goto L25
            boolean r2 = r1.m6271h()
            if (r2 == 0) goto L25
            int r2 = r1.getTopInset()
            int r4 = r1.getChildCount()
            int r4 = r4 - r3
        L19:
            if (r4 < 0) goto L25
            android.view.View r5 = r1.getChildAt(r4)
            androidx.core.p024g.C0538w.m1869c(r5, r2)
            int r4 = r4 + (-1)
            goto L19
        L25:
            r1.m6269f()
            r2 = 0
            r1.f9001f = r2
            int r4 = r1.getChildCount()
            r5 = r2
        L30:
            if (r5 >= r4) goto L46
            android.view.View r6 = r1.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.i r6 = (com.google.android.material.appbar.C2051i) r6
            android.view.animation.Interpolator r6 = r6.f9065b
            if (r6 == 0) goto L43
            r1.f9001f = r3
            goto L46
        L43:
            int r5 = r5 + 1
            goto L30
        L46:
            android.graphics.drawable.Drawable r4 = r1.f9013r
            if (r4 == 0) goto L57
            android.graphics.drawable.Drawable r4 = r1.f9013r
            int r5 = r1.getWidth()
            int r6 = r1.getTopInset()
            r4.setBounds(r2, r2, r5, r6)
        L57:
            boolean r4 = r1.f9005j
            if (r4 != 0) goto L92
            boolean r4 = r1.f9008m
            if (r4 != 0) goto L88
            int r4 = r1.getChildCount()
            r5 = r2
        L64:
            if (r5 >= r4) goto L85
            android.view.View r6 = r1.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.i r6 = (com.google.android.material.appbar.C2051i) r6
            int r0 = r6.f9064a
            r0 = r0 & r3
            if (r0 != r3) goto L7d
            int r6 = r6.f9064a
            r6 = r6 & 10
            if (r6 == 0) goto L7d
            r6 = r3
            goto L7e
        L7d:
            r6 = r2
        L7e:
            if (r6 == 0) goto L82
            r4 = r3
            goto L86
        L82:
            int r5 = r5 + 1
            goto L64
        L85:
            r4 = r2
        L86:
            if (r4 == 0) goto L89
        L88:
            r2 = r3
        L89:
            boolean r3 = r1.f9006k
            if (r3 == r2) goto L92
            r1.f9006k = r2
            r1.refreshDrawableState()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: d */
    private void m6267d() {
        setWillNotDraw(!m6268e());
    }

    /* renamed from: e */
    private boolean m6268e() {
        return this.f9013r != null && getTopInset() > 0;
    }

    /* renamed from: f */
    private void m6269f() {
        this.f8998c = -1;
        this.f8999d = -1;
        this.f9000e = -1;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7293a(this);
    }

    @Override // androidx.coordinatorlayout.widget.InterfaceC0390b
    public AbstractC0391c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2299l.m7294a(this, f);
    }

    public void setExpanded(boolean z) {
        m6266a(z, C0538w.m1819C(this), true);
    }

    public final void setExpanded$25decb5(boolean z) {
        m6266a(false, z, true);
    }

    /* renamed from: a */
    private void m6266a(boolean z, boolean z2, boolean z3) {
        this.f9002g = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2051i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public C2051i generateLayoutParams(AttributeSet attributeSet) {
        return new C2051i(getContext(), attributeSet);
    }

    /* renamed from: a */
    private static C2051i m6265a(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C2051i((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2051i((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2051i(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6270g();
    }

    /* renamed from: a */
    final boolean m6275a() {
        return this.f9001f;
    }

    public final int getTotalScrollRange() {
        if (this.f8998c != -1) {
            return this.f8998c;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C2051i c2051i = (C2051i) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c2051i.f9064a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + c2051i.topMargin + c2051i.bottomMargin;
            if (i == 0 && C0538w.m1893v(childAt)) {
                i2 -= getTopInset();
            }
            if ((i3 & 2) != 0) {
                i2 -= C0538w.m1886o(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.f8998c = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    int getDownNestedPreScrollRange() {
        int m1886o;
        if (this.f8999d != -1) {
            return this.f8999d;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C2051i c2051i = (C2051i) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = c2051i.f9064a;
            if ((i2 & 5) != 5) {
                if (i > 0) {
                    break;
                }
            } else {
                int i3 = c2051i.topMargin + c2051i.bottomMargin;
                if ((i2 & 8) != 0) {
                    m1886o = i3 + C0538w.m1886o(childAt);
                } else {
                    m1886o = (i2 & 2) != 0 ? i3 + (measuredHeight - C0538w.m1886o(childAt)) : i3 + measuredHeight;
                }
                if (childCount == 0 && C0538w.m1893v(childAt)) {
                    m1886o = Math.min(m1886o, measuredHeight - getTopInset());
                }
                i += m1886o;
            }
        }
        int max = Math.max(0, i);
        this.f8999d = max;
        return max;
    }

    int getDownNestedScrollRange() {
        if (this.f9000e != -1) {
            return this.f9000e;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C2051i c2051i = (C2051i) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + c2051i.topMargin + c2051i.bottomMargin;
            int i3 = c2051i.f9064a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= C0538w.m1886o(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.f9000e = max;
        return max;
    }

    /* renamed from: a */
    final void m6273a(int i) {
        this.f8997b = i;
        if (!willNotDraw()) {
            C0538w.m1874f(this);
        }
        if (this.f9004i != null) {
            int size = this.f9004i.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2050h interfaceC2050h = this.f9004i.get(i2);
                if (interfaceC2050h != null) {
                    interfaceC2050h.mo6322a(i);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m1886o = C0538w.m1886o(this);
        if (m1886o != 0) {
            return (m1886o * 2) + topInset;
        }
        int childCount = getChildCount();
        int m1886o2 = childCount > 0 ? C0538w.m1886o(getChildAt(childCount - 1)) : 0;
        return m1886o2 != 0 ? (m1886o2 * 2) + topInset : getHeight() / 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f9012q == null) {
            this.f9012q = new int[4];
        }
        int[] iArr = this.f9012q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f9006k ? R.attr.state_liftable : -R.attr.state_liftable;
        iArr[1] = (this.f9006k && this.f9007l) ? R.attr.state_lifted : -R.attr.state_lifted;
        iArr[2] = this.f9006k ? R.attr.state_collapsible : -R.attr.state_collapsible;
        iArr[3] = (this.f9006k && this.f9007l) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* renamed from: a */
    final boolean m6277a(boolean z) {
        if (this.f9007l == z) {
            return false;
        }
        this.f9007l = z;
        refreshDrawableState();
        if (this.f9008m && (getBackground() instanceof C2295h)) {
            C2295h c2295h = (C2295h) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            if (this.f9011p != null) {
                this.f9011p.cancel();
            }
            this.f9011p = ValueAnimator.ofFloat(f, dimension);
            this.f9011p.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f9011p.setInterpolator(C2032a.f8973a);
            this.f9011p.addUpdateListener(new C2044b(this, c2295h));
            this.f9011p.start();
        }
        return true;
    }

    public void setLiftOnScroll(boolean z) {
        this.f9008m = z;
    }

    /* renamed from: b */
    public final boolean m6279b() {
        return this.f9008m;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f9009n = i;
        m6270g();
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f9009n;
    }

    /* renamed from: g */
    private void m6270g() {
        if (this.f9010o != null) {
            this.f9010o.clear();
        }
        this.f9010o = null;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2062t.m6337a(this, f);
        }
    }

    int getPendingAction() {
        return this.f9002g;
    }

    /* renamed from: c */
    final void m6280c() {
        this.f9002g = 0;
    }

    final int getTopInset() {
        if (this.f9003h != null) {
            return this.f9003h.m1766b();
        }
        return 0;
    }

    /* renamed from: h */
    private boolean m6271h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C0538w.m1893v(childAt)) ? false : true;
    }

    /* renamed from: a */
    public final C0514ao m6272a(C0514ao c0514ao) {
        C0514ao c0514ao2 = C0538w.m1893v(this) ? c0514ao : null;
        if (!C0472c.m1615a(this.f9003h, c0514ao2)) {
            this.f9003h = c0514ao2;
            m6267d();
            requestLayout();
        }
        return c0514ao;
    }

    /* loaded from: classes.dex */
    public class Behavior extends BaseBehavior<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Parcelable mo1422b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1422b(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1408a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1408a(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1409a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo1409a(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1410a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo1410a(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1411a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo1411a(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.C2060r
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo6307a(int i) {
            return super.mo6307a(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1414a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo1414a(coordinatorLayout, (CoordinatorLayout) appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1415a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo1415a(coordinatorLayout, (CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1421a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo1421a(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.C2060r
        /* renamed from: d */
        public final /* bridge */ /* synthetic */ int mo6308d() {
            return super.mo6308d();
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public class BaseBehavior<T extends AppBarLayout> extends AbstractC2057o<T> {

        /* renamed from: b */
        private int f9014b;

        /* renamed from: c */
        private int f9015c;

        /* renamed from: d */
        private ValueAnimator f9016d;

        /* renamed from: e */
        private int f9017e;

        /* renamed from: f */
        private boolean f9018f;

        /* renamed from: g */
        private float f9019g;

        /* renamed from: h */
        private WeakReference<View> f9020h;

        /* renamed from: i */
        private AbstractC2048f f9021i;

        /* renamed from: a */
        private static boolean m6287a(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // com.google.android.material.appbar.AbstractC2057o
        /* renamed from: a */
        final /* synthetic */ int mo6293a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC2057o
        /* renamed from: a */
        final /* synthetic */ int mo6294a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int mo6303b = mo6303b();
            int i6 = 0;
            if (i2 != 0 && mo6303b >= i2 && mo6303b <= i3) {
                int m1478a = C0418a.m1478a(i, i2, i3);
                if (mo6303b != m1478a) {
                    if (appBarLayout.m6275a()) {
                        int abs = Math.abs(m1478a);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            C2051i c2051i = (C2051i) childAt.getLayoutParams();
                            Interpolator interpolator = c2051i.f9065b;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = c2051i.f9064a;
                                if ((i8 & 1) != 0) {
                                    int height = childAt.getHeight() + c2051i.topMargin + c2051i.bottomMargin + 0;
                                    i5 = (i8 & 2) != 0 ? height - C0538w.m1886o(childAt) : height;
                                } else {
                                    i5 = 0;
                                }
                                if (C0538w.m1893v(childAt)) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(m1478a) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = m1478a;
                    boolean a2 = mo6307a(i4);
                    int i9 = mo6303b - m1478a;
                    this.f9014b = m1478a - i4;
                    if (!a2 && appBarLayout.m6275a()) {
                        coordinatorLayout.m1400a(appBarLayout);
                    }
                    appBarLayout.m6273a(mo6308d());
                    m6284a(coordinatorLayout, appBarLayout, m1478a, m1478a < mo6303b ? -1 : 1, false);
                    i6 = i9;
                }
            } else {
                this.f9014b = 0;
            }
            m6291c(coordinatorLayout, (CoordinatorLayout) appBarLayout);
            return i6;
        }

        @Override // com.google.android.material.appbar.AbstractC2057o
        /* renamed from: b */
        final /* synthetic */ int mo6304b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC2057o
        /* renamed from: c */
        public final /* synthetic */ void mo6305c(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m6289b(coordinatorLayout, (CoordinatorLayout) appBarLayout);
            if (appBarLayout.m6279b()) {
                appBarLayout.m6277a(appBarLayout.m6276a(m6283a(coordinatorLayout)));
            }
        }

        public BaseBehavior() {
            this.f9017e = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9017e = -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L42;     */
        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo1421a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.m6279b()
                if (r5 != 0) goto L2d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = r6
                goto L15
            L14:
                r5 = r0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = r6
                goto L29
            L28:
                r2 = r0
            L29:
                if (r2 == 0) goto L2c
                goto L2d
            L2c:
                r6 = r0
            L2d:
                if (r6 == 0) goto L38
                android.animation.ValueAnimator r2 = r1.f9016d
                if (r2 == 0) goto L38
                android.animation.ValueAnimator r2 = r1.f9016d
                r2.cancel()
            L38:
                r2 = 0
                r1.f9020h = r2
                r1.f9015c = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1421a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public void mo1411a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = m6324b(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.m6279b()) {
                t.m6277a(t.m6276a(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public void mo1410a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m6324b(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m6291c(coordinatorLayout, (CoordinatorLayout) t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public void mo1409a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f9015c == 0 || i == 1) {
                m6289b(coordinatorLayout, (CoordinatorLayout) t);
                if (t.m6279b()) {
                    t.m6277a(t.m6276a(view));
                }
            }
            this.f9020h = new WeakReference<>(view);
        }

        /* renamed from: b */
        private void m6290b(CoordinatorLayout coordinatorLayout, T t, int i) {
            int height;
            int abs = Math.abs(mo6303b() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            int mo6303b = mo6303b();
            if (mo6303b == i) {
                if (this.f9016d == null || !this.f9016d.isRunning()) {
                    return;
                }
                this.f9016d.cancel();
                return;
            }
            if (this.f9016d == null) {
                this.f9016d = new ValueAnimator();
                this.f9016d.setInterpolator(C2032a.f8977e);
                this.f9016d.addUpdateListener(new C2045c(this, coordinatorLayout, t));
            } else {
                this.f9016d.cancel();
            }
            this.f9016d.setDuration(Math.min(height, ResponseCode.CODE_6XX_CONNECT_ERROR));
            this.f9016d.setIntValues(mo6303b, i);
            this.f9016d.start();
        }

        /* renamed from: a */
        private static int m6282a(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2051i c2051i = (C2051i) childAt.getLayoutParams();
                if (m6287a(c2051i.f9064a, 32)) {
                    top -= c2051i.topMargin;
                    bottom += c2051i.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: b */
        private void m6289b(CoordinatorLayout coordinatorLayout, T t) {
            int mo6303b = mo6303b();
            int m6282a = m6282a(t, mo6303b);
            if (m6282a >= 0) {
                View childAt = t.getChildAt(m6282a);
                C2051i c2051i = (C2051i) childAt.getLayoutParams();
                int i = c2051i.f9064a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (m6282a == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (m6287a(i, 2)) {
                        i3 += C0538w.m1886o(childAt);
                    } else if (m6287a(i, 5)) {
                        int m1886o = C0538w.m1886o(childAt) + i3;
                        if (mo6303b < m1886o) {
                            i2 = m1886o;
                        } else {
                            i3 = m1886o;
                        }
                    }
                    if (m6287a(i, 32)) {
                        i2 += c2051i.topMargin;
                        i3 -= c2051i.bottomMargin;
                    }
                    if (mo6303b < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    m6290b(coordinatorLayout, (CoordinatorLayout) t, C0418a.m1478a(i2, -t.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public boolean mo1415a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0394f) t.getLayoutParams()).height == -2) {
                coordinatorLayout.m1401a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.mo1415a(coordinatorLayout, (CoordinatorLayout) t, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.C2060r, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public boolean mo1414a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean a2 = super.mo1414a(coordinatorLayout, (CoordinatorLayout) t, i);
            int pendingAction = t.getPendingAction();
            if (this.f9017e >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(this.f9017e);
                int i2 = -childAt.getBottom();
                if (this.f9018f) {
                    round = i2 + C0538w.m1886o(childAt) + t.getTopInset();
                } else {
                    round = i2 + Math.round(childAt.getHeight() * this.f9019g);
                }
                m6323a_(coordinatorLayout, t, round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m6290b(coordinatorLayout, (CoordinatorLayout) t, i3);
                    } else {
                        m6323a_(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m6290b(coordinatorLayout, (CoordinatorLayout) t, 0);
                    } else {
                        m6323a_(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m6280c();
            this.f9017e = -1;
            mo6307a(C0418a.m1478a(mo6308d(), -t.getTotalScrollRange(), 0));
            m6284a(coordinatorLayout, (AppBarLayout) t, mo6308d(), 0, true);
            t.m6273a(mo6308d());
            m6291c(coordinatorLayout, (CoordinatorLayout) t);
            return a2;
        }

        /* renamed from: c */
        private void m6291c(CoordinatorLayout coordinatorLayout, T t) {
            C0538w.m1862b((View) coordinatorLayout, C0483d.f2311m.m1709a());
            C0538w.m1862b((View) coordinatorLayout, C0483d.f2312n.m1709a());
            View m6283a = m6283a(coordinatorLayout);
            if (m6283a == null || t.getTotalScrollRange() == 0 || !(((C0394f) m6283a.getLayoutParams()).m1430b() instanceof ScrollingViewBehavior)) {
                return;
            }
            m6285a(coordinatorLayout, (CoordinatorLayout) t, m6283a);
        }

        /* renamed from: a */
        private void m6285a(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo6303b() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m6286a(coordinatorLayout, (CoordinatorLayout) t, C0483d.f2311m, false);
            }
            if (mo6303b() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C0538w.m1848a(coordinatorLayout, C0483d.f2312n, new C2046d(this, coordinatorLayout, t, view, i));
                        return;
                    }
                    return;
                }
                m6286a(coordinatorLayout, (CoordinatorLayout) t, C0483d.f2312n, true);
            }
        }

        /* renamed from: a */
        private void m6286a(CoordinatorLayout coordinatorLayout, T t, C0483d c0483d, boolean z) {
            C0538w.m1848a(coordinatorLayout, c0483d, new C2047e(this, t, z));
        }

        /* renamed from: a */
        private static void m6284a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m6288b = m6288b(t, i);
            if (m6288b != null) {
                int i3 = ((C2051i) m6288b.getLayoutParams()).f9064a;
                boolean z2 = false;
                if ((i3 & 1) != 0) {
                    int m1886o = C0538w.m1886o(m6288b);
                    if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (m6288b.getBottom() - m1886o) - t.getTopInset()) : (-i) >= (m6288b.getBottom() - m1886o) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.m6279b()) {
                    z2 = t.m6276a(m6283a(coordinatorLayout));
                }
                boolean m6277a = t.m6277a(z2);
                if (z || (m6277a && m6292d(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: d */
        private static boolean m6292d(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m1405c = coordinatorLayout.m1405c(t);
            int size = m1405c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0391c m1430b = ((C0394f) m1405c.get(i).getLayoutParams()).m1430b();
                if (m1430b instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m1430b).m6328c() != 0;
                }
            }
            return false;
        }

        /* renamed from: b */
        private static View m6288b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static View m6283a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0526k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.AbstractC2057o
        /* renamed from: b */
        final int mo6303b() {
            return mo6308d() + this.f9014b;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public Parcelable mo1422b(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable b = super.mo1422b(coordinatorLayout, (CoordinatorLayout) t);
            int d = mo6308d();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + d;
                if (childAt.getTop() + d <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(b);
                    savedState.f9022a = i;
                    savedState.f9024d = bottom == C0538w.m1886o(childAt) + t.getTopInset();
                    savedState.f9023b = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return b;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public void mo1408a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo1408a(coordinatorLayout, (CoordinatorLayout) t, savedState.m2149a());
                this.f9017e = savedState.f9022a;
                this.f9019g = savedState.f9023b;
                this.f9018f = savedState.f9024d;
                return;
            }
            super.mo1408a(coordinatorLayout, (CoordinatorLayout) t, parcelable);
            this.f9017e = -1;
        }

        /* loaded from: classes.dex */
        public class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C2049g();

            /* renamed from: a */
            int f9022a;

            /* renamed from: b */
            float f9023b;

            /* renamed from: d */
            boolean f9024d;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f9022a = parcel.readInt();
                this.f9023b = parcel.readFloat();
                this.f9024d = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f9022a);
                parcel.writeFloat(this.f9023b);
                parcel.writeByte(this.f9024d ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.material.appbar.AbstractC2057o
        /* renamed from: c */
        final /* synthetic */ boolean mo6306c() {
            if (this.f9021i != null) {
                return this.f9021i.m6321a();
            }
            if (this.f9020h == null) {
                return true;
            }
            View view = this.f9020h.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }
    }

    /* renamed from: a */
    public final void m6274a(InterfaceC2052j interfaceC2052j) {
        if (this.f9004i == null) {
            this.f9004i = new ArrayList();
        }
        if (interfaceC2052j == null || this.f9004i.contains(interfaceC2052j)) {
            return;
        }
        this.f9004i.add(interfaceC2052j);
    }

    /* renamed from: b */
    public final void m6278b(InterfaceC2052j interfaceC2052j) {
        if (this.f9004i == null || interfaceC2052j == null) {
            return;
        }
        this.f9004i.remove(interfaceC2052j);
    }

    /* loaded from: classes.dex */
    public class ScrollingViewBehavior extends AbstractC2059q {
        @Override // com.google.android.material.appbar.AbstractC2059q
        /* renamed from: a */
        final /* synthetic */ View mo6311a(List list) {
            return m6309b((List<View>) list);
        }

        @Override // com.google.android.material.appbar.C2060r
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo6307a(int i) {
            return super.mo6307a(i);
        }

        @Override // com.google.android.material.appbar.C2060r, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1414a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo1414a(coordinatorLayout, (CoordinatorLayout) view, i);
        }

        @Override // com.google.android.material.appbar.AbstractC2059q, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1415a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo1415a(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.C2060r
        /* renamed from: d */
        public final /* bridge */ /* synthetic */ int mo6308d() {
            return super.mo6308d();
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            m6326b(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1413a(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final void mo1407a(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                C0538w.m1862b((View) coordinatorLayout, C0483d.f2311m.m1709a());
                C0538w.m1862b((View) coordinatorLayout, C0483d.f2312n.m1709a());
            }
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1417a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout m6309b = m6309b(coordinatorLayout.m1403b(view));
            if (m6309b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f9081a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    m6309b.setExpanded$25decb5(!z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC2059q
        /* renamed from: a */
        final float mo6310a(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                AbstractC0391c m1430b = ((C0394f) appBarLayout.getLayoutParams()).m1430b();
                int mo6303b = m1430b instanceof BaseBehavior ? ((BaseBehavior) m1430b).mo6303b() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + mo6303b > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (mo6303b / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: b */
        private static AppBarLayout m6309b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC2059q
        /* renamed from: b */
        public final int mo6312b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo6312b(view);
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1419a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0391c m1430b = ((C0394f) view2.getLayoutParams()).m1430b();
            if (m1430b instanceof BaseBehavior) {
                C0538w.m1869c(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m1430b).f9014b) + m6325b()) - m6329c(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.m6279b()) {
                return false;
            }
            appBarLayout.m6277a(appBarLayout.m6276a(view));
            return false;
        }
    }

    /* renamed from: a */
    final boolean m6276a(View view) {
        if (this.f9010o == null && this.f9009n != -1) {
            View findViewById = view != null ? view.findViewById(this.f9009n) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f9009n);
            }
            if (findViewById != null) {
                this.f9010o = new WeakReference<>(findViewById);
            }
        }
        View view2 = this.f9010o != null ? this.f9010o.get() : null;
        if (view2 == null) {
            view2 = view;
        }
        if (view2 != null) {
            return view2.canScrollVertically(-1) || view2.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C2051i();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2051i();
    }
}
