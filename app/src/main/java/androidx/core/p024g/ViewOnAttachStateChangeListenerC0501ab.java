package androidx.core.p024g;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.ab */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC0501ab implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private WeakHashMap<View, Boolean> f2336a = new WeakHashMap<>();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        for (Map.Entry<View, Boolean> entry : this.f2336a.entrySet()) {
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            boolean z = key.getVisibility() == 0;
            if (booleanValue != z) {
                if (z) {
                    C0538w.m1875f(key, 16);
                }
                this.f2336a.put(key, Boolean.valueOf(z));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
