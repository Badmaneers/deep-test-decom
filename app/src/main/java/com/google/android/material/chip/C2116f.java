package com.google.android.material.chip;

import android.widget.CompoundButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChipGroup.java */
/* renamed from: com.google.android.material.chip.f */
/* loaded from: classes.dex */
public final class C2116f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ ChipGroup f9503a;

    private C2116f(ChipGroup chipGroup) {
        this.f9503a = chipGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2116f(ChipGroup chipGroup, byte b) {
        this(chipGroup);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (ChipGroup.m6639a(this.f9503a)) {
            return;
        }
        if (this.f9503a.getCheckedChipIds().isEmpty() && ChipGroup.m6641b(this.f9503a)) {
            ChipGroup.m6638a(this.f9503a, compoundButton.getId(), true);
            ChipGroup.m6637a(this.f9503a, compoundButton.getId());
            return;
        }
        int id = compoundButton.getId();
        if (z) {
            if (ChipGroup.m6642c(this.f9503a) != -1 && ChipGroup.m6642c(this.f9503a) != id && ChipGroup.m6643d(this.f9503a)) {
                ChipGroup.m6638a(this.f9503a, ChipGroup.m6642c(this.f9503a), false);
            }
            ChipGroup.m6640b(this.f9503a, id);
            return;
        }
        if (ChipGroup.m6642c(this.f9503a) == id) {
            ChipGroup.m6640b(this.f9503a, -1);
        }
    }
}
