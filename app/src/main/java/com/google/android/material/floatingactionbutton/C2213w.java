package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.w */
/* loaded from: classes.dex */
public final class C2213w implements TypeEvaluator<Float> {

    /* renamed from: a */
    FloatEvaluator f9811a = new FloatEvaluator();

    /* renamed from: b */
    final /* synthetic */ C2209s f9812b;

    public C2213w(C2209s c2209s) {
        this.f9812b = c2209s;
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.f9811a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
