package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PageTransformerAdapter.java */
/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes.dex */
public final class C1122e extends AbstractC1133p {

    /* renamed from: a */
    private final LinearLayoutManager f4533a;

    /* renamed from: b */
    private InterfaceC1138u f4534b;

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: a */
    public final void mo3727a(int i) {
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: b */
    public final void mo3730b(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1122e(LinearLayoutManager linearLayoutManager) {
        this.f4533a = linearLayoutManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final InterfaceC1138u m3732a() {
        return this.f4534b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3733a(InterfaceC1138u interfaceC1138u) {
        this.f4534b = interfaceC1138u;
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: a */
    public final void mo3728a(int i, float f, int i2) {
        if (this.f4534b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f4533a.m3121v(); i3++) {
            View f2 = this.f4533a.m3111f(i3);
            if (f2 == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f4533a.m3121v())));
            }
            LinearLayoutManager.m3069e(f2);
        }
    }
}
