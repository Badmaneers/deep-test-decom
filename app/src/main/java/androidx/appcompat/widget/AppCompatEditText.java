package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.C0577o;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0537v {

    /* renamed from: a */
    private final C0190ai f864a;

    /* renamed from: b */
    private final C0211bc f865b;

    /* renamed from: c */
    private final C0210bb f866c;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f864a = new C0190ai(this);
        this.f864a.m694a(attributeSet, i);
        this.f865b = new C0211bc(this);
        this.f865b.m773a(attributeSet, i);
        this.f865b.m777b();
        this.f866c = new C0210bb(this);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f864a != null) {
            this.f864a.m691a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f864a != null) {
            this.f864a.m690a();
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f864a != null) {
            this.f864a.m692a(colorStateList);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f864a != null) {
            return this.f864a.m695b();
        }
        return null;
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f864a != null) {
            this.f864a.m693a(mode);
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f864a != null) {
            return this.f864a.m696c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f864a != null) {
            this.f864a.m697d();
        }
        if (this.f865b != null) {
            this.f865b.m777b();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f865b != null) {
            this.f865b.m769a(context, i);
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        if (Build.VERSION.SDK_INT >= 28 || this.f866c == null) {
            super.setTextClassifier(textClassifier);
        } else {
            this.f866c.m760a(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28 || this.f866c == null) {
            return super.getTextClassifier();
        }
        return this.f866c.m759a();
    }
}
