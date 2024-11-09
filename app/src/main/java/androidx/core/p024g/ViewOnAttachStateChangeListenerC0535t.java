package androidx.core.p024g;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* renamed from: androidx.core.g.t */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0535t implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f2377a;

    /* renamed from: b */
    private ViewTreeObserver f2378b;

    /* renamed from: c */
    private final Runnable f2379c;

    private ViewOnAttachStateChangeListenerC0535t(View view, Runnable runnable) {
        this.f2377a = view;
        this.f2378b = view.getViewTreeObserver();
        this.f2379c = runnable;
    }

    /* renamed from: a */
    public static ViewOnAttachStateChangeListenerC0535t m1813a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewOnAttachStateChangeListenerC0535t viewOnAttachStateChangeListenerC0535t = new ViewOnAttachStateChangeListenerC0535t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewOnAttachStateChangeListenerC0535t);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0535t);
        return viewOnAttachStateChangeListenerC0535t;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m1814a();
        this.f2379c.run();
        return true;
    }

    /* renamed from: a */
    private void m1814a() {
        if (this.f2378b.isAlive()) {
            this.f2378b.removeOnPreDrawListener(this);
        } else {
            this.f2377a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2377a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2378b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m1814a();
    }
}
