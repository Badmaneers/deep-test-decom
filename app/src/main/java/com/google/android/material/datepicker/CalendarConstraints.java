package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C2130a();

    /* renamed from: a */
    private final Month f9530a;

    /* renamed from: b */
    private final Month f9531b;

    /* renamed from: c */
    private final Month f9532c;

    /* renamed from: d */
    private final DateValidator f9533d;

    /* renamed from: e */
    private final int f9534e;

    /* renamed from: f */
    private final int f9535f;

    /* loaded from: classes.dex */
    public interface DateValidator extends Parcelable {
        /* renamed from: a */
        boolean mo6802a(long j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, byte b) {
        this(month, month2, month3, dateValidator);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f9530a = month;
        this.f9531b = month2;
        this.f9532c = month3;
        this.f9533d = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f9535f = month.m6820b(month2) + 1;
        this.f9534e = (month2.f9541b - month.f9541b) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m6796a(long j) {
        return this.f9530a.m6818a(1) <= j && j <= this.f9531b.m6818a(this.f9531b.f9543d);
    }

    /* renamed from: a */
    public final DateValidator m6794a() {
        return this.f9533d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Month m6797b() {
        return this.f9530a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Month m6798c() {
        return this.f9531b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Month m6799d() {
        return this.f9532c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m6800e() {
        return this.f9535f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int m6801f() {
        return this.f9534e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f9530a.equals(calendarConstraints.f9530a) && this.f9531b.equals(calendarConstraints.f9531b) && this.f9532c.equals(calendarConstraints.f9532c) && this.f9533d.equals(calendarConstraints.f9533d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9530a, this.f9531b, this.f9532c, this.f9533d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9530a, 0);
        parcel.writeParcelable(this.f9531b, 0);
        parcel.writeParcelable(this.f9532c, 0);
        parcel.writeParcelable(this.f9533d, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Month m6795a(Month month) {
        if (month.compareTo(this.f9530a) < 0) {
            return this.f9530a;
        }
        return month.compareTo(this.f9531b) > 0 ? this.f9531b : month;
    }
}
