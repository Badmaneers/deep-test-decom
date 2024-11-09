package androidx.core.p024g;

import android.os.Build;
import android.view.WindowInsets;
import androidx.core.p023f.C0472c;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* renamed from: androidx.core.g.ao */
/* loaded from: classes.dex */
public final class C0514ao {

    /* renamed from: a */
    private final Object f2357a;

    private C0514ao(Object obj) {
        this.f2357a = obj;
    }

    /* renamed from: a */
    public final int m1764a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2357a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public final int m1766b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2357a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public final int m1767c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2357a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public final int m1768d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2357a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean m1769e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2357a).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m1770f() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f2357a).isConsumed();
        }
        return false;
    }

    /* renamed from: g */
    public final C0514ao m1771g() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0514ao(((WindowInsets) this.f2357a).consumeSystemWindowInsets());
        }
        return null;
    }

    /* renamed from: a */
    public final C0514ao m1765a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0514ao(((WindowInsets) this.f2357a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0514ao) {
            return C0472c.m1615a(this.f2357a, ((C0514ao) obj).f2357a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2357a == null) {
            return 0;
        }
        return this.f2357a.hashCode();
    }

    /* renamed from: h */
    public final WindowInsets m1772h() {
        return (WindowInsets) this.f2357a;
    }

    /* renamed from: a */
    public static C0514ao m1763a(WindowInsets windowInsets) {
        return new C0514ao(Objects.requireNonNull(windowInsets));
    }
}
