package com.google.android.material.p081j;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0542a;

/* compiled from: ShadowRenderer.java */
/* renamed from: com.google.android.material.j.a */
/* loaded from: classes.dex */
public final class C2282a {

    /* renamed from: g */
    private static final int[] f10043g = new int[3];

    /* renamed from: h */
    private static final float[] f10044h = {0.0f, 0.5f, 1.0f};

    /* renamed from: i */
    private static final int[] f10045i = new int[4];

    /* renamed from: j */
    private static final float[] f10046j = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f10047a;

    /* renamed from: b */
    private final Paint f10048b;

    /* renamed from: c */
    private final Paint f10049c;

    /* renamed from: d */
    private int f10050d;

    /* renamed from: e */
    private int f10051e;

    /* renamed from: f */
    private int f10052f;

    /* renamed from: k */
    private final Path f10053k;

    /* renamed from: l */
    private Paint f10054l;

    public C2282a() {
        this((byte) 0);
    }

    private C2282a(byte b) {
        this.f10053k = new Path();
        this.f10054l = new Paint();
        this.f10047a = new Paint();
        m7222a(-16777216);
        this.f10054l.setColor(0);
        this.f10048b = new Paint(4);
        this.f10048b.setStyle(Paint.Style.FILL);
        this.f10049c = new Paint(this.f10048b);
    }

    /* renamed from: a */
    public final void m7222a(int i) {
        this.f10050d = C0542a.m1904b(i, 68);
        this.f10051e = C0542a.m1904b(i, 20);
        this.f10052f = C0542a.m1904b(i, 0);
        this.f10047a.setColor(this.f10050d);
    }

    /* renamed from: a */
    public final void m7223a(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        f10043g[0] = this.f10052f;
        f10043g[1] = this.f10051e;
        f10043g[2] = this.f10050d;
        this.f10049c.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, f10043g, f10044h, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f10049c);
        canvas.restore();
    }

    /* renamed from: a */
    public final void m7224a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f10053k;
        if (z) {
            f10045i[0] = 0;
            f10045i[1] = this.f10052f;
            f10045i[2] = this.f10051e;
            f10045i[3] = this.f10050d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            f10045i[0] = 0;
            f10045i[1] = this.f10050d;
            f10045i[2] = this.f10051e;
            f10045i[3] = this.f10052f;
        }
        float width = 1.0f - (i / (rectF.width() / 2.0f));
        f10046j[1] = width;
        f10046j[2] = ((1.0f - width) / 2.0f) + width;
        this.f10048b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f10045i, f10046j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f10054l);
        }
        canvas.drawArc(rectF, f, f2, true, this.f10048b);
        canvas.restore();
    }

    /* renamed from: a */
    public final Paint m7221a() {
        return this.f10047a;
    }
}
