package androidx.p011b;

import androidx.p011b.AbstractC0325h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* renamed from: androidx.b.a */
/* loaded from: classes.dex */
public final class C0318a<K, V> extends C0328n<K, V> implements Map<K, V> {

    /* renamed from: a */
    AbstractC0325h<K, V> f1460a;

    public C0318a() {
    }

    public C0318a(C0328n c0328n) {
        super(c0328n);
    }

    /* renamed from: a */
    private AbstractC0325h<K, V> m1006a() {
        if (this.f1460a == null) {
            this.f1460a = new C0319b(this);
        }
        return this.f1460a;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m1059a(this.f1509h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final boolean m1007a(Collection<?> collection) {
        return AbstractC0325h.m1047a((Map) this, collection);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        AbstractC0325h<K, V> m1006a = m1006a();
        if (m1006a.f1488b == null) {
            m1006a.f1488b = new AbstractC0325h.j();
        }
        return m1006a.f1488b;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return m1006a().m1051d();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        AbstractC0325h<K, V> m1006a = m1006a();
        if (m1006a.f1490d == null) {
            m1006a.f1490d = new AbstractC0325h.m();
        }
        return m1006a.f1490d;
    }
}
