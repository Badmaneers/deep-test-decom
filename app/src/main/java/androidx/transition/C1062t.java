package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0685bb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.t */
/* loaded from: classes.dex */
public class C1062t extends AbstractC0685bb {
    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final boolean mo2408a(Object obj) {
        return obj instanceof AbstractC1001ad;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final Object mo2409b(Object obj) {
        if (obj != null) {
            return ((AbstractC1001ad) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: c */
    public final Object mo2414c(Object obj) {
        if (obj == null) {
            return null;
        }
        C1013ap c1013ap = new C1013ap();
        c1013ap.m3531a((AbstractC1001ad) obj);
        return c1013ap;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2404a(Object obj, View view, ArrayList<View> arrayList) {
        C1013ap c1013ap = (C1013ap) obj;
        ArrayList<View> arrayList2 = c1013ap.f4101c;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m2418a((List<View>) arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo2406a(c1013ap, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2403a(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2417a(view, rect);
            ((AbstractC1001ad) obj).mo3490a(new C1063u(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2406a(Object obj, ArrayList<View> arrayList) {
        AbstractC1001ad abstractC1001ad = (AbstractC1001ad) obj;
        if (abstractC1001ad == null) {
            return;
        }
        int i = 0;
        if (abstractC1001ad instanceof C1013ap) {
            C1013ap c1013ap = (C1013ap) abstractC1001ad;
            int m3535m = c1013ap.m3535m();
            while (i < m3535m) {
                mo2406a(c1013ap.m3532b(i), arrayList);
                i++;
            }
            return;
        }
        if (m3583a(abstractC1001ad) || !m2419a((List) abstractC1001ad.f4101c)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            abstractC1001ad.mo3500b(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final Object mo2400a(Object obj, Object obj2, Object obj3) {
        C1013ap c1013ap = new C1013ap();
        if (obj != null) {
            c1013ap.m3531a((AbstractC1001ad) obj);
        }
        if (obj2 != null) {
            c1013ap.m3531a((AbstractC1001ad) obj2);
        }
        if (obj3 != null) {
            c1013ap.m3531a((AbstractC1001ad) obj3);
        }
        return c1013ap;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final void mo2412b(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC1001ad) obj).mo3484a(new C1064v(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final Object mo2410b(Object obj, Object obj2, Object obj3) {
        AbstractC1001ad abstractC1001ad = (AbstractC1001ad) obj;
        AbstractC1001ad abstractC1001ad2 = (AbstractC1001ad) obj2;
        AbstractC1001ad abstractC1001ad3 = (AbstractC1001ad) obj3;
        if (abstractC1001ad != null && abstractC1001ad2 != null) {
            abstractC1001ad = new C1013ap().m3531a(abstractC1001ad).m3531a(abstractC1001ad2).m3530a(1);
        } else if (abstractC1001ad == null) {
            abstractC1001ad = abstractC1001ad2 != null ? abstractC1001ad2 : null;
        }
        if (abstractC1001ad3 == null) {
            return abstractC1001ad;
        }
        C1013ap c1013ap = new C1013ap();
        if (abstractC1001ad != null) {
            c1013ap.m3531a(abstractC1001ad);
        }
        c1013ap.m3531a(abstractC1001ad3);
        return c1013ap;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2401a(ViewGroup viewGroup, Object obj) {
        C1009al.m3525a(viewGroup, (AbstractC1001ad) obj);
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2405a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC1001ad) obj).mo3484a(new C1065w(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2407a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1013ap c1013ap = (C1013ap) obj;
        if (c1013ap != null) {
            c1013ap.f4101c.clear();
            c1013ap.f4101c.addAll(arrayList2);
            mo2413b((Object) c1013ap, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final void mo2413b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1001ad abstractC1001ad = (AbstractC1001ad) obj;
        int i = 0;
        if (abstractC1001ad instanceof C1013ap) {
            C1013ap c1013ap = (C1013ap) abstractC1001ad;
            int m3535m = c1013ap.m3535m();
            while (i < m3535m) {
                mo2413b((Object) c1013ap.m3532b(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m3583a(abstractC1001ad)) {
            return;
        }
        ArrayList<View> arrayList3 = abstractC1001ad.f4101c;
        if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                abstractC1001ad.mo3500b(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1001ad.mo3505c(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final void mo2411b(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1001ad) obj).mo3500b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: c */
    public final void mo2415c(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1001ad) obj).mo3505c(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2402a(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1001ad) obj).mo3490a(new C1066x(this, rect));
        }
    }

    /* renamed from: a */
    private static boolean m3583a(AbstractC1001ad abstractC1001ad) {
        return (m2419a((List) abstractC1001ad.f4100b) && m2419a((List) abstractC1001ad.m3509e()) && m2419a((List) abstractC1001ad.m3511f())) ? false : true;
    }
}
