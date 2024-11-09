package androidx.preference;

import android.text.TextUtils;

/* compiled from: EditTextPreference.java */
/* renamed from: androidx.preference.d */
/* loaded from: classes.dex */
public final class C0799d implements InterfaceC0807l<EditTextPreference> {

    /* renamed from: a */
    private static C0799d f3320a;

    @Override // androidx.preference.InterfaceC0807l
    /* renamed from: a */
    public final /* synthetic */ CharSequence mo2733a(EditTextPreference editTextPreference) {
        EditTextPreference editTextPreference2 = editTextPreference;
        if (TextUtils.isEmpty(editTextPreference2.m2695c())) {
            return editTextPreference2.m2722q().getString(R.string.not_set);
        }
        return editTextPreference2.m2695c();
    }

    private C0799d() {
    }

    /* renamed from: a */
    public static C0799d m2732a() {
        if (f3320a == null) {
            f3320a = new C0799d();
        }
        return f3320a;
    }
}
