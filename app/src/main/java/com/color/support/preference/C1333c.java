package com.color.support.preference;

import android.widget.CompoundButton;

/* compiled from: ColorSwitchPreference.java */
/* renamed from: com.color.support.preference.c */
/* loaded from: classes.dex */
final class C1333c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ ColorSwitchPreference f5799a;

    private C1333c(ColorSwitchPreference colorSwitchPreference) {
        this.f5799a = colorSwitchPreference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1333c(ColorSwitchPreference colorSwitchPreference, byte b) {
        this(colorSwitchPreference);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f5799a.m2729c() == z) {
            return;
        }
        ColorSwitchPreference colorSwitchPreference = this.f5799a;
        Boolean.valueOf(z);
        if (!ColorSwitchPreference.m4366a(colorSwitchPreference)) {
            compoundButton.setChecked(!z);
        } else {
            this.f5799a.m2730d(z);
        }
    }
}
