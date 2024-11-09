package com.coloros.anim.p056c;

import android.util.LruCache;
import com.coloros.anim.C1638a;

/* compiled from: EffectiveCompositionCache.java */
/* renamed from: com.coloros.anim.c.d */
/* loaded from: classes.dex */
public final class C1759d {

    /* renamed from: a */
    private static final C1759d f8339a = new C1759d();

    /* renamed from: b */
    private final LruCache<String, C1638a> f8340b = new LruCache<>(20);

    C1759d() {
    }

    /* renamed from: a */
    public static C1759d m5783a() {
        return f8339a;
    }

    /* renamed from: a */
    public final C1638a m5784a(String str) {
        if (str == null) {
            return null;
        }
        return this.f8340b.get(str);
    }

    /* renamed from: a */
    public final void m5785a(String str, C1638a c1638a) {
        if (str == null) {
            return;
        }
        this.f8340b.put(str, c1638a);
    }
}
