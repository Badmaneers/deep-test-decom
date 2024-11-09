package color.support.p043v7.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.af */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1223af implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ListView f5214a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5215b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnPreDrawListenerC1223af(C1256w c1256w, ListView listView) {
        this.f5215b = c1256w;
        this.f5214a = listView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        int i2;
        this.f5214a.getViewTreeObserver().removeOnPreDrawListener(this);
        int m4095a = C1256w.m4095a((View) this.f5214a);
        i = this.f5215b.f5287l;
        if (m4095a <= i) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = this.f5214a.getLayoutParams();
        i2 = this.f5215b.f5287l;
        layoutParams.height = i2;
        this.f5214a.setLayoutParams(layoutParams);
        return false;
    }
}
