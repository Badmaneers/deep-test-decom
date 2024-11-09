package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
final class RunnableC0905j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3697a;

    /* renamed from: b */
    final /* synthetic */ C0903h f3698b;

    public RunnableC0905j(C0903h c0903h, ArrayList arrayList) {
        this.f3698b = c0903h;
        this.f3697a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3697a.iterator();
        while (it.hasNext()) {
            C0912q c0912q = (C0912q) it.next();
            C0903h c0903h = this.f3698b;
            AbstractC0879ce abstractC0879ce = c0912q.f3723a;
            View view = abstractC0879ce == null ? null : abstractC0879ce.f3614a;
            AbstractC0879ce abstractC0879ce2 = c0912q.f3724b;
            View view2 = abstractC0879ce2 != null ? abstractC0879ce2.f3614a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c0903h.m3054h());
                c0903h.f3690g.add(c0912q.f3723a);
                duration.translationX(c0912q.f3727e - c0912q.f3725c);
                duration.translationY(c0912q.f3728f - c0912q.f3726d);
                duration.alpha(0.0f).setListener(new C0910o(c0903h, c0912q, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c0903h.f3690g.add(c0912q.f3724b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c0903h.m3054h()).alpha(1.0f).setListener(new C0911p(c0903h, c0912q, animate, view2)).start();
            }
        }
        this.f3697a.clear();
        this.f3698b.f3686c.remove(this.f3697a);
    }
}
