package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C2160h();

    /* renamed from: a */
    private final long f9537a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DateValidatorPointBackward(long j, byte b) {
        this(j);
    }

    private DateValidatorPointBackward(long j) {
        this.f9537a = j;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: a */
    public final boolean mo6802a(long j) {
        return j <= this.f9537a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9537a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f9537a == ((DateValidatorPointBackward) obj).f9537a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9537a)});
    }
}
