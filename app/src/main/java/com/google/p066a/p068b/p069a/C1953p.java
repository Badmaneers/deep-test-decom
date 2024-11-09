package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.InterfaceC2014i;
import com.google.p066a.p067a.InterfaceC1894b;
import com.google.p066a.p068b.C1973b;
import com.google.p066a.p068b.C1977f;
import com.google.p066a.p068b.C1986o;
import com.google.p066a.p068b.C1991t;
import com.google.p066a.p070c.C1999a;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.p */
/* loaded from: classes.dex */
public final class C1953p implements InterfaceC1903ag {

    /* renamed from: a */
    private final C1977f f8738a;

    /* renamed from: b */
    private final InterfaceC2014i f8739b;

    /* renamed from: c */
    private final C1986o f8740c;

    public C1953p(C1977f c1977f, InterfaceC2014i interfaceC2014i, C1986o c1986o) {
        this.f8738a = c1977f;
        this.f8739b = interfaceC2014i;
        this.f8740c = c1986o;
    }

    /* renamed from: a */
    private boolean m6106a(Field field, boolean z) {
        return (this.f8740c.m6145a(field.getType(), z) || this.f8740c.m6146a(field, z)) ? false : true;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Class<? super T> m6165a = c1999a.m6165a();
        if (Object.class.isAssignableFrom(m6165a)) {
            return new C1955r(this, this.f8738a.m6136a(c1999a), m6105a(c2015j, c1999a, m6165a), (byte) 0);
        }
        return null;
    }

    /* renamed from: a */
    private Map<String, AbstractC1956s> m6105a(C2015j c2015j, C1999a<?> c1999a, Class<?> cls) {
        int i;
        boolean z;
        C1953p c1953p = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type m6166b = c1999a.m6166b();
        C1999a<?> c1999a2 = c1999a;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean m6106a = c1953p.m6106a(field, true);
                boolean m6106a2 = c1953p.m6106a(field, z2);
                if (m6106a || m6106a2) {
                    field.setAccessible(true);
                    Type m6123a = C1973b.m6123a(c1999a2.m6166b(), cls2, field.getGenericType());
                    InterfaceC1894b interfaceC1894b = (InterfaceC1894b) field.getAnnotation(InterfaceC1894b.class);
                    String mo6167a = interfaceC1894b == null ? c1953p.f8739b.mo6167a(field) : interfaceC1894b.m6054a();
                    C1999a<?> m6164a = C1999a.m6164a(m6123a);
                    boolean m6151a = C1991t.m6151a((Type) m6164a.m6165a());
                    i = i2;
                    z = z2;
                    C1954q c1954q = new C1954q(this, mo6167a, m6106a, m6106a2, c2015j, m6164a, field, m6151a);
                    AbstractC1956s abstractC1956s = (AbstractC1956s) linkedHashMap.put(c1954q.f8750g, c1954q);
                    if (abstractC1956s != null) {
                        throw new IllegalArgumentException(m6166b + " declares multiple JSON fields named " + abstractC1956s.f8750g);
                    }
                } else {
                    i = i2;
                    z = z2;
                }
                i2 = i + 1;
                z2 = z;
                c1953p = this;
            }
            c1999a2 = C1999a.m6164a(C1973b.m6123a(c1999a2.m6166b(), cls2, cls2.getGenericSuperclass()));
            cls2 = c1999a2.m6165a();
            c1953p = this;
        }
        return linkedHashMap;
    }
}
