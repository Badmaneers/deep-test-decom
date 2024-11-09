package color.support.p043v7.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBasePopupWindow.java */
/* renamed from: color.support.v7.widget.r */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC1297r implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    final /* synthetic */ C1296q f5550a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnScrollChangedListenerC1297r(C1296q c1296q) {
        this.f5550a = c1296q;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        WeakReference weakReference;
        View view;
        View view2;
        View view3;
        int i;
        int i2;
        int i3;
        boolean m4264a;
        WeakReference weakReference2;
        weakReference = this.f5550a.f5517S;
        if (weakReference != null) {
            weakReference2 = this.f5550a.f5517S;
            view = (View) weakReference2.get();
        } else {
            view = null;
        }
        View view4 = view;
        if (view4 != null) {
            view2 = this.f5550a.f5529f;
            if (view2 != null) {
                view3 = this.f5550a.f5529f;
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view3.getLayoutParams();
                C1296q c1296q = this.f5550a;
                C1296q c1296q2 = this.f5550a;
                i = this.f5550a.f5519U;
                i2 = this.f5550a.f5520V;
                i3 = this.f5550a.f5521W;
                m4264a = c1296q2.m4264a(view4, layoutParams, i, i2, i3);
                c1296q.m4263a(m4264a);
                this.f5550a.update(layoutParams.x, layoutParams.y, -1, -1, true);
            }
        }
    }
}
