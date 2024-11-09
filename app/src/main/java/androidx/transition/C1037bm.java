package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* renamed from: androidx.transition.bm */
/* loaded from: classes.dex */
final class C1037bm extends C1036bl {
    @Override // androidx.transition.C1033bi, androidx.transition.C1038bn
    /* renamed from: a */
    public final void mo3563a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.C1033bi, androidx.transition.C1038bn
    /* renamed from: a */
    public final float mo3562a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.C1036bl, androidx.transition.C1038bn
    /* renamed from: a */
    public final void mo3569a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.C1035bk, androidx.transition.C1038bn
    /* renamed from: a */
    public final void mo3568a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.C1034bj, androidx.transition.C1038bn
    /* renamed from: a */
    public final void mo3566a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.C1034bj, androidx.transition.C1038bn
    /* renamed from: b */
    public final void mo3567b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
