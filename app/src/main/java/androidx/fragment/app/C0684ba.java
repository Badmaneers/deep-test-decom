package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.ba */
/* loaded from: classes.dex */
final class C0684ba extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f2927a;

    /* renamed from: b */
    final /* synthetic */ C0679aw f2928b;

    public C0684ba(C0679aw c0679aw, Rect rect) {
        this.f2928b = c0679aw;
        this.f2927a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        if (this.f2927a == null || this.f2927a.isEmpty()) {
            return null;
        }
        return this.f2927a;
    }
}
