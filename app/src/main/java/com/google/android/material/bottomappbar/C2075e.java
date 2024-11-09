package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.AbstractC2206p;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.e */
/* loaded from: classes.dex */
public final class C2075e extends AbstractC2206p {

    /* renamed from: a */
    final /* synthetic */ int f9177a;

    /* renamed from: b */
    final /* synthetic */ BottomAppBar f9178b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2075e(BottomAppBar bottomAppBar, int i) {
        this.f9178b = bottomAppBar;
        this.f9177a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC2206p
    /* renamed from: a */
    public final void mo6444a(FloatingActionButton floatingActionButton) {
        float m6406b;
        m6406b = this.f9178b.m6406b(this.f9177a);
        floatingActionButton.setTranslationX(m6406b);
        floatingActionButton.m6941a(new C2076f(this));
    }
}
