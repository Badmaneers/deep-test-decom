package androidx.recyclerview.widget;

import java.util.Comparator;

/* compiled from: GapWorker.java */
/* renamed from: androidx.recyclerview.widget.y */
/* loaded from: classes.dex */
final class C0920y implements Comparator<C0821aa> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C0821aa c0821aa, C0821aa c0821aa2) {
        C0821aa c0821aa3 = c0821aa;
        C0821aa c0821aa4 = c0821aa2;
        if ((c0821aa3.f3452d == null) != (c0821aa4.f3452d == null)) {
            return c0821aa3.f3452d == null ? 1 : -1;
        }
        if (c0821aa3.f3449a != c0821aa4.f3449a) {
            return c0821aa3.f3449a ? -1 : 1;
        }
        int i = c0821aa4.f3450b - c0821aa3.f3450b;
        if (i != 0) {
            return i;
        }
        int i2 = c0821aa3.f3451c - c0821aa4.f3451c;
        if (i2 != 0) {
            return i2;
        }
        return 0;
    }
}
