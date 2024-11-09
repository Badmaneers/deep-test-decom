package color.support.p043v7.app;

import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.t */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC1210t implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f5016a;

    /* renamed from: b */
    final /* synthetic */ ColorAlertController f5017b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC1210t(ColorAlertController colorAlertController, ViewGroup viewGroup) {
        this.f5017b = colorAlertController;
        this.f5016a = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ComponentCallbacks componentCallbacks;
        Context context;
        ContentObserver contentObserver;
        Context context2;
        ComponentCallbacks componentCallbacks2;
        this.f5016a.removeOnAttachStateChangeListener(this);
        componentCallbacks = this.f5017b.f4903F;
        if (componentCallbacks != null) {
            context2 = this.f5017b.f4900C;
            componentCallbacks2 = this.f5017b.f4903F;
            context2.unregisterComponentCallbacks(componentCallbacks2);
            ColorAlertController.m3985h(this.f5017b);
        }
        context = this.f5017b.f4900C;
        ContentResolver contentResolver = context.getContentResolver();
        contentObserver = this.f5017b.f4902E;
        contentResolver.unregisterContentObserver(contentObserver);
    }
}
