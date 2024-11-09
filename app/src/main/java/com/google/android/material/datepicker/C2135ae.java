package com.google.android.material.datepicker;

import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* renamed from: com.google.android.material.datepicker.ae */
/* loaded from: classes.dex */
final class C2135ae<S> implements InterfaceC2141ak<S> {

    /* renamed from: a */
    final /* synthetic */ C2134ad f9559a;

    public C2135ae(C2134ad c2134ad) {
        this.f9559a = c2134ad;
    }

    @Override // com.google.android.material.datepicker.InterfaceC2141ak
    /* renamed from: a */
    public final void mo6834a(S s) {
        Iterator<InterfaceC2141ak<S>> it = this.f9559a.f9573e.iterator();
        while (it.hasNext()) {
            it.next().mo6834a(s);
        }
    }
}
