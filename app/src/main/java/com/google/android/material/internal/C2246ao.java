package com.google.android.material.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOverlayApi14.java */
/* renamed from: com.google.android.material.internal.ao */
/* loaded from: classes.dex */
public class C2246ao implements InterfaceC2249ar {

    /* renamed from: a */
    protected C2247ap f9934a;

    public C2246ao(Context context, ViewGroup viewGroup, View view) {
        this.f9934a = new C2247ap(context, viewGroup, view, this);
    }

    @Override // com.google.android.material.internal.InterfaceC2249ar
    /* renamed from: a */
    public final void mo7104a(Drawable drawable) {
        this.f9934a.m7106a(drawable);
    }

    @Override // com.google.android.material.internal.InterfaceC2249ar
    /* renamed from: b */
    public final void mo7105b(Drawable drawable) {
        this.f9934a.m7107b(drawable);
    }
}
