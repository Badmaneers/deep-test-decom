package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.aa */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2131aa implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2177y f9554a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2131aa(C2177y c2177y) {
        this.f9554a = c2177y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinkedHashSet linkedHashSet;
        linkedHashSet = this.f9554a.f9658ai;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        this.f9554a.m2428c();
    }
}
