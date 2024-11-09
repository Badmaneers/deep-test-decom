package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.cd */
/* loaded from: classes.dex */
public final class RunnableC0878cd implements Runnable {

    /* renamed from: a */
    OverScroller f3606a;

    /* renamed from: c */
    final /* synthetic */ RecyclerView f3608c;

    /* renamed from: d */
    private int f3609d;

    /* renamed from: e */
    private int f3610e;

    /* renamed from: b */
    Interpolator f3607b = RecyclerView.sQuinticInterpolator;

    /* renamed from: f */
    private boolean f3611f = false;

    /* renamed from: g */
    private boolean f3612g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0878cd(RecyclerView recyclerView) {
        this.f3608c = recyclerView;
        this.f3606a = new OverScroller(recyclerView.getContext(), RecyclerView.sQuinticInterpolator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean awakenScrollBars;
        if (this.f3608c.mLayout == null) {
            m3197b();
            return;
        }
        this.f3612g = false;
        this.f3611f = true;
        this.f3608c.consumePendingUpdateOperations();
        OverScroller overScroller = this.f3606a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.f3609d;
            int i4 = currY - this.f3610e;
            this.f3609d = currX;
            this.f3610e = currY;
            this.f3608c.mReusableIntPair[0] = 0;
            this.f3608c.mReusableIntPair[1] = 0;
            if (this.f3608c.dispatchNestedPreScroll(i3, i4, this.f3608c.mReusableIntPair, null, 1)) {
                i3 -= this.f3608c.mReusableIntPair[0];
                i4 -= this.f3608c.mReusableIntPair[1];
            }
            if (this.f3608c.getOverScrollMode() != 2) {
                this.f3608c.considerReleasingGlowsOnScroll(i3, i4);
            }
            if (this.f3608c.mAdapter != null) {
                this.f3608c.mReusableIntPair[0] = 0;
                this.f3608c.mReusableIntPair[1] = 0;
                this.f3608c.scrollStep(i3, i4, this.f3608c.mReusableIntPair);
                i = this.f3608c.mReusableIntPair[0];
                i2 = this.f3608c.mReusableIntPair[1];
                i3 -= i;
                i4 -= i2;
                AbstractC0872by abstractC0872by = this.f3608c.mLayout.f3538t;
                if (abstractC0872by != null && !abstractC0872by.m3182d() && abstractC0872by.m3183e()) {
                    int m3190a = this.f3608c.mState.m3190a();
                    if (m3190a == 0) {
                        abstractC0872by.m3179c();
                    } else {
                        if (abstractC0872by.m3184f() >= m3190a) {
                            abstractC0872by.m3180c(m3190a - 1);
                        }
                        abstractC0872by.m3175a(i, i2);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.f3608c.mItemDecorations.isEmpty()) {
                this.f3608c.invalidate();
            }
            this.f3608c.mReusableIntPair[0] = 0;
            this.f3608c.mReusableIntPair[1] = 0;
            this.f3608c.dispatchNestedScroll(i, i2, i3, i4, null, 1, this.f3608c.mReusableIntPair);
            int i5 = i3 - this.f3608c.mReusableIntPair[0];
            int i6 = i4 - this.f3608c.mReusableIntPair[1];
            if (i != 0 || i2 != 0) {
                this.f3608c.dispatchOnScrolled(i, i2);
            }
            awakenScrollBars = this.f3608c.awakenScrollBars();
            if (!awakenScrollBars) {
                this.f3608c.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
            AbstractC0872by abstractC0872by2 = this.f3608c.mLayout.f3538t;
            if (!(abstractC0872by2 != null && abstractC0872by2.m3182d()) && z) {
                if (this.f3608c.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                    if (i6 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i6 <= 0) {
                        currVelocity = 0;
                    }
                    this.f3608c.absorbGlows(i7, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    this.f3608c.mPrefetchRegistry.m3329a();
                }
            } else {
                m3194a();
                if (this.f3608c.mGapWorker != null) {
                    this.f3608c.mGapWorker.m3328a(this.f3608c, i, i2);
                }
            }
        }
        AbstractC0872by abstractC0872by3 = this.f3608c.mLayout.f3538t;
        if (abstractC0872by3 != null && abstractC0872by3.m3182d()) {
            abstractC0872by3.m3175a(0, 0);
        }
        this.f3611f = false;
        if (this.f3612g) {
            m3193c();
        } else {
            this.f3608c.setScrollState(0);
            this.f3608c.stopNestedScroll(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3194a() {
        if (this.f3611f) {
            this.f3612g = true;
        } else {
            m3193c();
        }
    }

    /* renamed from: c */
    private void m3193c() {
        this.f3608c.removeCallbacks(this);
        C0538w.m1852a(this.f3608c, this);
    }

    /* renamed from: a */
    public final void m3195a(int i, int i2) {
        this.f3608c.setScrollState(2);
        this.f3610e = 0;
        this.f3609d = 0;
        if (this.f3607b != RecyclerView.sQuinticInterpolator) {
            this.f3607b = RecyclerView.sQuinticInterpolator;
            this.f3606a = new OverScroller(this.f3608c.getContext(), RecyclerView.sQuinticInterpolator);
        }
        this.f3606a.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        m3194a();
    }

    /* renamed from: b */
    public final void m3197b() {
        this.f3608c.removeCallbacks(this);
        this.f3606a.abortAnimation();
    }

    /* renamed from: a */
    public final void m3196a(int i, int i2, int i3, Interpolator interpolator) {
        int i4;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            int width = z ? this.f3608c.getWidth() : this.f3608c.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float sin = f2 + (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2);
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f3607b != interpolator) {
            this.f3607b = interpolator;
            this.f3606a = new OverScroller(this.f3608c.getContext(), interpolator);
        }
        this.f3610e = 0;
        this.f3609d = 0;
        this.f3608c.setScrollState(2);
        this.f3606a.startScroll(0, 0, i, i2, i6);
        if (Build.VERSION.SDK_INT < 23) {
            this.f3606a.computeScrollOffset();
        }
        m3194a();
    }
}
