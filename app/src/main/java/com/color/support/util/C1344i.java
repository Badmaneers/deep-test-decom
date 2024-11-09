package com.color.support.util;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: ColorRoundRectUtil.java */
/* renamed from: com.color.support.util.i */
/* loaded from: classes.dex */
public final class C1344i {

    /* renamed from: a */
    private static C1344i f5821a;

    /* renamed from: b */
    private Path f5822b = new Path();

    private C1344i() {
    }

    /* renamed from: a */
    public static C1344i m4397a() {
        if (f5821a == null) {
            f5821a = new C1344i();
        }
        return f5821a;
    }

    /* renamed from: a */
    public final Path m4400a(RectF rectF, float f) {
        return m4398a(rectF.left, rectF.top, rectF.right, rectF.bottom, f);
    }

    /* renamed from: a */
    public final Path m4398a(float f, float f2, float f3, float f4, float f5) {
        return m4399a(f, f2, f3, f4, f5, true, true, true, true);
    }

    /* renamed from: a */
    public final Path m4399a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, boolean z3, boolean z4) {
        float f6;
        float f7;
        if (this.f5822b != null) {
            this.f5822b.reset();
        }
        float f8 = f5 < 0.0f ? 0.0f : f5;
        float f9 = f3 - f;
        float f10 = f4 - f2;
        float f11 = f9 / 2.0f;
        float f12 = f10 / 2.0f;
        float min = ((double) (f8 / Math.min(f11, f12))) > 0.5d ? 1.0f - (Math.min(1.0f, ((f8 / Math.min(f11, f12)) - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
        float min2 = f8 / Math.min(f11, f12) > 0.6f ? 1.0f + (Math.min(1.0f, ((f8 / Math.min(f11, f12)) - 0.6f) / 0.3f) * 0.042454004f) : 1.0f;
        this.f5822b.moveTo(f + f11, f2);
        if (!z2) {
            this.f5822b.lineTo(f + f9, f2);
            f6 = f11;
        } else {
            float f13 = f8 / 100.0f;
            float f14 = f13 * 128.19f * min;
            this.f5822b.lineTo(Math.max(f11, f9 - f14) + f, f2);
            float f15 = f + f9;
            float f16 = f13 * 83.62f * min2;
            float f17 = f13 * 67.45f;
            float f18 = f13 * 4.64f;
            float f19 = f13 * 51.16f;
            float f20 = f13 * 13.36f;
            f6 = f11;
            this.f5822b.cubicTo(f15 - f16, f2, f15 - f17, f2 + f18, f15 - f19, f2 + f20);
            float f21 = f13 * 34.86f;
            float f22 = f13 * 22.07f;
            this.f5822b.cubicTo(f15 - f21, f2 + f22, f15 - f22, f2 + f21, f15 - f20, f2 + f19);
            this.f5822b.cubicTo(f15 - f18, f2 + f17, f15, f2 + f16, f15, f2 + Math.min(f12, f14));
        }
        if (!z4) {
            this.f5822b.lineTo(f + f9, f2 + f10);
            f7 = f6;
        } else {
            float f23 = f + f9;
            float f24 = f8 / 100.0f;
            float f25 = f24 * 128.19f * min;
            this.f5822b.lineTo(f23, Math.max(f12, f10 - f25) + f2);
            float f26 = f2 + f10;
            float f27 = f24 * 83.62f * min2;
            float f28 = f24 * 4.64f;
            float f29 = f24 * 67.45f;
            float f30 = f24 * 13.36f;
            float f31 = f24 * 51.16f;
            this.f5822b.cubicTo(f23, f26 - f27, f23 - f28, f26 - f29, f23 - f30, f26 - f31);
            float f32 = f24 * 22.07f;
            float f33 = f24 * 34.86f;
            this.f5822b.cubicTo(f23 - f32, f26 - f33, f23 - f33, f26 - f32, f23 - f31, f26 - f30);
            f7 = f6;
            this.f5822b.cubicTo(f23 - f29, f26 - f28, f23 - f27, f26, f + Math.max(f7, f9 - f25), f26);
        }
        if (!z3) {
            this.f5822b.lineTo(f, f2 + f10);
        } else {
            float f34 = f8 / 100.0f;
            float f35 = f34 * 128.19f * min;
            float f36 = f2 + f10;
            this.f5822b.lineTo(Math.min(f7, f35) + f, f36);
            float f37 = f34 * 83.62f * min2;
            float f38 = f34 * 67.45f;
            float f39 = f34 * 4.64f;
            float f40 = f34 * 51.16f;
            float f41 = f34 * 13.36f;
            this.f5822b.cubicTo(f + f37, f36, f + f38, f36 - f39, f + f40, f36 - f41);
            float f42 = f34 * 34.86f;
            float f43 = f34 * 22.07f;
            this.f5822b.cubicTo(f + f42, f36 - f43, f + f43, f36 - f42, f + f41, f36 - f40);
            this.f5822b.cubicTo(f + f39, f36 - f38, f, f36 - f37, f, f2 + Math.max(f12, f10 - f35));
        }
        if (!z) {
            this.f5822b.lineTo(f, f2);
        } else {
            float f44 = f8 / 100.0f;
            float f45 = 128.19f * f44 * min;
            this.f5822b.lineTo(f, Math.min(f12, f45) + f2);
            float f46 = 83.62f * f44 * min2;
            float f47 = 4.64f * f44;
            float f48 = 67.45f * f44;
            float f49 = 13.36f * f44;
            float f50 = 51.16f * f44;
            this.f5822b.cubicTo(f, f2 + f46, f + f47, f2 + f48, f + f49, f2 + f50);
            float f51 = 22.07f * f44;
            float f52 = f44 * 34.86f;
            this.f5822b.cubicTo(f + f51, f2 + f52, f + f52, f2 + f51, f + f50, f2 + f49);
            this.f5822b.cubicTo(f + f48, f2 + f47, f + f46, f2, Math.min(f7, f45) + f, f2);
        }
        this.f5822b.close();
        return this.f5822b;
    }
}
