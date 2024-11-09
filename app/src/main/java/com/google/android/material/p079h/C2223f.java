package com.google.android.material.p079h;

import android.graphics.Typeface;
import androidx.core.content.p020a.AbstractC0432l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextAppearance.java */
/* renamed from: com.google.android.material.h.f */
/* loaded from: classes.dex */
public final class C2223f extends AbstractC0432l {

    /* renamed from: a */
    final /* synthetic */ AbstractC2226i f9834a;

    /* renamed from: b */
    final /* synthetic */ C2222e f9835b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2223f(C2222e c2222e, AbstractC2226i abstractC2226i) {
        this.f9835b = c2222e;
        this.f9834a = abstractC2226i;
    }

    @Override // androidx.core.content.p020a.AbstractC0432l
    /* renamed from: a */
    public final void mo789a(Typeface typeface) {
        Typeface typeface2;
        this.f9835b.f9833o = Typeface.create(typeface, this.f9835b.f9823e);
        C2222e.m7052a(this.f9835b);
        AbstractC2226i abstractC2226i = this.f9834a;
        typeface2 = this.f9835b.f9833o;
        abstractC2226i.mo6647a(typeface2, false);
    }

    @Override // androidx.core.content.p020a.AbstractC0432l
    /* renamed from: a */
    public final void mo788a(int i) {
        C2222e.m7052a(this.f9835b);
        this.f9834a.mo6646a(i);
    }
}
