package androidx.p011b;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: ArraySet.java */
/* renamed from: androidx.b.d */
/* loaded from: classes.dex */
public final class C0321d<E> extends AbstractC0325h<E, E> {

    /* renamed from: a */
    final /* synthetic */ C0320c f1472a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0321d(C0320c c0320c) {
        this.f1472a = c0320c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final int mo1008a() {
        return this.f1472a.f1469b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final Object mo1010a(int i, int i2) {
        return this.f1472a.f1468a[i];
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    protected final int mo1009a(Object obj) {
        return this.f1472a.m1021a(obj);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: b */
    protected final int mo1014b(Object obj) {
        return this.f1472a.m1021a(obj);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: b */
    protected final Map<E, E> mo1015b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    protected final void mo1013a(E e, E e2) {
        this.f1472a.add(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final E mo1011a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final void mo1012a(int i) {
        this.f1472a.m1023b(i);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: c */
    protected final void mo1016c() {
        this.f1472a.clear();
    }
}
