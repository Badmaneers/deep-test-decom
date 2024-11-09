package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.p011b.C0318a;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* renamed from: androidx.fragment.app.au */
/* loaded from: classes.dex */
public final class RunnableC0677au implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC0685bb f2897a;

    /* renamed from: b */
    final /* synthetic */ C0318a f2898b;

    /* renamed from: c */
    final /* synthetic */ Object f2899c;

    /* renamed from: d */
    final /* synthetic */ C0678av f2900d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f2901e;

    /* renamed from: f */
    final /* synthetic */ View f2902f;

    /* renamed from: g */
    final /* synthetic */ Fragment f2903g;

    /* renamed from: h */
    final /* synthetic */ Fragment f2904h;

    /* renamed from: i */
    final /* synthetic */ boolean f2905i;

    /* renamed from: j */
    final /* synthetic */ ArrayList f2906j;

    /* renamed from: k */
    final /* synthetic */ Object f2907k;

    /* renamed from: l */
    final /* synthetic */ Rect f2908l;

    public RunnableC0677au(AbstractC0685bb abstractC0685bb, C0318a c0318a, Object obj, C0678av c0678av, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f2897a = abstractC0685bb;
        this.f2898b = c0318a;
        this.f2899c = obj;
        this.f2900d = c0678av;
        this.f2901e = arrayList;
        this.f2902f = view;
        this.f2903g = fragment;
        this.f2904h = fragment2;
        this.f2905i = z;
        this.f2906j = arrayList2;
        this.f2907k = obj2;
        this.f2908l = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0318a<String, View> m2379a = C0673aq.m2379a(this.f2897a, (C0318a<String, String>) this.f2898b, this.f2899c, this.f2900d);
        if (m2379a != null) {
            this.f2901e.addAll(m2379a.values());
            this.f2901e.add(this.f2902f);
        }
        C0673aq.m2388a(this.f2903g, this.f2904h, this.f2905i, m2379a);
        if (this.f2899c != null) {
            this.f2897a.mo2407a(this.f2899c, this.f2906j, this.f2901e);
            View m2377a = C0673aq.m2377a(m2379a, this.f2900d, this.f2907k, this.f2905i);
            if (m2377a != null) {
                AbstractC0685bb.m2417a(m2377a, this.f2908l);
            }
        }
    }
}
