package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.f */
/* loaded from: classes.dex */
public final class C1667f extends AbstractC1668g<Integer> {
    public C1667f(List<C1815c<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    private int m5523b(C1815c<Integer> c1815c, float f) {
        Integer num;
        if (c1815c.f8422a == null || c1815c.f8425d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f7983b != null && (num = (Integer) this.f7983b.m5910a(c1815c.f8424c, c1815c.f8426e.floatValue(), c1815c.f8422a, c1815c.f8425d, f, m5514d(), m5518h())) != null) {
            return num.intValue();
        }
        return C1810f.m5895a(c1815c.m5918h(), c1815c.m5919i(), f);
    }

    /* renamed from: i */
    public final int m5524i() {
        return m5523b(m5513c(), m5515e());
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    final /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        return Integer.valueOf(m5523b(c1815c, f));
    }
}
