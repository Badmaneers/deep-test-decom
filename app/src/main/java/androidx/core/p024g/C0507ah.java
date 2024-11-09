package androidx.core.p024g;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: androidx.core.g.ah */
/* loaded from: classes.dex */
public final class C0507ah {

    /* renamed from: a */
    Runnable f2345a = null;

    /* renamed from: b */
    Runnable f2346b = null;

    /* renamed from: c */
    int f2347c = -1;

    /* renamed from: d */
    private WeakReference<View> f2348d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0507ah(View view) {
        this.f2348d = new WeakReference<>(view);
    }

    /* renamed from: a */
    public final C0507ah m1754a(long j) {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0507ah m1753a(float f) {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0507ah m1759b(float f) {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public final long m1752a() {
        View view = this.f2348d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: a */
    public final C0507ah m1755a(Interpolator interpolator) {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public final C0507ah m1760b(long j) {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public final C0507ah m1758b() {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().rotation(0.0f);
        }
        return this;
    }

    /* renamed from: c */
    public final void m1761c() {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public final void m1762d() {
        View view = this.f2348d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public final C0507ah m1756a(InterfaceC0511al interfaceC0511al) {
        View view = this.f2348d.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m1751a(view, interfaceC0511al);
            } else {
                view.setTag(2113929216, interfaceC0511al);
                m1751a(view, new C0510ak(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m1751a(View view, InterfaceC0511al interfaceC0511al) {
        if (interfaceC0511al != null) {
            view.animate().setListener(new C0508ai(this, interfaceC0511al, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public final C0507ah m1757a(InterfaceC0513an interfaceC0513an) {
        View view = this.f2348d.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC0513an != null ? new C0509aj(this, interfaceC0513an, view) : null);
        }
        return this;
    }
}
