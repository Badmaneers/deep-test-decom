package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;

/* compiled from: ViewUtils.java */
/* renamed from: com.google.android.material.internal.as */
/* loaded from: classes.dex */
public final class C2250as {
    /* renamed from: a */
    public static PorterDuff.Mode m7109a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m7112a(View view) {
        return C0538w.m1878h(view) == 1;
    }

    /* renamed from: a */
    public static float m7108a(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static void m7113b(View view) {
        view.requestFocus();
        view.post(new RunnableC2251at(view));
    }

    /* renamed from: a */
    public static void m7110a(View view, AttributeSet attributeSet, int i, int i2, InterfaceC2255ax interfaceC2255ax) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m7111a(view, new C2252au(z, z2, z3, interfaceC2255ax));
    }

    /* renamed from: a */
    public static void m7111a(View view, InterfaceC2255ax interfaceC2255ax) {
        C0538w.m1850a(view, new C2253av(interfaceC2255ax, new C2256ay(C0538w.m1883l(view), view.getPaddingTop(), C0538w.m1884m(view), view.getPaddingBottom())));
        m7117f(view);
    }

    /* renamed from: f */
    private static void m7117f(View view) {
        if (C0538w.m1822F(view)) {
            C0538w.m1892u(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2254aw());
        }
    }

    /* renamed from: c */
    public static float m7114c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C0538w.m1888q((View) parent);
        }
        return f;
    }

    /* renamed from: d */
    public static ViewGroup m7115d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            } else if (view.getParent() == null) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static InterfaceC2249ar m7116e(View view) {
        ViewGroup m7115d = m7115d(view);
        if (m7115d == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return new C2248aq(m7115d);
        }
        ViewGroup m7115d2 = m7115d(m7115d);
        if (m7115d2 == null) {
            return null;
        }
        int childCount = m7115d2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = m7115d2.getChildAt(i);
            if (childAt instanceof C2247ap) {
                return ((C2247ap) childAt).f9939e;
            }
        }
        return new C2244am(m7115d2.getContext(), m7115d2, m7115d);
    }
}
