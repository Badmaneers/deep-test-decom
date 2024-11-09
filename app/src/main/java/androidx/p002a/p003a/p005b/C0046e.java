package androidx.p002a.p003a.p005b;

import java.util.Map;

/* compiled from: SafeIterableMap.java */
/* renamed from: androidx.a.a.b.e */
/* loaded from: classes.dex */
final class C0046e<K, V> implements Map.Entry<K, V> {

    /* renamed from: a */
    final K f24a;

    /* renamed from: b */
    final V f25b;

    /* renamed from: c */
    C0046e<K, V> f26c;

    /* renamed from: d */
    C0046e<K, V> f27d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0046e(K k, V v) {
        this.f24a = k;
        this.f25b = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f24a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f25b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f24a + "=" + this.f25b;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0046e)) {
            return false;
        }
        C0046e c0046e = (C0046e) obj;
        return this.f24a.equals(c0046e.f24a) && this.f25b.equals(c0046e.f25b);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f25b.hashCode() ^ this.f24a.hashCode();
    }
}
