package color.support.p043v7.internal.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import color.support.p043v7.widget.ViewOnTouchListenerC1288o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.al */
/* loaded from: classes.dex */
public final class C1229al extends ViewOnTouchListenerC1288o {

    /* renamed from: a */
    final /* synthetic */ C1256w f5226a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1229al(C1256w c1256w) {
        super(c1256w);
        this.f5226a = c1256w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1229al(C1256w c1256w, byte b) {
        this(c1256w);
    }

    @Override // color.support.p043v7.widget.ViewOnTouchListenerC1288o, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouch = super.onTouch(view, motionEvent);
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            ListView r = this.f5226a.m4226r();
            if (x < 0 || x >= C1256w.m4101b(r) || y < 0 || y >= C1256w.m4095a((View) r)) {
                this.f5226a.mo4081a();
                return true;
            }
        }
        return onTouch;
    }
}
