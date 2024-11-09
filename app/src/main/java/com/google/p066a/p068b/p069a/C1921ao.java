package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ao */
/* loaded from: classes.dex */
final class C1921ao extends AbstractC1902af<Timestamp> {

    /* renamed from: a */
    final /* synthetic */ AbstractC1902af f8698a;

    /* renamed from: b */
    final /* synthetic */ C1920an f8699b;

    public C1921ao(C1920an c1920an, AbstractC1902af abstractC1902af) {
        this.f8699b = c1920an;
        this.f8698a = abstractC1902af;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6059a(C2006f c2006f, Timestamp timestamp) {
        this.f8698a.mo6059a(c2006f, timestamp);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Timestamp mo6058a(C2001a c2001a) {
        Date date = (Date) this.f8698a.mo6058a(c2001a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
