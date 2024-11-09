package androidx.p002a.p003a.p005b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* renamed from: androidx.a.a.b.b */
/* loaded from: classes.dex */
public class C0043b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    C0046e<K, V> f20a;

    /* renamed from: b */
    private C0046e<K, V> f21b;

    /* renamed from: c */
    private WeakHashMap<InterfaceC0048h<K, V>, Boolean> f22c = new WeakHashMap<>();

    /* renamed from: d */
    private int f23d = 0;

    /* renamed from: a */
    protected C0046e<K, V> mo15a(K k) {
        C0046e<K, V> c0046e = this.f20a;
        while (c0046e != null && !c0046e.f24a.equals(k)) {
            c0046e = c0046e.f26c;
        }
        return c0046e;
    }

    /* renamed from: a */
    public V mo16a(K k, V v) {
        C0046e<K, V> mo15a = mo15a(k);
        if (mo15a != null) {
            return mo15a.f25b;
        }
        m21b(k, v);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C0046e<K, V> m21b(K k, V v) {
        C0046e<K, V> c0046e = new C0046e<>(k, v);
        this.f23d++;
        if (this.f21b == null) {
            this.f20a = c0046e;
            this.f21b = this.f20a;
            return c0046e;
        }
        this.f21b.f26c = c0046e;
        c0046e.f27d = this.f21b;
        this.f21b = c0046e;
        return c0046e;
    }

    /* renamed from: b */
    public V mo17b(K k) {
        C0046e<K, V> mo15a = mo15a(k);
        if (mo15a == null) {
            return null;
        }
        this.f23d--;
        if (!this.f22c.isEmpty()) {
            Iterator<InterfaceC0048h<K, V>> it = this.f22c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo28a_(mo15a);
            }
        }
        if (mo15a.f27d != null) {
            mo15a.f27d.f26c = mo15a.f26c;
        } else {
            this.f20a = mo15a.f26c;
        }
        if (mo15a.f26c != null) {
            mo15a.f26c.f27d = mo15a.f27d;
        } else {
            this.f21b = mo15a.f27d;
        }
        mo15a.f26c = null;
        mo15a.f27d = null;
        return mo15a.f25b;
    }

    /* renamed from: a */
    public final int m20a() {
        return this.f23d;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0044c c0044c = new C0044c(this.f20a, this.f21b);
        this.f22c.put(c0044c, Boolean.FALSE);
        return c0044c;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry<K, V>> m22b() {
        C0045d c0045d = new C0045d(this.f21b, this.f20a);
        this.f22c.put(c0045d, Boolean.FALSE);
        return c0045d;
    }

    /* renamed from: c */
    public final C0043b<K, V>.f m23c() {
        f fVar = new f();
        this.f22c.put(fVar, Boolean.FALSE);
        return fVar;
    }

    /* renamed from: d */
    public final Map.Entry<K, V> m24d() {
        return this.f20a;
    }

    /* renamed from: e */
    public final Map.Entry<K, V> m25e() {
        return this.f21b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0043b)) {
            return false;
        }
        C0043b c0043b = (C0043b) obj;
        if (this.f23d != c0043b.f23d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0043b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: androidx.a.a.b.f */
    /* loaded from: classes.dex */
    final class f implements InterfaceC0048h<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private C0046e<K, V> f29b;

        /* renamed from: c */
        private boolean f30c = true;

        f() {
        }

        @Override // androidx.p002a.p003a.p005b.InterfaceC0048h
        /* renamed from: a_ */
        public final void mo28a_(C0046e<K, V> c0046e) {
            if (c0046e == this.f29b) {
                this.f29b = this.f29b.f27d;
                this.f30c = this.f29b == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f30c ? C0043b.this.f20a != null : (this.f29b == null || this.f29b.f26c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            C0046e<K, V> c0046e;
            if (this.f30c) {
                this.f30c = false;
                c0046e = C0043b.this.f20a;
            } else {
                c0046e = this.f29b != null ? this.f29b.f26c : null;
            }
            this.f29b = c0046e;
            return this.f29b;
        }
    }
}
