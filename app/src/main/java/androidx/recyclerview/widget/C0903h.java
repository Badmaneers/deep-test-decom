package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public final class C0903h extends AbstractC0883ci {

    /* renamed from: i */
    private static TimeInterpolator f3683i;

    /* renamed from: j */
    private ArrayList<AbstractC0879ce> f3691j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<AbstractC0879ce> f3692k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C0913r> f3693l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C0912q> f3694m = new ArrayList<>();

    /* renamed from: a */
    ArrayList<ArrayList<AbstractC0879ce>> f3684a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C0913r>> f3685b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C0912q>> f3686c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<AbstractC0879ce> f3687d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<AbstractC0879ce> f3688e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<AbstractC0879ce> f3689f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<AbstractC0879ce> f3690g = new ArrayList<>();

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: a */
    public final void mo3039a() {
        boolean z = !this.f3691j.isEmpty();
        boolean z2 = !this.f3693l.isEmpty();
        boolean z3 = !this.f3694m.isEmpty();
        boolean z4 = !this.f3692k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<AbstractC0879ce> it = this.f3691j.iterator();
            while (it.hasNext()) {
                AbstractC0879ce next = it.next();
                View view = next.f3614a;
                ViewPropertyAnimator animate = view.animate();
                this.f3689f.add(next);
                animate.setDuration(m3052g()).alpha(0.0f).setListener(new C0907l(this, next, animate, view)).start();
            }
            this.f3691j.clear();
            if (z2) {
                ArrayList<C0913r> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3693l);
                this.f3685b.add(arrayList);
                this.f3693l.clear();
                RunnableC0904i runnableC0904i = new RunnableC0904i(this, arrayList);
                if (z) {
                    C0538w.m1853a(arrayList.get(0).f3729a.f3614a, runnableC0904i, m3052g());
                } else {
                    runnableC0904i.run();
                }
            }
            if (z3) {
                ArrayList<C0912q> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3694m);
                this.f3686c.add(arrayList2);
                this.f3694m.clear();
                RunnableC0905j runnableC0905j = new RunnableC0905j(this, arrayList2);
                if (z) {
                    C0538w.m1853a(arrayList2.get(0).f3723a.f3614a, runnableC0905j, m3052g());
                } else {
                    runnableC0905j.run();
                }
            }
            if (z4) {
                ArrayList<AbstractC0879ce> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3692k);
                this.f3684a.add(arrayList3);
                this.f3692k.clear();
                RunnableC0906k runnableC0906k = new RunnableC0906k(this, arrayList3);
                if (z || z2 || z3) {
                    C0538w.m1853a(arrayList3.get(0).f3614a, runnableC0906k, (z ? m3052g() : 0L) + Math.max(z2 ? m3049e() : 0L, z3 ? m3054h() : 0L));
                } else {
                    runnableC0906k.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0883ci
    /* renamed from: a */
    public final boolean mo3235a(AbstractC0879ce abstractC0879ce) {
        m3315h(abstractC0879ce);
        this.f3691j.add(abstractC0879ce);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0883ci
    /* renamed from: b */
    public final boolean mo3238b(AbstractC0879ce abstractC0879ce) {
        m3315h(abstractC0879ce);
        abstractC0879ce.f3614a.setAlpha(0.0f);
        this.f3692k.add(abstractC0879ce);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0883ci
    /* renamed from: a */
    public final boolean mo3236a(AbstractC0879ce abstractC0879ce, int i, int i2, int i3, int i4) {
        View view = abstractC0879ce.f3614a;
        int translationX = i + ((int) abstractC0879ce.f3614a.getTranslationX());
        int translationY = i2 + ((int) abstractC0879ce.f3614a.getTranslationY());
        m3315h(abstractC0879ce);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            this.f3693l.add(new C0913r(abstractC0879ce, translationX, translationY, i3, i4));
            return true;
        }
        m3051f(abstractC0879ce);
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0883ci
    /* renamed from: a */
    public final boolean mo3237a(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2, int i, int i2, int i3, int i4) {
        if (abstractC0879ce == abstractC0879ce2) {
            return mo3236a(abstractC0879ce, i, i2, i3, i4);
        }
        float translationX = abstractC0879ce.f3614a.getTranslationX();
        float translationY = abstractC0879ce.f3614a.getTranslationY();
        float alpha = abstractC0879ce.f3614a.getAlpha();
        m3315h(abstractC0879ce);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC0879ce.f3614a.setTranslationX(translationX);
        abstractC0879ce.f3614a.setTranslationY(translationY);
        abstractC0879ce.f3614a.setAlpha(alpha);
        if (abstractC0879ce2 != null) {
            m3315h(abstractC0879ce2);
            abstractC0879ce2.f3614a.setTranslationX(-i5);
            abstractC0879ce2.f3614a.setTranslationY(-i6);
            abstractC0879ce2.f3614a.setAlpha(0.0f);
        }
        this.f3694m.add(new C0912q(abstractC0879ce, abstractC0879ce2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    private void m3313a(List<C0912q> list, AbstractC0879ce abstractC0879ce) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0912q c0912q = list.get(size);
            if (m3314a(c0912q, abstractC0879ce) && c0912q.f3723a == null && c0912q.f3724b == null) {
                list.remove(c0912q);
            }
        }
    }

    /* renamed from: a */
    private void m3311a(C0912q c0912q) {
        if (c0912q.f3723a != null) {
            m3314a(c0912q, c0912q.f3723a);
        }
        if (c0912q.f3724b != null) {
            m3314a(c0912q, c0912q.f3724b);
        }
    }

    /* renamed from: a */
    private boolean m3314a(C0912q c0912q, AbstractC0879ce abstractC0879ce) {
        if (c0912q.f3724b == abstractC0879ce) {
            c0912q.f3724b = null;
        } else {
            if (c0912q.f3723a != abstractC0879ce) {
                return false;
            }
            c0912q.f3723a = null;
        }
        abstractC0879ce.f3614a.setAlpha(1.0f);
        abstractC0879ce.f3614a.setTranslationX(0.0f);
        abstractC0879ce.f3614a.setTranslationY(0.0f);
        m3051f(abstractC0879ce);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: c */
    public final void mo3046c(AbstractC0879ce abstractC0879ce) {
        View view = abstractC0879ce.f3614a;
        view.animate().cancel();
        int size = this.f3693l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3693l.get(size).f3729a == abstractC0879ce) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m3051f(abstractC0879ce);
                this.f3693l.remove(size);
            }
        }
        m3313a(this.f3694m, abstractC0879ce);
        if (this.f3691j.remove(abstractC0879ce)) {
            view.setAlpha(1.0f);
            m3051f(abstractC0879ce);
        }
        if (this.f3692k.remove(abstractC0879ce)) {
            view.setAlpha(1.0f);
            m3051f(abstractC0879ce);
        }
        for (int size2 = this.f3686c.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0912q> arrayList = this.f3686c.get(size2);
            m3313a(arrayList, abstractC0879ce);
            if (arrayList.isEmpty()) {
                this.f3686c.remove(size2);
            }
        }
        for (int size3 = this.f3685b.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0913r> arrayList2 = this.f3685b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3729a == abstractC0879ce) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m3051f(abstractC0879ce);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3685b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3684a.size() - 1; size5 >= 0; size5--) {
            ArrayList<AbstractC0879ce> arrayList3 = this.f3684a.get(size5);
            if (arrayList3.remove(abstractC0879ce)) {
                view.setAlpha(1.0f);
                m3051f(abstractC0879ce);
                if (arrayList3.isEmpty()) {
                    this.f3684a.remove(size5);
                }
            }
        }
        this.f3689f.remove(abstractC0879ce);
        this.f3687d.remove(abstractC0879ce);
        this.f3690g.remove(abstractC0879ce);
        this.f3688e.remove(abstractC0879ce);
        m3316c();
    }

    /* renamed from: h */
    private void m3315h(AbstractC0879ce abstractC0879ce) {
        if (f3683i == null) {
            f3683i = new ValueAnimator().getInterpolator();
        }
        abstractC0879ce.f3614a.animate().setInterpolator(f3683i);
        mo3046c(abstractC0879ce);
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: b */
    public final boolean mo3044b() {
        return (this.f3692k.isEmpty() && this.f3694m.isEmpty() && this.f3693l.isEmpty() && this.f3691j.isEmpty() && this.f3688e.isEmpty() && this.f3689f.isEmpty() && this.f3687d.isEmpty() && this.f3690g.isEmpty() && this.f3685b.isEmpty() && this.f3684a.isEmpty() && this.f3686c.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m3316c() {
        if (mo3044b()) {
            return;
        }
        m3055i();
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: d */
    public final void mo3048d() {
        int size = this.f3693l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0913r c0913r = this.f3693l.get(size);
            View view = c0913r.f3729a.f3614a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m3051f(c0913r.f3729a);
            this.f3693l.remove(size);
        }
        for (int size2 = this.f3691j.size() - 1; size2 >= 0; size2--) {
            m3051f(this.f3691j.get(size2));
            this.f3691j.remove(size2);
        }
        int size3 = this.f3692k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0879ce abstractC0879ce = this.f3692k.get(size3);
            abstractC0879ce.f3614a.setAlpha(1.0f);
            m3051f(abstractC0879ce);
            this.f3692k.remove(size3);
        }
        for (int size4 = this.f3694m.size() - 1; size4 >= 0; size4--) {
            m3311a(this.f3694m.get(size4));
        }
        this.f3694m.clear();
        if (mo3044b()) {
            for (int size5 = this.f3685b.size() - 1; size5 >= 0; size5--) {
                ArrayList<C0913r> arrayList = this.f3685b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0913r c0913r2 = arrayList.get(size6);
                    View view2 = c0913r2.f3729a.f3614a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m3051f(c0913r2.f3729a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3685b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3684a.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC0879ce> arrayList2 = this.f3684a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC0879ce abstractC0879ce2 = arrayList2.get(size8);
                    abstractC0879ce2.f3614a.setAlpha(1.0f);
                    m3051f(abstractC0879ce2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3684a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3686c.size() - 1; size9 >= 0; size9--) {
                ArrayList<C0912q> arrayList3 = this.f3686c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3311a(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3686c.remove(arrayList3);
                    }
                }
            }
            m3312a(this.f3689f);
            m3312a(this.f3688e);
            m3312a(this.f3687d);
            m3312a(this.f3690g);
            m3055i();
        }
    }

    /* renamed from: a */
    private static void m3312a(List<AbstractC0879ce> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3614a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: a */
    public final boolean mo3043a(AbstractC0879ce abstractC0879ce, List<Object> list) {
        return !list.isEmpty() || super.mo3043a(abstractC0879ce, list);
    }
}
