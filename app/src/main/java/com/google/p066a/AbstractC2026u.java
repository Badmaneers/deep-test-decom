package com.google.p066a;

import com.google.p066a.p068b.C1992u;
import com.google.p066a.p071d.C2006f;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* renamed from: com.google.a.u */
/* loaded from: classes.dex */
public abstract class AbstractC2026u {
    /* renamed from: f */
    public boolean mo6230f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: a */
    public Number mo6224a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public String mo6226b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public double mo6227c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public long mo6228d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public int mo6229e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C2006f c2006f = new C2006f(stringWriter);
            c2006f.m6206b(true);
            C1992u.m6152a(this, c2006f);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public final C2031z m6231g() {
        if (this instanceof C2031z) {
            return (C2031z) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }
}
