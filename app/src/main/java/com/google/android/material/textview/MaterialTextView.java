package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C2402a.m7691a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (m7690a(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.MaterialTextView, i, i2);
            int m7688a = m7688a(context2, obtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextView_android_lineHeight, com.google.android.material.R.styleable.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (m7688a != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.MaterialTextView, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(com.google.android.material.R.styleable.MaterialTextView_android_textAppearance, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m7689a(theme, resourceId);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m7690a(context)) {
            m7689a(context.getTheme(), i);
        }
    }

    /* renamed from: a */
    private void m7689a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, com.google.android.material.R.styleable.MaterialTextAppearance);
        int m7688a = m7688a(getContext(), obtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight, com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m7688a >= 0) {
            setLineHeight(m7688a);
        }
    }

    /* renamed from: a */
    private static boolean m7690a(Context context) {
        return C2220c.m7044a(context, com.google.android.material.R.attr.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: a */
    private static int m7688a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = C2221d.m7049d(context, typedArray, iArr[i2]);
        }
        return i;
    }
}
