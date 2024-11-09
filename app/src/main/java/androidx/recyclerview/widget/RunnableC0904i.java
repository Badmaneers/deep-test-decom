package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
final class RunnableC0904i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3695a;

    /* renamed from: b */
    final /* synthetic */ C0903h f3696b;

    public RunnableC0904i(C0903h c0903h, ArrayList arrayList) {
        this.f3696b = c0903h;
        this.f3695a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3695a.iterator();
        while (it.hasNext()) {
            C0913r c0913r = (C0913r) it.next();
            C0903h c0903h = this.f3696b;
            AbstractC0879ce abstractC0879ce = c0913r.f3729a;
            int i = c0913r.f3730b;
            int i2 = c0913r.f3731c;
            int i3 = c0913r.f3732d;
            int i4 = c0913r.f3733e;
            View view = abstractC0879ce.f3614a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            c0903h.f3688e.add(abstractC0879ce);
            animate.setDuration(c0903h.m3049e()).setListener(new C0909n(c0903h, abstractC0879ce, i5, view, i6, animate)).start();
        }
        this.f3695a.clear();
        this.f3696b.f3685b.remove(this.f3695a);
    }
}
