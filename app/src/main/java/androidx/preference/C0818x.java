package androidx.preference;

import android.widget.CompoundButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwitchPreferenceCompat.java */
/* renamed from: androidx.preference.x */
/* loaded from: classes.dex */
public final class C0818x implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreferenceCompat f3338a;

    public C0818x(SwitchPreferenceCompat switchPreferenceCompat) {
        this.f3338a = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = this.f3338a;
        Boolean.valueOf(z);
        if (!switchPreferenceCompat.m2720o()) {
            compoundButton.setChecked(!z);
        } else {
            this.f3338a.m2730d(z);
        }
    }
}
