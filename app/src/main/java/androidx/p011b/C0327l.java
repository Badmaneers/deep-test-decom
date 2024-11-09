package androidx.p011b;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: MapCollections.java */
/* renamed from: androidx.b.l */
/* loaded from: classes.dex */
final class C0327l<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

    /* renamed from: a */
    int f1498a;

    /* renamed from: d */
    final /* synthetic */ AbstractC0325h f1501d;

    /* renamed from: c */
    boolean f1500c = false;

    /* renamed from: b */
    int f1499b = -1;

    public C0327l(AbstractC0325h abstractC0325h) {
        this.f1501d = abstractC0325h;
        this.f1498a = abstractC0325h.mo1008a() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1499b < this.f1498a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1500c) {
            throw new IllegalStateException();
        }
        this.f1501d.mo1012a(this.f1499b);
        this.f1499b--;
        this.f1498a--;
        this.f1500c = false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        if (!this.f1500c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return (K) this.f1501d.mo1010a(this.f1499b, 0);
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        if (!this.f1500c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return (V) this.f1501d.mo1010a(this.f1499b, 1);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (!this.f1500c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return (V) this.f1501d.mo1011a(this.f1499b, (int) v);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1500c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C0322e.m1027a(entry.getKey(), this.f1501d.mo1010a(this.f1499b, 0)) && C0322e.m1027a(entry.getValue(), this.f1501d.mo1010a(this.f1499b, 1));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1500c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object mo1010a = this.f1501d.mo1010a(this.f1499b, 0);
        Object mo1010a2 = this.f1501d.mo1010a(this.f1499b, 1);
        return (mo1010a == null ? 0 : mo1010a.hashCode()) ^ (mo1010a2 != null ? mo1010a2.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1499b++;
        this.f1500c = true;
        return this;
    }
}
