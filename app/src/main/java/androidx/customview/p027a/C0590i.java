package androidx.customview.p027a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.p024g.C0538w;
import java.util.Arrays;
import neton.client.Utils.ResponseCode;

/* compiled from: ViewDragHelper.java */
/* renamed from: androidx.customview.a.i */
/* loaded from: classes.dex */
public final class C0590i {

    /* renamed from: v */
    private static final Interpolator f2549v = new InterpolatorC0591j();

    /* renamed from: a */
    private int f2550a;

    /* renamed from: b */
    private int f2551b;

    /* renamed from: d */
    private float[] f2553d;

    /* renamed from: e */
    private float[] f2554e;

    /* renamed from: f */
    private float[] f2555f;

    /* renamed from: g */
    private float[] f2556g;

    /* renamed from: h */
    private int[] f2557h;

    /* renamed from: i */
    private int[] f2558i;

    /* renamed from: j */
    private int[] f2559j;

    /* renamed from: k */
    private int f2560k;

    /* renamed from: l */
    private VelocityTracker f2561l;

    /* renamed from: m */
    private float f2562m;

    /* renamed from: n */
    private float f2563n;

    /* renamed from: o */
    private int f2564o;

    /* renamed from: p */
    private int f2565p;

    /* renamed from: q */
    private OverScroller f2566q;

    /* renamed from: r */
    private final AbstractC0593l f2567r;

    /* renamed from: s */
    private View f2568s;

    /* renamed from: t */
    private boolean f2569t;

    /* renamed from: u */
    private final ViewGroup f2570u;

    /* renamed from: c */
    private int f2552c = -1;

    /* renamed from: w */
    private final Runnable f2571w = new RunnableC0592k(this);

    /* renamed from: a */
    public static C0590i m2105a(ViewGroup viewGroup, AbstractC0593l abstractC0593l) {
        return new C0590i(viewGroup.getContext(), viewGroup, abstractC0593l);
    }

    /* renamed from: a */
    public static C0590i m2104a(ViewGroup viewGroup, float f, AbstractC0593l abstractC0593l) {
        C0590i m2105a = m2105a(viewGroup, abstractC0593l);
        m2105a.f2551b = (int) (m2105a.f2551b * (1.0f / f));
        return m2105a;
    }

