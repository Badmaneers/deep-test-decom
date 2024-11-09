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
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0485f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0856bi implements InterfaceC0875ca {

    /* renamed from: A */
    private SavedState f3401A;

    /* renamed from: B */
    private int f3402B;

    /* renamed from: G */
    private int[] f3407G;

    /* renamed from: a */
    C0892cr[] f3409a;

    /* renamed from: b */
    AbstractC0834an f3410b;

    /* renamed from: c */
    AbstractC0834an f3411c;

    /* renamed from: j */
    private int f3418j;

    /* renamed from: k */
    private int f3419k;

    /* renamed from: l */
    private final C0825ae f3420l;

    /* renamed from: m */
    private BitSet f3421m;

    /* renamed from: o */
    private boolean f3423o;

    /* renamed from: z */
    private boolean f3424z;

    /* renamed from: i */
    private int f3417i = -1;

    /* renamed from: d */
    boolean f3412d = false;

    /* renamed from: e */
    boolean f3413e = false;

    /* renamed from: f */
    int f3414f = -1;

    /* renamed from: g */
    int f3415g = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: h */
    LazySpanLookup f3416h = new LazySpanLookup();

    /* renamed from: n */
    private int f3422n = 2;

    /* renamed from: C */
    private final Rect f3403C = new Rect();

    /* renamed from: D */
    private final C0888cn f3404D = new C0888cn(this);

    /* renamed from: E */
    private boolean f3405E = false;

    /* renamed from: F */
    private boolean f3406F = true;

    /* renamed from: H */
    private final Runnable f3408H = new RunnableC0887cm(this);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0860bm a2 = m3062a(context, attributeSet, i, i2);
        int i3 = a2.f3546a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo2831a((String) null);
        if (i3 != this.f3418j) {
            this.f3418j = i3;
            AbstractC0834an abstractC0834an = this.f3410b;
            this.f3410b = this.f3411c;
            this.f3411c = abstractC0834an;
            m3116q();
        }
        m2855a(a2.f3547b);
        m2864a(a2.f3548c);
        this.f3420l = new C0825ae();
        this.f3410b = AbstractC0834an.m2966a(this, this.f3418j);
        this.f3411c = AbstractC0834an.m2966a(this, 1 - this.f3418j);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: e */
    public final boolean mo2838e() {
        return this.f3422n != 0;
    }

    /* renamed from: c */
    public final boolean m2897c() {
        int m2891p;
        int m2889o;
        if (m3121v() == 0 || this.f3422n == 0 || !this.f3540v) {
            return false;
        }
        if (this.f3413e) {
            m2891p = m2889o();
            m2889o = m2891p();
        } else {
            m2891p = m2891p();
            m2889o = m2889o();
        }
        if (m2891p == 0 && m2877i() != null) {
            this.f3416h.m2906a();
            this.f3539u = true;
            m3116q();
            return true;
        }
        if (!this.f3405E) {
            return false;
        }
        int i = this.f3413e ? -1 : 1;
        int i2 = m2889o + 1;
        LazySpanLookup.FullSpanItem m2905a = this.f3416h.m2905a(m2891p, i2, i);
        if (m2905a == null) {
            this.f3405E = false;
            this.f3416h.m2904a(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem m2905a2 = this.f3416h.m2905a(m2891p, m2905a.f3427a, i * (-1));
        if (m2905a2 == null) {
            this.f3416h.m2904a(m2905a.f3427a);
        } else {
            this.f3416h.m2904a(m2905a2.f3427a + 1);
        }
        this.f3539u = true;
        m3116q();
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: i */
    public final void mo2900i(int i) {
        if (i == 0) {
            m2897c();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2829a(RecyclerView recyclerView, C0868bu c0868bu) {
        super.mo2829a(recyclerView, c0868bu);
        m3100a(this.f3408H);
        for (int i = 0; i < this.f3417i; i++) {
            this.f3409a[i].m3254c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:            if (r10 == r11) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:            r10 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:            if (r10 == r11) goto L97;     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View m2877i() {
        /*
            r12 = this;
            int r0 = r12.m3121v()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3417i
            r2.<init>(r3)
            int r3 = r12.f3417i
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3418j
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m2883k()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f3413e
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Laa
            android.view.View r7 = r12.m3111f(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.co r8 = (androidx.recyclerview.widget.C0889co) r8
            androidx.recyclerview.widget.cr r9 = r8.f3651a
            int r9 = r9.f3657e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.cr r9 = r8.f3651a
            boolean r9 = r12.m2865a(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.cr r9 = r8.f3651a
            int r9 = r9.f3657e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3652b
            if (r9 != 0) goto La8
            int r9 = r0 + r5
            if (r9 == r6) goto La8
            android.view.View r9 = r12.m3111f(r9)
            boolean r10 = r12.f3413e
            if (r10 == 0) goto L76
            androidx.recyclerview.widget.an r10 = r12.f3410b
            int r10 = r10.mo2971b(r7)
            androidx.recyclerview.widget.an r11 = r12.f3410b
            int r11 = r11.mo2971b(r9)
            if (r10 >= r11) goto L73
            return r7
        L73:
            if (r10 != r11) goto L89
            goto L87
        L76:
            androidx.recyclerview.widget.an r10 = r12.f3410b
            int r10 = r10.mo2968a(r7)
            androidx.recyclerview.widget.an r11 = r12.f3410b
            int r11 = r11.mo2968a(r9)
            if (r10 <= r11) goto L85
            return r7
        L85:
            if (r10 != r11) goto L89
        L87:
            r10 = r1
            goto L8a
        L89:
            r10 = r4
        L8a:
            if (r10 == 0) goto La8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.co r9 = (androidx.recyclerview.widget.C0889co) r9
            androidx.recyclerview.widget.cr r8 = r8.f3651a
            int r8 = r8.f3657e
            androidx.recyclerview.widget.cr r9 = r9.f3651a
            int r9 = r9.f3657e
            int r8 = r8 - r9
            if (r8 >= 0) goto L9f
            r8 = r1
            goto La0
        L9f:
            r8 = r4
        La0:
            if (r3 >= 0) goto La4
            r9 = r1
            goto La5
        La4:
            r9 = r4
        La5:
            if (r8 == r9) goto La8
            return r7
        La8:
            int r0 = r0 + r5
            goto L2e
        Laa:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2877i():android.view.View");
    }

    /* renamed from: a */
    private boolean m2865a(C0892cr c0892cr) {
        return this.f3413e ? c0892cr.m3251b() < this.f3410b.mo2977e() && !((C0889co) c0892cr.f3653a.get(c0892cr.f3653a.size() - 1).getLayoutParams()).f3652b : c0892cr.m3247a() > this.f3410b.mo2975d() && !((C0889co) c0892cr.f3653a.get(0).getLayoutParams()).f3652b;
        return false;
    }

    /* renamed from: a */
    private void m2855a(int i) {
        mo2831a((String) null);
        if (i != this.f3417i) {
            this.f3416h.m2906a();
            m3116q();
            this.f3417i = i;
            this.f3421m = new BitSet(this.f3417i);
            this.f3409a = new C0892cr[this.f3417i];
            for (int i2 = 0; i2 < this.f3417i; i2++) {
                this.f3409a[i2] = new C0892cr(this, i2);
            }
            m3116q();
        }
    }

    /* renamed from: a */
    private void m2864a(boolean z) {
        mo2831a((String) null);
        if (this.f3401A != null && this.f3401A.f3438h != z) {
            this.f3401A.f3438h = z;
        }
        this.f3412d = z;
        m3116q();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2831a(String str) {
        if (this.f3401A == null) {
            super.mo2831a(str);
        }
    }

    /* renamed from: j */
    private void m2880j() {
        boolean z = true;
        if (this.f3418j == 1 || !m2883k()) {
            z = this.f3412d;
        } else if (this.f3412d) {
            z = false;
        }
        this.f3413e = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2780a(Rect rect, int i, int i2) {
        int a2;
        int a3;
        int A = m3081A() + m3083C();
        int B = m3082B() + m3084D();
        if (this.f3418j == 1) {
            a3 = m3060a(i2, rect.height() + B, C0538w.m1886o(this.f3535q));
            a2 = m3060a(i, (this.f3419k * this.f3417i) + A, C0538w.m1885n(this.f3535q));
        } else {
            a2 = m3060a(i, rect.width() + A, C0538w.m1885n(this.f3535q));
            a3 = m3060a(i2, (this.f3419k * this.f3417i) + B, C0538w.m1886o(this.f3535q));
        }
        m3115h(a2, a3);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    public final void mo2794c(C0876cb c0876cb) {
        super.mo2794c(c0876cb);
        this.f3414f = -1;
        this.f3415g = RecyclerView.UNDEFINED_DURATION;
        this.f3401A = null;
        this.f3404D.m3242a();
    }

    /* renamed from: e */
    private void m2874e(int i) {
        this.f3419k = i / this.f3417i;
        this.f3402B = View.MeasureSpec.makeMeasureSpec(i, this.f3411c.mo2983i());
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final boolean mo2797d() {
        return this.f3401A == null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: e */
    public final int mo2798e(C0876cb c0876cb) {
        return m2875h(c0876cb);
    }

    /* renamed from: h */
    private int m2875h(C0876cb c0876cb) {
        if (m3121v() == 0) {
            return 0;
        }
        return C0882ch.m3233a(c0876cb, this.f3410b, m2867b(!this.f3406F), m2872c(!this.f3406F), this, this.f3406F, this.f3413e);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2744b(C0876cb c0876cb) {
        return m2875h(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: f */
    public final int mo2839f(C0876cb c0876cb) {
        return m2876i(c0876cb);
    }

    /* renamed from: i */
    private int m2876i(C0876cb c0876cb) {
        if (m3121v() == 0) {
            return 0;
        }
        return C0882ch.m3232a(c0876cb, this.f3410b, m2867b(!this.f3406F), m2872c(!this.f3406F), this, this.f3406F);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: g */
    public final int mo2841g(C0876cb c0876cb) {
        return m2876i(c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final int mo2795d(C0876cb c0876cb) {
        return m2879j(c0876cb);
    }

    /* renamed from: j */
    private int m2879j(C0876cb c0876cb) {
        if (m3121v() == 0) {
            return 0;
        }
        return C0882ch.m3234b(c0876cb, this.f3410b, m2867b(!this.f3406F), m2872c(!this.f3406F), this, this.f3406F);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2743a(C0876cb c0876cb) {
        return m2879j(c0876cb);
    }

    /* renamed from: a */
    private void m2858a(View view, C0889co c0889co) {
        if (c0889co.f3652b) {
            if (this.f3418j == 1) {
                m2857a(view, this.f3402B, m3061a(m3125z(), m3123x(), m3082B() + m3084D(), c0889co.height, true));
                return;
            } else {
                m2857a(view, m3061a(m3124y(), m3122w(), m3081A() + m3083C(), c0889co.width, true), this.f3402B);
                return;
            }
        }
        if (this.f3418j == 1) {
            m2857a(view, m3061a(this.f3419k, m3122w(), 0, c0889co.width, false), m3061a(m3125z(), m3123x(), m3082B() + m3084D(), c0889co.height, true));
        } else {
            m2857a(view, m3061a(m3124y(), m3122w(), m3081A() + m3083C(), c0889co.width, true), m3061a(this.f3419k, m3123x(), 0, c0889co.height, false));
        }
    }

    /* renamed from: a */
    private void m2857a(View view, int i, int i2) {
        m3102b(view, this.f3403C);
        C0889co c0889co = (C0889co) view.getLayoutParams();
        int m2866b = m2866b(i, c0889co.leftMargin + this.f3403C.left, c0889co.rightMargin + this.f3403C.right);
        int m2866b2 = m2866b(i2, c0889co.topMargin + this.f3403C.top, c0889co.bottomMargin + this.f3403C.bottom);
        if (m3106b(view, m2866b, m2866b2, c0889co)) {
            view.measure(m2866b, m2866b2);
        }
    }

    /* renamed from: b */
    private static int m2866b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2826a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3401A = (SavedState) parcelable;
            m3116q();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: f */
    public final Parcelable mo2840f() {
        int m3248a;
        if (this.f3401A != null) {
            return new SavedState(this.f3401A);
        }
        SavedState savedState = new SavedState();
        savedState.f3438h = this.f3412d;
        savedState.f3439i = this.f3423o;
        savedState.f3440j = this.f3424z;
        if (this.f3416h != null && this.f3416h.f3425a != null) {
            savedState.f3436f = this.f3416h.f3425a;
            savedState.f3435e = savedState.f3436f.length;
            savedState.f3437g = this.f3416h.f3426b;
        } else {
            savedState.f3435e = 0;
        }
        if (m3121v() > 0) {
            savedState.f3431a = this.f3423o ? m2889o() : m2891p();
            View m2872c = this.f3413e ? m2872c(true) : m2867b(true);
            savedState.f3432b = m2872c != null ? m3069e(m2872c) : -1;
            savedState.f3433c = this.f3417i;
            savedState.f3434d = new int[this.f3417i];
            for (int i = 0; i < this.f3417i; i++) {
                if (this.f3423o) {
                    m3248a = this.f3409a[i].m3252b(RecyclerView.UNDEFINED_DURATION);
                    if (m3248a != Integer.MIN_VALUE) {
                        m3248a -= this.f3410b.mo2977e();
                    }
                } else {
                    m3248a = this.f3409a[i].m3248a(RecyclerView.UNDEFINED_DURATION);
                    if (m3248a != Integer.MIN_VALUE) {
                        m3248a -= this.f3410b.mo2975d();
                    }
                }
                savedState.f3434d[i] = m3248a;
            }
        } else {
            savedState.f3431a = -1;
            savedState.f3432b = -1;
            savedState.f3433c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2781a(C0868bu c0868bu, C0876cb c0876cb, View view, C0482c c0482c) {
        int m3243a;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0889co)) {
            super.m3091a(view, c0482c);
            return;
        }
        C0889co c0889co = (C0889co) layoutParams;
        int i3 = -1;
        if (this.f3418j == 0) {
            int m3243a2 = c0889co.m3243a();
            i2 = c0889co.f3652b ? this.f3417i : 1;
            i = -1;
            i3 = m3243a2;
            m3243a = -1;
        } else {
            m3243a = c0889co.m3243a();
            i = c0889co.f3652b ? this.f3417i : 1;
            i2 = -1;
        }
        c0482c.m1661b(C0485f.m1715a(i3, i2, m3243a, i, false));
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2827a(AccessibilityEvent accessibilityEvent) {
        super.mo2827a(accessibilityEvent);
        if (m3121v() > 0) {
            View m2867b = m2867b(false);
            View m2872c = m2872c(false);
            if (m2867b == null || m2872c == null) {
                return;
            }
            int e = m3069e(m2867b);
            int e2 = m3069e(m2872c);
            if (e < e2) {
                accessibilityEvent.setFromIndex(e);
                accessibilityEvent.setToIndex(e2);
            } else {
                accessibilityEvent.setFromIndex(e2);
                accessibilityEvent.setToIndex(e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2773a(C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3418j == 0) {
            return this.f3417i;
        }
        return super.mo2773a(c0868bu, c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2788b(C0868bu c0868bu, C0876cb c0876cb) {
        if (this.f3418j == 1) {
            return this.f3417i;
        }
        return super.mo2788b(c0868bu, c0876cb);
    }

    /* renamed from: b */
    private View m2867b(boolean z) {
        int mo2975d = this.f3410b.mo2975d();
        int mo2977e = this.f3410b.mo2977e();
        int v = m3121v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View f = m3111f(i);
            int mo2968a = this.f3410b.mo2968a(f);
            if (this.f3410b.mo2971b(f) > mo2975d && mo2968a < mo2977e) {
                if (mo2968a >= mo2975d || !z) {
                    return f;
                }
                if (view == null) {
                    view = f;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    private View m2872c(boolean z) {
        int mo2975d = this.f3410b.mo2975d();
        int mo2977e = this.f3410b.mo2977e();
        View view = null;
        for (int v = m3121v() - 1; v >= 0; v--) {
            View f = m3111f(v);
            int mo2968a = this.f3410b.mo2968a(f);
            int mo2971b = this.f3410b.mo2971b(f);
            if (mo2971b > mo2975d && mo2968a < mo2977e) {
                if (mo2971b <= mo2977e || !z) {
                    return f;
                }
                if (view == null) {
                    view = f;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m2862a(C0868bu c0868bu, C0876cb c0876cb, boolean z) {
        int mo2977e;
        int m2890o = m2890o(RecyclerView.UNDEFINED_DURATION);
        if (m2890o != Integer.MIN_VALUE && (mo2977e = this.f3410b.mo2977e() - m2890o) > 0) {
            int i = mo2977e - (-m2871c(-mo2977e, c0868bu, c0876cb));
            if (!z || i <= 0) {
                return;
            }
            this.f3410b.mo2970a(i);
        }
    }

    /* renamed from: b */
    private void m2870b(C0868bu c0868bu, C0876cb c0876cb, boolean z) {
        int mo2975d;
        int m2887n = m2887n(Integer.MAX_VALUE);
        if (m2887n != Integer.MAX_VALUE && (mo2975d = m2887n - this.f3410b.mo2975d()) > 0) {
            int m2871c = mo2975d - m2871c(mo2975d, c0868bu, c0876cb);
            if (!z || m2871c <= 0) {
                return;
            }
            this.f3410b.mo2970a(-m2871c);
        }
    }

    /* renamed from: a */
    private void m2856a(int i, C0876cb c0876cb) {
        int i2;
        int i3;
        int i4;
        boolean z = false;
        this.f3420l.f3461b = 0;
        this.f3420l.f3462c = i;
        if (!m3119t() || (i4 = c0876cb.f3589a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f3413e == (i4 < i)) {
                i3 = this.f3410b.mo2981g();
                i2 = 0;
            } else {
                i2 = this.f3410b.mo2981g();
                i3 = 0;
            }
        }
        if (m3118s()) {
            this.f3420l.f3465f = this.f3410b.mo2975d() - i2;
            this.f3420l.f3466g = this.f3410b.mo2977e() + i3;
        } else {
            this.f3420l.f3466g = this.f3410b.mo2979f() + i3;
            this.f3420l.f3465f = -i2;
        }
        this.f3420l.f3467h = false;
        this.f3420l.f3460a = true;
        C0825ae c0825ae = this.f3420l;
        if (this.f3410b.mo2983i() == 0 && this.f3410b.mo2979f() == 0) {
            z = true;
        }
        c0825ae.f3468i = z;
    }

    /* renamed from: j */
    private void m2881j(int i) {
        this.f3420l.f3464e = i;
        this.f3420l.f3463d = this.f3413e != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: g */
    public final void mo2898g(int i) {
        super.mo2898g(i);
        for (int i2 = 0; i2 < this.f3417i; i2++) {
            this.f3409a[i2].m3257d(i);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: h */
    public final void mo2899h(int i) {
        super.mo2899h(i);
        for (int i2 = 0; i2 < this.f3417i; i2++) {
            this.f3409a[i2].m3257d(i);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final void mo2790b(int i, int i2) {
        m2873c(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2779a(int i, int i2) {
        m2873c(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2778a() {
        this.f3416h.m2906a();
        m3116q();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final void mo2796d(int i, int i2) {
        m2873c(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    public final void mo2792c(int i, int i2) {
        m2873c(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2873c(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.f3413e
            if (r0 == 0) goto L9
            int r0 = r5.m2889o()
            goto Ld
        L9:
            int r0 = r5.m2891p()
        Ld:
            r1 = 8
            if (r8 != r1) goto L1b
            if (r6 >= r7) goto L16
            int r2 = r7 + 1
            goto L1d
        L16:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L1f
        L1b:
            int r2 = r6 + r7
        L1d:
            r3 = r2
            r2 = r6
        L1f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r5.f3416h
            r4.m2910b(r2)
            if (r8 == r1) goto L36
            switch(r8) {
                case 1: goto L30;
                case 2: goto L2a;
                default: goto L29;
            }
        L29:
            goto L41
        L2a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f3416h
            r8.m2907a(r6, r7)
            goto L41
        L30:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f3416h
            r8.m2911b(r6, r7)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f3416h
            r1 = 1
            r8.m2907a(r6, r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r5.f3416h
            r6.m2911b(r7, r1)
        L41:
            if (r3 > r0) goto L44
            return
        L44:
            boolean r6 = r5.f3413e
            if (r6 == 0) goto L4d
            int r6 = r5.m2891p()
            goto L51
        L4d:
            int r6 = r5.m2889o()
        L51:
            if (r2 > r6) goto L56
            r5.m3116q()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2873c(int, int, int):void");
    }

    /* renamed from: a */
    private int m2853a(C0868bu c0868bu, C0825ae c0825ae, C0876cb c0876cb) {
        int i;
        int mo2975d;
        int m2890o;
        C0892cr c0892cr;
        int m2887n;
        int mo2978e;
        int mo2975d2;
        int mo2978e2;
        boolean m2888n;
        char c = 0;
        this.f3421m.set(0, this.f3417i, true);
        if (this.f3420l.f3468i) {
            i = c0825ae.f3464e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else if (c0825ae.f3464e == 1) {
            i = c0825ae.f3466g + c0825ae.f3461b;
        } else {
            i = c0825ae.f3465f - c0825ae.f3461b;
        }
        m2878i(c0825ae.f3464e, i);
        if (this.f3413e) {
            mo2975d = this.f3410b.mo2977e();
        } else {
            mo2975d = this.f3410b.mo2975d();
        }
        boolean z = false;
        while (c0825ae.m2938a(c0876cb) && (this.f3420l.f3468i || !this.f3421m.isEmpty())) {
            View m2937a = c0825ae.m2937a(c0868bu);
            C0889co c0889co = (C0889co) m2937a.getLayoutParams();
            int m3209c = c0889co.f3550c.m3209c();
            int m2912c = this.f3416h.m2912c(m3209c);
            char c2 = m2912c == -1 ? (char) 1 : c;
            if (c2 != 0) {
                c0892cr = c0889co.f3652b ? this.f3409a[c] : m2854a(c0825ae);
                this.f3416h.m2908a(m3209c, c0892cr);
            } else {
                c0892cr = this.f3409a[m2912c];
            }
            c0889co.f3651a = c0892cr;
            if (c0825ae.f3464e == 1) {
                m3107c(m2937a);
            } else {
                m3109d(m2937a);
            }
            m2858a(m2937a, c0889co);
            if (c0825ae.f3464e == 1) {
                mo2978e = c0889co.f3652b ? m2890o(mo2975d) : c0892cr.m3252b(mo2975d);
                m2887n = this.f3410b.mo2978e(m2937a) + mo2978e;
                if (c2 != 0 && c0889co.f3652b) {
                    LazySpanLookup.FullSpanItem m2882k = m2882k(mo2978e);
                    m2882k.f3428b = -1;
                    m2882k.f3427a = m3209c;
                    this.f3416h.m2909a(m2882k);
                }
            } else {
                m2887n = c0889co.f3652b ? m2887n(mo2975d) : c0892cr.m3248a(mo2975d);
                mo2978e = m2887n - this.f3410b.mo2978e(m2937a);
                if (c2 != 0 && c0889co.f3652b) {
                    LazySpanLookup.FullSpanItem m2884l = m2884l(m2887n);
                    m2884l.f3428b = 1;
                    m2884l.f3427a = m3209c;
                    this.f3416h.m2909a(m2884l);
                }
            }
            if (c0889co.f3652b && c0825ae.f3463d == -1) {
                if (c2 == 0) {
                    if (c0825ae.f3464e == 1) {
                        m2888n = m2885l();
                    } else {
                        m2888n = m2888n();
                    }
                    if (!m2888n) {
                        LazySpanLookup.FullSpanItem m2913d = this.f3416h.m2913d(m3209c);
                        if (m2913d != null) {
                            m2913d.f3430d = true;
                        }
                    }
                }
                this.f3405E = true;
            }
            m2859a(m2937a, c0889co, c0825ae);
            if (m2883k() && this.f3418j == 1) {
                mo2978e2 = c0889co.f3652b ? this.f3411c.mo2977e() : this.f3411c.mo2977e() - (((this.f3417i - 1) - c0892cr.f3657e) * this.f3419k);
                mo2975d2 = mo2978e2 - this.f3411c.mo2978e(m2937a);
            } else {
                mo2975d2 = c0889co.f3652b ? this.f3411c.mo2975d() : (c0892cr.f3657e * this.f3419k) + this.f3411c.mo2975d();
                mo2978e2 = this.f3411c.mo2978e(m2937a) + mo2975d2;
            }
            if (this.f3418j == 1) {
                m3065a(m2937a, mo2975d2, mo2978e, mo2978e2, m2887n);
            } else {
                m3065a(m2937a, mo2978e, mo2975d2, m2887n, mo2978e2);
            }
            if (c0889co.f3652b) {
                m2878i(this.f3420l.f3464e, i);
            } else {
                m2863a(c0892cr, this.f3420l.f3464e, i);
            }
            m2861a(c0868bu, this.f3420l);
            if (this.f3420l.f3467h && m2937a.hasFocusable()) {
                if (c0889co.f3652b) {
                    this.f3421m.clear();
                } else {
                    this.f3421m.set(c0892cr.f3657e, false);
                }
            }
            z = true;
            c = 0;
        }
        if (!z) {
            m2861a(c0868bu, this.f3420l);
        }
        if (this.f3420l.f3464e == -1) {
            m2890o = this.f3410b.mo2975d() - m2887n(this.f3410b.mo2975d());
        } else {
            m2890o = m2890o(this.f3410b.mo2977e()) - this.f3410b.mo2977e();
        }
        if (m2890o > 0) {
            return Math.min(c0825ae.f3461b, m2890o);
        }
        return 0;
    }

    /* renamed from: k */
    private LazySpanLookup.FullSpanItem m2882k(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3429c = new int[this.f3417i];
        for (int i2 = 0; i2 < this.f3417i; i2++) {
            fullSpanItem.f3429c[i2] = i - this.f3409a[i2].m3252b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: l */
    private LazySpanLookup.FullSpanItem m2884l(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3429c = new int[this.f3417i];
        for (int i2 = 0; i2 < this.f3417i; i2++) {
            fullSpanItem.f3429c[i2] = this.f3409a[i2].m3248a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: a */
    private void m2859a(View view, C0889co c0889co, C0825ae c0825ae) {
        if (c0825ae.f3464e == 1) {
            if (c0889co.f3652b) {
                m2893q(view);
                return;
            } else {
                c0889co.f3651a.m3253b(view);
                return;
            }
        }
        if (c0889co.f3652b) {
            m2896r(view);
        } else {
            c0889co.f3651a.m3250a(view);
        }
    }

    /* renamed from: a */
    private void m2861a(C0868bu c0868bu, C0825ae c0825ae) {
        int min;
        int min2;
        if (!c0825ae.f3460a || c0825ae.f3468i) {
            return;
        }
        if (c0825ae.f3461b == 0) {
            if (c0825ae.f3464e == -1) {
                m2869b(c0868bu, c0825ae.f3466g);
                return;
            } else {
                m2860a(c0868bu, c0825ae.f3465f);
                return;
            }
        }
        if (c0825ae.f3464e == -1) {
            int m2886m = c0825ae.f3465f - m2886m(c0825ae.f3465f);
            if (m2886m < 0) {
                min2 = c0825ae.f3466g;
            } else {
                min2 = c0825ae.f3466g - Math.min(m2886m, c0825ae.f3461b);
            }
            m2869b(c0868bu, min2);
            return;
        }
        int m2892p = m2892p(c0825ae.f3466g) - c0825ae.f3466g;
        if (m2892p < 0) {
            min = c0825ae.f3465f;
        } else {
            min = Math.min(m2892p, c0825ae.f3461b) + c0825ae.f3465f;
        }
        m2860a(c0868bu, min);
    }

    /* renamed from: q */
    private void m2893q(View view) {
        for (int i = this.f3417i - 1; i >= 0; i--) {
            this.f3409a[i].m3253b(view);
        }
    }

    /* renamed from: r */
    private void m2896r(View view) {
        for (int i = this.f3417i - 1; i >= 0; i--) {
            this.f3409a[i].m3250a(view);
        }
    }

    /* renamed from: i */
    private void m2878i(int i, int i2) {
        for (int i3 = 0; i3 < this.f3417i; i3++) {
            if (!this.f3409a[i3].f3653a.isEmpty()) {
                m2863a(this.f3409a[i3], i, i2);
            }
        }
    }

    /* renamed from: m */
    private int m2886m(int i) {
        int m3248a = this.f3409a[0].m3248a(i);
        for (int i2 = 1; i2 < this.f3417i; i2++) {
            int m3248a2 = this.f3409a[i2].m3248a(i);
            if (m3248a2 > m3248a) {
                m3248a = m3248a2;
            }
        }
        return m3248a;
    }

    /* renamed from: n */
    private int m2887n(int i) {
        int m3248a = this.f3409a[0].m3248a(i);
        for (int i2 = 1; i2 < this.f3417i; i2++) {
            int m3248a2 = this.f3409a[i2].m3248a(i);
            if (m3248a2 < m3248a) {
                m3248a = m3248a2;
            }
        }
        return m3248a;
    }

    /* renamed from: l */
    private boolean m2885l() {
        int m3252b = this.f3409a[0].m3252b(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3417i; i++) {
            if (this.f3409a[i].m3252b(RecyclerView.UNDEFINED_DURATION) != m3252b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private boolean m2888n() {
        int m3248a = this.f3409a[0].m3248a(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3417i; i++) {
            if (this.f3409a[i].m3248a(RecyclerView.UNDEFINED_DURATION) != m3248a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private int m2890o(int i) {
        int m3252b = this.f3409a[0].m3252b(i);
        for (int i2 = 1; i2 < this.f3417i; i2++) {
            int m3252b2 = this.f3409a[i2].m3252b(i);
            if (m3252b2 > m3252b) {
                m3252b = m3252b2;
            }
        }
        return m3252b;
    }

    /* renamed from: p */
    private int m2892p(int i) {
        int m3252b = this.f3409a[0].m3252b(i);
        for (int i2 = 1; i2 < this.f3417i; i2++) {
            int m3252b2 = this.f3409a[i2].m3252b(i);
            if (m3252b2 < m3252b) {
                m3252b = m3252b2;
            }
        }
        return m3252b;
    }

    /* renamed from: a */
    private void m2860a(C0868bu c0868bu, int i) {
        while (m3121v() > 0) {
            View f = m3111f(0);
            if (this.f3410b.mo2971b(f) > i || this.f3410b.mo2974c(f) > i) {
                return;
            }
            C0889co c0889co = (C0889co) f.getLayoutParams();
            if (c0889co.f3652b) {
                for (int i2 = 0; i2 < this.f3417i; i2++) {
                    if (this.f3409a[i2].f3653a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3417i; i3++) {
                    this.f3409a[i3].m3258e();
                }
            } else if (c0889co.f3651a.f3653a.size() == 1) {
                return;
            } else {
                c0889co.f3651a.m3258e();
            }
            m3092a(f, c0868bu);
        }
    }

    /* renamed from: b */
    private void m2869b(C0868bu c0868bu, int i) {
        for (int v = m3121v() - 1; v >= 0; v--) {
            View f = m3111f(v);
            if (this.f3410b.mo2968a(f) < i || this.f3410b.mo2976d(f) < i) {
                return;
            }
            C0889co c0889co = (C0889co) f.getLayoutParams();
            if (c0889co.f3652b) {
                for (int i2 = 0; i2 < this.f3417i; i2++) {
                    if (this.f3409a[i2].f3653a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3417i; i3++) {
                    this.f3409a[i3].m3256d();
                }
            } else if (c0889co.f3651a.f3653a.size() == 1) {
                return;
            } else {
                c0889co.f3651a.m3256d();
            }
            m3092a(f, c0868bu);
        }
    }

    /* renamed from: q */
    private boolean m2894q(int i) {
        if (this.f3418j == 0) {
            return (i == -1) != this.f3413e;
        }
        return ((i == -1) == this.f3413e) == m2883k();
    }

    /* renamed from: a */
    private C0892cr m2854a(C0825ae c0825ae) {
        int i;
        int i2;
        int i3 = -1;
        if (m2894q(c0825ae.f3464e)) {
            i = this.f3417i - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f3417i;
            i2 = 1;
        }
        C0892cr c0892cr = null;
        if (c0825ae.f3464e == 1) {
            int i4 = Integer.MAX_VALUE;
            int mo2975d = this.f3410b.mo2975d();
            while (i != i3) {
                C0892cr c0892cr2 = this.f3409a[i];
                int m3252b = c0892cr2.m3252b(mo2975d);
                if (m3252b < i4) {
                    c0892cr = c0892cr2;
                    i4 = m3252b;
                }
                i += i2;
            }
            return c0892cr;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int mo2977e = this.f3410b.mo2977e();
        while (i != i3) {
            C0892cr c0892cr3 = this.f3409a[i];
            int m3248a = c0892cr3.m3248a(mo2977e);
            if (m3248a > i5) {
                c0892cr = c0892cr3;
                i5 = m3248a;
            }
            i += i2;
        }
        return c0892cr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: h */
    public final boolean mo2843h() {
        return this.f3418j == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: g */
    public final boolean mo2842g() {
        return this.f3418j == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final int mo2772a(int i, C0868bu c0868bu, C0876cb c0876cb) {
        return m2871c(i, c0868bu, c0876cb);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final int mo2787b(int i, C0868bu c0868bu, C0876cb c0876cb) {
        return m2871c(i, c0868bu, c0876cb);
    }

    /* renamed from: r */
    private int m2895r(int i) {
        if (m3121v() == 0) {
            return this.f3413e ? 1 : -1;
        }
        return (i < m2891p()) != this.f3413e ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0875ca
    /* renamed from: c */
    public final PointF mo2834c(int i) {
        int m2895r = m2895r(i);
        PointF pointF = new PointF();
        if (m2895r == 0) {
            return null;
        }
        if (this.f3418j == 0) {
            pointF.x = m2895r;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m2895r;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2828a(RecyclerView recyclerView, int i) {
        C0830aj c0830aj = new C0830aj(recyclerView.getContext());
        c0830aj.m3180c(i);
        m3096a(c0830aj);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: d */
    public final void mo2836d(int i) {
        if (this.f3401A != null && this.f3401A.f3431a != i) {
            SavedState savedState = this.f3401A;
            savedState.f3434d = null;
            savedState.f3433c = 0;
            savedState.f3431a = -1;
            savedState.f3432b = -1;
        }
        this.f3414f = i;
        this.f3415g = RecyclerView.UNDEFINED_DURATION;
        m3116q();
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2824a(int i, int i2, C0876cb c0876cb, InterfaceC0859bl interfaceC0859bl) {
        int m3252b;
        if (this.f3418j != 0) {
            i = i2;
        }
        if (m3121v() == 0 || i == 0) {
            return;
        }
        m2868b(i, c0876cb);
        if (this.f3407G == null || this.f3407G.length < this.f3417i) {
            this.f3407G = new int[this.f3417i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3417i; i4++) {
            if (this.f3420l.f3463d == -1) {
                m3252b = this.f3420l.f3465f - this.f3409a[i4].m3248a(this.f3420l.f3465f);
            } else {
                m3252b = this.f3409a[i4].m3252b(this.f3420l.f3466g) - this.f3420l.f3466g;
            }
            if (m3252b >= 0) {
                this.f3407G[i3] = m3252b;
                i3++;
            }
        }
        Arrays.sort(this.f3407G, 0, i3);
        for (int i5 = 0; i5 < i3 && this.f3420l.m2938a(c0876cb); i5++) {
            interfaceC0859bl.mo3131b(this.f3420l.f3462c, this.f3407G[i5]);
            this.f3420l.f3462c += this.f3420l.f3463d;
        }
    }

    /* renamed from: b */
    private void m2868b(int i, C0876cb c0876cb) {
        int i2;
        int m2891p;
        if (i > 0) {
            m2891p = m2889o();
            i2 = 1;
        } else {
            i2 = -1;
            m2891p = m2891p();
        }
        this.f3420l.f3460a = true;
        m2856a(m2891p, c0876cb);
        m2881j(i2);
        C0825ae c0825ae = this.f3420l;
        c0825ae.f3462c = m2891p + c0825ae.f3463d;
        this.f3420l.f3461b = Math.abs(i);
    }

    /* renamed from: c */
    private int m2871c(int i, C0868bu c0868bu, C0876cb c0876cb) {
        if (m3121v() == 0 || i == 0) {
            return 0;
        }
        m2868b(i, c0876cb);
        int m2853a = m2853a(c0868bu, this.f3420l, c0876cb);
        if (this.f3420l.f3461b >= m2853a) {
            i = i < 0 ? -m2853a : m2853a;
        }
        this.f3410b.mo2970a(-i);
        this.f3423o = this.f3413e;
        this.f3420l.f3461b = 0;
        m2861a(c0868bu, this.f3420l);
        return i;
    }

    /* renamed from: o */
    private int m2889o() {
        int v = m3121v();
        if (v == 0) {
            return 0;
        }
        return m3069e(m3111f(v - 1));
    }

    /* renamed from: p */
    private int m2891p() {
        if (m3121v() == 0) {
            return 0;
        }
        return m3069e(m3111f(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: b */
    public final C0861bn mo2789b() {
        if (this.f3418j == 0) {
            return new C0889co(-2, -1);
        }
        return new C0889co(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final C0861bn mo2776a(Context context, AttributeSet attributeSet) {
        return new C0889co(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final C0861bn mo2777a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0889co((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0889co(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final boolean mo2786a(C0861bn c0861bn) {
        return c0861bn instanceof C0889co;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0035, code lost:            if (m2883k() == false) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0042, code lost:            if (m2883k() == false) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0047, code lost:            if (r9.f3418j == 1) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004c, code lost:            if (r9.f3418j == 0) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0051, code lost:            if (r9.f3418j == 1) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0056, code lost:            if (r9.f3418j == 0) goto L154;     */
    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo2774a(android.view.View r10, int r11, androidx.recyclerview.widget.C0868bu r12, androidx.recyclerview.widget.C0876cb r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo2774a(android.view.View, int, androidx.recyclerview.widget.bu, androidx.recyclerview.widget.cb):android.view.View");
    }

    /* loaded from: classes.dex */
    public final class LazySpanLookup {

        /* renamed from: a */
        int[] f3425a;

        /* renamed from: b */
        List<FullSpanItem> f3426b;

        LazySpanLookup() {
        }

        /* renamed from: a */
        final int m2904a(int i) {
            if (this.f3426b != null) {
                for (int size = this.f3426b.size() - 1; size >= 0; size--) {
                    if (this.f3426b.get(size).f3427a >= i) {
                        this.f3426b.remove(size);
                    }
                }
            }
            return m2910b(i);
        }

        /* renamed from: b */
        final int m2910b(int i) {
            if (this.f3425a == null || i >= this.f3425a.length) {
                return -1;
            }
            int m2903g = m2903g(i);
            if (m2903g == -1) {
                int[] iArr = this.f3425a;
                Arrays.fill(iArr, i, iArr.length, -1);
                return this.f3425a.length;
            }
            int i2 = m2903g + 1;
            Arrays.fill(this.f3425a, i, i2, -1);
            return i2;
        }

        /* renamed from: c */
        final int m2912c(int i) {
            if (this.f3425a == null || i >= this.f3425a.length) {
                return -1;
            }
            return this.f3425a[i];
        }

        /* renamed from: a */
        final void m2908a(int i, C0892cr c0892cr) {
            m2902f(i);
            this.f3425a[i] = c0892cr.f3657e;
        }

        /* renamed from: e */
        private int m2901e(int i) {
            int length = this.f3425a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: f */
        private void m2902f(int i) {
            if (this.f3425a == null) {
                this.f3425a = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.f3425a, -1);
            } else if (i >= this.f3425a.length) {
                int[] iArr = this.f3425a;
                this.f3425a = new int[m2901e(i)];
                System.arraycopy(iArr, 0, this.f3425a, 0, iArr.length);
                Arrays.fill(this.f3425a, iArr.length, this.f3425a.length, -1);
            }
        }

        /* renamed from: a */
        final void m2906a() {
            if (this.f3425a != null) {
                Arrays.fill(this.f3425a, -1);
            }
            this.f3426b = null;
        }

        /* renamed from: a */
        final void m2907a(int i, int i2) {
            if (this.f3425a == null || i >= this.f3425a.length) {
                return;
            }
            int i3 = i + i2;
            m2902f(i3);
            int[] iArr = this.f3425a;
            int[] iArr2 = this.f3425a;
            System.arraycopy(iArr, i3, iArr2, i, (iArr2.length - i) - i2);
            Arrays.fill(this.f3425a, this.f3425a.length - i2, this.f3425a.length, -1);
            if (this.f3426b != null) {
                for (int size = this.f3426b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3426b.get(size);
                    if (fullSpanItem.f3427a >= i) {
                        if (fullSpanItem.f3427a < i3) {
                            this.f3426b.remove(size);
                        } else {
                            fullSpanItem.f3427a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        final void m2911b(int i, int i2) {
            if (this.f3425a == null || i >= this.f3425a.length) {
                return;
            }
            int i3 = i + i2;
            m2902f(i3);
            int[] iArr = this.f3425a;
            System.arraycopy(iArr, i, iArr, i3, (this.f3425a.length - i) - i2);
            Arrays.fill(this.f3425a, i, i3, -1);
            if (this.f3426b != null) {
                for (int size = this.f3426b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3426b.get(size);
                    if (fullSpanItem.f3427a >= i) {
                        fullSpanItem.f3427a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m2903g(int i) {
            if (this.f3426b == null) {
                return -1;
            }
            FullSpanItem m2913d = m2913d(i);
            if (m2913d != null) {
                this.f3426b.remove(m2913d);
            }
            int size = this.f3426b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.f3426b.get(i2).f3427a >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f3426b.get(i2);
            this.f3426b.remove(i2);
            return fullSpanItem.f3427a;
        }

        /* renamed from: a */
        public final void m2909a(FullSpanItem fullSpanItem) {
            if (this.f3426b == null) {
                this.f3426b = new ArrayList();
            }
            int size = this.f3426b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f3426b.get(i);
                if (fullSpanItem2.f3427a == fullSpanItem.f3427a) {
                    this.f3426b.remove(i);
                }
                if (fullSpanItem2.f3427a >= fullSpanItem.f3427a) {
                    this.f3426b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f3426b.add(fullSpanItem);
        }

        /* renamed from: d */
        public final FullSpanItem m2913d(int i) {
            if (this.f3426b == null) {
                return null;
            }
            for (int size = this.f3426b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3426b.get(size);
                if (fullSpanItem.f3427a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final FullSpanItem m2905a(int i, int i2, int i3) {
            if (this.f3426b == null) {
                return null;
            }
            int size = this.f3426b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f3426b.get(i4);
                if (fullSpanItem.f3427a >= i2) {
                    return null;
                }
                if (fullSpanItem.f3427a >= i && (i3 == 0 || fullSpanItem.f3428b == i3 || fullSpanItem.f3430d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0890cp();

            /* renamed from: a */
            int f3427a;

            /* renamed from: b */
            int f3428b;

            /* renamed from: c */
            int[] f3429c;

            /* renamed from: d */
            boolean f3430d;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public FullSpanItem(Parcel parcel) {
                this.f3427a = parcel.readInt();
                this.f3428b = parcel.readInt();
                this.f3430d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f3429c = new int[readInt];
                    parcel.readIntArray(this.f3429c);
                }
            }

            FullSpanItem() {
            }

            /* renamed from: a */
            public final int m2914a(int i) {
                if (this.f3429c == null) {
                    return 0;
                }
                return this.f3429c[i];
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3427a);
                parcel.writeInt(this.f3428b);
                parcel.writeInt(this.f3430d ? 1 : 0);
                if (this.f3429c != null && this.f3429c.length > 0) {
                    parcel.writeInt(this.f3429c.length);
                    parcel.writeIntArray(this.f3429c);
                } else {
                    parcel.writeInt(0);
                }
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3427a + ", mGapDir=" + this.f3428b + ", mHasUnwantedGapAfter=" + this.f3430d + ", mGapPerSpan=" + Arrays.toString(this.f3429c) + '}';
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0891cq();

        /* renamed from: a */
        int f3431a;

        /* renamed from: b */
        int f3432b;

        /* renamed from: c */
        int f3433c;

        /* renamed from: d */
        int[] f3434d;

        /* renamed from: e */
        int f3435e;

        /* renamed from: f */
        int[] f3436f;

        /* renamed from: g */
        List<LazySpanLookup.FullSpanItem> f3437g;

        /* renamed from: h */
        boolean f3438h;

        /* renamed from: i */
        boolean f3439i;

        /* renamed from: j */
        boolean f3440j;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f3431a = parcel.readInt();
            this.f3432b = parcel.readInt();
            this.f3433c = parcel.readInt();
            if (this.f3433c > 0) {
                this.f3434d = new int[this.f3433c];
                parcel.readIntArray(this.f3434d);
            }
            this.f3435e = parcel.readInt();
            if (this.f3435e > 0) {
                this.f3436f = new int[this.f3435e];
                parcel.readIntArray(this.f3436f);
            }
            this.f3438h = parcel.readInt() == 1;
            this.f3439i = parcel.readInt() == 1;
            this.f3440j = parcel.readInt() == 1;
            this.f3437g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3433c = savedState.f3433c;
            this.f3431a = savedState.f3431a;
            this.f3432b = savedState.f3432b;
            this.f3434d = savedState.f3434d;
            this.f3435e = savedState.f3435e;
            this.f3436f = savedState.f3436f;
            this.f3438h = savedState.f3438h;
            this.f3439i = savedState.f3439i;
            this.f3440j = savedState.f3440j;
            this.f3437g = savedState.f3437g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3431a);
            parcel.writeInt(this.f3432b);
            parcel.writeInt(this.f3433c);
            if (this.f3433c > 0) {
                parcel.writeIntArray(this.f3434d);
            }
            parcel.writeInt(this.f3435e);
            if (this.f3435e > 0) {
                parcel.writeIntArray(this.f3436f);
            }
            parcel.writeInt(this.f3438h ? 1 : 0);
            parcel.writeInt(this.f3439i ? 1 : 0);
            parcel.writeInt(this.f3440j ? 1 : 0);
            parcel.writeList(this.f3437g);
        }
    }

    /* renamed from: k */
    private boolean m2883k() {
        return C0538w.m1878h(this.f3535q) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x045b A[LOOP:0: B:2:0x0003->B:267:0x045b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e9  */
    @Override // androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2793c(androidx.recyclerview.widget.C0868bu r13, androidx.recyclerview.widget.C0876cb r14) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo2793c(androidx.recyclerview.widget.bu, androidx.recyclerview.widget.cb):void");
    }

    /* renamed from: a */
    private void m2863a(C0892cr c0892cr, int i, int i2) {
        int i3 = c0892cr.f3656d;
        if (i == -1) {
            if (c0892cr.m3247a() + i3 <= i2) {
                this.f3421m.set(c0892cr.f3657e, false);
            }
        } else if (c0892cr.m3251b() - i3 >= i2) {
            this.f3421m.set(c0892cr.f3657e, false);
        }
    }
}
