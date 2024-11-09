package com.google.p066a.p070c;

import com.google.p066a.p068b.C1905a;
import com.google.p066a.p068b.C1973b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken.java */
/* renamed from: com.google.a.c.a */
/* loaded from: classes.dex */
public final class C1999a<T> {

    /* renamed from: a */
    final Class<? super T> f8878a;

    /* renamed from: b */
    final Type f8879b;

    /* renamed from: c */
    final int f8880c;

    protected C1999a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.f8879b = C1973b.m6120a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f8878a = (Class<? super T>) C1973b.m6126b(this.f8879b);
            this.f8880c = this.f8879b.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private C1999a(Type type) {
        this.f8879b = C1973b.m6120a((Type) C1905a.m6061a(type));
        this.f8878a = (Class<? super T>) C1973b.m6126b(this.f8879b);
        this.f8880c = this.f8879b.hashCode();
    }

    /* renamed from: a */
    public final Class<? super T> m6165a() {
        return this.f8878a;
    }

    /* renamed from: b */
    public final Type m6166b() {
        return this.f8879b;
    }

    public final int hashCode() {
        return this.f8880c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1999a) && C1973b.m6125a(this.f8879b, ((C1999a) obj).f8879b);
    }

    public final String toString() {
        return C1973b.m6129c(this.f8879b);
    }

    /* renamed from: a */
    public static C1999a<?> m6164a(Type type) {
        return new C1999a<>(type);
    }

    /* renamed from: a */
    public static <T> C1999a<T> m6163a(Class<T> cls) {
        return new C1999a<>(cls);
    }
}
