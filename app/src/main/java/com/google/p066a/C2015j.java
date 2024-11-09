package com.google.p066a;

import com.google.p066a.p068b.C1977f;
import com.google.p066a.p068b.C1986o;
import com.google.p066a.p068b.C1991t;
import com.google.p066a.p068b.C1992u;
import com.google.p066a.p068b.p069a.C1906a;
import com.google.p066a.p068b.p069a.C1940c;
import com.google.p066a.p068b.p069a.C1942e;
import com.google.p066a.p068b.p069a.C1948k;
import com.google.p066a.p068b.p069a.C1950m;
import com.google.p066a.p068b.p069a.C1953p;
import com.google.p066a.p068b.p069a.C1957t;
import com.google.p066a.p068b.p069a.C1959v;
import com.google.p066a.p068b.p069a.C1962y;
import com.google.p066a.p070c.C1999a;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.C2008h;
import com.google.p066a.p071d.EnumC2005e;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Gson.java */
/* renamed from: com.google.a.j */
/* loaded from: classes.dex */
public final class C2015j {

    /* renamed from: a */
    final InterfaceC2025t f8931a;

    /* renamed from: b */
    final InterfaceC1897aa f8932b;

    /* renamed from: c */
    private final ThreadLocal<Map<C1999a<?>, C2022q<?>>> f8933c;

    /* renamed from: d */
    private final Map<C1999a<?>, AbstractC1902af<?>> f8934d;

    /* renamed from: e */
    private final List<InterfaceC1903ag> f8935e;

    /* renamed from: f */
    private final C1977f f8936f;

    /* renamed from: g */
    private final boolean f8937g;

    /* renamed from: h */
    private final boolean f8938h;

    /* renamed from: i */
    private final boolean f8939i;

    /* renamed from: j */
    private final boolean f8940j;

    public C2015j() {
        this(C1986o.f8842a, EnumC1998c.f8872a, Collections.emptyMap(), EnumC1899ac.f8691a, Collections.emptyList());
    }

