package androidx.lifecycle;

import androidx.p002a.p003a.p005b.C0042a;
import androidx.p002a.p003a.p005b.C0043b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public final class C0734n extends AbstractC0728h {

    /* renamed from: d */
    private final WeakReference<InterfaceC0733m> f3078d;

    /* renamed from: b */
    private C0042a<InterfaceC0732l, C0736p> f3076b = new C0042a<>();

    /* renamed from: e */
    private int f3079e = 0;

    /* renamed from: f */
    private boolean f3080f = false;

    /* renamed from: g */
    private boolean f3081g = false;

    /* renamed from: h */
    private ArrayList<EnumC0730j> f3082h = new ArrayList<>();

    /* renamed from: c */
    private EnumC0730j f3077c = EnumC0730j.INITIALIZED;

    public C0734n(InterfaceC0733m interfaceC0733m) {
        this.f3078d = new WeakReference<>(interfaceC0733m);
    }

    /* renamed from: a */
    public final void m2624a(EnumC0730j enumC0730j) {
        m2615b(enumC0730j);
    }

    /* renamed from: a */
    public final void m2623a(EnumC0729i enumC0729i) {
        m2615b(m2614b(enumC0729i));
    }

    /* renamed from: b */
    private void m2615b(EnumC0730j enumC0730j) {
        if (this.f3077c == enumC0730j) {
            return;
        }
        this.f3077c = enumC0730j;
        if (this.f3080f || this.f3079e != 0) {
            this.f3081g = true;
            return;
        }
        this.f3080f = true;
        m2622d();
        this.f3080f = false;
    }

    /* renamed from: b */
    private boolean m2617b() {
        if (this.f3076b.m20a() == 0) {
            return true;
        }
        EnumC0730j enumC0730j = this.f3076b.m24d().getValue().f3085a;
        EnumC0730j enumC0730j2 = this.f3076b.m25e().getValue().f3085a;
        return enumC0730j == enumC0730j2 && this.f3077c == enumC0730j2;
    }

    /* renamed from: c */
    private EnumC0730j m2618c(InterfaceC0732l interfaceC0732l) {
        Map.Entry<InterfaceC0732l, C0736p> m19d = this.f3076b.m19d(interfaceC0732l);
        return m2612a(m2612a(this.f3077c, m19d != null ? m19d.getValue().f3085a : null), this.f3082h.isEmpty() ? null : this.f3082h.get(this.f3082h.size() - 1));
    }

    @Override // androidx.lifecycle.AbstractC0728h
    /* renamed from: a */
    public final void mo2609a(InterfaceC0732l interfaceC0732l) {
        InterfaceC0733m interfaceC0733m;
        C0736p c0736p = new C0736p(interfaceC0732l, this.f3077c == EnumC0730j.DESTROYED ? EnumC0730j.DESTROYED : EnumC0730j.INITIALIZED);
        if (this.f3076b.mo16a(interfaceC0732l, c0736p) == null && (interfaceC0733m = this.f3078d.get()) != null) {
            boolean z = this.f3079e != 0 || this.f3080f;
            EnumC0730j m2618c = m2618c(interfaceC0732l);
            this.f3079e++;
            while (c0736p.f3085a.compareTo(m2618c) < 0 && this.f3076b.m18c(interfaceC0732l)) {
                m2620c(c0736p.f3085a);
                c0736p.m2625a(interfaceC0733m, m2621d(c0736p.f3085a));
                m2619c();
                m2618c = m2618c(interfaceC0732l);
            }
            if (!z) {
                m2622d();
            }
            this.f3079e--;
        }
    }

    /* renamed from: c */
    private void m2619c() {
        this.f3082h.remove(this.f3082h.size() - 1);
    }

    /* renamed from: c */
    private void m2620c(EnumC0730j enumC0730j) {
        this.f3082h.add(enumC0730j);
    }

    @Override // androidx.lifecycle.AbstractC0728h
    /* renamed from: b */
    public final void mo2610b(InterfaceC0732l interfaceC0732l) {
        this.f3076b.mo17b(interfaceC0732l);
    }

    @Override // androidx.lifecycle.AbstractC0728h
    /* renamed from: a */
    public final EnumC0730j mo2608a() {
        return this.f3077c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static EnumC0730j m2614b(EnumC0729i enumC0729i) {
        switch (enumC0729i) {
            case ON_CREATE:
            case ON_STOP:
                return EnumC0730j.CREATED;
            case ON_START:
            case ON_PAUSE:
                return EnumC0730j.STARTED;
            case ON_RESUME:
                return EnumC0730j.RESUMED;
            case ON_DESTROY:
                return EnumC0730j.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(enumC0729i)));
        }
    }

    /* renamed from: d */
    private static EnumC0729i m2621d(EnumC0730j enumC0730j) {
        switch (enumC0730j) {
            case INITIALIZED:
            case DESTROYED:
                return EnumC0729i.ON_CREATE;
            case CREATED:
                return EnumC0729i.ON_START;
            case STARTED:
                return EnumC0729i.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(enumC0730j)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m2613a(InterfaceC0733m interfaceC0733m) {
        C0043b<InterfaceC0732l, C0736p>.f c = this.f3076b.m23c();
        while (c.hasNext() && !this.f3081g) {
            Map.Entry entry = (Map.Entry) c.next();
            C0736p c0736p = (C0736p) entry.getValue();
            while (c0736p.f3085a.compareTo(this.f3077c) < 0 && !this.f3081g && this.f3076b.m18c(entry.getKey())) {
                m2620c(c0736p.f3085a);
                c0736p.m2625a(interfaceC0733m, m2621d(c0736p.f3085a));
                m2619c();
            }
        }
    }

    /* renamed from: b */
    private void m2616b(InterfaceC0733m interfaceC0733m) {
        EnumC0729i enumC0729i;
        Iterator<Map.Entry<InterfaceC0732l, C0736p>> b = this.f3076b.m22b();
        while (b.hasNext() && !this.f3081g) {
            Map.Entry<InterfaceC0732l, C0736p> next = b.next();
            C0736p value = next.getValue();
            while (value.f3085a.compareTo(this.f3077c) > 0 && !this.f3081g && this.f3076b.m18c(next.getKey())) {
                EnumC0730j enumC0730j = value.f3085a;
                switch (enumC0730j) {
                    case INITIALIZED:
                        throw new IllegalArgumentException();
                    case CREATED:
                        enumC0729i = EnumC0729i.ON_DESTROY;
                        break;
                    case STARTED:
                        enumC0729i = EnumC0729i.ON_STOP;
                        break;
                    case RESUMED:
                        enumC0729i = EnumC0729i.ON_PAUSE;
                        break;
                    case DESTROYED:
                        throw new IllegalArgumentException();
                    default:
                        throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(enumC0730j)));
                }
                m2620c(m2614b(enumC0729i));
                value.m2625a(interfaceC0733m, enumC0729i);
                m2619c();
            }
        }
    }

    /* renamed from: d */
    private void m2622d() {
        InterfaceC0733m interfaceC0733m = this.f3078d.get();
        if (interfaceC0733m == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!m2617b()) {
            this.f3081g = false;
            if (this.f3077c.compareTo(this.f3076b.m24d().getValue().f3085a) < 0) {
                m2616b(interfaceC0733m);
            }
            Map.Entry<InterfaceC0732l, C0736p> e = this.f3076b.m25e();
            if (!this.f3081g && e != null && this.f3077c.compareTo(e.getValue().f3085a) > 0) {
                m2613a(interfaceC0733m);
            }
        }
        this.f3081g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC0730j m2612a(EnumC0730j enumC0730j, EnumC0730j enumC0730j2) {
        return (enumC0730j2 == null || enumC0730j2.compareTo(enumC0730j) >= 0) ? enumC0730j : enumC0730j2;
    }
}
