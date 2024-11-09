package p000a.p001a;

/* compiled from: Timber.java */
/* renamed from: a.a.b */
/* loaded from: classes.dex */
final class C0001b extends AbstractC0003d {
    @Override // p000a.p001a.AbstractC0003d
    /* renamed from: a */
    public final void mo5a(String str, Object... objArr) {
        for (AbstractC0003d abstractC0003d : C0000a.f0a) {
            abstractC0003d.mo5a(str, objArr);
        }
    }

    @Override // p000a.p001a.AbstractC0003d
    /* renamed from: a */
    public final void mo6a(Throwable th) {
        for (AbstractC0003d abstractC0003d : C0000a.f0a) {
            abstractC0003d.mo6a(th);
        }
    }

    @Override // p000a.p001a.AbstractC0003d
    /* renamed from: a */
    protected final void mo4a(int i, String str, String str2) {
        throw new AssertionError("Missing override for log method.");
    }
}
