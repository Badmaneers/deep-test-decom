package androidx.fragment.app;

import android.view.View;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransitionImpl.java */
/* renamed from: androidx.fragment.app.bc */
/* loaded from: classes.dex */
public final class RunnableC0686bc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f2929a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f2930b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f2931c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f2932d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f2933e;

    /* renamed from: f */
    final /* synthetic */ AbstractC0685bb f2934f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0686bc(AbstractC0685bb abstractC0685bb, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2934f = abstractC0685bb;
        this.f2929a = i;
        this.f2930b = arrayList;
        this.f2931c = arrayList2;
        this.f2932d = arrayList3;
        this.f2933e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f2929a; i++) {
            C0538w.m1854a((View) this.f2930b.get(i), (String) this.f2931c.get(i));
            C0538w.m1854a((View) this.f2932d.get(i), (String) this.f2933e.get(i));
        }
    }
}
