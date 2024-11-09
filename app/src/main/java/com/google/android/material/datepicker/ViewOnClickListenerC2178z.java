package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.z */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2178z implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2177y f9674a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2178z(C2177y c2177y) {
        this.f9674a = c2177y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinkedHashSet linkedHashSet;
        linkedHashSet = this.f9674a.f9657ah;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            it.next();
            this.f9674a.m6908ae();
        }
        this.f9674a.m2428c();
    }
}
