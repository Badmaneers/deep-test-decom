package com.google.android.material.p079h;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextAppearance.java */
/* renamed from: com.google.android.material.h.g */
/* loaded from: classes.dex */
public final class C2224g extends AbstractC2226i {

    /* renamed from: a */
    final /* synthetic */ TextPaint f9836a;

    /* renamed from: b */
    final /* synthetic */ AbstractC2226i f9837b;

    /* renamed from: c */
    final /* synthetic */ C2222e f9838c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2224g(C2222e c2222e, TextPaint textPaint, AbstractC2226i abstractC2226i) {
        this.f9838c = c2222e;
        this.f9836a = textPaint;
        this.f9837b = abstractC2226i;
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6647a(Typeface typeface, boolean z) {
        this.f9838c.m7059a(this.f9836a, typeface);
        this.f9837b.mo6647a(typeface, z);
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6646a(int i) {
        this.f9837b.mo6646a(i);
    }
}
