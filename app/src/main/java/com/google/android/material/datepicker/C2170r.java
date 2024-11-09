package com.google.android.material.datepicker;

import android.os.Build;
import androidx.recyclerview.widget.AbstractC0865br;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
final class C2170r extends AbstractC0865br {

    /* renamed from: a */
    final /* synthetic */ C2138ah f9642a;

    /* renamed from: b */
    final /* synthetic */ MaterialButton f9643b;

    /* renamed from: c */
    final /* synthetic */ C2163k f9644c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2170r(C2163k c2163k, C2138ah c2138ah, MaterialButton materialButton) {
        this.f9644c = c2163k;
        this.f9642a = c2138ah;
        this.f9643b = materialButton;
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3137a(RecyclerView recyclerView, int i, int i2) {
        int m2851p;
        if (i < 0) {
            m2851p = this.f9644c.m6887af().m2849n();
        } else {
            m2851p = this.f9644c.m6887af().m2851p();
        }
        this.f9644c.f9631i = this.f9642a.m6841d(m2851p);
        this.f9643b.setText(this.f9642a.m6841d(m2851p).m6823d());
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3136a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.f9643b.getText();
            if (Build.VERSION.SDK_INT >= 16) {
                recyclerView.announceForAccessibility(text);
            } else {
                recyclerView.sendAccessibilityEvent(2048);
            }
        }
    }
}
