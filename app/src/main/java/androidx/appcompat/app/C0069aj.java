package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.aj */
/* loaded from: classes.dex */
public final class C0069aj extends ContentFrameLayout {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0069aj(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(context);
        this.f208a = appCompatDelegateImpl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f208a.m108a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                this.f208a.m135r();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0057a.m46b(getContext(), i));
    }
}
