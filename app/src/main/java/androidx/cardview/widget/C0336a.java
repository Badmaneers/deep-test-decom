package androidx.cardview.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardView.java */
/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
public final class C0336a implements InterfaceC0342g {

    /* renamed from: a */
    final /* synthetic */ CardView f1539a;

    /* renamed from: b */
    private Drawable f1540b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0336a(CardView cardView) {
        this.f1539a = cardView;
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: a */
    public final void mo1086a(Drawable drawable) {
        this.f1540b = drawable;
        this.f1539a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: a */
    public final boolean mo1087a() {
        return this.f1539a.getUseCompatPadding();
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: b */
    public final boolean mo1088b() {
        return this.f1539a.getPreventCornerOverlap();
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: a */
    public final void mo1085a(int i, int i2, int i3, int i4) {
        this.f1539a.f1535d.set(i, i2, i3, i4);
        CardView cardView = this.f1539a;
        super/*android.widget.FrameLayout*/.setPadding(i + cardView.f1534c.left, i2 + this.f1539a.f1534c.top, i3 + this.f1539a.f1534c.right, i4 + this.f1539a.f1534c.bottom);
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: a */
    public final void mo1084a(int i, int i2) {
        if (i > this.f1539a.f1532a) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.f1539a.f1533b) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: c */
    public final Drawable mo1089c() {
        return this.f1540b;
    }

    @Override // androidx.cardview.widget.InterfaceC0342g
    /* renamed from: d */
    public final View mo1090d() {
        return this.f1539a;
    }
}
