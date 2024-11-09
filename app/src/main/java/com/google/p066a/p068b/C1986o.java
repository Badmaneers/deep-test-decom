package com.google.p066a.p068b;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1904b;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1892a;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p067a.InterfaceC1893a;
import com.google.p066a.p067a.InterfaceC1895c;
import com.google.p066a.p067a.InterfaceC1896d;
import com.google.p066a.p070c.C1999a;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Excluder.java */
/* renamed from: com.google.a.b.o */
/* loaded from: classes.dex */
public final class C1986o implements InterfaceC1903ag, Cloneable {

    /* renamed from: a */
    public static final C1986o f8842a = new C1986o();

    /* renamed from: e */
    private boolean f8846e;

    /* renamed from: b */
    private double f8843b = -1.0d;

    /* renamed from: c */
    private int f8844c = 136;

    /* renamed from: d */
    private boolean f8845d = true;

    /* renamed from: f */
    private List<InterfaceC1892a> f8847f = Collections.emptyList();

    /* renamed from: g */
    private List<InterfaceC1892a> f8848g = Collections.emptyList();

    /* renamed from: a */
    public C1986o clone() {
        try {
            return (C1986o) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Class<? super T> m6165a = c1999a.m6165a();
        boolean m6145a = m6145a((Class<?>) m6165a, true);
        boolean m6145a2 = m6145a((Class<?>) m6165a, false);
        if (m6145a || m6145a2) {
            return new C1987p(this, m6145a2, m6145a, c2015j, c1999a);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m6146a(Field field, boolean z) {
        InterfaceC1893a interfaceC1893a;
        if ((this.f8844c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f8843b != -1.0d && !m6140a((InterfaceC1895c) field.getAnnotation(InterfaceC1895c.class), (InterfaceC1896d) field.getAnnotation(InterfaceC1896d.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f8846e && ((interfaceC1893a = (InterfaceC1893a) field.getAnnotation(InterfaceC1893a.class)) == null || (!z ? interfaceC1893a.m6053b() : interfaceC1893a.m6052a()))) {
            return true;
        }
        if ((!this.f8845d && m6143b(field.getType())) || m6142a(field.getType())) {
            return true;
        }
        List<InterfaceC1892a> list = z ? this.f8847f : this.f8848g;
        if (list.isEmpty()) {
            return false;
        }
        new C1904b(field);
        Iterator<InterfaceC1892a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m6050a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m6145a(Class<?> cls, boolean z) {
        if (this.f8843b != -1.0d && !m6140a((InterfaceC1895c) cls.getAnnotation(InterfaceC1895c.class), (InterfaceC1896d) cls.getAnnotation(InterfaceC1896d.class))) {
            return true;
        }
        if ((!this.f8845d && m6143b(cls)) || m6142a(cls)) {
            return true;
        }
        Iterator<InterfaceC1892a> it = (z ? this.f8847f : this.f8848g).iterator();
        while (it.hasNext()) {
            if (it.next().m6051b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m6142a(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    /* renamed from: b */
    private static boolean m6143b(Class<?> cls) {
        return cls.isMemberClass() && !m6144c(cls);
    }

    /* renamed from: c */
    private static boolean m6144c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    private boolean m6140a(InterfaceC1895c interfaceC1895c, InterfaceC1896d interfaceC1896d) {
        return m6139a(interfaceC1895c) && m6141a(interfaceC1896d);
    }

    /* renamed from: a */
    private boolean m6139a(InterfaceC1895c interfaceC1895c) {
        return interfaceC1895c == null || interfaceC1895c.m6055a() <= this.f8843b;
    }

    /* renamed from: a */
    private boolean m6141a(InterfaceC1896d interfaceC1896d) {
        return interfaceC1896d == null || interfaceC1896d.m6056a() > this.f8843b;
    }
}
