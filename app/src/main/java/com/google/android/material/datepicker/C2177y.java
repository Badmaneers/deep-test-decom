package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import androidx.fragment.app.AbstractC0671ao;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p074c.ViewOnTouchListenerC2107a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p082k.C2295h;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.y */
/* loaded from: classes.dex */
public final class C2177y<S> extends DialogInterfaceOnCancelListenerC0691c {

    /* renamed from: ae */
    static final Object f9654ae = "CONFIRM_BUTTON_TAG";

    /* renamed from: af */
    static final Object f9655af = "CANCEL_BUTTON_TAG";

    /* renamed from: ag */
    static final Object f9656ag = "TOGGLE_BUTTON_TAG";

    /* renamed from: ah */
    private final LinkedHashSet<Object<? super S>> f9657ah = new LinkedHashSet<>();

    /* renamed from: ai */
    private final LinkedHashSet<View.OnClickListener> f9658ai = new LinkedHashSet<>();

    /* renamed from: aj */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f9659aj = new LinkedHashSet<>();

    /* renamed from: ak */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f9660ak = new LinkedHashSet<>();

    /* renamed from: al */
    private int f9661al;

    /* renamed from: am */
    private DateSelector<S> f9662am;

    /* renamed from: an */
    private AbstractC2142al<S> f9663an;

    /* renamed from: ao */
    private CalendarConstraints f9664ao;

    /* renamed from: ap */
    private C2163k<S> f9665ap;

    /* renamed from: aq */
    private int f9666aq;

    /* renamed from: ar */
    private CharSequence f9667ar;

    /* renamed from: as */
    private boolean f9668as;

    /* renamed from: at */
    private int f9669at;

    /* renamed from: au */
    private TextView f9670au;

    /* renamed from: av */
    private CheckableImageButton f9671av;

    /* renamed from: aw */
    private C2295h f9672aw;

    /* renamed from: ax */
    private Button f9673ax;

    /* renamed from: ad */
    public static long m6896ad() {
        return Month.m6814a().f9544e;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c, androidx.fragment.app.Fragment
    /* renamed from: d */
    public final void mo2299d(Bundle bundle) {
        super.mo2299d(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9661al);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9662am);
        C2154b c2154b = new C2154b(this.f9664ao);
        if (this.f9665ap.m6888c() != null) {
            c2154b.m6866a(this.f9665ap.m6888c().f9544e);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2154b.m6865a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9666aq);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9667ar);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c, androidx.fragment.app.Fragment
    /* renamed from: a */
    public final void mo2280a(Bundle bundle) {
        super.mo2280a(bundle);
        if (bundle == null) {
            bundle = m2312m();
        }
        this.f9661al = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f9662am = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9664ao = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9666aq = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9667ar = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f9669at = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: c */
    private int m6901c(Context context) {
        if (this.f9661al != 0) {
            return this.f9661al;
        }
        return this.f9662am.mo6807b(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c
    /* renamed from: g */
    public final Dialog mo2430g() {
        Dialog dialog = new Dialog(m2314o(), m6901c(m2314o()));
        Context context = dialog.getContext();
        this.f9668as = m6900b(context);
        int m7041a = C2220c.m7041a(context, R.attr.colorSurface, C2177y.class.getCanonicalName());
        this.f9672aw = new C2295h(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f9672aw.m7276a(context);
        this.f9672aw.m7282g(ColorStateList.valueOf(m7041a));
        this.f9672aw.m7288r(C0538w.m1888q(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final View mo2273a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f9668as ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f9668as) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m6903d(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m6903d(context), -1));
            Resources resources = m2314o().getResources();
            findViewById2.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (C2137ag.f9560a * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((C2137ag.f9560a - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        this.f9670au = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        C0538w.m1882k(this.f9670au);
        this.f9671av = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        if (this.f9667ar != null) {
            textView.setText(this.f9667ar);
        } else {
            textView.setText(this.f9666aq);
        }
        this.f9671av.setTag(f9656ag);
        CheckableImageButton checkableImageButton = this.f9671av;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C0057a.m46b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0057a.m46b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f9671av.setChecked(this.f9669at != 0);
        C0538w.m1849a(this.f9671av, (C0479a) null);
        m6895a(this.f9671av);
        this.f9671av.setOnClickListener(new ViewOnClickListenerC2133ac(this));
        this.f9673ax = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.f9662am.mo6808b()) {
            this.f9673ax.setEnabled(true);
        } else {
            this.f9673ax.setEnabled(false);
        }
        this.f9673ax.setTag(f9654ae);
        this.f9673ax.setOnClickListener(new ViewOnClickListenerC2178z(this));
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag(f9655af);
        button.setOnClickListener(new ViewOnClickListenerC2131aa(this));
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c, androidx.fragment.app.Fragment
    /* renamed from: h */
    public final void mo2305h() {
        super.mo2305h();
        Window window = m2429e().getWindow();
        if (this.f9668as) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f9672aw);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m2317r().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9672aw, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC2107a(m2429e(), rect));
        }
        m6898ag();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c, androidx.fragment.app.Fragment
    /* renamed from: i */
    public final void mo2307i() {
        this.f9663an.m6843ag();
        super.mo2307i();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f9659aj.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0691c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f9660ak.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m2322w();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: ae */
    public final S m6908ae() {
        return this.f9662am.mo6804a();
    }

    /* renamed from: ag */
    public void m6898ag() {
        this.f9665ap = C2163k.m6877a(this.f9662am, m6901c(m2314o()), this.f9664ao);
        this.f9663an = this.f9671av.isChecked() ? C2134ad.m6835a(this.f9662am, this.f9664ao) : this.f9665ap;
        m6897af();
        AbstractC0671ao mo2473a = m2319t().mo2473a();
        mo2473a.m2372a(R.id.mtrl_calendar_frame, this.f9663an);
        mo2473a.mo2352d();
        this.f9663an.m6842a(new C2132ab(this));
    }

    /* renamed from: a */
    public void m6895a(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f9671av.isChecked()) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f9671av.setContentDescription(string);
    }

    /* renamed from: b */
    public static boolean m6900b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2220c.m7041a(context, R.attr.materialCalendarStyle, C2163k.class.getCanonicalName()), new int[]{android.R.attr.windowFullscreen});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: d */
    private static int m6903d(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = Month.m6814a().f9542c;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: af */
    public void m6897af() {
        String mo6805a = this.f9662am.mo6805a(m2313n());
        this.f9670au.setContentDescription(String.format(m2275a(R.string.mtrl_picker_announce_current_selection), mo6805a));
        this.f9670au.setText(mo6805a);
    }
}
