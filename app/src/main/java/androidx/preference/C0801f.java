package androidx.preference;

import android.text.TextUtils;

/* compiled from: ListPreference.java */
/* renamed from: androidx.preference.f */
/* loaded from: classes.dex */
public final class C0801f implements InterfaceC0807l<ListPreference> {

    /* renamed from: a */
    private static C0801f f3321a;

    @Override // androidx.preference.InterfaceC0807l
    /* renamed from: a */
    public final /* synthetic */ CharSequence mo2733a(ListPreference listPreference) {
        ListPreference listPreference2 = listPreference;
        if (TextUtils.isEmpty(listPreference2.m2704h())) {
            return listPreference2.m2722q().getString(R.string.not_set);
        }
        return listPreference2.m2704h();
    }

    private C0801f() {
    }

    /* renamed from: a */
    public static C0801f m2734a() {
        if (f3321a == null) {
            f3321a = new C0801f();
        }
        return f3321a;
    }
}
