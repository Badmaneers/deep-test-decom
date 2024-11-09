package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.p024g.C0538w;
import java.util.Comparator;

/* compiled from: CoordinatorLayout.java */
/* renamed from: androidx.coordinatorlayout.widget.i */
/* loaded from: classes.dex */
final class C0397i implements Comparator<View> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(View view, View view2) {
        float m1820D = C0538w.m1820D(view);
        float m1820D2 = C0538w.m1820D(view2);
        if (m1820D > m1820D2) {
            return -1;
        }
        return m1820D < m1820D2 ? 1 : 0;
    }
}
