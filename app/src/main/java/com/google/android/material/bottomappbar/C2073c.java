package com.google.android.material.bottomappbar;

import android.view.View;
import androidx.core.p024g.C0514ao;
import com.google.android.material.internal.C2256ay;
import com.google.android.material.internal.InterfaceC2255ax;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.c */
/* loaded from: classes.dex */
public final class C2073c implements InterfaceC2255ax {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f9175a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2073c(BottomAppBar bottomAppBar) {
        this.f9175a = bottomAppBar;
    }

    @Override // com.google.android.material.internal.InterfaceC2255ax
    /* renamed from: a */
    public final C0514ao mo6443a(View view, C0514ao c0514ao, C2256ay c2256ay) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        z = this.f9175a.f9157o;
        if (z) {
            this.f9175a.f9164v = c0514ao.m1768d();
        }
        z2 = this.f9175a.f9158p;
        if (z2) {
            i2 = this.f9175a.f9166x;
            z3 = i2 != c0514ao.m1764a();
            this.f9175a.f9166x = c0514ao.m1764a();
        } else {
            z3 = false;
        }
        z4 = this.f9175a.f9159q;
        if (z4) {
            i = this.f9175a.f9165w;
            r0 = i != c0514ao.m1767c();
            this.f9175a.f9165w = c0514ao.m1767c();
        }
        if (z3 || r0) {
            this.f9175a.m6431q();
            this.f9175a.m6433r();
            this.f9175a.m6435s();
        }
        return c0514ao;
    }
}
