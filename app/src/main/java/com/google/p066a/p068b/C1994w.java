package com.google.p066a.p068b;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: StringMap.java */
/* renamed from: com.google.a.b.w */
/* loaded from: classes.dex */
public final class C1994w<V> extends AbstractSet<Map.Entry<String, V>> {

    /* renamed from: a */
    final /* synthetic */ C1993v f8868a;

    private C1994w(C1993v c1993v) {
        this.f8868a = c1993v;
    }

    public /* synthetic */ C1994w(C1993v c1993v, byte b) {
        this(c1993v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<String, V>> iterator() {
        return new C1995x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f8868a.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C1993v.m6156a(this.f8868a, entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i;
        i = this.f8868a.f8863d;
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8868a.clear();
    }
}
