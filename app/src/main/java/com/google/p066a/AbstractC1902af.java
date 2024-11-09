package com.google.p066a;

import com.google.p066a.p068b.p069a.C1946i;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* renamed from: com.google.a.af */
/* loaded from: classes.dex */
public abstract class AbstractC1902af<T> {
    /* renamed from: a */
    public abstract T mo6058a(C2001a c2001a);

    /* renamed from: a */
    public abstract void mo6059a(C2006f c2006f, T t);

    /* renamed from: a */
    public final AbstractC2026u m6057a(T t) {
        try {
            C1946i c1946i = new C1946i();
            mo6059a(c1946i, t);
            return c1946i.m6097a();
        } catch (IOException e) {
            throw new C2027v(e);
        }
    }
}
