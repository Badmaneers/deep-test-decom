package com.google.android.material.p079h;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* renamed from: com.google.android.material.h.a */
/* loaded from: classes.dex */
public final class C2218a extends AbstractC2226i {

    /* renamed from: a */
    private final Typeface f9816a;

    /* renamed from: b */
    private final InterfaceC2219b f9817b;

    /* renamed from: c */
    private boolean f9818c;

    public C2218a(InterfaceC2219b interfaceC2219b, Typeface typeface) {
        this.f9816a = typeface;
        this.f9817b = interfaceC2219b;
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6647a(Typeface typeface, boolean z) {
        m7038a(typeface);
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6646a(int i) {
        m7038a(this.f9816a);
    }

    /* renamed from: a */
    public final void m7039a() {
        this.f9818c = true;
    }

    /* renamed from: a */
    private void m7038a(Typeface typeface) {
        if (this.f9818c) {
            return;
        }
        this.f9817b.mo7040a(typeface);
    }
}
