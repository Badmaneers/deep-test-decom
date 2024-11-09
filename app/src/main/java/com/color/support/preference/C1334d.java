package com.color.support.preference;

import android.widget.CompoundButton;

/* compiled from: ColorSwitchPreferenceCompat.java */
/* renamed from: com.color.support.preference.d */
/* loaded from: classes.dex */
final class C1334d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ ColorSwitchPreferenceCompat f5800a;

    private C1334d(ColorSwitchPreferenceCompat colorSwitchPreferenceCompat) {
        this.f5800a = colorSwitchPreferenceCompat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1334d(ColorSwitchPreferenceCompat colorSwitchPreferenceCompat, byte b) {
        this(colorSwitchPreferenceCompat);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f5800a.m2729c() == z) {
            return;
        }
        ColorSwitchPreferenceCompat colorSwitchPreferenceCompat = this.f5800a;
        Boolean.valueOf(z);
        if (!ColorSwitchPreferenceCompat.m4367a(colorSwitchPreferenceCompat)) {
            compoundButton.setChecked(!z);
        } else {
            this.f5800a.m2730d(z);
        }
    }
}