    private C2015j(C1986o c1986o, InterfaceC2014i interfaceC2014i, Map<Type, InterfaceC2023r<?>> map, EnumC1899ac enumC1899ac, List<InterfaceC1903ag> list) {
        AbstractC1902af c2021p;
        this.f8933c = new C2016k(this);
        this.f8934d = Collections.synchronizedMap(new HashMap());
        this.f8931a = new C2017l(this);
        this.f8932b = new C2018m(this);
        this.f8936f = new C1977f(map);
        this.f8937g = false;
        this.f8939i = false;
        this.f8938h = true;
        this.f8940j = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1962y.f8776Q);
        arrayList.add(C1950m.f8735a);
        arrayList.addAll(list);
        arrayList.add(C1962y.f8801x);
        arrayList.add(C1962y.f8790m);
        arrayList.add(C1962y.f8784g);
        arrayList.add(C1962y.f8786i);
        arrayList.add(C1962y.f8788k);
        Class cls = Long.TYPE;
        if (enumC1899ac == EnumC1899ac.f8691a) {
            c2021p = C1962y.f8791n;
        } else {
            c2021p = new C2021p(this);
        }
        arrayList.add(C1962y.m6112a(cls, Long.class, c2021p));
        arrayList.add(C1962y.m6112a(Double.TYPE, Double.class, new C2019n(this)));
        arrayList.add(C1962y.m6112a(Float.TYPE, Float.class, new C2020o(this)));
        arrayList.add(C1962y.f8795r);
        arrayList.add(C1962y.f8797t);
        arrayList.add(C1962y.f8803z);
        arrayList.add(C1962y.f8761B);
        arrayList.add(C1962y.m6111a(BigDecimal.class, C1962y.f8799v));
        arrayList.add(C1962y.m6111a(BigInteger.class, C1962y.f8800w));
        arrayList.add(C1962y.f8763D);
        arrayList.add(C1962y.f8765F);
        arrayList.add(C1962y.f8769J);
        arrayList.add(C1962y.f8774O);
        arrayList.add(C1962y.f8767H);
        arrayList.add(C1962y.f8781d);
        arrayList.add(C1942e.f8717a);
        arrayList.add(C1962y.f8772M);
        arrayList.add(C1959v.f8755a);
        arrayList.add(C1957t.f8753a);
        arrayList.add(C1962y.f8770K);
        arrayList.add(C1906a.f8695a);
        arrayList.add(C1962y.f8777R);
        arrayList.add(C1962y.f8779b);
        arrayList.add(c1986o);
        arrayList.add(new C1940c(this.f8936f));
        arrayList.add(new C1948k(this.f8936f));
        arrayList.add(new C1953p(this.f8936f, interfaceC2014i, c1986o));
        this.f8935e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final <T> AbstractC1902af<T> m6218a(C1999a<T> c1999a) {
        AbstractC1902af<T> abstractC1902af = (AbstractC1902af) this.f8934d.get(c1999a);
        if (abstractC1902af != null) {
            return abstractC1902af;
        }
        Map map = this.f8933c.get();
        C2022q c2022q = (C2022q) map.get(c1999a);
        if (c2022q != null) {
            return c2022q;
        }
        C2022q c2022q2 = new C2022q();
        map.put(c1999a, c2022q2);
        try {
            Iterator<InterfaceC1903ag> it = this.f8935e.iterator();
            while (it.hasNext()) {
                AbstractC1902af<T> mo6060a = it.next().mo6060a(this, c1999a);
                if (mo6060a != null) {
                    c2022q2.m6222a((AbstractC1902af) mo6060a);
                    this.f8934d.put(c1999a, mo6060a);
                    return mo6060a;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle ".concat(String.valueOf(c1999a)));
        } finally {
            map.remove(c1999a);
        }
    }

    /* renamed from: a */
    public final <T> AbstractC1902af<T> m6217a(InterfaceC1903ag interfaceC1903ag, C1999a<T> c1999a) {
        boolean z = false;
        for (InterfaceC1903ag interfaceC1903ag2 : this.f8935e) {
            if (z) {
                AbstractC1902af<T> mo6060a = interfaceC1903ag2.mo6060a(this, c1999a);
                if (mo6060a != null) {
                    return mo6060a;
                }
            } else if (interfaceC1903ag2 == interfaceC1903ag) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(c1999a)));
    }

    /* renamed from: a */
    public final <T> AbstractC1902af<T> m6219a(Class<T> cls) {
        return m6218a((C1999a) C1999a.m6163a((Class) cls));
    }

    /* renamed from: a */
    public final String m6221a(Object obj) {
        C2006f m6214a;
        boolean m6210g;
        boolean m6211h;
        boolean m6212i;
        if (obj == null) {
            C2028w c2028w = C2028w.f8949a;
            StringWriter stringWriter = new StringWriter();
            try {
                m6214a = m6214a((Writer) stringWriter);
                m6210g = m6214a.m6210g();
                m6214a.m6206b(true);
                m6211h = m6214a.m6211h();
                m6214a.m6208c(this.f8938h);
                m6212i = m6214a.m6212i();
                m6214a.m6209d(this.f8937g);
                try {
                    try {
                        C1992u.m6152a(c2028w, m6214a);
                        return stringWriter.toString();
                    } catch (IOException e) {
                        throw new C2027v(e);
                    }
                } finally {
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m6214a = m6214a((Writer) stringWriter2);
            AbstractC1902af m6218a = m6218a((C1999a) C1999a.m6164a((Type) cls));
            m6210g = m6214a.m6210g();
            m6214a.m6206b(true);
            m6211h = m6214a.m6211h();
            m6214a.m6208c(this.f8938h);
            m6212i = m6214a.m6212i();
            m6214a.m6209d(this.f8937g);
            try {
                try {
                    m6218a.mo6059a(m6214a, obj);
                    return stringWriter2.toString();
                } finally {
                }
            } catch (IOException e3) {
                throw new C2027v(e3);
            }
        } catch (IOException e4) {
            throw new C2027v(e4);
        }
    }

    /* renamed from: a */
    private C2006f m6214a(Writer writer) {
        if (this.f8939i) {
            writer.write(")]}'\n");
        }
        C2006f c2006f = new C2006f(writer);
        if (this.f8940j) {
            c2006f.m6207c("  ");
        }
        c2006f.m6209d(this.f8937g);
        return c2006f;
    }

    /* renamed from: a */
    private <T> T m6215a(C2001a c2001a, Type type) {
        boolean m6196p = c2001a.m6196p();
        boolean z = true;
        c2001a.m6195a(true);
        try {
            try {
                try {
                    c2001a.mo6081f();
                    z = false;
                    return m6218a((C1999a) C1999a.m6164a(type)).mo6058a(c2001a);
                } catch (EOFException e) {
                    if (!z) {
                        throw new C1898ab(e);
                    }
                    c2001a.m6195a(m6196p);
                    return null;
                } catch (IllegalStateException e2) {
                    throw new C1898ab(e2);
                }
            } catch (IOException e3) {
                throw new C1898ab(e3);
            }
        } finally {
            c2001a.m6195a(m6196p);
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f8937g + "factories:" + this.f8935e + ",instanceCreators:" + this.f8936f + "}";
    }

    /* renamed from: a */
    public final <T> T m6220a(String str, Class<T> cls) {
        Object m6215a;
        if (str == null) {
            m6215a = null;
        } else {
            C2001a c2001a = new C2001a(new StringReader(str));
            m6215a = m6215a(c2001a, cls);
            if (m6215a != null) {
                try {
                    if (c2001a.mo6081f() != EnumC2005e.END_DOCUMENT) {
                        throw new C2027v("JSON document was not fully consumed.");
                    }
                } catch (C2008h e) {
                    throw new C1898ab(e);
                } catch (IOException e2) {
                    throw new C2027v(e2);
                }
            }
        }
        return (T) C1991t.m6149a((Class) cls).cast(m6215a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6216a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialDoubleValues() method.");
        }
    }
}
