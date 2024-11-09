package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.df */
/* loaded from: classes.dex */
final class C0268df extends TouchDelegate {

    /* renamed from: a */
    private final View f1321a;

    /* renamed from: b */
    private final Rect f1322b;

    /* renamed from: c */
    private final Rect f1323c;

    /* renamed from: d */
    private final Rect f1324d;

    /* renamed from: e */
    private final int f1325e;

    /* renamed from: f */
    private boolean f1326f;

    public C0268df(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f1325e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1322b = new Rect();
        this.f1324d = new Rect();
        this.f1323c = new Rect();
        m919a(rect, rect2);
        this.f1321a = view;
    }

    /* renamed from: a */
    public final void m919a(Rect rect, Rect rect2) {
        this.f1322b.set(rect);
        this.f1324d.set(rect);
        this.f1324d.inset(-this.f1325e, -this.f1325e);
        this.f1323c.set(rect2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        boolean z2 = true;
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f1322b.contains(x, y)) {
                    this.f1326f = true;
                    z = true;
                    break;
                }
                z = false;
                break;
            case 1:
            case 2:
                z = this.f1326f;
                if (z && !this.f1324d.contains(x, y)) {
                    z2 = false;
                    break;
                }
                break;
            case 3:
                z = this.f1326f;
                this.f1326f = false;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (z2 && !this.f1323c.contains(x, y)) {
            motionEvent.setLocation(this.f1321a.getWidth() / 2, this.f1321a.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - this.f1323c.left, y - this.f1323c.top);
        }
        return this.f1321a.dispatchTouchEvent(motionEvent);
    }
}
