package com.coloros.anim;

import android.util.ArraySet;
import android.util.Pair;
import com.coloros.anim.p062f.C1809e;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* renamed from: com.coloros.anim.ao */
/* loaded from: classes.dex */
public final class C1693ao {

    /* renamed from: a */
    private final Set<Object> f8051a = new ArraySet();

    /* renamed from: b */
    private final Map<String, C1809e> f8052b = new HashMap();

    /* renamed from: c */
    private final Comparator<Pair<String, Float>> f8053c = new C1694ap(this);

    /* renamed from: d */
    private boolean f8054d = false;

    /* renamed from: a */
    public final void m5567a(boolean z) {
        this.f8054d = z;
    }

    /* renamed from: a */
    public final void m5566a(String str, float f) {
        if (this.f8054d) {
            C1809e c1809e = this.f8052b.get(str);
            if (c1809e == null) {
                c1809e = new C1809e();
                this.f8052b.put(str, c1809e);
            }
            c1809e.m5890a(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f8051a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
