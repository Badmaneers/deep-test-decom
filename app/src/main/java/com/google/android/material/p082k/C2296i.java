package com.google.android.material.p082k;

import android.graphics.Matrix;
import java.util.BitSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialShapeDrawable.java */
/* renamed from: com.google.android.material.k.i */
/* loaded from: classes.dex */
public final class C2296i implements InterfaceC2307t {

    /* renamed from: a */
    final /* synthetic */ C2295h f10088a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2296i(C2295h c2295h) {
        this.f10088a = c2295h;
    }

    @Override // com.google.android.material.p082k.InterfaceC2307t
    /* renamed from: a */
    public final void mo7289a(C2309v c2309v, Matrix matrix, int i) {
        BitSet bitSet;
        AbstractC2287ac[] abstractC2287acArr;
        bitSet = this.f10088a.f10069f;
        bitSet.set(i, c2309v.m7364a());
        abstractC2287acArr = this.f10088a.f10067d;
        abstractC2287acArr[i] = c2309v.m7359a(matrix);
    }

    @Override // com.google.android.material.p082k.InterfaceC2307t
    /* renamed from: b */
    public final void mo7290b(C2309v c2309v, Matrix matrix, int i) {
        BitSet bitSet;
        AbstractC2287ac[] abstractC2287acArr;
        bitSet = this.f10088a.f10069f;
        bitSet.set(i + 4, c2309v.m7364a());
        abstractC2287acArr = this.f10088a.f10068e;
        abstractC2287acArr[i] = c2309v.m7359a(matrix);
    }
}
