package androidx.core.p023f;

/* compiled from: Pools.java */
/* renamed from: androidx.core.f.g */
/* loaded from: classes.dex */
public class C0476g<T> implements InterfaceC0475f<T> {

    /* renamed from: a */
    private final Object[] f2275a;

    /* renamed from: b */
    private int f2276b;

    public C0476g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2275a = new Object[i];
    }

    @Override // androidx.core.p023f.InterfaceC0475f
    /* renamed from: a */
    public T mo1617a() {
        if (this.f2276b <= 0) {
            return null;
        }
        int i = this.f2276b - 1;
        T t = (T) this.f2275a[i];
        this.f2275a[i] = null;
        this.f2276b--;
        return t;
    }

    @Override // androidx.core.p023f.InterfaceC0475f
    /* renamed from: a */
    public boolean mo1618a(T t) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f2276b) {
                z = false;
                break;
            }
            if (this.f2275a[i] == t) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        if (this.f2276b >= this.f2275a.length) {
            return false;
        }
        this.f2275a[this.f2276b] = t;
        this.f2276b++;
        return true;
    }
}
