package androidx.preference;

import android.widget.CompoundButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwitchPreference.java */
/* renamed from: androidx.preference.w */
/* loaded from: classes.dex */
public final class C0817w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f3337a;

    public C0817w(SwitchPreference switchPreference) {
        this.f3337a = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreference switchPreference = this.f3337a;
        Boolean.valueOf(z);
        if (!switchPreference.m2720o()) {
            compoundButton.setChecked(!z);
        } else {
            this.f3337a.m2730d(z);
        }
    }
}
