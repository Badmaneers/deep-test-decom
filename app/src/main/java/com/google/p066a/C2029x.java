package com.google.p066a;

import com.google.p066a.p068b.C1905a;
import com.google.p066a.p068b.C1993v;
import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* renamed from: com.google.a.x */
/* loaded from: classes.dex */
public final class C2029x extends AbstractC2026u {

    /* renamed from: a */
    private final C1993v<AbstractC2026u> f8950a = new C1993v<>();

    /* renamed from: a */
    public final void m6232a(String str, AbstractC2026u abstractC2026u) {
        if (abstractC2026u == null) {
            abstractC2026u = C2028w.f8949a;
        }
        this.f8950a.put((String) C1905a.m6061a(str), abstractC2026u);
    }

    /* renamed from: h */
    public final Set<Map.Entry<String, AbstractC2026u>> m6233h() {
        return this.f8950a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2029x) && ((C2029x) obj).f8950a.equals(this.f8950a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f8950a.hashCode();
    }
}
