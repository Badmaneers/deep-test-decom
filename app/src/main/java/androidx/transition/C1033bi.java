package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* renamed from: androidx.transition.bi */
/* loaded from: classes.dex */
class C1033bi extends C1038bn {

    /* renamed from: a */
    private static boolean f4174a = true;

    @Override // androidx.transition.C1038bn
    /* renamed from: b */
    public final void mo3564b(View view) {
    }

    @Override // androidx.transition.C1038bn
    /* renamed from: c */
    public final void mo3565c(View view) {
    }

    @Override // androidx.transition.C1038bn
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo3563a(View view, float f) {
        if (f4174a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f4174a = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // androidx.transition.C1038bn
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public float mo3562a(View view) {
        if (f4174a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f4174a = false;
            }
        }
        return view.getAlpha();
    }
}
