package androidx.fragment.app;

import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.C0734n;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.InterfaceC0733m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* renamed from: androidx.fragment.app.bf */
/* loaded from: classes.dex */
public final class C0689bf implements InterfaceC0733m {

    /* renamed from: a */
    private C0734n f2941a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2425b() {
        if (this.f2941a == null) {
            this.f2941a = new C0734n(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m2426c() {
        return this.f2941a != null;
    }

    @Override // androidx.lifecycle.InterfaceC0733m
    /* renamed from: a */
    public final AbstractC0728h mo31a() {
        m2425b();
        return this.f2941a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2424a(EnumC0729i enumC0729i) {
        this.f2941a.m2623a(enumC0729i);
    }
}
