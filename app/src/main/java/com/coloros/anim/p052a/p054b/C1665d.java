package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.d */
/* loaded from: classes.dex */
public final class C1665d extends AbstractC1668g<Float> {
    public C1665d(List<C1815c<Float>> list) {
        super(list);
    }

    /* renamed from: b */
    private float m5521b(C1815c<Float> c1815c, float f) {
        Float f2;
        if (c1815c.f8422a == null || c1815c.f8425d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f7983b != null && (f2 = (Float) this.f7983b.m5910a(c1815c.f8424c, c1815c.f8426e.floatValue(), c1815c.f8422a, c1815c.f8425d, f, m5514d(), m5518h())) != null) {
            return f2.floatValue();
        }
        return C1810f.m5892a(c1815c.m5916f(), c1815c.m5917g(), f);
    }

    /* renamed from: i */
    public final float m5522i() {
        return m5521b(m5513c(), m5515e());
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    final /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        return Float.valueOf(m5521b(c1815c, f));
    }
}
