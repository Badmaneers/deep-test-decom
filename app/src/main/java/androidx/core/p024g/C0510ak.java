package androidx.core.p024g;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: androidx.core.g.ak */
/* loaded from: classes.dex */
public final class C0510ak implements InterfaceC0511al {

    /* renamed from: a */
    C0507ah f2355a;

    /* renamed from: b */
    boolean f2356b;

    public C0510ak(C0507ah c0507ah) {
        this.f2355a = c0507ah;
    }

    @Override // androidx.core.p024g.InterfaceC0511al
    /* renamed from: a */
    public final void mo169a(View view) {
        this.f2356b = false;
        if (this.f2355a.f2347c >= 0) {
            view.setLayerType(2, null);
        }
        if (this.f2355a.f2345a != null) {
            Runnable runnable = this.f2355a.f2345a;
            this.f2355a.f2345a = null;
            runnable.run();
        }
        Object tag = view.getTag(2113929216);
        InterfaceC0511al interfaceC0511al = tag instanceof InterfaceC0511al ? (InterfaceC0511al) tag : null;
        if (interfaceC0511al != null) {
            interfaceC0511al.mo169a(view);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0511al
    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public final void mo170b(View view) {
        if (this.f2355a.f2347c >= 0) {
            view.setLayerType(this.f2355a.f2347c, null);
            this.f2355a.f2347c = -1;
        }
        if (Build.VERSION.SDK_INT >= 16 || !this.f2356b) {
            if (this.f2355a.f2346b != null) {
                Runnable runnable = this.f2355a.f2346b;
                this.f2355a.f2346b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC0511al interfaceC0511al = tag instanceof InterfaceC0511al ? (InterfaceC0511al) tag : null;
            if (interfaceC0511al != null) {
                interfaceC0511al.mo170b(view);
            }
            this.f2356b = true;
        }
    }

    @Override // androidx.core.p024g.InterfaceC0511al
    /* renamed from: c */
    public final void mo758c(View view) {
        Object tag = view.getTag(2113929216);
        InterfaceC0511al interfaceC0511al = tag instanceof InterfaceC0511al ? (InterfaceC0511al) tag : null;
        if (interfaceC0511al != null) {
            interfaceC0511al.mo758c(view);
        }
    }
}
