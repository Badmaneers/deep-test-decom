package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2258c;
import com.google.android.material.internal.C2261f;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.theme.p084a.C2402a;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: e */
    private static final int f9025e = R.style.Widget_Design_CollapsingToolbar;

    /* renamed from: a */
    final C2258c f9026a;

    /* renamed from: b */
    Drawable f9027b;

    /* renamed from: c */
    int f9028c;

    /* renamed from: d */
    C0514ao f9029d;

    /* renamed from: f */
    private boolean f9030f;

    /* renamed from: g */
    private int f9031g;

    /* renamed from: h */
    private Toolbar f9032h;

    /* renamed from: i */
    private View f9033i;

    /* renamed from: j */
    private View f9034j;

    /* renamed from: k */
    private int f9035k;

    /* renamed from: l */
    private int f9036l;

    /* renamed from: m */
    private int f9037m;

    /* renamed from: n */
    private int f9038n;

    /* renamed from: o */
    private final Rect f9039o;

    /* renamed from: p */
    private boolean f9040p;

    /* renamed from: q */
    private boolean f9041q;

    /* renamed from: r */
    private Drawable f9042r;

    /* renamed from: s */
    private int f9043s;

    /* renamed from: t */
    private boolean f9044t;

    /* renamed from: u */
    private ValueAnimator f9045u;

    /* renamed from: v */
    private long f9046v;

    /* renamed from: w */
    private int f9047w;

    /* renamed from: x */
    private InterfaceC2052j f9048x;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9025e), attributeSet, i);
        this.f9030f = true;
        this.f9039o = new Rect();
        this.f9047w = -1;
        Context context2 = getContext();
        this.f9026a = new C2258c(this);
        this.f9026a.m7148a(C2032a.f8977e);
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.CollapsingToolbarLayout, i, f9025e, new int[0]);
        this.f9026a.m7146a(m7095a.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f9026a.m7158b(m7095a.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = m7095a.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f9038n = dimensionPixelSize;
        this.f9037m = dimensionPixelSize;
        this.f9036l = dimensionPixelSize;
        this.f9035k = dimensionPixelSize;
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f9035k = m7095a.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f9037m = m7095a.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f9036l = m7095a.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f9038n = m7095a.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f9040p = m7095a.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(m7095a.getText(R.styleable.CollapsingToolbarLayout_title));
        this.f9026a.m7168d(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f9026a.m7165c(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f9026a.m7168d(m7095a.getResourceId(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f9026a.m7165c(m7095a.getResourceId(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f9047w = m7095a.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (m7095a.hasValue(R.styleable.CollapsingToolbarLayout_maxLines)) {
            this.f9026a.m7170e(m7095a.getInt(R.styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        this.f9046v = m7095a.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, ResponseCode.CODE_6XX_CONNECT_ERROR);
        setContentScrim(m7095a.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(m7095a.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        this.f9031g = m7095a.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        m7095a.recycle();
        setWillNotDraw(false);
        C0538w.m1850a(this, new C2053k(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0538w.m1864b(this, C0538w.m1893v((View) parent));
            if (this.f9048x == null) {
                this.f9048x = new C2056n(this);
            }
            ((AppBarLayout) parent).m6274a(this.f9048x);
            C0538w.m1892u(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.f9048x != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m6278b(this.f9048x);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m6314b();
        if (this.f9032h == null && this.f9042r != null && this.f9043s > 0) {
            this.f9042r.mutate().setAlpha(this.f9043s);
            this.f9042r.draw(canvas);
        }
        if (this.f9040p && this.f9041q) {
            this.f9026a.m7150a(canvas);
        }
        if (this.f9027b == null || this.f9043s <= 0) {
            return;
        }
        int m1766b = this.f9029d != null ? this.f9029d.m1766b() : 0;
        if (m1766b > 0) {
            this.f9027b.setBounds(0, -this.f9028c, getWidth(), m1766b - this.f9028c);
            this.f9027b.mutate().setAlpha(this.f9043s);
            this.f9027b.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001c, code lost:            r0 = true;     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f9042r
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            int r0 = r4.f9043s
            if (r0 <= 0) goto L33
            android.view.View r0 = r4.f9033i
            if (r0 == 0) goto L18
            android.view.View r0 = r4.f9033i
            if (r0 != r4) goto L13
            goto L18
        L13:
            android.view.View r0 = r4.f9033i
            if (r6 != r0) goto L1e
            goto L1c
        L18:
            androidx.appcompat.widget.Toolbar r0 = r4.f9032h
            if (r6 != r0) goto L1e
        L1c:
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.f9042r
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f9043s
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f9042r
            r0.draw(r5)
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            boolean r4 = super.drawChild(r5, r6, r7)
            if (r4 != 0) goto L3e
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            return r2
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f9042r != null) {
            this.f9042r.setBounds(0, 0, i, i2);
        }
    }

    /* renamed from: b */
    private void m6314b() {
        if (this.f9030f) {
            Toolbar toolbar = null;
            this.f9032h = null;
            this.f9033i = null;
            if (this.f9031g != -1) {
                this.f9032h = (Toolbar) findViewById(this.f9031g);
                if (this.f9032h != null) {
                    this.f9033i = m6315c(this.f9032h);
                }
            }
            if (this.f9032h == null) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i++;
                }
                this.f9032h = toolbar;
            }
            m6316c();
            this.f9030f = false;
        }
    }

    /* renamed from: c */
    private View m6315c(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    /* renamed from: c */
    private void m6316c() {
        if (!this.f9040p && this.f9034j != null) {
            ViewParent parent = this.f9034j.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f9034j);
            }
        }
        if (!this.f9040p || this.f9032h == null) {
            return;
        }
        if (this.f9034j == null) {
            this.f9034j = new View(getContext());
        }
        if (this.f9034j.getParent() == null) {
            this.f9032h.addView(this.f9034j, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m6314b();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int m1766b = this.f9029d != null ? this.f9029d.m1766b() : 0;
        if (mode != 0 || m1766b <= 0) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m1766b, 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f9029d != null) {
            int m1766b = this.f9029d.m1766b();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C0538w.m1893v(childAt) && childAt.getTop() < m1766b) {
                    C0538w.m1869c(childAt, m1766b);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m6313a(getChildAt(i6)).m6330a();
        }
        if (this.f9040p && this.f9034j != null) {
            this.f9041q = C0538w.m1822F(this.f9034j) && this.f9034j.getVisibility() == 0;
            if (this.f9041q) {
                boolean z2 = C0538w.m1878h(this) == 1;
                int m6320b = m6320b(this.f9033i != null ? this.f9033i : this.f9032h);
                C2261f.m7180b(this, this.f9034j, this.f9039o);
                this.f9026a.m7159b(this.f9039o.left + (z2 ? this.f9032h.getTitleMarginEnd() : this.f9032h.getTitleMarginStart()), this.f9039o.top + m6320b + this.f9032h.getTitleMarginTop(), this.f9039o.right + (z2 ? this.f9032h.getTitleMarginStart() : this.f9032h.getTitleMarginEnd()), (this.f9039o.bottom + m6320b) - this.f9032h.getTitleMarginBottom());
                this.f9026a.m7147a(z2 ? this.f9037m : this.f9035k, this.f9039o.top + this.f9036l, (i3 - i) - (z2 ? this.f9035k : this.f9037m), (i4 - i2) - this.f9038n);
                this.f9026a.m7174i();
            }
        }
        if (this.f9032h != null) {
            if (this.f9040p && TextUtils.isEmpty(this.f9026a.m7175j())) {
                setTitle(this.f9032h.getTitle());
            }
            if (this.f9033i == null || this.f9033i == this) {
                setMinimumHeight(m6317d(this.f9032h));
            } else {
                setMinimumHeight(m6317d(this.f9033i));
            }
        }
        m6319a();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m6313a(getChildAt(i7)).m6332b();
        }
    }

    /* renamed from: d */
    private static int m6317d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2061s m6313a(View view) {
        C2061s c2061s = (C2061s) view.getTag(R.id.view_offset_helper);
        if (c2061s != null) {
            return c2061s;
        }
        C2061s c2061s2 = new C2061s(view);
        view.setTag(R.id.view_offset_helper, c2061s2);
        return c2061s2;
    }

    public void setTitle(CharSequence charSequence) {
        this.f9026a.m7154a(charSequence);
        m6318d();
    }

    public CharSequence getTitle() {
        if (this.f9040p) {
            return this.f9026a.m7175j();
        }
        return null;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f9040p) {
            this.f9040p = z;
            m6318d();
            m6316c();
            requestLayout();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = C0538w.m1819C(this) && !isInEditMode();
        if (this.f9044t != z) {
            if (!z2) {
                setScrimAlpha(z ? 255 : 0);
            } else {
                int i = z ? 255 : 0;
                m6314b();
                if (this.f9045u == null) {
                    this.f9045u = new ValueAnimator();
                    this.f9045u.setDuration(this.f9046v);
                    this.f9045u.setInterpolator(i > this.f9043s ? C2032a.f8975c : C2032a.f8976d);
                    this.f9045u.addUpdateListener(new C2054l(this));
                } else if (this.f9045u.isRunning()) {
                    this.f9045u.cancel();
                }
                this.f9045u.setIntValues(this.f9043s, i);
                this.f9045u.start();
            }
            this.f9044t = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        if (i != this.f9043s) {
            if (this.f9042r != null && this.f9032h != null) {
                C0538w.m1874f(this.f9032h);
            }
            this.f9043s = i;
            C0538w.m1874f(this);
        }
    }

    int getScrimAlpha() {
        return this.f9043s;
    }

    public void setContentScrim(Drawable drawable) {
        if (this.f9042r != drawable) {
            if (this.f9042r != null) {
                this.f9042r.setCallback(null);
            }
            this.f9042r = drawable != null ? drawable.mutate() : null;
            if (this.f9042r != null) {
                this.f9042r.setBounds(0, 0, getWidth(), getHeight());
                this.f9042r.setCallback(this);
                this.f9042r.setAlpha(this.f9043s);
            }
            C0538w.m1874f(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0420a.m1483a(getContext(), i));
    }

    public Drawable getContentScrim() {
        return this.f9042r;
    }

    public void setStatusBarScrim(Drawable drawable) {
        if (this.f9027b != drawable) {
            if (this.f9027b != null) {
                this.f9027b.setCallback(null);
            }
            this.f9027b = drawable != null ? drawable.mutate() : null;
            if (this.f9027b != null) {
                if (this.f9027b.isStateful()) {
                    this.f9027b.setState(getDrawableState());
                }
                C0546a.m1929b(this.f9027b, C0538w.m1878h(this));
                this.f9027b.setVisible(getVisibility() == 0, false);
                this.f9027b.setCallback(this);
                this.f9027b.setAlpha(this.f9043s);
            }
            C0538w.m1874f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9027b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f9042r;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (this.f9026a != null) {
            z |= this.f9026a.m7155a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9042r || drawable == this.f9027b;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f9027b != null && this.f9027b.isVisible() != z) {
            this.f9027b.setVisible(z, false);
        }
        if (this.f9042r == null || this.f9042r.isVisible() == z) {
            return;
        }
        this.f9042r.setVisible(z, false);
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0420a.m1483a(getContext(), i));
    }

    public Drawable getStatusBarScrim() {
        return this.f9027b;
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f9026a.m7165c(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f9026a.m7149a(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f9026a.m7158b(i);
    }

    public int getCollapsedTitleGravity() {
        return this.f9026a.m7167d();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f9026a.m7168d(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f9026a.m7161b(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.f9026a.m7146a(i);
    }

    public int getExpandedTitleGravity() {
        return this.f9026a.m7164c();
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f9026a.m7153a(typeface);
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f9026a.m7169e();
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f9026a.m7163b(typeface);
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f9026a.m7171f();
    }

    public int getExpandedTitleMarginStart() {
        return this.f9035k;
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f9035k = i;
        requestLayout();
    }

    public int getExpandedTitleMarginTop() {
        return this.f9036l;
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f9036l = i;
        requestLayout();
    }

    public int getExpandedTitleMarginEnd() {
        return this.f9037m;
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f9037m = i;
        requestLayout();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f9038n;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f9038n = i;
        requestLayout();
    }

    public void setMaxLines(int i) {
        this.f9026a.m7170e(i);
    }

    public int getMaxLines() {
        return this.f9026a.m7176k();
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f9047w != i) {
            this.f9047w = i;
            m6319a();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        if (this.f9047w >= 0) {
            return this.f9047w;
        }
        int m1766b = this.f9029d != null ? this.f9029d.m1766b() : 0;
        int m1886o = C0538w.m1886o(this);
        if (m1886o > 0) {
            return Math.min((m1886o * 2) + m1766b, getHeight());
        }
        return getHeight() / 3;
    }

    public void setScrimAnimationDuration(long j) {
        this.f9046v = j;
    }

    public long getScrimAnimationDuration() {
        return this.f9046v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2055m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2055m(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6319a() {
        if (this.f9042r == null && this.f9027b == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f9028c < getScrimVisibleHeightTrigger());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m6320b(View view) {
        return ((getHeight() - m6313a(view).m6335d()) - view.getHeight()) - ((C2055m) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: d */
    private void m6318d() {
        setContentDescription(getTitle());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2055m(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C2055m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2055m();
    }
}