    private C0590i(Context context, ViewGroup viewGroup, AbstractC0593l abstractC0593l) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0593l == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2570u = viewGroup;
        this.f2567r = abstractC0593l;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2564o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2551b = viewConfiguration.getScaledTouchSlop();
        this.f2562m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2563n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2566q = new OverScroller(context, f2549v);
    }

    /* renamed from: a */
    public final void m2122a(float f) {
        this.f2563n = f;
    }

    /* renamed from: a */
    public final int m2121a() {
        return this.f2550a;
    }

    /* renamed from: a */
    public final void m2123a(int i) {
        this.f2565p = i;
    }

    /* renamed from: b */
    public final int m2128b() {
        return this.f2564o;
    }

    /* renamed from: a */
    public final void m2124a(View view, int i) {
        if (view.getParent() != this.f2570u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2570u + ")");
        }
        this.f2568s = view;
        this.f2552c = i;
        this.f2567r.mo2143a(view, i);
        m2130b(1);
    }

    /* renamed from: c */
    public final View m2132c() {
        return this.f2568s;
    }

    /* renamed from: d */
    public final int m2133d() {
        return this.f2551b;
    }

    /* renamed from: e */
    public final void m2134e() {
        this.f2552c = -1;
        if (this.f2553d != null) {
            Arrays.fill(this.f2553d, 0.0f);
            Arrays.fill(this.f2554e, 0.0f);
            Arrays.fill(this.f2555f, 0.0f);
            Arrays.fill(this.f2556g, 0.0f);
            Arrays.fill(this.f2557h, 0);
            Arrays.fill(this.f2558i, 0);
            Arrays.fill(this.f2559j, 0);
            this.f2560k = 0;
        }
        if (this.f2561l != null) {
            this.f2561l.recycle();
            this.f2561l = null;
        }
    }

    /* renamed from: f */
    public final void m2135f() {
        m2134e();
        if (this.f2550a == 2) {
            this.f2566q.getCurrX();
            this.f2566q.getCurrY();
            this.f2566q.abortAnimation();
            this.f2567r.mo2144a(this.f2568s, this.f2566q.getCurrX(), this.f2566q.getCurrY());
        }
        m2130b(0);
    }

    /* renamed from: a */
    public final boolean m2127a(View view, int i, int i2) {
        this.f2568s = view;
        this.f2552c = -1;
        boolean m2109a = m2109a(i, i2, 0, 0);
        if (!m2109a && this.f2550a == 0 && this.f2568s != null) {
            this.f2568s = null;
        }
        return m2109a;
    }

    /* renamed from: a */
    public final boolean m2125a(int i, int i2) {
        if (!this.f2569t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m2109a(i, i2, (int) this.f2561l.getXVelocity(this.f2552c), (int) this.f2561l.getYVelocity(this.f2552c));
    }

    /* renamed from: a */
    private boolean m2109a(int i, int i2, int i3, int i4) {
        int left = this.f2568s.getLeft();
        int top = this.f2568s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2566q.abortAnimation();
            m2130b(0);
            return false;
        }
        this.f2566q.startScroll(left, top, i5, i6, m2103a(this.f2568s, i5, i6, i3, i4));
        m2130b(2);
        return true;
    }

    /* renamed from: a */
    private int m2103a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m2112b = m2112b(i3, (int) this.f2563n, (int) this.f2562m);
        int m2112b2 = m2112b(i4, (int) this.f2563n, (int) this.f2562m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m2112b);
        int abs4 = Math.abs(m2112b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m2112b != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m2112b2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m2102a(i, m2112b, this.f2567r.mo2138a(view)) * f5) + (m2102a(i2, m2112b2, this.f2567r.mo2145b()) * (f3 / f4)));
    }

    /* renamed from: a */
    private int m2102a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f2570u.getWidth();
        float f = width / 2;
        float m2111b = f + (m2111b(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m2111b / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, ResponseCode.CODE_6XX_CONNECT_ERROR);
    }

    /* renamed from: b */
    private static int m2112b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: a */
    private static float m2101a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: b */
    private static float m2111b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: g */
    public final boolean m2136g() {
        if (this.f2550a == 2) {
            boolean computeScrollOffset = this.f2566q.computeScrollOffset();
            int currX = this.f2566q.getCurrX();
            int currY = this.f2566q.getCurrY();
            int left = currX - this.f2568s.getLeft();
            int top = currY - this.f2568s.getTop();
            if (left != 0) {
                C0538w.m1871d(this.f2568s, left);
            }
            if (top != 0) {
                C0538w.m1869c(this.f2568s, top);
            }
            if (left != 0 || top != 0) {
                this.f2567r.mo2144a(this.f2568s, currX, currY);
            }
            if (computeScrollOffset && currX == this.f2566q.getFinalX() && currY == this.f2566q.getFinalY()) {
                this.f2566q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2570u.post(this.f2571w);
            }
        }
        return this.f2550a == 2;
    }

    /* renamed from: a */
    private void m2106a(float f, float f2) {
        this.f2569t = true;
        this.f2567r.mo2142a(this.f2568s, f, f2);
        this.f2569t = false;
        if (this.f2550a == 1) {
            m2130b(0);
        }
    }

    /* renamed from: c */
    private void m2116c(int i) {
        if (this.f2553d == null || !m2118d(i)) {
            return;
        }
        this.f2553d[i] = 0.0f;
        this.f2554e[i] = 0.0f;
        this.f2555f[i] = 0.0f;
        this.f2556g[i] = 0.0f;
        this.f2557h[i] = 0;
        this.f2558i[i] = 0;
        this.f2559j[i] = 0;
        this.f2560k = (~(1 << i)) & this.f2560k;
    }

    /* renamed from: c */
    private void m2117c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2119e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2555f[pointerId] = x;
                this.f2556g[pointerId] = y;
            }
        }
    }

    /* renamed from: d */
    private boolean m2118d(int i) {
        return (this.f2560k & (1 << i)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2130b(int i) {
        this.f2570u.removeCallbacks(this.f2571w);
        if (this.f2550a != i) {
            this.f2550a = i;
            this.f2567r.mo2140a(i);
            if (this.f2550a == 0) {
                this.f2568s = null;
            }
        }
    }

    /* renamed from: b */
    private boolean m2114b(View view, int i) {
        if (view == this.f2568s && this.f2552c == i) {
            return true;
        }
        if (view == null || !this.f2567r.mo2146b(view, i)) {
            return false;
        }
        this.f2552c = i;
        m2124a(view, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:            if (r12 != r11) goto L44;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2126a(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p027a.C0590i.m2126a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void m2131b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2134e();
        }
        if (this.f2561l == null) {
            this.f2561l = VelocityTracker.obtain();
        }
        this.f2561l.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View m2129b = m2129b((int) x, (int) y);
                m2107a(x, y, pointerId);
                m2114b(m2129b, pointerId);
                if ((this.f2557h[pointerId] & this.f2565p) != 0) {
                    this.f2567r.mo2139a();
                    return;
                }
                return;
            case 1:
                if (this.f2550a == 1) {
                    m2120i();
                }
                m2134e();
                return;
            case 2:
                if (this.f2550a == 1) {
                    if (m2119e(this.f2552c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2552c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        int i3 = (int) (x2 - this.f2555f[this.f2552c]);
                        int i4 = (int) (y2 - this.f2556g[this.f2552c]);
                        int left = this.f2568s.getLeft() + i3;
                        int top = this.f2568s.getTop() + i4;
                        int left2 = this.f2568s.getLeft();
                        int top2 = this.f2568s.getTop();
                        if (i3 != 0) {
                            left = this.f2567r.mo2147c(this.f2568s, left);
                            C0538w.m1871d(this.f2568s, left - left2);
                        }
                        if (i4 != 0) {
                            top = this.f2567r.mo2148d(this.f2568s, top);
                            C0538w.m1869c(this.f2568s, top - top2);
                        }
                        if (i3 != 0 || i4 != 0) {
                            this.f2567r.mo2144a(this.f2568s, left, top);
                        }
                        m2117c(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (m2119e(pointerId2)) {
                        float x3 = motionEvent.getX(i2);
                        float y3 = motionEvent.getY(i2);
                        float f = x3 - this.f2553d[pointerId2];
                        float f2 = y3 - this.f2554e[pointerId2];
                        m2113b(f, f2, pointerId2);
                        if (this.f2550a != 1) {
                            View m2129b2 = m2129b((int) x3, (int) y3);
                            if (m2110a(m2129b2, f, f2) && m2114b(m2129b2, pointerId2)) {
                            }
                        }
                        m2117c(motionEvent);
                        return;
                    }
                    i2++;
                }
                m2117c(motionEvent);
                return;
            case 3:
                if (this.f2550a == 1) {
                    m2106a(0.0f, 0.0f);
                }
                m2134e();
                return;
            case 4:
            default:
                return;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m2107a(x4, y4, pointerId3);
                if (this.f2550a == 0) {
                    m2114b(m2129b((int) x4, (int) y4), pointerId3);
                    if ((this.f2557h[pointerId3] & this.f2565p) != 0) {
                        this.f2567r.mo2139a();
                        return;
                    }
                    return;
                }
                if (m2115b(this.f2568s, (int) x4, (int) y4)) {
                    m2114b(this.f2568s, pointerId3);
                    return;
                }
                return;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f2550a == 1 && pointerId4 == this.f2552c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f2552c) {
                                if (m2129b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f2568s && m2114b(this.f2568s, pointerId5)) {
                                    i = this.f2552c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m2120i();
                    }
                }
                m2116c(pointerId4);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.customview.a.l] */
    /* renamed from: b */
    private void m2113b(float f, float f2, int i) {
        boolean m2108a = m2108a(f, f2, i, 1);
        boolean z = m2108a;
        if (m2108a(f2, f, i, 4)) {
            z = (m2108a ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (m2108a(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (m2108a(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f2558i;
            iArr[i] = iArr[i] | r0;
            this.f2567r.mo2141a(r0, i);
        }
    }

    /* renamed from: a */
    private boolean m2108a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        return ((this.f2557h[i] & i2) != i2 || (this.f2565p & i2) == 0 || (this.f2559j[i] & i2) == i2 || (this.f2558i[i] & i2) == i2 || (abs <= ((float) this.f2551b) && Math.abs(f2) <= ((float) this.f2551b)) || (this.f2558i[i] & i2) != 0 || abs <= ((float) this.f2551b)) ? false : true;
    }

    /* renamed from: a */
    private boolean m2110a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f2567r.mo2138a(view) > 0;
        boolean z2 = this.f2567r.mo2145b() > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f2551b * this.f2551b)) : z ? Math.abs(f) > ((float) this.f2551b) : z2 && Math.abs(f2) > ((float) this.f2551b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[LOOP:0: B:2:0x0005->B:9:0x0033, LOOP_END] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2137h() {
        /*
            r7 = this;
            float[] r0 = r7.f2553d
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L36
            boolean r3 = r7.m2118d(r2)
            r4 = 1
            if (r3 == 0) goto L2f
            float[] r3 = r7.f2555f
            r3 = r3[r2]
            float[] r5 = r7.f2553d
            r5 = r5[r2]
            float r3 = r3 - r5
            float[] r5 = r7.f2556g
            r5 = r5[r2]
            float[] r6 = r7.f2554e
            r6 = r6[r2]
            float r5 = r5 - r6
            float r3 = r3 * r3
            float r5 = r5 * r5
            float r3 = r3 + r5
            int r5 = r7.f2551b
            int r6 = r7.f2551b
            int r5 = r5 * r6
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2f
            r3 = r4
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto L33
            return r4
        L33:
            int r2 = r2 + 1
            goto L5
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p027a.C0590i.m2137h():boolean");
    }

    /* renamed from: i */
    private void m2120i() {
        this.f2561l.computeCurrentVelocity(1000, this.f2562m);
        m2106a(m2101a(this.f2561l.getXVelocity(this.f2552c), this.f2563n, this.f2562m), m2101a(this.f2561l.getYVelocity(this.f2552c), this.f2563n, this.f2562m));
    }

    /* renamed from: b */
    public static boolean m2115b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: b */
    public final View m2129b(int i, int i2) {
        for (int childCount = this.f2570u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2570u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    private boolean m2119e(int i) {
        if (m2118d(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    private void m2107a(float f, float f2, int i) {
        if (this.f2553d == null || this.f2553d.length <= i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (this.f2553d != null) {
                System.arraycopy(this.f2553d, 0, fArr, 0, this.f2553d.length);
                System.arraycopy(this.f2554e, 0, fArr2, 0, this.f2554e.length);
                System.arraycopy(this.f2555f, 0, fArr3, 0, this.f2555f.length);
                System.arraycopy(this.f2556g, 0, fArr4, 0, this.f2556g.length);
                System.arraycopy(this.f2557h, 0, iArr, 0, this.f2557h.length);
                System.arraycopy(this.f2558i, 0, iArr2, 0, this.f2558i.length);
                System.arraycopy(this.f2559j, 0, iArr3, 0, this.f2559j.length);
            }
            this.f2553d = fArr;
            this.f2554e = fArr2;
            this.f2555f = fArr3;
            this.f2556g = fArr4;
            this.f2557h = iArr;
            this.f2558i = iArr2;
            this.f2559j = iArr3;
        }
        float[] fArr5 = this.f2553d;
        this.f2555f[i] = f;
        fArr5[i] = f;
        float[] fArr6 = this.f2554e;
        this.f2556g[i] = f2;
        fArr6[i] = f2;
        int[] iArr4 = this.f2557h;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f2570u.getLeft() + this.f2564o ? 1 : 0;
        if (i4 < this.f2570u.getTop() + this.f2564o) {
            i5 |= 4;
        }
        if (i3 > this.f2570u.getRight() - this.f2564o) {
            i5 |= 2;
        }
        if (i4 > this.f2570u.getBottom() - this.f2564o) {
            i5 |= 8;
        }
        iArr4[i] = i5;
        this.f2560k |= 1 << i;
    }
}
