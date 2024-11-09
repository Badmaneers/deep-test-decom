package androidx.core.p021d;

import android.os.Handler;
import androidx.core.content.p020a.AbstractC0432l;

/* compiled from: FontsContractCompat.java */
/* renamed from: androidx.core.d.d */
/* loaded from: classes.dex */
final class C0442d implements InterfaceC0453o<C0447i> {

    /* renamed from: a */
    final /* synthetic */ AbstractC0432l f2192a;

    /* renamed from: b */
    final /* synthetic */ Handler f2193b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0442d(AbstractC0432l abstractC0432l, Handler handler) {
        this.f2192a = abstractC0432l;
        this.f2193b = handler;
    }

    @Override // androidx.core.p021d.InterfaceC0453o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1565a(C0447i c0447i) {
        C0447i c0447i2 = c0447i;
        if (c0447i2 == null) {
            this.f2192a.m1532a(1, this.f2193b);
        } else if (c0447i2.f2203b == 0) {
            this.f2192a.m1533a(c0447i2.f2202a, this.f2193b);
        } else {
            this.f2192a.m1532a(c0447i2.f2203b, this.f2193b);
        }
    }
}
