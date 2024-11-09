package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.C0831ak;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C2163k<S> extends AbstractC2142al<S> {

    /* renamed from: a */
    static final Object f9618a = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: b */
    static final Object f9619b = "NAVIGATION_PREV_TAG";

    /* renamed from: c */
    static final Object f9620c = "NAVIGATION_NEXT_TAG";

    /* renamed from: d */
    static final Object f9621d = "SELECTOR_TOGGLE_TAG";

    /* renamed from: ae */
    private int f9622ae;

    /* renamed from: af */
    private C2156d f9623af;

    /* renamed from: ag */
    private RecyclerView f9624ag;

    /* renamed from: ah */
    private RecyclerView f9625ah;

    /* renamed from: ai */
    private View f9626ai;

    /* renamed from: aj */
    private View f9627aj;

    /* renamed from: f */
    private int f9628f;

    /* renamed from: g */
    private DateSelector<S> f9629g;

    /* renamed from: h */
    private CalendarConstraints f9630h;

    /* renamed from: i */
    private Month f9631i;

    /* renamed from: a */
    public static <T> C2163k<T> m6877a(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C2163k<T> c2163k = new C2163k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m6799d());
        c2163k.m2301e(bundle);
        return c2163k;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d */
    public final void mo2299d(Bundle bundle) {
        super.mo2299d(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9628f);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f9629g);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9630h);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9631i);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final void mo2280a(Bundle bundle) {
        super.mo2280a(bundle);
        if (bundle == null) {
            bundle = m2312m();
        }
        this.f9628f = bundle.getInt("THEME_RES_ID_KEY");
        this.f9629g = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f9630h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9631i = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final View mo2273a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m2313n(), this.f9628f);
        this.f9623af = new C2156d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m6797b = this.f9630h.m6797b();
        if (C2177y.m6900b(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        C0538w.m1849a(gridView, new C2164l(this));
        gridView.setAdapter((ListAdapter) new C2162j());
        gridView.setNumColumns(m6797b.f9542c);
        gridView.setEnabled(false);
        this.f9625ah = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f9625ah.setLayoutManager(new C2166n(this, i2, i2));
        this.f9625ah.setTag(f9618a);
        C2138ah c2138ah = new C2138ah(contextThemeWrapper, this.f9629g, this.f9630h, new C2167o(this));
        this.f9625ah.setAdapter(c2138ah);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        this.f9624ag = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        if (this.f9624ag != null) {
            this.f9624ag.setHasFixedSize(true);
            this.f9624ag.setLayoutManager(new GridLayoutManager(integer));
            this.f9624ag.setAdapter(new C2151au(this));
            this.f9624ag.addItemDecoration(new C2168p(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag(f9621d);
            C0538w.m1849a(materialButton, new C2169q(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag(f9619b);
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag(f9620c);
            this.f9626ai = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f9627aj = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m6889d(C2174v.f9650a);
            materialButton.setText(this.f9631i.m6823d());
            this.f9625ah.addOnScrollListener(new C2170r(this, c2138ah, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC2171s(this));
            materialButton3.setOnClickListener(new ViewOnClickListenerC2172t(this, c2138ah));
            materialButton2.setOnClickListener(new ViewOnClickListenerC2173u(this, c2138ah));
        }
        if (!C2177y.m6900b(contextThemeWrapper)) {
            new C0831ak().m3240a(this.f9625ah);
        }
        this.f9625ah.scrollToPosition(c2138ah.m6840a(this.f9631i));
        return inflate;
    }

    /* renamed from: c */
    public final Month m6888c() {
        return this.f9631i;
    }

    /* renamed from: e */
    public final CalendarConstraints m6890e() {
        return this.f9630h;
    }

    /* renamed from: a */
    public final void m6884a(Month month) {
        C2138ah c2138ah = (C2138ah) this.f9625ah.getAdapter();
        int m6840a = c2138ah.m6840a(month);
        int m6840a2 = m6840a - c2138ah.m6840a(this.f9631i);
        boolean z = Math.abs(m6840a2) > 3;
        boolean z2 = m6840a2 > 0;
        this.f9631i = month;
        if (z && z2) {
            this.f9625ah.scrollToPosition(m6840a - 3);
        } else if (z) {
            this.f9625ah.scrollToPosition(m6840a + 3);
        }
        this.f9625ah.post(new RunnableC2165m(this, m6840a));
    }

    /* renamed from: g */
    public final DateSelector<S> m6891g() {
        return this.f9629g;
    }

    /* renamed from: ad */
    public final C2156d m6885ad() {
        return this.f9623af;
    }

    /* renamed from: b */
    public static int m6878b(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: d */
    public final void m6889d(int i) {
        this.f9622ae = i;
        if (i == C2174v.f9651b) {
            this.f9624ag.getLayoutManager().mo2836d(((C2151au) this.f9624ag.getAdapter()).m6864d(this.f9631i.f9541b));
            this.f9626ai.setVisibility(0);
            this.f9627aj.setVisibility(8);
        } else if (i == C2174v.f9650a) {
            this.f9626ai.setVisibility(8);
            this.f9627aj.setVisibility(0);
            m6884a(this.f9631i);
        }
    }

    /* renamed from: ae */
    public final void m6886ae() {
        if (this.f9622ae == C2174v.f9651b) {
            m6889d(C2174v.f9650a);
        } else if (this.f9622ae == C2174v.f9650a) {
            m6889d(C2174v.f9651b);
        }
    }

    /* renamed from: af */
    public final LinearLayoutManager m6887af() {
        return (LinearLayoutManager) this.f9625ah.getLayoutManager();
    }
}
