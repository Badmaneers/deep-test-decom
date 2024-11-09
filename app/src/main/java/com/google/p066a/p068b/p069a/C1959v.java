package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* renamed from: com.google.a.b.a.v */
/* loaded from: classes.dex */
public final class C1959v extends AbstractC1902af<Time> {

    /* renamed from: a */
    public static final InterfaceC1903ag f8755a = new C1960w();

    /* renamed from: b */
    private final DateFormat f8756b = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: b */
    public synchronized Time mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        try {
            return new Time(this.f8756b.parse(c2001a.mo6083h()).getTime());
        } catch (ParseException e) {
            throw new C1898ab(e);
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public synchronized void mo6059a(C2006f c2006f, Time time) {
        c2006f.mo6099b(time == null ? null : this.f8756b.format((Date) time));
    }
}
