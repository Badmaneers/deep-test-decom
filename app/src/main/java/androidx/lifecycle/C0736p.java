package androidx.lifecycle;

/* compiled from: LifecycleRegistry.java */
/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public final class C0736p {

    /* renamed from: a */
    EnumC0730j f3085a;

    /* renamed from: b */
    InterfaceC0731k f3086b;

    public C0736p(InterfaceC0732l interfaceC0732l, EnumC0730j enumC0730j) {
        this.f3086b = C0738r.m2628a(interfaceC0732l);
        this.f3085a = enumC0730j;
    }

    /* renamed from: a */
    public final void m2625a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
        EnumC0730j m2614b = C0734n.m2614b(enumC0729i);
        this.f3085a = C0734n.m2612a(this.f3085a, m2614b);
        this.f3086b.mo35a(interfaceC0733m, enumC0729i);
        this.f3085a = m2614b;
    }
}
