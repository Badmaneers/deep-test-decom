package androidx.lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements InterfaceC0731k {

    /* renamed from: a */
    private final InterfaceC0724d f3038a;

    /* renamed from: b */
    private final InterfaceC0731k f3039b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(InterfaceC0724d interfaceC0724d, InterfaceC0731k interfaceC0731k) {
        this.f3038a = interfaceC0724d;
        this.f3039b = interfaceC0731k;
    }

    @Override // androidx.lifecycle.InterfaceC0731k
    /* renamed from: a */
    public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
        switch (enumC0729i) {
            case ON_CREATE:
            case ON_START:
            case ON_RESUME:
            case ON_PAUSE:
            case ON_STOP:
            case ON_DESTROY:
            default:
                if (this.f3039b != null) {
                    this.f3039b.mo35a(interfaceC0733m, enumC0729i);
                    return;
                }
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
    }
}
