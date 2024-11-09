package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* renamed from: androidx.transition.bk */
/* loaded from: classes.dex */
class C1035bk extends C1034bj {

    /* renamed from: a */
    private static boolean f4178a = true;

    @Override // androidx.transition.C1038bn
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo3568a(View view, int i, int i2, int i3, int i4) {
        if (f4178a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f4178a = false;
            }
        }
    }
}
