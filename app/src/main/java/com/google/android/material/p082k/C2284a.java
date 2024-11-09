package com.google.android.material.p082k;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* renamed from: com.google.android.material.k.a */
/* loaded from: classes.dex */
public final class C2284a implements InterfaceC2290c {

    /* renamed from: a */
    private final float f10055a;

    public C2284a(float f) {
        this.f10055a = f;
    }

    @Override // com.google.android.material.p082k.InterfaceC2290c
    /* renamed from: a */
    public final float mo7225a(RectF rectF) {
        return this.f10055a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2284a) && this.f10055a == ((C2284a) obj).f10055a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10055a)});
    }
}
