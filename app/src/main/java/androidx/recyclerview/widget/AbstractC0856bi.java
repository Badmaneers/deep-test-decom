package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0484e;
import androidx.core.p024g.p025a.C0485f;
import androidx.recyclerview.R;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bi */
/* loaded from: classes.dex */
public abstract class AbstractC0856bi {

    /* renamed from: e */
    private int f3530e;

    /* renamed from: f */
    private int f3531f;

    /* renamed from: g */
    private int f3532g;

    /* renamed from: h */
    private int f3533h;

    /* renamed from: p */
    C0899d f3534p;

    /* renamed from: q */
    RecyclerView f3535q;

    /* renamed from: t */
    AbstractC0872by f3538t;

    /* renamed from: x */
    int f3542x;

    /* renamed from: y */
    boolean f3543y;

    /* renamed from: a */
    private final InterfaceC0895cu f3526a = new C0857bj(this);

    /* renamed from: b */
    private final InterfaceC0895cu f3527b = new C0858bk(this);

    /* renamed from: r */
    C0893cs f3536r = new C0893cs(this.f3526a);

    /* renamed from: s */
    C0893cs f3537s = new C0893cs(this.f3527b);

    /* renamed from: u */
    boolean f3539u = false;

    /* renamed from: v */
    boolean f3540v = false;

    /* renamed from: w */
    boolean f3541w = false;

    /* renamed from: c */
    private boolean f3528c = true;

    /* renamed from: d */
    private boolean f3529d = true;

