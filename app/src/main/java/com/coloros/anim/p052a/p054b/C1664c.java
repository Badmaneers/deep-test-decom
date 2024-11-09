package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p062f.C1808d;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.c */
/* loaded from: classes.dex */
public final class C1664c extends AbstractC1668g<Integer> {
    public C1664c(List<C1815c<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    private int m5519b(C1815c<Integer> c1815c, float f) {
        Integer num;
        if (c1815c.f8422a == null || c1815c.f8425d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = c1815c.f8422a.intValue();
        int intValue2 = c1815c.f8425d.intValue();
        if (this.f7983b != null && (num = (Integer) this.f7983b.m5910a(c1815c.f8424c, c1815c.f8426e.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, m5514d(), m5518h())) != null) {
            return num.intValue();
        }
        return C1808d.m5888a(C1810f.m5899b(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* renamed from: i */
    public final int m5520i() {
        return m5519b(m5513c(), m5515e());
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    final /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        return Integer.valueOf(m5519b(c1815c, f));
    }
}
