package com.color.support.widget.floatingbutton;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.d */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1509d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButton f7234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1509d(ColorFloatingButton colorFloatingButton) {
        this.f7234a = colorFloatingButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1518m interfaceC1518m;
        InterfaceC1518m interfaceC1518m2;
        if (this.f7234a.m5087e()) {
            interfaceC1518m = this.f7234a.f7196t;
            if (interfaceC1518m != null) {
                interfaceC1518m2 = this.f7234a.f7196t;
                if (interfaceC1518m2.m5134a()) {
                    return;
                }
            }
            this.f7234a.m5084b();
            return;
        }
        this.f7234a.m5083a();
    }
}
