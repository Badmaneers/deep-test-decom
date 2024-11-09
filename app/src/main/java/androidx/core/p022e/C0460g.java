package androidx.core.p022e;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* compiled from: PrecomputedTextCompat.java */
/* renamed from: androidx.core.e.g */
/* loaded from: classes.dex */
public final class C0460g {

    /* renamed from: a */
    private final TextPaint f2254a;

    /* renamed from: b */
    private TextDirectionHeuristic f2255b;

    /* renamed from: c */
    private int f2256c;

    /* renamed from: d */
    private int f2257d;

    public C0460g(TextPaint textPaint) {
        this.f2254a = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2256c = 1;
            this.f2257d = 1;
        } else {
            this.f2257d = 0;
            this.f2256c = 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            this.f2255b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
            this.f2255b = null;
        }
    }

    /* renamed from: a */
    public final C0460g m1603a(int i) {
        this.f2256c = i;
        return this;
    }

    /* renamed from: b */
    public final C0460g m1605b(int i) {
        this.f2257d = i;
        return this;
    }

    /* renamed from: a */
    public final C0460g m1604a(TextDirectionHeuristic textDirectionHeuristic) {
        this.f2255b = textDirectionHeuristic;
        return this;
    }

    /* renamed from: a */
    public final C0459f m1602a() {
        return new C0459f(this.f2254a, this.f2255b, this.f2256c, this.f2257d);
    }
}
