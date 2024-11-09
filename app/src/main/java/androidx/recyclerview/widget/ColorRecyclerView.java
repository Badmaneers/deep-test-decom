package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.color.support.p044a.C1307a;
import com.color.support.p045b.p046a.C1308a;
import com.color.support.widget.C1371am;
import com.color.support.widget.C1426cn;
import com.color.support.widget.C1556gn;
import com.color.support.widget.InterfaceC1534fs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ColorRecyclerView extends RecyclerView {

    /* renamed from: A */
    private AbstractC0863bp f3339A;

    /* renamed from: B */
    private final int f3340B;

    /* renamed from: C */
    private final int f3341C;

    /* renamed from: D */
    private AbstractC0865br f3342D;

    /* renamed from: E */
    private List<AbstractC0865br> f3343E;

    /* renamed from: F */
    private final int[] f3344F;

    /* renamed from: G */
    private final int[] f3345G;

    /* renamed from: a */
    boolean f3346a;

    /* renamed from: b */
    final int f3347b;

    /* renamed from: c */
    final int f3348c;

    /* renamed from: d */
    final int f3349d;

    /* renamed from: e */
    final int f3350e;

    /* renamed from: f */
    final RunnableC0902g f3351f;

    /* renamed from: g */
    private final ArrayList<InterfaceC0864bq> f3352g;

    /* renamed from: h */
    private InterfaceC0864bq f3353h;

    /* renamed from: i */
    private boolean f3354i;

    /* renamed from: j */
    private int f3355j;

    /* renamed from: k */
    private int f3356k;

    /* renamed from: l */
    private int f3357l;

    /* renamed from: m */
    private InterfaceC1534fs f3358m;

    /* renamed from: n */
    private C1556gn f3359n;

    /* renamed from: o */
    private C1426cn f3360o;

    /* renamed from: p */
    private C1371am f3361p;

    /* renamed from: q */
    private boolean f3362q;

    /* renamed from: r */
    private int f3363r;

    /* renamed from: s */
    private int f3364s;

    /* renamed from: t */
    private int f3365t;

    /* renamed from: u */
    private VelocityTracker f3366u;

    /* renamed from: v */
    private int f3367v;

    /* renamed from: w */
    private int f3368w;

    /* renamed from: x */
    private int f3369x;

    /* renamed from: y */
    private int f3370y;

    /* renamed from: z */
    private int f3371z;

    /* renamed from: b */
    public static /* synthetic */ int m2748b(ColorRecyclerView colorRecyclerView) {
        colorRecyclerView.f3355j = 3;
        return 3;
    }

    public ColorRecyclerView(Context context) {
        this(context, null);
    }

    public ColorRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3352g = new ArrayList<>();
        this.f3346a = true;
        this.f3347b = 0;
        this.f3348c = 1;
        this.f3349d = 2;
        this.f3350e = 3;
        this.f3363r = 0;
        this.f3364s = 0;
        this.f3365t = -1;
        this.f3351f = new RunnableC0902g(this);
        this.f3344F = new int[2];
        this.f3345G = new int[2];
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3371z = viewConfiguration.getScaledTouchSlop();
        this.f3340B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3341C = viewConfiguration.getScaledMaximumFlingVelocity();
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        this.f3356k = i2;
        this.f3357l = i2;
        this.f3359n = new C1556gn(context, (byte) 0);
        this.f3360o = new C1426cn(context);
        setIsUseNativeOverScroll(false);
        this.f3361p = new C1371am();
        this.f3361p.m4897a(this);
    }

    public int getHorizontalItemAlign() {
        return this.f3361p.m4895a();
    }

    public void setIsUseNativeOverScroll(boolean z) {
        this.f3362q = z;
        if (this.f3362q) {
            this.f3358m = this.f3360o;
        } else {
            this.f3358m = this.f3359n;
        }
    }

    public boolean getIsUseNativeOverScroll() {
        return this.f3362q;
    }

    public void setHorizontalFlingFriction(float f) {
        this.f3360o.m4956a(f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(AbstractC0856bi abstractC0856bi) {
        super.setLayoutManager(abstractC0856bi);
        if (abstractC0856bi != null) {
            if (abstractC0856bi.mo2842g()) {
                this.f3359n.m5194c(3.2f);
            } else {
                this.f3359n.m5194c(2.15f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.f3371z = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w("ColorRecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.f3371z = viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnFlingListener(AbstractC0863bp abstractC0863bp) {
        this.f3339A = abstractC0863bp;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public AbstractC0863bp getOnFlingListener() {
        return this.f3339A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        return this.f3364s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollState(int i) {
        if (i == this.f3364s) {
            return;
        }
        this.f3364s = i;
        if (i != 2) {
            m2746a();
        }
        dispatchOnScrollStateChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Deprecated
    public void setOnScrollListener(AbstractC0865br abstractC0865br) {
        this.f3342D = abstractC0865br;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnScrollListener(AbstractC0865br abstractC0865br) {
        if (this.f3343E == null) {
            this.f3343E = new ArrayList();
        }
        this.f3343E.add(abstractC0865br);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void removeOnScrollListener(AbstractC0865br abstractC0865br) {
        if (this.f3343E != null) {
            this.f3343E.remove(abstractC0865br);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void clearOnScrollListeners() {
        if (this.f3343E != null) {
            this.f3343E.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollBy(int i, int i2) {
        if (this.mLayout == null) {
            Log.e("ColorRecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean mo2842g = this.mLayout.mo2842g();
        boolean mo2843h = this.mLayout.mo2843h();
        if (mo2842g || mo2843h) {
            if (!mo2842g) {
                i = 0;
            }
            if (!mo2843h) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        consumePendingUpdateOperations();
        if (this.mAdapter == null || ((i == 0 && i2 == 0) || (this.f3346a && ((getScrollY() < 0 && i2 > 0) || ((getScrollY() > 0 && i2 < 0) || ((getScrollX() < 0 && i > 0) || (getScrollX() > 0 && i < 0))))))) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        } else {
            this.mReusableIntPair[0] = 0;
            this.mReusableIntPair[1] = 0;
            scrollStep(i, i2, this.mReusableIntPair);
            int i7 = this.mReusableIntPair[0];
            int i8 = this.mReusableIntPair[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        this.mReusableIntPair[0] = 0;
        this.mReusableIntPair[1] = 0;
        dispatchNestedScroll(i3, i4, i5, i6, this.f3344F, 0, this.mReusableIntPair);
        int i9 = i5 - this.mReusableIntPair[0];
        int i10 = i6 - this.mReusableIntPair[1];
        this.f3369x -= this.f3344F[0];
        this.f3370y -= this.f3344F[1];
        if (motionEvent != null) {
            motionEvent.offsetLocation(this.f3344F[0], this.f3344F[1]);
        }
        int[] iArr = this.f3345G;
        iArr[0] = iArr[0] + this.f3344F[0];
        int[] iArr2 = this.f3345G;
        iArr2[1] = iArr2[1] + this.f3344F[1];
        if (getOverScrollMode() != 2 && motionEvent != null && this.f3346a) {
            if (i10 != 0 || i9 != 0) {
                this.f3355j = 2;
            }
            if (Math.abs(i10) == 0 && Math.abs(i4) < this.f3371z && Math.abs(i2) < this.f3371z && Math.abs(getScrollY()) > this.f3371z) {
                this.f3355j = 2;
            }
            if (i10 == 0 && i4 == 0 && Math.abs(i2) > this.f3371z) {
                this.f3355j = 2;
            }
            if (Math.abs(i9) == 0 && Math.abs(i3) < this.f3371z && Math.abs(i) < this.f3371z && Math.abs(getScrollX()) > this.f3371z) {
                this.f3355j = 2;
            }
            if (i9 == 0 && i3 == 0 && Math.abs(i) > this.f3371z) {
                this.f3355j = 2;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int m4284a = C1307a.m4284a(i10, scrollY, this.f3356k);
            int m4284a2 = C1307a.m4284a(i9, scrollX, this.f3356k);
            if ((scrollY < 0 && i2 > 0) || (scrollY > 0 && i2 < 0)) {
                m4284a = C1307a.m4284a(i2, scrollX, this.f3356k);
            }
            int i11 = m4284a;
            if ((scrollX < 0 && i > 0) || (scrollX > 0 && i < 0)) {
                m4284a2 = C1307a.m4284a(i, scrollX, this.f3356k);
            }
            int i12 = m4284a2;
            if (i11 != 0 || i12 != 0) {
                overScrollBy(i12, i11, scrollX, scrollY, 0, 0, this.f3356k, this.f3356k, true);
            }
        }
        if (i3 != 0 || i4 != 0) {
            dispatchOnScrolled(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        onScrollChanged(i, i2, getScrollX(), getScrollY());
        C1308a.m4286b(this, i);
        C1308a.m4285a(this, i2);
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
        awakenScrollBars();
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = i + i3;
        int i10 = i2 + i4;
        if ((i3 < 0 && i9 > 0) || (i3 > 0 && i9 < 0)) {
            i9 = 0;
        }
        if ((i4 < 0 && i10 > 0) || (i4 > 0 && i10 < 0)) {
            i10 = 0;
        }
        onOverScrolled(i9, i10, false, false);
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3346a) {
            if (this.f3355j == 2 || this.f3355j == 3) {
                C1556gn c1556gn = this.f3359n;
                if (c1556gn.computeScrollOffset()) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    int mo4959b = c1556gn.mo4959b();
                    int mo4960c = c1556gn.mo4960c();
                    if (scrollX != mo4959b || scrollY != mo4960c) {
                        overScrollBy(mo4959b - scrollX, mo4960c - scrollY, scrollX, scrollY, 0, 0, this.f3357l, this.f3357l, false);
                        onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
                    }
                    if (c1556gn.mo4958a()) {
                        setScrollState(0);
                    } else {
                        setScrollState(2);
                    }
                    if (awakenScrollBars()) {
                        return;
                    }
                    postInvalidateOnAnimation();
                }
            }
        }
    }

    public void setOverScrollEnable(boolean z) {
        this.f3346a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        if (this.mLayout == null) {
            Log.e("ColorRecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!this.mLayout.mo2842g()) {
            i = 0;
        }
        if (!this.mLayout.mo2843h()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f3351f.m3310a(i, i2, interpolator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (this.mLayout == null) {
            Log.e("ColorRecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int mo2842g = this.mLayout.mo2842g();
        boolean mo2843h = this.mLayout.mo2843h();
        if (mo2842g == 0 || Math.abs(i) < this.f3340B) {
            i = 0;
        }
        if (!mo2843h || Math.abs(i2) < this.f3340B) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            this.f3355j = 1;
            boolean z = mo2842g != 0 || mo2843h;
            dispatchNestedFling(f, f2, z);
            if (this.f3339A != null && this.f3339A.mo3133a(i, i2)) {
                return true;
            }
            if (z) {
                if (mo2843h) {
                    mo2842g = (mo2842g == true ? 1 : 0) | 2;
                }
                startNestedScroll(mo2842g, 1);
                this.f3351f.m3309a(Math.max(-this.f3341C, Math.min(i, this.f3341C)), Math.max(-this.f3341C, Math.min(i2, this.f3341C)));
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void stopScroll() {
        setScrollState(0);
        m2746a();
    }

    /* renamed from: a */
    private void m2746a() {
        this.f3351f.m3308a();
        if (this.mLayout != null) {
            this.mLayout.m3087G();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMinFlingVelocity() {
        return this.f3340B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMaxFlingVelocity() {
        return this.f3341C;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.f3363r > 0) {
            Log.w("ColorRecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(exceptionLabel()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnItemTouchListener(InterfaceC0864bq interfaceC0864bq) {
        this.f3352g.add(interfaceC0864bq);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void removeOnItemTouchListener(InterfaceC0864bq interfaceC0864bq) {
        this.f3352g.remove(interfaceC0864bq);
        if (this.f3353h == interfaceC0864bq) {
            this.f3353h = null;
        }
    }

    /* renamed from: a */
    private boolean m2747a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3352g.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0864bq interfaceC0864bq = this.f3352g.get(i);
            if (interfaceC0864bq.mo3134a(motionEvent) && action != 3) {
                this.f3353h = interfaceC0864bq;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.f3353h = null;
        if (m2747a(motionEvent)) {
            m2752c();
            return true;
        }
        if (this.mLayout == null) {
            return false;
        }
        boolean mo2842g = this.mLayout.mo2842g();
        boolean mo2843h = this.mLayout.mo2843h();
        if (this.f3366u == null) {
            this.f3366u = VelocityTracker.obtain();
        }
        this.f3366u.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.f3354i) {
                    this.f3354i = false;
                }
                this.f3365t = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f3369x = x;
                this.f3367v = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f3370y = y;
                this.f3368w = y;
                if (this.f3364s == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    stopNestedScroll(1);
                }
                int[] iArr = this.f3345G;
                this.f3345G[1] = 0;
                iArr[0] = 0;
                int i = mo2842g;
                if (mo2843h) {
                    i = (mo2842g ? 1 : 0) | 2;
                }
                startNestedScroll(i, 0);
                break;
            case 1:
                this.f3366u.clear();
                stopNestedScroll(0);
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3365t);
                if (findPointerIndex < 0) {
                    Log.e("ColorRecyclerView", "Error processing scroll; pointer index for id " + this.f3365t + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                if (this.f3364s != 1) {
                    int i2 = x2 - this.f3367v;
                    int i3 = y2 - this.f3368w;
                    if (mo2842g == 0 || Math.abs(i2) <= this.f3371z) {
                        z = false;
                    } else {
                        this.f3369x = x2;
                        z = true;
                    }
                    if (mo2843h && Math.abs(i3) > this.f3371z) {
                        this.f3370y = y2;
                        z = true;
                    }
                    if (z) {
                        setScrollState(1);
                        break;
                    }
                }
                break;
            case 3:
                m2752c();
                break;
            case 5:
                this.f3365t = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f3369x = x3;
                this.f3367v = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f3370y = y3;
                this.f3368w = y3;
                break;
            case 6:
                m2750b(motionEvent);
                break;
        }
        return this.f3364s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3352g.size();
        for (int i = 0; i < size; i++) {
            this.f3352g.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0255  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ColorRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private void m2749b() {
        if (this.f3366u != null) {
            this.f3366u.clear();
        }
        stopNestedScroll(0);
    }

    /* renamed from: c */
    private void m2752c() {
        m2749b();
        setScrollState(0);
        C1308a.m4286b(this, 0);
        C1308a.m4285a(this, 0);
    }

    /* renamed from: b */
    private void m2750b(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3365t) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3365t = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3369x = x;
            this.f3367v = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3370y = y;
            this.f3368w = y;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void dispatchOnScrolled(int i, int i2) {
        this.f3363r++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        onScrolled(i, i2);
        if (this.f3342D != null) {
            this.f3342D.mo3137a(this, i, i2);
        }
        if (this.f3343E != null) {
            for (int size = this.f3343E.size() - 1; size >= 0; size--) {
                this.f3343E.get(size).mo3137a(this, i, i2);
            }
        }
        this.f3363r--;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    void dispatchOnScrollStateChanged(int i) {
        if (this.mLayout != null) {
            this.mLayout.mo2900i(i);
        }
        onScrollStateChanged(i);
        if (this.f3342D != null) {
            this.f3342D.mo3136a(this, i);
        }
        if (this.f3343E != null) {
            for (int size = this.f3343E.size() - 1; size >= 0; size--) {
                this.f3343E.get(size).mo3136a(this, i);
            }
        }
    }

    public void setHorizontalItemAlign(int i) {
        if (getLayoutManager() != null && (getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) getLayoutManager()).f3389i == 0) {
            setIsUseNativeOverScroll(true);
            this.f3361p.m4896a(i);
        }
    }
}
