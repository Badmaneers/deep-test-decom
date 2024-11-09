package com.google.android.material.internal;

import android.view.View;
import androidx.core.p024g.C0514ao;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* renamed from: com.google.android.material.internal.au */
/* loaded from: classes.dex */
public final class C2252au implements InterfaceC2255ax {

    /* renamed from: a */
    final /* synthetic */ boolean f9943a;

    /* renamed from: b */
    final /* synthetic */ boolean f9944b;

    /* renamed from: c */
    final /* synthetic */ boolean f9945c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC2255ax f9946d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2252au(boolean z, boolean z2, boolean z3, InterfaceC2255ax interfaceC2255ax) {
        this.f9943a = z;
        this.f9944b = z2;
        this.f9945c = z3;
        this.f9946d = interfaceC2255ax;
    }

    @Override // com.google.android.material.internal.InterfaceC2255ax
    /* renamed from: a */
    public final C0514ao mo6443a(View view, C0514ao c0514ao, C2256ay c2256ay) {
        if (this.f9943a) {
            c2256ay.f9952d += c0514ao.m1768d();
        }
        boolean m7112a = C2250as.m7112a(view);
        if (this.f9944b) {
            if (m7112a) {
                c2256ay.f9951c += c0514ao.m1764a();
            } else {
                c2256ay.f9949a += c0514ao.m1764a();
            }
        }
        if (this.f9945c) {
            if (m7112a) {
                c2256ay.f9949a += c0514ao.m1767c();
            } else {
                c2256ay.f9951c += c0514ao.m1767c();
            }
        }
        c2256ay.m7118a(view);
        return this.f9946d != null ? this.f9946d.mo6443a(view, c0514ao, c2256ay) : c0514ao;
    }
}
