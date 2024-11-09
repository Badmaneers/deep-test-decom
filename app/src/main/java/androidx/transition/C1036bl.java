package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* renamed from: androidx.transition.bl */
/* loaded from: classes.dex */
class C1036bl extends C1035bk {

    /* renamed from: a */
    private static boolean f4179a = true;

    @Override // androidx.transition.C1038bn
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo3569a(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo3569a(view, i);
        } else if (f4179a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f4179a = false;
            }
        }
    }
}
