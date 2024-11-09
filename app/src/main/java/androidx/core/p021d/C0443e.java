package androidx.core.p021d;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontsContractCompat.java */
/* renamed from: androidx.core.d.e */
/* loaded from: classes.dex */
public final class C0443e implements InterfaceC0453o<C0447i> {

    /* renamed from: a */
    final /* synthetic */ String f2194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0443e(String str) {
        this.f2194a = str;
    }

    @Override // androidx.core.p021d.InterfaceC0453o
    /* renamed from: a */
    public final /* synthetic */ void mo1565a(C0447i c0447i) {
        C0447i c0447i2 = c0447i;
        synchronized (C0440b.f2184b) {
            ArrayList<InterfaceC0453o<C0447i>> arrayList = C0440b.f2185c.get(this.f2194a);
            if (arrayList == null) {
                return;
            }
            C0440b.f2185c.remove(this.f2194a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).mo1565a(c0447i2);
            }
        }
    }
}
