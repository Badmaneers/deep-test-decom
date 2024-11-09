package androidx.appcompat.p008b.p009a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateListDrawable.java */
/* renamed from: androidx.appcompat.b.a.n */
/* loaded from: classes.dex */
public class C0125n extends AbstractC0122k {

    /* renamed from: L */
    int[][] f439L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0125n(C0125n c0125n, C0124m c0124m, Resources resources) {
        super(c0125n, c0124m, resources);
        if (c0125n != null) {
            this.f439L = c0125n.f439L;
        } else {
            this.f439L = new int[this.f418i.length];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.p008b.p009a.AbstractC0122k
    /* renamed from: a */
    public void mo267a() {
        int[][] iArr = new int[this.f439L.length];
        for (int length = this.f439L.length - 1; length >= 0; length--) {
            iArr[length] = this.f439L[length] != null ? (int[]) this.f439L[length].clone() : null;
        }
        this.f439L = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m300b(int[] iArr) {
        int[][] iArr2 = this.f439L;
        int i = this.f419j;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C0124m(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C0124m(this, resources);
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0122k
    /* renamed from: d */
    public final void mo292d(int i, int i2) {
        super.mo292d(i, i2);
        int[][] iArr = new int[i2];
        System.arraycopy(this.f439L, 0, iArr, 0, i);
        this.f439L = iArr;
    }
}
