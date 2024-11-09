package androidx.core.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoScrollHelper.java */
/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class RunnableC0565c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractViewOnTouchListenerC0563a f2510a;

    public RunnableC0565c(AbstractViewOnTouchListenerC0563a abstractViewOnTouchListenerC0563a) {
        this.f2510a = abstractViewOnTouchListenerC0563a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2510a.f2486e) {
            if (this.f2510a.f2484c) {
                this.f2510a.f2484c = false;
                this.f2510a.f2482a.m2028c();
            }
            C0564b c0564b = this.f2510a.f2482a;
            if (c0564b.m2030e() || !this.f2510a.m2022a()) {
                this.f2510a.f2486e = false;
                return;
            }
            if (this.f2510a.f2485d) {
                this.f2510a.f2485d = false;
                AbstractViewOnTouchListenerC0563a abstractViewOnTouchListenerC0563a = this.f2510a;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                abstractViewOnTouchListenerC0563a.f2483b.onTouchEvent(obtain);
                obtain.recycle();
            }
            c0564b.m2031f();
            this.f2510a.mo2021a(c0564b.m2034i());
            C0538w.m1852a(this.f2510a.f2483b, this);
        }
    }
}
