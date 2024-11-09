package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.s */
/* loaded from: classes.dex */
public final class C1112s implements Comparator<View> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(View view, View view2) {
        C1105l c1105l = (C1105l) view.getLayoutParams();
        C1105l c1105l2 = (C1105l) view2.getLayoutParams();
        if (c1105l.f4479a != c1105l2.f4479a) {
            return c1105l.f4479a ? 1 : -1;
        }
        return c1105l.f4483e - c1105l2.f4483e;
    }
}
