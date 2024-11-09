package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p018b.C0418a;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderScrollingViewBehavior.java */
/* renamed from: com.google.android.material.appbar.q */
/* loaded from: classes.dex */
public abstract class AbstractC2059q extends C2060r<View> {

    /* renamed from: a */
    final Rect f9081a;

    /* renamed from: b */
    final Rect f9082b;

    /* renamed from: c */
    private int f9083c;

    /* renamed from: d */
    private int f9084d;

    /* renamed from: a */
    float mo6310a(View view) {
        return 1.0f;
    }

    /* renamed from: a */
    abstract View mo6311a(List<View> list);

    public AbstractC2059q() {
        this.f9081a = new Rect();
        this.f9082b = new Rect();
        this.f9083c = 0;
    }

    public AbstractC2059q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9081a = new Rect();
        this.f9082b = new Rect();
        this.f9083c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1415a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo6311a;
        C0514ao lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (mo6311a = mo6311a(coordinatorLayout.m1403b(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            if (C0538w.m1893v(mo6311a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m1766b() + lastWindowInsets.m1768d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m1401a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + mo6312b(mo6311a)) - mo6311a.getMeasuredHeight(), i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C2060r
    /* renamed from: b */
    public final void mo6327b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View mo6311a = mo6311a(coordinatorLayout.m1403b(view));
        if (mo6311a != null) {
            C0394f c0394f = (C0394f) view.getLayoutParams();
            Rect rect = this.f9081a;
            rect.set(coordinatorLayout.getPaddingLeft() + c0394f.leftMargin, mo6311a.getBottom() + c0394f.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0394f.rightMargin, ((coordinatorLayout.getHeight() + mo6311a.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0394f.bottomMargin);
            C0514ao lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0538w.m1893v(coordinatorLayout) && !C0538w.m1893v(view)) {
                rect.left += lastWindowInsets.m1764a();
                rect.right -= lastWindowInsets.m1767c();
            }
            Rect rect2 = this.f9082b;
            int i2 = c0394f.f2082c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0521f.m1778a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m6329c = m6329c(mo6311a);
            view.layout(rect2.left, rect2.top - m6329c, rect2.right, rect2.bottom - m6329c);
            this.f9083c = rect2.top - mo6311a.getBottom();
            return;
        }
        super.mo6327b(coordinatorLayout, (CoordinatorLayout) view, i);
        this.f9083c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m6329c(View view) {
        if (this.f9084d == 0) {
            return 0;
        }
        return C0418a.m1478a((int) (mo6310a(view) * this.f9084d), 0, this.f9084d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6312b(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m6325b() {
        return this.f9083c;
    }

    /* renamed from: b */
    public final void m6326b(int i) {
        this.f9084d = i;
    }

    /* renamed from: c */
    public final int m6328c() {
        return this.f9084d;
    }
}
