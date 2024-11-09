package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.ay */
/* loaded from: classes.dex */
final class C0681ay implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ View f2917a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f2918b;

    /* renamed from: c */
    final /* synthetic */ C0679aw f2919c;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    public C0681ay(C0679aw c0679aw, View view, ArrayList arrayList) {
        this.f2919c = c0679aw;
        this.f2917a = view;
        this.f2918b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f2917a.setVisibility(8);
        int size = this.f2918b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f2918b.get(i)).setVisibility(0);
        }
    }
}
