package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bz */
/* loaded from: classes.dex */
public final class C0873bz {

    /* renamed from: a */
    private int f3578a;

    /* renamed from: b */
    private int f3579b;

    /* renamed from: c */
    private int f3580c;

    /* renamed from: d */
    private int f3581d;

    /* renamed from: e */
    private Interpolator f3582e;

    /* renamed from: f */
    private boolean f3583f;

    /* renamed from: g */
    private int f3584g;

    public C0873bz() {
        this((byte) 0);
    }

    private C0873bz(byte b) {
        this.f3581d = -1;
        this.f3583f = false;
        this.f3584g = 0;
        this.f3578a = 0;
        this.f3579b = 0;
        this.f3580c = RecyclerView.UNDEFINED_DURATION;
        this.f3582e = null;
    }

    /* renamed from: a */
    public final void m3186a(int i) {
        this.f3581d = i;
    }

    /* renamed from: a */
    public final boolean m3189a() {
        return this.f3581d >= 0;
    }

    /* renamed from: a */
    public final void m3188a(RecyclerView recyclerView) {
        if (this.f3581d >= 0) {
            int i = this.f3581d;
            this.f3581d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f3583f = false;
            return;
        }
        if (!this.f3583f) {
            this.f3584g = 0;
            return;
        }
        if (this.f3582e != null && this.f3580c <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (this.f3580c > 0) {
            recyclerView.mViewFlinger.m3196a(this.f3578a, this.f3579b, this.f3580c, this.f3582e);
            this.f3584g++;
            if (this.f3584g > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f3583f = false;
            return;
        }
        throw new IllegalStateException("Scroll duration must be a positive number");
    }

    /* renamed from: a */
    public final void m3187a(int i, int i2, int i3, Interpolator interpolator) {
        this.f3578a = i;
        this.f3579b = i2;
        this.f3580c = i3;
        this.f3582e = interpolator;
        this.f3583f = true;
    }
}
