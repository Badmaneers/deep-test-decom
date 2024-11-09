package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.graphics.C0542a;

/* compiled from: ThemeUtils.java */
/* renamed from: androidx.appcompat.widget.dj */
/* loaded from: classes.dex */
final class C0272dj {

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f1355i = new ThreadLocal<>();

    /* renamed from: a */
    static final int[] f1347a = {-16842910};

    /* renamed from: b */
    static final int[] f1348b = {R.attr.state_focused};

    /* renamed from: c */
    static final int[] f1349c = {R.attr.state_activated};

    /* renamed from: d */
    static final int[] f1350d = {R.attr.state_pressed};

    /* renamed from: e */
    static final int[] f1351e = {R.attr.state_checked};

    /* renamed from: f */
    static final int[] f1352f = {R.attr.state_selected};

    /* renamed from: g */
    static final int[] f1353g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f1354h = new int[0];

    /* renamed from: j */
    private static final int[] f1356j = new int[1];

    /* renamed from: a */
    public static int m937a(Context context, int i) {
        f1356j[0] = i;
        C0276dn m943a = C0276dn.m943a(context, (AttributeSet) null, f1356j);
        try {
            return m943a.m950b(0, 0);
        } finally {
            m943a.m952b();
        }
    }

    /* renamed from: b */
    public static ColorStateList m938b(Context context, int i) {
        f1356j[0] = i;
        C0276dn m943a = C0276dn.m943a(context, (AttributeSet) null, f1356j);
        try {
            return m943a.m960f(0);
        } finally {
            m943a.m952b();
        }
    }

    /* renamed from: c */
    public static int m939c(Context context, int i) {
        ColorStateList m938b = m938b(context, i);
        if (m938b != null && m938b.isStateful()) {
            return m938b.getColorForState(f1347a, m938b.getDefaultColor());
        }
        TypedValue typedValue = f1355i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f1355i.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C0542a.m1904b(m937a(context, i), Math.round(Color.alpha(r4) * f));
    }
}
