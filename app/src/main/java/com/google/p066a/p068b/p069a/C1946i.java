package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC2026u;
import com.google.p066a.C2024s;
import com.google.p066a.C2028w;
import com.google.p066a.C2029x;
import com.google.p066a.C2031z;
import com.google.p066a.p071d.C2006f;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* renamed from: com.google.a.b.a.i */
/* loaded from: classes.dex */
public final class C1946i extends C2006f {

    /* renamed from: a */
    private static final Writer f8724a = new C1947j();

    /* renamed from: b */
    private static final C2031z f8725b = new C2031z("closed");

    /* renamed from: c */
    private final List<AbstractC2026u> f8726c;

    /* renamed from: d */
    private String f8727d;

    /* renamed from: e */
    private AbstractC2026u f8728e;

    @Override // com.google.p066a.p071d.C2006f, java.io.Flushable
    public final void flush() {
    }

    public C1946i() {
        super(f8724a);
        this.f8726c = new ArrayList();
        this.f8728e = C2028w.f8949a;
    }

    /* renamed from: a */
    public final AbstractC2026u m6097a() {
        if (!this.f8726c.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.f8726c);
        }
        return this.f8728e;
    }

    /* renamed from: j */
    private AbstractC2026u m6092j() {
        return this.f8726c.get(this.f8726c.size() - 1);
    }

    /* renamed from: a */
    private void m6091a(AbstractC2026u abstractC2026u) {
        if (this.f8727d == null) {
            if (this.f8726c.isEmpty()) {
                this.f8728e = abstractC2026u;
                return;
            }
            AbstractC2026u m6092j = m6092j();
            if (m6092j instanceof C2024s) {
                ((C2024s) m6092j).m6225a(abstractC2026u);
                return;
            }
            throw new IllegalStateException();
        }
        if (!(abstractC2026u instanceof C2028w) || m6212i()) {
            ((C2029x) m6092j()).m6232a(this.f8727d, abstractC2026u);
        }
        this.f8727d = null;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: b */
    public final C2006f mo6098b() {
        C2024s c2024s = new C2024s();
        m6091a(c2024s);
        this.f8726c.add(c2024s);
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: c */
    public final C2006f mo6100c() {
        if (this.f8726c.isEmpty() || this.f8727d != null) {
            throw new IllegalStateException();
        }
        if (m6092j() instanceof C2024s) {
            this.f8726c.remove(this.f8726c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: d */
    public final C2006f mo6101d() {
        C2029x c2029x = new C2029x();
        m6091a(c2029x);
        this.f8726c.add(c2029x);
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: e */
    public final C2006f mo6102e() {
        if (this.f8726c.isEmpty() || this.f8727d != null) {
            throw new IllegalStateException();
        }
        if (m6092j() instanceof C2029x) {
            this.f8726c.remove(this.f8726c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: a */
    public final C2006f mo6095a(String str) {
        if (this.f8726c.isEmpty() || this.f8727d != null) {
            throw new IllegalStateException();
        }
        if (m6092j() instanceof C2029x) {
            this.f8727d = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: b */
    public final C2006f mo6099b(String str) {
        if (str == null) {
            return mo6103f();
        }
        m6091a(new C2031z(str));
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: f */
    public final C2006f mo6103f() {
        m6091a(C2028w.f8949a);
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: a */
    public final C2006f mo6096a(boolean z) {
        m6091a(new C2031z(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: a */
    public final C2006f mo6093a(long j) {
        m6091a(new C2031z(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f
    /* renamed from: a */
    public final C2006f mo6094a(Number number) {
        if (number == null) {
            return mo6103f();
        }
        if (!m6210g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        m6091a(new C2031z(number));
        return this;
    }

    @Override // com.google.p066a.p071d.C2006f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f8726c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f8726c.add(f8725b);
    }
}
