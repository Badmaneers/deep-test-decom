package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {

    /* renamed from: a */
    private static int f10604a = -1;

    @Override // androidx.appcompat.app.AppCompatViewInflater
    /* renamed from: c */
    protected final AppCompatCheckBox mo149c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    /* renamed from: d */
    protected final AppCompatRadioButton mo150d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    /* renamed from: a */
    protected final AppCompatTextView mo147a(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    /* renamed from: e */
    protected final AppCompatAutoCompleteTextView mo151e(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    /* renamed from: b */
    protected final AppCompatButton mo148b(Context context, AttributeSet attributeSet) {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 23 || Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25) {
            if (f10604a == -1) {
                f10604a = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
            }
            if (f10604a != 0 && f10604a != -1) {
                int i = 0;
                while (true) {
                    if (i >= attributeSet.getAttributeCount()) {
                        break;
                    }
                    if (attributeSet.getAttributeNameResource(i) == 16842964) {
                        if (f10604a == attributeSet.getAttributeListValue(i, null, 0)) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        if (z) {
            return new AppCompatButton(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }
}
