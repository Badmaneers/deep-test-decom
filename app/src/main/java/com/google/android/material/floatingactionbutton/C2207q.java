package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.Drawable;
import com.google.android.material.p081j.InterfaceC2283b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.q */
/* loaded from: classes.dex */
public final class C2207q implements InterfaceC2283b {

    /* renamed from: a */
    final /* synthetic */ FloatingActionButton f9762a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2207q(FloatingActionButton floatingActionButton) {
        this.f9762a = floatingActionButton;
    }

    @Override // com.google.android.material.p081j.InterfaceC2283b
    /* renamed from: a */
    public final void mo6997a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        this.f9762a.f9700b.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = this.f9762a;
        i5 = floatingActionButton.f9709l;
        int i9 = i + i5;
        i6 = this.f9762a.f9709l;
        int i10 = i2 + i6;
        i7 = this.f9762a.f9709l;
        i8 = this.f9762a.f9709l;
        floatingActionButton.setPadding(i9, i10, i3 + i7, i4 + i8);
    }

    @Override // com.google.android.material.p081j.InterfaceC2283b
    /* renamed from: a */
    public final void mo6998a(Drawable drawable) {
        if (drawable != null) {
            super/*com.google.android.material.internal.VisibilityAwareImageButton*/.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.google.android.material.p081j.InterfaceC2283b
    /* renamed from: a */
    public final boolean mo6999a() {
        return this.f9762a.f9699a;
    }
}
