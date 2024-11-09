package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.an */
/* loaded from: classes.dex */
public final class C1920an implements InterfaceC1903ag {
    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        if (c1999a.m6165a() != Timestamp.class) {
            return null;
        }
        return new C1921ao(this, c2015j.m6219a((Class) Date.class));
    }
}
