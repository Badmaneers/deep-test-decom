package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bu */
/* loaded from: classes.dex */
public final class C0868bu {

    /* renamed from: e */
    C0866bs f3564e;

    /* renamed from: f */
    final /* synthetic */ RecyclerView f3565f;

    /* renamed from: i */
    private AbstractC0877cc f3568i;

    /* renamed from: a */
    final ArrayList<AbstractC0879ce> f3560a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<AbstractC0879ce> f3561b = null;

    /* renamed from: c */
    final ArrayList<AbstractC0879ce> f3562c = new ArrayList<>();

    /* renamed from: g */
    private final List<AbstractC0879ce> f3566g = Collections.unmodifiableList(this.f3560a);

    /* renamed from: h */
    private int f3567h = 2;

    /* renamed from: d */
    int f3563d = 2;

    public C0868bu(RecyclerView recyclerView) {
        this.f3565f = recyclerView;
    }

    /* renamed from: a */
    public final void m3158a() {
        this.f3560a.clear();
        m3171d();
    }

    /* renamed from: a */
    public final void m3159a(int i) {
        this.f3567h = i;
        m3165b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3165b() {
        this.f3563d = this.f3567h + (this.f3565f.mLayout != null ? this.f3565f.mLayout.f3542x : 0);
        for (int size = this.f3562c.size() - 1; size >= 0 && this.f3562c.size() > this.f3563d; size--) {
            m3172d(size);
        }
    }

    /* renamed from: c */
    public final List<AbstractC0879ce> m3169c() {
        return this.f3566g;
    }

    /* renamed from: c */
    private boolean m3152c(AbstractC0879ce abstractC0879ce) {
        if (!abstractC0879ce.m3220n()) {
            if (abstractC0879ce.f3616c < 0 || abstractC0879ce.f3616c >= this.f3565f.mAdapter.mo3020b()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0879ce + this.f3565f.exceptionLabel());
            }
            if (this.f3565f.mState.f3595g || this.f3565f.mAdapter.mo3014a(abstractC0879ce.f3616c) == abstractC0879ce.f3619f) {
                return !this.f3565f.mAdapter.m3026c() || abstractC0879ce.f3618e == this.f3565f.mAdapter.mo3021b(abstractC0879ce.f3616c);
            }
            return false;
        }
        return this.f3565f.mState.f3595g;
    }

    /* renamed from: a */
    private boolean m3151a(AbstractC0879ce abstractC0879ce, int i, int i2, long j) {
        abstractC0879ce.f3629p = this.f3565f;
        int i3 = abstractC0879ce.f3619f;
        long nanoTime = this.f3565f.getNanoTime();
        if (j != Long.MAX_VALUE && !this.f3564e.m3148b(i3, nanoTime, j)) {
            return false;
        }
        this.f3565f.mAdapter.m3024b((AbstractC0845ay) abstractC0879ce, i);
        this.f3564e.m3147b(abstractC0879ce.f3619f, this.f3565f.getNanoTime() - nanoTime);
        if (this.f3565f.isAccessibilityEnabled()) {
            View view = abstractC0879ce.f3614a;
            if (C0538w.m1876g(view) == 0) {
                C0538w.m1840a(view, 1);
            }
            if (this.f3565f.mAccessibilityDelegate != null) {
                C0479a m3229a = this.f3565f.mAccessibilityDelegate.m3229a();
                if (m3229a instanceof C0881cg) {
                    ((C0881cg) m3229a).m3230c(view);
                }
                C0538w.m1849a(view, m3229a);
            }
        }
        if (this.f3565f.mState.f3595g) {
            abstractC0879ce.f3620g = i2;
        }
        return true;
    }

