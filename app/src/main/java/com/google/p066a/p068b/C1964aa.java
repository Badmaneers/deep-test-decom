package com.google.p066a.p068b;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringMap.java */
/* renamed from: com.google.a.b.aa */
/* loaded from: classes.dex */
public final class C1964aa<V> implements Map.Entry<String, V> {

    /* renamed from: a */
    final String f8804a;

    /* renamed from: b */
    V f8805b;

    /* renamed from: c */
    final int f8806c;

    /* renamed from: d */
    C1964aa<V> f8807d;

    /* renamed from: e */
    C1964aa<V> f8808e;

    /* renamed from: f */
    C1964aa<V> f8809f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1964aa() {
        this(null, null, 0, null, null, null);
        this.f8809f = this;
        this.f8808e = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1964aa(String str, V v, int i, C1964aa<V> c1964aa, C1964aa<V> c1964aa2, C1964aa<V> c1964aa3) {
        this.f8804a = str;
        this.f8805b = v;
        this.f8806c = i;
        this.f8807d = c1964aa;
        this.f8808e = c1964aa2;
        this.f8809f = c1964aa3;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f8805b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.f8805b;
        this.f8805b = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object value = entry.getValue();
        if (this.f8804a.equals(entry.getKey())) {
            if (this.f8805b == null) {
                if (value == null) {
                    return true;
                }
            } else if (this.f8805b.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.f8804a == null ? 0 : this.f8804a.hashCode()) ^ (this.f8805b != null ? this.f8805b.hashCode() : 0);
    }

    public final String toString() {
        return this.f8804a + "=" + this.f8805b;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getKey() {
        return this.f8804a;
    }
}
