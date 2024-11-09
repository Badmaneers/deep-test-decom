package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import com.google.android.material.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.k */
/* loaded from: classes.dex */
public final class C2201k extends AbstractC2192b {

    /* renamed from: a */
    final /* synthetic */ ExtendedFloatingActionButton f9757a;

    /* renamed from: b */
    private boolean f9758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201k(ExtendedFloatingActionButton extendedFloatingActionButton, C2183a c2183a) {
        super(extendedFloatingActionButton, c2183a);
        this.f9757a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: g */
    public final void mo6984g() {
        this.f9757a.setVisibility(8);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: i */
    public final boolean mo6986i() {
        return ExtendedFloatingActionButton.m6926g(this.f9757a);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: h */
    public final int mo6985h() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: a */
    public final void mo6977a(Animator animator) {
        super.mo6977a(animator);
        this.f9758b = false;
        this.f9757a.setVisibility(0);
        this.f9757a.f9685e = 1;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: e */
    public final void mo6982e() {
        super.mo6982e();
        this.f9758b = true;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: d */
    public final void mo6981d() {
        super.mo6981d();
        this.f9757a.f9685e = 0;
        if (this.f9758b) {
            return;
        }
        this.f9757a.setVisibility(8);
    }
}
