package androidx.fragment.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.ag */
/* loaded from: classes.dex */
public final class C0663ag implements InterfaceC0698j {

    /* renamed from: a */
    final boolean f2838a;

    /* renamed from: b */
    final C0656a f2839b;

    /* renamed from: c */
    private int f2840c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0663ag(C0656a c0656a, boolean z) {
        this.f2838a = z;
        this.f2839b = c0656a;
    }

    @Override // androidx.fragment.app.InterfaceC0698j
    /* renamed from: a */
    public final void mo2356a() {
        this.f2840c--;
        if (this.f2840c != 0) {
            return;
        }
        this.f2839b.f2821a.m2564i();
    }

    @Override // androidx.fragment.app.InterfaceC0698j
    /* renamed from: b */
    public final void mo2357b() {
        this.f2840c++;
    }

    /* renamed from: c */
    public final boolean m2358c() {
        return this.f2840c == 0;
    }

    /* renamed from: d */
    public final void m2359d() {
        boolean z = this.f2840c > 0;
        LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f2839b.f2821a;
        int size = layoutInflaterFactory2C0707s.f2999f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = layoutInflaterFactory2C0707s.f2999f.get(i);
            fragment.m2282a((InterfaceC0698j) null);
            if (z && fragment.m2288ab()) {
                fragment.m2254H();
            }
        }
        this.f2839b.f2821a.m2544a(this.f2839b, this.f2838a, !z, true);
    }

    /* renamed from: e */
    public final void m2360e() {
        this.f2839b.f2821a.m2544a(this.f2839b, this.f2838a, false, false);
    }
}
