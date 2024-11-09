package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: com.google.a.b.a.t */
/* loaded from: classes.dex */
public final class C1957t extends AbstractC1902af<Date> {

    /* renamed from: a */
    public static final InterfaceC1903ag f8753a = new C1958u();

    /* renamed from: b */
    private final DateFormat f8754b = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: b */
    public synchronized Date mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        try {
            return new Date(this.f8754b.parse(c2001a.mo6083h()).getTime());
        } catch (ParseException e) {
            throw new C1898ab(e);
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public synchronized void mo6059a(C2006f c2006f, Date date) {
        c2006f.mo6099b(date == null ? null : this.f8754b.format((java.util.Date) date));
    }
}
