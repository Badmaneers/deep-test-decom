package com.color.support.widget.floatingbutton;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0865br;
import androidx.recyclerview.widget.RecyclerView;
import com.color.support.widget.floatingbutton.ColorFloatingButton;

/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.n */
/* loaded from: classes.dex */
final class C1519n extends AbstractC0865br {

    /* renamed from: a */
    final /* synthetic */ View f7251a;

    /* renamed from: b */
    final /* synthetic */ ColorFloatingButton.ScrollViewBehavior f7252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1519n(ColorFloatingButton.ScrollViewBehavior scrollViewBehavior, View view) {
        this.f7252b = scrollViewBehavior;
        this.f7251a = view;
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3136a(RecyclerView recyclerView, int i) {
        super.mo3136a(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3137a(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        super.mo3137a(recyclerView, i, i2);
        this.f7252b.f7210c = i2;
        if (this.f7251a instanceof ColorFloatingButton) {
            z = this.f7252b.f7209b;
            if (z) {
                this.f7252b.m5109a((ColorFloatingButton) this.f7251a, i2);
            }
        }
    }
}
