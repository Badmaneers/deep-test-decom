package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.InterfaceC0731k;
import androidx.lifecycle.InterfaceC0733m;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0731k {

    /* renamed from: a */
    final /* synthetic */ Handler f4489a;

    /* renamed from: b */
    final /* synthetic */ Runnable f4490b;

    @Override // androidx.lifecycle.InterfaceC0731k
    /* renamed from: a */
    public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
        if (enumC0729i == EnumC0729i.ON_DESTROY) {
            this.f4489a.removeCallbacks(this.f4490b);
            interfaceC0733m.mo31a().mo2610b(this);
        }
    }
}
