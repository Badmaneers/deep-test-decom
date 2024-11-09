package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;
import com.google.android.material.R;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
final class C2169q extends C0479a {

    /* renamed from: a */
    final /* synthetic */ C2163k f9641a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2169q(C2163k c2163k) {
        this.f9641a = c2163k;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        View view2;
        String a2;
        super.mo1626a(view, c0482c);
        view2 = this.f9641a.f9627aj;
        if (view2.getVisibility() == 0) {
            a2 = this.f9641a.m2275a(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            a2 = this.f9641a.m2275a(R.string.mtrl_picker_toggle_to_day_selection);
        }
        c0482c.m1678f(a2);
    }
}
