package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* renamed from: androidx.transition.bj */
/* loaded from: classes.dex */
class C1034bj extends C1033bi {

    /* renamed from: a */
    private static boolean f4175a = true;

    /* renamed from: b */
    private static boolean f4176b = true;

    /* renamed from: c */
    private static boolean f4177c = true;

    @Override // androidx.transition.C1038bn
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo3566a(View view, Matrix matrix) {
        if (f4176b) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4176b = false;
            }
        }
    }

    @Override // androidx.transition.C1038bn
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo3567b(View view, Matrix matrix) {
        if (f4177c) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4177c = false;
            }
        }
    }
}
