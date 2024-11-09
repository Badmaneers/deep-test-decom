package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.aw */
/* loaded from: classes.dex */
public final class C0679aw extends AbstractC0685bb {
    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final boolean mo2408a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final Object mo2409b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: c */
    public final Object mo2414c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2404a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m2418a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2406a(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2403a(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2417a(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0680ax(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2406a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2406a(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m2399a(transition) || !m2419a((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m2399a(Transition transition) {
        return (m2419a((List) transition.getTargetIds()) && m2419a((List) transition.getTargetNames()) && m2419a((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final Object mo2400a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final void mo2412b(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0681ay(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final Object mo2410b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2401a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2405a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0682az(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2407a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2413b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final void mo2413b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2413b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m2399a(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: b */
    public final void mo2411b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: c */
    public final void mo2415c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0685bb
    /* renamed from: a */
    public final void mo2402a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0684ba(this, rect));
        }
    }
}
