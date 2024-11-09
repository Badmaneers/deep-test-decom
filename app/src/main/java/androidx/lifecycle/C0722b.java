package androidx.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
final class C0722b {

    /* renamed from: a */
    final Map<EnumC0729i, List<C0723c>> f3064a = new HashMap();

    /* renamed from: b */
    final Map<C0723c, EnumC0729i> f3065b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0722b(Map<C0723c, EnumC0729i> map) {
        this.f3065b = map;
        for (Map.Entry<C0723c, EnumC0729i> entry : map.entrySet()) {
            EnumC0729i value = entry.getValue();
            List<C0723c> list = this.f3064a.get(value);
            if (list == null) {
                list = new ArrayList<>();
                this.f3064a.put(value, list);
            }
            list.add(entry.getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2606a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i, Object obj) {
        m2605a(this.f3064a.get(enumC0729i), interfaceC0733m, enumC0729i, obj);
        m2605a(this.f3064a.get(EnumC0729i.ON_ANY), interfaceC0733m, enumC0729i, obj);
    }

    /* renamed from: a */
    private static void m2605a(List<C0723c> list, InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.get(size).m2607a(interfaceC0733m, enumC0729i, obj);
            }
        }
    }
}
