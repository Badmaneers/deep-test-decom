package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LayoutState.java */
/* renamed from: androidx.recyclerview.widget.ae */
/* loaded from: classes.dex */
public final class C0825ae {

    /* renamed from: b */
    int f3461b;

    /* renamed from: c */
    int f3462c;

    /* renamed from: d */
    int f3463d;

    /* renamed from: e */
    int f3464e;

    /* renamed from: h */
    boolean f3467h;

    /* renamed from: i */
    boolean f3468i;

    /* renamed from: a */
    boolean f3460a = true;

    /* renamed from: f */
    int f3465f = 0;

    /* renamed from: g */
    int f3466g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2938a(C0876cb c0876cb) {
        return this.f3462c >= 0 && this.f3462c < c0876cb.m3190a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final View m2937a(C0868bu c0868bu) {
        View m3168c = c0868bu.m3168c(this.f3462c);
        this.f3462c += this.f3463d;
        return m3168c;
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.f3461b + ", mCurrentPosition=" + this.f3462c + ", mItemDirection=" + this.f3463d + ", mLayoutDirection=" + this.f3464e + ", mStartLine=" + this.f3465f + ", mEndLine=" + this.f3466g + '}';
    }
}
