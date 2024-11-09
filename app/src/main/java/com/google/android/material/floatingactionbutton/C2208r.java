package com.google.android.material.floatingactionbutton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p072a.InterfaceC2042k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.r */
/* loaded from: classes.dex */
public final class C2208r<T extends FloatingActionButton> implements InterfaceC2185ab {

    /* renamed from: a */
    final /* synthetic */ FloatingActionButton f9763a;

    /* renamed from: b */
    private final InterfaceC2042k<T> f9764b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2208r(FloatingActionButton floatingActionButton, InterfaceC2042k<T> interfaceC2042k) {
        this.f9763a = floatingActionButton;
        this.f9764b = interfaceC2042k;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2185ab
    /* renamed from: a */
    public final void mo6960a() {
        this.f9764b.mo6262a(this.f9763a);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2185ab
    /* renamed from: b */
    public final void mo6961b() {
        this.f9764b.mo6263b(this.f9763a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2208r) && ((C2208r) obj).f9764b.equals(this.f9764b);
    }

    public final int hashCode() {
        return this.f9764b.hashCode();
    }
}
