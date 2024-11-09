package com.facebook.rebound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SpringConfigRegistry.java */
/* renamed from: com.facebook.rebound.m */
/* loaded from: classes.dex */
public final class C1882m {

    /* renamed from: a */
    private static final C1882m f8667a = new C1882m();

    /* renamed from: b */
    private final Map<C1881l, String> f8668b = new HashMap();

    /* renamed from: a */
    public static C1882m m6028a() {
        return f8667a;
    }

    private C1882m() {
        C1881l c1881l = C1881l.f8664c;
        if (c1881l == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        if (this.f8668b.containsKey(c1881l)) {
            return;
        }
        this.f8668b.put(c1881l, "default config");
    }

    /* renamed from: b */
    public final Map<C1881l, String> m6029b() {
        return Collections.unmodifiableMap(this.f8668b);
    }
}
