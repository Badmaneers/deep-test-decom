package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: CoordinatorLayout.java */
/* renamed from: androidx.coordinatorlayout.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractC0391c<V extends View> {
    /* renamed from: a */
    public void mo1406a() {
    }

    /* renamed from: a */
    public void mo1407a(CoordinatorLayout coordinatorLayout, View view) {
    }

    /* renamed from: a */
    public void mo1408a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo1409a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
    }

    /* renamed from: a */
    public void mo1411a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
    }

    /* renamed from: a */
    public void mo1412a(C0394f c0394f) {
    }

    /* renamed from: a */
    public boolean mo1413a(V v, View view) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1415a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1416a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1417a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1418a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1419a(CoordinatorLayout coordinatorLayout, V v, View view) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1420a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1421a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i2 == 0 ? false : false;
    }

    /* renamed from: b */
    public boolean mo1423b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC0391c() {
    }

    public AbstractC0391c(Context context, AttributeSet attributeSet) {
    }

    /* renamed from: a */
    public void mo1410a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    /* renamed from: b */
    public Parcelable mo1422b(CoordinatorLayout coordinatorLayout, V v) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}
