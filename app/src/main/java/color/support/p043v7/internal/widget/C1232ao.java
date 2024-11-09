package color.support.p043v7.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.graphics.C0542a;

/* compiled from: ThemeUtils.java */
/* renamed from: color.support.v7.internal.widget.ao */
/* loaded from: classes.dex */
public final class C1232ao {

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f5244i = new ThreadLocal<>();

    /* renamed from: a */
    static final int[] f5236a = {-16842910};

    /* renamed from: b */
    static final int[] f5237b = {R.attr.state_focused};

    /* renamed from: c */
    static final int[] f5238c = {R.attr.state_activated};

    /* renamed from: d */
    static final int[] f5239d = {R.attr.state_pressed};

    /* renamed from: e */
    static final int[] f5240e = {R.attr.state_checked};

    /* renamed from: f */
    static final int[] f5241f = {R.attr.state_selected};

    /* renamed from: g */
    static final int[] f5242g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f5243h = new int[0];

    /* renamed from: j */
    private static final int[] f5245j = new int[1];

    /* renamed from: a */
    public static int m4074a(Context context, int i) {
        f5245j[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f5245j);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    private static ColorStateList m4076c(Context context, int i) {
        f5245j[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f5245j);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m4075b(Context context, int i) {
        ColorStateList m4076c = m4076c(context, i);
        if (m4076c != null && m4076c.isStateful()) {
            return m4076c.getColorForState(f5236a, m4076c.getDefaultColor());
        }
        TypedValue typedValue = f5244i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f5244i.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C0542a.m1904b(m4074a(context, i), Math.round(Color.alpha(r4) * f));
    }
}
