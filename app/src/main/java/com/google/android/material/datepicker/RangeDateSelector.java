package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
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
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<C0473d<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C2145ao();

    /* renamed from: a */
    private String f9547a;

    /* renamed from: b */
    private final String f9548b = " ";

    /* renamed from: c */
    private Long f9549c = null;

    /* renamed from: d */
    private Long f9550d = null;

    /* renamed from: e */
    private Long f9551e = null;

    /* renamed from: f */
    private Long f9552f = null;

    /* renamed from: a */
    private static boolean m6826a(long j, long j2) {
        return j <= j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final void mo6806a(long j) {
        if (this.f9549c == null) {
            this.f9549c = Long.valueOf(j);
        } else if (this.f9550d == null && m6826a(this.f9549c.longValue(), j)) {
            this.f9550d = Long.valueOf(j);
        } else {
            this.f9550d = null;
            this.f9549c = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public final boolean mo6808b() {
        return (this.f9549c == null || this.f9550d == null || !m6826a(this.f9549c.longValue(), this.f9550d.longValue())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0473d<Long, Long> mo6804a() {
        return new C0473d<>(this.f9549c, this.f9550d);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: d */
    public final Collection<C0473d<Long, Long>> mo6810d() {
        if (this.f9549c == null || this.f9550d == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0473d(this.f9549c, this.f9550d));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: c */
    public final Collection<Long> mo6809c() {
        ArrayList arrayList = new ArrayList();
        if (this.f9549c != null) {
            arrayList.add(this.f9549c);
        }
        if (this.f9550d != null) {
            arrayList.add(this.f9550d);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public final int mo6807b(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return C2220c.m7041a(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, C2177y.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final String mo6805a(Context context) {
        C0473d m1616a;
        Resources resources = context.getResources();
        if (this.f9549c == null && this.f9550d == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        if (this.f9550d == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, C2159g.m6871a(this.f9549c.longValue()));
        }
        if (this.f9549c == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, C2159g.m6871a(this.f9550d.longValue()));
        }
        Long l = this.f9549c;
        Long l2 = this.f9550d;
        if (l == null && l2 == null) {
            m1616a = C0473d.m1616a(null, null);
        } else if (l == null) {
            m1616a = C0473d.m1616a(null, C2159g.m6871a(l2.longValue()));
        } else if (l2 == null) {
            m1616a = C0473d.m1616a(C2159g.m6871a(l.longValue()), null);
        } else {
            Calendar m6853a = C2150at.m6853a(Calendar.getInstance());
            Calendar m6855b = C2150at.m6855b();
            m6855b.setTimeInMillis(l.longValue());
            Calendar m6855b2 = C2150at.m6855b();
            m6855b2.setTimeInMillis(l2.longValue());
            if (m6855b.get(1) == m6855b2.get(1)) {
                if (m6855b.get(1) == m6853a.get(1)) {
                    m1616a = C0473d.m1616a(C2159g.m6873b(l.longValue(), Locale.getDefault()), C2159g.m6873b(l2.longValue(), Locale.getDefault()));
                } else {
                    m1616a = C0473d.m1616a(C2159g.m6873b(l.longValue(), Locale.getDefault()), C2159g.m6872a(l2.longValue(), Locale.getDefault()));
                }
            } else {
                m1616a = C0473d.m1616a(C2159g.m6872a(l.longValue(), Locale.getDefault()), C2159g.m6872a(l2.longValue(), Locale.getDefault()));
            }
        }
        return resources.getString(R.string.mtrl_picker_range_header_selected, m1616a.f2273a, m1616a.f2274b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public final View mo6803a(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, InterfaceC2141ak<C0473d<Long, Long>> interfaceC2141ak) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C2262g.m7181a() || C2262g.m7182b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f9547a = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat m6858c = C2150at.m6858c();
        if (this.f9549c != null) {
            editText.setText(m6858c.format(this.f9549c));
            this.f9551e = this.f9549c;
        }
        if (this.f9550d != null) {
            editText2.setText(m6858c.format(this.f9550d));
            this.f9552f = this.f9550d;
        }
        String m6850a = C2150at.m6850a(inflate.getResources(), m6858c);
        editText.addTextChangedListener(new C2143am(this, m6850a, m6858c, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, interfaceC2141ak));
        editText2.addTextChangedListener(new C2144an(this, m6850a, m6858c, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, interfaceC2141ak));
        C2250as.m7113b(editText);
        return inflate;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f9549c);
        parcel.writeValue(this.f9550d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m6825a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, InterfaceC2141ak interfaceC2141ak) {
        if (rangeDateSelector.f9551e != null && rangeDateSelector.f9552f != null) {
            if (m6826a(rangeDateSelector.f9551e.longValue(), rangeDateSelector.f9552f.longValue())) {
                rangeDateSelector.f9549c = rangeDateSelector.f9551e;
                rangeDateSelector.f9550d = rangeDateSelector.f9552f;
                interfaceC2141ak.mo6834a(rangeDateSelector.mo6804a());
                return;
            } else {
                textInputLayout.setError(rangeDateSelector.f9547a);
                textInputLayout2.setError(" ");
                return;
            }
        }
        if (textInputLayout.getError() != null && rangeDateSelector.f9547a.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }
}
