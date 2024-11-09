package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.p070c.C1999a;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.q */
/* loaded from: classes.dex */
public final class C1954q extends AbstractC1956s {

    /* renamed from: a */
    final AbstractC1902af<?> f8741a;

    /* renamed from: b */
    final /* synthetic */ C2015j f8742b;

    /* renamed from: c */
    final /* synthetic */ C1999a f8743c;

    /* renamed from: d */
    final /* synthetic */ Field f8744d;

    /* renamed from: e */
    final /* synthetic */ boolean f8745e;

    /* renamed from: f */
    final /* synthetic */ C1953p f8746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1954q(C1953p c1953p, String str, boolean z, boolean z2, C2015j c2015j, C1999a c1999a, Field field, boolean z3) {
        super(str, z, z2);
        this.f8746f = c1953p;
        this.f8742b = c2015j;
        this.f8743c = c1999a;
        this.f8744d = field;
        this.f8745e = z3;
        this.f8741a = this.f8742b.m6218a(this.f8743c);
    }

    @Override // com.google.p066a.p068b.p069a.AbstractC1956s
    /* renamed from: a */
    public final void mo6108a(C2006f c2006f, Object obj) {
        new C1961x(this.f8742b, this.f8741a, this.f8743c.m6166b()).mo6059a(c2006f, this.f8744d.get(obj));
    }

    @Override // com.google.p066a.p068b.p069a.AbstractC1956s
    /* renamed from: a */
    public final void mo6107a(C2001a c2001a, Object obj) {
        Object mo6058a = this.f8741a.mo6058a(c2001a);
        if (mo6058a == null && this.f8745e) {
            return;
        }
        this.f8744d.set(obj, mo6058a);
    }
}
