package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.EnumC0730j;

/* compiled from: SavedStateRegistryController.java */
/* renamed from: androidx.savedstate.d */
/* loaded from: classes.dex */
public final class C0973d {

    /* renamed from: a */
    private final InterfaceC0974e f3951a;

    /* renamed from: b */
    private final C0970a f3952b = new C0970a();

    private C0973d(InterfaceC0974e interfaceC0974e) {
        this.f3951a = interfaceC0974e;
    }

    /* renamed from: a */
    public final C0970a m3422a() {
        return this.f3952b;
    }

    /* renamed from: a */
    public final void m3423a(Bundle bundle) {
        AbstractC0728h a2 = this.f3951a.mo31a();
        if (a2.mo2608a() != EnumC0730j.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        a2.mo2609a(new Recreator(this.f3951a));
        this.f3952b.m3419a(a2, bundle);
    }

    /* renamed from: b */
    public final void m3424b(Bundle bundle) {
        this.f3952b.m3418a(bundle);
    }

    /* renamed from: a */
    public static C0973d m3421a(InterfaceC0974e interfaceC0974e) {
        return new C0973d(interfaceC0974e);
    }
}
