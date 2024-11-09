package com.color.support.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: ColorLunarDatePicker.java */
/* renamed from: com.color.support.widget.ca */
/* loaded from: classes.dex */
public final class C1413ca {

    /* renamed from: a */
    private Calendar f7006a;

    /* renamed from: b */
    private int f7007b;

    /* renamed from: c */
    private int f7008c;

    /* renamed from: d */
    private int f7009d;

    /* renamed from: e */
    private int f7010e;

    /* renamed from: f */
    private int f7011f;

    /* renamed from: g */
    private boolean f7012g;

    public C1413ca() {
        m4926e(Calendar.getInstance());
    }

    public C1413ca(Locale locale) {
        m4926e(Calendar.getInstance(locale));
    }

    /* renamed from: e */
    private void m4926e(Calendar calendar) {
        this.f7006a = calendar;
        this.f7012g = false;
    }

    /* renamed from: a */
    public final void m4931a(C1413ca c1413ca) {
        this.f7006a.setTimeInMillis(c1413ca.f7006a.getTimeInMillis());
        this.f7007b = c1413ca.f7007b;
        this.f7008c = c1413ca.f7008c;
        this.f7009d = c1413ca.f7009d;
        this.f7010e = c1413ca.f7010e;
        this.f7011f = c1413ca.f7011f;
        this.f7012g = c1413ca.f7012g;
    }

    /* renamed from: a */
    public final long m4928a() {
        return this.f7006a.getTimeInMillis();
    }

    /* renamed from: a */
    public final void m4930a(long j) {
        this.f7006a.setTimeInMillis(j);
        this.f7012g = false;
    }

    /* renamed from: a */
    public final int m4927a(int i) {
        if (!this.f7012g) {
            return this.f7006a.get(i);
        }
        if (i == 5) {
            return this.f7009d;
        }
        if (i == 2) {
            return this.f7008c;
        }
        if (i == 1) {
            return this.f7007b;
        }
        return this.f7006a.get(i);
    }

    /* renamed from: a */
    public final void m4929a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            this.f7006a.set(1, i);
            this.f7006a.set(2, i2);
            this.f7006a.set(5, i3);
            this.f7012g = false;
            return;
        }
        this.f7007b = RecyclerView.UNDEFINED_DURATION;
        this.f7008c = i2;
        this.f7009d = i3;
        this.f7012g = true;
    }

    /* renamed from: b */
    public final void m4934b() {
        this.f7006a.set(1, 2036);
        this.f7006a.set(2, 11);
        this.f7006a.set(5, 31);
        this.f7006a.set(11, 23);
        this.f7006a.set(12, 59);
        this.f7012g = false;
    }

    /* renamed from: c */
    public final void m4937c() {
        this.f7006a.clear();
        this.f7007b = 0;
        this.f7008c = 0;
        this.f7009d = 0;
        this.f7010e = 0;
        this.f7011f = 0;
        this.f7012g = false;
    }

    /* renamed from: a */
    public final boolean m4933a(Calendar calendar) {
        if (this.f7012g) {
            return false;
        }
        return this.f7006a.before(calendar);
    }

    /* renamed from: b */
    public final boolean m4936b(Calendar calendar) {
        if (this.f7012g) {
            return false;
        }
        return this.f7006a.before(calendar) || this.f7006a.equals(calendar);
    }

    /* renamed from: c */
    public final boolean m4938c(Calendar calendar) {
        if (this.f7012g) {
            return false;
        }
        return this.f7006a.after(calendar);
    }

    /* renamed from: d */
    public final boolean m4939d(Calendar calendar) {
        if (this.f7012g) {
            return false;
        }
        return this.f7006a.after(calendar) || this.f7006a.equals(calendar);
    }

    /* renamed from: a */
    public final void m4932a(Calendar calendar, Calendar calendar2) {
        if (this.f7012g) {
            return;
        }
        if (this.f7006a.before(calendar)) {
            m4930a(calendar.getTimeInMillis());
        } else if (this.f7006a.after(calendar2)) {
            m4930a(calendar2.getTimeInMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4935b(int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.C1413ca.m4935b(int, int, int):void");
    }
}
