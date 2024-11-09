package androidx.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import androidx.customview.p027a.C0590i;
import androidx.customview.view.AbsSavedState;
import com.facebook.rebound.C1879j;
import com.facebook.rebound.C1881l;
import com.facebook.rebound.C1885p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ColorDrawerLayout extends ViewGroup {

    /* renamed from: b */
    static final boolean f4570b;

    /* renamed from: d */
    private static final boolean f4572d;

    /* renamed from: A */
    private int f4573A;

    /* renamed from: B */
    private int f4574B;

    /* renamed from: C */
    private int f4575C;

    /* renamed from: D */
    private int f4576D;

    /* renamed from: E */
    private boolean f4577E;

    /* renamed from: F */
    private boolean f4578F;

    /* renamed from: G */
    private InterfaceC1148f f4579G;

    /* renamed from: H */
    private List<InterfaceC1148f> f4580H;

    /* renamed from: I */
    private float f4581I;

    /* renamed from: J */
    private float f4582J;

    /* renamed from: K */
    private Drawable f4583K;

    /* renamed from: L */
    private Drawable f4584L;

    /* renamed from: M */
    private Drawable f4585M;

    /* renamed from: N */
    private Drawable f4586N;

    /* renamed from: O */
    private CharSequence f4587O;

    /* renamed from: P */
    private CharSequence f4588P;

    /* renamed from: Q */
    private CharSequence f4589Q;

    /* renamed from: R */
    private Object f4590R;

    /* renamed from: S */
    private boolean f4591S;

    /* renamed from: T */
    private Drawable f4592T;

    /* renamed from: U */
    private Drawable f4593U;

    /* renamed from: V */
    private Drawable f4594V;

    /* renamed from: W */
    private Drawable f4595W;

    /* renamed from: aa */
    private Drawable f4596aa;

    /* renamed from: ab */
    private final ArrayList<View> f4597ab;

    /* renamed from: ac */
    private Rect f4598ac;

    /* renamed from: ad */
    private Matrix f4599ad;

    /* renamed from: ae */
    private InterfaceC1146d f4600ae;

    /* renamed from: af */
    private int f4601af;

    /* renamed from: ag */
    private C1885p f4602ag;

    /* renamed from: ah */
    private C1879j f4603ah;

    /* renamed from: ai */
    private C1881l f4604ai;

    /* renamed from: aj */
    private View f4605aj;

    /* renamed from: ak */
    private int f4606ak;

    /* renamed from: al */
    private int f4607al;

    /* renamed from: e */
    private final C1147e f4608e;

    /* renamed from: f */
    private float f4609f;

    /* renamed from: g */
    private int f4610g;

    /* renamed from: h */
    private int f4611h;

    /* renamed from: i */
    private float f4612i;

    /* renamed from: j */
    private Paint f4613j;

    /* renamed from: k */
    private final C0590i f4614k;

    /* renamed from: l */
    private final C0590i f4615l;

    /* renamed from: m */
    private final C0590i f4616m;

    /* renamed from: n */
    private final C1151i f4617n;

    /* renamed from: o */
    private final C1151i f4618o;

    /* renamed from: p */
    private final C1151i f4619p;

    /* renamed from: q */
    private Rect f4620q;

    /* renamed from: r */
    private int f4621r;

    /* renamed from: s */
    private boolean f4622s;

    /* renamed from: t */
    private boolean f4623t;

    /* renamed from: u */
    private int f4624u;

    /* renamed from: v */
    private int f4625v;

    /* renamed from: w */
    private boolean f4626w;

    /* renamed from: x */
    private boolean f4627x;

    /* renamed from: y */
    private boolean f4628y;

    /* renamed from: z */
    private int f4629z;

    /* renamed from: c */
    private static final int[] f4571c = {R.attr.colorPrimaryDark};

    /* renamed from: a */
    static final int[] f4569a = {R.attr.layout_gravity};

    static {
        f4570b = Build.VERSION.SDK_INT >= 19;
        f4572d = Build.VERSION.SDK_INT >= 21;
    }

    public ColorDrawerLayout(Context context) {
        this(context, null);
    }

    public ColorDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4608e = new C1147e();
        this.f4611h = -1728053248;
        this.f4613j = new Paint();
        this.f4620q = new Rect();
        this.f4621r = 0;
        this.f4627x = true;
        this.f4628y = true;
        this.f4629z = 3;
        this.f4573A = 3;
        this.f4574B = 3;
        this.f4575C = 3;
        this.f4576D = 3;
        this.f4592T = null;
        this.f4593U = null;
        this.f4594V = null;
        this.f4595W = null;
        this.f4596aa = null;
        this.f4602ag = C1885p.m6031b();
        this.f4603ah = this.f4602ag.m6006a();
        this.f4604ai = C1881l.m6026a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f4610g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        Point point = new Point();
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        this.f4601af = point.y;
        this.f4617n = new C1151i(this, 3);
        this.f4618o = new C1151i(this, 5);
        this.f4619p = new C1151i(this, 80);
        this.f4614k = C0590i.m2104a(this, 1.0f, this.f4617n);
        this.f4614k.m2123a(1);
        this.f4614k.m2122a(f2);
        this.f4617n.m3806a(this.f4614k);
        this.f4615l = C0590i.m2104a(this, 1.0f, this.f4618o);
        this.f4615l.m2123a(2);
        this.f4615l.m2122a(f2);
        this.f4618o.m3806a(this.f4615l);
        this.f4616m = C0590i.m2104a(this, 1.0f, this.f4619p);
        this.f4616m.m2123a(8);
        this.f4616m.m2122a(f2);
        this.f4619p.m3806a(this.f4616m);
        setFocusableInTouchMode(true);
        C0538w.m1840a((View) this, 1);
        C0538w.m1849a(this, new C1145c(this));
        setMotionEventSplittingEnabled(false);
        if (C0538w.m1893v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1143a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4571c);
                try {
                    this.f4583K = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f4583K = null;
            }
        }
        this.f4609f = 10.0f * f;
        this.f4597ab = new ArrayList<>();
        this.f4624u = (int) ((f * 100.0f) + 0.5f);
        this.f4603ah.m6016a(this.f4604ai);
        this.f4603ah.m6017a(new C1144b(this));
    }

    public void setDrawerElevation(float f) {
        this.f4609f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m3787d(childAt)) {
                C0538w.m1839a(childAt, this.f4609f);
            }
        }
    }

    public float getDrawerElevation() {
        if (f4572d) {
            return this.f4609f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void m3798a(Object obj, boolean z) {
        this.f4590R = obj;
        this.f4591S = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.f4611h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(InterfaceC1148f interfaceC1148f) {
        InterfaceC1148f interfaceC1148f2;
        if (this.f4579G != null && (interfaceC1148f2 = this.f4579G) != null && this.f4580H != null) {
            this.f4580H.remove(interfaceC1148f2);
        }
        if (interfaceC1148f != null && interfaceC1148f != null) {
            if (this.f4580H == null) {
                this.f4580H = new ArrayList();
            }
            this.f4580H.add(interfaceC1148f);
        }
        this.f4579G = interfaceC1148f;
    }

    public void setDrawerLockMode(int i) {
        m3772a(i, 3);
        m3772a(i, 5);
        m3772a(i, 80);
    }

    /* renamed from: a */
    private void m3772a(int i, int i2) {
        C0590i c0590i;
        int m1777a = C0521f.m1777a(i2, C0538w.m1878h(this));
        if (i2 == 3) {
            this.f4629z = i;
        } else if (i2 == 5) {
            this.f4573A = i;
        } else if (i2 == 80) {
            this.f4576D = i;
        } else if (i2 == 8388611) {
            this.f4574B = i;
        } else if (i2 == 8388613) {
            this.f4575C = i;
        }
        if (i != 0) {
            if (m1777a == 3) {
                c0590i = this.f4614k;
            } else if (m1777a == 5) {
                c0590i = this.f4615l;
            } else {
                c0590i = this.f4616m;
            }
            c0590i.m2134e();
        }
        switch (i) {
            case 1:
                View m3800b = m3800b(m1777a);
                if (m3800b != null) {
                    m3784c(m3800b, true);
                    return;
                }
                return;
            case 2:
                View m3800b2 = m3800b(m1777a);
                if (m3800b2 != null) {
                    m3779b(m3800b2, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final int m3793a(View view) {
        if (!m3787d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((C1149g) view.getLayoutParams()).f4641a;
        int m1878h = C0538w.m1878h(this);
        if (i == 3) {
            if (this.f4629z != 3) {
                return this.f4629z;
            }
            int i2 = m1878h == 0 ? this.f4574B : this.f4575C;
            if (i2 != 3) {
                return i2;
            }
            return 0;
        }
        if (i == 5) {
            if (this.f4573A != 3) {
                return this.f4573A;
            }
            int i3 = m1878h == 0 ? this.f4575C : this.f4574B;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 80) {
            if (this.f4576D != 3) {
                return this.f4576D;
            }
            return 0;
        }
        if (i == 8388611) {
            if (this.f4574B != 3) {
                return this.f4574B;
            }
            int i4 = m1878h == 0 ? this.f4629z : this.f4573A;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        if (this.f4575C != 3) {
            return this.f4575C;
        }
        int i5 = m1878h == 0 ? this.f4573A : this.f4629z;
        if (i5 != 3) {
            return i5;
        }
        return 0;
    }

    /* renamed from: a */
    public final CharSequence m3795a(int i) {
        int m1777a = C0521f.m1777a(i, C0538w.m1878h(this));
        if (m1777a == 3) {
            return this.f4587O;
        }
        if (m1777a == 5) {
            return this.f4588P;
        }
        if (m1777a == 80) {
            return this.f4589Q;
        }
        return null;
    }

    /* renamed from: a */
    public final void m3796a(int i, View view) {
        View rootView;
        int m2121a = this.f4614k.m2121a();
        int m2121a2 = this.f4615l.m2121a();
        int m2121a3 = this.f4616m.m2121a();
        int i2 = (m2121a == 1 || m2121a2 == 1 || m2121a3 == 1) ? 1 : (m2121a == 2 || m2121a2 == 2 || m2121a3 == 2) ? 2 : 0;
        if (view != null && i == 0) {
            C1149g c1149g = (C1149g) view.getLayoutParams();
            if (c1149g.f4642b == 0.0f) {
                C1149g c1149g2 = (C1149g) view.getLayoutParams();
                if (m3799a(view, 80) && c1149g2.f4644d != 4) {
                    c1149g2.f4644d = 1;
                }
                if ((c1149g2.f4644d & 1) == 1) {
                    c1149g2.f4644d = 0;
                    if (this.f4580H != null) {
                        for (int size = this.f4580H.size() - 1; size >= 0; size--) {
                            this.f4580H.get(size);
                        }
                    }
                    m3773a(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (c1149g.f4642b != 1.0f) {
                c1149g.f4644d &= 2;
            } else {
                C1149g c1149g3 = (C1149g) view.getLayoutParams();
                if ((c1149g3.f4644d & 1) == 0) {
                    c1149g3.f4644d = 1;
                    if (this.f4580H != null) {
                        for (int size2 = this.f4580H.size() - 1; size2 >= 0; size2--) {
                            this.f4580H.get(size2);
                        }
                    }
                    m3773a(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f4625v) {
            this.f4625v = i2;
            if (this.f4580H != null) {
                for (int size3 = this.f4580H.size() - 1; size3 >= 0; size3--) {
                    this.f4580H.get(size3);
                }
            }
        }
    }

    /* renamed from: a */
    private void m3773a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m3787d(childAt)) || (z && childAt == view)) {
                C0538w.m1840a(childAt, 1);
            } else {
                C0538w.m1840a(childAt, 4);
            }
        }
    }

    /* renamed from: a */
    public final void m3797a(View view, float f) {
        C1149g c1149g = (C1149g) view.getLayoutParams();
        if (f == c1149g.f4642b) {
            return;
        }
        c1149g.f4642b = f;
        if (this.f4580H != null) {
            for (int size = this.f4580H.size() - 1; size >= 0; size--) {
                this.f4580H.get(size);
            }
        }
    }

    /* renamed from: b */
    public static float m3776b(View view) {
        return ((C1149g) view.getLayoutParams()).f4642b;
    }

    /* renamed from: c */
    public final int m3802c(View view) {
        return C0521f.m1777a(((C1149g) view.getLayoutParams()).f4641a, C0538w.m1878h(this));
    }

    /* renamed from: a */
    public final boolean m3799a(View view, int i) {
        return (m3802c(view) & i) == i;
    }

    /* renamed from: c */
    private View m3782c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1149g c1149g = (C1149g) childAt.getLayoutParams();
            if ((c1149g.f4644d & 1) == 1) {
                return childAt;
            }
            if (m3799a(childAt, 80) && c1149g.f4642b > 0.0f) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m3778b(View view, float f) {
        float m3776b = m3776b(view);
        if (m3799a(view, 80)) {
            view.offsetTopAndBottom((int) ((m3776b - f) * view.getMeasuredHeight()));
        } else {
            float width = view.getWidth();
            int i = ((int) (width * f)) - ((int) (m3776b * width));
            if (!m3799a(view, 3)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
        }
        m3797a(view, f);
    }

    /* renamed from: b */
    public final View m3800b(int i) {
        int m1777a = C0521f.m1777a(i, C0538w.m1878h(this)) & 119;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m3802c(childAt) & 119) == m1777a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static String m3783c(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : (i & 80) == 80 ? "BOTTOM" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4627x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4627x = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.widget.ColorDrawerLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private static boolean m3775a(Drawable drawable, int i) {
        if (drawable == null || !C0546a.m1927a(drawable)) {
            return false;
        }
        C0546a.m1929b(drawable, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int paddingLeft;
        boolean z2 = true;
        this.f4626w = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1149g c1149g = (C1149g) childAt.getLayoutParams();
                if (m3792g(childAt)) {
                    childAt.layout(c1149g.leftMargin, c1149g.topMargin, c1149g.leftMargin + childAt.getMeasuredWidth(), c1149g.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m3799a(childAt, 3)) {
                        float f2 = measuredWidth;
                        paddingLeft = (-measuredWidth) + ((int) (c1149g.f4642b * f2));
                        f = (measuredWidth + paddingLeft) / f2;
                    } else if (m3799a(childAt, 5)) {
                        float f3 = measuredWidth;
                        f = (i5 - r12) / f3;
                        paddingLeft = i5 - ((int) (c1149g.f4642b * f3));
                    } else {
                        int i7 = i4 - i2;
                        f = (i7 - (i7 - ((int) (c1149g.f4642b * r12)))) / measuredHeight;
                        paddingLeft = childAt.getPaddingLeft();
                    }
                    boolean z3 = f != c1149g.f4642b ? z2 : false;
                    int i8 = c1149g.f4641a & 119;
                    if (i8 == 16) {
                        int i9 = i4 - i2;
                        int i10 = (i9 - measuredHeight) / 2;
                        if (i10 < c1149g.topMargin) {
                            i10 = c1149g.topMargin;
                        } else if (i10 + measuredHeight > i9 - c1149g.bottomMargin) {
                            i10 = (i9 - c1149g.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(paddingLeft, i10, measuredWidth + paddingLeft, measuredHeight + i10);
                    } else if (i8 != 80) {
                        childAt.layout(paddingLeft, c1149g.topMargin, measuredWidth + paddingLeft, c1149g.topMargin + measuredHeight);
                    } else {
                        int measuredHeight2 = (int) ((i4 - i2) - (((C1149g) childAt.getLayoutParams()).f4642b * childAt.getMeasuredHeight()));
                        childAt.layout(paddingLeft, measuredHeight2, measuredWidth + paddingLeft, (childAt.getMeasuredHeight() + measuredHeight2) - c1149g.bottomMargin);
                    }
                    if (z3) {
                        m3797a(childAt, f);
                    }
                    int i11 = c1149g.f4642b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
            i6++;
            z2 = true;
        }
        this.f4626w = false;
        this.f4627x = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4626w) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C1149g) getChildAt(i).getLayoutParams()).f4642b);
        }
        this.f4612i = f;
        boolean m2136g = this.f4614k.m2136g();
        boolean m2136g2 = this.f4615l.m2136g();
        boolean m2136g3 = this.f4616m.m2136g();
        if (m2136g || m2136g2 || m2136g3) {
            C0538w.m1874f(this);
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4583K = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4583K;
    }

    public void setStatusBarBackground(int i) {
        this.f4583K = i != 0 ? C0420a.m1483a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f4583K = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4591S || this.f4583K == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || this.f4590R == null) ? 0 : ((WindowInsets) this.f4590R).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f4583K.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f4583K.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int height = getHeight();
        boolean m3792g = m3792g(view);
        int width = getWidth();
        int height2 = getHeight();
        int save = canvas.save();
        if (m3792g) {
            int childCount = getChildCount();
            i = width;
            int i3 = height2;
            i2 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (((background != null && background.getOpacity() == -1) || m3799a(childAt, 80)) && m3787d(childAt) && childAt.getHeight() >= height) {
                        if (m3799a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else if (m3799a(childAt, 5)) {
                            int left = childAt.getLeft();
                            if (left < i) {
                                i = left;
                            }
                        } else {
                            int top = childAt.getTop();
                            if (top < i3) {
                                i3 = top + (this.f4620q != null ? this.f4620q.height() : 0);
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, i, i3);
        } else {
            i = width;
            i2 = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f4612i > 0.0f && m3792g) {
            this.f4613j.setColor((((int) (((this.f4611h & (-16777216)) >>> 24) * this.f4612i)) << 24) | (this.f4611h & 16777215));
            canvas.drawRect(i2, 0.0f, i, getHeight(), this.f4613j);
        } else if (this.f4584L != null && m3799a(view, 3)) {
            int intrinsicWidth = this.f4584L.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f4614k.m2128b(), 1.0f));
            this.f4584L.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f4584L.setAlpha((int) (max * 255.0f));
            this.f4584L.draw(canvas);
        } else if (this.f4585M != null && m3799a(view, 5)) {
            int intrinsicWidth2 = this.f4585M.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f4615l.m2128b(), 1.0f));
            this.f4585M.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f4585M.setAlpha((int) (max2 * 255.0f));
            this.f4585M.draw(canvas);
        } else if (this.f4586N != null && m3799a(view, 80)) {
            int intrinsicHeight = this.f4586N.getIntrinsicHeight();
            int top2 = view.getTop();
            float max3 = Math.max(0.0f, Math.min((getHeight() - top2) / this.f4616m.m2128b(), 1.0f));
            this.f4586N.setBounds(view.getLeft(), top2 - intrinsicHeight, view.getRight(), view.getBottom());
            this.f4585M.setAlpha((int) (max3 * 255.0f));
            this.f4585M.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: g */
    private static boolean m3792g(View view) {
        return ((C1149g) view.getLayoutParams()).f4641a == 0;
    }

    /* renamed from: d */
    public static boolean m3787d(View view) {
        int m1777a = C0521f.m1777a(((C1149g) view.getLayoutParams()).f4641a, C0538w.m1878h(view));
        return ((m1777a & 3) == 0 && (m1777a & 5) == 0 && (m1777a & 80) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View m2129b;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        boolean m2126a = this.f4614k.m2126a(motionEvent) | this.f4615l.m2126a(motionEvent);
        View m3800b = m3800b(80);
        if (m3800b != null) {
            C1149g c1149g = (C1149g) m3800b.getLayoutParams();
            this.f4622s = c1149g.f4642b == 1.0f || c1149g.f4642b == 0.0f;
        } else {
            this.f4622s = true;
        }
        if (!this.f4622s && this.f4623t) {
            m2126a |= this.f4616m.m2126a(motionEvent);
        }
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f4581I = x;
                this.f4582J = y;
                z2 = this.f4612i > 0.0f && (m2129b = this.f4614k.m2129b((int) x, (int) y)) != null && m3792g(m2129b);
                this.f4577E = false;
                this.f4578F = false;
                if (!this.f4622s) {
                    this.f4623t = this.f4620q.contains((int) x, ((int) y) - m3800b.getTop());
                } else {
                    this.f4623t = false;
                }
                z = false;
                break;
            case 1:
            case 3:
                m3774a(true);
                this.f4577E = false;
                this.f4578F = false;
                z = false;
                z2 = false;
                break;
            case 2:
                if (this.f4614k.m2137h()) {
                    this.f4617n.m3807c();
                    this.f4618o.m3807c();
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (this.f4623t) {
                        if (this.f4620q != null && x2 > ((float) (m3800b.getLeft() + this.f4620q.left)) && x2 < ((float) (m3800b.getLeft() + this.f4620q.right)) && y2 > ((float) (m3800b.getTop() + this.f4620q.top)) && y2 < ((float) (m3800b.getTop() + this.f4620q.bottom))) {
                            motionEvent.setAction(0);
                            this.f4616m.m2131b(motionEvent);
                            z = true;
                            z2 = false;
                            break;
                        }
                    }
                    z = false;
                    z2 = false;
                }
                z = false;
                z2 = false;
                break;
            default:
                z = false;
                z2 = false;
                break;
        }
        if (!m2126a && !z2) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    z3 = false;
                } else if (((C1149g) getChildAt(i).getLayoutParams()).f4643c) {
                    z3 = true;
                } else {
                    i++;
                }
            }
            if (!z3 && !this.f4578F && !z) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4612i <= 0.0f) {
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
            if (this.f4598ac == null) {
                this.f4598ac = new Rect();
            }
            childAt.getHitRect(this.f4598ac);
            if (this.f4598ac.contains((int) x, (int) y) && !m3792g(childAt)) {
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
                        if (this.f4599ad == null) {
                            this.f4599ad = new Matrix();
                        }
                        matrix.invert(this.f4599ad);
                        obtain.transform(this.f4599ad);
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
        this.f4614k.m2131b(motionEvent);
        this.f4615l.m2131b(motionEvent);
        if (!this.f4622s && this.f4623t) {
            this.f4616m.m2131b(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f4581I = x;
                    this.f4582J = y;
                    this.f4577E = false;
                    this.f4578F = false;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View m2129b = this.f4614k.m2129b((int) x2, (int) y2);
                    View m3782c = m3782c();
                    if (m2129b != null && m3792g(m2129b)) {
                        float f = x2 - this.f4581I;
                        float f2 = y2 - this.f4582J;
                        int m2133d = this.f4614k.m2133d();
                        if ((f * f) + (f2 * f2) < m2133d * m2133d && m3782c != null && m3793a(m3782c) != 2) {
                            z = false;
                            if (this.f4628y && m3782c != null && !z) {
                                this.f4605aj = m3782c;
                                this.f4603ah.m6015a(100.0d);
                            } else {
                                m3774a(z);
                            }
                            this.f4577E = false;
                            this.f4623t = false;
                            break;
                        }
                    }
                    z = true;
                    if (this.f4628y) {
                    }
                    m3774a(z);
                    this.f4577E = false;
                    this.f4623t = false;
                    break;
            }
        } else {
            m3774a(true);
            this.f4577E = false;
            this.f4578F = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f4577E = z;
        if (z) {
            m3774a(true);
        }
    }

    /* renamed from: a */
    private void m3774a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1149g c1149g = (C1149g) childAt.getLayoutParams();
            if (m3787d(childAt) && (!z || c1149g.f4643c)) {
                int width = childAt.getWidth();
                if (m3799a(childAt, 3)) {
                    z2 |= this.f4614k.m2127a(childAt, -width, childAt.getTop());
                } else if (m3799a(childAt, 5)) {
                    z2 |= this.f4615l.m2127a(childAt, getWidth(), childAt.getTop());
                } else if (this.f4600ae == null) {
                    z2 |= this.f4616m.m2127a(childAt, childAt.getLeft(), getHeight());
                }
                c1149g.f4643c = false;
            }
        }
        this.f4617n.m3807c();
        this.f4618o.m3807c();
        this.f4619p.m3807c();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: b */
    private void m3779b(View view, boolean z) {
        if (!m3787d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C1149g c1149g = (C1149g) view.getLayoutParams();
        this.f4607al = 0;
        if (this.f4627x) {
            c1149g.f4642b = 1.0f;
            c1149g.f4644d = 1;
            m3773a(view, true);
        } else if (z) {
            c1149g.f4644d |= 2;
            if (m3799a(view, 3)) {
                this.f4614k.m2127a(view, 0, view.getTop());
            } else if (m3799a(view, 5)) {
                this.f4615l.m2127a(view, getWidth() - view.getWidth(), view.getTop());
            } else {
                this.f4616m.m2127a(view, view.getPaddingLeft(), 0);
            }
        } else {
            m3778b(view, 1.0f);
            m3796a(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: e */
    public final void m3803e(View view) {
        m3784c(view, true);
    }

    /* renamed from: c */
    private void m3784c(View view, boolean z) {
        if (!m3787d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C1149g c1149g = (C1149g) view.getLayoutParams();
        this.f4607al = 2;
        if (this.f4627x) {
            c1149g.f4642b = 0.0f;
            c1149g.f4644d = 0;
        } else if (z) {
            c1149g.f4644d |= 4;
            if (m3799a(view, 3)) {
                this.f4614k.m2127a(view, -view.getWidth(), view.getTop());
            } else if (m3799a(view, 5)) {
                this.f4615l.m2127a(view, getWidth(), view.getTop());
            } else {
                this.f4616m.m2127a(view, view.getLeft(), getHeight());
            }
        } else {
            m3778b(view, 0.0f);
            m3796a(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: d */
    private void m3786d(int i) {
        View m3800b = m3800b(i);
        if (m3800b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m3783c(i));
        }
        m3784c(m3800b, false);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1149g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1149g ? new C1149g((C1149g) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1149g((ViewGroup.MarginLayoutParams) layoutParams) : new C1149g(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1149g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1149g(getContext(), attributeSet);
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
            if (!m3787d(childAt)) {
                this.f4597ab.add(childAt);
            } else {
                if (!m3787d(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if ((((C1149g) childAt.getLayoutParams()).f4644d & 1) == 1) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
        }
        if (!z) {
            int size = this.f4597ab.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f4597ab.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f4597ab.clear();
    }

    /* renamed from: a */
    public final View m3794a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m3787d(childAt)) {
                if (!m3787d(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C1149g) childAt.getLayoutParams()).f4642b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m3801b() {
        if (this.f4578F) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f4578F = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m3794a = m3794a();
            if (m3794a != null && m3793a(m3794a) == 0) {
                m3774a(false);
            }
            return m3794a != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        if (savedState.f4630a != 0 && m3800b(savedState.f4630a) != null) {
            int i = savedState.f4630a;
            float f = savedState.f4636h;
            if (f == 1.0f) {
                View m3800b = m3800b(i);
                if (m3800b == null) {
                    throw new IllegalArgumentException("No drawer view found with gravity " + m3783c(i));
                }
                m3779b(m3800b, false);
            } else if (f == 0.0f) {
                m3786d(i);
            } else {
                View m3800b2 = m3800b(i);
                if (m3800b2 == null) {
                    throw new IllegalArgumentException("No drawer view found with gravity " + m3783c(i));
                }
                C1149g c1149g = (C1149g) m3800b2.getLayoutParams();
                this.f4607al = 1;
                if (this.f4627x) {
                    c1149g.f4642b = f;
                    c1149g.f4644d = 2;
                    m3773a(m3800b2, true);
                } else {
                    m3778b(m3800b2, f);
                    m3796a(0, m3800b2);
                    m3800b2.setVisibility(0);
                }
                invalidate();
            }
        }
        if (savedState.f4631b != 3) {
            m3772a(savedState.f4631b, 3);
        }
        if (savedState.f4632d != 3) {
            m3772a(savedState.f4632d, 5);
        }
        if (savedState.f4633e != 3) {
            m3772a(savedState.f4633e, 8388611);
        }
        if (savedState.f4634f != 3) {
            m3772a(savedState.f4634f, 8388613);
        }
        if (savedState.f4635g != 3) {
            m3772a(savedState.f4635g, 80);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1149g c1149g = (C1149g) getChildAt(i).getLayoutParams();
            boolean z = c1149g.f4644d == 1;
            boolean z2 = c1149g.f4644d == 2;
            if (z || z2) {
                savedState.f4630a = c1149g.f4641a;
                savedState.f4636h = c1149g.f4642b;
                break;
            }
        }
        savedState.f4631b = this.f4629z;
        savedState.f4632d = this.f4573A;
        savedState.f4633e = this.f4574B;
        savedState.f4634f = this.f4575C;
        savedState.f4635g = this.f4576D;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m3782c() != null || m3787d(view)) {
            C0538w.m1840a(view, 4);
        } else {
            C0538w.m1840a(view, 1);
        }
        if (f4570b) {
            return;
        }
        C0538w.m1849a(view, this.f4608e);
    }

    /* renamed from: f */
    public static boolean m3790f(View view) {
        return (C0538w.m1876g(view) == 4 || C0538w.m1876g(view) == 2) ? false : true;
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1150h();

        /* renamed from: a */
        int f4630a;

        /* renamed from: b */
        int f4631b;

        /* renamed from: d */
        int f4632d;

        /* renamed from: e */
        int f4633e;

        /* renamed from: f */
        int f4634f;

        /* renamed from: g */
        int f4635g;

        /* renamed from: h */
        float f4636h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4630a = 0;
            this.f4630a = parcel.readInt();
            this.f4631b = parcel.readInt();
            this.f4632d = parcel.readInt();
            this.f4633e = parcel.readInt();
            this.f4634f = parcel.readInt();
            this.f4635g = parcel.readInt();
            this.f4636h = parcel.readFloat();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f4630a = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4630a);
            parcel.writeInt(this.f4631b);
            parcel.writeInt(this.f4632d);
            parcel.writeInt(this.f4633e);
            parcel.writeInt(this.f4634f);
            parcel.writeInt(this.f4635g);
            parcel.writeFloat(this.f4636h);
        }
    }

    public void setBottomDrawerActionOffset(int i) {
        this.f4624u = i;
    }

    public int getBottomDrawerActionOffset() {
        return this.f4624u;
    }

    public void setDragRect(Rect rect) {
        this.f4620q = rect;
    }

    public int getSettlingDirection() {
        return this.f4607al;
    }

    public void setOffsetMinTop(int i) {
        this.f4621r = i;
    }

    public void setBlankClickedListener(InterfaceC1146d interfaceC1146d) {
        this.f4600ae = interfaceC1146d;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable;
        Drawable drawable2;
        if (f4572d) {
            return;
        }
        int m1878h = C0538w.m1878h(this);
        if (m1878h == 0) {
            if (this.f4592T != null) {
                m3775a(this.f4592T, m1878h);
                drawable = this.f4592T;
            }
            drawable = this.f4594V;
        } else {
            if (this.f4593U != null) {
                m3775a(this.f4593U, m1878h);
                drawable = this.f4593U;
            }
            drawable = this.f4594V;
        }
        this.f4584L = drawable;
        int m1878h2 = C0538w.m1878h(this);
        if (m1878h2 == 0) {
            if (this.f4593U != null) {
                m3775a(this.f4593U, m1878h2);
                drawable2 = this.f4593U;
            }
            drawable2 = this.f4595W;
        } else {
            if (this.f4592T != null) {
                m3775a(this.f4592T, m1878h2);
                drawable2 = this.f4592T;
            }
            drawable2 = this.f4595W;
        }
        this.f4585M = drawable2;
        this.f4586N = this.f4596aa;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m3794a() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
