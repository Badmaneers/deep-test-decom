package androidx.transition;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Fade.java */
/* renamed from: androidx.transition.q */
/* loaded from: classes.dex */
public final class C1060q extends C1008ak {

    /* renamed from: a */
    final /* synthetic */ View f4241a;

    /* renamed from: b */
    final /* synthetic */ C1059p f4242b;

    public C1060q(C1059p c1059p, View view) {
        this.f4242b = c1059p;
        this.f4241a = view;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        C1030bf.m3553a(this.f4241a, 1.0f);
        C1030bf.m3561e(this.f4241a);
        abstractC1001ad.mo3501b(this);
    }
}
