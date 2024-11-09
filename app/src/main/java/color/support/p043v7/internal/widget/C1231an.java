package color.support.p043v7.internal.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper.java */
/* renamed from: color.support.v7.internal.widget.an */
/* loaded from: classes.dex */
public final class C1231an {

    /* renamed from: a */
    private int f5228a = 0;

    /* renamed from: b */
    private int f5229b = 0;

    /* renamed from: c */
    private int f5230c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f5231d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f5232e = 0;

    /* renamed from: f */
    private int f5233f = 0;

    /* renamed from: g */
    private boolean f5234g = false;

    /* renamed from: h */
    private boolean f5235h = false;

    /* renamed from: a */
    public final int m4067a() {
        return this.f5228a;
    }

    /* renamed from: b */
    public final int m4070b() {
        return this.f5229b;
    }

    /* renamed from: c */
    public final int m4072c() {
        return this.f5234g ? this.f5229b : this.f5228a;
    }

    /* renamed from: d */
    public final int m4073d() {
        return this.f5234g ? this.f5228a : this.f5229b;
    }

    /* renamed from: a */
    public final void m4068a(int i, int i2) {
        this.f5230c = i;
        this.f5231d = i2;
        this.f5235h = true;
        if (this.f5234g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5228a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5229b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f5228a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5229b = i2;
        }
    }

    /* renamed from: b */
    public final void m4071b(int i, int i2) {
        this.f5235h = false;
        if (i != Integer.MIN_VALUE) {
            this.f5232e = i;
            this.f5228a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5233f = i2;
            this.f5229b = i2;
        }
    }

    /* renamed from: a */
    public final void m4069a(boolean z) {
        if (z == this.f5234g) {
            return;
        }
        this.f5234g = z;
        if (!this.f5235h) {
            this.f5228a = this.f5232e;
            this.f5229b = this.f5233f;
        } else if (z) {
            this.f5228a = this.f5231d != Integer.MIN_VALUE ? this.f5231d : this.f5232e;
            this.f5229b = this.f5230c != Integer.MIN_VALUE ? this.f5230c : this.f5233f;
        } else {
            this.f5228a = this.f5230c != Integer.MIN_VALUE ? this.f5230c : this.f5232e;
            this.f5229b = this.f5231d != Integer.MIN_VALUE ? this.f5231d : this.f5233f;
        }
    }
}
