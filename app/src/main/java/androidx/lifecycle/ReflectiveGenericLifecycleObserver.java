package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0731k {

    /* renamed from: a */
    private final Object f3053a;

    /* renamed from: b */
    private final C0722b f3054b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3053a = obj;
        this.f3054b = C0715a.f3056a.m2598b(this.f3053a.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0731k
    /* renamed from: a */
    public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
        this.f3054b.m2606a(interfaceC0733m, enumC0729i, this.f3053a);
    }
}
