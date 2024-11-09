package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Property;
import android.view.View;
import androidx.core.p023f.C0478i;
import com.google.android.material.p072a.C2033b;
import com.google.android.material.p072a.C2039h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMotionStrategy.java */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
abstract class AbstractC2192b implements InterfaceC2191ah {

    /* renamed from: a */
    private final Context f9725a;

    /* renamed from: b */
    private final ExtendedFloatingActionButton f9726b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f9727c = new ArrayList<>();

    /* renamed from: d */
    private final C2183a f9728d;

    /* renamed from: e */
    private C2039h f9729e;

    /* renamed from: f */
    private C2039h f9730f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2192b(ExtendedFloatingActionButton extendedFloatingActionButton, C2183a c2183a) {
        this.f9726b = extendedFloatingActionButton;
        this.f9725a = extendedFloatingActionButton.getContext();
        this.f9728d = c2183a;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: a */
    public final void mo6978a(C2039h c2039h) {
        this.f9730f = c2039h;
    }

    /* renamed from: a */
    public final C2039h m6987a() {
        if (this.f9730f != null) {
            return this.f9730f;
        }
        if (this.f9729e == null) {
            this.f9729e = C2039h.m6245a(this.f9725a, mo6985h());
        }
        return (C2039h) C0478i.m1620a(this.f9729e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: b */
    public final List<Animator.AnimatorListener> mo6979b() {
        return this.f9727c;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: c */
    public final C2039h mo6980c() {
        return this.f9730f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: a */
    public void mo6977a(Animator animator) {
        this.f9728d.m6958a(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: d */
    public void mo6981d() {
        this.f9728d.m6957a();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: e */
    public void mo6982e() {
        this.f9728d.m6957a();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2191ah
    /* renamed from: f */
    public AnimatorSet mo6983f() {
        return m6988b(m6987a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AnimatorSet m6988b(C2039h c2039h) {
        ArrayList arrayList = new ArrayList();
        if (c2039h.m6255b("opacity")) {
            arrayList.add(c2039h.m6252a("opacity", (String) this.f9726b, (Property<String, ?>) View.ALPHA));
        }
        if (c2039h.m6255b("scale")) {
            arrayList.add(c2039h.m6252a("scale", (String) this.f9726b, (Property<String, ?>) View.SCALE_Y));
            arrayList.add(c2039h.m6252a("scale", (String) this.f9726b, (Property<String, ?>) View.SCALE_X));
        }
        if (c2039h.m6255b("width")) {
            arrayList.add(c2039h.m6252a("width", (String) this.f9726b, (Property<String, ?>) ExtendedFloatingActionButton.f9682a));
        }
        if (c2039h.m6255b("height")) {
            arrayList.add(c2039h.m6252a("height", (String) this.f9726b, (Property<String, ?>) ExtendedFloatingActionButton.f9683b));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C2033b.m6242a(animatorSet, arrayList);
        return animatorSet;
    }
}
