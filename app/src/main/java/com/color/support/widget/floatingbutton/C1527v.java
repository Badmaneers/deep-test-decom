package com.color.support.widget.floatingbutton;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewGroupUtils.java */
/* renamed from: com.color.support.widget.floatingbutton.v */
/* loaded from: classes.dex */
final class C1527v {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f7267a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f7268b = new ThreadLocal<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5149a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = f7267a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f7267a.set(matrix);
        } else {
            matrix.reset();
        }
        m5150a(viewGroup, view, matrix);
        RectF rectF = f7268b.get();
        if (rectF == null) {
            rectF = new RectF();
            f7268b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m5150a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m5150a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
