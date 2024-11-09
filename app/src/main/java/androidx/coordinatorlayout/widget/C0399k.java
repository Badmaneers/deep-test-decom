package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewGroupUtils.java */
/* renamed from: androidx.coordinatorlayout.widget.k */
/* loaded from: classes.dex */
public final class C0399k {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2103a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2104b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1446a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = f2103a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2103a.set(matrix);
        } else {
            matrix.reset();
        }
        m1447a(viewGroup, view, matrix);
        RectF rectF = f2104b.get();
        if (rectF == null) {
            rectF = new RectF();
            f2104b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m1447a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m1447a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
