package com.google.android.material.floatingactionbutton;

import android.graphics.Matrix;
import com.google.android.material.p072a.C2038g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.v */
/* loaded from: classes.dex */
public final class C2212v extends C2038g {

    /* renamed from: a */
    final /* synthetic */ C2209s f9810a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2212v(C2209s c2209s) {
        this.f9810a = c2209s;
    }

    @Override // com.google.android.material.p072a.C2038g, android.animation.TypeEvaluator
    /* renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.f9810a.f9773B = f;
        return super.evaluate(f, matrix, matrix2);
    }
}
