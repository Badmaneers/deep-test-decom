package androidx.widget;

import android.view.View;
import com.facebook.rebound.C1879j;
import com.facebook.rebound.InterfaceC1883n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorDrawerLayout.java */
/* renamed from: androidx.widget.b */
/* loaded from: classes.dex */
public final class C1144b implements InterfaceC1883n {

    /* renamed from: a */
    final /* synthetic */ ColorDrawerLayout f4638a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1144b(ColorDrawerLayout colorDrawerLayout) {
        this.f4638a = colorDrawerLayout;
    }

    @Override // com.facebook.rebound.InterfaceC1883n
    /* renamed from: a */
    public final void mo3804a(C1879j c1879j) {
        int i;
        View view;
        C1879j c1879j2;
        int m6021c = (int) c1879j.m6021c();
        if (m6021c >= 100) {
            c1879j2 = this.f4638a.f4603ah;
            c1879j2.m6015a(0.0d);
        }
        i = this.f4638a.f4606ak;
        this.f4638a.f4606ak = m6021c;
        view = this.f4638a.f4605aj;
        view.offsetTopAndBottom(m6021c - i);
    }
}
