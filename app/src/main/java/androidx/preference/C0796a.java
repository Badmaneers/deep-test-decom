package androidx.preference;

import android.widget.CompoundButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CheckBoxPreference.java */
/* renamed from: androidx.preference.a */
/* loaded from: classes.dex */
public final class C0796a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3318a;

    public C0796a(CheckBoxPreference checkBoxPreference) {
        this.f3318a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBoxPreference checkBoxPreference = this.f3318a;
        Boolean.valueOf(z);
        if (!checkBoxPreference.m2720o()) {
            compoundButton.setChecked(!z);
        } else {
            this.f3318a.m2730d(z);
        }
    }
}
