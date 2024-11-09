package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.p024g.C0529n;
import androidx.core.p024g.C0533r;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0528m;
import androidx.core.p024g.InterfaceC0532q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0528m, InterfaceC0532q {

    /* renamed from: w */
    private static final C0573k f2452w = new C0573k();

    /* renamed from: x */
    private static final int[] f2453x = {R.attr.fillViewport};

    /* renamed from: A */
    private float f2454A;

    /* renamed from: B */
    private InterfaceC0574l f2455B;

    /* renamed from: a */
    private long f2456a;

    /* renamed from: b */
    private final Rect f2457b;

    /* renamed from: c */
    private OverScroller f2458c;

    /* renamed from: d */
    private EdgeEffect f2459d;

    /* renamed from: e */
    private EdgeEffect f2460e;

    /* renamed from: f */
    private int f2461f;

    /* renamed from: g */
    private boolean f2462g;

    /* renamed from: h */
    private boolean f2463h;

    /* renamed from: i */
    private View f2464i;

    /* renamed from: j */
    private boolean f2465j;

    /* renamed from: k */
    private VelocityTracker f2466k;

    /* renamed from: l */
    private boolean f2467l;

    /* renamed from: m */
    private boolean f2468m;

    /* renamed from: n */
    private int f2469n;

    /* renamed from: o */
    private int f2470o;

    /* renamed from: p */
    private int f2471p;

    /* renamed from: q */
    private int f2472q;

    /* renamed from: r */
    private final int[] f2473r;

    /* renamed from: s */
    private final int[] f2474s;

    /* renamed from: t */
    private int f2475t;

    /* renamed from: u */
    private int f2476u;

    /* renamed from: v */
    private SavedState f2477v;

    /* renamed from: y */
    private final C0533r f2478y;

    /* renamed from: z */
    private final C0529n f2479z;

    /* renamed from: b */
    private static int m1998b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final boolean mo527a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2457b = new Rect();
        this.f2462g = true;
        this.f2463h = false;
        this.f2464i = null;
        this.f2465j = false;
        this.f2468m = true;
        this.f2472q = -1;
        this.f2473r = new int[2];
        this.f2474s = new int[2];
        this.f2458c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2469n = viewConfiguration.getScaledTouchSlop();
        this.f2470o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2471p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2453x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2478y = new C0533r();
        this.f2479z = new C0529n(this);
        setNestedScrollingEnabled(true);
        C0538w.m1849a(this, f2452w);
    }

    /* renamed from: a */
    private void m1987a(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f2479z.m1793a(0, i, 0, i2, iArr, i3, iArr2);
    }

    /* renamed from: a */
    private boolean m1991a(int i, int i2) {
        return this.f2479z.m1799a(i, i2);
    }

    /* renamed from: b */
    private void m2000b(int i) {
        this.f2479z.m1807c(i);
    }

    /* renamed from: c */
    private boolean m2003c(int i) {
        return this.f2479z.m1798a(i);
    }

    /* renamed from: a */
    private boolean m1994a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2479z.m1803a(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f2479z.m1794a(z);
    }

    @Override // android.view.View, androidx.core.p024g.InterfaceC0526k
    public boolean isNestedScrollingEnabled() {
        return this.f2479z.m1795a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m1991a(i, 0);
    }

    @Override // android.view.View, androidx.core.p024g.InterfaceC0526k
    public void stopNestedScroll() {
        m2000b(0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m2003c(0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2479z.m1800a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1994a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2479z.m1797a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2479z.m1796a(f, f2);
    }

    @Override // androidx.core.p024g.InterfaceC0532q
    /* renamed from: a */
    public final void mo524a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1986a(i4, i5, iArr);
    }

    /* renamed from: a */
    private void m1986a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2479z.m1793a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: b */
    public final void mo529b(View view, View view2, int i, int i2) {
        this.f2478y.m1810a(i, i2);
        m1991a(2, i2);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo522a(View view, int i) {
        this.f2478y.m1812b(i);
        m2000b(i);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo523a(View view, int i, int i2, int i3, int i4, int i5) {
        m1986a(i4, i5, (int[]) null);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo525a(View view, int i, int i2, int[] iArr, int i3) {
        m1994a(i, i2, iArr, (int[]) null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo527a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo529b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onStopNestedScroll(View view) {
        mo522a(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1986a(i4, 0, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo525a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m2011h((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2478y.m1808a();
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(InterfaceC0574l interfaceC0574l) {
        this.f2455B = interfaceC0574l;
    }

    /* renamed from: a */
    private boolean m1990a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2467l) {
            this.f2467l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2468m = z;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f2455B != null) {
            this.f2455B.mo231a(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2467l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2013a(keyEvent);
    }

    /* renamed from: a */
    public final boolean m2013a(KeyEvent keyEvent) {
        this.f2457b.setEmpty();
        if (!m1990a()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 62) {
            switch (keyCode) {
                case 19:
                    if (!keyEvent.isAltPressed()) {
                        return m2009f(33);
                    }
                    return m2007e(33);
                case 20:
                    if (!keyEvent.isAltPressed()) {
                        return m2009f(130);
                    }
                    return m2007e(130);
                default:
                    return false;
            }
        }
        m2005d(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    /* renamed from: b */
    private void m1999b() {
        if (this.f2466k == null) {
            this.f2466k = VelocityTracker.obtain();
        }
    }

    /* renamed from: c */
    private void m2002c() {
        if (this.f2466k != null) {
            this.f2466k.recycle();
            this.f2466k = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2002c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m1999b();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2475t = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f2475t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f2458c.isFinished();
                    this.f2465j = z;
                    if (z && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!this.f2458c.isFinished()) {
                        m2004d();
                    }
                    this.f2461f = (int) motionEvent.getY();
                    this.f2472q = motionEvent.getPointerId(0);
                    m1991a(2, 0);
                    break;
                } else {
                    return false;
                }
                break;
            case 1:
                VelocityTracker velocityTracker = this.f2466k;
                velocityTracker.computeCurrentVelocity(1000, this.f2471p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2472q);
                if (Math.abs(yVelocity) >= this.f2470o) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        m2011h(i);
                    }
                } else if (this.f2458c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0538w.m1874f(this);
                }
                this.f2472q = -1;
                m2006e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f2472q);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2472q + " in onTouchEvent");
                    break;
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f2461f - y;
                    if (!this.f2465j && Math.abs(i2) > this.f2469n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2465j = true;
                        i2 = i2 > 0 ? i2 - this.f2469n : i2 + this.f2469n;
                    }
                    int i3 = i2;
                    if (this.f2465j) {
                        if (m1994a(0, i3, this.f2474s, this.f2473r, 0)) {
                            i3 -= this.f2474s[1];
                            this.f2475t += this.f2473r[1];
                        }
                        this.f2461f = y - this.f2473r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m1993a(i3, 0, getScrollY(), scrollRange) && !m2003c(0)) {
                            this.f2466k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        this.f2474s[1] = 0;
                        m1987a(scrollY2, i3 - scrollY2, this.f2473r, 0, this.f2474s);
                        this.f2461f -= this.f2473r[1];
                        this.f2475t += this.f2473r[1];
                        if (z2) {
                            int i4 = i3 - this.f2474s[1];
                            m2008f();
                            int i5 = scrollY + i4;
                            if (i5 < 0) {
                                C0570h.m2038a(this.f2459d, i4 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.f2460e.isFinished()) {
                                    this.f2460e.onRelease();
                                }
                            } else if (i5 > scrollRange) {
                                C0570h.m2038a(this.f2460e, i4 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                if (!this.f2459d.isFinished()) {
                                    this.f2459d.onRelease();
                                }
                            }
                            if (this.f2459d != null && (!this.f2459d.isFinished() || !this.f2460e.isFinished())) {
                                C0538w.m1874f(this);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                if (this.f2465j && getChildCount() > 0 && this.f2458c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0538w.m1874f(this);
                }
                this.f2472q = -1;
                m2006e();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f2461f = (int) motionEvent.getY(actionIndex);
                this.f2472q = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                m1988a(motionEvent);
                this.f2461f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2472q));
                break;
        }
        if (this.f2466k != null) {
            this.f2466k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private void m1988a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2472q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2461f = (int) motionEvent.getY(i);
            this.f2472q = motionEvent.getPointerId(i);
            if (this.f2466k != null) {
                this.f2466k.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2465j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2454A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2454A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2454A;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* renamed from: a */
    private boolean m1993a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i + i3;
        int i7 = i4 + 0;
        if (i5 <= 0 && i5 >= 0) {
            z = false;
        } else {
            z = true;
            i5 = 0;
        }
        if (i6 > i7) {
            z2 = true;
        } else if (i6 < 0) {
            z2 = true;
            i7 = 0;
        } else {
            i7 = i6;
            z2 = false;
        }
        if (z2 && !m2003c(1)) {
            this.f2458c.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i7, z, z2);
        return z || z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: a */
    private View m1984a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        boolean z2 = false;
        View view = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: d */
    private boolean m2005d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2457b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f2457b.top + height > bottom) {
                    this.f2457b.top = bottom - height;
                }
            }
        } else {
            this.f2457b.top = getScrollY() - height;
            if (this.f2457b.top < 0) {
                this.f2457b.top = 0;
            }
        }
        this.f2457b.bottom = this.f2457b.top + height;
        return m1992a(i, this.f2457b.top, this.f2457b.bottom);
    }

    /* renamed from: e */
    private boolean m2007e(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.f2457b.top = 0;
        this.f2457b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2457b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            this.f2457b.top = this.f2457b.bottom - height;
        }
        return m1992a(i, this.f2457b.top, this.f2457b.bottom);
    }

    /* renamed from: a */
    private boolean m1992a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m1984a = m1984a(z2, i2, i3);
        if (m1984a == null) {
            m1984a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2010g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m1984a != findFocus()) {
            m1984a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: f */
    private boolean m2009f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m1996a(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f2457b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2457b);
            m2010g(m1983a(this.f2457b));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2010g(maxScrollAmount);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1995a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: a */
    private boolean m1995a(View view) {
        return !m1996a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1996a(View view, int i, int i2) {
        view.getDrawingRect(this.f2457b);
        offsetDescendantRectToMyCoords(view, this.f2457b);
        return this.f2457b.bottom + i >= getScrollY() && this.f2457b.top - i <= getScrollY() + i2;
    }

    /* renamed from: g */
    private void m2010g(int i) {
        if (i != 0) {
            if (!this.f2468m) {
                scrollBy(0, i);
            } else {
                m1985a(0, i, false);
            }
        }
    }

    /* renamed from: a */
    private void m1985a(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2456a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2458c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
            m1989a(z);
        } else {
            if (!this.f2458c.isFinished()) {
                m2004d();
            }
            scrollBy(i, i2);
        }
        this.f2456a = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2012a(int i) {
        m1985a(0 - getScrollX(), i - getScrollY(), true);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2458c.isFinished()) {
            return;
        }
        this.f2458c.computeScrollOffset();
        int currY = this.f2458c.getCurrY();
        int i = currY - this.f2476u;
        this.f2476u = currY;
        boolean z = false;
        this.f2474s[1] = 0;
        m1994a(0, i, this.f2474s, (int[]) null, 1);
        int i2 = i - this.f2474s[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m1993a(i2, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            this.f2474s[1] = 0;
            m1987a(scrollY2, i3, this.f2473r, 1, this.f2474s);
            i2 = i3 - this.f2474s[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m2008f();
                if (i2 < 0) {
                    if (this.f2459d.isFinished()) {
                        this.f2459d.onAbsorb((int) this.f2458c.getCurrVelocity());
                    }
                } else if (this.f2460e.isFinished()) {
                    this.f2460e.onAbsorb((int) this.f2458c.getCurrVelocity());
                }
            }
            m2004d();
        }
        if (!this.f2458c.isFinished()) {
            C0538w.m1874f(this);
        } else {
            m2000b(1);
        }
    }

    /* renamed from: a */
    private void m1989a(boolean z) {
        if (z) {
            m1991a(2, 1);
        } else {
            m2000b(1);
        }
        this.f2476u = getScrollY();
        C0538w.m1874f(this);
    }

    /* renamed from: d */
    private void m2004d() {
        this.f2458c.abortAnimation();
        m2000b(1);
    }

    /* renamed from: b */
    private void m2001b(View view) {
        view.getDrawingRect(this.f2457b);
        offsetDescendantRectToMyCoords(view, this.f2457b);
        int m1983a = m1983a(this.f2457b);
        if (m1983a != 0) {
            scrollBy(0, m1983a);
        }
    }

    /* renamed from: a */
    private int m1983a(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = (rect.top - scrollY) + 0;
            } else {
                i2 = (rect.bottom - i4) + 0;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i4 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return Math.max(i, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2462g) {
            m2001b(view2);
        } else {
            this.f2464i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || m1995a(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m1983a = m1983a(rect);
        boolean z2 = m1983a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m1983a);
            } else {
                m1985a(0, m1983a, false);
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2462g = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2462g = false;
        if (this.f2464i != null && m1997a(this.f2464i, this)) {
            m2001b(this.f2464i);
        }
        this.f2464i = null;
        if (!this.f2463h) {
            if (this.f2477v != null) {
                scrollTo(getScrollX(), this.f2477v.f2480a);
                this.f2477v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m1998b = m1998b(scrollY, paddingTop, i5);
            if (m1998b != scrollY) {
                scrollTo(getScrollX(), m1998b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2463h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2463h = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1996a(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f2457b);
        offsetDescendantRectToMyCoords(findFocus, this.f2457b);
        m2010g(m1983a(this.f2457b));
    }

    /* renamed from: a */
    private static boolean m1997a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1997a((View) parent, view2);
    }

    /* renamed from: h */
    private void m2011h(int i) {
        if (getChildCount() > 0) {
            this.f2458c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            m1989a(true);
        }
    }

    /* renamed from: e */
    private void m2006e() {
        this.f2465j = false;
        m2002c();
        m2000b(0);
        if (this.f2459d != null) {
            this.f2459d.onRelease();
            this.f2460e.onRelease();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m1998b = m1998b(i, width, width2);
            int m1998b2 = m1998b(i2, height, height2);
            if (m1998b == getScrollX() && m1998b2 == getScrollY()) {
                return;
            }
            super.scrollTo(m1998b, m1998b2);
        }
    }

    /* renamed from: f */
    private void m2008f() {
        if (getOverScrollMode() != 2) {
            if (this.f2459d == null) {
                Context context = getContext();
                this.f2459d = new EdgeEffect(context);
                this.f2460e = new EdgeEffect(context);
                return;
            }
            return;
        }
        this.f2459d = null;
        this.f2460e = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f2459d != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f2459d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f2459d.setSize(width, height);
                if (this.f2459d.draw(canvas)) {
                    C0538w.m1874f(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f2460e.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f2460e.setSize(width2, height2);
            if (this.f2460e.draw(canvas)) {
                C0538w.m1874f(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2477v = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2480a = getScrollY();
        return savedState;
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0575m();

        /* renamed from: a */
        public int f2480a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2480a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2480a);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2480a + "}";
        }
    }
}
