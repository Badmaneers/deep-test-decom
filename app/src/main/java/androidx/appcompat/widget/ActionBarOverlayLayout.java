package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.core.p024g.C0533r;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0530o;
import androidx.core.p024g.InterfaceC0531p;
import androidx.core.p024g.InterfaceC0532q;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0216bh, InterfaceC0530o, InterfaceC0531p, InterfaceC0532q {

    /* renamed from: e */
    static final int[] f772e = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A */
    private final Runnable f773A;

    /* renamed from: B */
    private final C0533r f774B;

    /* renamed from: a */
    ActionBarContainer f775a;

    /* renamed from: b */
    boolean f776b;

    /* renamed from: c */
    ViewPropertyAnimator f777c;

    /* renamed from: d */
    final AnimatorListenerAdapter f778d;

    /* renamed from: f */
    private int f779f;

    /* renamed from: g */
    private int f780g;

    /* renamed from: h */
    private ContentFrameLayout f781h;

    /* renamed from: i */
    private InterfaceC0217bi f782i;

    /* renamed from: j */
    private Drawable f783j;

    /* renamed from: k */
    private boolean f784k;

    /* renamed from: l */
    private boolean f785l;

    /* renamed from: m */
    private boolean f786m;

    /* renamed from: n */
    private boolean f787n;

    /* renamed from: o */
    private int f788o;

    /* renamed from: p */
    private int f789p;

    /* renamed from: q */
    private final Rect f790q;

    /* renamed from: r */
    private final Rect f791r;

    /* renamed from: s */
    private final Rect f792s;

    /* renamed from: t */
    private final Rect f793t;

    /* renamed from: u */
    private final Rect f794u;

    /* renamed from: v */
    private final Rect f795v;

    /* renamed from: w */
    private final Rect f796w;

    /* renamed from: x */
    private InterfaceC0299h f797x;

    /* renamed from: y */
    private OverScroller f798y;

    /* renamed from: z */
    private final Runnable f799z;

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f780g = 0;
        this.f790q = new Rect();
        this.f791r = new Rect();
        this.f792s = new Rect();
        this.f793t = new Rect();
        this.f794u = new Rect();
        this.f795v = new Rect();
        this.f796w = new Rect();
        this.f778d = new C0289e(this);
        this.f799z = new RunnableC0297f(this);
        this.f773A = new RunnableC0298g(this);
        m517a(context);
        this.f774B = new C0533r();
    }

    /* renamed from: a */
    private void m517a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f772e);
        this.f779f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f783j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f783j == null);
        obtainStyledAttributes.recycle();
        this.f784k = context.getApplicationInfo().targetSdkVersion < 19;
        this.f798y = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m528b();
    }

    public void setActionBarVisibilityCallback(InterfaceC0299h interfaceC0299h) {
        this.f797x = interfaceC0299h;
        if (getWindowToken() != null) {
            this.f797x.mo205a(this.f780g);
            if (this.f789p != 0) {
                onWindowSystemUiVisibilityChanged(this.f789p);
                C0538w.m1892u(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f785l = z;
        this.f784k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: a */
    public final boolean m526a() {
        return this.f785l;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f786m = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m517a(getContext());
        C0538w.m1892u(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m519j();
        int i2 = this.f789p ^ i;
        this.f789p = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        if (this.f797x != null) {
            this.f797x.mo206d(!z2);
            if (z || !z2) {
                this.f797x.mo208i();
            } else {
                this.f797x.mo209j();
            }
        }
        if ((i2 & 256) == 0 || this.f797x == null) {
            return;
        }
        C0538w.m1892u(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f780g = i;
        if (this.f797x != null) {
            this.f797x.mo205a(i);
        }
    }

    /* renamed from: a */
    private static boolean m518a(View view, Rect rect, boolean z) {
        boolean z2;
        C0300i c0300i = (C0300i) view.getLayoutParams();
        if (c0300i.leftMargin != rect.left) {
            c0300i.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0300i.topMargin != rect.top) {
            c0300i.topMargin = rect.top;
            z2 = true;
        }
        if (c0300i.rightMargin != rect.right) {
            c0300i.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || c0300i.bottomMargin == rect.bottom) {
            return z2;
        }
        c0300i.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m519j();
        C0538w.m1891t(this);
        boolean m518a = m518a(this.f775a, rect, false);
        this.f793t.set(rect);
        C0295ef.m986a(this, this.f793t, this.f790q);
        if (!this.f794u.equals(this.f793t)) {
            this.f794u.set(this.f793t);
            m518a = true;
        }
        if (!this.f791r.equals(this.f790q)) {
            this.f791r.set(this.f790q);
            m518a = true;
        }
        if (m518a) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0300i(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0300i;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m519j();
        measureChildWithMargins(this.f775a, i, 0, i2, 0);
        C0300i c0300i = (C0300i) this.f775a.getLayoutParams();
        int max = Math.max(0, this.f775a.getMeasuredWidth() + c0300i.leftMargin + c0300i.rightMargin);
        int max2 = Math.max(0, this.f775a.getMeasuredHeight() + c0300i.topMargin + c0300i.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f775a.getMeasuredState());
        boolean z = (C0538w.m1891t(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f779f;
            if (this.f786m && this.f775a.getTabContainer() != null) {
                measuredHeight += this.f779f;
            }
        } else {
            measuredHeight = this.f775a.getVisibility() != 8 ? this.f775a.getMeasuredHeight() : 0;
        }
        this.f792s.set(this.f790q);
        this.f795v.set(this.f793t);
        if (!this.f785l && !z) {
            this.f792s.top += measuredHeight;
            this.f792s.bottom += 0;
        } else {
            this.f795v.top += measuredHeight;
            this.f795v.bottom += 0;
        }
        m518a(this.f781h, this.f792s, true);
        if (!this.f796w.equals(this.f795v)) {
            this.f796w.set(this.f795v);
            this.f781h.m582a(this.f795v);
        }
        measureChildWithMargins(this.f781h, i, 0, i2, 0);
        C0300i c0300i2 = (C0300i) this.f781h.getLayoutParams();
        int max3 = Math.max(max, this.f781h.getMeasuredWidth() + c0300i2.leftMargin + c0300i2.rightMargin);
        int max4 = Math.max(max2, this.f781h.getMeasuredHeight() + c0300i2.topMargin + c0300i2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f781h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0300i c0300i = (C0300i) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = c0300i.leftMargin + paddingLeft;
                int i7 = c0300i.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f783j == null || this.f784k) {
            return;
        }
        int bottom = this.f775a.getVisibility() == 0 ? (int) (this.f775a.getBottom() + this.f775a.getTranslationY() + 0.5f) : 0;
        this.f783j.setBounds(0, bottom, getWidth(), this.f783j.getIntrinsicHeight() + bottom);
        this.f783j.draw(canvas);
    }

    @Override // androidx.core.p024g.InterfaceC0532q
    /* renamed from: a */
    public final void mo524a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo523a(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final boolean mo527a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: b */
    public final void mo529b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo522a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo523a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo525a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f775a.getVisibility() != 0) {
            return false;
        }
        return this.f787n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f774B.m1809a(i);
        this.f788o = getActionBarHideOffset();
        m528b();
        if (this.f797x != null) {
            this.f797x.mo210k();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f788o += i2;
        setActionBarHideOffset(this.f788o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onStopNestedScroll(View view) {
        if (!this.f787n || this.f776b) {
            return;
        }
        if (this.f788o <= this.f775a.getHeight()) {
            m528b();
            postDelayed(this.f799z, 600L);
        } else {
            m528b();
            postDelayed(this.f773A, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f787n || !z) {
            return false;
        }
        this.f798y.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.f798y.getFinalY() > this.f775a.getHeight()) {
            m528b();
            this.f773A.run();
        } else {
            m528b();
            this.f799z.run();
        }
        this.f776b = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f774B.m1808a();
    }

    /* renamed from: j */
    private void m519j() {
        if (this.f781h == null) {
            this.f781h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f775a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f782i = m516a(findViewById(R.id.action_bar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static InterfaceC0217bi m516a(View view) {
        if (view instanceof InterfaceC0217bi) {
            return (InterfaceC0217bi) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f787n) {
            this.f787n = z;
            if (z) {
                return;
            }
            m528b();
            setActionBarHideOffset(0);
        }
    }

    public int getActionBarHideOffset() {
        if (this.f775a != null) {
            return -((int) this.f775a.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        m528b();
        this.f775a.setTranslationY(-Math.max(0, Math.min(i, this.f775a.getHeight())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m528b() {
        removeCallbacks(this.f799z);
        removeCallbacks(this.f773A);
        if (this.f777c != null) {
            this.f777c.cancel();
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    public void setWindowCallback(Window.Callback callback) {
        m519j();
        this.f782i.mo822a(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    public void setWindowTitle(CharSequence charSequence) {
        m519j();
        this.f782i.mo825a(charSequence);
    }

    public CharSequence getTitle() {
        m519j();
        return this.f782i.mo833e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: a */
    public final void mo520a(int i) {
        m519j();
        if (i == 2) {
            this.f782i.mo834f();
        } else if (i == 5) {
            this.f782i.mo835g();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public void setIcon(int i) {
        m519j();
        this.f782i.mo819a(i);
    }

    public void setIcon(Drawable drawable) {
        m519j();
        this.f782i.mo820a(drawable);
    }

    public void setLogo(int i) {
        m519j();
        this.f782i.mo828b(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: c */
    public final boolean mo530c() {
        m519j();
        return this.f782i.mo836h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: d */
    public final boolean mo531d() {
        m519j();
        return this.f782i.mo837i();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: e */
    public final boolean mo532e() {
        m519j();
        return this.f782i.mo838j();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: f */
    public final boolean mo533f() {
        m519j();
        return this.f782i.mo839k();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: g */
    public final boolean mo534g() {
        m519j();
        return this.f782i.mo840l();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: h */
    public final void mo535h() {
        m519j();
        this.f782i.mo841m();
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: a */
    public final void mo521a(Menu menu, InterfaceC0145ae interfaceC0145ae) {
        m519j();
        this.f782i.mo821a(menu, interfaceC0145ae);
    }

    @Override // androidx.appcompat.widget.InterfaceC0216bh
    /* renamed from: i */
    public final void mo536i() {
        m519j();
        this.f782i.mo842n();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0300i();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0300i(getContext(), attributeSet);
    }
}
