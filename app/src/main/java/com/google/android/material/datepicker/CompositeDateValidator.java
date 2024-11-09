package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C2157e();

    /* renamed from: a */
    private final List<CalendarConstraints.DateValidator> f9536a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ CompositeDateValidator(List list, byte b) {
        this(list);
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list) {
        this.f9536a = list;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: a */
    public final boolean mo6802a(long j) {
        for (CalendarConstraints.DateValidator dateValidator : this.f9536a) {
            if (dateValidator != null && !dateValidator.mo6802a(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f9536a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompositeDateValidator) {
            return this.f9536a.equals(((CompositeDateValidator) obj).f9536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9536a.hashCode();
    }
}
