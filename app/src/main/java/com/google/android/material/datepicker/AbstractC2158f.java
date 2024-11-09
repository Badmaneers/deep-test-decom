package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/* compiled from: DateFormatTextWatcher.java */
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
abstract class AbstractC2158f implements TextWatcher {

    /* renamed from: a */
    private final String f9609a;

    /* renamed from: b */
    private final DateFormat f9610b;

    /* renamed from: c */
    private final TextInputLayout f9611c;

    /* renamed from: d */
    private final CalendarConstraints f9612d;

    /* renamed from: e */
    private final String f9613e;

    /* renamed from: a */
    void mo6844a() {
    }

    /* renamed from: a */
    abstract void mo6845a(Long l);

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2158f(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f9609a = str;
        this.f9610b = dateFormat;
        this.f9611c = textInputLayout;
        this.f9612d = calendarConstraints;
        this.f9613e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f9611c.setError(null);
            mo6845a(null);
            return;
        }
        try {
            Date parse = this.f9610b.parse(charSequence.toString());
            this.f9611c.setError(null);
            long time = parse.getTime();
            if (this.f9612d.m6794a().mo6802a(time) && this.f9612d.m6796a(time)) {
                mo6845a(Long.valueOf(parse.getTime()));
            } else {
                this.f9611c.setError(String.format(this.f9613e, C2159g.m6871a(time)));
                mo6844a();
            }
        } catch (ParseException unused) {
            String string = this.f9611c.getContext().getString(R.string.mtrl_picker_invalid_format);
            String format = String.format(this.f9611c.getContext().getString(R.string.mtrl_picker_invalid_format_use), this.f9609a);
            String format2 = String.format(this.f9611c.getContext().getString(R.string.mtrl_picker_invalid_format_example), this.f9610b.format(new Date(C2150at.m6853a(Calendar.getInstance()).getTimeInMillis())));
            this.f9611c.setError(string + "\n" + format + "\n" + format2);
            mo6844a();
        }
    }
}
