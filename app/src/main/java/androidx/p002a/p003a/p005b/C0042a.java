package androidx.p002a.p003a.p005b;

import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
/* renamed from: androidx.a.a.b.a */
/* loaded from: classes.dex */
public final class C0042a<K, V> extends C0043b<K, V> {

    /* renamed from: b */
    private HashMap<K, C0046e<K, V>> f19b = new HashMap<>();

    @Override // androidx.p002a.p003a.p005b.C0043b
    /* renamed from: a */
    protected final C0046e<K, V> mo15a(K k) {
        return this.f19b.get(k);
    }

    @Override // androidx.p002a.p003a.p005b.C0043b
    /* renamed from: a */
    public final V mo16a(K k, V v) {
        C0046e<K, V> mo15a = mo15a(k);
        if (mo15a != null) {
            return mo15a.f25b;
        }
        this.f19b.put(k, m21b(k, v));
        return null;
    }

    @Override // androidx.p002a.p003a.p005b.C0043b
    /* renamed from: b */
    public final V mo17b(K k) {
        V v = (V) super.mo17b(k);
        this.f19b.remove(k);
        return v;
    }

    /* renamed from: c */
    public final boolean m18c(K k) {
        return this.f19b.containsKey(k);
    }

    /* renamed from: d */
    public final Map.Entry<K, V> m19d(K k) {
        if (m18c(k)) {
            return this.f19b.get(k).f27d;
        }
        return null;
    }
}
