package color.support.p043v7.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBasePopupWindow.java */
/* renamed from: color.support.v7.widget.t */
/* loaded from: classes.dex */
public final class C1299t extends FrameLayout {

    /* renamed from: a */
    final /* synthetic */ C1296q f5551a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299t(C1296q c1296q, Context context) {
        super(context);
        this.f5551a = c1296q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] iArr;
        z = this.f5551a.f5512M;
        if (z) {
            int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
            iArr = C1296q.f5499R;
            View.mergeDrawableStates(onCreateDrawableState, iArr);
            return onCreateDrawableState;
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f5551a.dismiss();
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        onTouchListener = this.f5551a.f5544u;
        if (onTouchListener != null) {
            onTouchListener2 = this.f5551a.f5544u;
            if (onTouchListener2.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0 && (x < 0 || x >= getWidth() || y < 0 || y >= getHeight())) {
            this.f5551a.dismiss();
            return true;
        }
        if (motionEvent.getAction() == 4) {
            this.f5551a.dismiss();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEvent(int i) {
        View view;
        View view2;
        view = this.f5551a.f5528e;
        if (view != null) {
            view2 = this.f5551a.f5528e;
            view2.sendAccessibilityEvent(i);
        } else {
            super.sendAccessibilityEvent(i);
        }
    }
}
