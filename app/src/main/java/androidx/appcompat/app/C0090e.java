package androidx.appcompat.app;

import android.view.View;
import androidx.core.widget.InterfaceC0574l;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public final class C0090e implements InterfaceC0574l {

    /* renamed from: a */
    final /* synthetic */ View f292a;

    /* renamed from: b */
    final /* synthetic */ View f293b;

    /* renamed from: c */
    final /* synthetic */ AlertController f294c;

    public C0090e(AlertController alertController, View view, View view2) {
        this.f294c = alertController;
        this.f292a = view;
        this.f293b = view2;
    }

    @Override // androidx.core.widget.InterfaceC0574l
    /* renamed from: a */
    public final void mo231a(NestedScrollView nestedScrollView) {
        AlertController.m50a(nestedScrollView, this.f292a, this.f293b);
    }
}
