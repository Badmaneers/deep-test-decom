package com.coloros.anim.p052a.p054b;

import android.graphics.Path;
import com.coloros.anim.p056c.p058b.C1732o;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.m */
/* loaded from: classes.dex */
public final class C1674m extends AbstractC1662a<C1732o, Path> {

    /* renamed from: c */
    private final C1732o f8005c;

    /* renamed from: d */
    private final Path f8006d;

    public C1674m(List<C1815c<C1732o>> list) {
        super(list);
        this.f8005c = new C1732o();
        this.f8006d = new Path();
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Path mo5507a(C1815c<C1732o> c1815c, float f) {
        this.f8005c.m5704a(c1815c.f8422a, c1815c.f8425d, f);
        C1810f.m5897a(this.f8005c, this.f8006d);
        return this.f8006d;
    }
}
