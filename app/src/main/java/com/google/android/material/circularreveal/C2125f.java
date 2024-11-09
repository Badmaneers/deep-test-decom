package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import com.google.android.material.p078g.C2217a;

/* compiled from: CircularRevealWidget.java */
/* renamed from: com.google.android.material.circularreveal.f */
/* loaded from: classes.dex */
public final class C2125f implements TypeEvaluator<C2128i> {

    /* renamed from: a */
    public static final TypeEvaluator<C2128i> f9523a = new C2125f();

    /* renamed from: b */
    private final C2128i f9524b = new C2128i((byte) 0);

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ C2128i evaluate(float f, C2128i c2128i, C2128i c2128i2) {
        C2128i c2128i3 = c2128i;
        C2128i c2128i4 = c2128i2;
        this.f9524b.m6787a(C2217a.m7035a(c2128i3.f9527a, c2128i4.f9527a, f), C2217a.m7035a(c2128i3.f9528b, c2128i4.f9528b, f), C2217a.m7035a(c2128i3.f9529c, c2128i4.f9529c, f));
        return this.f9524b;
    }
}
