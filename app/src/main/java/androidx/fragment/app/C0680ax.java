package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.ax */
/* loaded from: classes.dex */
final class C0680ax extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f2915a;

    /* renamed from: b */
    final /* synthetic */ C0679aw f2916b;

    public C0680ax(C0679aw c0679aw, Rect rect) {
        this.f2916b = c0679aw;
        this.f2915a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f2915a;
    }
}
