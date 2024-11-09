package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* renamed from: com.google.android.material.appbar.r */
/* loaded from: classes.dex */
public class C2060r<V extends View> extends AbstractC0391c<V> {

    /* renamed from: a */
    private C2061s f9085a;

    /* renamed from: b */
    private int f9086b;

    /* renamed from: c */
    private int f9087c;

    public C2060r() {
        this.f9086b = 0;
        this.f9087c = 0;
    }

    public C2060r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9086b = 0;
        this.f9087c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo6327b(coordinatorLayout, (CoordinatorLayout) v, i);
        if (this.f9085a == null) {
            this.f9085a = new C2061s(v);
        }
        this.f9085a.m6330a();
        this.f9085a.m6332b();
        if (this.f9086b != 0) {
            this.f9085a.m6331a(this.f9086b);
            this.f9086b = 0;
        }
        if (this.f9087c == 0) {
            return true;
        }
        this.f9085a.m6333b(this.f9087c);
        this.f9087c = 0;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6327b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m1404b(v, i);
    }

    /* renamed from: a */
    public boolean mo6307a(int i) {
        if (this.f9085a != null) {
            return this.f9085a.m6331a(i);
        }
        this.f9086b = i;
        return false;
    }

    /* renamed from: d */
    public int mo6308d() {
        if (this.f9085a != null) {
            return this.f9085a.m6334c();
        }
        return 0;
    }
}
