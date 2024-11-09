package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1815c;
import com.coloros.anim.p063g.C1816d;
import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.l */
/* loaded from: classes.dex */
public final class C1673l extends AbstractC1668g<C1816d> {

    /* renamed from: c */
    private final C1816d f8004c;

    public C1673l(List<C1815c<C1816d>> list) {
        super(list);
        this.f8004c = new C1816d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    public final /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        C1816d c1816d;
        if (c1815c.f8422a == 0 || c1815c.f8425d == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1816d c1816d2 = (C1816d) c1815c.f8422a;
        C1816d c1816d3 = (C1816d) c1815c.f8425d;
        if (this.f7983b != null && (c1816d = (C1816d) this.f7983b.m5910a(c1815c.f8424c, c1815c.f8426e.floatValue(), c1816d2, c1816d3, f, m5514d(), m5518h())) != null) {
            return c1816d;
        }
        this.f8004c.m5921a(C1810f.m5892a(c1816d2.m5920a(), c1816d3.m5920a(), f), C1810f.m5892a(c1816d2.m5922b(), c1816d3.m5922b(), f));
        return this.f8004c;
    }
}
