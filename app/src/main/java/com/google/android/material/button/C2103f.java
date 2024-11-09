package com.google.android.material.button;

import android.view.View;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0485f;

/* compiled from: MaterialButtonToggleGroup.java */
/* renamed from: com.google.android.material.button.f */
/* loaded from: classes.dex */
final class C2103f extends C0479a {

    /* renamed from: a */
    final /* synthetic */ MaterialButtonToggleGroup f9359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2103f(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f9359a = materialButtonToggleGroup;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        c0482c.m1661b(C0485f.m1715a(0, 1, MaterialButtonToggleGroup.m6510a(this.f9359a, view), 1, ((MaterialButton) view).isChecked()));
    }
}
