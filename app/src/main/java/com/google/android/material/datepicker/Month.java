package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class Month implements Parcelable, Comparable<Month> {
    public static final Parcelable.Creator<Month> CREATOR = new C2136af();

    /* renamed from: a */
    final int f9540a;

    /* renamed from: b */
    final int f9541b;

    /* renamed from: c */
    final int f9542c;

    /* renamed from: d */
    final int f9543d;

    /* renamed from: e */
    final long f9544e;

    /* renamed from: f */
    private final Calendar f9545f;

    /* renamed from: g */
    private final String f9546g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        this.f9545f = C2150at.m6853a(calendar);
        this.f9540a = this.f9545f.get(2);
        this.f9541b = this.f9545f.get(1);
        this.f9542c = this.f9545f.getMaximum(7);
        this.f9543d = this.f9545f.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f9546g = simpleDateFormat.format(this.f9545f.getTime());
        this.f9544e = this.f9545f.getTimeInMillis();
    }

    /* renamed from: a */
    public static Month m6816a(long j) {
        Calendar m6855b = C2150at.m6855b();
        m6855b.setTimeInMillis(j);
        return new Month(m6855b);
    }

    /* renamed from: a */
    public static Month m6815a(int i, int i2) {
        Calendar m6855b = C2150at.m6855b();
        m6855b.set(1, i);
        m6855b.set(2, i2);
        return new Month(m6855b);
    }

    /* renamed from: a */
    public static Month m6814a() {
        return new Month(C2150at.m6853a(Calendar.getInstance()));
    }

    /* renamed from: b */
    public final int m6819b() {
        int firstDayOfWeek = this.f9545f.get(7) - this.f9545f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f9542c : firstDayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f9540a == month.f9540a && this.f9541b == month.f9541b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9540a), Integer.valueOf(this.f9541b)});
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(Month month) {
        return this.f9545f.compareTo(month.f9545f);
    }

    /* renamed from: b */
    public final int m6820b(Month month) {
        if (this.f9545f instanceof GregorianCalendar) {
            return ((month.f9541b - this.f9541b) * 12) + (month.f9540a - this.f9540a);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: c */
    public final long m6822c() {
        return this.f9545f.getTimeInMillis();
    }

    /* renamed from: a */
    public final long m6818a(int i) {
        Calendar m6853a = C2150at.m6853a(this.f9545f);
        m6853a.set(5, i);
        return m6853a.getTimeInMillis();
    }

    /* renamed from: b */
    public final Month m6821b(int i) {
        Calendar m6853a = C2150at.m6853a(this.f9545f);
        m6853a.add(2, i);
        return new Month(m6853a);
    }

    /* renamed from: d */
    public final String m6823d() {
        return this.f9546g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9541b);
        parcel.writeInt(this.f9540a);
    }
}
