package color.support.p043v7.internal.widget;

import android.view.View;
import color.support.p041a.p042a.C1154b;
import color.support.p043v7.widget.AbstractViewOnTouchListenerC1282i;
import color.support.p043v7.widget.C1277d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.i */
/* loaded from: classes.dex */
public final class C1242i extends AbstractViewOnTouchListenerC1282i {

    /* renamed from: a */
    final /* synthetic */ C1246m f5256a;

    /* renamed from: b */
    final /* synthetic */ ColorBaseSpinner f5257b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242i(ColorBaseSpinner colorBaseSpinner, View view, C1246m c1246m) {
        super(view);
        this.f5257b = colorBaseSpinner;
        this.f5256a = c1246m;
    }

    @Override // color.support.p043v7.widget.AbstractViewOnTouchListenerC1282i
    /* renamed from: a */
    public final C1277d mo4079a() {
        return this.f5256a;
    }

    @Override // color.support.p043v7.widget.AbstractViewOnTouchListenerC1282i
    /* renamed from: b */
    public final boolean mo4080b() {
        if (this.f5257b.f5137F.mo4087b()) {
            return true;
        }
        this.f5257b.f5137F.mo4083a(this.f5257b.getTextDirection(), C1154b.m3809a(this.f5257b));
        return true;
    }
}
