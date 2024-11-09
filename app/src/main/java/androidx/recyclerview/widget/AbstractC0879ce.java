package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.core.p024g.C0538w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.ce */
/* loaded from: classes.dex */
public abstract class AbstractC0879ce {

    /* renamed from: q */
    private static final List<Object> f3613q = Collections.emptyList();

    /* renamed from: a */
    public final View f3614a;

    /* renamed from: b */
    WeakReference<RecyclerView> f3615b;

    /* renamed from: j */
    int f3623j;

    /* renamed from: p */
    RecyclerView f3629p;

    /* renamed from: c */
    int f3616c = -1;

    /* renamed from: d */
    int f3617d = -1;

    /* renamed from: e */
    long f3618e = -1;

    /* renamed from: f */
    int f3619f = -1;

    /* renamed from: g */
    int f3620g = -1;

    /* renamed from: h */
    AbstractC0879ce f3621h = null;

    /* renamed from: i */
    AbstractC0879ce f3622i = null;

    /* renamed from: k */
    List<Object> f3624k = null;

    /* renamed from: l */
    List<Object> f3625l = null;

    /* renamed from: r */
    private int f3630r = 0;

    /* renamed from: m */
    C0868bu f3626m = null;

    /* renamed from: n */
    boolean f3627n = false;

    /* renamed from: s */
    private int f3631s = 0;

    /* renamed from: o */
    int f3628o = -1;

    public AbstractC0879ce(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3614a = view;
    }

    /* renamed from: a */
    public final void m3200a(int i, boolean z) {
        if (this.f3617d == -1) {
            this.f3617d = this.f3616c;
        }
        if (this.f3620g == -1) {
            this.f3620g = this.f3616c;
        }
        if (z) {
            this.f3620g += i;
        }
        this.f3616c += i;
        if (this.f3614a.getLayoutParams() != null) {
            ((C0861bn) this.f3614a.getLayoutParams()).f3552e = true;
        }
    }

    /* renamed from: a */
    public final void m3198a() {
        this.f3617d = -1;
        this.f3620g = -1;
    }

    /* renamed from: b */
    public final boolean m3208b() {
        return (this.f3623j & 128) != 0;
    }

    /* renamed from: c */
    public final int m3209c() {
        return this.f3620g == -1 ? this.f3616c : this.f3620g;
    }

    /* renamed from: d */
    public final int m3210d() {
        if (this.f3629p == null) {
            return -1;
        }
        return this.f3629p.getAdapterPositionFor(this);
    }

    /* renamed from: e */
    public final long m3211e() {
        return this.f3618e;
    }

    /* renamed from: f */
    public final boolean m3212f() {
        return this.f3626m != null;
    }

    /* renamed from: g */
    public final void m3213g() {
        this.f3626m.m3167b(this);
    }

    /* renamed from: h */
    public final boolean m3214h() {
        return (this.f3623j & 32) != 0;
    }

    /* renamed from: i */
    public final void m3215i() {
        this.f3623j &= -33;
    }

    /* renamed from: j */
    public final void m3216j() {
        this.f3623j &= -257;
    }

    /* renamed from: a */
    public final void m3202a(C0868bu c0868bu, boolean z) {
        this.f3626m = c0868bu;
        this.f3627n = z;
    }

    /* renamed from: k */
    public final boolean m3217k() {
        return (this.f3623j & 4) != 0;
    }

    /* renamed from: l */
    public final boolean m3218l() {
        return (this.f3623j & 2) != 0;
    }

    /* renamed from: m */
    public final boolean m3219m() {
        return (this.f3623j & 1) != 0;
    }

    /* renamed from: n */
    public final boolean m3220n() {
        return (this.f3623j & 8) != 0;
    }

    /* renamed from: a */
    public final boolean m3205a(int i) {
        return (this.f3623j & i) != 0;
    }

    /* renamed from: o */
    public final boolean m3221o() {
        return (this.f3623j & 256) != 0;
    }

    /* renamed from: p */
    public final boolean m3222p() {
        return (this.f3614a.getParent() == null || this.f3614a.getParent() == this.f3629p) ? false : true;
    }

    /* renamed from: a */
    public final void m3199a(int i, int i2) {
        this.f3623j = (i & i2) | (this.f3623j & (~i2));
    }

    /* renamed from: b */
    public final void m3206b(int i) {
        this.f3623j = i | this.f3623j;
    }

    /* renamed from: a */
    public final void m3203a(Object obj) {
        if (obj == null) {
            m3206b(1024);
        } else if ((1024 & this.f3623j) == 0) {
            if (this.f3624k == null) {
                this.f3624k = new ArrayList();
                this.f3625l = Collections.unmodifiableList(this.f3624k);
            }
            this.f3624k.add(obj);
        }
    }

    /* renamed from: q */
    public final void m3223q() {
        if (this.f3624k != null) {
            this.f3624k.clear();
        }
        this.f3623j &= -1025;
    }

    /* renamed from: r */
    public final List<Object> m3224r() {
        if ((this.f3623j & 1024) == 0) {
            if (this.f3624k == null || this.f3624k.size() == 0) {
                return f3613q;
            }
            return this.f3625l;
        }
        return f3613q;
    }

    /* renamed from: s */
    public final void m3225s() {
        this.f3623j = 0;
        this.f3616c = -1;
        this.f3617d = -1;
        this.f3618e = -1L;
        this.f3620g = -1;
        this.f3630r = 0;
        this.f3621h = null;
        this.f3622i = null;
        m3223q();
        this.f3631s = 0;
        this.f3628o = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    /* renamed from: a */
    public final void m3201a(RecyclerView recyclerView) {
        if (this.f3628o != -1) {
            this.f3631s = this.f3628o;
        } else {
            this.f3631s = C0538w.m1876g(this.f3614a);
        }
        recyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }

    /* renamed from: b */
    public final void m3207b(RecyclerView recyclerView) {
        recyclerView.setChildImportantForAccessibilityInternal(this, this.f3631s);
        this.f3631s = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3616c + " id=" + this.f3618e + ", oldPos=" + this.f3617d + ", pLpos:" + this.f3620g);
        if (m3212f()) {
            sb.append(" scrap ");
            sb.append(this.f3627n ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m3217k()) {
            sb.append(" invalid");
        }
        if (!m3219m()) {
            sb.append(" unbound");
        }
        if (m3218l()) {
            sb.append(" update");
        }
        if (m3220n()) {
            sb.append(" removed");
        }
        if (m3208b()) {
            sb.append(" ignored");
        }
        if (m3221o()) {
            sb.append(" tmpDetached");
        }
        if (!m3226t()) {
            sb.append(" not recyclable(" + this.f3630r + ")");
        }
        if ((this.f3623j & 512) != 0 || m3217k()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3614a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m3204a(boolean z) {
        this.f3630r = z ? this.f3630r - 1 : this.f3630r + 1;
        if (this.f3630r < 0) {
            this.f3630r = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(String.valueOf(this)));
        } else if (!z && this.f3630r == 1) {
            this.f3623j |= 16;
        } else if (z && this.f3630r == 0) {
            this.f3623j &= -17;
        }
    }

    /* renamed from: t */
    public final boolean m3226t() {
        return (this.f3623j & 16) == 0 && !C0538w.m1873e(this.f3614a);
    }

    /* renamed from: u */
    public final boolean m3227u() {
        return (this.f3623j & 16) == 0 && C0538w.m1873e(this.f3614a);
    }

    /* renamed from: v */
    public final boolean m3228v() {
        return (this.f3623j & 2) != 0;
    }
}
