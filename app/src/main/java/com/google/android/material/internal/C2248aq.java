package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* renamed from: com.google.android.material.internal.aq */
/* loaded from: classes.dex */
final class C2248aq implements InterfaceC2249ar {

    /* renamed from: a */
    private final ViewOverlay f9941a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2248aq(View view) {
        this.f9941a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.InterfaceC2249ar
    /* renamed from: a */
    public final void mo7104a(Drawable drawable) {
        this.f9941a.add(drawable);
    }

    @Override // com.google.android.material.internal.InterfaceC2249ar
    /* renamed from: b */
    public final void mo7105b(Drawable drawable) {
        this.f9941a.remove(drawable);
    }
}
