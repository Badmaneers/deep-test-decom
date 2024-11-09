package com.google.p066a.p068b;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringMap.java */
/* renamed from: com.google.a.b.ac */
/* loaded from: classes.dex */
public final class C1966ac<V> extends AbstractCollection<V> {

    /* renamed from: a */
    final /* synthetic */ C1993v f8813a;

    private C1966ac(C1993v c1993v) {
        this.f8813a = c1993v;
    }

    public /* synthetic */ C1966ac(C1993v c1993v, byte b) {
        this(c1993v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new C1967ad(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i;
        i = this.f8813a.f8863d;
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8813a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f8813a.clear();
    }
}
