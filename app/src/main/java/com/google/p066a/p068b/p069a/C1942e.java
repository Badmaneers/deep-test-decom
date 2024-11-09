package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateTypeAdapter.java */
/* renamed from: com.google.a.b.a.e */
/* loaded from: classes.dex */
public final class C1942e extends AbstractC1902af<Date> {

    /* renamed from: a */
    public static final InterfaceC1903ag f8717a = new C1943f();

    /* renamed from: b */
    private final DateFormat f8718b = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: c */
    private final DateFormat f8719c = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: d */
    private final DateFormat f8720d;

    public C1942e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f8720d = simpleDateFormat;
    }

    /* renamed from: a */
    private synchronized Date m6072a(String str) {
        try {
            try {
                try {
                } catch (ParseException unused) {
                    return this.f8718b.parse(str);
                }
            } catch (ParseException e) {
                throw new C1898ab(str, e);
            }
        } catch (ParseException unused2) {
            return this.f8720d.parse(str);
        }
        return this.f8719c.parse(str);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public synchronized void mo6059a(C2006f c2006f, Date date) {
        if (date == null) {
            c2006f.mo6103f();
        } else {
            c2006f.mo6099b(this.f8718b.format(date));
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Date mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        return m6072a(c2001a.mo6083h());
    }
}
