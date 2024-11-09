package com.coloros.anim.p052a.p054b;

import android.graphics.Path;
import android.graphics.PointF;
import com.coloros.anim.C1638a;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1815c;

/* compiled from: PathKeyframe.java */
/* renamed from: com.coloros.anim.a.b.i */
/* loaded from: classes.dex */
public final class C1670i extends C1815c<PointF> {

    /* renamed from: h */
    private final C1815c<PointF> f7997h;

    /* renamed from: i */
    private Path f7998i;

    public C1670i(C1638a c1638a, C1815c<PointF> c1815c) {
        super(c1638a, c1815c.f8422a, c1815c.f8425d, c1815c.f8423b, c1815c.f8424c, c1815c.f8426e);
        this.f7997h = c1815c;
        m5528a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m5528a() {
        boolean z = (this.f8425d == 0 || this.f8422a == 0 || !((PointF) this.f8422a).equals(((PointF) this.f8425d).x, ((PointF) this.f8425d).y)) ? false : true;
        if (this.f8425d == 0 || z) {
            return;
        }
        this.f7998i = C1811g.m5904a((PointF) this.f8422a, (PointF) this.f8425d, this.f7997h.f8427f, this.f7997h.f8428g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Path m5529b() {
        return this.f7998i;
    }
}
