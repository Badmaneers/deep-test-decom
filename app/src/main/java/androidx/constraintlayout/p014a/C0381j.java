package androidx.constraintlayout.p014a;

/* compiled from: Pools.java */
/* renamed from: androidx.constraintlayout.a.j */
/* loaded from: classes.dex */
final class C0381j<T> implements InterfaceC0380i<T> {

    /* renamed from: a */
    private final Object[] f1841a = new Object[256];

    /* renamed from: b */
    private int f1842b;

    @Override // androidx.constraintlayout.p014a.InterfaceC0380i
    /* renamed from: a */
    public final T mo1346a() {
        if (this.f1842b <= 0) {
            return null;
        }
        int i = this.f1842b - 1;
        T t = (T) this.f1841a[i];
        this.f1841a[i] = null;
        this.f1842b--;
        return t;
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0380i
    /* renamed from: a */
    public final boolean mo1348a(T t) {
        if (this.f1842b >= this.f1841a.length) {
            return false;
        }
        this.f1841a[this.f1842b] = t;
        this.f1842b++;
        return true;
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0380i
    /* renamed from: a */
    public final void mo1347a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            if (this.f1842b < this.f1841a.length) {
                this.f1841a[this.f1842b] = t;
                this.f1842b++;
            }
        }
    }
}
