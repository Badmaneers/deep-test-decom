package androidx.vectordrawable.p039a.p040a;

import android.animation.TypeEvaluator;
import androidx.core.graphics.C0543b;
import androidx.core.graphics.C0545d;

/* compiled from: AnimatorInflaterCompat.java */
/* renamed from: androidx.vectordrawable.a.a.i */
/* loaded from: classes.dex */
final class C1077i implements TypeEvaluator<C0545d[]> {

    /* renamed from: a */
    private C0545d[] f4284a;

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ C0545d[] evaluate(float f, C0545d[] c0545dArr, C0545d[] c0545dArr2) {
        C0545d[] c0545dArr3 = c0545dArr;
        C0545d[] c0545dArr4 = c0545dArr2;
        if (!C0543b.m1908a(c0545dArr3, c0545dArr4)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!C0543b.m1908a(this.f4284a, c0545dArr3)) {
            this.f4284a = C0543b.m1910a(c0545dArr3);
        }
        for (int i = 0; i < c0545dArr3.length; i++) {
            this.f4284a[i].m1916a(c0545dArr3[i], c0545dArr4[i], f);
        }
        return this.f4284a;
    }
}
