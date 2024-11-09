package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
final class C2162j extends BaseAdapter {

    /* renamed from: d */
    private static final int f9614d;

    /* renamed from: a */
    private final Calendar f9615a = C2150at.m6855b();

    /* renamed from: b */
    private final int f9616b = this.f9615a.getMaximum(7);

    /* renamed from: c */
    private final int f9617c = this.f9615a.getFirstDayOfWeek();

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    static {
        f9614d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f9616b;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f9615a.set(7, m6874a(i));
        textView.setText(this.f9615a.getDisplayName(7, f9614d, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f9615a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    /* renamed from: a */
    private int m6874a(int i) {
        int i2 = i + this.f9617c;
        return i2 > this.f9616b ? i2 - this.f9616b : i2;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        if (i >= this.f9616b) {
            return null;
        }
        return Integer.valueOf(m6874a(i));
    }
}
