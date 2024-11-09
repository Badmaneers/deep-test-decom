package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.widget.C0577o;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f862a = {R.attr.checkMark};

    /* renamed from: b */
    private final C0211bc f863b;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0273dk.m940a(context), attributeSet, i);
        this.f863b = new C0211bc(this);
        this.f863b.m773a(attributeSet, i);
        this.f863b.m777b();
        C0276dn m944a = C0276dn.m944a(getContext(), attributeSet, f862a, i, 0);
        setCheckMarkDrawable(m944a.m948a(0));
        m944a.m952b();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0057a.m46b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f863b != null) {
            this.f863b.m769a(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f863b != null) {
            this.f863b.m777b();
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
