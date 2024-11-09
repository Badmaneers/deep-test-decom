package com.google.p066a.p068b;

import java.lang.reflect.Type;

/* compiled from: ConstructorConstructor.java */
/* renamed from: com.google.a.b.n */
/* loaded from: classes.dex */
public final class C1985n<T> implements InterfaceC1990s<T> {

    /* renamed from: a */
    final /* synthetic */ Class f8838a;

    /* renamed from: b */
    final /* synthetic */ Type f8839b;

    /* renamed from: c */
    final /* synthetic */ C1977f f8840c;

    /* renamed from: d */
    private final AbstractC1968ae f8841d = AbstractC1968ae.m6114a();

    public C1985n(C1977f c1977f, Class cls, Type type) {
        this.f8840c = c1977f;
        this.f8838a = cls;
        this.f8839b = type;
    }

    @Override // com.google.p066a.p068b.InterfaceC1990s
    /* renamed from: a */
    public final T mo6137a() {
        try {
            return (T) this.f8841d.mo6115a(this.f8838a);
        } catch (Exception e) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.f8839b + ". Register an InstanceCreator with Gson for this type may fix this problem.", e);
        }
    }
}
