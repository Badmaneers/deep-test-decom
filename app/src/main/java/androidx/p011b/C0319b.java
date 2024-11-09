package androidx.p011b;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArrayMap.java */
/* renamed from: androidx.b.b */
/* loaded from: classes.dex */
public final class C0319b<K, V> extends AbstractC0325h<K, V> {

    /* renamed from: a */
    final /* synthetic */ C0318a f1461a;

    public C0319b(C0318a c0318a) {
        this.f1461a = c0318a;
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final int mo1008a() {
        return this.f1461a.f1509h;
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final Object mo1010a(int i, int i2) {
        return this.f1461a.f1508g[(i << 1) + i2];
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    protected final int mo1009a(Object obj) {
        return this.f1461a.m1057a(obj);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: b */
    protected final int mo1014b(Object obj) {
        return this.f1461a.m1060b(obj);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: b */
    protected final Map<K, V> mo1015b() {
        return this.f1461a;
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    protected final void mo1013a(K k, V v) {
        this.f1461a.put(k, v);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final V mo1011a(int i, V v) {
        return this.f1461a.m1058a(i, (int) v);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: a */
    public final void mo1012a(int i) {
        this.f1461a.m1063d(i);
    }

    @Override // androidx.p011b.AbstractC0325h
    /* renamed from: c */
    protected final void mo1016c() {
        this.f1461a.clear();
    }
}
