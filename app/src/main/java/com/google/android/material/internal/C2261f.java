package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: DescendantOffsetUtils.java */
/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes.dex */
public final class C2261f {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f10008a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f10009b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m7178a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f10008a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f10008a.set(matrix);
        } else {
            matrix.reset();
        }
        m7179a(viewGroup, view, matrix);
        RectF rectF = f10009b.get();
        if (rectF == null) {
            rectF = new RectF();
            f10009b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: b */
    public static void m7180b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m7178a(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m7179a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m7179a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
