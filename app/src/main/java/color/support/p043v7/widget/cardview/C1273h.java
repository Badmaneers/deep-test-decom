package color.support.p043v7.widget.cardview;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ColorCardView.java */
/* renamed from: color.support.v7.widget.cardview.h */
/* loaded from: classes.dex */
final class C1273h implements InterfaceC1271f {

    /* renamed from: a */
    final /* synthetic */ ColorCardView f5375a;

    /* renamed from: b */
    private Drawable f5376b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1273h(ColorCardView colorCardView) {
        this.f5375a = colorCardView;
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: a */
    public final void mo4170a(Drawable drawable) {
        this.f5376b = drawable;
        this.f5375a.setBackgroundDrawable(drawable);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: b */
    public final boolean mo4171b() {
        return this.f5375a.getUseCompatPadding();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: c */
    public final boolean mo4172c() {
        return this.f5375a.getPreventCornerOverlap();
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: a */
    public final void mo4169a(int i, int i2, int i3, int i4) {
        this.f5375a.f5368d.set(i, i2, i3, i4);
        ColorCardView colorCardView = this.f5375a;
        super/*android.widget.FrameLayout*/.setPadding(i + colorCardView.f5367c.left, i2 + this.f5375a.f5367c.top, i3 + this.f5375a.f5367c.right, i4 + this.f5375a.f5367c.bottom);
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: a */
    public final void mo4168a(int i, int i2) {
        if (i > this.f5375a.f5365a) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.f5375a.f5366b) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: a */
    public final Drawable mo4167a() {
        return this.f5376b;
    }

    @Override // color.support.p043v7.widget.cardview.InterfaceC1271f
    /* renamed from: d */
    public final View mo4173d() {
        return this.f5375a;
    }
}
