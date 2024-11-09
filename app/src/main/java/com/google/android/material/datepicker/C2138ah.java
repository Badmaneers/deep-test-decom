package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.AbstractC0845ay;
import androidx.recyclerview.widget.C0861bn;
import com.google.android.material.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthsPagerAdapter.java */
/* renamed from: com.google.android.material.datepicker.ah */
/* loaded from: classes.dex */
public final class C2138ah extends AbstractC0845ay<C2140aj> {

    /* renamed from: a */
    private final CalendarConstraints f9565a;

    /* renamed from: b */
    private final DateSelector<?> f9566b;

    /* renamed from: c */
    private final InterfaceC2175w f9567c;

    /* renamed from: d */
    private final int f9568d;

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ void mo3019a(C2140aj c2140aj, int i) {
        C2140aj c2140aj2 = c2140aj;
        Month m6821b = this.f9565a.m6797b().m6821b(i);
        c2140aj2.f9571q.setText(m6821b.m6823d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c2140aj2.f9572r.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m6813a() != null && m6821b.equals(materialCalendarGridView.m6813a().f9561b)) {
            materialCalendarGridView.m6813a().notifyDataSetChanged();
        } else {
            C2137ag c2137ag = new C2137ag(m6821b, this.f9566b, this.f9565a);
            materialCalendarGridView.setNumColumns(m6821b.f9542c);
            materialCalendarGridView.setAdapter((ListAdapter) c2137ag);
        }
        materialCalendarGridView.setOnItemClickListener(new C2139ai(this, materialCalendarGridView));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2138ah(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, InterfaceC2175w interfaceC2175w) {
        Month m6797b = calendarConstraints.m6797b();
        Month m6798c = calendarConstraints.m6798c();
        Month m6799d = calendarConstraints.m6799d();
        if (m6797b.compareTo(m6799d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (m6799d.compareTo(m6798c) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f9568d = (C2137ag.f9560a * C2163k.m6878b(context)) + (C2177y.m6900b(context) ? C2163k.m6878b(context) : 0);
        this.f9565a = calendarConstraints;
        this.f9566b = dateSelector;
        this.f9567c = interfaceC2175w;
        m3027c_();
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final long mo3021b(int i) {
        return this.f9565a.m6797b().m6821b(i).m6822c();
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final int mo3020b() {
        return this.f9565a.m6800e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Month m6841d(int i) {
        return this.f9565a.m6797b().m6821b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m6840a(Month month) {
        return this.f9565a.m6797b().m6820b(month);
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ C2140aj mo3015a(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (C2177y.m6900b(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new C0861bn(-1, this.f9568d));
            return new C2140aj(linearLayout, true);
        }
        return new C2140aj(linearLayout, false);
    }
}
