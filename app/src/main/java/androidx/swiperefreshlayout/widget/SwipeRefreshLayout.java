package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C0420a;
import androidx.core.p024g.C0529n;
import androidx.core.p024g.C0533r;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0526k;
import androidx.core.p024g.InterfaceC0530o;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0526k, InterfaceC0530o {

    /* renamed from: E */
    private static final int[] f3987E = {R.attr.enabled};

    /* renamed from: n */
    private static final String f3988n = "SwipeRefreshLayout";

    /* renamed from: A */
    private boolean f3989A;

    /* renamed from: B */
    private int f3990B;

    /* renamed from: C */
    private boolean f3991C;

    /* renamed from: D */
    private final DecelerateInterpolator f3992D;

    /* renamed from: F */
    private int f3993F;

    /* renamed from: G */
    private Animation f3994G;

    /* renamed from: H */
    private Animation f3995H;

    /* renamed from: I */
    private Animation f3996I;

    /* renamed from: J */
    private Animation f3997J;

    /* renamed from: K */
    private Animation f3998K;

    /* renamed from: L */
    private int f3999L;

    /* renamed from: M */
    private InterfaceC0995o f4000M;

    /* renamed from: N */
    private Animation.AnimationListener f4001N;

    /* renamed from: O */
    private final Animation f4002O;

    /* renamed from: P */
    private final Animation f4003P;

    /* renamed from: a */
    InterfaceC0996p f4004a;

    /* renamed from: b */
    boolean f4005b;

    /* renamed from: c */
    int f4006c;

    /* renamed from: d */
    boolean f4007d;

    /* renamed from: e */
    C0981a f4008e;

    /* renamed from: f */
    protected int f4009f;

    /* renamed from: g */
    float f4010g;

    /* renamed from: h */
    protected int f4011h;

    /* renamed from: i */
    int f4012i;

    /* renamed from: j */
    int f4013j;

    /* renamed from: k */
    C0983c f4014k;

    /* renamed from: l */
    boolean f4015l;

    /* renamed from: m */
    boolean f4016m;

    /* renamed from: o */
    private View f4017o;

    /* renamed from: p */
    private int f4018p;

    /* renamed from: q */
    private float f4019q;

    /* renamed from: r */
    private float f4020r;

    /* renamed from: s */
    private final C0533r f4021s;

    /* renamed from: t */
    private final C0529n f4022t;

    /* renamed from: u */
    private final int[] f4023u;

    /* renamed from: v */
    private final int[] f4024v;

    /* renamed from: w */
    private boolean f4025w;

    /* renamed from: x */
    private int f4026x;

    /* renamed from: y */
    private float f4027y;

    /* renamed from: z */
    private float f4028z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3450a() {
        this.f4008e.clearAnimation();
        this.f4014k.stop();
        this.f4008e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4007d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4011h - this.f4006c);
        }
        this.f4006c = this.f4008e.getTop();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m3450a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3450a();
    }

    private void setColorViewAlpha(int i) {
        this.f4008e.getBackground().setAlpha(i);
        this.f4014k.setAlpha(i);
    }

    public int getProgressViewStartOffset() {
        return this.f4011h;
    }

    public int getProgressViewEndOffset() {
        return this.f4012i;
    }

    public void setSlingshotDistance(int i) {
        this.f4013j = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f3999L = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f3999L = (int) (displayMetrics.density * 40.0f);
            }
            this.f4008e.setImageDrawable(null);
            this.f4014k.m3460a(i);
            this.f4008e.setImageDrawable(this.f4014k);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4005b = false;
        this.f4019q = -1.0f;
        this.f4023u = new int[2];
        this.f4024v = new int[2];
        this.f3990B = -1;
        this.f3993F = -1;
        this.f4001N = new AnimationAnimationListenerC0987g(this);
        this.f4002O = new C0992l(this);
        this.f4003P = new C0993m(this);
        this.f4018p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4026x = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f3992D = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3999L = (int) (displayMetrics.density * 40.0f);
        this.f4008e = new C0981a(getContext());
        this.f4014k = new C0983c(getContext());
        this.f4014k.m3460a(1);
        this.f4008e.setImageDrawable(this.f4014k);
        this.f4008e.setVisibility(8);
        addView(this.f4008e);
        setChildrenDrawingOrderEnabled(true);
        this.f4012i = (int) (displayMetrics.density * 64.0f);
        this.f4019q = this.f4012i;
        this.f4021s = new C0533r();
        this.f4022t = new C0529n(this);
        setNestedScrollingEnabled(true);
        int i = -this.f3999L;
        this.f4006c = i;
        this.f4011h = i;
        m3451a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3987E);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f3993F < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f3993F;
        }
        return i2 >= this.f3993F ? i2 + 1 : i2;
    }

    public void setOnRefreshListener(InterfaceC0996p interfaceC0996p) {
        this.f4004a = interfaceC0996p;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f4005b != z) {
            this.f4005b = z;
            if (!this.f4016m) {
                i = this.f4012i + this.f4011h;
            } else {
                i = this.f4012i;
            }
            setTargetOffsetTopAndBottom(i - this.f4006c);
            this.f4015l = false;
            Animation.AnimationListener animationListener = this.f4001N;
            this.f4008e.setVisibility(0);
            this.f4014k.setAlpha(255);
            this.f3994G = new C0988h(this);
            this.f3994G.setDuration(this.f4026x);
            if (animationListener != null) {
                this.f4008e.m3454a(animationListener);
            }
            this.f4008e.clearAnimation();
            this.f4008e.startAnimation(this.f3994G);
            return;
        }
        m3439a(z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f4008e.setScaleX(f);
        this.f4008e.setScaleY(f);
    }

    /* renamed from: a */
    private void m3439a(boolean z, boolean z2) {
        if (this.f4005b != z) {
            this.f4015l = z2;
            m3447d();
            this.f4005b = z;
            if (this.f4005b) {
                m3437a(this.f4006c, this.f4001N);
            } else {
                m3452a(this.f4001N);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3452a(Animation.AnimationListener animationListener) {
        this.f3995H = new C0989i(this);
        this.f3995H.setDuration(150L);
        this.f4008e.m3454a(animationListener);
        this.f4008e.clearAnimation();
        this.f4008e.startAnimation(this.f3995H);
    }

    /* renamed from: b */
    private void m3441b() {
        this.f3996I = m3436a(this.f4014k.getAlpha(), 76);
    }

    /* renamed from: c */
    private void m3444c() {
        this.f3997J = m3436a(this.f4014k.getAlpha(), 255);
    }

    /* renamed from: a */
    private Animation m3436a(int i, int i2) {
        C0990j c0990j = new C0990j(this, i, i2);
        c0990j.setDuration(300L);
        this.f4008e.m3454a(null);
        this.f4008e.clearAnimation();
        this.f4008e.startAnimation(c0990j);
        return c0990j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0420a.m1488c(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f4008e.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0420a.m1488c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        m3447d();
        this.f4014k.m3462a(iArr);
    }

    /* renamed from: d */
    private void m3447d() {
        if (this.f4017o == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f4008e)) {
                    this.f4017o = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f4019q = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4017o == null) {
            m3447d();
        }
        if (this.f4017o == null) {
            return;
        }
        View view = this.f4017o;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4008e.getMeasuredWidth();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        this.f4008e.layout(i5 - i6, this.f4006c, i5 + i6, this.f4006c + this.f4008e.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4017o == null) {
            m3447d();
        }
        if (this.f4017o == null) {
            return;
        }
        this.f4017o.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4008e.measure(View.MeasureSpec.makeMeasureSpec(this.f3999L, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3999L, 1073741824));
        this.f3993F = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f4008e) {
                this.f3993F = i3;
                return;
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.f3999L;
    }

    /* renamed from: e */
    private boolean m3449e() {
        if (this.f4000M != null) {
            return this.f4000M.m3473a();
        }
        if (this.f4017o instanceof ListView) {
            ListView listView = (ListView) this.f4017o;
            if (Build.VERSION.SDK_INT >= 19) {
                return listView.canScrollList(-1);
            }
            if (listView.getChildCount() != 0) {
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int top = listView.getChildAt(0).getTop();
                if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                    return true;
                }
            }
            return false;
        }
        return this.f4017o.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(InterfaceC0995o interfaceC0995o) {
        this.f4000M = interfaceC0995o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m3447d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3991C && actionMasked == 0) {
            this.f3991C = false;
        }
        if (!isEnabled() || this.f3991C || m3449e() || this.f4005b || this.f4025w) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    setTargetOffsetTopAndBottom(this.f4011h - this.f4008e.getTop());
                    this.f3990B = motionEvent.getPointerId(0);
                    this.f3989A = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3990B);
                    if (findPointerIndex >= 0) {
                        this.f4028z = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f3989A = false;
                    this.f3990B = -1;
                    break;
                case 2:
                    if (this.f3990B == -1) {
                        Log.e(f3988n, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f3990B);
                    if (findPointerIndex2 >= 0) {
                        m3448d(motionEvent.getY(findPointerIndex2));
                        break;
                    } else {
                        return false;
                    }
            }
        } else {
            m3438a(motionEvent);
        }
        return this.f3989A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f4017o instanceof AbsListView)) {
            if (this.f4017o == null || C0538w.m1817A(this.f4017o)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f3991C || this.f4005b || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4021s.m1809a(i);
        startNestedScroll(i & 2);
        this.f4020r = 0.0f;
        this.f4025w = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f4020r > 0.0f) {
            float f = i2;
            if (f > this.f4020r) {
                iArr[1] = i2 - ((int) this.f4020r);
                this.f4020r = 0.0f;
            } else {
                this.f4020r -= f;
                iArr[1] = i2;
            }
            m3442b(this.f4020r);
        }
        if (this.f4016m && i2 > 0 && this.f4020r == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f4008e.setVisibility(8);
        }
        int[] iArr2 = this.f4023u;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4021s.m1808a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onStopNestedScroll(View view) {
        this.f4021s.m1811b();
        this.f4025w = false;
        if (this.f4020r > 0.0f) {
            m3445c(this.f4020r);
            this.f4020r = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f4024v);
        if (i4 + this.f4024v[1] >= 0 || m3449e()) {
            return;
        }
        this.f4020r += Math.abs(r11);
        m3442b(this.f4020r);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f4022t.m1794a(z);
    }

    @Override // android.view.View, androidx.core.p024g.InterfaceC0526k
    public boolean isNestedScrollingEnabled() {
        return this.f4022t.m1795a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f4022t.m1805b(i);
    }

    @Override // android.view.View, androidx.core.p024g.InterfaceC0526k
    public void stopNestedScroll() {
        this.f4022t.m1806c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4022t.m1804b();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4022t.m1800a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f4022t.m1802a(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4022t.m1797a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4022t.m1796a(f, f2);
    }

    /* renamed from: a */
    private static boolean m3440a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: b */
    private void m3442b(float f) {
        this.f4014k.m3461a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f4019q));
        float max = (Math.max((float) (min - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f4019q;
        float f2 = this.f4013j > 0 ? this.f4013j : this.f4016m ? this.f4012i - this.f4011h : this.f4012i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i = this.f4011h + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f4008e.getVisibility() != 0) {
            this.f4008e.setVisibility(0);
        }
        if (!this.f4007d) {
            this.f4008e.setScaleX(1.0f);
            this.f4008e.setScaleY(1.0f);
        }
        if (this.f4007d) {
            setAnimationProgress(Math.min(1.0f, f / this.f4019q));
        }
        if (f < this.f4019q) {
            if (this.f4014k.getAlpha() > 76 && !m3440a(this.f3996I)) {
                m3441b();
            }
        } else if (this.f4014k.getAlpha() < 255 && !m3440a(this.f3997J)) {
            m3444c();
        }
        this.f4014k.m3463b(Math.min(0.8f, max * 0.8f));
        this.f4014k.m3458a(Math.min(1.0f, max));
        this.f4014k.m3464c((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i - this.f4006c);
    }

    /* renamed from: c */
    private void m3445c(float f) {
        if (f > this.f4019q) {
            m3439a(true, true);
            return;
        }
        this.f4005b = false;
        this.f4014k.m3463b(0.0f);
        m3443b(this.f4006c, this.f4007d ? null : new AnimationAnimationListenerC0991k(this));
        this.f4014k.m3461a(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3991C && actionMasked == 0) {
            this.f3991C = false;
        }
        if (!isEnabled() || this.f3991C || m3449e() || this.f4005b || this.f4025w) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.f3990B = motionEvent.getPointerId(0);
                this.f3989A = false;
                return true;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3990B);
                if (findPointerIndex < 0) {
                    Log.e(f3988n, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f3989A) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f4027y) * 0.5f;
                    this.f3989A = false;
                    m3445c(y);
                }
                this.f3990B = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f3990B);
                if (findPointerIndex2 < 0) {
                    Log.e(f3988n, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m3448d(y2);
                if (!this.f3989A) {
                    return true;
                }
                float f = (y2 - this.f4027y) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m3442b(f);
                return true;
            case 3:
                return false;
            case 4:
            default:
                return true;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f3988n, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f3990B = motionEvent.getPointerId(actionIndex);
                return true;
            case 6:
                m3438a(motionEvent);
                return true;
        }
    }

    /* renamed from: d */
    private void m3448d(float f) {
        if (f - this.f4028z <= this.f4018p || this.f3989A) {
            return;
        }
        this.f4027y = this.f4028z + this.f4018p;
        this.f3989A = true;
        this.f4014k.setAlpha(76);
    }

    /* renamed from: a */
    private void m3437a(int i, Animation.AnimationListener animationListener) {
        this.f4009f = i;
        this.f4002O.reset();
        this.f4002O.setDuration(200L);
        this.f4002O.setInterpolator(this.f3992D);
        if (animationListener != null) {
            this.f4008e.m3454a(animationListener);
        }
        this.f4008e.clearAnimation();
        this.f4008e.startAnimation(this.f4002O);
    }

    /* renamed from: b */
    private void m3443b(int i, Animation.AnimationListener animationListener) {
        if (this.f4007d) {
            m3446c(i, animationListener);
            return;
        }
        this.f4009f = i;
        this.f4003P.reset();
        this.f4003P.setDuration(200L);
        this.f4003P.setInterpolator(this.f3992D);
        if (animationListener != null) {
            this.f4008e.m3454a(animationListener);
        }
        this.f4008e.clearAnimation();
        this.f4008e.startAnimation(this.f4003P);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3451a(float f) {
        setTargetOffsetTopAndBottom((this.f4009f + ((int) ((this.f4011h - this.f4009f) * f))) - this.f4008e.getTop());
    }

    /* renamed from: c */
    private void m3446c(int i, Animation.AnimationListener animationListener) {
        this.f4009f = i;
        this.f4010g = this.f4008e.getScaleX();
        this.f3998K = new C0994n(this);
        this.f3998K.setDuration(150L);
        if (animationListener != null) {
            this.f4008e.m3454a(animationListener);
        }
        this.f4008e.clearAnimation();
        this.f4008e.startAnimation(this.f3998K);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f4008e.bringToFront();
        C0538w.m1869c((View) this.f4008e, i);
        this.f4006c = this.f4008e.getTop();
    }

    /* renamed from: a */
    private void m3438a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3990B) {
            this.f3990B = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
