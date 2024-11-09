package androidx.recyclerview.widget;

import android.util.SparseArray;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.cb */
/* loaded from: classes.dex */
public final class C0876cb {

    /* renamed from: a */
    int f3589a = -1;

    /* renamed from: b */
    int f3590b = 0;

    /* renamed from: c */
    int f3591c = 0;

    /* renamed from: d */
    int f3592d = 1;

    /* renamed from: e */
    int f3593e = 0;

    /* renamed from: f */
    boolean f3594f = false;

    /* renamed from: g */
    boolean f3595g = false;

    /* renamed from: h */
    boolean f3596h = false;

    /* renamed from: i */
    boolean f3597i = false;

    /* renamed from: j */
    boolean f3598j = false;

    /* renamed from: k */
    boolean f3599k = false;

    /* renamed from: l */
    int f3600l;

    /* renamed from: m */
    long f3601m;

    /* renamed from: n */
    int f3602n;

    /* renamed from: o */
    int f3603o;

    /* renamed from: p */
    int f3604p;

    /* renamed from: q */
    private SparseArray<Object> f3605q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3191a(int i) {
        if ((this.f3592d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3592d));
    }

    /* renamed from: a */
    public final int m3190a() {
        return this.f3595g ? this.f3590b - this.f3591c : this.f3593e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3589a + ", mData=" + this.f3605q + ", mItemCount=" + this.f3593e + ", mIsMeasuring=" + this.f3597i + ", mPreviousLayoutItemCount=" + this.f3590b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3591c + ", mStructureChanged=" + this.f3594f + ", mInPreLayout=" + this.f3595g + ", mRunSimpleAnimations=" + this.f3598j + ", mRunPredictiveAnimations=" + this.f3599k + '}';
    }
}
