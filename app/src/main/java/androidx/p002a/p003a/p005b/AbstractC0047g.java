package androidx.p002a.p003a.p005b;

import java.util.Iterator;
import java.util.Map;

/* compiled from: SafeIterableMap.java */
/* renamed from: androidx.a.a.b.g */
/* loaded from: classes.dex */
abstract class AbstractC0047g<K, V> implements InterfaceC0048h<K, V>, Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    C0046e<K, V> f31a;

    /* renamed from: b */
    C0046e<K, V> f32b;

    /* renamed from: a */
    abstract C0046e<K, V> mo26a(C0046e<K, V> c0046e);

    /* renamed from: b */
    abstract C0046e<K, V> mo27b(C0046e<K, V> c0046e);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0047g(C0046e<K, V> c0046e, C0046e<K, V> c0046e2) {
        this.f31a = c0046e2;
        this.f32b = c0046e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32b != null;
    }

    @Override // androidx.p002a.p003a.p005b.InterfaceC0048h
    /* renamed from: a_ */
    public final void mo28a_(C0046e<K, V> c0046e) {
        if (this.f31a == c0046e && c0046e == this.f32b) {
            this.f32b = null;
            this.f31a = null;
        }
        if (this.f31a == c0046e) {
            this.f31a = mo27b(this.f31a);
        }
        if (this.f32b == c0046e) {
            this.f32b = m29a();
        }
    }

    /* renamed from: a */
    private C0046e<K, V> m29a() {
        if (this.f32b == this.f31a || this.f31a == null) {
            return null;
        }
        return mo26a(this.f32b);
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        C0046e<K, V> c0046e = this.f32b;
        this.f32b = m29a();
        return c0046e;
    }
}
