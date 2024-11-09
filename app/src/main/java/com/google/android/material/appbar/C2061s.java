package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p024g.C0538w;

/* compiled from: ViewOffsetHelper.java */
/* renamed from: com.google.android.material.appbar.s */
/* loaded from: classes.dex */
final class C2061s {

    /* renamed from: a */
    private final View f9088a;

    /* renamed from: b */
    private int f9089b;

    /* renamed from: c */
    private int f9090c;

    /* renamed from: d */
    private int f9091d;

    /* renamed from: e */
    private int f9092e;

    /* renamed from: f */
    private boolean f9093f = true;

    /* renamed from: g */
    private boolean f9094g = true;

    public C2061s(View view) {
        this.f9088a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6330a() {
        this.f9089b = this.f9088a.getTop();
        this.f9090c = this.f9088a.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m6332b() {
        C0538w.m1869c(this.f9088a, this.f9091d - (this.f9088a.getTop() - this.f9089b));
        C0538w.m1871d(this.f9088a, this.f9092e - (this.f9088a.getLeft() - this.f9090c));
    }

    /* renamed from: a */
    public final boolean m6331a(int i) {
        if (!this.f9093f || this.f9091d == i) {
            return false;
        }
        this.f9091d = i;
        m6332b();
        return true;
    }

    /* renamed from: b */
    public final boolean m6333b(int i) {
        if (!this.f9094g || this.f9092e == i) {
            return false;
        }
        this.f9092e = i;
        m6332b();
        return true;
    }

    /* renamed from: c */
    public final int m6334c() {
        return this.f9091d;
    }

    /* renamed from: d */
    public final int m6335d() {
        return this.f9089b;
    }
}
