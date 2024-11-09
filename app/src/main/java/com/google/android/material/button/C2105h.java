package com.google.android.material.button;

import android.view.View;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p082k.C2284a;
import com.google.android.material.p082k.InterfaceC2290c;

/* compiled from: MaterialButtonToggleGroup.java */
/* renamed from: com.google.android.material.button.h */
/* loaded from: classes.dex */
final class C2105h {

    /* renamed from: e */
    private static final InterfaceC2290c f9361e = new C2284a(0.0f);

    /* renamed from: a */
    InterfaceC2290c f9362a;

    /* renamed from: b */
    InterfaceC2290c f9363b;

    /* renamed from: c */
    InterfaceC2290c f9364c;

    /* renamed from: d */
    InterfaceC2290c f9365d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2105h(InterfaceC2290c interfaceC2290c, InterfaceC2290c interfaceC2290c2, InterfaceC2290c interfaceC2290c3, InterfaceC2290c interfaceC2290c4) {
        this.f9362a = interfaceC2290c;
        this.f9363b = interfaceC2290c3;
        this.f9364c = interfaceC2290c4;
        this.f9365d = interfaceC2290c2;
    }

    /* renamed from: a */
    public static C2105h m6556a(C2105h c2105h, View view) {
        return C2250as.m7112a(view) ? m6560d(c2105h) : m6559c(c2105h);
    }

    /* renamed from: b */
    public static C2105h m6558b(C2105h c2105h, View view) {
        return C2250as.m7112a(view) ? m6559c(c2105h) : m6560d(c2105h);
    }

    /* renamed from: c */
    private static C2105h m6559c(C2105h c2105h) {
        InterfaceC2290c interfaceC2290c = c2105h.f9362a;
        InterfaceC2290c interfaceC2290c2 = c2105h.f9365d;
        InterfaceC2290c interfaceC2290c3 = f9361e;
        return new C2105h(interfaceC2290c, interfaceC2290c2, interfaceC2290c3, interfaceC2290c3);
    }

    /* renamed from: d */
    private static C2105h m6560d(C2105h c2105h) {
        InterfaceC2290c interfaceC2290c = f9361e;
        return new C2105h(interfaceC2290c, interfaceC2290c, c2105h.f9363b, c2105h.f9364c);
    }

    /* renamed from: a */
    public static C2105h m6555a(C2105h c2105h) {
        return new C2105h(c2105h.f9362a, f9361e, c2105h.f9363b, f9361e);
    }

    /* renamed from: b */
    public static C2105h m6557b(C2105h c2105h) {
        return new C2105h(f9361e, c2105h.f9365d, f9361e, c2105h.f9364c);
    }
}