    /* renamed from: b */
    public final int m3164b(int i) {
        if (i >= 0 && i < this.f3565f.mState.m3190a()) {
            return !this.f3565f.mState.f3595g ? i : this.f3565f.mAdapterHelper.m2926b(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f3565f.mState.m3190a() + this.f3565f.exceptionLabel());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final View m3168c(int i) {
        return m3157a(i, Long.MAX_VALUE).f3614a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.AbstractC0879ce m3157a(int r18, long r19) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0868bu.m3157a(int, long):androidx.recyclerview.widget.ce");
    }

    /* renamed from: d */
    private void m3153d(AbstractC0879ce abstractC0879ce) {
        if (abstractC0879ce.f3614a instanceof ViewGroup) {
            m3150a((ViewGroup) abstractC0879ce.f3614a, false);
        }
    }

    /* renamed from: a */
    private void m3150a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m3150a((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    /* renamed from: a */
    public final void m3160a(View view) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.m3221o()) {
            this.f3565f.removeDetachedView(view, false);
        }
        if (childViewHolderInt.m3212f()) {
            childViewHolderInt.m3213g();
        } else if (childViewHolderInt.m3214h()) {
            childViewHolderInt.m3215i();
        }
        m3162a(childViewHolderInt);
        if (this.f3565f.mItemAnimator == null || childViewHolderInt.m3226t()) {
            return;
        }
        this.f3565f.mItemAnimator.mo3046c(childViewHolderInt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3171d() {
        for (int size = this.f3562c.size() - 1; size >= 0; size--) {
            m3172d(size);
        }
        this.f3562c.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            this.f3565f.mPrefetchRegistry.m3329a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3172d(int i) {
        m3163a(this.f3562c.get(i), true);
        this.f3562c.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3162a(AbstractC0879ce abstractC0879ce) {
        boolean z;
        if (abstractC0879ce.m3212f() || abstractC0879ce.f3614a.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0879ce.m3212f());
            sb.append(" isAttached:");
            sb.append(abstractC0879ce.f3614a.getParent() != null);
            sb.append(this.f3565f.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0879ce.m3221o()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0879ce + this.f3565f.exceptionLabel());
        }
        if (abstractC0879ce.m3208b()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.f3565f.exceptionLabel());
        }
        boolean m3227u = abstractC0879ce.m3227u();
        if (abstractC0879ce.m3226t()) {
            if (this.f3563d <= 0 || abstractC0879ce.m3205a(526)) {
                z = false;
            } else {
                int size = this.f3562c.size();
                if (size >= this.f3563d && size > 0) {
                    m3172d(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !this.f3565f.mPrefetchRegistry.m3332a(abstractC0879ce.f3616c)) {
                    int i = size - 1;
                    while (i >= 0) {
                        if (!this.f3565f.mPrefetchRegistry.m3332a(this.f3562c.get(i).f3616c)) {
                            break;
                        } else {
                            i--;
                        }
                    }
                    size = i + 1;
                }
                this.f3562c.add(size, abstractC0879ce);
                z = true;
            }
            if (!z) {
                m3163a(abstractC0879ce, true);
                r1 = true;
            }
        } else {
            z = false;
        }
        this.f3565f.mViewInfoStore.m3277f(abstractC0879ce);
        if (z || r1 || !m3227u) {
            return;
        }
        abstractC0879ce.f3629p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3163a(AbstractC0879ce abstractC0879ce, boolean z) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0879ce);
        View view = abstractC0879ce.f3614a;
        if (this.f3565f.mAccessibilityDelegate != null) {
            C0479a m3229a = this.f3565f.mAccessibilityDelegate.m3229a();
            C0538w.m1849a(view, m3229a instanceof C0881cg ? ((C0881cg) m3229a).m3231d(view) : null);
        }
        if (z) {
            m3155e(abstractC0879ce);
        }
        abstractC0879ce.f3629p = null;
        m3173e().m3144a(abstractC0879ce);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3166b(View view) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.f3626m = null;
        childViewHolderInt.f3627n = false;
        childViewHolderInt.m3215i();
        m3162a(childViewHolderInt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m3170c(View view) {
        AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.m3205a(12) || !childViewHolderInt.m3228v() || this.f3565f.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (childViewHolderInt.m3217k() && !childViewHolderInt.m3220n() && !this.f3565f.mAdapter.m3026c()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f3565f.exceptionLabel());
            }
            childViewHolderInt.m3202a(this, false);
            this.f3560a.add(childViewHolderInt);
            return;
        }
        if (this.f3561b == null) {
            this.f3561b = new ArrayList<>();
        }
        childViewHolderInt.m3202a(this, true);
        this.f3561b.add(childViewHolderInt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3167b(AbstractC0879ce abstractC0879ce) {
        if (abstractC0879ce.f3627n) {
            this.f3561b.remove(abstractC0879ce);
        } else {
            this.f3560a.remove(abstractC0879ce);
        }
        abstractC0879ce.f3626m = null;
        abstractC0879ce.f3627n = false;
        abstractC0879ce.m3215i();
    }

    /* renamed from: e */
    private AbstractC0879ce m3154e(int i) {
        int size;
        int m2921a;
        if (this.f3561b == null || (size = this.f3561b.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0879ce abstractC0879ce = this.f3561b.get(i2);
            if (!abstractC0879ce.m3214h() && abstractC0879ce.m3209c() == i) {
                abstractC0879ce.m3206b(32);
                return abstractC0879ce;
            }
        }
        if (this.f3565f.mAdapter.m3026c() && (m2921a = this.f3565f.mAdapterHelper.m2921a(i, 0)) > 0 && m2921a < this.f3565f.mAdapter.mo3020b()) {
            long mo3021b = this.f3565f.mAdapter.mo3021b(m2921a);
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0879ce abstractC0879ce2 = this.f3561b.get(i3);
                if (!abstractC0879ce2.m3214h() && abstractC0879ce2.f3618e == mo3021b) {
                    abstractC0879ce2.m3206b(32);
                    return abstractC0879ce2;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private AbstractC0879ce m3156f(int i) {
        View view;
        int size = this.f3560a.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0879ce abstractC0879ce = this.f3560a.get(i2);
            if (!abstractC0879ce.m3214h() && abstractC0879ce.m3209c() == i && !abstractC0879ce.m3217k() && (this.f3565f.mState.f3595g || !abstractC0879ce.m3220n())) {
                abstractC0879ce.m3206b(32);
                return abstractC0879ce;
            }
        }
        C0899d c0899d = this.f3565f.mChildHelper;
        int size2 = c0899d.f3674c.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                view = null;
                break;
            }
            view = c0899d.f3674c.get(i3);
            AbstractC0879ce mo3000b = c0899d.f3672a.mo3000b(view);
            if (mo3000b.m3209c() == i && !mo3000b.m3217k() && !mo3000b.m3220n()) {
                break;
            }
            i3++;
        }
        if (view != null) {
            AbstractC0879ce childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            this.f3565f.mChildHelper.m3297f(view);
            int m3292c = this.f3565f.mChildHelper.m3292c(view);
            if (m3292c == -1) {
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + this.f3565f.exceptionLabel());
            }
            this.f3565f.mChildHelper.m3294d(m3292c);
            m3170c(view);
            childViewHolderInt.m3206b(8224);
            return childViewHolderInt;
        }
        int size3 = this.f3562c.size();
        for (int i4 = 0; i4 < size3; i4++) {
            AbstractC0879ce abstractC0879ce2 = this.f3562c.get(i4);
            if (!abstractC0879ce2.m3217k() && abstractC0879ce2.m3209c() == i && !abstractC0879ce2.m3222p()) {
                this.f3562c.remove(i4);
                return abstractC0879ce2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private AbstractC0879ce m3149a(long j, int i) {
        for (int size = this.f3560a.size() - 1; size >= 0; size--) {
            AbstractC0879ce abstractC0879ce = this.f3560a.get(size);
            if (abstractC0879ce.f3618e == j && !abstractC0879ce.m3214h()) {
                if (i == abstractC0879ce.f3619f) {
                    abstractC0879ce.m3206b(32);
                    if (abstractC0879ce.m3220n() && !this.f3565f.mState.f3595g) {
                        abstractC0879ce.m3199a(2, 14);
                    }
                    return abstractC0879ce;
                }
                this.f3560a.remove(size);
                this.f3565f.removeDetachedView(abstractC0879ce.f3614a, false);
                m3166b(abstractC0879ce.f3614a);
            }
        }
        int size2 = this.f3562c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return null;
            }
            AbstractC0879ce abstractC0879ce2 = this.f3562c.get(size2);
            if (abstractC0879ce2.f3618e == j && !abstractC0879ce2.m3222p()) {
                if (i == abstractC0879ce2.f3619f) {
                    this.f3562c.remove(size2);
                    return abstractC0879ce2;
                }
                m3172d(size2);
                return null;
            }
        }
    }

    /* renamed from: e */
    private void m3155e(AbstractC0879ce abstractC0879ce) {
        if (this.f3565f.mAdapter != null) {
            this.f3565f.mAdapter.mo3018a((AbstractC0845ay) abstractC0879ce);
        }
        if (this.f3565f.mState != null) {
            this.f3565f.mViewInfoStore.m3277f(abstractC0879ce);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3161a(AbstractC0877cc abstractC0877cc) {
        this.f3568i = abstractC0877cc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0866bs m3173e() {
        if (this.f3564e == null) {
            this.f3564e = new C0866bs();
        }
        return this.f3564e;
    }
}
