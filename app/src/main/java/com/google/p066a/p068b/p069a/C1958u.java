package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;
import java.sql.Date;

/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: com.google.a.b.a.u */
/* loaded from: classes.dex */
final class C1958u implements InterfaceC1903ag {
    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        if (c1999a.m6165a() == Date.class) {
            return new C1957t();
        }
        return null;
    }
}
