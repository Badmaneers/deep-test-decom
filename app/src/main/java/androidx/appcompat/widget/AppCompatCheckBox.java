package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.R;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.InterfaceC0579q;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements InterfaceC0537v, InterfaceC0579q {

    /* renamed from: a */
    private final C0191aj f859a;

    /* renamed from: b */
    private final C0190ai f860b;

    /* renamed from: c */
    private final C0211bc f861c;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f859a = new C0191aj(this);
        this.f859a.m703a(attributeSet, i);
        this.f860b = new C0190ai(this);
        this.f860b.m694a(attributeSet, i);
        this.f861c = new C0211bc(this);
        this.f861c.m773a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f859a != null) {
            this.f859a.m705c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0057a.m46b(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f859a != null ? this.f859a.m699a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.widget.InterfaceC0579q
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f859a != null) {
            this.f859a.m701a(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0579q
    public ColorStateList getSupportButtonTintList() {
        if (this.f859a != null) {
            return this.f859a.m700a();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0579q
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f859a != null) {
            this.f859a.m702a(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f859a != null) {
            return this.f859a.m704b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f860b != null) {
            this.f860b.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f860b != null) {
            return this.f860b.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f860b != null) {
            this.f860b.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f860b != null) {
            return this.f860b.m696c();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f860b != null) {
            this.f860b.m690a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f860b != null) {
            this.f860b.m691a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f860b != null) {
            this.f860b.m697d();
        }
        if (this.f861c != null) {
            this.f861c.m777b();
        }
    }
}
