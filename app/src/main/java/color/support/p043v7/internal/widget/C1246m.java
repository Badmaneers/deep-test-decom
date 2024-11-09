package color.support.p043v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.C0295ef;
import color.support.p041a.p042a.C1154b;
import color.support.p043v7.widget.C1300u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.m */
/* loaded from: classes.dex */
public class C1246m extends C1300u implements InterfaceC1251r {

    /* renamed from: a */
    final /* synthetic */ ColorBaseSpinner f5265a;

    /* renamed from: b */
    private CharSequence f5266b;

    /* renamed from: e */
    private ListAdapter f5267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246m(ColorBaseSpinner colorBaseSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5265a = colorBaseSpinner;
        m4212c(colorBaseSpinner);
        m4220l();
        m4219k();
        m4207a(new C1247n(this, colorBaseSpinner));
    }

    @Override // color.support.p043v7.widget.C1277d, color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4084a(ListAdapter listAdapter) {
        super.mo4084a(listAdapter);
        this.f5267e = listAdapter;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: c */
    public final CharSequence mo4088c() {
        return this.f5266b;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4085a(CharSequence charSequence) {
        this.f5266b = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m4094g() {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        int i;
        Rect rect7;
        Drawable d = m4213d();
        int i2 = 0;
        if (d != null) {
            rect5 = this.f5265a.f5142K;
            d.getPadding(rect5);
            if (C0295ef.m987a(this.f5265a)) {
                rect7 = this.f5265a.f5142K;
                i = rect7.right;
            } else {
                rect6 = this.f5265a.f5142K;
                i = -rect6.left;
            }
            i2 = i;
        } else {
            rect = this.f5265a.f5142K;
            rect2 = this.f5265a.f5142K;
            rect2.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.f5265a.getPaddingLeft();
        int paddingRight = this.f5265a.getPaddingRight();
        int width = this.f5265a.getWidth();
        if (this.f5265a.f5138G == -2) {
            int mo4035a = this.f5265a.mo4035a((SpinnerAdapter) this.f5267e, m4213d());
            int i3 = this.f5265a.getContext().getResources().getDisplayMetrics().widthPixels;
            rect3 = this.f5265a.f5142K;
            int i4 = i3 - rect3.left;
            rect4 = this.f5265a.f5142K;
            int i5 = i4 - rect4.right;
            if (mo4035a > i5) {
                mo4035a = i5;
            }
            m4214d(Math.max(mo4035a, (width - paddingLeft) - paddingRight));
        } else if (this.f5265a.f5138G == -1) {
            m4214d((width - paddingLeft) - paddingRight);
        } else {
            m4214d(this.f5265a.f5138G);
        }
        m4209b(C0295ef.m987a(this.f5265a) ? i2 + ((width - paddingRight) - m4222n()) : i2 + paddingLeft);
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public void mo4083a(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean b = m4210b();
        m4094g();
        m4223o();
        super.mo4108h();
        ListView r = m4226r();
        r.setChoiceMode(1);
        C1154b.m3810a(r, i2);
        m4218f(this.f5265a.getSelectedItemPosition());
        if (b || (viewTreeObserver = this.f5265a.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1248o viewTreeObserverOnGlobalLayoutListenerC1248o = new ViewTreeObserverOnGlobalLayoutListenerC1248o(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1248o);
        m4208a(new C1249p(this, viewTreeObserverOnGlobalLayoutListenerC1248o));
    }
}
