package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0845ay;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YearGridAdapter.java */
/* renamed from: com.google.android.material.datepicker.au */
/* loaded from: classes.dex */
public final class C2151au extends AbstractC0845ay<C2153aw> {

    /* renamed from: a */
    private final C2163k<?> f9585a;

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ void mo3019a(C2153aw c2153aw, int i) {
        C2153aw c2153aw2 = c2153aw;
        int i2 = this.f9585a.m6890e().m6797b().f9541b + i;
        String string = c2153aw2.f9588q.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        c2153aw2.f9588q.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        c2153aw2.f9588q.setContentDescription(String.format(string, Integer.valueOf(i2)));
        C2156d m6885ad = this.f9585a.m6885ad();
        Calendar m6852a = C2150at.m6852a();
        C2155c c2155c = m6852a.get(1) == i2 ? m6885ad.f9606f : m6885ad.f9604d;
        Iterator<Long> it = this.f9585a.m6891g().mo6809c().iterator();
        while (it.hasNext()) {
            m6852a.setTimeInMillis(it.next().longValue());
            if (m6852a.get(1) == i2) {
                c2155c = m6885ad.f9605e;
            }
        }
        c2155c.m6869a(c2153aw2.f9588q);
        c2153aw2.f9588q.setOnClickListener(new ViewOnClickListenerC2152av(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2151au(C2163k<?> c2163k) {
        this.f9585a = c2163k;
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final int mo3020b() {
        return this.f9585a.m6890e().m6801f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m6864d(int i) {
        return i - this.f9585a.m6890e().m6797b().f9541b;
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ C2153aw mo3015a(ViewGroup viewGroup, int i) {
        return new C2153aw((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
