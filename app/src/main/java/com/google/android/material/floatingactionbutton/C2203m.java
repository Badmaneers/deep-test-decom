package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import com.google.android.material.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.m */
/* loaded from: classes.dex */
public final class C2203m extends AbstractC2192b {

    /* renamed from: a */
    final /* synthetic */ ExtendedFloatingActionButton f9759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203m(ExtendedFloatingActionButton extendedFloatingActionButton, C2183a c2183a) {
        super(extendedFloatingActionButton, c2183a);
        this.f9759a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: g */
    public final void mo6984g() {
        this.f9759a.setVisibility(0);
        this.f9759a.setAlpha(1.0f);
        this.f9759a.setScaleY(1.0f);
        this.f9759a.setScaleX(1.0f);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: h */
    public final int mo6985h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: a */
    public final void mo6977a(Animator animator) {
        super.mo6977a(animator);
        this.f9759a.setVisibility(0);
        this.f9759a.f9685e = 2;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: d */
    public final void mo6981d() {
        super.mo6981d();
        this.f9759a.f9685e = 0;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: i */
    public final boolean mo6986i() {
        return ExtendedFloatingActionButton.m6925f(this.f9759a);
    }
}
