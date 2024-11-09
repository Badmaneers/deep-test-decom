package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.InterfaceC0149ai;

/* compiled from: ForwardingListener.java */
/* renamed from: androidx.appcompat.widget.bp */
/* loaded from: classes.dex */
public abstract class AbstractViewOnAttachStateChangeListenerC0224bp implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f1217a;

    /* renamed from: b */
    private final int f1218b;

    /* renamed from: c */
    final View f1219c;

    /* renamed from: d */
    private final int f1220d;

    /* renamed from: e */
    private Runnable f1221e;

    /* renamed from: f */
    private Runnable f1222f;

    /* renamed from: g */
    private boolean f1223g;

    /* renamed from: h */
    private int f1224h;

    /* renamed from: i */
    private final int[] f1225i = new int[2];

    /* renamed from: a */
    public abstract InterfaceC0149ai mo405a();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public AbstractViewOnAttachStateChangeListenerC0224bp(View view) {
        this.f1219c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1217a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1218b = ViewConfiguration.getTapTimeout();
        this.f1220d = (this.f1218b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1223g = false;
        this.f1224h = -1;
        if (this.f1221e != null) {
            this.f1219c.removeCallbacks(this.f1221e);
        }
    }

    /* renamed from: b */
    protected boolean mo406b() {
        InterfaceC0149ai mo405a = mo405a();
        if (mo405a == null || mo405a.mo393e()) {
            return true;
        }
        mo405a.mo391a_();
        return true;
    }

    /* renamed from: c */
    protected boolean mo676c() {
        InterfaceC0149ai mo405a = mo405a();
        if (mo405a == null || !mo405a.mo393e()) {
            return true;
        }
        mo405a.mo392d();
        return true;
    }

    /* renamed from: e */
    private void m852e() {
        if (this.f1222f != null) {
            this.f1219c.removeCallbacks(this.f1222f);
        }
        if (this.f1221e != null) {
            this.f1219c.removeCallbacks(this.f1221e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m853d() {
        m852e();
        View view = this.f1219c;
        if (view.isEnabled() && !view.isLongClickable() && mo406b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1223g = true;
        }
    }
}
