package com.google.android.material.p082k;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* renamed from: com.google.android.material.k.b */
/* loaded from: classes.dex */
public final class C2289b implements InterfaceC2290c {

    /* renamed from: a */
    private final InterfaceC2290c f10060a;

    /* renamed from: b */
    private final float f10061b;

    public C2289b(float f, InterfaceC2290c interfaceC2290c) {
        while (interfaceC2290c instanceof C2289b) {
            interfaceC2290c = ((C2289b) interfaceC2290c).f10060a;
            f += ((C2289b) interfaceC2290c).f10061b;
        }
        this.f10060a = interfaceC2290c;
        this.f10061b = f;
    }

    @Override // com.google.android.material.p082k.InterfaceC2290c
    /* renamed from: a */
    public final float mo7225a(RectF rectF) {
        return Math.max(0.0f, this.f10060a.mo7225a(rectF) + this.f10061b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2289b)) {
            return false;
        }
        C2289b c2289b = (C2289b) obj;
        return this.f10060a.equals(c2289b.f10060a) && this.f10061b == c2289b.f10061b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10060a, Float.valueOf(this.f10061b)});
    }
}