    /* renamed from: a */
    public int mo2772a(int i, C0868bu c0868bu, C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: a */
    public int mo2743a(C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: a */
    public View mo2774a(View view, int i, C0868bu c0868bu, C0876cb c0876cb) {
        return null;
    }

    /* renamed from: a */
    public void mo2778a() {
    }

    /* renamed from: a */
    public void mo2779a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo2824a(int i, int i2, C0876cb c0876cb, InterfaceC0859bl interfaceC0859bl) {
    }

    /* renamed from: a */
    public void mo2825a(int i, InterfaceC0859bl interfaceC0859bl) {
    }

    /* renamed from: a */
    public void mo2826a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo2829a(RecyclerView recyclerView, C0868bu c0868bu) {
    }

    /* renamed from: a */
    public boolean mo2786a(C0861bn c0861bn) {
        return c0861bn != null;
    }

    /* renamed from: b */
    public int mo2787b(int i, C0868bu c0868bu, C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: b */
    public int mo2744b(C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: b */
    public abstract C0861bn mo2789b();

    /* renamed from: b */
    public void mo2790b(int i, int i2) {
    }

    /* renamed from: c */
    public void mo2792c(int i, int i2) {
    }

    /* renamed from: c */
    public void mo2794c(C0876cb c0876cb) {
    }

    /* renamed from: d */
    public int mo2795d(C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: d */
    public void mo2836d(int i) {
    }

    /* renamed from: d */
    public void mo2796d(int i, int i2) {
    }

    /* renamed from: d */
    public boolean mo2797d() {
        return false;
    }

    /* renamed from: e */
    public int mo2798e(C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: f */
    public int mo2839f(C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: f */
    public Parcelable mo2840f() {
        return null;
    }

    /* renamed from: g */
    public int mo2841g(C0876cb c0876cb) {
        return 0;
    }

    /* renamed from: g */
    public boolean mo2842g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo2843h() {
        return false;
    }

    /* renamed from: i */
    public void mo2900i(int i) {
    }

    /* renamed from: m */
    public boolean mo2848m() {
        return false;
    }

    /* renamed from: a */
    public final void m3093a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3535q = null;
            this.f3534p = null;
            this.f3532g = 0;
            this.f3533h = 0;
        } else {
            this.f3535q = recyclerView;
            this.f3534p = recyclerView.mChildHelper;
            this.f3532g = recyclerView.getWidth();
            this.f3533h = recyclerView.getHeight();
        }
        this.f3530e = 1073741824;
        this.f3531f = 1073741824;
    }

    /* renamed from: e */
    public final void m3110e(int i, int i2) {
        this.f3532g = View.MeasureSpec.getSize(i);
        this.f3530e = View.MeasureSpec.getMode(i);
        if (this.f3530e == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f3532g = 0;
        }
        this.f3533h = View.MeasureSpec.getSize(i2);
        this.f3531f = View.MeasureSpec.getMode(i2);
        if (this.f3531f != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.f3533h = 0;
    }

    /* renamed from: f */
    public final void m3113f(int i, int i2) {
        int m3121v = m3121v();
        if (m3121v == 0) {
            this.f3535q.defaultOnMeasure(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < m3121v; i7++) {
            View m3111f = m3111f(i7);
            Rect rect = this.f3535q.mTempRect;
            RecyclerView.getDecoratedBoundsWithMarginsInt(m3111f, rect);
            if (rect.left < i3) {
                i3 = rect.left;
            }
            if (rect.right > i4) {
                i4 = rect.right;
            }
            if (rect.top < i6) {
                i6 = rect.top;
            }
            if (rect.bottom > i5) {
                i5 = rect.bottom;
            }
        }
        this.f3535q.mTempRect.set(i3, i6, i4, i5);
        mo2780a(this.f3535q.mTempRect, i, i2);
    }

    /* renamed from: a */
    public void mo2780a(Rect rect, int i, int i2) {
        m3115h(m3060a(i, rect.width() + m3081A() + m3083C(), C0538w.m1885n(this.f3535q)), m3060a(i2, rect.height() + m3082B() + m3084D(), C0538w.m1886o(this.f3535q)));
    }

    /* renamed from: q */
    public final void m3116q() {
        if (this.f3535q != null) {
            this.f3535q.requestLayout();
        }
    }

    /* renamed from: a */
    public static int m3060a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* renamed from: a */
    public void mo2831a(String str) {
        if (this.f3535q != null) {
            this.f3535q.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: e */
    public boolean mo2838e() {
        return this.f3541w;
    }

    /* renamed from: r */
    public final boolean m3117r() {
        return this.f3529d;
    }

    /* renamed from: b */
    public final void m3104b(RecyclerView recyclerView, C0868bu c0868bu) {
        this.f3540v = false;
        mo2829a(recyclerView, c0868bu);
    }

    /* renamed from: a */
    public final boolean m3100a(Runnable runnable) {
        if (this.f3535q != null) {
            return this.f3535q.removeCallbacks(runnable);
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m3118s() {
        return this.f3535q != null && this.f3535q.mClipToPadding;
    }

    /* renamed from: c */
    public void mo2793c(C0868bu c0868bu, C0876cb c0876cb) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    /* renamed from: a */
    public C0861bn mo2777a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0861bn) {
            return new C0861bn((C0861bn) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0861bn((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0861bn(layoutParams);
    }

    /* renamed from: a */
    public C0861bn mo2776a(Context context, AttributeSet attributeSet) {
        return new C0861bn(context, attributeSet);
    }

    /* renamed from: a */
    public void mo2828a(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    /* renamed from: a */
    public final void m3096a(AbstractC0872by abstractC0872by) {
        if (this.f3538t != null && abstractC0872by != this.f3538t && this.f3538t.m3183e()) {
            this.f3538t.m3179c();
        }
        this.f3538t = abstractC0872by;
        this.f3538t.m3177a(this.f3535q, this);
    }

    /* renamed from: t */
    public final boolean m3119t() {
        return this.f3538t != null && this.f3538t.m3183e();
    }

    /* renamed from: u */
    public final int m3120u() {
        return C0538w.m1878h(this.f3535q);
    }

    /* renamed from: b */
    public final void m3101b(View view) {
        m3066a(view, 0, true);
    }

    /* renamed from: d */
    public final void m3109d(View view) {
        m3066a(view, 0, false);
    }

    /* renamed from: a */
    private void m3066a(View view, int i, boolean z) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z || childViewHolderInt.m3220n()) {
            this.f3535q.mViewInfoStore.m3275d(childViewHolderInt);
        } else {
            this.f3535q.mViewInfoStore.m3276e(childViewHolderInt);
        }
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        if (childViewHolderInt.m3214h() || childViewHolderInt.m3212f()) {
            if (childViewHolderInt.m3212f()) {
                childViewHolderInt.m3213g();
            } else {
                childViewHolderInt.m3215i();
            }
            this.f3534p.m3287a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f3535q) {
            int m3292c = this.f3534p.m3292c(view);
            if (i == -1) {
                i = this.f3534p.m3284a();
            }
            if (m3292c == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3535q.indexOfChild(view) + this.f3535q.exceptionLabel());
            }
            if (m3292c != i) {
                this.f3535q.mLayout.m3073i(m3292c, i);
            }
        } else {
            this.f3534p.m3288a(view, i, false);
            c0861bn.f3552e = true;
            if (this.f3538t != null && this.f3538t.m3183e()) {
                this.f3538t.m3176a(view);
            }
        }
        if (c0861bn.f3553f) {
            childViewHolderInt.f3614a.invalidate();
            c0861bn.f3553f = false;
        }
    }

    /* renamed from: a */
    private void m3063a(int i) {
        if (m3111f(i) != null) {
            this.f3534p.m3285a(i);
        }
    }

    /* renamed from: e */
    public static int m3069e(View view) {
        return ((C0861bn) view.getLayoutParams()).f3550c.m3209c();
    }

    /* renamed from: f */
    public final View m3112f(View view) {
        View findContainingItemView;
        if (this.f3535q == null || (findContainingItemView = this.f3535q.findContainingItemView(view)) == null || this.f3534p.m3295d(findContainingItemView)) {
            return null;
        }
        return findContainingItemView;
    }

    /* renamed from: b */
    public View mo2832b(int i) {
        int m3121v = m3121v();
        for (int i2 = 0; i2 < m3121v; i2++) {
            View m3111f = m3111f(i2);
            AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(m3111f);
            if (childViewHolderInt != null && childViewHolderInt.m3209c() == i && !childViewHolderInt.m3208b() && (this.f3535q.mState.f3595g || !childViewHolderInt.m3220n())) {
                return m3111f;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m3068c(int i) {
        m3111f(i);
        this.f3534p.m3294d(i);
    }

    /* renamed from: a */
    private void m3064a(View view, int i) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.m3220n()) {
            this.f3535q.mViewInfoStore.m3275d(childViewHolderInt);
        } else {
            this.f3535q.mViewInfoStore.m3276e(childViewHolderInt);
        }
        this.f3534p.m3287a(view, i, c0861bn, childViewHolderInt.m3220n());
    }

    /* renamed from: i */
    private void m3073i(int i, int i2) {
        View m3111f = m3111f(i);
        if (m3111f == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3535q.toString());
        }
        m3068c(i);
        m3064a(m3111f, i2);
    }

    /* renamed from: a */
    public final void m3088a(int i, C0868bu c0868bu) {
        View m3111f = m3111f(i);
        m3063a(i);
        c0868bu.m3160a(m3111f);
    }

    /* renamed from: v */
    public final int m3121v() {
        if (this.f3534p != null) {
            return this.f3534p.m3284a();
        }
        return 0;
    }

    /* renamed from: f */
    public final View m3111f(int i) {
        if (this.f3534p != null) {
            return this.f3534p.m3290b(i);
        }
        return null;
    }

    /* renamed from: w */
    public final int m3122w() {
        return this.f3530e;
    }

    /* renamed from: x */
    public final int m3123x() {
        return this.f3531f;
    }

    /* renamed from: y */
    public final int m3124y() {
        return this.f3532g;
    }

    /* renamed from: z */
    public final int m3125z() {
        return this.f3533h;
    }

    /* renamed from: A */
    public final int m3081A() {
        if (this.f3535q != null) {
            return this.f3535q.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: B */
    public final int m3082B() {
        if (this.f3535q != null) {
            return this.f3535q.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: C */
    public final int m3083C() {
        if (this.f3535q != null) {
            return this.f3535q.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: D */
    public final int m3084D() {
        if (this.f3535q != null) {
            return this.f3535q.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final View m3085E() {
        View focusedChild;
        if (this.f3535q == null || (focusedChild = this.f3535q.getFocusedChild()) == null || this.f3534p.m3295d(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    /* renamed from: F */
    public final int m3086F() {
        AbstractC0845ay adapter = this.f3535q != null ? this.f3535q.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo3020b();
        }
        return 0;
    }

    /* renamed from: g */
    public void mo2898g(int i) {
        if (this.f3535q != null) {
            this.f3535q.offsetChildrenHorizontal(i);
        }
    }

    /* renamed from: h */
    public void mo2899h(int i) {
        if (this.f3535q != null) {
            this.f3535q.offsetChildrenVertical(i);
        }
    }

    /* renamed from: a */
    public final void m3094a(C0868bu c0868bu) {
        for (int m3121v = m3121v() - 1; m3121v >= 0; m3121v--) {
            View m3111f = m3111f(m3121v);
            AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(m3111f);
            if (!childViewHolderInt.m3208b()) {
                if (childViewHolderInt.m3217k() && !childViewHolderInt.m3220n() && !this.f3535q.mAdapter.m3026c()) {
                    m3063a(m3121v);
                    c0868bu.m3162a(childViewHolderInt);
                } else {
                    m3068c(m3121v);
                    c0868bu.m3170c(m3111f);
                    this.f3535q.mViewInfoStore.m3276e(childViewHolderInt);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m3097a(View view, int i, int i2, C0861bn c0861bn) {
        return (this.f3528c && m3067b(view.getMeasuredWidth(), i, c0861bn.width) && m3067b(view.getMeasuredHeight(), i2, c0861bn.height)) ? false : true;
    }

    /* renamed from: b */
    public final boolean m3106b(View view, int i, int i2, C0861bn c0861bn) {
        return (!view.isLayoutRequested() && this.f3528c && m3067b(view.getWidth(), i, c0861bn.width) && m3067b(view.getHeight(), i2, c0861bn.height)) ? false : true;
    }

    /* renamed from: b */
    private static boolean m3067b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:            if (r5 == 1073741824) goto L38;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3061a(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1b
            if (r7 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L20
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L20
            goto L2f
        L1b:
            if (r7 < 0) goto L1e
            goto L10
        L1e:
            if (r7 != r1) goto L23
        L20:
            r7 = r4
            r6 = r5
            goto L30
        L23:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L2a
            goto L2c
        L2a:
            r7 = r4
            goto L30
        L2c:
            r7 = r4
            r6 = r2
            goto L30
        L2f:
            r7 = r6
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0856bi.m3061a(int, int, int, int, boolean):int");
    }

    /* renamed from: g */
    public static int m3070g(View view) {
        Rect rect = ((C0861bn) view.getLayoutParams()).f3551d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: h */
    public static int m3071h(View view) {
        Rect rect = ((C0861bn) view.getLayoutParams()).f3551d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: a */
    public static void m3065a(View view, int i, int i2, int i3, int i4) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        Rect rect = c0861bn.f3551d;
        view.layout(i + rect.left + c0861bn.leftMargin, i2 + rect.top + c0861bn.topMargin, (i3 - rect.right) - c0861bn.rightMargin, (i4 - rect.bottom) - c0861bn.bottomMargin);
    }

    /* renamed from: a */
    public final void m3090a(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0861bn) view.getLayoutParams()).f3551d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3535q != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3535q.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: i */
    public static int m3072i(View view) {
        return view.getLeft() - m3079o(view);
    }

    /* renamed from: j */
    public static int m3074j(View view) {
        return view.getTop() - m3077m(view);
    }

    /* renamed from: k */
    public static int m3075k(View view) {
        return view.getRight() + m3080p(view);
    }

    /* renamed from: l */
    public static int m3076l(View view) {
        return view.getBottom() + m3078n(view);
    }

    /* renamed from: b */
    public final void m3102b(View view, Rect rect) {
        if (this.f3535q == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.f3535q.getItemDecorInsetsForChild(view));
        }
    }

    /* renamed from: m */
    public static int m3077m(View view) {
        return ((C0861bn) view.getLayoutParams()).f3551d.top;
    }

    /* renamed from: n */
    public static int m3078n(View view) {
        return ((C0861bn) view.getLayoutParams()).f3551d.bottom;
    }

    /* renamed from: o */
    public static int m3079o(View view) {
        return ((C0861bn) view.getLayoutParams()).f3551d.left;
    }

    /* renamed from: p */
    public static int m3080p(View view) {
        return ((C0861bn) view.getLayoutParams()).f3551d.right;
    }

    /* renamed from: g */
    public final void m3114g(int i, int i2) {
        this.f3535q.defaultOnMeasure(i, i2);
    }

    /* renamed from: h */
    public final void m3115h(int i, int i2) {
        this.f3535q.setMeasuredDimension(i, i2);
    }

    /* renamed from: G */
    public final void m3087G() {
        if (this.f3538t != null) {
            this.f3538t.m3179c();
        }
    }

    /* renamed from: c */
    public final void m3108c(C0868bu c0868bu) {
        for (int m3121v = m3121v() - 1; m3121v >= 0; m3121v--) {
            if (!RecyclerView.getChildViewHolderInt(m3111f(m3121v)).m3208b()) {
                m3088a(m3121v, c0868bu);
            }
        }
    }

    /* renamed from: a */
    public void mo3095a(C0868bu c0868bu, C0876cb c0876cb, C0482c c0482c) {
        if (this.f3535q.canScrollVertically(-1) || this.f3535q.canScrollHorizontally(-1)) {
            c0482c.m1646a(8192);
            c0482c.m1692k(true);
        }
        if (this.f3535q.canScrollVertically(1) || this.f3535q.canScrollHorizontally(1)) {
            c0482c.m1646a(4096);
            c0482c.m1692k(true);
        }
        c0482c.m1653a(C0484e.m1714a(mo2773a(c0868bu, c0876cb), mo2788b(c0868bu, c0876cb), 0));
    }

    /* renamed from: a */
    public final void m3091a(View view, C0482c c0482c) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.m3220n() || this.f3534p.m3295d(childViewHolderInt.f3614a)) {
            return;
        }
        mo2781a(this.f3535q.mRecycler, this.f3535q.mState, view, c0482c);
    }

    /* renamed from: a */
    public void mo2781a(C0868bu c0868bu, C0876cb c0876cb, View view, C0482c c0482c) {
        c0482c.m1661b(C0485f.m1715a(mo2843h() ? m3069e(view) : 0, 1, mo2842g() ? m3069e(view) : 0, 1, false));
    }

    /* renamed from: a */
    public int mo2773a(C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3535q == null || this.f3535q.mAdapter == null || !mo2843h()) {
            return 1;
        }
        return this.f3535q.mAdapter.mo3020b();
    }

    /* renamed from: b */
    public int mo2788b(C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3535q == null || this.f3535q.mAdapter == null || !mo2842g()) {
            return 1;
        }
        return this.f3535q.mAdapter.mo3020b();
    }

    /* renamed from: a */
    public boolean mo3099a(C0868bu c0868bu, C0876cb c0876cb, int i, Bundle bundle) {
        int m3082B;
        int m3081A;
        int i2;
        int i3;
        if (this.f3535q == null) {
            return false;
        }
        if (i == 4096) {
            m3082B = this.f3535q.canScrollVertically(1) ? (this.f3533h - m3082B()) - m3084D() : 0;
            if (this.f3535q.canScrollHorizontally(1)) {
                m3081A = (this.f3532g - m3081A()) - m3083C();
                i2 = m3082B;
                i3 = m3081A;
            }
            i2 = m3082B;
            i3 = 0;
        } else if (i != 8192) {
            i3 = 0;
            i2 = 0;
        } else {
            m3082B = this.f3535q.canScrollVertically(-1) ? -((this.f3533h - m3082B()) - m3084D()) : 0;
            if (this.f3535q.canScrollHorizontally(-1)) {
                m3081A = -((this.f3532g - m3081A()) - m3083C());
                i2 = m3082B;
                i3 = m3081A;
            }
            i2 = m3082B;
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.f3535q.smoothScrollBy(i3, i2, null, RecyclerView.UNDEFINED_DURATION, true);
        return true;
    }

    /* renamed from: a */
    public static C0860bm m3062a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0860bm c0860bm = new C0860bm();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
        c0860bm.f3546a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
        c0860bm.f3547b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
        c0860bm.f3548c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
        c0860bm.f3549d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return c0860bm;
    }

    /* renamed from: b */
    public final void m3103b(RecyclerView recyclerView) {
        m3110e(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: a */
    public final void m3089a(View view) {
        m3066a(view, -1, true);
    }

    /* renamed from: c */
    public final void m3107c(View view) {
        m3066a(view, -1, false);
    }

    /* renamed from: a */
    public final void m3092a(View view, C0868bu c0868bu) {
        this.f3534p.m3291b(view);
        c0868bu.m3160a(view);
    }

    /* renamed from: b */
    public final void m3105b(C0868bu c0868bu) {
        int size = c0868bu.f3560a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = c0868bu.f3560a.get(i).f3614a;
            AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.m3208b()) {
                childViewHolderInt.m3204a(false);
                if (childViewHolderInt.m3221o()) {
                    this.f3535q.removeDetachedView(view, false);
                }
                if (this.f3535q.mItemAnimator != null) {
                    this.f3535q.mItemAnimator.mo3046c(childViewHolderInt);
                }
                childViewHolderInt.m3204a(true);
                c0868bu.m3166b(view);
            }
        }
        c0868bu.f3560a.clear();
        if (c0868bu.f3561b != null) {
            c0868bu.f3561b.clear();
        }
        if (size > 0) {
            this.f3535q.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b6, code lost:            if (r9 == false) goto L69;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo3098a(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = r9.m3081A()
            int r2 = r9.m3082B()
            int r3 = r9.f3532g
            int r4 = r9.m3083C()
            int r3 = r3 - r4
            int r4 = r9.f3533h
            int r5 = r9.m3084D()
            int r4 = r4 - r5
            int r5 = r11.getLeft()
            int r6 = r12.left
            int r5 = r5 + r6
            int r6 = r11.getScrollX()
            int r5 = r5 - r6
            int r6 = r11.getTop()
            int r7 = r12.top
            int r6 = r6 + r7
            int r11 = r11.getScrollY()
            int r6 = r6 - r11
            int r11 = r12.width()
            int r11 = r11 + r5
            int r12 = r12.height()
            int r12 = r12 + r6
            int r5 = r5 - r1
            r1 = 0
            int r7 = java.lang.Math.min(r1, r5)
            int r6 = r6 - r2
            int r2 = java.lang.Math.min(r1, r6)
            int r11 = r11 - r3
            int r3 = java.lang.Math.max(r1, r11)
            int r12 = r12 - r4
            int r12 = java.lang.Math.max(r1, r12)
            androidx.recyclerview.widget.RecyclerView r4 = r9.f3535q
            int r4 = androidx.core.p024g.C0538w.m1878h(r4)
            r8 = 1
            if (r4 != r8) goto L61
            if (r3 == 0) goto L5c
            goto L6a
        L5c:
            int r3 = java.lang.Math.max(r7, r11)
            goto L6a
        L61:
            if (r7 == 0) goto L65
        L63:
            r3 = r7
            goto L6a
        L65:
            int r7 = java.lang.Math.min(r5, r3)
            goto L63
        L6a:
            if (r2 == 0) goto L6d
            goto L71
        L6d:
            int r2 = java.lang.Math.min(r6, r12)
        L71:
            r0[r1] = r3
            r0[r8] = r2
            r11 = r0[r1]
            r12 = r0[r8]
            if (r14 == 0) goto Lb8
            android.view.View r14 = r10.getFocusedChild()
            if (r14 != 0) goto L83
        L81:
            r9 = r1
            goto Lb6
        L83:
            int r0 = r9.m3081A()
            int r2 = r9.m3082B()
            int r3 = r9.f3532g
            int r4 = r9.m3083C()
            int r3 = r3 - r4
            int r4 = r9.f3533h
            int r5 = r9.m3084D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r9 = r9.f3535q
            android.graphics.Rect r9 = r9.mTempRect
            androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r14, r9)
            int r14 = r9.left
            int r14 = r14 - r11
            if (r14 >= r3) goto L81
            int r14 = r9.right
            int r14 = r14 - r11
            if (r14 <= r0) goto L81
            int r14 = r9.top
            int r14 = r14 - r12
            if (r14 >= r4) goto L81
            int r9 = r9.bottom
            int r9 = r9 - r12
            if (r9 > r2) goto Lb5
            goto L81
        Lb5:
            r9 = r8
        Lb6:
            if (r9 == 0) goto Lbd
        Lb8:
            if (r11 != 0) goto Lbe
            if (r12 == 0) goto Lbd
            goto Lbe
        Lbd:
            return r1
        Lbe:
            if (r13 == 0) goto Lc4
            r10.scrollBy(r11, r12)
            goto Lc7
        Lc4:
            r10.smoothScrollBy(r11, r12)
        Lc7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0856bi.mo3098a(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: a */
    public void mo2827a(AccessibilityEvent accessibilityEvent) {
        if (this.f3535q == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!this.f3535q.canScrollVertically(1) && !this.f3535q.canScrollVertically(-1) && !this.f3535q.canScrollHorizontally(-1) && !this.f3535q.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (this.f3535q.mAdapter != null) {
            accessibilityEvent.setItemCount(this.f3535q.mAdapter.mo3020b());
        }
    }
}
