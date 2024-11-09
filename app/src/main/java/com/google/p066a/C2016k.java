package com.google.p066a;

import com.google.p066a.p070c.C1999a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Gson.java */
/* renamed from: com.google.a.k */
/* loaded from: classes.dex */
public final class C2016k extends ThreadLocal<Map<C1999a<?>, C2022q<?>>> {

    /* renamed from: a */
    final /* synthetic */ C2015j f8941a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2016k(C2015j c2015j) {
        this.f8941a = c2015j;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Map<C1999a<?>, C2022q<?>> initialValue() {
        return new HashMap();
    }
}
