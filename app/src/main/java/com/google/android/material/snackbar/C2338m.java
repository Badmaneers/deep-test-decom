package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.InterfaceC2069d;

/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.m */
/* loaded from: classes.dex */
public final class C2338m implements InterfaceC2069d {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10321a;

    public C2338m(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10321a = baseTransientBottomBar;
    }

    @Override // com.google.android.material.behavior.InterfaceC2069d
    /* renamed from: a */
    public final void mo6397a(View view) {
        view.setVisibility(8);
        C2345t.m7457a().m7462a(this.f10321a.f10275c);
    }

    @Override // com.google.android.material.behavior.InterfaceC2069d
    /* renamed from: a */
    public final void mo6396a(int i) {
        switch (i) {
            case 0:
                C2345t.m7457a().m7467e(this.f10321a.f10275c);
                return;
            case 1:
            case 2:
                C2345t.m7457a().m7466d(this.f10321a.f10275c);
                return;
            default:
                return;
        }
    }
}
