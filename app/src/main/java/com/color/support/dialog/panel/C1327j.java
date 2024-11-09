package com.color.support.dialog.panel;

import android.view.View;
import androidx.core.p024g.p025a.InterfaceC0491l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorGuideBehavior.java */
/* renamed from: com.color.support.dialog.panel.j */
/* loaded from: classes.dex */
public final class C1327j implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ int f5688a;

    /* renamed from: b */
    final /* synthetic */ ColorGuideBehavior f5689b;

    public C1327j(ColorGuideBehavior colorGuideBehavior, int i) {
        this.f5689b = colorGuideBehavior;
        this.f5688a = i;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        this.f5689b.mo4357e(this.f5688a);
        return true;
    }
}
