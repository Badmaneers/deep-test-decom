package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.R;
import com.google.android.material.p072a.C2039h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.j */
/* loaded from: classes.dex */
public final class C2200j extends AbstractC2192b {

    /* renamed from: a */
    final /* synthetic */ ExtendedFloatingActionButton f9754a;

    /* renamed from: b */
    private final InterfaceC2204n f9755b;

    /* renamed from: c */
    private final boolean f9756c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2200j(ExtendedFloatingActionButton extendedFloatingActionButton, C2183a c2183a, InterfaceC2204n interfaceC2204n, boolean z) {
        super(extendedFloatingActionButton, c2183a);
        this.f9754a = extendedFloatingActionButton;
        this.f9755b = interfaceC2204n;
        this.f9756c = z;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: g */
    public final void mo6984g() {
        this.f9754a.f9692l = this.f9756c;
        ViewGroup.LayoutParams layoutParams = this.f9754a.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = this.f9755b.mo6996c().width;
        layoutParams.height = this.f9755b.mo6996c().height;
        this.f9754a.requestLayout();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: h */
    public final int mo6985h() {
        return R.animator.mtrl_extended_fab_change_size_motion_spec;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: f */
    public final AnimatorSet mo6983f() {
        C2039h a2 = m6987a();
        if (a2.m6255b("width")) {
            PropertyValuesHolder[] m6256c = a2.m6256c("width");
            m6256c[0].setFloatValues(this.f9754a.getWidth(), this.f9755b.mo6994a());
            a2.m6254a("width", m6256c);
        }
        if (a2.m6255b("height")) {
            PropertyValuesHolder[] m6256c2 = a2.m6256c("height");
            m6256c2[0].setFloatValues(this.f9754a.getHeight(), this.f9755b.mo6995b());
            a2.m6254a("height", m6256c2);
        }
        return super.m6988b(a2);
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: a */
    public final void mo6977a(Animator animator) {
        super.mo6977a(animator);
        this.f9754a.f9692l = this.f9756c;
        this.f9754a.setHorizontallyScrolling(true);
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2192b, com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: d */
    public final void mo6981d() {
        super.mo6981d();
        this.f9754a.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = this.f9754a.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = this.f9755b.mo6996c().width;
        layoutParams.height = this.f9755b.mo6996c().height;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: i */
    public final boolean mo6986i() {
        boolean z;
        boolean z2 = this.f9756c;
        z = this.f9754a.f9692l;
        return z2 == z || this.f9754a.getIcon() == null || TextUtils.isEmpty(this.f9754a.getText());
    }
}
