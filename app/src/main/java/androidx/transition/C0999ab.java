package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator.java */
/* renamed from: androidx.transition.ab */
/* loaded from: classes.dex */
final class C0999ab implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f4084a;

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left + ((int) ((rect4.left - rect3.left) * f));
        int i2 = rect3.top + ((int) ((rect4.top - rect3.top) * f));
        int i3 = rect3.right + ((int) ((rect4.right - rect3.right) * f));
        int i4 = rect3.bottom + ((int) ((rect4.bottom - rect3.bottom) * f));
        if (this.f4084a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f4084a.set(i, i2, i3, i4);
        return this.f4084a;
    }
}
