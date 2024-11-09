package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p023f.C0473d;
import java.util.Collection;

/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: a */
    View mo6803a(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, InterfaceC2141ak<S> interfaceC2141ak);

    /* renamed from: a */
    S mo6804a();

    /* renamed from: a */
    String mo6805a(Context context);

    /* renamed from: a */
    void mo6806a(long j);

    /* renamed from: b */
    int mo6807b(Context context);

    /* renamed from: b */
    boolean mo6808b();

    /* renamed from: c */
    Collection<Long> mo6809c();

    /* renamed from: d */
    Collection<C0473d<Long, Long>> mo6810d();
}
