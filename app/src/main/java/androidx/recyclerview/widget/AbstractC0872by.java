package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.by */
/* loaded from: classes.dex */
public abstract class AbstractC0872by {

    /* renamed from: b */
    private RecyclerView f3571b;

    /* renamed from: c */
    private AbstractC0856bi f3572c;

    /* renamed from: d */
    private boolean f3573d;

    /* renamed from: e */
    private boolean f3574e;

    /* renamed from: f */
    private View f3575f;

    /* renamed from: h */
    private boolean f3577h;

    /* renamed from: a */
    private int f3570a = -1;

    /* renamed from: g */
    private final C0873bz f3576g = new C0873bz();

    /* renamed from: a */
    protected abstract void mo2952a();

    /* renamed from: a */
    protected abstract void mo2953a(int i, int i2, C0873bz c0873bz);

    /* renamed from: a */
    protected abstract void mo2954a(View view, C0873bz c0873bz);

    /* renamed from: a */
    public final void m3177a(RecyclerView recyclerView, AbstractC0856bi abstractC0856bi) {
        recyclerView.mViewFlinger.m3197b();
        if (this.f3577h) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.f3571b = recyclerView;
        this.f3572c = abstractC0856bi;
        if (this.f3570a == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        this.f3571b.mState.f3589a = this.f3570a;
        this.f3574e = true;
        this.f3573d = true;
        this.f3575f = this.f3571b.mLayout.mo2832b(this.f3570a);
        this.f3571b.mViewFlinger.m3194a();
        this.f3577h = true;
    }

    /* renamed from: c */
    public final void m3180c(int i) {
        this.f3570a = i;
    }

    /* renamed from: b */
    public final AbstractC0856bi m3178b() {
        return this.f3572c;
    }

    /* renamed from: c */
    public final void m3179c() {
        if (this.f3574e) {
            this.f3574e = false;
            mo2952a();
            this.f3571b.mState.f3589a = -1;
            this.f3575f = null;
            this.f3570a = -1;
            this.f3573d = false;
            AbstractC0856bi abstractC0856bi = this.f3572c;
            if (abstractC0856bi.f3538t == this) {
                abstractC0856bi.f3538t = null;
            }
            this.f3572c = null;
            this.f3571b = null;
        }
    }

    /* renamed from: d */
    public final boolean m3182d() {
        return this.f3573d;
    }

    /* renamed from: e */
    public final boolean m3183e() {
        return this.f3574e;
    }

    /* renamed from: f */
    public final int m3184f() {
        return this.f3570a;
    }

    /* renamed from: a */
    public final void m3175a(int i, int i2) {
        PointF m3181d;
        RecyclerView recyclerView = this.f3571b;
        if (this.f3570a == -1 || recyclerView == null) {
            m3179c();
        }
        if (this.f3573d && this.f3575f == null && this.f3572c != null && (m3181d = m3181d(this.f3570a)) != null && (m3181d.x != 0.0f || m3181d.y != 0.0f)) {
            recyclerView.scrollStep((int) Math.signum(m3181d.x), (int) Math.signum(m3181d.y), null);
        }
        this.f3573d = false;
        if (this.f3575f != null) {
            if (m3174b(this.f3575f) == this.f3570a) {
                mo2954a(this.f3575f, this.f3576g);
                this.f3576g.m3188a(recyclerView);
                m3179c();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3575f = null;
            }
        }
        if (this.f3574e) {
            mo2953a(i, i2, this.f3576g);
            boolean m3189a = this.f3576g.m3189a();
            this.f3576g.m3188a(recyclerView);
            if (m3189a && this.f3574e) {
                this.f3573d = true;
                recyclerView.mViewFlinger.m3194a();
            }
        }
    }

    /* renamed from: b */
    private int m3174b(View view) {
        return this.f3571b.getChildLayoutPosition(view);
    }

    /* renamed from: g */
    public final int m3185g() {
        return this.f3571b.mLayout.m3121v();
    }

    /* renamed from: a */
    public final void m3176a(View view) {
        if (m3174b(view) == this.f3570a) {
            this.f3575f = view;
        }
    }

    /* renamed from: d */
    public final PointF m3181d(int i) {
        Object obj = this.f3572c;
        if (obj instanceof InterfaceC0875ca) {
            return ((InterfaceC0875ca) obj).mo2834c(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0875ca.class.getCanonicalName());
        return null;
    }
}
