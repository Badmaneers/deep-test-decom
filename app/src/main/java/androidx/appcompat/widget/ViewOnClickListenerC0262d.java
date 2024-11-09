package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.AbstractC0128b;

/* compiled from: ActionBarContextView.java */
/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0262d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AbstractC0128b f1318a;

    /* renamed from: b */
    final /* synthetic */ ActionBarContextView f1319b;

    public ViewOnClickListenerC0262d(ActionBarContextView actionBarContextView, AbstractC0128b abstractC0128b) {
        this.f1319b = actionBarContextView;
        this.f1318a = abstractC0128b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1318a.mo220c();
    }
}
