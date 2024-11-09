package com.color.support.preference;

import android.widget.CompoundButton;

/* compiled from: ColorSwitchLoadingPreference.java */
/* renamed from: com.color.support.preference.b */
/* loaded from: classes.dex */
final class C1332b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ ColorSwitchLoadingPreference f5798a;

    private C1332b(ColorSwitchLoadingPreference colorSwitchLoadingPreference) {
        this.f5798a = colorSwitchLoadingPreference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1332b(ColorSwitchLoadingPreference colorSwitchLoadingPreference, byte b) {
        this(colorSwitchLoadingPreference);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ColorSwitchLoadingPreference colorSwitchLoadingPreference = this.f5798a;
        Boolean.valueOf(z);
        if (!ColorSwitchLoadingPreference.m4365a(colorSwitchLoadingPreference)) {
            compoundButton.setChecked(!z);
        } else {
            this.f5798a.m2730d(z);
        }
    }
}
