package com.google.android.material.datepicker;

import android.os.Bundle;
import com.google.android.material.datepicker.CalendarConstraints;

/* compiled from: CalendarConstraints.java */
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C2154b {

    /* renamed from: a */
    static final long f9589a = C2150at.m6847a(Month.m6815a(1900, 0).f9544e);

    /* renamed from: b */
    static final long f9590b = C2150at.m6847a(Month.m6815a(2100, 11).f9544e);

    /* renamed from: c */
    private long f9591c;

    /* renamed from: d */
    private long f9592d;

    /* renamed from: e */
    private Long f9593e;

    /* renamed from: f */
    private CalendarConstraints.DateValidator f9594f;

    public C2154b() {
        this.f9591c = f9589a;
        this.f9592d = f9590b;
        this.f9594f = DateValidatorPointForward.m6811a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2154b(CalendarConstraints calendarConstraints) {
        Month month;
        Month month2;
        Month month3;
        CalendarConstraints.DateValidator dateValidator;
        this.f9591c = f9589a;
        this.f9592d = f9590b;
        this.f9594f = DateValidatorPointForward.m6811a();
        month = calendarConstraints.f9530a;
        this.f9591c = month.f9544e;
        month2 = calendarConstraints.f9531b;
        this.f9592d = month2.f9544e;
        month3 = calendarConstraints.f9532c;
        this.f9593e = Long.valueOf(month3.f9544e);
        dateValidator = calendarConstraints.f9533d;
        this.f9594f = dateValidator;
    }

    /* renamed from: a */
    public final C2154b m6866a(long j) {
        this.f9593e = Long.valueOf(j);
        return this;
    }

    /* renamed from: a */
    public final CalendarConstraints m6865a() {
        if (this.f9593e == null) {
            long m6896ad = C2177y.m6896ad();
            if (this.f9591c > m6896ad || m6896ad > this.f9592d) {
                m6896ad = this.f9591c;
            }
            this.f9593e = Long.valueOf(m6896ad);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f9594f);
        return new CalendarConstraints(Month.m6816a(this.f9591c), Month.m6816a(this.f9592d), Month.m6816a(this.f9593e.longValue()), (CalendarConstraints.DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (byte) 0);
    }
}
