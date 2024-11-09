package com.google.p066a.p068b;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: $Gson$Types.java */
/* renamed from: com.google.a.b.e */
/* loaded from: classes.dex */
public final class C1976e implements Serializable, WildcardType {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f8825a;

    /* renamed from: b */
    private final Type f8826b;

    public C1976e(Type[] typeArr, Type[] typeArr2) {
        C1905a.m6062a(typeArr2.length <= 1);
        C1905a.m6062a(typeArr.length == 1);
        if (typeArr2.length == 1) {
            C1905a.m6061a(typeArr2[0]);
            Type type = typeArr2[0];
            C1905a.m6062a(((r1 instanceof Class) && ((Class) r1).isPrimitive()) ? false : true);
            C1905a.m6062a(typeArr[0] == Object.class);
            this.f8826b = C1973b.m6120a(typeArr2[0]);
            this.f8825a = Object.class;
            return;
        }
        C1905a.m6061a(typeArr[0]);
        Type type2 = typeArr[0];
        C1905a.m6062a(((r1 instanceof Class) && ((Class) r1).isPrimitive()) ? false : true);
        this.f8826b = null;
        this.f8825a = C1973b.m6120a(typeArr[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f8825a};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        return this.f8826b != null ? new Type[]{this.f8826b} : C1973b.f8820a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C1973b.m6125a(this, (WildcardType) obj);
    }

    public final int hashCode() {
        return (this.f8825a.hashCode() + 31) ^ (this.f8826b != null ? this.f8826b.hashCode() + 31 : 1);
    }

    public final String toString() {
        if (this.f8826b != null) {
            return "? super " + C1973b.m6129c(this.f8826b);
        }
        if (this.f8825a == Object.class) {
            return "?";
        }
        return "? extends " + C1973b.m6129c(this.f8825a);
    }
}
