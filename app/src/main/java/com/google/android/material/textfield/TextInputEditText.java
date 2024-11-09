package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.coloros.neton.BuildConfig;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.theme.p084a.C2402a;
import java.util.Locale;

/* loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: a */
    private final Rect f10435a;

    /* renamed from: b */
    private boolean f10436b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, 0), attributeSet, i);
        this.f10435a = new Rect();
        TypedArray m7095a = C2243al.m7095a(context, attributeSet, R.styleable.TextInputEditText, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m7095a.getBoolean(R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        m7095a.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m7612a() && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m7612a()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f10436b = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f10436b || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f10435a);
        rect.bottom = this.f10435a.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f10436b && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f10435a, point);
            rect.bottom = this.f10435a.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f10436b) {
            this.f10435a.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f10435a, true);
        }
        return requestRectangleOnScreen;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String charSequence = z2 ? hint.toString() : BuildConfig.FLAVOR;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : BuildConfig.FLAVOR);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = BuildConfig.FLAVOR;
        }
        sb3.append((Object) helperText);
        String sb4 = sb3.toString();
        if (z) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append((Object) text);
            sb5.append(!TextUtils.isEmpty(sb4) ? ", ".concat(String.valueOf(sb4)) : BuildConfig.FLAVOR);
            sb4 = sb5.toString();
        } else if (TextUtils.isEmpty(sb4)) {
            sb4 = BuildConfig.FLAVOR;
        }
        accessibilityNodeInfo.setText(sb4);
    }
}
