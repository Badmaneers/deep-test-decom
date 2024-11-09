package androidx.dynamicanimation.p031a;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* compiled from: SpringAnimation.java */
/* renamed from: androidx.dynamicanimation.a.ab */
/* loaded from: classes.dex */
public final class C0610ab extends AbstractC0619i<C0610ab> {

    /* renamed from: w */
    private C0611ac f2646w;

    /* renamed from: x */
    private float f2647x;

    /* renamed from: y */
    private boolean f2648y;

    public <K> C0610ab(K k, AbstractC0609aa<K> abstractC0609aa) {
        super(k, abstractC0609aa);
        this.f2646w = null;
        this.f2647x = Float.MAX_VALUE;
        this.f2648y = false;
    }

    public <K> C0610ab(K k, AbstractC0609aa<K> abstractC0609aa, byte b) {
        super(k, abstractC0609aa);
        this.f2646w = null;
        this.f2647x = Float.MAX_VALUE;
        this.f2648y = false;
        this.f2646w = new C0611ac(0.0f);
    }

    /* renamed from: d */
    public final C0611ac m2187d() {
        return this.f2646w;
    }

    /* renamed from: a */
    public final C0610ab m2184a(C0611ac c0611ac) {
        this.f2646w = c0611ac;
        return this;
    }

    @Override // androidx.dynamicanimation.p031a.AbstractC0619i
    /* renamed from: b */
    final boolean mo2186b(long j) {
        if (this.f2648y) {
            if (this.f2647x != Float.MAX_VALUE) {
                this.f2646w.m2196c(this.f2647x);
                this.f2647x = Float.MAX_VALUE;
            }
            this.f2683p = this.f2646w.m2190a();
            this.f2682o = 0.0f;
            this.f2648y = false;
            return true;
        }
        if (this.f2647x != Float.MAX_VALUE) {
            long j2 = j / 2;
            C0634x m2192a = this.f2646w.m2192a(this.f2683p, this.f2682o, j2);
            this.f2646w.m2196c(this.f2647x);
            this.f2647x = Float.MAX_VALUE;
            C0634x m2192a2 = this.f2646w.m2192a(m2192a.f2694a, m2192a.f2695b, j2);
            this.f2683p = m2192a2.f2694a;
            this.f2682o = m2192a2.f2695b;
        } else {
            C0634x m2192a3 = this.f2646w.m2192a(this.f2683p, this.f2682o, j);
            this.f2683p = m2192a3.f2694a;
            this.f2682o = m2192a3.f2695b;
        }
        this.f2683p = Math.max(this.f2683p, this.f2689v);
        this.f2683p = Math.min(this.f2683p, this.f2688u);
        if (!this.f2646w.m2194a(this.f2683p, this.f2682o)) {
            return false;
        }
        this.f2683p = this.f2646w.m2190a();
        this.f2682o = 0.0f;
        return true;
    }

    @Override // androidx.dynamicanimation.p031a.AbstractC0619i
    /* renamed from: b */
    public final void mo2185b() {
        if (this.f2646w == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double m2190a = this.f2646w.m2190a();
        if (m2190a > this.f2688u) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (m2190a >= this.f2689v) {
            this.f2646w.m2193a(m2204c());
            super.mo2185b();
            return;
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }

    /* renamed from: e */
    public final void m2188e() {
        if (this.f2687t) {
            this.f2647x = 0.0f;
            return;
        }
        if (this.f2646w == null) {
            this.f2646w = new C0611ac(0.0f);
        }
        this.f2646w.m2196c(0.0f);
        mo2185b();
    }

    /* renamed from: f */
    public final void m2189f() {
        if (!(this.f2646w.f2650b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f2687t) {
            this.f2648y = true;
        }
    }
}
