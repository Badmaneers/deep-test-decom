package color.support.p043v7.app;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.s */
/* loaded from: classes.dex */
public final class ComponentCallbacksC1209s implements ComponentCallbacks {

    /* renamed from: a */
    final /* synthetic */ ColorAlertController f5015a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacksC1209s(ColorAlertController colorAlertController) {
        this.f5015a = colorAlertController;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5015a.m3978e();
        this.f5015a.m3997s();
        this.f5015a.m3993o();
        this.f5015a.m3994p();
    }
}
