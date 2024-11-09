package com.google.p066a;

import com.google.p066a.p068b.C1905a;
import com.google.p066a.p068b.C1989r;
import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* renamed from: com.google.a.z */
/* loaded from: classes.dex */
public final class C2031z extends AbstractC2026u {

    /* renamed from: a */
    private static final Class<?>[] f8951a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f8952b;

    public C2031z(Boolean bool) {
        m6234a(bool);
    }

    public C2031z(Number number) {
        m6234a(number);
    }

    public C2031z(String str) {
        m6234a(str);
    }

    /* renamed from: a */
    private void m6234a(Object obj) {
        if (obj instanceof Character) {
            this.f8952b = String.valueOf(((Character) obj).charValue());
        } else {
            C1905a.m6062a((obj instanceof Number) || m6236b(obj));
            this.f8952b = obj;
        }
    }

    /* renamed from: h */
    public final boolean m6237h() {
        return this.f8952b instanceof Boolean;
    }

    /* renamed from: i */
    public final boolean m6238i() {
        return this.f8952b instanceof Number;
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: a */
    public final Number mo6224a() {
        return this.f8952b instanceof String ? new C1989r((String) this.f8952b) : (Number) this.f8952b;
    }

    /* renamed from: j */
    public final boolean m6239j() {
        return this.f8952b instanceof String;
    }

    /* renamed from: b */
    private static boolean m6236b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f8951a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8952b == null) {
            return 31;
        }
        if (m6235a(this)) {
            long longValue = mo6224a().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        }
        if (this.f8952b instanceof Number) {
            long doubleToLongBits = Double.doubleToLongBits(mo6224a().doubleValue());
            return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
        }
        return this.f8952b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2031z c2031z = (C2031z) obj;
        if (this.f8952b == null) {
            return c2031z.f8952b == null;
        }
        if (m6235a(this) && m6235a(c2031z)) {
            return mo6224a().longValue() == c2031z.mo6224a().longValue();
        }
        if ((this.f8952b instanceof Number) && (c2031z.f8952b instanceof Number)) {
            double doubleValue = mo6224a().doubleValue();
            double doubleValue2 = c2031z.mo6224a().doubleValue();
            return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
        }
        return this.f8952b.equals(c2031z.f8952b);
    }

    /* renamed from: a */
    private static boolean m6235a(C2031z c2031z) {
        if (!(c2031z.f8952b instanceof Number)) {
            return false;
        }
        Number number = (Number) c2031z.f8952b;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: f */
    public final boolean mo6230f() {
        if (this.f8952b instanceof Boolean) {
            return ((Boolean) this.f8952b).booleanValue();
        }
        return Boolean.parseBoolean(mo6226b());
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: b */
    public final String mo6226b() {
        if (this.f8952b instanceof Number) {
            return mo6224a().toString();
        }
        if (this.f8952b instanceof Boolean) {
            return ((Boolean) this.f8952b).toString();
        }
        return (String) this.f8952b;
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: c */
    public final double mo6227c() {
        return this.f8952b instanceof Number ? mo6224a().doubleValue() : Double.parseDouble(mo6226b());
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: d */
    public final long mo6228d() {
        return this.f8952b instanceof Number ? mo6224a().longValue() : Long.parseLong(mo6226b());
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: e */
    public final int mo6229e() {
        return this.f8952b instanceof Number ? mo6224a().intValue() : Integer.parseInt(mo6226b());
    }
}
