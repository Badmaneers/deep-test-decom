package androidx.core.content.p020a;

import java.util.List;

/* compiled from: GradientColorInflaterCompat.java */
/* renamed from: androidx.core.content.a.i */
/* loaded from: classes.dex */
final class C0429i {

    /* renamed from: a */
    final int[] f2168a;

    /* renamed from: b */
    final float[] f2169b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0429i(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f2168a = new int[size];
        this.f2169b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f2168a[i] = list.get(i).intValue();
            this.f2169b[i] = list2.get(i).floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0429i(int i, int i2) {
        this.f2168a = new int[]{i, i2};
        this.f2169b = new float[]{0.0f, 1.0f};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0429i(int i, int i2, int i3) {
        this.f2168a = new int[]{i, i2, i3};
        this.f2169b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
