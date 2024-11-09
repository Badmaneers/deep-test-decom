package com.google.p066a.p068b;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringMap.java */
/* renamed from: com.google.a.b.y */
/* loaded from: classes.dex */
public final class C1996y extends AbstractSet<String> {

    /* renamed from: a */
    final /* synthetic */ C1993v f8870a;

    private C1996y(C1993v c1993v) {
        this.f8870a = c1993v;
    }

    public /* synthetic */ C1996y(C1993v c1993v, byte b) {
        this(c1993v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<String> iterator() {
        return new C1997z(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i;
        i = this.f8870a.f8863d;
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8870a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        i = this.f8870a.f8863d;
        this.f8870a.remove(obj);
        i2 = this.f8870a.f8863d;
        return i2 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8870a.clear();
    }
}
