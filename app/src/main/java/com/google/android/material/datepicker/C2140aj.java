package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.AbstractC0879ce;
import com.google.android.material.R;

/* compiled from: MonthsPagerAdapter.java */
/* renamed from: com.google.android.material.datepicker.aj */
/* loaded from: classes.dex */
public final class C2140aj extends AbstractC0879ce {

    /* renamed from: q */
    final TextView f9571q;

    /* renamed from: r */
    final MaterialCalendarGridView f9572r;

    public C2140aj(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        this.f9571q = (TextView) linearLayout.findViewById(R.id.month_title);
        C0538w.m1828L(this.f9571q);
        this.f9572r = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        this.f9571q.setVisibility(8);
    }
}
