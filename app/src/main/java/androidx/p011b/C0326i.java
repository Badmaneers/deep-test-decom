package androidx.p011b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MapCollections.java */
/* renamed from: androidx.b.i */
/* loaded from: classes.dex */
final class C0326i<T> implements Iterator<T> {

    /* renamed from: a */
    final int f1491a;

    /* renamed from: b */
    int f1492b;

    /* renamed from: c */
    int f1493c;

    /* renamed from: d */
    boolean f1494d = false;

    /* renamed from: e */
    final /* synthetic */ AbstractC0325h f1495e;

    public C0326i(AbstractC0325h abstractC0325h, int i) {
        this.f1495e = abstractC0325h;
        this.f1491a = i;
        this.f1492b = abstractC0325h.mo1008a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1493c < this.f1492b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T t = (T) this.f1495e.mo1010a(this.f1493c, this.f1491a);
        this.f1493c++;
        this.f1494d = true;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1494d) {
            throw new IllegalStateException();
        }
        this.f1493c--;
        this.f1492b--;
        this.f1494d = false;
        this.f1495e.mo1012a(this.f1493c);
    }
}
