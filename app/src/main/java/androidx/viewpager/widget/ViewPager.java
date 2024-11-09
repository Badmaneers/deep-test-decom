package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0420a;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A */
    private int f4406A;

    /* renamed from: B */
    private boolean f4407B;

    /* renamed from: C */
    private boolean f4408C;

    /* renamed from: D */
    private int f4409D;

    /* renamed from: E */
    private int f4410E;

    /* renamed from: F */
    private int f4411F;

    /* renamed from: G */
    private float f4412G;

    /* renamed from: H */
    private float f4413H;

    /* renamed from: I */
    private float f4414I;

    /* renamed from: J */
    private float f4415J;

    /* renamed from: K */
    private int f4416K;

    /* renamed from: L */
    private VelocityTracker f4417L;

    /* renamed from: M */
    private int f4418M;

    /* renamed from: N */
    private int f4419N;

    /* renamed from: O */
    private int f4420O;

    /* renamed from: P */
    private int f4421P;

    /* renamed from: Q */
    private boolean f4422Q;

    /* renamed from: R */
    private EdgeEffect f4423R;

    /* renamed from: S */
    private EdgeEffect f4424S;

    /* renamed from: T */
    private boolean f4425T;

    /* renamed from: U */
    private boolean f4426U;

    /* renamed from: V */
    private boolean f4427V;

    /* renamed from: W */
    private int f4428W;

    /* renamed from: aa */
    private List<InterfaceC1108o> f4429aa;

    /* renamed from: ab */
    private InterfaceC1108o f4430ab;

    /* renamed from: ac */
    private InterfaceC1108o f4431ac;

    /* renamed from: ad */
    private List<InterfaceC1107n> f4432ad;

    /* renamed from: ae */
    private InterfaceC1109p f4433ae;

    /* renamed from: af */
    private int f4434af;

    /* renamed from: ag */
    private int f4435ag;

    /* renamed from: ah */
    private ArrayList<View> f4436ah;

    /* renamed from: aj */
    private final Runnable f4437aj;

    /* renamed from: ak */
    private int f4438ak;

    /* renamed from: b */
    AbstractC1094a f4439b;

    /* renamed from: c */
    int f4440c;

    /* renamed from: d */
    private int f4441d;

    /* renamed from: g */
    private final ArrayList<C1104k> f4442g;

    /* renamed from: h */
    private final C1104k f4443h;

    /* renamed from: i */
    private final Rect f4444i;

    /* renamed from: j */
    private int f4445j;

    /* renamed from: k */
    private Parcelable f4446k;

    /* renamed from: l */
    private ClassLoader f4447l;

    /* renamed from: m */
    private Scroller f4448m;

    /* renamed from: n */
    private boolean f4449n;

    /* renamed from: o */
    private C1110q f4450o;

    /* renamed from: p */
    private int f4451p;

    /* renamed from: q */
    private Drawable f4452q;

    /* renamed from: r */
    private int f4453r;

    /* renamed from: s */
    private int f4454s;

    /* renamed from: t */
    private float f4455t;

    /* renamed from: u */
    private float f4456u;

    /* renamed from: v */
    private int f4457v;

    /* renamed from: w */
    private int f4458w;

    /* renamed from: x */
    private boolean f4459x;

    /* renamed from: y */
    private boolean f4460y;

    /* renamed from: z */
    private boolean f4461z;

    /* renamed from: a */
    static final int[] f4402a = {R.attr.layout_gravity};

    /* renamed from: e */
    private static final Comparator<C1104k> f4404e = new C1099f();

    /* renamed from: f */
    private static final Interpolator f4405f = new InterpolatorC1100g();

    /* renamed from: ai */
    private static final C1112s f4403ai = new C1112s();

    public ViewPager(Context context) {
        super(context);
        this.f4442g = new ArrayList<>();
        this.f4443h = new C1104k();
        this.f4444i = new Rect();
        this.f4445j = -1;
        this.f4446k = null;
        this.f4447l = null;
        this.f4455t = -3.4028235E38f;
        this.f4456u = Float.MAX_VALUE;
        this.f4406A = 1;
        this.f4416K = -1;
        this.f4425T = true;
        this.f4426U = false;
        this.f4437aj = new RunnableC1101h(this);
        this.f4438ak = 0;
        m3678c();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4442g = new ArrayList<>();
        this.f4443h = new C1104k();
        this.f4444i = new Rect();
        this.f4445j = -1;
        this.f4446k = null;
        this.f4447l = null;
        this.f4455t = -3.4028235E38f;
        this.f4456u = Float.MAX_VALUE;
        this.f4406A = 1;
        this.f4416K = -1;
        this.f4425T = true;
        this.f4426U = false;
        this.f4437aj = new RunnableC1101h(this);
        this.f4438ak = 0;
        m3678c();
    }

    /* renamed from: c */
    private void m3678c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4448m = new Scroller(context, f4405f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4411F = viewConfiguration.getScaledPagingTouchSlop();
        this.f4418M = (int) (400.0f * f);
        this.f4419N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4423R = new EdgeEffect(context);
        this.f4424S = new EdgeEffect(context);
        this.f4420O = (int) (25.0f * f);
        this.f4421P = (int) (2.0f * f);
        this.f4409D = (int) (f * 16.0f);
        C0538w.m1849a(this, new C1106m(this));
        if (C0538w.m1876g(this) == 0) {
            C0538w.m1840a((View) this, 1);
        }
        C0538w.m1850a(this, new C1102i(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f4437aj);
        if (this.f4448m != null && !this.f4448m.isFinished()) {
            this.f4448m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void setScrollState(int i) {
        if (this.f4438ak == i) {
            return;
        }
        this.f4438ak = i;
        if (this.f4433ae != null) {
            boolean z = i != 0;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setLayerType(z ? this.f4434af : 0, null);
            }
        }
        if (this.f4430ab != null) {
            this.f4430ab.mo3707b(i);
        }
        if (this.f4429aa != null) {
            int size = this.f4429aa.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1108o interfaceC1108o = this.f4429aa.get(i3);
                if (interfaceC1108o != null) {
                    interfaceC1108o.mo3707b(i);
                }
            }
        }
        if (this.f4431ac != null) {
            this.f4431ac.mo3707b(i);
        }
    }

    public void setAdapter(AbstractC1094a abstractC1094a) {
        if (this.f4439b != null) {
            this.f4439b.m3702c(null);
            for (int i = 0; i < this.f4442g.size(); i++) {
                this.f4442g.get(i);
                AbstractC1094a.m3698b();
            }
            this.f4442g.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C1105l) getChildAt(i2).getLayoutParams()).f4479a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f4440c = 0;
            scrollTo(0, 0);
        }
        AbstractC1094a abstractC1094a2 = this.f4439b;
        this.f4439b = abstractC1094a;
        this.f4441d = 0;
        if (this.f4439b != null) {
            if (this.f4450o == null) {
                this.f4450o = new C1110q(this);
            }
            this.f4439b.m3702c(this.f4450o);
            this.f4461z = false;
            boolean z = this.f4425T;
            this.f4425T = true;
            this.f4441d = this.f4439b.m3699a();
            if (this.f4445j >= 0) {
                m3668a(this.f4445j, false, true);
                this.f4445j = -1;
                this.f4446k = null;
                this.f4447l = null;
            } else if (!z) {
                m3694b();
            } else {
                requestLayout();
            }
        }
        if (this.f4432ad == null || this.f4432ad.isEmpty()) {
            return;
        }
        int size = this.f4432ad.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f4432ad.get(i3).mo3706a(this, abstractC1094a2, abstractC1094a);
        }
    }

    public AbstractC1094a getAdapter() {
        return this.f4439b;
    }

    /* renamed from: a */
    public final void m3692a(InterfaceC1107n interfaceC1107n) {
        if (this.f4432ad == null) {
            this.f4432ad = new ArrayList();
        }
        this.f4432ad.add(interfaceC1107n);
    }

    /* renamed from: b */
    public final void m3695b(InterfaceC1107n interfaceC1107n) {
        if (this.f4432ad != null) {
            this.f4432ad.remove(interfaceC1107n);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.f4461z = false;
        m3668a(i, !this.f4425T, false);
    }

    /* renamed from: a */
    public final void m3691a(int i, boolean z) {
        this.f4461z = false;
        m3668a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f4440c;
    }

    /* renamed from: a */
    private void m3668a(int i, boolean z, boolean z2) {
        m3669a(i, z, z2, 0);
    }

    /* renamed from: a */
    private void m3669a(int i, boolean z, boolean z2, int i2) {
        if (this.f4439b == null || this.f4439b.m3699a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f4440c == i && this.f4442g.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f4439b.m3699a()) {
            i = this.f4439b.m3699a() - 1;
        }
        int i3 = this.f4406A;
        if (i > this.f4440c + i3 || i < this.f4440c - i3) {
            for (int i4 = 0; i4 < this.f4442g.size(); i4++) {
                this.f4442g.get(i4).f4476b = true;
            }
        }
        boolean z3 = this.f4440c != i;
        if (this.f4425T) {
            this.f4440c = i;
            if (z3) {
                m3682e(i);
            }
            requestLayout();
            return;
        }
        m3674b(i);
        m3667a(i, z, i2, z3);
    }

    /* renamed from: a */
    private void m3667a(int i, boolean z, int i2, boolean z2) {
        C1104k m3677c = m3677c(i);
        int clientWidth = m3677c != null ? (int) (getClientWidth() * Math.max(this.f4455t, Math.min(m3677c.f4478d, this.f4456u))) : 0;
        if (z) {
            m3665a(clientWidth, i2);
            if (z2) {
                m3682e(i);
                return;
            }
            return;
        }
        if (z2) {
            m3682e(i);
        }
        m3672a(false);
        scrollTo(clientWidth, 0);
        m3680d(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1108o interfaceC1108o) {
        this.f4430ab = interfaceC1108o;
    }

    /* renamed from: a */
    public final void m3693a(InterfaceC1108o interfaceC1108o) {
        if (this.f4429aa == null) {
            this.f4429aa = new ArrayList();
        }
        this.f4429aa.add(interfaceC1108o);
    }

    /* renamed from: b */
    public final void m3696b(InterfaceC1108o interfaceC1108o) {
        if (this.f4429aa != null) {
            this.f4429aa.remove(interfaceC1108o);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f4435ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C1105l) this.f4436ah.get(i2).getLayoutParams()).f4484f;
    }

    /* renamed from: c */
    public final InterfaceC1108o m3697c(InterfaceC1108o interfaceC1108o) {
        InterfaceC1108o interfaceC1108o2 = this.f4431ac;
        this.f4431ac = interfaceC1108o;
        return interfaceC1108o2;
    }

    public int getOffscreenPageLimit() {
        return this.f4406A;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f4406A) {
            this.f4406A = i;
            m3694b();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f4451p;
        this.f4451p = i;
        int width = getWidth();
        m3666a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f4451p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4452q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0420a.m1483a(getContext(), i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4452q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4452q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: a */
    private static float m3660a(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: a */
    private void m3665a(int i, int i2) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.f4448m == null || this.f4448m.isFinished()) ? false : true) {
            scrollX = this.f4449n ? this.f4448m.getCurrX() : this.f4448m.getStartX();
            this.f4448m.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i3 = scrollX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m3672a(false);
            m3694b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i6;
        float m3660a = f2 + (m3660a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m3660a / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f4451p)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, ResponseCode.CODE_6XX_CONNECT_ERROR);
        this.f4449n = false;
        this.f4448m.startScroll(i3, scrollY, i4, i5, min);
        C0538w.m1874f(this);
    }

    /* renamed from: a */
    private static C1104k m3662a(int i) {
        new C1104k().f4475a = i;
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: a */
    public final void m3690a() {
        int m3699a = this.f4439b.m3699a();
        this.f4441d = m3699a;
        boolean z = this.f4442g.size() < (this.f4406A * 2) + 1 && this.f4442g.size() < m3699a;
        int i = this.f4440c;
        for (int i2 = 0; i2 < this.f4442g.size(); i2++) {
            this.f4442g.get(i2);
        }
        Collections.sort(this.f4442g, f4404e);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C1105l c1105l = (C1105l) getChildAt(i3).getLayoutParams();
                if (!c1105l.f4479a) {
                    c1105l.f4481c = 0.0f;
                }
            }
            m3668a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: b */
    public final void m3694b() {
        m3674b(this.f4440c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:            if (r8.f4475a == r17.f4440c) goto L211;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3674b(int r18) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m3674b(int):void");
    }

    /* renamed from: d */
    private void m3679d() {
        if (this.f4435ag != 0) {
            if (this.f4436ah == null) {
                this.f4436ah = new ArrayList<>();
            } else {
                this.f4436ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f4436ah.add(getChildAt(i));
            }
            Collections.sort(this.f4436ah, f4403ai);
        }
    }

    /* renamed from: a */
    private void m3671a(C1104k c1104k, int i, C1104k c1104k2) {
        C1104k c1104k3;
        C1104k c1104k4;
        int m3699a = this.f4439b.m3699a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f4451p / clientWidth : 0.0f;
        if (c1104k2 != null) {
            int i2 = c1104k2.f4475a;
            if (i2 < c1104k.f4475a) {
                float f2 = c1104k2.f4478d + c1104k2.f4477c + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= c1104k.f4475a && i4 < this.f4442g.size()) {
                    C1104k c1104k5 = this.f4442g.get(i4);
                    while (true) {
                        c1104k4 = c1104k5;
                        if (i3 <= c1104k4.f4475a || i4 >= this.f4442g.size() - 1) {
                            break;
                        }
                        i4++;
                        c1104k5 = this.f4442g.get(i4);
                    }
                    while (i3 < c1104k4.f4475a) {
                        f2 += f + 1.0f;
                        i3++;
                    }
                    c1104k4.f4478d = f2;
                    f2 += c1104k4.f4477c + f;
                    i3++;
                }
            } else if (i2 > c1104k.f4475a) {
                int size = this.f4442g.size() - 1;
                float f3 = c1104k2.f4478d;
                while (true) {
                    i2--;
                    if (i2 < c1104k.f4475a || size < 0) {
                        break;
                    }
                    C1104k c1104k6 = this.f4442g.get(size);
                    while (true) {
                        c1104k3 = c1104k6;
                        if (i2 >= c1104k3.f4475a || size <= 0) {
                            break;
                        }
                        size--;
                        c1104k6 = this.f4442g.get(size);
                    }
                    while (i2 > c1104k3.f4475a) {
                        f3 -= f + 1.0f;
                        i2--;
                    }
                    f3 -= c1104k3.f4477c + f;
                    c1104k3.f4478d = f3;
                }
            }
        }
        int size2 = this.f4442g.size();
        float f4 = c1104k.f4478d;
        int i5 = c1104k.f4475a - 1;
        this.f4455t = c1104k.f4475a == 0 ? c1104k.f4478d : -3.4028235E38f;
        int i6 = m3699a - 1;
        this.f4456u = c1104k.f4475a == i6 ? (c1104k.f4478d + c1104k.f4477c) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C1104k c1104k7 = this.f4442g.get(i7);
            while (i5 > c1104k7.f4475a) {
                i5--;
                f4 -= f + 1.0f;
            }
            f4 -= c1104k7.f4477c + f;
            c1104k7.f4478d = f4;
            if (c1104k7.f4475a == 0) {
                this.f4455t = f4;
            }
            i7--;
            i5--;
        }
        float f5 = c1104k.f4478d + c1104k.f4477c + f;
        int i8 = c1104k.f4475a + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C1104k c1104k8 = this.f4442g.get(i9);
            while (i8 < c1104k8.f4475a) {
                i8++;
                f5 += f + 1.0f;
            }
            if (c1104k8.f4475a == i6) {
                this.f4456u = (c1104k8.f4477c + f5) - 1.0f;
            }
            c1104k8.f4478d = f5;
            f5 += c1104k8.f4477c + f;
            i9++;
            i8++;
        }
        this.f4426U = false;
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1111r();

        /* renamed from: a */
        int f4462a;

        /* renamed from: b */
        Parcelable f4463b;

        /* renamed from: d */
        ClassLoader f4464d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4462a);
            parcel.writeParcelable(this.f4463b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4462a + "}";
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4462a = parcel.readInt();
            this.f4463b = parcel.readParcelable(classLoader);
            this.f4464d = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4462a = this.f4440c;
        if (this.f4439b != null) {
            savedState.f4463b = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        if (this.f4439b != null) {
            m3668a(savedState.f4462a, false, true);
            return;
        }
        this.f4445j = savedState.f4462a;
        this.f4446k = savedState.f4463b;
        this.f4447l = savedState.f4464d;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1105l c1105l = (C1105l) layoutParams;
        c1105l.f4479a |= view.getClass().getAnnotation(InterfaceC1103j.class) != null;
        if (this.f4459x) {
            if (c1105l != null && c1105l.f4479a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c1105l.f4482d = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4459x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: e */
    private C1104k m3681e() {
        for (int i = 0; i < this.f4442g.size(); i++) {
            C1104k c1104k = this.f4442g.get(i);
            if (this.f4439b.m3703c()) {
                return c1104k;
            }
        }
        return null;
    }

    /* renamed from: a */
    private C1104k m3663a(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return m3681e();
            }
        }
    }

    /* renamed from: c */
    private C1104k m3677c(int i) {
        for (int i2 = 0; i2 < this.f4442g.size(); i2++) {
            C1104k c1104k = this.f4442g.get(i2);
            if (c1104k.f4475a == i) {
                return c1104k;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4425T = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C1105l c1105l;
        C1105l c1105l2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f4410E = Math.min(measuredWidth / 10, this.f4409D);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = measuredHeight;
        int i7 = paddingLeft;
        int i8 = 0;
        while (true) {
            boolean z2 = true;
            int i9 = 1073741824;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && (c1105l2 = (C1105l) childAt.getLayoutParams()) != null && c1105l2.f4479a) {
                int i10 = c1105l2.f4480b & 7;
                int i11 = c1105l2.f4480b & 112;
                boolean z3 = (i11 == 48 || i11 == 80) ? true : z;
                if (i10 != 3 && i10 != 5) {
                    z2 = z;
                }
                int i12 = RecyclerView.UNDEFINED_DURATION;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (c1105l2.width != -2) {
                    i4 = c1105l2.width != -1 ? c1105l2.width : i7;
                    i12 = 1073741824;
                } else {
                    i4 = i7;
                }
                if (c1105l2.height != -2) {
                    i5 = c1105l2.height != -1 ? c1105l2.height : i6;
                } else {
                    i5 = i6;
                    i9 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i12), View.MeasureSpec.makeMeasureSpec(i5, i9));
                if (z3) {
                    i6 -= childAt.getMeasuredHeight();
                } else if (z2) {
                    i7 -= childAt.getMeasuredWidth();
                }
            }
            i8++;
            z = false;
        }
        this.f4457v = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        this.f4458w = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        this.f4459x = true;
        m3694b();
        this.f4459x = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((c1105l = (C1105l) childAt2.getLayoutParams()) == null || !c1105l.f4479a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (i7 * c1105l.f4481c), 1073741824), this.f4458w);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m3666a(i, i3, this.f4451p, this.f4451p);
        }
    }

    /* renamed from: a */
    private void m3666a(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f4442g.isEmpty()) {
            if (!this.f4448m.isFinished()) {
                this.f4448m.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C1104k m3677c = m3677c(this.f4440c);
        int min = (int) ((m3677c != null ? Math.min(m3677c.f4478d, this.f4456u) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m3672a(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C1104k m3681e;
        int max;
        int max2;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = paddingBottom;
        int i8 = 0;
        int i9 = paddingTop;
        int i10 = paddingLeft;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1105l c1105l = (C1105l) childAt.getLayoutParams();
                if (c1105l.f4479a) {
                    int i12 = c1105l.f4480b & 7;
                    int i13 = c1105l.f4480b & 112;
                    if (i12 == 1) {
                        max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, i10);
                    } else if (i12 == 3) {
                        max = i10;
                        i10 = childAt.getMeasuredWidth() + i10;
                    } else if (i12 != 5) {
                        max = i10;
                    } else {
                        max = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i13 == 16) {
                        max2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, i9);
                    } else if (i13 == 48) {
                        max2 = i9;
                        i9 = childAt.getMeasuredHeight() + i9;
                    } else if (i13 != 80) {
                        max2 = i9;
                    } else {
                        max2 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    int i14 = max + scrollX;
                    childAt.layout(i14, max2, childAt.getMeasuredWidth() + i14, max2 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
        }
        int i15 = (i5 - i10) - paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                C1105l c1105l2 = (C1105l) childAt2.getLayoutParams();
                if (!c1105l2.f4479a && (m3681e = m3681e()) != null) {
                    float f = i15;
                    int i17 = ((int) (m3681e.f4478d * f)) + i10;
                    if (c1105l2.f4482d) {
                        c1105l2.f4482d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c1105l2.f4481c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - i9) - i7, 1073741824));
                    }
                    childAt2.layout(i17, i9, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + i9);
                }
            }
        }
        this.f4453r = i9;
        this.f4454s = i6 - i7;
        this.f4428W = i8;
        if (this.f4425T) {
            z2 = false;
            m3667a(this.f4440c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f4425T = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f4449n = true;
        if (!this.f4448m.isFinished() && this.f4448m.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4448m.getCurrX();
            int currY = this.f4448m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m3680d(currX)) {
                    this.f4448m.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C0538w.m1874f(this);
            return;
        }
        m3672a(true);
    }

    /* renamed from: d */
    private boolean m3680d(int i) {
        if (this.f4442g.size() == 0) {
            if (this.f4425T) {
                return false;
            }
            this.f4427V = false;
            m3664a(0, 0.0f);
            if (this.f4427V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1104k m3686h = m3686h();
        float clientWidth = getClientWidth();
        int i2 = m3686h.f4475a;
        float f = ((i / clientWidth) - m3686h.f4478d) / (m3686h.f4477c + (this.f4451p / clientWidth));
        this.f4427V = false;
        m3664a(i2, f);
        if (this.f4427V) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3664a(int r13, float r14) {
        /*
            r12 = this;
            int r0 = r12.f4428W
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = r1
        L1d:
            if (r3 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.l r9 = (androidx.viewpager.widget.C1105l) r9
            boolean r10 = r9.f4479a
            if (r10 == 0) goto L69
            int r9 = r9.f4480b
            r9 = r9 & 7
            if (r9 == r2) goto L4e
            r10 = 3
            if (r9 == r10) goto L48
            r10 = 5
            if (r9 == r10) goto L3b
            r9 = r4
            goto L5d
        L3b:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L5a
        L48:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L5d
        L4e:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L5a:
            r11 = r9
            r9 = r4
            r4 = r11
        L5d:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L68
            r8.offsetLeftAndRight(r4)
        L68:
            r4 = r9
        L69:
            int r3 = r3 + 1
            goto L1d
        L6c:
            r12.m3675b(r13, r14)
            androidx.viewpager.widget.p r13 = r12.f4433ae
            if (r13 == 0) goto L93
            r12.getScrollX()
            int r13 = r12.getChildCount()
        L7a:
            if (r1 >= r13) goto L93
            android.view.View r14 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            androidx.viewpager.widget.l r0 = (androidx.viewpager.widget.C1105l) r0
            boolean r0 = r0.f4479a
            if (r0 != 0) goto L90
            r14.getLeft()
            r12.getClientWidth()
        L90:
            int r1 = r1 + 1
            goto L7a
        L93:
            r12.f4427V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m3664a(int, float):void");
    }

    /* renamed from: b */
    private void m3675b(int i, float f) {
        if (this.f4430ab != null) {
            this.f4430ab.mo3705a(i, f);
        }
        if (this.f4429aa != null) {
            int size = this.f4429aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1108o interfaceC1108o = this.f4429aa.get(i2);
                if (interfaceC1108o != null) {
                    interfaceC1108o.mo3705a(i, f);
                }
            }
        }
        if (this.f4431ac != null) {
            this.f4431ac.mo3705a(i, f);
        }
    }

    /* renamed from: e */
    private void m3682e(int i) {
        if (this.f4430ab != null) {
            this.f4430ab.mo3704a(i);
        }
        if (this.f4429aa != null) {
            int size = this.f4429aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1108o interfaceC1108o = this.f4429aa.get(i2);
                if (interfaceC1108o != null) {
                    interfaceC1108o.mo3704a(i);
                }
            }
        }
        if (this.f4431ac != null) {
            this.f4431ac.mo3704a(i);
        }
    }

    /* renamed from: a */
    private void m3672a(boolean z) {
        boolean z2 = this.f4438ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f4448m.isFinished()) {
                this.f4448m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4448m.getCurrX();
                int currY = this.f4448m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m3680d(currX);
                    }
                }
            }
        }
        this.f4461z = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f4442g.size(); i++) {
            C1104k c1104k = this.f4442g.get(i);
            if (c1104k.f4476b) {
                c1104k.f4476b = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0538w.m1852a(this, this.f4437aj);
            } else {
                this.f4437aj.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m3683f();
            return false;
        }
        if (action != 0) {
            if (this.f4407B) {
                return true;
            }
            if (this.f4408C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f4414I = x;
            this.f4412G = x;
            float y = motionEvent.getY();
            this.f4415J = y;
            this.f4413H = y;
            this.f4416K = motionEvent.getPointerId(0);
            this.f4408C = false;
            this.f4449n = true;
            this.f4448m.computeScrollOffset();
            if (this.f4438ak == 2 && Math.abs(this.f4448m.getFinalX() - this.f4448m.getCurrX()) > this.f4421P) {
                this.f4448m.abortAnimation();
                this.f4461z = false;
                m3694b();
                this.f4407B = true;
                m3685g();
                setScrollState(1);
            } else {
                m3672a(false);
                this.f4407B = false;
            }
        } else if (action == 2) {
            int i = this.f4416K;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f4412G;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f4415J);
                if (f != 0.0f) {
                    float f2 = this.f4412G;
                    if (!((f2 < ((float) this.f4410E) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f4410E)) && f < 0.0f)) && m3673a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f4412G = x2;
                        this.f4413H = y2;
                        this.f4408C = true;
                        return false;
                    }
                }
                if (abs > this.f4411F && abs * 0.5f > abs2) {
                    this.f4407B = true;
                    m3685g();
                    setScrollState(1);
                    this.f4412G = f > 0.0f ? this.f4414I + this.f4411F : this.f4414I - this.f4411F;
                    this.f4413H = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > this.f4411F) {
                    this.f4408C = true;
                }
                if (this.f4407B && m3676b(x2)) {
                    C0538w.m1874f(this);
                }
            }
        } else if (action == 6) {
            m3670a(motionEvent);
        }
        if (this.f4417L == null) {
            this.f4417L = VelocityTracker.obtain();
        }
        this.f4417L.addMovement(motionEvent);
        return this.f4407B;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4422Q) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.f4439b == null || this.f4439b.m3699a() == 0) {
            return false;
        }
        if (this.f4417L == null) {
            this.f4417L = VelocityTracker.obtain();
        }
        this.f4417L.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f4448m.abortAnimation();
                this.f4461z = false;
                m3694b();
                float x = motionEvent.getX();
                this.f4414I = x;
                this.f4412G = x;
                float y = motionEvent.getY();
                this.f4415J = y;
                this.f4413H = y;
                this.f4416K = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f4407B) {
                    VelocityTracker velocityTracker = this.f4417L;
                    velocityTracker.computeCurrentVelocity(1000, this.f4419N);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f4416K);
                    this.f4461z = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C1104k m3686h = m3686h();
                    float f = clientWidth;
                    int i = m3686h.f4475a;
                    float f2 = ((scrollX / f) - m3686h.f4478d) / (m3686h.f4477c + (this.f4451p / f));
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4416K)) - this.f4414I)) <= this.f4420O || Math.abs(xVelocity) <= this.f4418M) {
                        i += (int) (f2 + (i >= this.f4440c ? 0.4f : 0.6f));
                    } else if (xVelocity <= 0) {
                        i++;
                    }
                    if (this.f4442g.size() > 0) {
                        i = Math.max(this.f4442g.get(0).f4475a, Math.min(i, this.f4442g.get(this.f4442g.size() - 1).f4475a));
                    }
                    m3669a(i, true, true, xVelocity);
                    z = m3683f();
                    break;
                }
                break;
            case 2:
                if (!this.f4407B) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4416K);
                    if (findPointerIndex == -1) {
                        z = m3683f();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f4412G);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f4413H);
                        if (abs > this.f4411F && abs > abs2) {
                            this.f4407B = true;
                            m3685g();
                            this.f4412G = x2 - this.f4414I > 0.0f ? this.f4414I + this.f4411F : this.f4414I - this.f4411F;
                            this.f4413H = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f4407B) {
                    z = false | m3676b(motionEvent.getX(motionEvent.findPointerIndex(this.f4416K)));
                    break;
                }
                break;
            case 3:
                if (this.f4407B) {
                    m3667a(this.f4440c, true, 0, false);
                    z = m3683f();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f4412G = motionEvent.getX(actionIndex);
                this.f4416K = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                m3670a(motionEvent);
                this.f4412G = motionEvent.getX(motionEvent.findPointerIndex(this.f4416K));
                break;
        }
        if (z) {
            C0538w.m1874f(this);
        }
        return true;
    }

    /* renamed from: f */
    private boolean m3683f() {
        this.f4416K = -1;
        m3687i();
        this.f4423R.onRelease();
        this.f4424S.onRelease();
        return this.f4423R.isFinished() || this.f4424S.isFinished();
    }

    /* renamed from: g */
    private void m3685g() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: b */
    private boolean m3676b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f4412G - f;
        this.f4412G = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f4455t * clientWidth;
        float f4 = this.f4456u * clientWidth;
        boolean z3 = false;
        C1104k c1104k = this.f4442g.get(0);
        C1104k c1104k2 = this.f4442g.get(this.f4442g.size() - 1);
        if (c1104k.f4475a != 0) {
            f3 = c1104k.f4478d * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c1104k2.f4475a != this.f4439b.m3699a() - 1) {
            f4 = c1104k2.f4478d * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f4423R.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f4424S.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f4412G += scrollX - i;
        scrollTo(i, getScrollY());
        m3680d(i);
        return z3;
    }

    /* renamed from: h */
    private C1104k m3686h() {
        int i;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.f4451p / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = -1;
        C1104k c1104k = null;
        boolean z = true;
        while (i2 < this.f4442g.size()) {
            C1104k c1104k2 = this.f4442g.get(i2);
            if (!z && c1104k2.f4475a != (i = i3 + 1)) {
                c1104k2 = this.f4443h;
                c1104k2.f4478d = f2 + f3 + f;
                c1104k2.f4475a = i;
                c1104k2.f4477c = 1.0f;
                i2--;
            }
            f2 = c1104k2.f4478d;
            float f4 = c1104k2.f4477c + f2 + f;
            if (!z && scrollX < f2) {
                return c1104k;
            }
            if (scrollX < f4 || i2 == this.f4442g.size() - 1) {
                return c1104k2;
            }
            i3 = c1104k2.f4475a;
            f3 = c1104k2.f4477c;
            i2++;
            z = false;
            c1104k = c1104k2;
        }
        return c1104k;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f4439b != null && this.f4439b.m3699a() > 1)) {
            if (!this.f4423R.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f4455t * width);
                this.f4423R.setSize(height, width);
                z = false | this.f4423R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f4424S.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4456u + 1.0f)) * width2);
                this.f4424S.setSize(height2, width2);
                z |= this.f4424S.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f4423R.finish();
            this.f4424S.finish();
        }
        if (z) {
            C0538w.m1874f(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f4451p <= 0 || this.f4452q == null || this.f4442g.size() <= 0 || this.f4439b == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f4451p / width;
        int i = 0;
        C1104k c1104k = this.f4442g.get(0);
        float f5 = c1104k.f4478d;
        int size = this.f4442g.size();
        int i2 = c1104k.f4475a;
        int i3 = this.f4442g.get(size - 1).f4475a;
        while (i2 < i3) {
            while (i2 > c1104k.f4475a && i < size) {
                i++;
                c1104k = this.f4442g.get(i);
            }
            if (i2 == c1104k.f4475a) {
                f2 = (c1104k.f4478d + c1104k.f4477c) * width;
                f = c1104k.f4478d + c1104k.f4477c + f4;
            } else {
                f = f5 + 1.0f + f4;
                f2 = (f5 + 1.0f) * width;
            }
            if (this.f4451p + f2 > scrollX) {
                f3 = f4;
                this.f4452q.setBounds(Math.round(f2), this.f4453r, Math.round(this.f4451p + f2), this.f4454s);
                this.f4452q.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i2++;
            f5 = f;
            f4 = f3;
        }
    }

    /* renamed from: a */
    private void m3670a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4416K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4412G = motionEvent.getX(i);
            this.f4416K = motionEvent.getPointerId(i);
            if (this.f4417L != null) {
                this.f4417L.clear();
            }
        }
    }

    /* renamed from: i */
    private void m3687i() {
        this.f4407B = false;
        this.f4408C = false;
        if (this.f4417L != null) {
            this.f4417L.recycle();
            this.f4417L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f4460y != z) {
            this.f4460y = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f4439b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4455t)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f4456u));
    }

    /* renamed from: a */
    private boolean m3673a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m3673a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5a
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L55
            int r0 = r6.getKeyCode()
            r3 = 61
            r4 = 2
            if (r0 == r3) goto L3f
            switch(r0) {
                case 21: goto L2d;
                case 22: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L55
        L1b:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L26
            boolean r5 = r5.m3689k()
            goto L56
        L26:
            r6 = 66
            boolean r5 = r5.m3684f(r6)
            goto L56
        L2d:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L38
            boolean r5 = r5.m3688j()
            goto L56
        L38:
            r6 = 17
            boolean r5 = r5.m3684f(r6)
            goto L56
        L3f:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L4a
            boolean r5 = r5.m3684f(r4)
            goto L56
        L4a:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L55
            boolean r5 = r5.m3684f(r1)
            goto L56
        L55:
            r5 = r2
        L56:
            if (r5 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:            if (r8 != 2) goto L90;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m3684f(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r7) goto La
            goto L66
        La:
            if (r0 == 0) goto L65
            android.view.ViewParent r4 = r0.getParent()
        L10:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1d
            if (r4 != r7) goto L18
            r4 = r1
            goto L1e
        L18:
            android.view.ViewParent r4 = r4.getParent()
            goto L10
        L1d:
            r4 = r2
        L1e:
            if (r4 != 0) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L34:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L34
        L4d:
            java.lang.String r0 = "ViewPager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "arrowScroll tried to find focus based on non-child current focused view "
            r5.<init>(r6)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r0, r4)
            goto L66
        L65:
            r3 = r0
        L66:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r7, r3, r8)
            r4 = 66
            r5 = 17
            if (r0 == 0) goto Lb1
            if (r0 == r3) goto Lb1
            if (r8 != r5) goto L96
            android.graphics.Rect r1 = r7.f4444i
            android.graphics.Rect r1 = r7.m3661a(r1, r0)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.f4444i
            android.graphics.Rect r2 = r7.m3661a(r2, r3)
            int r2 = r2.left
            if (r3 == 0) goto L91
            if (r1 < r2) goto L91
            boolean r2 = r7.m3688j()
            goto Lc4
        L91:
            boolean r2 = r0.requestFocus()
            goto Lc4
        L96:
            if (r8 != r4) goto Lc4
            android.graphics.Rect r1 = r7.f4444i
            android.graphics.Rect r1 = r7.m3661a(r1, r0)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.f4444i
            android.graphics.Rect r2 = r7.m3661a(r2, r3)
            int r2 = r2.left
            if (r3 == 0) goto Lac
            if (r1 <= r2) goto Lbb
        Lac:
            boolean r2 = r0.requestFocus()
            goto Lc4
        Lb1:
            if (r8 == r5) goto Lc0
            if (r8 != r1) goto Lb6
            goto Lc0
        Lb6:
            if (r8 == r4) goto Lbb
            r0 = 2
            if (r8 != r0) goto Lc4
        Lbb:
            boolean r2 = r7.m3689k()
            goto Lc4
        Lc0:
            boolean r2 = r7.m3688j()
        Lc4:
            if (r2 == 0) goto Lcd
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m3684f(int):boolean");
    }

    /* renamed from: a */
    private Rect m3661a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: j */
    private boolean m3688j() {
        if (this.f4440c <= 0) {
            return false;
        }
        m3691a(this.f4440c - 1, true);
        return true;
    }

    /* renamed from: k */
    private boolean m3689k() {
        if (this.f4439b == null || this.f4440c >= this.f4439b.m3699a() - 1) {
            return false;
        }
        m3691a(this.f4440c + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1104k m3681e;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m3681e = m3681e()) != null && m3681e.f4475a == this.f4440c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C1104k m3681e;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m3681e = m3681e()) != null && m3681e.f4475a == this.f4440c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1104k m3681e;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m3681e = m3681e()) != null && m3681e.f4475a == this.f4440c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1104k m3681e;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m3681e = m3681e()) != null && m3681e.f4475a == this.f4440c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1105l();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1105l) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1105l(getContext(), attributeSet);
    }
}
