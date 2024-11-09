package androidx.appcompat.widget;

import android.view.View;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.InterfaceC0511al;

/* compiled from: AbsActionBarView.java */
/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final class C0208b implements InterfaceC0511al {

    /* renamed from: a */
    int f1160a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0181a f1161b;

    /* renamed from: c */
    private boolean f1162c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0208b(AbstractC0181a abstractC0181a) {
        this.f1161b = abstractC0181a;
    }

    /* renamed from: a */
    public final C0208b m757a(C0507ah c0507ah, int i) {
        this.f1161b.f1089f = c0507ah;
        this.f1160a = i;
        return this;
    }

    @Override // androidx.core.p024g.InterfaceC0511al
    /* renamed from: a */
    public final void mo169a(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f1162c = false;
    }

    @Override // androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        if (this.f1162c) {
            return;
        }
        this.f1161b.f1089f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f1160a);
    }

    @Override // androidx.core.p024g.InterfaceC0511al
    /* renamed from: c */
    public final void mo758c(View view) {
        this.f1162c = true;
    }
}
