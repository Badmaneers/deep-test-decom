package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.view.menu.InterfaceC0149ai;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.ar */
/* loaded from: classes.dex */
public final class C0199ar extends AbstractViewOnAttachStateChangeListenerC0224bp {

    /* renamed from: a */
    final /* synthetic */ C0203av f1141a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f1142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199ar(AppCompatSpinner appCompatSpinner, View view, C0203av c0203av) {
        super(view);
        this.f1142b = appCompatSpinner;
        this.f1141a = c0203av;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: a */
    public final InterfaceC0149ai mo405a() {
        return this.f1141a;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: b */
    public final boolean mo406b() {
        if (this.f1142b.getInternalPopup().mo752e()) {
            return true;
        }
        this.f1142b.m577a();
        return true;
    }
}
