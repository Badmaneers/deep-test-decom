package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper.java */
/* renamed from: androidx.appcompat.widget.ck */
/* loaded from: classes.dex */
final class C0246ck {

    /* renamed from: a */
    private int f1285a = 0;

    /* renamed from: b */
    private int f1286b = 0;

    /* renamed from: c */
    private int f1287c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f1288d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f1289e = 0;

    /* renamed from: f */
    private int f1290f = 0;

    /* renamed from: g */
    private boolean f1291g = false;

    /* renamed from: h */
    private boolean f1292h = false;

    /* renamed from: a */
    public final int m902a() {
        return this.f1285a;
    }

    /* renamed from: b */
    public final int m905b() {
        return this.f1286b;
    }

    /* renamed from: c */
    public final int m907c() {
        return this.f1291g ? this.f1286b : this.f1285a;
    }

    /* renamed from: d */
    public final int m908d() {
        return this.f1291g ? this.f1285a : this.f1286b;
    }

    /* renamed from: a */
    public final void m903a(int i, int i2) {
        this.f1287c = i;
        this.f1288d = i2;
        this.f1292h = true;
        if (this.f1291g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1285a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1286b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1285a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1286b = i2;
        }
    }

    /* renamed from: b */
    public final void m906b(int i, int i2) {
        this.f1292h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1289e = i;
            this.f1285a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1290f = i2;
            this.f1286b = i2;
        }
    }

    /* renamed from: a */
    public final void m904a(boolean z) {
        if (z == this.f1291g) {
            return;
        }
        this.f1291g = z;
        if (!this.f1292h) {
            this.f1285a = this.f1289e;
            this.f1286b = this.f1290f;
        } else if (z) {
            this.f1285a = this.f1288d != Integer.MIN_VALUE ? this.f1288d : this.f1289e;
            this.f1286b = this.f1287c != Integer.MIN_VALUE ? this.f1287c : this.f1290f;
        } else {
            this.f1285a = this.f1287c != Integer.MIN_VALUE ? this.f1287c : this.f1289e;
            this.f1286b = this.f1288d != Integer.MIN_VALUE ? this.f1288d : this.f1290f;
        }
    }
}
