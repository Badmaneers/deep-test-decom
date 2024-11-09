package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.R;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.InterfaceC0579q;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements InterfaceC0537v, InterfaceC0579q {

    /* renamed from: a */
    private final C0191aj f874a;

    /* renamed from: b */
    private final C0190ai f875b;

    /* renamed from: c */
    private final C0211bc f876c;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f874a = new C0191aj(this);
        this.f874a.m703a(attributeSet, i);
        this.f875b = new C0190ai(this);
        this.f875b.m694a(attributeSet, i);
        this.f876c = new C0211bc(this);
        this.f876c.m773a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f874a != null) {
            this.f874a.m705c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0057a.m46b(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f874a != null ? this.f874a.m699a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.widget.InterfaceC0579q
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f874a != null) {
            this.f874a.m701a(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0579q
    public ColorStateList getSupportButtonTintList() {
        if (this.f874a != null) {
            return this.f874a.m700a();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0579q
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f874a != null) {
            this.f874a.m702a(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f874a != null) {
            return this.f874a.m704b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f875b != null) {
            this.f875b.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f875b != null) {
            return this.f875b.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f875b != null) {
            this.f875b.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f875b != null) {
            return this.f875b.m696c();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f875b != null) {
            this.f875b.m690a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f875b != null) {
            this.f875b.m691a(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f875b != null) {
            this.f875b.m697d();
        }
        if (this.f876c != null) {
            this.f876c.m777b();
        }
    }
}
