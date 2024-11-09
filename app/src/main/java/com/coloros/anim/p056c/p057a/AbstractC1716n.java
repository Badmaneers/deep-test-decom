package com.coloros.anim.p056c.p057a;

import com.coloros.anim.p063g.C1815c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* renamed from: com.coloros.anim.c.a.n */
/* loaded from: classes.dex */
abstract class AbstractC1716n<V, O> implements InterfaceC1715m<V, O> {

    /* renamed from: a */
    final List<C1815c<V>> f8111a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1716n(V v) {
        this(Collections.singletonList(new C1815c(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1716n(List<C1815c<V>> list) {
        this.f8111a = list;
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: c */
    public List<C1815c<V>> mo5630c() {
        return this.f8111a;
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: b */
    public boolean mo5629b() {
        return this.f8111a.isEmpty() || (this.f8111a.size() == 1 && this.f8111a.get(0).m5915e());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f8111a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f8111a.toArray()));
        }
        return sb.toString();
    }
}
