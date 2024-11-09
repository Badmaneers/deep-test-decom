package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.p079h.AbstractC2226i;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextDrawableHelper.java */
/* renamed from: com.google.android.material.internal.ah */
/* loaded from: classes.dex */
public final class C2239ah extends AbstractC2226i {

    /* renamed from: a */
    final /* synthetic */ C2238ag f9929a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2239ah(C2238ag c2238ag) {
        this.f9929a = c2238ag;
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6647a(Typeface typeface, boolean z) {
        WeakReference weakReference;
        if (z) {
            return;
        }
        C2238ag.m7086a(this.f9929a);
        weakReference = this.f9929a.f9927e;
        InterfaceC2240ai interfaceC2240ai = (InterfaceC2240ai) weakReference.get();
        if (interfaceC2240ai != null) {
            interfaceC2240ai.mo6359b();
        }
    }

    @Override // com.google.android.material.p079h.AbstractC2226i
    /* renamed from: a */
    public final void mo6646a(int i) {
        WeakReference weakReference;
        C2238ag.m7086a(this.f9929a);
        weakReference = this.f9929a.f9927e;
        InterfaceC2240ai interfaceC2240ai = (InterfaceC2240ai) weakReference.get();
        if (interfaceC2240ai != null) {
            interfaceC2240ai.mo6359b();
        }
    }
}
