package androidx.viewpager2.widget;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimateLayoutChangeDetector.java */
/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes.dex */
public final class C1119b implements Comparator<int[]> {

    /* renamed from: a */
    final /* synthetic */ C1118a f4528a;

    public C1119b(C1118a c1118a) {
        this.f4528a = c1118a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
        return iArr[0] - iArr2[0];
    }
}
