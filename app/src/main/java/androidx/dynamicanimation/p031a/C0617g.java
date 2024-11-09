package androidx.dynamicanimation.p031a;

import android.view.Choreographer;

/* compiled from: AnimationHandler.java */
/* renamed from: androidx.dynamicanimation.a.g */
/* loaded from: classes.dex */
public final class C0617g extends AbstractC0614d {

    /* renamed from: b */
    private final Choreographer f2665b;

    /* renamed from: c */
    private final Choreographer.FrameCallback f2666c;

    public C0617g(C0612b c0612b) {
        super(c0612b);
        this.f2665b = Choreographer.getInstance();
        this.f2666c = new ChoreographerFrameCallbackC0618h(this);
    }

    @Override // androidx.dynamicanimation.p031a.AbstractC0614d
    /* renamed from: a */
    public final void mo2199a() {
        this.f2665b.postFrameCallback(this.f2666c);
    }
}
