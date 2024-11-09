package androidx.appcompat.widget;

import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* renamed from: androidx.appcompat.widget.bq */
/* loaded from: classes.dex */
public final class RunnableC0225bq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractViewOnAttachStateChangeListenerC0224bp f1226a;

    public RunnableC0225bq(AbstractViewOnAttachStateChangeListenerC0224bp abstractViewOnAttachStateChangeListenerC0224bp) {
        this.f1226a = abstractViewOnAttachStateChangeListenerC0224bp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.f1226a.f1219c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
