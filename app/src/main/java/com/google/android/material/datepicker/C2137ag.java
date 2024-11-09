package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthAdapter.java */
/* renamed from: com.google.android.material.datepicker.ag */
/* loaded from: classes.dex */
public class C2137ag extends BaseAdapter {

    /* renamed from: a */
    static final int f9560a = C2150at.m6855b().getMaximum(4);

    /* renamed from: b */
    final Month f9561b;

    /* renamed from: c */
    final DateSelector<?> f9562c;

    /* renamed from: d */
    C2156d f9563d;

    /* renamed from: e */
    final CalendarConstraints f9564e;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public C2137ag(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f9561b = month;
        this.f9562c = dateSelector;
        this.f9564e = calendarConstraints;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final Long getItem(int i) {
        if (i < this.f9561b.m6819b() || i > m6836a()) {
            return null;
        }
        return Long.valueOf(this.f9561b.m6818a((i - this.f9561b.m6819b()) + 1));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f9561b.f9542c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9561b.f9543d + this.f9561b.m6819b();
    }

    /* renamed from: a */
    public final int m6836a() {
        return (this.f9561b.m6819b() + this.f9561b.f9543d) - 1;
    }

    /* renamed from: b */
    public final int m6838b(int i) {
        return this.f9561b.m6819b() + (i - 1);
    }

    @Override // android.widget.Adapter
    public /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        String format;
        String format2;
        Context context = viewGroup.getContext();
        if (this.f9563d == null) {
            this.f9563d = new C2156d(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int m6819b = i - this.f9561b.m6819b();
        if (m6819b < 0 || m6819b >= this.f9561b.f9543d) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = m6819b + 1;
            textView.setTag(this.f9561b);
            textView.setText(String.valueOf(i2));
            long m6818a = this.f9561b.m6818a(i2);
            if (this.f9561b.f9541b == Month.m6814a().f9541b) {
                Locale locale = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    format2 = C2150at.m6857c(locale).format(new Date(m6818a));
                } else {
                    format2 = C2150at.m6862g(locale).format(new Date(m6818a));
                }
                textView.setContentDescription(format2);
            } else {
                Locale locale2 = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    format = C2150at.m6859d(locale2).format(new Date(m6818a));
                } else {
                    format = C2150at.m6862g(locale2).format(new Date(m6818a));
                }
                textView.setContentDescription(format);
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        if (this.f9564e.m6794a().mo6802a(item.longValue())) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f9562c.mo6809c().iterator();
            while (it.hasNext()) {
                if (C2150at.m6847a(item.longValue()) == C2150at.m6847a(it.next().longValue())) {
                    this.f9563d.f9602b.m6869a(textView);
                    return textView;
                }
            }
            if (C2150at.m6853a(Calendar.getInstance()).getTimeInMillis() == item.longValue()) {
                this.f9563d.f9603c.m6869a(textView);
                return textView;
            }
            this.f9563d.f9601a.m6869a(textView);
            return textView;
        }
        textView.setEnabled(false);
        this.f9563d.f9607g.m6869a(textView);
        return textView;
    }
}
