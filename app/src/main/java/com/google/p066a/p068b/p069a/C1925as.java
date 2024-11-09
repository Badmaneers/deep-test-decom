package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.as */
/* loaded from: classes.dex */
final class C1925as implements InterfaceC1903ag {
    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Class<? super T> m6165a = c1999a.m6165a();
        if (!Enum.class.isAssignableFrom(m6165a) || m6165a == Enum.class) {
            return null;
        }
        if (!m6165a.isEnum()) {
            m6165a = m6165a.getSuperclass();
        }
        return new C1939bf(m6165a);
    }
}
