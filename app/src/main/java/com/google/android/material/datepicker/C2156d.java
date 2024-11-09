package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C2156d {

    /* renamed from: a */
    final C2155c f9601a;

    /* renamed from: b */
    final C2155c f9602b;

    /* renamed from: c */
    final C2155c f9603c;

    /* renamed from: d */
    final C2155c f9604d;

    /* renamed from: e */
    final C2155c f9605e;

    /* renamed from: f */
    final C2155c f9606f;

    /* renamed from: g */
    final C2155c f9607g;

    /* renamed from: h */
    final Paint f9608h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2156d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2220c.m7041a(context, R.attr.materialCalendarStyle, C2163k.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f9601a = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f9607g = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f9602b = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f9603c = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m7045a = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f9604d = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f9605e = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f9606f = C2155c.m6867a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        this.f9608h = new Paint();
        this.f9608h.setColor(m7045a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
