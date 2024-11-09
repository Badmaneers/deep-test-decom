package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.Arrays;

/* compiled from: GapWorker.java */
@SuppressLint({"VisibleForTests"})
/* renamed from: androidx.recyclerview.widget.z */
/* loaded from: classes.dex */
public final class C0921z implements InterfaceC0859bl {

    /* renamed from: a */
    int f3776a;

    /* renamed from: b */
    int f3777b;

    /* renamed from: c */
    int[] f3778c;

    /* renamed from: d */
    int f3779d;

    /* renamed from: a */
    public final void m3330a(int i, int i2) {
        this.f3776a = i;
        this.f3777b = i2;
    }

    /* renamed from: a */
    public final void m3331a(RecyclerView recyclerView, boolean z) {
        this.f3779d = 0;
        if (this.f3778c != null) {
            Arrays.fill(this.f3778c, -1);
        }
        AbstractC0856bi abstractC0856bi = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || abstractC0856bi == null || !abstractC0856bi.m3117r()) {
            return;
        }
        if (z) {
            if (!recyclerView.mAdapterHelper.m2930d()) {
                abstractC0856bi.mo2825a(recyclerView.mAdapter.mo3020b(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            abstractC0856bi.mo2824a(this.f3776a, this.f3777b, recyclerView.mState, this);
        }
        if (this.f3779d > abstractC0856bi.f3542x) {
            abstractC0856bi.f3542x = this.f3779d;
            abstractC0856bi.f3543y = z;
            recyclerView.mRecycler.m3165b();
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0859bl
    /* renamed from: b */
    public final void mo3131b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f3779d * 2;
        if (this.f3778c == null) {
            this.f3778c = new int[4];
            Arrays.fill(this.f3778c, -1);
        } else if (i3 >= this.f3778c.length) {
            int[] iArr = this.f3778c;
            this.f3778c = new int[i3 * 2];
            System.arraycopy(iArr, 0, this.f3778c, 0, iArr.length);
        }
        this.f3778c[i3] = i;
        this.f3778c[i3 + 1] = i2;
        this.f3779d++;
    }

    /* renamed from: a */
    public final boolean m3332a(int i) {
        if (this.f3778c != null) {
            int i2 = this.f3779d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.f3778c[i3] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m3329a() {
        if (this.f3778c != null) {
            Arrays.fill(this.f3778c, -1);
        }
        this.f3779d = 0;
    }
}
