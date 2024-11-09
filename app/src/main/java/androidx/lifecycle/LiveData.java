package androidx.lifecycle;

import androidx.p002a.p003a.p004a.C0036a;
import androidx.p002a.p003a.p005b.C0043b;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: b */
    static final Object f3041b = new Object();

    /* renamed from: h */
    private boolean f3048h;

    /* renamed from: i */
    private boolean f3049i;

    /* renamed from: a */
    final Object f3042a = new Object();

    /* renamed from: e */
    private C0043b<InterfaceC0743w<? super T>, LiveData<T>.AbstractC0740t> f3045e = new C0043b<>();

    /* renamed from: c */
    int f3043c = 0;

    /* renamed from: f */
    private volatile Object f3046f = f3041b;

    /* renamed from: d */
    volatile Object f3044d = f3041b;

    /* renamed from: g */
    private int f3047g = -1;

    /* renamed from: j */
    private final Runnable f3050j = new RunnableC0739s(this);

    /* renamed from: b */
    protected void mo2588b() {
    }

    /* renamed from: c */
    protected void mo2589c() {
    }

    /* renamed from: b */
    private void m2582b(LiveData<T>.AbstractC0740t tVar) {
        if (tVar.f3091d) {
            if (!tVar.m2634a()) {
                tVar.m2633a(false);
            } else {
                if (tVar.f3092e >= this.f3047g) {
                    return;
                }
                tVar.f3092e = this.f3047g;
                tVar.f3090c.mo2637a((Object) this.f3046f);
            }
        }
    }

    /* renamed from: a */
    final void m2585a(LiveData<T>.AbstractC0740t tVar) {
        if (this.f3048h) {
            this.f3049i = true;
            return;
        }
        this.f3048h = true;
        do {
            this.f3049i = false;
            if (tVar != null) {
                m2582b(tVar);
                tVar = null;
            } else {
                C0043b<InterfaceC0743w<? super T>, LiveData<T>.AbstractC0740t>.f m23c = this.f3045e.m23c();
                while (m23c.hasNext()) {
                    m2582b((AbstractC0740t) ((Map.Entry) m23c.next()).getValue());
                    if (this.f3049i) {
                        break;
                    }
                }
            }
        } while (this.f3049i);
        this.f3048h = false;
    }

    /* renamed from: a */
    public final void m2584a(InterfaceC0733m interfaceC0733m, InterfaceC0743w<? super T> interfaceC0743w) {
        m2581a("observe");
        if (interfaceC0733m.mo31a().mo2608a() == EnumC0730j.DESTROYED) {
            return;
        }
        LiveData<T>.AbstractC0740t lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0733m, interfaceC0743w);
        AbstractC0740t mo16a = this.f3045e.mo16a(interfaceC0743w, lifecycleBoundObserver);
        if (mo16a != null && !mo16a.m2635a(interfaceC0733m)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo16a != null) {
            return;
        }
        interfaceC0733m.mo31a().mo2609a(lifecycleBoundObserver);
    }

    /* renamed from: a */
    public void mo2586a(InterfaceC0743w<? super T> interfaceC0743w) {
        m2581a("removeObserver");
        AbstractC0740t mo17b = this.f3045e.mo17b(interfaceC0743w);
        if (mo17b == null) {
            return;
        }
        mo17b.m2636b();
        mo17b.m2633a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2587a(T t) {
        m2581a("setValue");
        this.f3047g++;
        this.f3046f = t;
        m2585a((AbstractC0740t) null);
    }

    /* renamed from: a */
    public final T m2583a() {
        T t = (T) this.f3046f;
        if (t != f3041b) {
            return t;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m2590d() {
        return this.f3043c > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0740t implements InterfaceC0727g {

        /* renamed from: a */
        final InterfaceC0733m f3051a;

        LifecycleBoundObserver(InterfaceC0733m interfaceC0733m, InterfaceC0743w<? super T> interfaceC0743w) {
            super(interfaceC0743w);
            this.f3051a = interfaceC0733m;
        }

        /* renamed from: a */
        final boolean m2591a() {
            return this.f3051a.mo31a().mo2608a().m2611a(EnumC0730j.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC0731k
        /* renamed from: a */
        public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
            if (this.f3051a.mo31a().mo2608a() == EnumC0730j.DESTROYED) {
                LiveData.this.mo2586a((InterfaceC0743w) this.c);
            } else {
                a(m2591a());
            }
        }

        /* renamed from: a */
        final boolean m2592a(InterfaceC0733m interfaceC0733m) {
            return this.f3051a == interfaceC0733m;
        }

        /* renamed from: b */
        final void m2593b() {
            this.f3051a.mo31a().mo2610b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.t */
    /* loaded from: classes.dex */
    public abstract class AbstractC0740t {

        /* renamed from: c */
        final InterfaceC0743w<? super T> f3090c;

        /* renamed from: d */
        boolean f3091d;

        /* renamed from: e */
        int f3092e = -1;

        /* renamed from: a */
        abstract boolean m2634a();

        /* renamed from: a */
        boolean m2635a(InterfaceC0733m interfaceC0733m) {
            return false;
        }

        /* renamed from: b */
        void m2636b() {
        }

        AbstractC0740t(InterfaceC0743w<? super T> interfaceC0743w) {
            this.f3090c = interfaceC0743w;
        }

        /* renamed from: a */
        final void m2633a(boolean z) {
            if (z == this.f3091d) {
                return;
            }
            this.f3091d = z;
            boolean z2 = LiveData.this.f3043c == 0;
            LiveData.this.f3043c += this.f3091d ? 1 : -1;
            if (z2 && this.f3091d) {
                LiveData.this.mo2588b();
            }
            if (LiveData.this.f3043c == 0 && !this.f3091d) {
                LiveData.this.mo2589c();
            }
            if (this.f3091d) {
                LiveData.this.m2585a(this);
            }
        }
    }

    /* renamed from: a */
    private static void m2581a(String str) {
        if (C0036a.m10a().mo14c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }
}
