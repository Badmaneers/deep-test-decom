package androidx.recyclerview.widget;

import androidx.core.p019c.C0419a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public final class RunnableC0919x implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<RunnableC0919x> f3770a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C0821aa> f3771e = new C0920y();

    /* renamed from: c */
    long f3773c;

    /* renamed from: d */
    long f3774d;

    /* renamed from: b */
    ArrayList<RecyclerView> f3772b = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C0821aa> f3775f = new ArrayList<>();

    /* renamed from: a */
    public final void m3328a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3773c == 0) {
            this.f3773c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m3330a(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        C0821aa c0821aa;
        long j = 0;
        try {
            C0419a.m1480a("RV Prefetch");
            if (this.f3772b.isEmpty()) {
                this.f3773c = 0L;
                return;
            }
            int size = this.f3772b.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView2 = this.f3772b.get(i);
                if (recyclerView2.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f3773c = 0L;
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.f3774d;
            int size2 = this.f3772b.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                RecyclerView recyclerView3 = this.f3772b.get(i3);
                if (recyclerView3.getWindowVisibility() == 0) {
                    recyclerView3.mPrefetchRegistry.m3331a(recyclerView3, false);
                    i2 += recyclerView3.mPrefetchRegistry.f3779d;
                }
            }
            this.f3775f.ensureCapacity(i2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                RecyclerView recyclerView4 = this.f3772b.get(i4);
                if (recyclerView4.getWindowVisibility() == 0) {
                    C0921z c0921z = recyclerView4.mPrefetchRegistry;
                    int abs = Math.abs(c0921z.f3776a) + Math.abs(c0921z.f3777b);
                    int i6 = i5;
                    for (int i7 = 0; i7 < c0921z.f3779d * 2; i7 += 2) {
                        if (i6 >= this.f3775f.size()) {
                            c0821aa = new C0821aa();
                            this.f3775f.add(c0821aa);
                        } else {
                            c0821aa = this.f3775f.get(i6);
                        }
                        int i8 = c0921z.f3778c[i7 + 1];
                        try {
                            c0821aa.f3449a = i8 <= abs;
                            c0821aa.f3450b = abs;
                            c0821aa.f3451c = i8;
                            c0821aa.f3452d = recyclerView4;
                            c0821aa.f3453e = c0921z.f3778c[i7];
                            i6++;
                        } catch (Throwable th) {
                            th = th;
                            j = 0;
                            this.f3773c = j;
                            throw th;
                        }
                    }
                    i5 = i6;
                }
                i4++;
                j = 0;
            }
            Collections.sort(this.f3775f, f3771e);
            for (int i9 = 0; i9 < this.f3775f.size(); i9++) {
                C0821aa c0821aa2 = this.f3775f.get(i9);
                if (c0821aa2.f3452d == null) {
                    break;
                }
                AbstractC0879ce m3327a = m3327a(c0821aa2.f3452d, c0821aa2.f3453e, c0821aa2.f3449a ? Long.MAX_VALUE : nanos);
                if (m3327a != null && m3327a.f3615b != null && m3327a.m3219m() && !m3327a.m3217k() && (recyclerView = m3327a.f3615b.get()) != null) {
                    if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m3289b() != 0) {
                        recyclerView.removeAndRecycleViews();
                    }
                    C0921z c0921z2 = recyclerView.mPrefetchRegistry;
                    c0921z2.m3331a(recyclerView, true);
                    if (c0921z2.f3779d != 0) {
                        try {
                            C0419a.m1480a("RV Nested Prefetch");
                            C0876cb c0876cb = recyclerView.mState;
                            AbstractC0845ay abstractC0845ay = recyclerView.mAdapter;
                            c0876cb.f3592d = 1;
                            c0876cb.f3593e = abstractC0845ay.mo3020b();
                            c0876cb.f3595g = false;
                            c0876cb.f3596h = false;
                            c0876cb.f3597i = false;
                            for (int i10 = 0; i10 < c0921z2.f3779d * 2; i10 += 2) {
                                m3327a(recyclerView, c0921z2.f3778c[i10], nanos);
                            }
                            C0419a.m1479a();
                        } finally {
                            C0419a.m1479a();
                        }
                    }
                }
                c0821aa2.f3449a = false;
                c0821aa2.f3450b = 0;
                c0821aa2.f3451c = 0;
                c0821aa2.f3452d = null;
                c0821aa2.f3453e = 0;
            }
            this.f3773c = 0L;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private static AbstractC0879ce m3327a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int m3289b = recyclerView.mChildHelper.m3289b();
        int i2 = 0;
        while (true) {
            if (i2 >= m3289b) {
                z = false;
                break;
            }
            AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m3293c(i2));
            if (childViewHolderInt.f3616c == i && !childViewHolderInt.m3217k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        C0868bu c0868bu = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            AbstractC0879ce m3157a = c0868bu.m3157a(i, j);
            if (m3157a != null) {
                if (m3157a.m3219m() && !m3157a.m3217k()) {
                    c0868bu.m3160a(m3157a.f3614a);
                } else {
                    c0868bu.m3163a(m3157a, false);
                }
            }
            return m3157a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
