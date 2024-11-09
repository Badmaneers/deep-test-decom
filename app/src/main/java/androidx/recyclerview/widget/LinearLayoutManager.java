package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0538w;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0856bi implements InterfaceC0875ca {

    /* renamed from: a */
    private C0828ah f3381a;

    /* renamed from: b */
    private boolean f3382b;

    /* renamed from: c */
    private boolean f3383c;

    /* renamed from: d */
    private boolean f3384d;

    /* renamed from: e */
    private boolean f3385e;

    /* renamed from: f */
    private boolean f3386f;

    /* renamed from: g */
    private final C0827ag f3387g;

    /* renamed from: h */
    private int f3388h;

    /* renamed from: i */
    int f3389i;

    /* renamed from: j */
    AbstractC0834an f3390j;

    /* renamed from: k */
    boolean f3391k;

    /* renamed from: l */
    int f3392l;

    /* renamed from: m */
    int f3393m;

    /* renamed from: n */
    SavedState f3394n;

    /* renamed from: o */
    final C0826af f3395o;

    /* renamed from: z */
    private int[] f3396z;

    /* renamed from: a */
    public void mo2782a(C0868bu c0868bu, C0876cb c0876cb, C0826af c0826af, int i) {
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: e */
    public final boolean mo2838e() {
        return true;
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i) {
        this.f3389i = 1;
        this.f3383c = false;
        this.f3391k = false;
        this.f3384d = false;
        this.f3385e = true;
        this.f3392l = -1;
        this.f3393m = RecyclerView.UNDEFINED_DURATION;
        this.f3394n = null;
        this.f3395o = new C0826af();
        this.f3387g = new C0827ag();
        this.f3388h = 2;
        this.f3396z = new int[2];
        m2823a(i);
        m2816d(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3389i = 1;
        this.f3383c = false;
        this.f3391k = false;
        this.f3384d = false;
        this.f3385e = true;
        this.f3392l = -1;
        this.f3393m = RecyclerView.UNDEFINED_DURATION;
        this.f3394n = null;
        this.f3395o = new C0826af();
        this.f3387g = new C0827ag();
        this.f3388h = 2;
        this.f3396z = new int[2];
        C0860bm a2 = m3062a(context, attributeSet, i, i2);
        m2823a(a2.f3546a);
        m2816d(a2.f3548c);
        mo2785a(a2.f3549d);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public C0861bn mo2789b() {
        return new C0861bn(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2829a(RecyclerView recyclerView, C0868bu c0868bu) {
        super.mo2829a(recyclerView, c0868bu);
        if (this.f3386f) {
            m3108c(c0868bu);
            c0868bu.m3158a();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2827a(AccessibilityEvent accessibilityEvent) {
        super.mo2827a(accessibilityEvent);
        if (m3121v() > 0) {
            accessibilityEvent.setFromIndex(m2849n());
            accessibilityEvent.setToIndex(m2851p());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: f */
    public final Parcelable mo2840f() {
        if (this.f3394n != null) {
            return new SavedState(this.f3394n);
        }
        SavedState savedState = new SavedState();
        if (m3121v() > 0) {
            m2846k();
            boolean z = this.f3382b ^ this.f3391k;
            savedState.f3399c = z;
            if (z) {
                View m2801J = m2801J();
                savedState.f3398b = this.f3390j.mo2977e() - this.f3390j.mo2971b(m2801J);
                savedState.f3397a = m3069e(m2801J);
            } else {
                View m2800I = m2800I();
                savedState.f3397a = m3069e(m2800I);
                savedState.f3398b = this.f3390j.mo2968a(m2800I) - this.f3390j.mo2975d();
            }
        } else {
            savedState.f3397a = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2826a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3394n = (SavedState) parcelable;
            m3116q();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: g */
    public final boolean mo2842g() {
        return this.f3389i == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: h */
    public final boolean mo2843h() {
        return this.f3389i == 1;
    }

    /* renamed from: a */
    public void mo2785a(boolean z) {
        mo2831a((String) null);
        if (this.f3384d == z) {
            return;
        }
        this.f3384d = z;
        m3116q();
    }

    /* renamed from: i */
    public final int m2844i() {
        return this.f3389i;
    }

    /* renamed from: a */
    public final void m2823a(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
        }
        mo2831a((String) null);
        if (i != this.f3389i || this.f3390j == null) {
            this.f3390j = AbstractC0834an.m2966a(this, i);
            this.f3395o.f3469a = this.f3390j;
            this.f3389i = i;
            m3116q();
        }
    }

    /* renamed from: c */
    private void m2814c() {
        boolean z = true;
        if (this.f3389i == 1 || !m2845j()) {
            z = this.f3383c;
        } else if (this.f3383c) {
            z = false;
        }
        this.f3391k = z;
    }

    /* renamed from: d */
    private void m2816d(boolean z) {
        mo2831a((String) null);
        if (z == this.f3383c) {
            return;
        }
        this.f3383c = z;
        m3116q();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final View mo2832b(int i) {
        int v = m3121v();
        if (v == 0) {
            return null;
        }
        int e = i - m3069e(m3111f(0));
        if (e >= 0 && e < v) {
            View f = m3111f(e);
            if (m3069e(f) == i) {
                return f;
            }
        }
        return super.mo2832b(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public void mo2828a(RecyclerView recyclerView, int i) {
        C0830aj c0830aj = new C0830aj(recyclerView.getContext());
        c0830aj.m3180c(i);
        m3096a(c0830aj);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0875ca
    /* renamed from: c */
    public final PointF mo2834c(int i) {
        if (m3121v() == 0) {
            return null;
        }
        int i2 = (i < m3069e(m3111f(0))) != this.f3391k ? -1 : 1;
        if (this.f3389i == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fc  */
    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2793c(androidx.recyclerview.widget.C0868bu r17, androidx.recyclerview.widget.C0876cb r18) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo2793c(androidx.recyclerview.widget.bu, androidx.recyclerview.widget.cb):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    public void mo2794c(C0876cb c0876cb) {
        super.mo2794c(c0876cb);
        this.f3394n = null;
        this.f3392l = -1;
        this.f3393m = RecyclerView.UNDEFINED_DURATION;
        this.f3395o.m2939a();
    }

    /* renamed from: a */
    private int m2804a(int i, C0868bu c0868bu, C0876cb c0876cb, boolean z) {
        int mo2977e;
        int mo2977e2 = this.f3390j.mo2977e() - i;
        if (mo2977e2 <= 0) {
            return 0;
        }
        int i2 = -m2813c(-mo2977e2, c0868bu, c0876cb);
        int i3 = i + i2;
        if (!z || (mo2977e = this.f3390j.mo2977e() - i3) <= 0) {
            return i2;
        }
        this.f3390j.mo2970a(mo2977e);
        return mo2977e + i2;
    }

    /* renamed from: b */
    private int m2811b(int i, C0868bu c0868bu, C0876cb c0876cb, boolean z) {
        int mo2975d;
        int mo2975d2 = i - this.f3390j.mo2975d();
        if (mo2975d2 <= 0) {
            return 0;
        }
        int i2 = -m2813c(mo2975d2, c0868bu, c0876cb);
        int i3 = i + i2;
        if (!z || (mo2975d = i3 - this.f3390j.mo2975d()) <= 0) {
            return i2;
        }
        this.f3390j.mo2970a(-mo2975d);
        return i2 - mo2975d;
    }

    /* renamed from: a */
    private void m2808a(C0826af c0826af) {
        m2819i(c0826af.f3470b, c0826af.f3471c);
    }

    /* renamed from: i */
    private void m2819i(int i, int i2) {
        this.f3381a.f3480c = this.f3390j.mo2977e() - i2;
        this.f3381a.f3482e = this.f3391k ? -1 : 1;
        this.f3381a.f3481d = i;
        this.f3381a.f3483f = 1;
        this.f3381a.f3479b = i2;
        this.f3381a.f3484g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: b */
    private void m2812b(C0826af c0826af) {
        m2821j(c0826af.f3470b, c0826af.f3471c);
    }

    /* renamed from: j */
    private void m2821j(int i, int i2) {
        this.f3381a.f3480c = i2 - this.f3390j.mo2975d();
        this.f3381a.f3481d = i;
        this.f3381a.f3482e = this.f3391k ? 1 : -1;
        this.f3381a.f3483f = -1;
        this.f3381a.f3479b = i2;
        this.f3381a.f3484g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: k */
    public final void m2846k() {
        if (this.f3381a == null) {
            this.f3381a = new C0828ah();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final void mo2836d(int i) {
        this.f3392l = i;
        this.f3393m = RecyclerView.UNDEFINED_DURATION;
        if (this.f3394n != null) {
            this.f3394n.f3397a = -1;
        }
        m3116q();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public int mo2772a(int i, C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3389i == 1) {
            return 0;
        }
        return m2813c(i, c0868bu, c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public int mo2787b(int i, C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3389i == 0) {
            return 0;
        }
        return m2813c(i, c0868bu, c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: e */
    public int mo2798e(C0876cb c0876cb) {
        return m2817h(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public int mo2744b(C0876cb c0876cb) {
        return m2817h(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: f */
    public final int mo2839f(C0876cb c0876cb) {
        return m2818i(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: g */
    public final int mo2841g(C0876cb c0876cb) {
        return m2818i(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public int mo2795d(C0876cb c0876cb) {
        return m2820j(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public int mo2743a(C0876cb c0876cb) {
        return m2820j(c0876cb);
    }

    /* renamed from: h */
    private int m2817h(C0876cb c0876cb) {
        if (m3121v() == 0) {
            return 0;
        }
        m2846k();
        return C0882ch.m3233a(c0876cb, this.f3390j, m2833b(!this.f3385e), m2835c(!this.f3385e), this, this.f3385e, this.f3391k);
    }

    /* renamed from: i */
    private int m2818i(C0876cb c0876cb) {
        if (m3121v() == 0) {
            return 0;
        }
        m2846k();
        return C0882ch.m3232a(c0876cb, this.f3390j, m2833b(!this.f3385e), m2835c(!this.f3385e), this, this.f3385e);
    }

    /* renamed from: j */
    private int m2820j(C0876cb c0876cb) {
        if (m3121v() == 0) {
            return 0;
        }
        m2846k();
        return C0882ch.m3234b(c0876cb, this.f3390j, m2833b(!this.f3385e), m2835c(!this.f3385e), this, this.f3385e);
    }

    /* renamed from: l */
    public final boolean m2847l() {
        return this.f3385e;
    }

    /* renamed from: a */
    private void m2807a(int i, int i2, boolean z, C0876cb c0876cb) {
        int mo2975d;
        this.f3381a.f3490m = m2799H();
        this.f3381a.f3483f = i;
        this.f3396z[0] = 0;
        this.f3396z[1] = 0;
        mo2830a(c0876cb, this.f3396z);
        int max = Math.max(0, this.f3396z[0]);
        int max2 = Math.max(0, this.f3396z[1]);
        boolean z2 = i == 1;
        this.f3381a.f3485h = z2 ? max2 : max;
        C0828ah c0828ah = this.f3381a;
        if (!z2) {
            max = max2;
        }
        c0828ah.f3486i = max;
        if (z2) {
            this.f3381a.f3485h += this.f3390j.mo2982h();
            View m2801J = m2801J();
            this.f3381a.f3482e = this.f3391k ? -1 : 1;
            this.f3381a.f3481d = m3069e(m2801J) + this.f3381a.f3482e;
            this.f3381a.f3479b = this.f3390j.mo2971b(m2801J);
            mo2975d = this.f3390j.mo2971b(m2801J) - this.f3390j.mo2977e();
        } else {
            View m2800I = m2800I();
            this.f3381a.f3485h += this.f3390j.mo2975d();
            this.f3381a.f3482e = this.f3391k ? 1 : -1;
            this.f3381a.f3481d = m3069e(m2800I) + this.f3381a.f3482e;
            this.f3381a.f3479b = this.f3390j.mo2968a(m2800I);
            mo2975d = (-this.f3390j.mo2968a(m2800I)) + this.f3390j.mo2975d();
        }
        this.f3381a.f3480c = i2;
        if (z) {
            this.f3381a.f3480c -= mo2975d;
        }
        this.f3381a.f3484g = mo2975d;
    }

    /* renamed from: H */
    private boolean m2799H() {
        return this.f3390j.mo2983i() == 0 && this.f3390j.mo2979f() == 0;
    }

    /* renamed from: a */
    void mo2784a(C0876cb c0876cb, C0828ah c0828ah, InterfaceC0859bl interfaceC0859bl) {
        int i = c0828ah.f3481d;
        if (i < 0 || i >= c0876cb.m3190a()) {
            return;
        }
        interfaceC0859bl.mo3131b(i, Math.max(0, c0828ah.f3484g));
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2825a(int i, InterfaceC0859bl interfaceC0859bl) {
        boolean z;
        int i2;
        if (this.f3394n != null && this.f3394n.m2852a()) {
            z = this.f3394n.f3399c;
            i2 = this.f3394n.f3397a;
        } else {
            m2814c();
            z = this.f3391k;
            if (this.f3392l == -1) {
                i2 = z ? i - 1 : 0;
            } else {
                i2 = this.f3392l;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f3388h && i2 >= 0 && i2 < i; i4++) {
            interfaceC0859bl.mo3131b(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2824a(int i, int i2, C0876cb c0876cb, InterfaceC0859bl interfaceC0859bl) {
        if (this.f3389i != 0) {
            i = i2;
        }
        if (m3121v() == 0 || i == 0) {
            return;
        }
        m2846k();
        m2807a(i > 0 ? 1 : -1, Math.abs(i), true, c0876cb);
        mo2784a(c0876cb, this.f3381a, interfaceC0859bl);
    }

    /* renamed from: c */
    private int m2813c(int i, C0868bu c0868bu, C0876cb c0876cb) {
        if (m3121v() == 0 || i == 0) {
            return 0;
        }
        m2846k();
        this.f3381a.f3478a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m2807a(i2, abs, true, c0876cb);
        int m2805a = this.f3381a.f3484g + m2805a(c0868bu, this.f3381a, c0876cb, false);
        if (m2805a < 0) {
            return 0;
        }
        if (abs > m2805a) {
            i = i2 * m2805a;
        }
        this.f3390j.mo2970a(-i);
        this.f3381a.f3488k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2831a(String str) {
        if (this.f3394n == null) {
            super.mo2831a(str);
        }
    }

    /* renamed from: a */
    private void m2809a(C0868bu c0868bu, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m3088a(i, c0868bu);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m3088a(i3, c0868bu);
            }
        }
    }

    /* renamed from: a */
    private void m2810a(C0868bu c0868bu, C0828ah c0828ah) {
        if (!c0828ah.f3478a || c0828ah.f3490m) {
            return;
        }
        int i = c0828ah.f3484g;
        int i2 = c0828ah.f3486i;
        if (c0828ah.f3483f == -1) {
            int v = m3121v();
            if (i >= 0) {
                int mo2979f = (this.f3390j.mo2979f() - i) + i2;
                if (this.f3391k) {
                    for (int i3 = 0; i3 < v; i3++) {
                        View f = m3111f(i3);
                        if (this.f3390j.mo2968a(f) < mo2979f || this.f3390j.mo2976d(f) < mo2979f) {
                            m2809a(c0868bu, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = v - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View f2 = m3111f(i5);
                    if (this.f3390j.mo2968a(f2) < mo2979f || this.f3390j.mo2976d(f2) < mo2979f) {
                        m2809a(c0868bu, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int v2 = m3121v();
            if (!this.f3391k) {
                for (int i7 = 0; i7 < v2; i7++) {
                    View f3 = m3111f(i7);
                    if (this.f3390j.mo2971b(f3) > i6 || this.f3390j.mo2974c(f3) > i6) {
                        m2809a(c0868bu, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = v2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View f4 = m3111f(i9);
                if (this.f3390j.mo2971b(f4) > i6 || this.f3390j.mo2974c(f4) > i6) {
                    m2809a(c0868bu, i8, i9);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private int m2805a(C0868bu c0868bu, C0828ah c0828ah, C0876cb c0876cb, boolean z) {
        int i = c0828ah.f3480c;
        if (c0828ah.f3484g != Integer.MIN_VALUE) {
            if (c0828ah.f3480c < 0) {
                c0828ah.f3484g += c0828ah.f3480c;
            }
            m2810a(c0868bu, c0828ah);
        }
        int i2 = c0828ah.f3480c + c0828ah.f3485h;
        C0827ag c0827ag = this.f3387g;
        while (true) {
            if ((!c0828ah.f3490m && i2 <= 0) || !c0828ah.m2947a(c0876cb)) {
                break;
            }
            c0827ag.m2943a();
            mo2783a(c0868bu, c0876cb, c0828ah, c0827ag);
            if (!c0827ag.f3475b) {
                c0828ah.f3479b += c0827ag.f3474a * c0828ah.f3483f;
                if (!c0827ag.f3476c || c0828ah.f3489l != null || !c0876cb.f3595g) {
                    c0828ah.f3480c -= c0827ag.f3474a;
                    i2 -= c0827ag.f3474a;
                }
                if (c0828ah.f3484g != Integer.MIN_VALUE) {
                    c0828ah.f3484g += c0827ag.f3474a;
                    if (c0828ah.f3480c < 0) {
                        c0828ah.f3484g += c0828ah.f3480c;
                    }
                    m2810a(c0868bu, c0828ah);
                }
                if (z && c0827ag.f3477d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0828ah.f3480c;
    }

    /* renamed from: a */
    void mo2783a(C0868bu c0868bu, C0876cb c0876cb, C0828ah c0828ah, C0827ag c0827ag) {
        int mo2980f;
        int i;
        int i2;
        int i3;
        int i4;
        View m2945a = c0828ah.m2945a(c0868bu);
        if (m2945a == null) {
            c0827ag.f3475b = true;
            return;
        }
        C0861bn c0861bn = (C0861bn) m2945a.getLayoutParams();
        if (c0828ah.f3489l == null) {
            if (this.f3391k == (c0828ah.f3483f == -1)) {
                m3107c(m2945a);
            } else {
                m3109d(m2945a);
            }
        } else {
            if (this.f3391k == (c0828ah.f3483f == -1)) {
                m3089a(m2945a);
            } else {
                m3101b(m2945a);
            }
        }
        C0861bn c0861bn2 = (C0861bn) m2945a.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f3535q.getItemDecorInsetsForChild(m2945a);
        int i5 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0;
        int i6 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0;
        int m3061a = AbstractC0856bi.m3061a(m3124y(), m3122w(), m3081A() + m3083C() + c0861bn2.leftMargin + c0861bn2.rightMargin + i5, c0861bn2.width, mo2842g());
        int m3061a2 = AbstractC0856bi.m3061a(m3125z(), m3123x(), m3082B() + m3084D() + c0861bn2.topMargin + c0861bn2.bottomMargin + i6, c0861bn2.height, mo2843h());
        if (m3106b(m2945a, m3061a, m3061a2, c0861bn2)) {
            m2945a.measure(m3061a, m3061a2);
        }
        c0827ag.f3474a = this.f3390j.mo2978e(m2945a);
        if (this.f3389i == 1) {
            if (m2845j()) {
                int y = m3124y() - m3083C();
                i2 = y - this.f3390j.mo2980f(m2945a);
                i3 = y;
            } else {
                i2 = m3081A();
                i3 = this.f3390j.mo2980f(m2945a) + i2;
            }
            if (c0828ah.f3483f == -1) {
                mo2980f = c0828ah.f3479b;
                i4 = c0828ah.f3479b - c0827ag.f3474a;
                m3065a(m2945a, i2, i4, i3, mo2980f);
                if (!c0861bn.f3550c.m3220n() || c0861bn.f3550c.m3228v()) {
                    c0827ag.f3476c = true;
                }
                c0827ag.f3477d = m2945a.hasFocusable();
            }
            i = c0828ah.f3479b;
            mo2980f = c0828ah.f3479b + c0827ag.f3474a;
        } else {
            int B = m3082B();
            mo2980f = B + this.f3390j.mo2980f(m2945a);
            if (c0828ah.f3483f == -1) {
                i3 = c0828ah.f3479b;
                i = B;
                i2 = c0828ah.f3479b - c0827ag.f3474a;
            } else {
                i = B;
                i2 = c0828ah.f3479b;
                i3 = c0828ah.f3479b + c0827ag.f3474a;
            }
        }
        i4 = i;
        m3065a(m2945a, i2, i4, i3, mo2980f);
        if (!c0861bn.f3550c.m3220n()) {
        }
        c0827ag.f3476c = true;
        c0827ag.f3477d = m2945a.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: m */
    public final boolean mo2848m() {
        boolean z;
        if (m3123x() != 1073741824 && m3122w() != 1073741824) {
            int m3121v = m3121v();
            int i = 0;
            while (true) {
                if (i >= m3121v) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = m3111f(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final int m2837e(int i) {
        if (i == 17) {
            if (this.f3389i == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (this.f3389i == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            if (this.f3389i == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130) {
            if (this.f3389i == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        switch (i) {
            case 1:
                return (this.f3389i != 1 && m2845j()) ? 1 : -1;
            case 2:
                return (this.f3389i != 1 && m2845j()) ? -1 : 1;
            default:
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: I */
    private View m2800I() {
        return m3111f(this.f3391k ? m3121v() - 1 : 0);
    }

    /* renamed from: J */
    private View m2801J() {
        return m3111f(this.f3391k ? 0 : m3121v() - 1);
    }

    /* renamed from: b */
    public final View m2833b(boolean z) {
        if (this.f3391k) {
            return m2806a(m3121v() - 1, -1, z, true);
        }
        return m2806a(0, m3121v(), z, true);
    }

    /* renamed from: c */
    public final View m2835c(boolean z) {
        if (this.f3391k) {
            return m2806a(0, m3121v(), z, true);
        }
        return m2806a(m3121v() - 1, -1, z, true);
    }

    /* renamed from: d */
    private View m2815d(C0868bu c0868bu, C0876cb c0876cb) {
        return mo2775a(c0868bu, c0876cb, m3121v() - 1, -1, c0876cb.m3190a());
    }

    /* renamed from: a */
    View mo2775a(C0868bu c0868bu, C0876cb c0876cb, int i, int i2, int i3) {
        m2846k();
        int mo2975d = this.f3390j.mo2975d();
        int mo2977e = this.f3390j.mo2977e();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View f = m3111f(i);
            int e = m3069e(f);
            if (e >= 0 && e < i3) {
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

    /* renamed from: K */
    private View m2802K() {
        return m2822k(0, m3121v());
    }

    /* renamed from: L */
    private View m2803L() {
        return m2822k(m3121v() - 1, -1);
    }

    /* renamed from: n */
    public final int m2849n() {
        View m2806a = m2806a(0, m3121v(), false, true);
        if (m2806a == null) {
            return -1;
        }
        return m3069e(m2806a);
    }

    /* renamed from: o */
    public final int m2850o() {
        View m2806a = m2806a(0, m3121v(), true, false);
        if (m2806a == null) {
            return -1;
        }
        return m3069e(m2806a);
    }

    /* renamed from: p */
    public final int m2851p() {
        View m2806a = m2806a(m3121v() - 1, -1, false, true);
        if (m2806a == null) {
            return -1;
        }
        return m3069e(m2806a);
    }

    /* renamed from: a */
    private View m2806a(int i, int i2, boolean z, boolean z2) {
        m2846k();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.f3389i == 0) {
            return this.f3536r.m3261a(i, i2, i3, i4);
        }
        return this.f3537s.m3261a(i, i2, i3, i4);
    }

    /* renamed from: k */
    private View m2822k(int i, int i2) {
        int i3;
        int i4;
        m2846k();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m3111f(i);
        }
        if (this.f3390j.mo2968a(m3111f(i)) < this.f3390j.mo2975d()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f3389i == 0) {
            return this.f3536r.m3261a(i, i2, i3, i4);
        }
        return this.f3537s.m3261a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public View mo2774a(View view, int i, C0868bu c0868bu, C0876cb c0876cb) {
        int m2837e;
        View m2802K;
        View m2801J;
        m2814c();
        if (m3121v() == 0 || (m2837e = m2837e(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m2846k();
        m2807a(m2837e, (int) (this.f3390j.mo2981g() * 0.33333334f), false, c0876cb);
        this.f3381a.f3484g = RecyclerView.UNDEFINED_DURATION;
        this.f3381a.f3478a = false;
        m2805a(c0868bu, this.f3381a, c0876cb, true);
        if (m2837e == -1) {
            m2802K = this.f3391k ? m2803L() : m2802K();
        } else {
            m2802K = this.f3391k ? m2802K() : m2803L();
        }
        if (m2837e == -1) {
            m2801J = m2800I();
        } else {
            m2801J = m2801J();
        }
        if (!m2801J.hasFocusable()) {
            return m2802K;
        }
        if (m2802K == null) {
            return null;
        }
        return m2801J;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public boolean mo2797d() {
        return this.f3394n == null && this.f3382b == this.f3384d;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0829ai();

        /* renamed from: a */
        int f3397a;

        /* renamed from: b */
        int f3398b;

        /* renamed from: c */
        boolean f3399c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f3397a = parcel.readInt();
            this.f3398b = parcel.readInt();
            this.f3399c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3397a = savedState.f3397a;
            this.f3398b = savedState.f3398b;
            this.f3399c = savedState.f3399c;
        }

        /* renamed from: a */
        final boolean m2852a() {
            return this.f3397a >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3397a);
            parcel.writeInt(this.f3398b);
            parcel.writeInt(this.f3399c ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo2830a(C0876cb c0876cb, int[] iArr) {
        int i;
        int mo2981g = c0876cb.f3589a != -1 ? this.f3390j.mo2981g() : 0;
        if (this.f3381a.f3483f == -1) {
            i = 0;
        } else {
            i = mo2981g;
            mo2981g = 0;
        }
        iArr[0] = mo2981g;
        iArr[1] = i;
    }

    /* renamed from: j */
    public final boolean m2845j() {
        return C0538w.m1878h(this.f3535q) == 1;
    }
}
