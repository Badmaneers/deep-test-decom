package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: a */
    private final Context f3229a;

    /* renamed from: b */
    private final ArrayAdapter f3230b;

    /* renamed from: c */
    private Spinner f3231c;

    /* renamed from: d */
    private final AdapterView.OnItemSelectedListener f3232d;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle);
    }

    private DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private DropDownPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        this.f3232d = new C0797b(this);
        this.f3229a = context;
        this.f3230b = new ArrayAdapter(this.f3229a, android.R.layout.simple_spinner_dropdown_item);
        m2692r();
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: a */
    public final void mo2691a() {
        this.f3231c.performClick();
    }

    /* renamed from: r */
    private void m2692r() {
        this.f3230b.clear();
        if (m2700c() != null) {
            for (CharSequence charSequence : m2700c()) {
                this.f3230b.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: b */
    public final void mo2693b() {
        super.mo2693b();
        if (this.f3230b != null) {
            this.f3230b.notifyDataSetChanged();
        }
    }
}
