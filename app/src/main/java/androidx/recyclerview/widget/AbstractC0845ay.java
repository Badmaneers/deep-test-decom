package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.core.p019c.C0419a;
import androidx.recyclerview.widget.AbstractC0879ce;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.ay */
/* loaded from: classes.dex */
public abstract class AbstractC0845ay<VH extends AbstractC0879ce> {

    /* renamed from: a */
    private final C0846az f3513a = new C0846az();

    /* renamed from: b */
    private boolean f3514b = false;

    /* renamed from: a */
    public int mo3014a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract VH mo3015a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo3018a(VH vh) {
    }

    /* renamed from: a */
    public abstract void mo3019a(VH vh, int i);

    /* renamed from: b */
    public abstract int mo3020b();

    /* renamed from: b */
    public long mo3021b(int i) {
        return -1L;
    }

    /* renamed from: b */
    public final VH m3022b(ViewGroup viewGroup, int i) {
        try {
            C0419a.m1480a("RV CreateView");
            VH mo3015a = mo3015a(viewGroup, i);
            if (mo3015a.f3614a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            mo3015a.f3619f = i;
            return mo3015a;
        } finally {
            C0419a.m1479a();
        }
    }

    /* renamed from: b */
    public final void m3024b(VH vh, int i) {
        vh.f3616c = i;
        if (this.f3514b) {
            vh.f3618e = mo3021b(i);
        }
        vh.m3199a(1, 519);
        C0419a.m1480a("RV OnBindView");
        vh.m3224r();
        mo3019a((AbstractC0845ay<VH>) vh, i);
        vh.m3223q();
        ViewGroup.LayoutParams layoutParams = vh.f3614a.getLayoutParams();
        if (layoutParams instanceof C0861bn) {
            ((C0861bn) layoutParams).f3552e = true;
        }
        C0419a.m1479a();
    }

    /* renamed from: c */
    public final boolean m3026c() {
        return this.f3514b;
    }

    /* renamed from: a */
    public final void m3017a(AbstractC0848ba abstractC0848ba) {
        this.f3513a.registerObserver(abstractC0848ba);
    }

    /* renamed from: b */
    public final void m3023b(AbstractC0848ba abstractC0848ba) {
        this.f3513a.unregisterObserver(abstractC0848ba);
    }

    /* renamed from: d */
    public final void m3028d() {
        this.f3513a.m3031b();
    }

    /* renamed from: c */
    public final void m3025c(int i) {
        this.f3513a.m3029a(i, 1);
    }

    /* renamed from: a */
    public final void m3016a(int i, int i2) {
        this.f3513a.m3029a(i, i2);
    }

    /* renamed from: c_ */
    public final void m3027c_() {
        if (this.f3513a.m3030a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3514b = true;
    }
}
