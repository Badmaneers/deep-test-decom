package color.support.p043v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.o */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC1288o implements View.OnTouchListener {

    /* renamed from: b */
    final /* synthetic */ C1277d f5460b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewOnTouchListenerC1288o(C1277d c1277d) {
        this.f5460b = c1277d;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Handler handler;
        RunnableC1289p runnableC1289p;
        Handler handler2;
        RunnableC1289p runnableC1289p2;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.f5460b.f5412c != null && this.f5460b.f5412c.isShowing() && x >= 0 && x < this.f5460b.f5412c.getWidth() && y >= 0 && y < this.f5460b.f5412c.getHeight()) {
            handler2 = this.f5460b.f5407A;
            runnableC1289p2 = this.f5460b.f5431v;
            handler2.postDelayed(runnableC1289p2, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler = this.f5460b.f5407A;
        runnableC1289p = this.f5460b.f5431v;
        handler.removeCallbacks(runnableC1289p);
        return false;
    }
}
