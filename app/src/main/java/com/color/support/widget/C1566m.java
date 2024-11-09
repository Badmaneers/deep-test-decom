package com.color.support.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorDatePicker.java */
/* renamed from: com.color.support.widget.m */
/* loaded from: classes.dex */
public final class C1566m {

    /* renamed from: a */
    private Calendar f7442a;

    /* renamed from: b */
    private boolean f7443b;

    public C1566m(Locale locale) {
        this.f7442a = Calendar.getInstance(locale);
    }

    /* renamed from: a */
    public final void m5281a(C1566m c1566m) {
        this.f7442a.setTimeInMillis(c1566m.f7442a.getTimeInMillis());
        this.f7443b = c1566m.f7443b;
    }

    /* renamed from: a */
    public final long m5277a() {
        return this.f7442a.getTimeInMillis();
    }

    /* renamed from: a */
    public final void m5280a(long j) {
        this.f7442a.setTimeInMillis(j);
        this.f7443b = false;
    }

    /* renamed from: a */
    public final int m5276a(int i) {
        if (!this.f7443b) {
            return this.f7442a.get(i);
        }
        if (i == 5) {
            return this.f7442a.get(i);
        }
        if (i == 2) {
            return this.f7442a.get(i);
        }
        return i == 1 ? RecyclerView.UNDEFINED_DURATION : this.f7442a.get(i);
    }

    /* renamed from: a */
    public final void m5278a(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i == 5) {
                    this.f7442a.set(5, m5275d(i2));
                    return;
                }
                return;
            } else {
                int i3 = this.f7442a.get(1);
                int i4 = this.f7442a.get(5);
                this.f7442a.clear();
                this.f7442a.set(1, i3);
                this.f7442a.set(2, i2);
                this.f7442a.set(5, m5275d(i4));
                return;
            }
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f7443b = false;
            int i5 = this.f7442a.get(2);
            int i6 = this.f7442a.get(5);
            this.f7442a.clear();
            this.f7442a.set(1, i2);
            this.f7442a.set(2, i5);
            this.f7442a.set(5, m5275d(i6));
            return;
        }
        this.f7443b = true;
        int i7 = this.f7442a.get(2);
        int i8 = this.f7442a.get(5);
        this.f7442a.clear();
        this.f7442a.set(i, 2020);
        this.f7442a.set(2, i7);
        this.f7442a.set(5, m5275d(i8));
    }

    /* renamed from: a */
    public final void m5279a(int i, int i2, int i3) {
        m5278a(1, i);
        m5278a(2, i2);
        m5278a(5, i3);
    }

    /* renamed from: b */
    public final void m5285b() {
        this.f7442a.clear();
        this.f7443b = false;
    }

    /* renamed from: a */
    public final boolean m5283a(Calendar calendar) {
        if (this.f7443b) {
            return false;
        }
        return this.f7442a.before(calendar);
    }

    /* renamed from: b */
    public final boolean m5286b(Calendar calendar) {
        if (this.f7443b) {
            return false;
        }
        return this.f7442a.after(calendar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m5284b(int i) {
        return this.f7442a.getActualMinimum(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m5287c(int i) {
        return this.f7442a.getActualMaximum(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5282a(Calendar calendar, Calendar calendar2) {
        if (this.f7443b) {
            return;
        }
        if (this.f7442a.before(calendar)) {
            m5278a(1, calendar.get(1));
            m5278a(2, calendar.get(2));
            m5278a(5, calendar.get(5));
        } else if (this.f7442a.after(calendar2)) {
            m5278a(1, calendar2.get(1));
            m5278a(2, calendar2.get(2));
            m5278a(5, calendar2.get(5));
        }
    }

    /* renamed from: d */
    private int m5275d(int i) {
        int actualMaximum = this.f7442a.getActualMaximum(5);
        return i > actualMaximum ? actualMaximum : i;
    }
}
