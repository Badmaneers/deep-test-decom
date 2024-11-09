package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.bz */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0234bz implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C0228bt f1271a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC0234bz(C0228bt c0228bt) {
        this.f1271a = c0228bt;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.f1271a.f1247g != null && this.f1271a.f1247g.isShowing() && x >= 0 && x < this.f1271a.f1247g.getWidth() && y >= 0 && y < this.f1271a.f1247g.getHeight()) {
            this.f1271a.f1246f.postDelayed(this.f1271a.f1245e, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        this.f1271a.f1246f.removeCallbacks(this.f1271a.f1245e);
        return false;
    }
}
