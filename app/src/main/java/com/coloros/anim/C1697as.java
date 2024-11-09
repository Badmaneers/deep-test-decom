package com.coloros.anim;

import java.util.Map;

/* compiled from: TextDelegate.java */
/* renamed from: com.coloros.anim.as */
/* loaded from: classes.dex */
public final class C1697as {

    /* renamed from: a */
    private final Map<String, String> f8060a;

    /* renamed from: b */
    private boolean f8061b;

    /* renamed from: a */
    public final String m5568a(String str) {
        if (this.f8061b && this.f8060a.containsKey(str)) {
            return this.f8060a.get(str);
        }
        if (this.f8061b) {
            this.f8060a.put(str, str);
        }
        return str;
    }
}
