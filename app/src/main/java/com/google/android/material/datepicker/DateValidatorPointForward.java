package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C2161i();

    /* renamed from: a */
    private final long f9538a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DateValidatorPointForward(long j, byte b) {
        this(j);
    }

    private DateValidatorPointForward(long j) {
        this.f9538a = j;
    }

    /* renamed from: a */
    public static DateValidatorPointForward m6811a() {
        return new DateValidatorPointForward(Long.MIN_VALUE);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: a */
    public final boolean mo6802a(long j) {
        return j >= this.f9538a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9538a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f9538a == ((DateValidatorPointForward) obj).f9538a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9538a)});
    }
}
