package color.support.p043v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.i */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1282i implements View.OnTouchListener {

    /* renamed from: a */
    private final float f5445a;

    /* renamed from: d */
    private final View f5448d;

    /* renamed from: e */
    private Runnable f5449e;

    /* renamed from: f */
    private Runnable f5450f;

    /* renamed from: g */
    private boolean f5451g;

    /* renamed from: h */
    private boolean f5452h;

    /* renamed from: i */
    private int f5453i;

    /* renamed from: j */
    private final int[] f5454j = new int[2];

    /* renamed from: b */
    private final int f5446b = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    private final int f5447c = (this.f5446b + ViewConfiguration.getLongPressTimeout()) / 2;

    /* renamed from: a */
    public abstract C1277d mo4079a();

    public AbstractViewOnTouchListenerC1282i(View view) {
        this.f5448d = view;
        this.f5445a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.widget.AbstractViewOnTouchListenerC1282i.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    protected boolean mo4080b() {
        C1277d mo4079a = mo4079a();
        if (mo4079a == null || mo4079a.m4210b()) {
            return true;
        }
        mo4079a.mo4108h();
        return true;
    }

    /* renamed from: c */
    private void m4234c() {
        if (this.f5450f != null) {
            this.f5448d.removeCallbacks(this.f5450f);
        }
        if (this.f5449e != null) {
            this.f5448d.removeCallbacks(this.f5449e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:            r1 = r1.f5415f;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m4230a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.f5448d
            color.support.v7.widget.d r1 = r4.mo4079a()
            r2 = 0
            if (r1 == 0) goto L44
            boolean r3 = r1.m4210b()
            if (r3 != 0) goto L10
            goto L44
        L10:
            color.support.v7.widget.h r1 = color.support.p043v7.widget.C1277d.m4199a(r1)
            if (r1 == 0) goto L43
            boolean r3 = r1.isShown()
            if (r3 != 0) goto L1d
            goto L43
        L1d:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtainNoHistory(r5)
            r4.m4233b(r0, r3)
            r4.m4231a(r1, r3)
            int r4 = r4.f5453i
            boolean r4 = r1.m4228a(r3, r4)
            r3.recycle()
            int r5 = r5.getActionMasked()
            r0 = 1
            if (r5 == r0) goto L3c
            r1 = 3
            if (r5 == r1) goto L3c
            r5 = r0
            goto L3d
        L3c:
            r5 = r2
        L3d:
            if (r4 == 0) goto L42
            if (r5 == 0) goto L42
            return r0
        L42:
            return r2
        L43:
            return r2
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.widget.AbstractViewOnTouchListenerC1282i.m4230a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m4231a(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f5454j);
        motionEvent.offsetLocation(-r1[0], -r1[1]);
        return true;
    }

    /* renamed from: b */
    private boolean m4233b(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f5454j);
        motionEvent.offsetLocation(r1[0], r1[1]);
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ void m4232b(AbstractViewOnTouchListenerC1282i abstractViewOnTouchListenerC1282i) {
        abstractViewOnTouchListenerC1282i.m4234c();
        View view = abstractViewOnTouchListenerC1282i.f5448d;
        if (!view.isEnabled() || view.isLongClickable()) {
            return;
        }
        abstractViewOnTouchListenerC1282i.mo4080b();
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        abstractViewOnTouchListenerC1282i.f5451g = true;
        abstractViewOnTouchListenerC1282i.f5452h = true;
    }
}
