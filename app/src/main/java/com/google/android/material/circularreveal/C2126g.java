package com.google.android.material.circularreveal;

import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* renamed from: com.google.android.material.circularreveal.g */
/* loaded from: classes.dex */
public final class C2126g extends Property<InterfaceC2124e, C2128i> {

    /* renamed from: a */
    public static final Property<InterfaceC2124e, C2128i> f9525a = new C2126g("circularReveal");

    @Override // android.util.Property
    public final /* synthetic */ C2128i get(InterfaceC2124e interfaceC2124e) {
        return interfaceC2124e.getRevealInfo();
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(InterfaceC2124e interfaceC2124e, C2128i c2128i) {
        interfaceC2124e.setRevealInfo(c2128i);
    }

    private C2126g(String str) {
        super(C2128i.class, str);
    }
}
