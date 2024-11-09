package androidx.core.p023f;

/* compiled from: Pools.java */
/* renamed from: androidx.core.f.h */
/* loaded from: classes.dex */
public final class C0477h<T> extends C0476g<T> {

    /* renamed from: a */
    private final Object f2277a;

    public C0477h(int i) {
        super(i);
        this.f2277a = new Object();
    }

    @Override // androidx.core.p023f.C0476g, androidx.core.p023f.InterfaceC0475f
    /* renamed from: a */
    public final T mo1617a() {
        T t;
        synchronized (this.f2277a) {
            t = (T) super.mo1617a();
        }
        return t;
    }

    @Override // androidx.core.p023f.C0476g, androidx.core.p023f.InterfaceC0475f
    /* renamed from: a */
    public final boolean mo1618a(T t) {
        boolean mo1618a;
        synchronized (this.f2277a) {
            mo1618a = super.mo1618a(t);
        }
        return mo1618a;
    }
}
