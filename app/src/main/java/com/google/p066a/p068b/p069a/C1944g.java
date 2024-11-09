package com.google.p066a.p068b.p069a;

import com.google.p066a.C2024s;
import com.google.p066a.C2028w;
import com.google.p066a.C2029x;
import com.google.p066a.C2031z;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.EnumC2005e;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* renamed from: com.google.a.b.a.g */
/* loaded from: classes.dex */
public final class C1944g extends C2001a {

    /* renamed from: a */
    private static final Reader f8721a = new C1945h();

    /* renamed from: b */
    private static final Object f8722b = new Object();

    /* renamed from: c */
    private final List<Object> f8723c;

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: a */
    public final void mo6076a() {
        m6073a(EnumC2005e.BEGIN_ARRAY);
        this.f8723c.add(((C2024s) m6074q()).iterator());
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: b */
    public final void mo6077b() {
        m6073a(EnumC2005e.END_ARRAY);
        m6075r();
        m6075r();
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: c */
    public final void mo6078c() {
        m6073a(EnumC2005e.BEGIN_OBJECT);
        this.f8723c.add(((C2029x) m6074q()).m6233h().iterator());
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: d */
    public final void mo6079d() {
        m6073a(EnumC2005e.END_OBJECT);
        m6075r();
        m6075r();
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: e */
    public final boolean mo6080e() {
        EnumC2005e mo6081f = mo6081f();
        return (mo6081f == EnumC2005e.END_OBJECT || mo6081f == EnumC2005e.END_ARRAY) ? false : true;
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: f */
    public final EnumC2005e mo6081f() {
        while (!this.f8723c.isEmpty()) {
            Object m6074q = m6074q();
            if (m6074q instanceof Iterator) {
                boolean z = this.f8723c.get(this.f8723c.size() - 2) instanceof C2029x;
                Iterator it = (Iterator) m6074q;
                if (!it.hasNext()) {
                    return z ? EnumC2005e.END_OBJECT : EnumC2005e.END_ARRAY;
                }
                if (z) {
                    return EnumC2005e.NAME;
                }
                this.f8723c.add(it.next());
            } else {
                if (m6074q instanceof C2029x) {
                    return EnumC2005e.BEGIN_OBJECT;
                }
                if (m6074q instanceof C2024s) {
                    return EnumC2005e.BEGIN_ARRAY;
                }
                if (m6074q instanceof C2031z) {
                    C2031z c2031z = (C2031z) m6074q;
                    if (c2031z.m6239j()) {
                        return EnumC2005e.STRING;
                    }
                    if (c2031z.m6237h()) {
                        return EnumC2005e.BOOLEAN;
                    }
                    if (c2031z.m6238i()) {
                        return EnumC2005e.NUMBER;
                    }
                    throw new AssertionError();
                }
                if (m6074q instanceof C2028w) {
                    return EnumC2005e.NULL;
                }
                if (m6074q == f8722b) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
        return EnumC2005e.END_DOCUMENT;
    }

    /* renamed from: q */
    private Object m6074q() {
        return this.f8723c.get(this.f8723c.size() - 1);
    }

    /* renamed from: r */
    private Object m6075r() {
        return this.f8723c.remove(this.f8723c.size() - 1);
    }

    /* renamed from: a */
    private void m6073a(EnumC2005e enumC2005e) {
        if (mo6081f() == enumC2005e) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC2005e + " but was " + mo6081f());
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: g */
    public final String mo6082g() {
        m6073a(EnumC2005e.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m6074q()).next();
        this.f8723c.add(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: h */
    public final String mo6083h() {
        EnumC2005e mo6081f = mo6081f();
        if (mo6081f != EnumC2005e.STRING && mo6081f != EnumC2005e.NUMBER) {
            throw new IllegalStateException("Expected " + EnumC2005e.STRING + " but was " + mo6081f);
        }
        return ((C2031z) m6075r()).mo6226b();
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: i */
    public final boolean mo6084i() {
        m6073a(EnumC2005e.BOOLEAN);
        return ((C2031z) m6075r()).mo6230f();
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: j */
    public final void mo6085j() {
        m6073a(EnumC2005e.NULL);
        m6075r();
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: k */
    public final double mo6086k() {
        EnumC2005e mo6081f = mo6081f();
        if (mo6081f != EnumC2005e.NUMBER && mo6081f != EnumC2005e.STRING) {
            throw new IllegalStateException("Expected " + EnumC2005e.NUMBER + " but was " + mo6081f);
        }
        double mo6227c = ((C2031z) m6074q()).mo6227c();
        if (!m6196p() && (Double.isNaN(mo6227c) || Double.isInfinite(mo6227c))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(mo6227c)));
        }
        m6075r();
        return mo6227c;
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: l */
    public final long mo6087l() {
        EnumC2005e mo6081f = mo6081f();
        if (mo6081f != EnumC2005e.NUMBER && mo6081f != EnumC2005e.STRING) {
            throw new IllegalStateException("Expected " + EnumC2005e.NUMBER + " but was " + mo6081f);
        }
        long mo6228d = ((C2031z) m6074q()).mo6228d();
        m6075r();
        return mo6228d;
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: m */
    public final int mo6088m() {
        EnumC2005e mo6081f = mo6081f();
        if (mo6081f != EnumC2005e.NUMBER && mo6081f != EnumC2005e.STRING) {
            throw new IllegalStateException("Expected " + EnumC2005e.NUMBER + " but was " + mo6081f);
        }
        int mo6229e = ((C2031z) m6074q()).mo6229e();
        m6075r();
        return mo6229e;
    }

    @Override // com.google.p066a.p071d.C2001a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8723c.clear();
        this.f8723c.add(f8722b);
    }

    @Override // com.google.p066a.p071d.C2001a
    /* renamed from: n */
    public final void mo6089n() {
        if (mo6081f() == EnumC2005e.NAME) {
            mo6082g();
        } else {
            m6075r();
        }
    }

    @Override // com.google.p066a.p071d.C2001a
    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: o */
    public final void m6090o() {
        m6073a(EnumC2005e.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m6074q()).next();
        this.f8723c.add(entry.getValue());
        this.f8723c.add(new C2031z((String) entry.getKey()));
    }
}
