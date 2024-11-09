package androidx.appcompat.p008b.p009a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.p011b.C0323f;
import androidx.p011b.C0329o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: androidx.appcompat.b.a.c */
/* loaded from: classes.dex */
public final class C0114c extends C0125n {

    /* renamed from: a */
    C0323f<Long> f378a;

    /* renamed from: b */
    C0329o<Integer> f379b;

    /* renamed from: e */
    private static long m262e(int i, int i2) {
        return i2 | (i << 32);
    }

    public C0114c(C0114c c0114c, C0112a c0112a, Resources resources) {
        super(c0114c, c0112a, resources);
        if (c0114c != null) {
            this.f378a = c0114c.f378a;
            this.f379b = c0114c.f379b;
        } else {
            this.f378a = new C0323f<>();
            this.f379b = new C0329o<>();
        }
    }

    @Override // androidx.appcompat.p008b.p009a.C0125n, androidx.appcompat.p008b.p009a.AbstractC0122k
    /* renamed from: a */
    public final void mo267a() {
        this.f378a = this.f378a.clone();
        this.f379b = this.f379b.clone();
    }

    /* renamed from: a */
    public final int m265a(int i, int i2, Drawable drawable, boolean z) {
        int a2 = super.m285a(drawable);
        long m262e = m262e(i, i2);
        long j = z ? 8589934592L : 0L;
        long j2 = a2;
        this.f378a.m1041c(m262e, Long.valueOf(j2 | j));
        if (z) {
            this.f378a.m1041c(m262e(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
        return a2;
    }

    /* renamed from: a */
    public final int m266a(int[] iArr) {
        int m300b = super.m300b(iArr);
        return m300b >= 0 ? m300b : super.m300b(StateSet.WILD_CARD);
    }

    /* renamed from: a */
    public final int m263a(int i) {
        if (i < 0) {
            return 0;
        }
        return this.f379b.m1068a(i, 0).intValue();
    }

    /* renamed from: a */
    public final int m264a(int i, int i2) {
        return (int) this.f378a.m1033a(m262e(i, i2), -1L).longValue();
    }

    /* renamed from: b */
    public final boolean m268b(int i, int i2) {
        return (this.f378a.m1033a(m262e(i, i2), -1L).longValue() & 4294967296L) != 0;
    }

    /* renamed from: c */
    public final boolean m269c(int i, int i2) {
        return (this.f378a.m1033a(m262e(i, i2), -1L).longValue() & 8589934592L) != 0;
    }

    @Override // androidx.appcompat.p008b.p009a.C0125n, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0112a(this, null);
    }

    @Override // androidx.appcompat.p008b.p009a.C0125n, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0112a(this, resources);
    }
}
