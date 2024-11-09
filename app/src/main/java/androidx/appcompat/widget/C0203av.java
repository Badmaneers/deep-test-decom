package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import androidx.core.p024g.C0538w;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.av */
/* loaded from: classes.dex */
public final class C0203av extends C0228bt implements InterfaceC0209ba {

    /* renamed from: a */
    ListAdapter f1150a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f1151b;

    /* renamed from: h */
    private CharSequence f1152h;

    /* renamed from: i */
    private final Rect f1153i;

    /* renamed from: j */
    private int f1154j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203av(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1151b = appCompatSpinner;
        this.f1153i = new Rect();
        m862b(appCompatSpinner);
        m868j();
        m867i();
        m858a(new C0204aw(this, appCompatSpinner));
    }

    @Override // androidx.appcompat.widget.C0228bt, androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo745a(ListAdapter listAdapter) {
        super.mo745a(listAdapter);
        this.f1150a = listAdapter;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final CharSequence mo741a() {
        return this.f1152h;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo746a(CharSequence charSequence) {
        this.f1152h = charSequence;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo743a(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean e = mo393e();
        m756h();
        m873o();
        super.mo391a_();
        C0219bk c0219bk = this.f1243c;
        c0219bk.setChoiceMode(1);
        if (Build.VERSION.SDK_INT >= 17) {
            c0219bk.setTextDirection(i);
            c0219bk.setTextAlignment(i2);
        }
        int selectedItemPosition = this.f1151b.getSelectedItemPosition();
        C0219bk c0219bk2 = this.f1243c;
        if (mo393e() && c0219bk2 != null) {
            c0219bk2.setListSelectionHidden(false);
            c0219bk2.setSelection(selectedItemPosition);
            if (c0219bk2.getChoiceMode() != 0) {
                c0219bk2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (e || (viewTreeObserver = this.f1151b.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0205ax viewTreeObserverOnGlobalLayoutListenerC0205ax = new ViewTreeObserverOnGlobalLayoutListenerC0205ax(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0205ax);
        m859a(new C0206ay(this, viewTreeObserverOnGlobalLayoutListenerC0205ax));
    }

    /* renamed from: a */
    public final boolean m755a(View view) {
        return C0538w.m1822F(view) && view.getGlobalVisibleRect(this.f1153i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: c */
    public final void mo750c(int i) {
        this.f1154j = i;
    }

    /* renamed from: h */
    public final void m756h() {
        int i;
        Drawable background = this.f1247g.getBackground();
        int i2 = 0;
        if (background != null) {
            background.getPadding(this.f1151b.f881b);
            i2 = C0295ef.m987a(this.f1151b) ? this.f1151b.f881b.right : -this.f1151b.f881b.left;
        } else {
            Rect rect = this.f1151b.f881b;
            this.f1151b.f881b.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.f1151b.getPaddingLeft();
        int paddingRight = this.f1151b.getPaddingRight();
        int width = this.f1151b.getWidth();
        if (this.f1151b.f880a == -2) {
            int m576a = this.f1151b.m576a((SpinnerAdapter) this.f1150a, this.f1247g.getBackground());
            int i3 = (this.f1151b.getContext().getResources().getDisplayMetrics().widthPixels - this.f1151b.f881b.left) - this.f1151b.f881b.right;
            if (m576a > i3) {
                m576a = i3;
            }
            m865e(Math.max(m576a, (width - paddingLeft) - paddingRight));
        } else if (this.f1151b.f880a == -1) {
            m865e((width - paddingLeft) - paddingRight);
        } else {
            m865e(this.f1151b.f880a);
        }
        if (C0295ef.m987a(this.f1151b)) {
            i = i2 + (((width - paddingRight) - m872n()) - this.f1154j);
        } else {
            i = i2 + paddingLeft + this.f1154j;
        }
        m861b(i);
    }
}
