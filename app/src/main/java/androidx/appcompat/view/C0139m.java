package androidx.appcompat.view;

import android.view.View;
import androidx.core.p024g.C0512am;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* renamed from: androidx.appcompat.view.m */
/* loaded from: classes.dex */
public final class C0139m extends C0512am {

    /* renamed from: a */
    final /* synthetic */ C0138l f509a;

    /* renamed from: b */
    private boolean f510b = false;

    /* renamed from: c */
    private int f511c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0139m(C0138l c0138l) {
        this.f509a = c0138l;
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: a */
    public final void mo169a(View view) {
        if (this.f510b) {
            return;
        }
        this.f510b = true;
        if (this.f509a.f504b != null) {
            this.f509a.f504b.mo169a(null);
        }
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        int i = this.f511c + 1;
        this.f511c = i;
        if (i == this.f509a.f503a.size()) {
            if (this.f509a.f504b != null) {
                this.f509a.f504b.mo170b(null);
            }
            this.f511c = 0;
            this.f510b = false;
            this.f509a.m333b();
        }
    }
}
