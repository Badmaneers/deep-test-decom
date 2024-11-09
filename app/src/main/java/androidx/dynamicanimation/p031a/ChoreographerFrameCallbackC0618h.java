package androidx.dynamicanimation.p031a;

import android.view.Choreographer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationHandler.java */
/* renamed from: androidx.dynamicanimation.a.h */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0618h implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ C0617g f2667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChoreographerFrameCallbackC0618h(C0617g c0617g) {
        this.f2667a = c0617g;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f2667a.f2660a.m2197a();
    }
}
