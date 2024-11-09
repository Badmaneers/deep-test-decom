package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.az */
/* loaded from: classes.dex */
final class C0682az implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Object f2920a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f2921b;

    /* renamed from: c */
    final /* synthetic */ Object f2922c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f2923d;

    /* renamed from: e */
    final /* synthetic */ Object f2924e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f2925f;

    /* renamed from: g */
    final /* synthetic */ C0679aw f2926g;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public C0682az(C0679aw c0679aw, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f2926g = c0679aw;
        this.f2920a = obj;
        this.f2921b = arrayList;
        this.f2922c = obj2;
        this.f2923d = arrayList2;
        this.f2924e = obj3;
        this.f2925f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (this.f2920a != null) {
            this.f2926g.mo2413b(this.f2920a, this.f2921b, (ArrayList<View>) null);
        }
        if (this.f2922c != null) {
            this.f2926g.mo2413b(this.f2922c, this.f2923d, (ArrayList<View>) null);
        }
        if (this.f2924e != null) {
            this.f2926g.mo2413b(this.f2924e, this.f2925f, (ArrayList<View>) null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
