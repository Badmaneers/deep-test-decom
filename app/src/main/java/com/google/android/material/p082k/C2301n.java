package com.google.android.material.p082k;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* renamed from: com.google.android.material.k.n */
/* loaded from: classes.dex */
public final class C2301n implements InterfaceC2290c {

    /* renamed from: a */
    private final float f10115a;

    public C2301n(float f) {
        this.f10115a = f;
    }

    @Override // com.google.android.material.p082k.InterfaceC2290c
    /* renamed from: a */
    public final float mo7225a(RectF rectF) {
        return this.f10115a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2301n) && this.f10115a == ((C2301n) obj).f10115a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10115a)});
    }
}
