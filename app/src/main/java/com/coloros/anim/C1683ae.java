package com.coloros.anim;

import com.coloros.anim.p056c.C1759d;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveCompositionFactory.java */
/* renamed from: com.coloros.anim.ae */
/* loaded from: classes.dex */
public final class C1683ae implements InterfaceC1827s<C1638a> {

    /* renamed from: a */
    final /* synthetic */ String f8030a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1683ae(String str) {
        this.f8030a = str;
    }

    @Override // com.coloros.anim.InterfaceC1827s
    /* renamed from: a */
    public final /* synthetic */ void mo5556a(C1638a c1638a) {
        Map map;
        C1638a c1638a2 = c1638a;
        if (this.f8030a != null) {
            C1759d.m5783a().m5785a(this.f8030a, c1638a2);
        }
        map = C1681ac.f8027a;
        map.remove(this.f8030a);
    }
}
