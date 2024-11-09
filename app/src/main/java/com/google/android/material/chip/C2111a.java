package com.google.android.material.chip;

import android.graphics.Typeface;
import com.google.android.material.p079h.AbstractC2226i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Chip.java */
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public final class C2111a extends AbstractC2226i {

    /* renamed from: a */
    final /* synthetic */ Chip f9436a;

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6646a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2111a(Chip chip) {
        this.f9436a = chip;
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6647a(Typeface typeface, boolean z) {
        C2114d c2114d;
        CharSequence text;
        C2114d c2114d2;
        Chip chip = this.f9436a;
        c2114d = this.f9436a.f9410e;
        if (c2114d.m6678J()) {
            c2114d2 = this.f9436a.f9410e;
            text = c2114d2.m6735l();
        } else {
            text = this.f9436a.getText();
        }
        chip.setText(text);
        this.f9436a.requestLayout();
        this.f9436a.invalidate();
    }
}
