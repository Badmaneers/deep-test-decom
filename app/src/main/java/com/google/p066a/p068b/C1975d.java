package com.google.p066a.p068b;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: $Gson$Types.java */
/* renamed from: com.google.a.b.d */
/* loaded from: classes.dex */
public final class C1975d implements Serializable, ParameterizedType {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f8822a;

    /* renamed from: b */
    private final Type f8823b;

    /* renamed from: c */
    private final Type[] f8824c;

    public C1975d(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            C1905a.m6062a(type != null || cls.getEnclosingClass() == null);
            if (type != null && cls.getEnclosingClass() == null) {
                z = false;
            }
            C1905a.m6062a(z);
        }
        this.f8822a = type == null ? null : C1973b.m6120a(type);
        this.f8823b = C1973b.m6120a(type2);
        this.f8824c = (Type[]) typeArr.clone();
        for (int i = 0; i < this.f8824c.length; i++) {
            C1905a.m6061a(this.f8824c[i]);
            Type type3 = this.f8824c[i];
            C1905a.m6062a(((r1 instanceof Class) && ((Class) r1).isPrimitive()) ? false : true);
            Type[] typeArr2 = this.f8824c;
            typeArr2[i] = C1973b.m6120a(typeArr2[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f8824c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f8823b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f8822a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C1973b.m6125a(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        return C1973b.m6116a((Object) this.f8822a) ^ (Arrays.hashCode(this.f8824c) ^ this.f8823b.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f8824c.length + 1) * 30);
        sb.append(C1973b.m6129c(this.f8823b));
        if (this.f8824c.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(C1973b.m6129c(this.f8824c[0]));
        for (int i = 1; i < this.f8824c.length; i++) {
            sb.append(", ");
            sb.append(C1973b.m6129c(this.f8824c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
