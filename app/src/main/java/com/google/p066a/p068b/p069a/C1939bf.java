package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p067a.InterfaceC1894b;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.bf */
/* loaded from: classes.dex */
final class C1939bf<T extends Enum<T>> extends AbstractC1902af<T> {

    /* renamed from: a */
    private final Map<String, T> f8711a = new HashMap();

    /* renamed from: b */
    private final Map<T, String> f8712b = new HashMap();

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Object obj) {
        Enum r2 = (Enum) obj;
        c2006f.mo6099b(r2 == null ? null : this.f8712b.get(r2));
    }

    public C1939bf(Class<T> cls) {
        try {
            for (T t : cls.getEnumConstants()) {
                String name = t.name();
                InterfaceC1894b interfaceC1894b = (InterfaceC1894b) cls.getField(name).getAnnotation(InterfaceC1894b.class);
                name = interfaceC1894b != null ? interfaceC1894b.m6054a() : name;
                this.f8711a.put(name, t);
                this.f8712b.put(t, name);
            }
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Object mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        return this.f8711a.get(c2001a.mo6083h());
    }
}
