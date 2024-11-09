package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
final class RunnableC0906k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3699a;

    /* renamed from: b */
    final /* synthetic */ C0903h f3700b;

    public RunnableC0906k(C0903h c0903h, ArrayList arrayList) {
        this.f3700b = c0903h;
        this.f3699a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3699a.iterator();
        while (it.hasNext()) {
            AbstractC0879ce abstractC0879ce = (AbstractC0879ce) it.next();
            C0903h c0903h = this.f3700b;
            View view = abstractC0879ce.f3614a;
            ViewPropertyAnimator animate = view.animate();
            c0903h.f3687d.add(abstractC0879ce);
            animate.alpha(1.0f).setDuration(c0903h.m3050f()).setListener(new C0908m(c0903h, abstractC0879ce, view, animate)).start();
        }
        this.f3699a.clear();
        this.f3700b.f3684a.remove(this.f3699a);
    }
}
