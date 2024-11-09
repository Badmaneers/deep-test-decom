package com.google.android.material.circularreveal;

import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* renamed from: com.google.android.material.circularreveal.h */
/* loaded from: classes.dex */
public final class C2127h extends Property<InterfaceC2124e, Integer> {

    /* renamed from: a */
    public static final Property<InterfaceC2124e, Integer> f9526a = new C2127h("circularRevealScrimColor");

    @Override // android.util.Property
    public final /* synthetic */ Integer get(InterfaceC2124e interfaceC2124e) {
        return Integer.valueOf(interfaceC2124e.getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(InterfaceC2124e interfaceC2124e, Integer num) {
        interfaceC2124e.setCircularRevealScrimColor(num.intValue());
    }

    private C2127h(String str) {
        super(Integer.class, str);
    }
}
