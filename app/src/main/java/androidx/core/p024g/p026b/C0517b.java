package androidx.core.p024g.p026b;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* renamed from: androidx.core.g.b.b */
/* loaded from: classes.dex */
public final class C0517b {
    /* renamed from: a */
    public static Interpolator m1773a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new InterpolatorC0516a(f, f2, f3, f4);
    }
}
