package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0485f;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f3372a;

    /* renamed from: b */
    int f3373b;

    /* renamed from: c */
    int[] f3374c;

    /* renamed from: d */
    View[] f3375d;

    /* renamed from: e */
    final SparseIntArray f3376e;

    /* renamed from: f */
    final SparseIntArray f3377f;

    /* renamed from: g */
    AbstractC0824ad f3378g;

    /* renamed from: h */
    final Rect f3379h;

    /* renamed from: z */
    private boolean f3380z;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3372a = false;
        this.f3373b = -1;
        this.f3376e = new SparseIntArray();
        this.f3377f = new SparseIntArray();
        this.f3378g = new C0822ab();
        this.f3379h = new Rect();
        m2771k(m3062a(context, attributeSet, i, i2).f3547b);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f3372a = false;
        this.f3373b = -1;
        this.f3376e = new SparseIntArray();
        this.f3377f = new SparseIntArray();
        this.f3378g = new C0822ab();
        this.f3379h = new Rect();
        m2771k(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo2785a(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo2785a(false);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2773a(C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3389i == 0) {
            return this.f3373b;
        }
        if (c0876cb.m3190a() <= 0) {
            return 0;
        }
        return m2760a(c0868bu, c0876cb, c0876cb.m3190a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2788b(C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3389i == 1) {
            return this.f3373b;
        }
        if (c0876cb.m3190a() <= 0) {
            return 0;
        }
        return m2760a(c0868bu, c0876cb, c0876cb.m3190a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2781a(C0868bu c0868bu, C0876cb c0876cb, View view, C0482c c0482c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0823ac)) {
            super.m3091a(view, c0482c);
            return;
        }
        C0823ac c0823ac = (C0823ac) layoutParams;
        int m2760a = m2760a(c0868bu, c0876cb, c0823ac.f3550c.m3209c());
        if (this.f3389i == 0) {
            c0482c.m1661b(C0485f.m1715a(c0823ac.f3454a, c0823ac.f3455b, m2760a, 1, false));
        } else {
            c0482c.m1661b(C0485f.m1715a(m2760a, 1, c0823ac.f3454a, c0823ac.f3455b, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    public final void mo2794c(C0876cb c0876cb) {
        super.mo2794c(c0876cb);
        this.f3372a = false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2779a(int i, int i2) {
        this.f3378g.f3456a.clear();
        this.f3378g.f3457b.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2778a() {
        this.f3378g.f3456a.clear();
        this.f3378g.f3457b.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final void mo2790b(int i, int i2) {
        this.f3378g.f3456a.clear();
        this.f3378g.f3457b.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    public final void mo2792c(int i, int i2) {
        this.f3378g.f3456a.clear();
        this.f3378g.f3457b.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final void mo2796d(int i, int i2) {
        this.f3378g.f3456a.clear();
        this.f3378g.f3457b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final C0861bn mo2789b() {
        if (this.f3389i == 0) {
            return new C0823ac(-2, -1);
        }
        return new C0823ac(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final C0861bn mo2776a(Context context, AttributeSet attributeSet) {
        return new C0823ac(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final C0861bn mo2777a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0823ac((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0823ac(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final boolean mo2786a(C0861bn c0861bn) {
        return c0861bn instanceof C0823ac;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2780a(Rect rect, int i, int i2) {
        int a2;
        int a3;
        if (this.f3374c == null) {
            super.mo2780a(rect, i, i2);
        }
        int A = m3081A() + m3083C();
        int B = m3082B() + m3084D();
        if (this.f3389i == 1) {
            a3 = m3060a(i2, rect.height() + B, C0538w.m1886o(this.f3535q));
            a2 = m3060a(i, this.f3374c[this.f3374c.length - 1] + A, C0538w.m1885n(this.f3535q));
        } else {
            a2 = m3060a(i, rect.width() + A, C0538w.m1885n(this.f3535q));
            a3 = m3060a(i2, this.f3374c[this.f3374c.length - 1] + B, C0538w.m1886o(this.f3535q));
        }
        m3115h(a2, a3);
    }

    /* renamed from: j */
    private void m2770j(int i) {
        this.f3374c = m2764a(this.f3374c, this.f3373b, i);
    }

    /* renamed from: a */
    private static int[] m2764a(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: i */
    private int m2768i(int i, int i2) {
        if (this.f3389i == 1 && m2845j()) {
            return this.f3374c[this.f3373b - i] - this.f3374c[(this.f3373b - i) - i2];
        }
        return this.f3374c[i2 + i] - this.f3374c[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo2782a(C0868bu c0868bu, C0876cb c0876cb, C0826af c0826af, int i) {
        super.mo2782a(c0868bu, c0876cb, c0826af, i);
        m2758H();
        if (c0876cb.m3190a() > 0 && !c0876cb.f3595g) {
            boolean z = i == 1;
            int m2765b = m2765b(c0868bu, c0876cb, c0826af.f3470b);
            if (z) {
                while (m2765b > 0 && c0826af.f3470b > 0) {
                    c0826af.f3470b--;
                    m2765b = m2765b(c0868bu, c0876cb, c0826af.f3470b);
                }
            } else {
                int m3190a = c0876cb.m3190a() - 1;
                int i2 = c0826af.f3470b;
                while (i2 < m3190a) {
                    int i3 = i2 + 1;
                    int m2765b2 = m2765b(c0868bu, c0876cb, i3);
                    if (m2765b2 <= m2765b) {
                        break;
                    }
                    i2 = i3;
                    m2765b = m2765b2;
                }
                c0826af.f3470b = i2;
            }
        }
        m2759I();
    }

    /* renamed from: I */
    private void m2759I() {
        if (this.f3375d == null || this.f3375d.length != this.f3373b) {
            this.f3375d = new View[this.f3373b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2772a(int i, C0868bu c0868bu, C0876cb c0876cb) {
        m2758H();
        m2759I();
        return super.mo2772a(i, c0868bu, c0876cb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2787b(int i, C0868bu c0868bu, C0876cb c0876cb) {
        m2758H();
        m2759I();
        return super.mo2787b(i, c0868bu, c0876cb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    final View mo2775a(C0868bu c0868bu, C0876cb c0876cb, int i, int i2, int i3) {
        m2846k();
        int mo2975d = this.f3390j.mo2975d();
        int mo2977e = this.f3390j.mo2977e();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View f = m3111f(i);
            int e = m3069e(f);
            if (e >= 0 && e < i3 && m2765b(c0868bu, c0876cb, e) == 0) {
                if (((C0861bn) f.getLayoutParams()).f3550c.m3220n()) {
                    if (view2 == null) {
                        view2 = f;
                    }
                } else {
                    if (this.f3390j.mo2968a(f) < mo2977e && this.f3390j.mo2971b(f) >= mo2975d) {
                        return f;
                    }
                    if (view == null) {
                        view = f;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    final void mo2784a(C0876cb c0876cb, C0828ah c0828ah, InterfaceC0859bl interfaceC0859bl) {
        int i = this.f3373b;
        for (int i2 = 0; i2 < this.f3373b && c0828ah.m2947a(c0876cb) && i > 0; i2++) {
            interfaceC0859bl.mo3131b(c0828ah.f3481d, Math.max(0, c0828ah.f3484g));
            i--;
            c0828ah.f3481d += c0828ah.f3482e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:            r21.f3475b = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:            return;     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void mo2783a(androidx.recyclerview.widget.C0868bu r18, androidx.recyclerview.widget.C0876cb r19, androidx.recyclerview.widget.C0828ah r20, androidx.recyclerview.widget.C0827ag r21) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo2783a(androidx.recyclerview.widget.bu, androidx.recyclerview.widget.cb, androidx.recyclerview.widget.ah, androidx.recyclerview.widget.ag):void");
    }

    /* renamed from: a */
    private void m2762a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0823ac c0823ac = (C0823ac) view.getLayoutParams();
        Rect rect = c0823ac.f3551d;
        int i4 = rect.top + rect.bottom + c0823ac.topMargin + c0823ac.bottomMargin;
        int i5 = rect.left + rect.right + c0823ac.leftMargin + c0823ac.rightMargin;
        int m2768i = m2768i(c0823ac.f3454a, c0823ac.f3455b);
        if (this.f3389i == 1) {
            i3 = m3061a(m2768i, i, i5, c0823ac.width, false);
            i2 = m3061a(this.f3390j.mo2981g(), m3123x(), i4, c0823ac.height, true);
        } else {
            int a2 = m3061a(m2768i, i, i4, c0823ac.height, false);
            int a3 = m3061a(this.f3390j.mo2981g(), m3122w(), i5, c0823ac.width, true);
            i2 = a2;
            i3 = a3;
        }
        m2761a(view, i3, i2, z);
    }

    /* renamed from: a */
    private void m2761a(View view, int i, int i2, boolean z) {
        boolean b;
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        if (z) {
            b = m3097a(view, i, i2, c0861bn);
        } else {
            b = m3106b(view, i, i2, c0861bn);
        }
        if (b) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m2763a(C0868bu c0868bu, C0876cb c0876cb, int i, boolean z) {
        int i2;
        int i3;
        int i4 = -1;
        int i5 = 0;
        if (z) {
            i3 = 1;
            i4 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View view = this.f3375d[i2];
            C0823ac c0823ac = (C0823ac) view.getLayoutParams();
            c0823ac.f3455b = m2766c(c0868bu, c0876cb, m3069e(view));
            c0823ac.f3454a = i5;
            i5 += c0823ac.f3455b;
            i2 += i3;
        }
    }

    /* renamed from: c */
    public final int m2791c() {
        return this.f3373b;
    }

    /* renamed from: k */
    private void m2771k(int i) {
        if (i == this.f3373b) {
            return;
        }
        this.f3372a = true;
        if (i <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i)));
        }
        this.f3373b = i;
        this.f3378g.f3456a.clear();
        m3116q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:            if (r13 == (r2 > r8)) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:            if (r13 == (r2 > r11)) goto L70;     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo2774a(android.view.View r24, int r25, androidx.recyclerview.widget.C0868bu r26, androidx.recyclerview.widget.C0876cb r27) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo2774a(android.view.View, int, androidx.recyclerview.widget.bu, androidx.recyclerview.widget.cb):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final boolean mo2797d() {
        return this.f3394n == null && !this.f3372a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final int mo2795d(C0876cb c0876cb) {
        if (this.f3380z) {
            return m2767h(c0876cb);
        }
        return super.mo2795d(c0876cb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2743a(C0876cb c0876cb) {
        if (this.f3380z) {
            return m2767h(c0876cb);
        }
        return super.mo2743a(c0876cb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: e */
    public final int mo2798e(C0876cb c0876cb) {
        if (this.f3380z) {
            return m2769i(c0876cb);
        }
        return super.mo2798e(c0876cb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2744b(C0876cb c0876cb) {
        if (this.f3380z) {
            return m2769i(c0876cb);
        }
        return super.mo2744b(c0876cb);
    }

    /* renamed from: h */
    private int m2767h(C0876cb c0876cb) {
        if (m3121v() == 0 || c0876cb.m3190a() == 0) {
            return 0;
        }
        m2846k();
        View b = m2833b(!m2847l());
        View c = m2835c(!m2847l());
        if (b == null || c == null) {
            return 0;
        }
        if (!m2847l()) {
            return this.f3378g.m2936c(c0876cb.m3190a() - 1, this.f3373b) + 1;
        }
        int mo2971b = this.f3390j.mo2971b(c) - this.f3390j.mo2968a(b);
        int m2936c = this.f3378g.m2936c(m3069e(b), this.f3373b);
        return (int) ((mo2971b / ((this.f3378g.m2936c(m3069e(c), this.f3373b) - m2936c) + 1)) * (this.f3378g.m2936c(c0876cb.m3190a() - 1, this.f3373b) + 1));
    }

    /* renamed from: i */
    private int m2769i(C0876cb c0876cb) {
        int max;
        if (m3121v() == 0 || c0876cb.m3190a() == 0) {
            return 0;
        }
        m2846k();
        boolean l = m2847l();
        View b = m2833b(!l);
        View c = m2835c(!l);
        if (b == null || c == null) {
            return 0;
        }
        int m2936c = this.f3378g.m2936c(m3069e(b), this.f3373b);
        int m2936c2 = this.f3378g.m2936c(m3069e(c), this.f3373b);
        int min = Math.min(m2936c, m2936c2);
        int max2 = Math.max(m2936c, m2936c2);
        int m2936c3 = this.f3378g.m2936c(c0876cb.m3190a() - 1, this.f3373b) + 1;
        if (this.f3391k) {
            max = Math.max(0, (m2936c3 - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!l) {
            return max;
        }
        return Math.round((max * (Math.abs(this.f3390j.mo2971b(c) - this.f3390j.mo2968a(b)) / ((this.f3378g.m2936c(m3069e(c), this.f3373b) - this.f3378g.m2936c(m3069e(b), this.f3373b)) + 1))) + (this.f3390j.mo2975d() - this.f3390j.mo2968a(b)));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    public final void mo2793c(C0868bu c0868bu, C0876cb c0876cb) {
        if (c0876cb.f3595g) {
            int v = m3121v();
            for (int i = 0; i < v; i++) {
                C0823ac c0823ac = (C0823ac) m3111f(i).getLayoutParams();
                int m3209c = c0823ac.f3550c.m3209c();
                this.f3376e.put(m3209c, c0823ac.f3455b);
                this.f3377f.put(m3209c, c0823ac.f3454a);
            }
        }
        super.mo2793c(c0868bu, c0876cb);
        this.f3376e.clear();
        this.f3377f.clear();
    }

    /* renamed from: H */
    private void m2758H() {
        int z;
        if (this.f3389i == 1) {
            z = (m3124y() - m3083C()) - m3081A();
        } else {
            z = (m3125z() - m3084D()) - m3082B();
        }
        m2770j(z);
    }

    /* renamed from: a */
    private int m2760a(C0868bu c0868bu, C0876cb c0876cb, int i) {
        if (!c0876cb.f3595g) {
            return this.f3378g.m2936c(i, this.f3373b);
        }
        int m3164b = c0868bu.m3164b(i);
        if (m3164b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. ".concat(String.valueOf(i)));
            return 0;
        }
        return this.f3378g.m2936c(m3164b, this.f3373b);
    }

    /* renamed from: b */
    private int m2765b(C0868bu c0868bu, C0876cb c0876cb, int i) {
        if (!c0876cb.f3595g) {
            return this.f3378g.m2935b(i, this.f3373b);
        }
        int i2 = this.f3377f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m3164b = c0868bu.m3164b(i);
        if (m3164b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:".concat(String.valueOf(i)));
            return 0;
        }
        return this.f3378g.m2935b(m3164b, this.f3373b);
    }

    /* renamed from: c */
    private int m2766c(C0868bu c0868bu, C0876cb c0876cb, int i) {
        if (!c0876cb.f3595g) {
            return 1;
        }
        int i2 = this.f3376e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0868bu.m3164b(i) != -1) {
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:".concat(String.valueOf(i)));
        return 1;
    }
}
