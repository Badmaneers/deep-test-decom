package androidx.lifecycle;

/* compiled from: ViewModelProvider.java */
/* renamed from: androidx.lifecycle.ab */
/* loaded from: classes.dex */
public final class C0717ab {

    /* renamed from: a */
    private final InterfaceC0718ac f3061a;

    /* renamed from: b */
    private final C0720ae f3062b;

    public C0717ab(C0720ae c0720ae, InterfaceC0718ac interfaceC0718ac) {
        this.f3061a = interfaceC0718ac;
        this.f3062b = c0720ae;
    }

    /* renamed from: a */
    public final <T extends AbstractC0716aa> T m2600a(Class<T> cls) {
        T t;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName));
        T t2 = (T) this.f3062b.m2602a(concat);
        if (cls.isInstance(t2)) {
            return t2;
        }
        if (this.f3061a instanceof AbstractC0719ad) {
            t = (T) ((AbstractC0719ad) this.f3061a).m2601b();
        } else {
            t = (T) this.f3061a.mo2371a();
        }
        this.f3062b.m2604a(concat, t);
        return t;
    }
}
