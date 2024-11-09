package com.coloros.anim.p052a.p053a;

import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.p058b.C1740w;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* renamed from: com.coloros.anim.a.a.v */
/* loaded from: classes.dex */
public final class C1661v implements InterfaceC1643d, InterfaceC1663b {

    /* renamed from: a */
    private final String f7975a;

    /* renamed from: b */
    private final boolean f7976b;

    /* renamed from: c */
    private final List<InterfaceC1663b> f7977c = new ArrayList();

    /* renamed from: d */
    private final int f7978d;

    /* renamed from: e */
    private final AbstractC1662a<?, Float> f7979e;

    /* renamed from: f */
    private final AbstractC1662a<?, Float> f7980f;

    /* renamed from: g */
    private final AbstractC1662a<?, Float> f7981g;

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
    }

    public C1661v(AbstractC1743a abstractC1743a, C1740w c1740w) {
        this.f7975a = c1740w.m5730a();
        this.f7976b = c1740w.m5735f();
        this.f7978d = c1740w.m5731b();
        this.f7979e = c1740w.m5733d().mo5628a();
        this.f7980f = c1740w.m5732c().mo5628a();
        this.f7981g = c1740w.m5734e().mo5628a();
        abstractC1743a.m5748a(this.f7979e);
        abstractC1743a.m5748a(this.f7980f);
        abstractC1743a.m5748a(this.f7981g);
        this.f7979e.m5510a(this);
        this.f7980f.m5510a(this);
        this.f7981g.m5510a(this);
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        for (int i = 0; i < this.f7977c.size(); i++) {
            this.f7977c.get(i).mo5480a();
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7975a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5500a(InterfaceC1663b interfaceC1663b) {
        this.f7977c.add(interfaceC1663b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m5501c() {
        return this.f7978d;
    }

    /* renamed from: d */
    public final AbstractC1662a<?, Float> m5502d() {
        return this.f7979e;
    }

    /* renamed from: e */
    public final AbstractC1662a<?, Float> m5503e() {
        return this.f7980f;
    }

    /* renamed from: f */
    public final AbstractC1662a<?, Float> m5504f() {
        return this.f7981g;
    }

    /* renamed from: g */
    public final boolean m5505g() {
        return this.f7976b;
    }
}
