package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: SnapHelper.java */
/* renamed from: androidx.recyclerview.widget.cj */
/* loaded from: classes.dex */
public abstract class AbstractC0884cj extends AbstractC0863bp {

    /* renamed from: a */
    RecyclerView f3637a;

    /* renamed from: b */
    private Scroller f3638b;

    /* renamed from: c */
    private final AbstractC0865br f3639c = new C0885ck(this);

    /* renamed from: a */
    public abstract int mo2962a(AbstractC0856bi abstractC0856bi, int i, int i2);

    /* renamed from: a */
    public abstract View mo2963a(AbstractC0856bi abstractC0856bi);

    /* renamed from: a */
    public abstract int[] mo2964a(AbstractC0856bi abstractC0856bi, View view);

    @Override // androidx.recyclerview.widget.AbstractC0863bp
    /* renamed from: a */
    public final boolean mo3133a(int i, int i2) {
        C0830aj mo2989b;
        int mo2962a;
        boolean z;
        AbstractC0856bi layoutManager = this.f3637a.getLayoutManager();
        if (layoutManager == null || this.f3637a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3637a.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            if (!(layoutManager instanceof InterfaceC0875ca) || (mo2989b = mo2989b(layoutManager)) == null || (mo2962a = mo2962a(layoutManager, i, i2)) == -1) {
                z = false;
            } else {
                mo2989b.m3180c(mo2962a);
                layoutManager.m3096a(mo2989b);
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m3240a(RecyclerView recyclerView) {
        if (this.f3637a == recyclerView) {
            return;
        }
        if (this.f3637a != null) {
            this.f3637a.removeOnScrollListener(this.f3639c);
            this.f3637a.setOnFlingListener(null);
        }
        this.f3637a = recyclerView;
        if (this.f3637a != null) {
            if (this.f3637a.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f3637a.addOnScrollListener(this.f3639c);
            this.f3637a.setOnFlingListener(this);
            this.f3638b = new Scroller(this.f3637a.getContext(), new DecelerateInterpolator());
            m3239a();
        }
    }

    /* renamed from: b */
    public final int[] m3241b(int i, int i2) {
        this.f3638b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f3638b.getFinalX(), this.f3638b.getFinalY()};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3239a() {
        AbstractC0856bi layoutManager;
        View mo2963a;
        if (this.f3637a == null || (layoutManager = this.f3637a.getLayoutManager()) == null || (mo2963a = mo2963a(layoutManager)) == null) {
            return;
        }
        int[] mo2964a = mo2964a(layoutManager, mo2963a);
        if (mo2964a[0] == 0 && mo2964a[1] == 0) {
            return;
        }
        this.f3637a.smoothScrollBy(mo2964a[0], mo2964a[1]);
    }

    @Deprecated
    /* renamed from: b */
    protected C0830aj mo2989b(AbstractC0856bi abstractC0856bi) {
        if (abstractC0856bi instanceof InterfaceC0875ca) {
            return new C0886cl(this, this.f3637a.getContext());
        }
        return null;
    }
}
