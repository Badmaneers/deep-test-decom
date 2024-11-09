package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p072a.InterfaceC2042k;
import com.google.android.material.p082k.C2295h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.b */
/* loaded from: classes.dex */
public final class C2072b implements InterfaceC2042k<FloatingActionButton> {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f9174a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2072b(BottomAppBar bottomAppBar) {
        this.f9174a = bottomAppBar;
    }

    @Override // com.google.android.material.p072a.InterfaceC2042k
    /* renamed from: a */
    public final /* synthetic */ void mo6262a(FloatingActionButton floatingActionButton) {
        C2082l topEdgeTreatment;
        C2082l topEdgeTreatment2;
        C2295h c2295h;
        C2082l topEdgeTreatment3;
        C2295h c2295h2;
        C2082l topEdgeTreatment4;
        C2295h c2295h3;
        FloatingActionButton floatingActionButton2 = floatingActionButton;
        float translationX = floatingActionButton2.getTranslationX();
        topEdgeTreatment = this.f9174a.getTopEdgeTreatment();
        if (topEdgeTreatment.m6449b() != translationX) {
            topEdgeTreatment4 = this.f9174a.getTopEdgeTreatment();
            topEdgeTreatment4.m6450b(translationX);
            c2295h3 = this.f9174a.f9151i;
            c2295h3.invalidateSelf();
        }
        float max = Math.max(0.0f, -floatingActionButton2.getTranslationY());
        topEdgeTreatment2 = this.f9174a.getTopEdgeTreatment();
        if (topEdgeTreatment2.m6451c() != max) {
            topEdgeTreatment3 = this.f9174a.getTopEdgeTreatment();
            topEdgeTreatment3.m6452c(max);
            c2295h2 = this.f9174a.f9151i;
            c2295h2.invalidateSelf();
        }
        c2295h = this.f9174a.f9151i;
        c2295h.m7286p(floatingActionButton2.getVisibility() == 0 ? floatingActionButton2.getScaleY() : 0.0f);
    }

    @Override // com.google.android.material.p072a.InterfaceC2042k
    /* renamed from: b */
    public final /* synthetic */ void mo6263b(FloatingActionButton floatingActionButton) {
        C2295h c2295h;
        FloatingActionButton floatingActionButton2 = floatingActionButton;
        c2295h = this.f9174a.f9151i;
        c2295h.m7286p(floatingActionButton2.getVisibility() == 0 ? floatingActionButton2.getScaleY() : 0.0f);
    }
}
