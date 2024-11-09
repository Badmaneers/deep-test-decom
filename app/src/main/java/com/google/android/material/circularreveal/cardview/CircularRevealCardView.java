package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C2122c;
import com.google.android.material.circularreveal.C2128i;
import com.google.android.material.circularreveal.InterfaceC2124e;

/* loaded from: classes.dex */
public class CircularRevealCardView extends MaterialCardView implements InterfaceC2124e {

    /* renamed from: e */
    private final C2122c f9521e;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9521e = new C2122c(this);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    /* renamed from: a */
    public final void mo6768a() {
        this.f9521e.m6777a();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    /* renamed from: b */
    public final void mo6770b() {
        this.f9521e.m6782b();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    public void setRevealInfo(C2128i c2128i) {
        this.f9521e.m6781a(c2128i);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    public C2128i getRevealInfo() {
        return this.f9521e.m6783c();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    public void setCircularRevealScrimColor(int i) {
        this.f9521e.m6778a(i);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    public int getCircularRevealScrimColor() {
        return this.f9521e.m6784d();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f9521e.m6785e();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2124e
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f9521e.m6780a(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f9521e != null) {
            this.f9521e.m6779a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2123d
    /* renamed from: a */
    public final void mo6769a(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        if (this.f9521e != null) {
            return this.f9521e.m6786f();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC2123d
    /* renamed from: c */
    public final boolean mo6771c() {
        return super.isOpaque();
    }
}
