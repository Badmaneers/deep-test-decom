package com.google.p066a.p068b;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: $Gson$Types.java */
/* renamed from: com.google.a.b.c */
/* loaded from: classes.dex */
public final class C1974c implements Serializable, GenericArrayType {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f8821a;

    public C1974c(Type type) {
        this.f8821a = C1973b.m6120a(type);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f8821a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C1973b.m6125a(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.f8821a.hashCode();
    }

    public final String toString() {
        return C1973b.m6129c(this.f8821a) + "[]";
    }
}
