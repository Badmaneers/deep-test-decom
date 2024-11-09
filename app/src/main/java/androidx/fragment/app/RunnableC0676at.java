package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.p011b.C0318a;

/* compiled from: FragmentTransition.java */
/* renamed from: androidx.fragment.app.at */
/* loaded from: classes.dex */
public final class RunnableC0676at implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Fragment f2890a;

    /* renamed from: b */
    final /* synthetic */ Fragment f2891b;

    /* renamed from: c */
    final /* synthetic */ boolean f2892c;

    /* renamed from: d */
    final /* synthetic */ C0318a f2893d;

    /* renamed from: e */
    final /* synthetic */ View f2894e;

    /* renamed from: f */
    final /* synthetic */ AbstractC0685bb f2895f;

    /* renamed from: g */
    final /* synthetic */ Rect f2896g;

    public RunnableC0676at(Fragment fragment, Fragment fragment2, boolean z, C0318a c0318a, View view, AbstractC0685bb abstractC0685bb, Rect rect) {
        this.f2890a = fragment;
        this.f2891b = fragment2;
        this.f2892c = z;
        this.f2893d = c0318a;
        this.f2894e = view;
        this.f2895f = abstractC0685bb;
        this.f2896g = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0673aq.m2388a(this.f2890a, this.f2891b, this.f2892c, (C0318a<String, View>) this.f2893d);
        if (this.f2894e != null) {
            AbstractC0685bb.m2417a(this.f2894e, this.f2896g);
        }
    }
}
