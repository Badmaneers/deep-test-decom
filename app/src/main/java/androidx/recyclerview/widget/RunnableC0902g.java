package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import androidx.core.p024g.C0538w;
import com.color.support.widget.C1371am;
import com.color.support.widget.C1556gn;
import com.color.support.widget.InterfaceC1534fs;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorRecyclerView.java */
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public final class RunnableC0902g implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ColorRecyclerView f3678b;

    /* renamed from: c */
    private int f3679c;

    /* renamed from: d */
    private int f3680d;

    /* renamed from: a */
    Interpolator f3677a = RecyclerView.sQuinticInterpolator;

    /* renamed from: e */
    private boolean f3681e = false;

    /* renamed from: f */
    private boolean f3682f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0902g(ColorRecyclerView colorRecyclerView) {
        this.f3678b = colorRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1534fs interfaceC1534fs;
        int i;
        int i2;
        int i3;
        boolean awakenScrollBars;
        int i4;
        boolean z;
        InterfaceC1534fs interfaceC1534fs2;
        int i5;
        C1556gn c1556gn;
        C1556gn c1556gn2;
        int i6;
        int i7;
        boolean z2;
        InterfaceC1534fs interfaceC1534fs3;
        int i8;
        C1556gn c1556gn3;
        C1556gn c1556gn4;
        int i9;
        if (this.f3678b.mLayout == null) {
            m3308a();
            return;
        }
        this.f3682f = false;
        this.f3681e = true;
        this.f3678b.consumePendingUpdateOperations();
        interfaceC1534fs = this.f3678b.f3358m;
        if (interfaceC1534fs.computeScrollOffset()) {
            int mo4959b = interfaceC1534fs.mo4959b();
            int mo4960c = interfaceC1534fs.mo4960c();
            int i10 = mo4959b - this.f3679c;
            int i11 = mo4960c - this.f3680d;
            this.f3679c = mo4959b;
            this.f3680d = mo4960c;
            this.f3678b.mReusableIntPair[0] = 0;
            this.f3678b.mReusableIntPair[1] = 0;
            if (this.f3678b.dispatchNestedPreScroll(i10, i11, this.f3678b.mReusableIntPair, null, 1)) {
                i10 -= this.f3678b.mReusableIntPair[0];
                i11 -= this.f3678b.mReusableIntPair[1];
            }
            if (this.f3678b.mAdapter != null) {
                this.f3678b.mReusableIntPair[0] = 0;
                this.f3678b.mReusableIntPair[1] = 0;
                this.f3678b.scrollStep(i10, i11, this.f3678b.mReusableIntPair);
                i2 = this.f3678b.mReusableIntPair[0];
                i3 = this.f3678b.mReusableIntPair[1];
                i10 -= i2;
                i11 -= i3;
                AbstractC0872by abstractC0872by = this.f3678b.mLayout.f3538t;
                if (abstractC0872by != null && !abstractC0872by.m3182d() && abstractC0872by.m3183e()) {
                    int m3190a = this.f3678b.mState.m3190a();
                    if (m3190a == 0) {
                        abstractC0872by.m3179c();
                    } else {
                        if (abstractC0872by.m3184f() >= m3190a) {
                            abstractC0872by.m3180c(m3190a - 1);
                        }
                        abstractC0872by.m3175a(i2, i3);
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            if (!this.f3678b.mItemDecorations.isEmpty()) {
                this.f3678b.invalidate();
            }
            this.f3678b.mReusableIntPair[0] = 0;
            this.f3678b.mReusableIntPair[1] = 0;
            this.f3678b.dispatchNestedScroll(i2, i3, i10, i11, null, 1, this.f3678b.mReusableIntPair);
            int i12 = i10 - this.f3678b.mReusableIntPair[0];
            int i13 = i11 - this.f3678b.mReusableIntPair[1];
            if (i2 != 0 || i3 != 0) {
                this.f3678b.dispatchOnScrolled(i2, i3);
            }
            if (i13 != 0 && this.f3678b.f3346a) {
                ColorRecyclerView.m2748b(this.f3678b);
                ColorRecyclerView colorRecyclerView = this.f3678b;
                int scrollY = this.f3678b.getScrollY();
                i7 = this.f3678b.f3357l;
                colorRecyclerView.overScrollBy(0, i13, 0, scrollY, 0, 0, 0, i7, false);
                z2 = this.f3678b.f3362q;
                if (z2) {
                    c1556gn3 = this.f3678b.f3359n;
                    c1556gn3.m5193b(interfaceC1534fs.mo4964g());
                    c1556gn4 = this.f3678b.f3359n;
                    int scrollY2 = this.f3678b.getScrollY();
                    i9 = this.f3678b.f3357l;
                    c1556gn4.notifyVerticalEdgeReached(scrollY2, 0, i9);
                } else {
                    interfaceC1534fs3 = this.f3678b.f3358m;
                    int scrollY3 = this.f3678b.getScrollY();
                    i8 = this.f3678b.f3357l;
                    interfaceC1534fs3.notifyVerticalEdgeReached(scrollY3, 0, i8);
                }
            }
            if (i12 != 0 && this.f3678b.f3346a) {
                ColorRecyclerView.m2748b(this.f3678b);
                ColorRecyclerView colorRecyclerView2 = this.f3678b;
                int scrollX = this.f3678b.getScrollX();
                i4 = this.f3678b.f3357l;
                colorRecyclerView2.overScrollBy(i12, 0, scrollX, 0, 0, 0, i4, 0, false);
                z = this.f3678b.f3362q;
                if (z) {
                    c1556gn = this.f3678b.f3359n;
                    c1556gn.m5192a(interfaceC1534fs.mo4963f());
                    c1556gn2 = this.f3678b.f3359n;
                    int scrollX2 = this.f3678b.getScrollX();
                    i6 = this.f3678b.f3357l;
                    c1556gn2.notifyHorizontalEdgeReached(scrollX2, 0, i6);
                } else {
                    interfaceC1534fs2 = this.f3678b.f3358m;
                    int scrollX3 = this.f3678b.getScrollX();
                    i5 = this.f3678b.f3357l;
                    interfaceC1534fs2.notifyHorizontalEdgeReached(scrollX3, 0, i5);
                }
            }
            awakenScrollBars = this.f3678b.awakenScrollBars();
            if (!awakenScrollBars) {
                this.f3678b.invalidate();
            }
            boolean z3 = interfaceC1534fs.mo4958a() || (((interfaceC1534fs.mo4959b() == interfaceC1534fs.mo4961d()) || i12 != 0) && ((interfaceC1534fs.mo4960c() == interfaceC1534fs.mo4962e()) || i13 != 0));
            AbstractC0872by abstractC0872by2 = this.f3678b.mLayout.f3538t;
            if (!(abstractC0872by2 != null && abstractC0872by2.m3182d()) && z3) {
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    this.f3678b.mPrefetchRegistry.m3329a();
                }
            } else {
                m3306b();
                if (this.f3678b.mGapWorker != null) {
                    this.f3678b.mGapWorker.m3328a((RecyclerView) this.f3678b, i12, i13);
                }
            }
        }
        AbstractC0872by abstractC0872by3 = this.f3678b.mLayout.f3538t;
        if (abstractC0872by3 != null && abstractC0872by3.m3182d()) {
            abstractC0872by3.m3175a(0, 0);
        }
        this.f3681e = false;
        if (!this.f3682f) {
            i = this.f3678b.f3355j;
            if (i == 3 && this.f3678b.f3346a) {
                return;
            }
            this.f3678b.setScrollState(0);
            this.f3678b.stopNestedScroll(1);
            return;
        }
        m3307c();
    }

    /* renamed from: b */
    private void m3306b() {
        if (this.f3681e) {
            this.f3682f = true;
        } else {
            m3307c();
        }
    }

    /* renamed from: c */
    private void m3307c() {
        this.f3678b.removeCallbacks(this);
        C0538w.m1852a(this.f3678b, this);
    }

    /* renamed from: a */
    public final void m3309a(int i, int i2) {
        InterfaceC1534fs interfaceC1534fs;
        InterfaceC1534fs interfaceC1534fs2;
        InterfaceC1534fs interfaceC1534fs3;
        C1371am c1371am;
        InterfaceC1534fs interfaceC1534fs4;
        this.f3678b.setScrollState(2);
        this.f3680d = 0;
        this.f3679c = 0;
        if (this.f3677a != RecyclerView.sQuinticInterpolator) {
            this.f3677a = RecyclerView.sQuinticInterpolator;
            interfaceC1534fs4 = this.f3678b.f3358m;
            interfaceC1534fs4.mo4957a(RecyclerView.sQuinticInterpolator);
        }
        interfaceC1534fs = this.f3678b.f3358m;
        interfaceC1534fs.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        interfaceC1534fs2 = this.f3678b.f3358m;
        int mo4961d = interfaceC1534fs2.mo4961d();
        interfaceC1534fs3 = this.f3678b.f3358m;
        c1371am = this.f3678b.f3361p;
        interfaceC1534fs3.setFinalX(c1371am.m4898b(mo4961d));
        m3306b();
    }

    /* renamed from: a */
    public final void m3308a() {
        InterfaceC1534fs interfaceC1534fs;
        C1556gn c1556gn;
        this.f3678b.removeCallbacks(this);
        interfaceC1534fs = this.f3678b.f3358m;
        interfaceC1534fs.abortAnimation();
        c1556gn = this.f3678b.f3359n;
        c1556gn.abortAnimation();
    }

    /* renamed from: a */
    public final void m3310a(int i, int i2, Interpolator interpolator) {
        int i3;
        InterfaceC1534fs interfaceC1534fs;
        InterfaceC1534fs interfaceC1534fs2;
        InterfaceC1534fs interfaceC1534fs3;
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        boolean z = abs > abs2;
        int sqrt = (int) Math.sqrt(0.0d);
        int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
        int width = z ? this.f3678b.getWidth() : this.f3678b.getHeight();
        int i4 = width / 2;
        float f = width;
        float f2 = i4;
        float sin = f2 + (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2);
        if (sqrt > 0) {
            i3 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                abs = abs2;
            }
            i3 = (int) (((abs / f) + 1.0f) * 300.0f);
        }
        int min = Math.min(i3, 2000);
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f3677a != interpolator) {
            this.f3677a = interpolator;
            interfaceC1534fs3 = this.f3678b.f3358m;
            interfaceC1534fs3.mo4957a(interpolator);
        }
        this.f3680d = 0;
        this.f3679c = 0;
        this.f3678b.setScrollState(2);
        interfaceC1534fs = this.f3678b.f3358m;
        interfaceC1534fs.startScroll(0, 0, i, i2, min);
        if (Build.VERSION.SDK_INT < 23) {
            interfaceC1534fs2 = this.f3678b.f3358m;
            interfaceC1534fs2.computeScrollOffset();
        }
        m3306b();
    }
}
