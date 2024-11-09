package com.google.p066a.p068b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringMap.java */
/* renamed from: com.google.a.b.ab */
/* loaded from: classes.dex */
public abstract class AbstractC1965ab<T> implements Iterator<T> {

    /* renamed from: b */
    C1964aa<V> f8810b;

    /* renamed from: c */
    C1964aa<V> f8811c;

    /* renamed from: d */
    final /* synthetic */ C1993v f8812d;

    private AbstractC1965ab(C1993v c1993v) {
        C1964aa c1964aa;
        this.f8812d = c1993v;
        c1964aa = this.f8812d.f8861a;
        this.f8810b = c1964aa.f8808e;
        this.f8811c = null;
    }

    public /* synthetic */ AbstractC1965ab(C1993v c1993v, byte b) {
        this(c1993v);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C1964aa c1964aa;
        C1964aa c1964aa2 = this.f8810b;
        c1964aa = this.f8812d.f8861a;
        return c1964aa2 != c1964aa;
    }

    /* renamed from: a */
    final C1964aa<V> m6113a() {
        C1964aa c1964aa;
        C1964aa c1964aa2 = this.f8810b;
        c1964aa = this.f8812d.f8861a;
        if (c1964aa2 == c1964aa) {
            throw new NoSuchElementException();
        }
        this.f8810b = c1964aa2.f8808e;
        this.f8811c = c1964aa2;
        return c1964aa2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f8811c == null) {
            throw new IllegalStateException();
        }
        this.f8812d.remove(this.f8811c.f8804a);
        this.f8811c = null;
    }
}
