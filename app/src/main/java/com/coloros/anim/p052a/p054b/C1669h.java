package com.coloros.anim.p052a.p054b;

import android.graphics.Path;
import com.coloros.anim.p056c.p058b.C1724g;
import com.coloros.anim.p056c.p058b.C1732o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.h */
/* loaded from: classes.dex */
public final class C1669h {

    /* renamed from: a */
    private final List<AbstractC1662a<C1732o, Path>> f7994a;

    /* renamed from: b */
    private final List<AbstractC1662a<Integer, Integer>> f7995b;

    /* renamed from: c */
    private final List<C1724g> f7996c;

    public C1669h(List<C1724g> list) {
        this.f7996c = list;
        this.f7994a = new ArrayList(list.size());
        this.f7995b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f7994a.add(list.get(i).m5674b().mo5628a());
            this.f7995b.add(list.get(i).m5675c().mo5628a());
        }
    }

    /* renamed from: a */
    public final List<C1724g> m5525a() {
        return this.f7996c;
    }

    /* renamed from: b */
    public final List<AbstractC1662a<C1732o, Path>> m5526b() {
        return this.f7994a;
    }

    /* renamed from: c */
    public final List<AbstractC1662a<Integer, Integer>> m5527c() {
        return this.f7995b;
    }
}
