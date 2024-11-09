package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ap */
/* loaded from: classes.dex */
final class C1922ap extends AbstractC1902af<Calendar> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Calendar calendar) {
        if (calendar == null) {
            c2006f.mo6103f();
            return;
        }
        c2006f.mo6101d();
        c2006f.mo6095a("year");
        c2006f.mo6093a(r4.get(1));
        c2006f.mo6095a("month");
        c2006f.mo6093a(r4.get(2));
        c2006f.mo6095a("dayOfMonth");
        c2006f.mo6093a(r4.get(5));
        c2006f.mo6095a("hourOfDay");
        c2006f.mo6093a(r4.get(11));
        c2006f.mo6095a("minute");
        c2006f.mo6093a(r4.get(12));
        c2006f.mo6095a("second");
        c2006f.mo6093a(r4.get(13));
        c2006f.mo6102e();
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Calendar mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        c2001a.mo6078c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c2001a.mo6081f() != EnumC2005e.END_OBJECT) {
            String mo6082g = c2001a.mo6082g();
            int mo6088m = c2001a.mo6088m();
            if ("year".equals(mo6082g)) {
                i = mo6088m;
            } else if ("month".equals(mo6082g)) {
                i2 = mo6088m;
            } else if ("dayOfMonth".equals(mo6082g)) {
                i3 = mo6088m;
            } else if ("hourOfDay".equals(mo6082g)) {
                i4 = mo6088m;
            } else if ("minute".equals(mo6082g)) {
                i5 = mo6088m;
            } else if ("second".equals(mo6082g)) {
                i6 = mo6088m;
            }
        }
        c2001a.mo6079d();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
