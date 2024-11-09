package androidx.transition;

import android.view.ViewGroup;
import androidx.core.p024g.C0538w;
import androidx.p011b.C0318a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* renamed from: androidx.transition.al */
/* loaded from: classes.dex */
public final class C1009al {

    /* renamed from: b */
    private static AbstractC1001ad f4132b = new C1046c();

    /* renamed from: c */
    private static ThreadLocal<WeakReference<C0318a<ViewGroup, ArrayList<AbstractC1001ad>>>> f4133c = new ThreadLocal<>();

    /* renamed from: a */
    static ArrayList<ViewGroup> f4131a = new ArrayList<>();

    /* renamed from: a */
    public static C0318a<ViewGroup, ArrayList<AbstractC1001ad>> m3524a() {
        C0318a<ViewGroup, ArrayList<AbstractC1001ad>> c0318a;
        WeakReference<C0318a<ViewGroup, ArrayList<AbstractC1001ad>>> weakReference = f4133c.get();
        if (weakReference != null && (c0318a = weakReference.get()) != null) {
            return c0318a;
        }
        C0318a<ViewGroup, ArrayList<AbstractC1001ad>> c0318a2 = new C0318a<>();
        f4133c.set(new WeakReference<>(c0318a2));
        return c0318a2;
    }

    /* renamed from: a */
    public static void m3525a(ViewGroup viewGroup, AbstractC1001ad abstractC1001ad) {
        if (f4131a.contains(viewGroup) || !C0538w.m1819C(viewGroup)) {
            return;
        }
        f4131a.add(viewGroup);
        if (abstractC1001ad == null) {
            abstractC1001ad = f4132b;
        }
        AbstractC1001ad clone = abstractC1001ad.clone();
        ArrayList<AbstractC1001ad> arrayList = m3524a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1001ad> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3508d(viewGroup);
            }
        }
        if (clone != null) {
            clone.m3489a(viewGroup, true);
        }
        C1000ac m3474a = C1000ac.m3474a(viewGroup);
        if (m3474a != null) {
            m3474a.m3475a();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (clone == null || viewGroup == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1010am viewOnAttachStateChangeListenerC1010am = new ViewOnAttachStateChangeListenerC1010am(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1010am);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewOnAttachStateChangeListenerC1010am);
    }
}
