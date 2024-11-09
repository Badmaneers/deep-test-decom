package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import androidx.customview.p027a.C0590i;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: b */
    static final boolean f2581b;

    /* renamed from: d */
    private static final boolean f2583d;

    /* renamed from: A */
    private float f2584A;

    /* renamed from: B */
    private Drawable f2585B;

    /* renamed from: C */
    private Drawable f2586C;

    /* renamed from: D */
    private Drawable f2587D;

    /* renamed from: E */
    private CharSequence f2588E;

    /* renamed from: F */
    private CharSequence f2589F;

    /* renamed from: G */
    private Object f2590G;

    /* renamed from: H */
    private boolean f2591H;

    /* renamed from: I */
    private Drawable f2592I;

    /* renamed from: J */
    private Drawable f2593J;

    /* renamed from: K */
    private Drawable f2594K;

    /* renamed from: L */
    private Drawable f2595L;

    /* renamed from: M */
    private final ArrayList<View> f2596M;

    /* renamed from: N */
    private Rect f2597N;

    /* renamed from: O */
    private Matrix f2598O;

    /* renamed from: e */
    private final C0602c f2599e;

    /* renamed from: f */
    private float f2600f;

    /* renamed from: g */
    private int f2601g;

    /* renamed from: h */
    private int f2602h;

    /* renamed from: i */
    private float f2603i;

    /* renamed from: j */
    private Paint f2604j;

    /* renamed from: k */
    private final C0590i f2605k;

    /* renamed from: l */
    private final C0590i f2606l;

    /* renamed from: m */
    private final C0606g f2607m;

    /* renamed from: n */
    private final C0606g f2608n;

    /* renamed from: o */
    private int f2609o;

    /* renamed from: p */
    private boolean f2610p;

    /* renamed from: q */
    private boolean f2611q;

    /* renamed from: r */
    private int f2612r;

    /* renamed from: s */
    private int f2613s;

    /* renamed from: t */
    private int f2614t;

    /* renamed from: u */
    private int f2615u;

    /* renamed from: v */
    private boolean f2616v;

    /* renamed from: w */
    private boolean f2617w;

    /* renamed from: x */
    private InterfaceC0603d f2618x;

    /* renamed from: y */
    private List<InterfaceC0603d> f2619y;

    /* renamed from: z */
    private float f2620z;

    /* renamed from: c */
    private static final int[] f2582c = {R.attr.colorPrimaryDark};

    /* renamed from: a */
    static final int[] f2580a = {R.attr.layout_gravity};

    static {
        f2581b = Build.VERSION.SDK_INT >= 19;
        f2583d = Build.VERSION.SDK_INT >= 21;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2599e = new C0602c();
        this.f2602h = -1728053248;
        this.f2604j = new Paint();
        this.f2611q = true;
        this.f2612r = 3;
        this.f2613s = 3;
        this.f2614t = 3;
        this.f2615u = 3;
        this.f2592I = null;
        this.f2593J = null;
        this.f2594K = null;
        this.f2595L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2601g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f2607m = new C0606g(this, 3);
        this.f2608n = new C0606g(this, 5);
        this.f2605k = C0590i.m2104a(this, 1.0f, this.f2607m);
        this.f2605k.m2123a(1);
        this.f2605k.m2122a(f2);
        this.f2607m.m2174a(this.f2605k);
        this.f2606l = C0590i.m2104a(this, 1.0f, this.f2608n);
        this.f2606l.m2123a(2);
        this.f2606l.m2122a(f2);
        this.f2608n.m2174a(this.f2606l);
        setFocusableInTouchMode(true);
        C0538w.m1840a((View) this, 1);
        C0538w.m1849a(this, new C0601b(this));
        setMotionEventSplittingEnabled(false);
        if (C0538w.m1893v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0600a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2582c);
                try {
                    this.f2585B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2585B = null;
            }
        }
        this.f2600f = f * 10.0f;
        this.f2596M = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.f2600f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2157d(childAt)) {
                C0538w.m1839a(childAt, this.f2600f);
            }
        }
    }

    public float getDrawerElevation() {
        if (f2583d) {
            return this.f2600f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void m2167a(Object obj, boolean z) {
        this.f2590G = obj;
        this.f2591H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.f2602h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0603d interfaceC0603d) {
        InterfaceC0603d interfaceC0603d2;
        if (this.f2618x != null && (interfaceC0603d2 = this.f2618x) != null && this.f2619y != null) {
            this.f2619y.remove(interfaceC0603d2);
        }
        if (interfaceC0603d != null && interfaceC0603d != null) {
            if (this.f2619y == null) {
                this.f2619y = new ArrayList();
            }
            this.f2619y.add(interfaceC0603d);
        }
        this.f2618x = interfaceC0603d;
    }

    public void setDrawerLockMode(int i) {
        m2151a(i, 3);
        m2151a(i, 5);
    }

    /* renamed from: a */
    private void m2151a(int i, int i2) {
        int m1777a = C0521f.m1777a(i2, C0538w.m1878h(this));
        if (i2 == 3) {
            this.f2612r = i;
        } else if (i2 == 5) {
            this.f2613s = i;
        } else if (i2 == 8388611) {
            this.f2614t = i;
        } else if (i2 == 8388613) {
            this.f2615u = i;
        }
        if (i != 0) {
            (m1777a == 3 ? this.f2605k : this.f2606l).m2134e();
        }
        switch (i) {
            case 1:
                View m2169b = m2169b(m1777a);
                if (m2169b != null) {
                    m2161i(m2169b);
                    return;
                }
                return;
            case 2:
                View m2169b2 = m2169b(m1777a);
                if (m2169b2 != null) {
                    m2160h(m2169b2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final int m2162a(View view) {
        if (!m2157d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((C0604e) view.getLayoutParams()).f2629a;
        int m1878h = C0538w.m1878h(this);
        if (i == 3) {
            if (this.f2612r != 3) {
                return this.f2612r;
            }
            int i2 = m1878h == 0 ? this.f2614t : this.f2615u;
            if (i2 != 3) {
                return i2;
            }
            return 0;
        }
        if (i == 5) {
            if (this.f2613s != 3) {
                return this.f2613s;
            }
            int i3 = m1878h == 0 ? this.f2615u : this.f2614t;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 8388611) {
            if (this.f2614t != 3) {
                return this.f2614t;
            }
            int i4 = m1878h == 0 ? this.f2612r : this.f2613s;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        if (this.f2615u != 3) {
            return this.f2615u;
        }
        int i5 = m1878h == 0 ? this.f2613s : this.f2612r;
        if (i5 != 3) {
            return i5;
        }
        return 0;
    }

    /* renamed from: a */
    public final CharSequence m2164a(int i) {
        int m1777a = C0521f.m1777a(i, C0538w.m1878h(this));
        if (m1777a == 3) {
            return this.f2588E;
        }
        if (m1777a == 5) {
            return this.f2589F;
        }
        return null;
    }

    /* renamed from: a */
    public final void m2165a(int i, View view) {
        View rootView;
        int m2121a = this.f2605k.m2121a();
        int m2121a2 = this.f2606l.m2121a();
        int i2 = 2;
        if (m2121a == 1 || m2121a2 == 1) {
            i2 = 1;
        } else if (m2121a != 2 && m2121a2 != 2) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            C0604e c0604e = (C0604e) view.getLayoutParams();
            if (c0604e.f2630b == 0.0f) {
                C0604e c0604e2 = (C0604e) view.getLayoutParams();
                if ((c0604e2.f2632d & 1) == 1) {
                    c0604e2.f2632d = 0;
                    if (this.f2619y != null) {
                        for (int size = this.f2619y.size() - 1; size >= 0; size--) {
                            this.f2619y.get(size);
                        }
                    }
                    m2152a(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (c0604e.f2630b == 1.0f) {
                C0604e c0604e3 = (C0604e) view.getLayoutParams();
                if ((c0604e3.f2632d & 1) == 0) {
                    c0604e3.f2632d = 1;
                    if (this.f2619y != null) {
                        for (int size2 = this.f2619y.size() - 1; size2 >= 0; size2--) {
                            this.f2619y.get(size2);
                        }
                    }
                    m2152a(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f2609o) {
            this.f2609o = i2;
            if (this.f2619y != null) {
                for (int size3 = this.f2619y.size() - 1; size3 >= 0; size3--) {
                    this.f2619y.get(size3);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2152a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m2157d(childAt)) || (z && childAt == view)) {
                C0538w.m1840a(childAt, 1);
            } else {
                C0538w.m1840a(childAt, 4);
            }
        }
    }

    /* renamed from: a */
    public final void m2166a(View view, float f) {
        C0604e c0604e = (C0604e) view.getLayoutParams();
        if (f == c0604e.f2630b) {
            return;
        }
        c0604e.f2630b = f;
        if (this.f2619y != null) {
            for (int size = this.f2619y.size() - 1; size >= 0; size--) {
                this.f2619y.get(size);
            }
        }
    }

    /* renamed from: b */
    public static float m2155b(View view) {
        return ((C0604e) view.getLayoutParams()).f2630b;
    }

    /* renamed from: c */
    public final int m2171c(View view) {
        return C0521f.m1777a(((C0604e) view.getLayoutParams()).f2629a, C0538w.m1878h(this));
    }

    /* renamed from: a */
    public final boolean m2168a(View view, int i) {
        return (m2171c(view) & i) == i;
    }

    /* renamed from: c */
    private View m2156c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0604e) childAt.getLayoutParams()).f2632d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final View m2169b(int i) {
        int m1777a = C0521f.m1777a(i, C0538w.m1878h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2171c(childAt) & 7) == m1777a) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2611q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2611q = true;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        String str;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f2590G != null && C0538w.m1893v(this);
        int m1878h = C0538w.m1878h(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0604e c0604e = (C0604e) childAt.getLayoutParams();
                if (z) {
                    int m1777a = C0521f.m1777a(c0604e.f2629a, m1878h);
                    if (C0538w.m1893v(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f2590G;
                            if (m1777a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (m1777a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f2590G;
                        if (m1777a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m1777a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        c0604e.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        c0604e.topMargin = windowInsets2.getSystemWindowInsetTop();
                        c0604e.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        c0604e.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m2159g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - c0604e.leftMargin) - c0604e.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - c0604e.topMargin) - c0604e.bottomMargin, 1073741824));
                } else if (m2157d(childAt)) {
                    if (f2583d && C0538w.m1888q(childAt) != this.f2600f) {
                        C0538w.m1839a(childAt, this.f2600f);
                    }
                    int m2171c = m2171c(childAt) & 7;
                    int i5 = m2171c == 3 ? 1 : i3;
                    if ((i5 != 0 && z2) || (i5 == 0 && z3)) {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        if ((m2171c & 3) != 3) {
                            str = (m2171c & 5) == 5 ? "RIGHT" : Integer.toHexString(m2171c);
                        } else {
                            str = "LEFT";
                        }
                        sb.append(str);
                        sb.append(" but this DrawerLayout already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(getChildMeasureSpec(i, this.f2601g + c0604e.leftMargin + c0604e.rightMargin, c0604e.width), getChildMeasureSpec(i2, c0604e.topMargin + c0604e.bottomMargin, c0604e.height));
                    i4++;
                    i3 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    /* renamed from: a */
    private static boolean m2154a(Drawable drawable, int i) {
        if (drawable == null || !C0546a.m1927a(drawable)) {
            return false;
        }
        C0546a.m1929b(drawable, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2 = true;
        this.f2610p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0604e c0604e = (C0604e) childAt.getLayoutParams();
                if (m2159g(childAt)) {
                    childAt.layout(c0604e.leftMargin, c0604e.topMargin, c0604e.leftMargin + childAt.getMeasuredWidth(), c0604e.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2168a(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c0604e.f2630b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r12) / f3;
                        i5 = i6 - ((int) (c0604e.f2630b * f3));
                    }
                    boolean z3 = f != c0604e.f2630b ? z2 : false;
                    int i8 = c0604e.f2629a & 112;
                    if (i8 == 16) {
                        int i9 = i4 - i2;
                        int i10 = (i9 - measuredHeight) / 2;
                        if (i10 < c0604e.topMargin) {
                            i10 = c0604e.topMargin;
                        } else if (i10 + measuredHeight > i9 - c0604e.bottomMargin) {
                            i10 = (i9 - c0604e.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i10, measuredWidth + i5, measuredHeight + i10);
                    } else if (i8 != 80) {
                        childAt.layout(i5, c0604e.topMargin, measuredWidth + i5, c0604e.topMargin + measuredHeight);
                    } else {
                        int i11 = i4 - i2;
                        childAt.layout(i5, (i11 - c0604e.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i11 - c0604e.bottomMargin);
                    }
                    if (z3) {
                        m2166a(childAt, f);
                    }
                    int i12 = c0604e.f2630b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i12) {
                        childAt.setVisibility(i12);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        this.f2610p = false;
        this.f2611q = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2610p) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0604e) getChildAt(i).getLayoutParams()).f2630b);
        }
        this.f2603i = f;
        boolean m2136g = this.f2605k.m2136g();
        boolean m2136g2 = this.f2606l.m2136g();
        if (m2136g || m2136g2) {
            C0538w.m1874f(this);
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2585B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2585B;
    }

    public void setStatusBarBackground(int i) {
        this.f2585B = i != 0 ? C0420a.m1483a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2585B = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2591H || this.f2585B == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || this.f2590G == null) ? 0 : ((WindowInsets) this.f2590G).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f2585B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2585B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean m2159g = m2159g(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (m2159g) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && m2157d(childAt) && childAt.getHeight() >= height) {
                        if (m2168a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < i) {
                                i = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f2603i > 0.0f && m2159g) {
            this.f2604j.setColor((((int) (((this.f2602h & (-16777216)) >>> 24) * this.f2603i)) << 24) | (this.f2602h & 16777215));
            canvas.drawRect(i2, 0.0f, i, getHeight(), this.f2604j);
        } else if (this.f2586C != null && m2168a(view, 3)) {
            int intrinsicWidth = this.f2586C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f2605k.m2128b(), 1.0f));
            this.f2586C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f2586C.setAlpha((int) (max * 255.0f));
            this.f2586C.draw(canvas);
        } else if (this.f2587D != null && m2168a(view, 5)) {
            int intrinsicWidth2 = this.f2587D.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f2606l.m2128b(), 1.0f));
            this.f2587D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f2587D.setAlpha((int) (max2 * 255.0f));
            this.f2587D.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: g */
    private static boolean m2159g(View view) {
        return ((C0604e) view.getLayoutParams()).f2629a == 0;
    }

    /* renamed from: d */
    public static boolean m2157d(View view) {
        int m1777a = C0521f.m1777a(((C0604e) view.getLayoutParams()).f2629a, C0538w.m1878h(view));
        return ((m1777a & 3) == 0 && (m1777a & 5) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View m2129b;
        int actionMasked = motionEvent.getActionMasked();
        boolean m2126a = this.f2605k.m2126a(motionEvent) | this.f2606l.m2126a(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f2620z = x;
                this.f2584A = y;
                z = this.f2603i > 0.0f && (m2129b = this.f2605k.m2129b((int) x, (int) y)) != null && m2159g(m2129b);
                this.f2616v = false;
                this.f2617w = false;
                break;
            case 1:
            case 3:
                m2153a(true);
                this.f2616v = false;
                this.f2617w = false;
                z = false;
                break;
            case 2:
                if (this.f2605k.m2137h()) {
                    this.f2607m.m2175c();
                    this.f2608n.m2175c();
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        if (!m2126a && !z) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    z2 = false;
                } else if (((C0604e) getChildAt(i).getLayoutParams()).f2631c) {
                    z2 = true;
                } else {
                    i++;
                }
            }
            if (!z2 && !this.f2617w) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2603i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f2597N == null) {
                this.f2597N = new Rect();
            }
            childAt.getHitRect(this.f2597N);
            if (this.f2597N.contains((int) x, (int) y) && !m2159g(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f2598O == null) {
                            this.f2598O = new Matrix();
                        }
                        matrix.invert(this.f2598O);
                        obtain.transform(this.f2598O);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m2156c;
        this.f2605k.m2131b(motionEvent);
        this.f2606l.m2131b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f2620z = x;
                    this.f2584A = y;
                    this.f2616v = false;
                    this.f2617w = false;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View m2129b = this.f2605k.m2129b((int) x2, (int) y2);
                    if (m2129b != null && m2159g(m2129b)) {
                        float f = x2 - this.f2620z;
                        float f2 = y2 - this.f2584A;
                        int m2133d = this.f2605k.m2133d();
                        if ((f * f) + (f2 * f2) < m2133d * m2133d && (m2156c = m2156c()) != null && m2162a(m2156c) != 2) {
                            z = false;
                            m2153a(z);
                            this.f2616v = false;
                            break;
                        }
                    }
                    z = true;
                    m2153a(z);
                    this.f2616v = false;
                    break;
            }
        } else {
            m2153a(true);
            this.f2616v = false;
            this.f2617w = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f2616v = z;
        if (z) {
            m2153a(true);
        }
    }

    /* renamed from: a */
    private void m2153a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0604e c0604e = (C0604e) childAt.getLayoutParams();
            if (m2157d(childAt) && (!z || c0604e.f2631c)) {
                int width = childAt.getWidth();
                if (m2168a(childAt, 3)) {
                    z2 |= this.f2605k.m2127a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.f2606l.m2127a(childAt, getWidth(), childAt.getTop());
                }
                c0604e.f2631c = false;
            }
        }
        this.f2607m.m2175c();
        this.f2608n.m2175c();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: h */
    private void m2160h(View view) {
        if (!m2157d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0604e c0604e = (C0604e) view.getLayoutParams();
        if (this.f2611q) {
            c0604e.f2630b = 1.0f;
            c0604e.f2632d = 1;
            m2152a(view, true);
        } else {
            c0604e.f2632d |= 2;
            if (m2168a(view, 3)) {
                this.f2605k.m2127a(view, 0, view.getTop());
            } else {
                this.f2606l.m2127a(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* renamed from: e */
    public final void m2172e(View view) {
        m2161i(view);
    }

    /* renamed from: i */
    private void m2161i(View view) {
        if (!m2157d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0604e c0604e = (C0604e) view.getLayoutParams();
        if (this.f2611q) {
            c0604e.f2630b = 0.0f;
            c0604e.f2632d = 0;
        } else {
            c0604e.f2632d |= 4;
            if (m2168a(view, 3)) {
                this.f2605k.m2127a(view, -view.getWidth(), view.getTop());
            } else {
                this.f2606l.m2127a(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0604e();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0604e ? new C0604e((C0604e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0604e((ViewGroup.MarginLayoutParams) layoutParams) : new C0604e(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0604e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0604e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m2157d(childAt)) {
                this.f2596M.add(childAt);
            } else {
                if (!m2157d(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if ((((C0604e) childAt.getLayoutParams()).f2632d & 1) == 1) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
        }
        if (!z) {
            int size = this.f2596M.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f2596M.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f2596M.clear();
    }

    /* renamed from: a */
    public final View m2163a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2157d(childAt)) {
                if (!m2157d(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C0604e) childAt.getLayoutParams()).f2630b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m2170b() {
        if (this.f2617w) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f2617w = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m2163a = m2163a();
            if (m2163a != null && m2162a(m2163a) == 0) {
                m2153a(false);
            }
            return m2163a != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m2169b;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        if (savedState.f2621a != 0 && (m2169b = m2169b(savedState.f2621a)) != null) {
            m2160h(m2169b);
        }
        if (savedState.f2622b != 3) {
            m2151a(savedState.f2622b, 3);
        }
        if (savedState.f2623d != 3) {
            m2151a(savedState.f2623d, 5);
        }
        if (savedState.f2624e != 3) {
            m2151a(savedState.f2624e, 8388611);
        }
        if (savedState.f2625f != 3) {
            m2151a(savedState.f2625f, 8388613);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0604e c0604e = (C0604e) getChildAt(i).getLayoutParams();
            boolean z = c0604e.f2632d == 1;
            boolean z2 = c0604e.f2632d == 2;
            if (z || z2) {
                savedState.f2621a = c0604e.f2629a;
                break;
            }
        }
        savedState.f2622b = this.f2612r;
        savedState.f2623d = this.f2613s;
        savedState.f2624e = this.f2614t;
        savedState.f2625f = this.f2615u;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2156c() != null || m2157d(view)) {
            C0538w.m1840a(view, 4);
        } else {
            C0538w.m1840a(view, 1);
        }
        if (f2581b) {
            return;
        }
        C0538w.m1849a(view, this.f2599e);
    }

    /* renamed from: f */
    public static boolean m2158f(View view) {
        return (C0538w.m1876g(view) == 4 || C0538w.m1876g(view) == 2) ? false : true;
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0605f();

        /* renamed from: a */
        int f2621a;

        /* renamed from: b */
        int f2622b;

        /* renamed from: d */
        int f2623d;

        /* renamed from: e */
        int f2624e;

        /* renamed from: f */
        int f2625f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2621a = 0;
            this.f2621a = parcel.readInt();
            this.f2622b = parcel.readInt();
            this.f2623d = parcel.readInt();
            this.f2624e = parcel.readInt();
            this.f2625f = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f2621a = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2621a);
            parcel.writeInt(this.f2622b);
            parcel.writeInt(this.f2623d);
            parcel.writeInt(this.f2624e);
            parcel.writeInt(this.f2625f);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable;
        Drawable drawable2;
        if (f2583d) {
            return;
        }
        int m1878h = C0538w.m1878h(this);
        if (m1878h == 0) {
            if (this.f2592I != null) {
                m2154a(this.f2592I, m1878h);
                drawable = this.f2592I;
            }
            drawable = this.f2594K;
        } else {
            if (this.f2593J != null) {
                m2154a(this.f2593J, m1878h);
                drawable = this.f2593J;
            }
            drawable = this.f2594K;
        }
        this.f2586C = drawable;
        int m1878h2 = C0538w.m1878h(this);
        if (m1878h2 == 0) {
            if (this.f2593J != null) {
                m2154a(this.f2593J, m1878h2);
                drawable2 = this.f2593J;
            }
            drawable2 = this.f2595L;
        } else {
            if (this.f2592I != null) {
                m2154a(this.f2592I, m1878h2);
                drawable2 = this.f2592I;
            }
            drawable2 = this.f2595L;
        }
        this.f2587D = drawable2;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m2163a() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
