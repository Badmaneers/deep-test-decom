package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.o */
/* loaded from: classes.dex */
public final class C2340o {

    /* renamed from: a */
    private InterfaceC2347v f10323a;

    public C2340o(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.m6394c();
        swipeDismissBehavior.m6395d();
        swipeDismissBehavior.m6393b();
    }

    /* renamed from: a */
    public final void m7456a(BaseTransientBottomBar<?> baseTransientBottomBar) {
        this.f10323a = baseTransientBottomBar.f10275c;
    }

    /* renamed from: a */
    public final void m7455a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    if (coordinatorLayout.m1402a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        C2345t.m7457a().m7466d(this.f10323a);
                        return;
                    }
                    return;
                case 1:
                    break;
                default:
                    return;
            }
        }
        C2345t.m7457a().m7467e(this.f10323a);
    }
}
