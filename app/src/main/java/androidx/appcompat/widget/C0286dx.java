package androidx.appcompat.widget;

import android.view.View;
import androidx.core.p024g.C0512am;

/* compiled from: ToolbarWidgetWrapper.java */
/* renamed from: androidx.appcompat.widget.dx */
/* loaded from: classes.dex */
final class C0286dx extends C0512am {

    /* renamed from: a */
    final /* synthetic */ int f1395a;

    /* renamed from: b */
    final /* synthetic */ C0284dv f1396b;

    /* renamed from: c */
    private boolean f1397c = false;

    public C0286dx(C0284dv c0284dv, int i) {
        this.f1396b = c0284dv;
        this.f1395a = i;
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: a */
    public final void mo169a(View view) {
        this.f1396b.f1376a.setVisibility(0);
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        if (this.f1397c) {
            return;
        }
        this.f1396b.f1376a.setVisibility(this.f1395a);
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: c */
    public final void mo758c(View view) {
        this.f1397c = true;
    }
}
