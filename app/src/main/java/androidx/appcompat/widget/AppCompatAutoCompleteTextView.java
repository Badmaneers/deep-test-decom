package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.C0577o;

/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements InterfaceC0537v {

    /* renamed from: a */
    private static final int[] f854a = {R.attr.popupBackground};

    /* renamed from: b */
    private final C0190ai f855b;

    /* renamed from: c */
    private final C0211bc f856c;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        C0276dn m944a = C0276dn.m944a(getContext(), attributeSet, f854a, i, 0);
        if (m944a.m964i(0)) {
            setDropDownBackgroundDrawable(m944a.m948a(0));
        }
        m944a.m952b();
        this.f855b = new C0190ai(this);
        this.f855b.m694a(attributeSet, i);
        this.f856c = new C0211bc(this);
        this.f856c.m773a(attributeSet, i);
        this.f856c.m777b();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0057a.m46b(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f855b != null) {
            this.f855b.m691a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f855b != null) {
            this.f855b.m690a();
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f855b != null) {
            this.f855b.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f855b != null) {
            return this.f855b.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f855b != null) {
            this.f855b.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f855b != null) {
            return this.f855b.m696c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f855b != null) {
            this.f855b.m697d();
        }
        if (this.f856c != null) {
            this.f856c.m777b();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f856c != null) {
            this.f856c.m769a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0194am.m723a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0577o.m2046a(this, callback));
    }
}
