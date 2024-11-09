package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.p023f.C0473d;
import com.google.android.material.R;
import com.google.android.material.internal.C2250as;
import com.google.android.material.internal.C2262g;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C2147aq();

    /* renamed from: a */
    private Long f9553a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final void mo6806a(long j) {
        this.f9553a = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public final boolean mo6808b() {
        return this.f9553a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: d */
    public final Collection<C0473d<Long, Long>> mo6810d() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: c */
    public final Collection<Long> mo6809c() {
        ArrayList arrayList = new ArrayList();
        if (this.f9553a != null) {
            arrayList.add(this.f9553a);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final Long m6833e() {
        return this.f9553a;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final View mo6803a(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, InterfaceC2141ak<Long> interfaceC2141ak) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C2262g.m7181a() && C2262g.m7182b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat m6858c = C2150at.m6858c();
        String m6850a = C2150at.m6850a(inflate.getResources(), m6858c);
        if (this.f9553a != null) {
            editText.setText(m6858c.format(this.f9553a));
        }
        editText.addTextChangedListener(new C2146ap(this, m6850a, m6858c, textInputLayout, calendarConstraints, interfaceC2141ak));
        C2250as.m7113b(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public final int mo6807b(Context context) {
        return C2220c.m7041a(context, R.attr.materialCalendarTheme, C2177y.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final String mo6805a(Context context) {
        Resources resources = context.getResources();
        if (this.f9553a == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, C2159g.m6872a(this.f9553a.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f9553a);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Long mo6804a() {
        return this.f9553a;
    }
}
