package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import androidx.core.content.p020a.C0435o;
import java.util.List;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private boolean f3245A;

    /* renamed from: B */
    private boolean f3246B;

    /* renamed from: C */
    private int f3247C;

    /* renamed from: D */
    private int f3248D;

    /* renamed from: E */
    private List<Preference> f3249E;

    /* renamed from: F */
    private InterfaceC0807l f3250F;

    /* renamed from: G */
    private final View.OnClickListener f3251G;

    /* renamed from: a */
    private Context f3252a;

    /* renamed from: b */
    private C0812q f3253b;

    /* renamed from: c */
    private AbstractC0808m f3254c;

    /* renamed from: d */
    private InterfaceC0805j f3255d;

    /* renamed from: e */
    private InterfaceC0806k f3256e;

    /* renamed from: f */
    private int f3257f;

    /* renamed from: g */
    private int f3258g;

    /* renamed from: h */
    private CharSequence f3259h;

    /* renamed from: i */
    private CharSequence f3260i;

    /* renamed from: j */
    private int f3261j;

    /* renamed from: k */
    private String f3262k;

    /* renamed from: l */
    private Intent f3263l;

    /* renamed from: m */
    private String f3264m;

    /* renamed from: n */
    private boolean f3265n;

    /* renamed from: o */
    private boolean f3266o;

    /* renamed from: p */
    private boolean f3267p;

    /* renamed from: q */
    private String f3268q;

    /* renamed from: r */
    private Object f3269r;

    /* renamed from: s */
    private boolean f3270s;

    /* renamed from: t */
    private boolean f3271t;

    /* renamed from: u */
    private boolean f3272u;

    /* renamed from: v */
    private boolean f3273v;

    /* renamed from: w */
    private boolean f3274w;

    /* renamed from: x */
    private boolean f3275x;

    /* renamed from: y */
    private boolean f3276y;

    /* renamed from: z */
    private boolean f3277z;

    /* renamed from: a */
    protected Object mo2694a(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: a */
    public void mo2691a() {
    }

    /* renamed from: b */
    public void mo2693b() {
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        if (this.f3257f != preference2.f3257f) {
            return this.f3257f - preference2.f3257f;
        }
        if (this.f3259h == preference2.f3259h) {
            return 0;
        }
        if (this.f3259h == null) {
            return 1;
        }
        if (preference2.f3259h == null) {
            return -1;
        }
        return this.f3259h.toString().compareToIgnoreCase(preference2.f3259h.toString());
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f3257f = Integer.MAX_VALUE;
        this.f3258g = 0;
        this.f3265n = true;
        this.f3266o = true;
        this.f3267p = true;
        this.f3270s = true;
        this.f3271t = true;
        this.f3272u = true;
        this.f3273v = true;
        this.f3274w = true;
        this.f3276y = true;
        this.f3246B = true;
        this.f3247C = R.layout.preference;
        this.f3251G = new ViewOnClickListenerC0803h(this);
        this.f3252a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i, 0);
        this.f3261j = C0435o.m1537a(obtainStyledAttributes, R.styleable.Preference_icon, R.styleable.Preference_android_icon, 0);
        this.f3262k = C0435o.m1546b(obtainStyledAttributes, R.styleable.Preference_key, R.styleable.Preference_android_key);
        this.f3259h = C0435o.m1547c(obtainStyledAttributes, R.styleable.Preference_title, R.styleable.Preference_android_title);
        this.f3260i = C0435o.m1547c(obtainStyledAttributes, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        this.f3257f = C0435o.m1536a(obtainStyledAttributes, R.styleable.Preference_order, R.styleable.Preference_android_order);
        this.f3264m = C0435o.m1546b(obtainStyledAttributes, R.styleable.Preference_fragment, R.styleable.Preference_android_fragment);
        this.f3247C = C0435o.m1537a(obtainStyledAttributes, R.styleable.Preference_layout, R.styleable.Preference_android_layout, R.layout.preference);
        this.f3248D = C0435o.m1537a(obtainStyledAttributes, R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
        this.f3265n = C0435o.m1543a(obtainStyledAttributes, R.styleable.Preference_enabled, R.styleable.Preference_android_enabled, true);
        this.f3266o = C0435o.m1543a(obtainStyledAttributes, R.styleable.Preference_selectable, R.styleable.Preference_android_selectable, true);
        this.f3267p = C0435o.m1543a(obtainStyledAttributes, R.styleable.Preference_persistent, R.styleable.Preference_android_persistent, true);
        this.f3268q = C0435o.m1546b(obtainStyledAttributes, R.styleable.Preference_dependency, R.styleable.Preference_android_dependency);
        int i2 = R.styleable.Preference_allowDividerAbove;
        this.f3273v = C0435o.m1543a(obtainStyledAttributes, i2, i2, this.f3266o);
        int i3 = R.styleable.Preference_allowDividerBelow;
        this.f3274w = C0435o.m1543a(obtainStyledAttributes, i3, i3, this.f3266o);
        if (obtainStyledAttributes.hasValue(R.styleable.Preference_defaultValue)) {
            this.f3269r = mo2694a(obtainStyledAttributes, R.styleable.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(R.styleable.Preference_android_defaultValue)) {
            this.f3269r = mo2694a(obtainStyledAttributes, R.styleable.Preference_android_defaultValue);
        }
        this.f3246B = C0435o.m1543a(obtainStyledAttributes, R.styleable.Preference_shouldDisableView, R.styleable.Preference_android_shouldDisableView, true);
        this.f3275x = obtainStyledAttributes.hasValue(R.styleable.Preference_singleLineTitle);
        if (this.f3275x) {
            this.f3276y = C0435o.m1543a(obtainStyledAttributes, R.styleable.Preference_singleLineTitle, R.styleable.Preference_android_singleLineTitle, true);
        }
        this.f3277z = C0435o.m1543a(obtainStyledAttributes, R.styleable.Preference_iconSpaceReserved, R.styleable.Preference_android_iconSpaceReserved, false);
        int i4 = R.styleable.Preference_isPreferenceVisible;
        this.f3272u = C0435o.m1543a(obtainStyledAttributes, i4, i4, true);
        int i5 = R.styleable.Preference_enableCopying;
        this.f3245A = C0435o.m1543a(obtainStyledAttributes, i5, i5, false);
        obtainStyledAttributes.recycle();
    }

    public Preference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0435o.m1535a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle), (byte) 0);
    }

    /* renamed from: i */
    public final Intent m2714i() {
        return this.f3263l;
    }

    /* renamed from: j */
    public final String m2715j() {
        return this.f3264m;
    }

    /* renamed from: c */
    private AbstractC0808m m2706c() {
        if (this.f3254c != null) {
            return this.f3254c;
        }
        if (this.f3253b != null) {
            return this.f3253b.m2737a();
        }
        return null;
    }

    /* renamed from: k */
    public final CharSequence m2716k() {
        return this.f3259h;
    }

    /* renamed from: l */
    public boolean mo2717l() {
        return this.f3265n && this.f3270s && this.f3271t;
    }

    /* renamed from: m */
    public final boolean m2718m() {
        return !TextUtils.isEmpty(this.f3262k);
    }

    /* renamed from: e */
    private boolean m2707e() {
        return this.f3253b != null && this.f3267p && m2718m();
    }

    /* renamed from: a */
    public final void m2708a(InterfaceC0807l interfaceC0807l) {
        this.f3250F = interfaceC0807l;
        mo2693b();
    }

    /* renamed from: n */
    public final InterfaceC0807l m2719n() {
        return this.f3250F;
    }

    /* renamed from: o */
    public final boolean m2720o() {
        return this.f3255d == null || this.f3255d.m2735a();
    }

    /* renamed from: p */
    public final InterfaceC0805j m2721p() {
        return this.f3255d;
    }

    /* renamed from: q */
    public final Context m2722q() {
        return this.f3252a;
    }

    /* renamed from: a */
    public void mo2709a(boolean z) {
        List<Preference> list = this.f3249E;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = list.get(i);
            if (preference.f3270s == z) {
                preference.f3270s = !z;
                preference.mo2709a(preference.mo2696d());
                preference.mo2693b();
            }
        }
    }

    /* renamed from: b */
    public final void m2711b(boolean z) {
        if (this.f3271t == z) {
            this.f3271t = !z;
            mo2709a(mo2696d());
            mo2693b();
        }
    }

    /* renamed from: d */
    public boolean mo2696d() {
        return !mo2717l();
    }

    /* renamed from: a */
    private void m2705a(SharedPreferences.Editor editor) {
        if (this.f3253b.m2740d()) {
            editor.apply();
        }
    }

    /* renamed from: b */
    public final boolean m2712b(String str) {
        if (!m2707e()) {
            return false;
        }
        String str2 = null;
        if (m2707e() && m2706c() == null) {
            str2 = this.f3253b.m2738b().getString(this.f3262k, null);
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        if (m2706c() == null) {
            SharedPreferences.Editor m2739c = this.f3253b.m2739c();
            m2739c.putString(this.f3262k, str);
            m2705a(m2739c);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    /* renamed from: a */
    public final boolean m2710a(int i) {
        if (!m2707e()) {
            return false;
        }
        int i2 = ~i;
        if (m2707e() && m2706c() == null) {
            i2 = this.f3253b.m2738b().getInt(this.f3262k, i2);
        }
        if (i == i2) {
            return true;
        }
        if (m2706c() == null) {
            SharedPreferences.Editor m2739c = this.f3253b.m2739c();
            m2739c.putInt(this.f3262k, i);
            m2705a(m2739c);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    /* renamed from: c */
    public final boolean m2713c(boolean z) {
        if (!m2707e()) {
            return false;
        }
        boolean z2 = !z;
        if (m2707e() && m2706c() == null) {
            z2 = this.f3253b.m2738b().getBoolean(this.f3262k, z2);
        }
        if (z == z2) {
            return true;
        }
        if (m2706c() == null) {
            SharedPreferences.Editor m2739c = this.f3253b.m2739c();
            m2739c.putBoolean(this.f3262k, z);
            m2705a(m2739c);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    /* renamed from: f */
    public CharSequence mo2702f() {
        if (this.f3250F != null) {
            return this.f3250F.mo2733a(this);
        }
        return this.f3260i;
    }

    /* loaded from: classes.dex */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C0804i();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: a */
    public void mo2690a(View view) {
        InterfaceC0813s m2741e;
        if (mo2717l() && this.f3266o) {
            mo2691a();
            if (this.f3256e == null || !this.f3256e.m2736a()) {
                C0812q c0812q = this.f3253b;
                if ((c0812q == null || (m2741e = c0812q.m2741e()) == null || !m2741e.m2742a()) && this.f3263l != null) {
                    this.f3252a.startActivity(this.f3263l);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f3259h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence mo2702f = mo2702f();
        if (!TextUtils.isEmpty(mo2702f)) {
            sb.append(mo2702f);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
