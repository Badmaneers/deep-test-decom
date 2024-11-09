package color.support.design.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.core.p024g.C0538w;

/* compiled from: DividerHelper.java */
/* renamed from: color.support.design.widget.q */
/* loaded from: classes.dex */
public final class C1188q {

    /* renamed from: a */
    public static final int f4830a = Color.argb(16, 0, 0, 0);

    /* renamed from: b */
    public static final int f4831b = Color.argb(16, 255, 255, 255);

    /* renamed from: c */
    private View f4832c;

    /* renamed from: d */
    private int f4833d;

    /* renamed from: e */
    private int f4834e;

    /* renamed from: f */
    private int f4835f;

    /* renamed from: g */
    private int f4836g;

    /* renamed from: h */
    private Paint f4837h;

    /* renamed from: i */
    private float f4838i;

    /* renamed from: j */
    private Point f4839j;

    /* renamed from: k */
    private Point f4840k;

    /* renamed from: l */
    private int f4841l;

    /* renamed from: m */
    private int f4842m;

    /* renamed from: n */
    private boolean f4843n;

    public C1188q(View view) {
        this.f4832c = view;
        float f = view.getContext().getResources().getDisplayMetrics().density;
        this.f4833d = Math.round(3.0f * f);
        this.f4834e = Math.round(1.0f * f);
        this.f4835f = this.f4833d;
        this.f4841l = f4830a;
        this.f4842m = f4831b;
        this.f4836g = Math.round(f * 24.0f);
        this.f4837h = new Paint();
        this.f4838i = 0.0f;
        this.f4839j = new Point();
        this.f4840k = new Point();
    }

    /* renamed from: a */
    public final void m3937a(Canvas canvas) {
        if (this.f4843n) {
            this.f4839j.x = Math.round(this.f4836g * (1.0f - this.f4838i));
            Rect rect = new Rect();
            this.f4832c.getLocalVisibleRect(rect);
            this.f4839j.y = rect.bottom - (this.f4835f / 2);
            this.f4840k.x = Math.round(this.f4832c.getMeasuredWidth() - (this.f4836g * (1.0f - this.f4838i)));
            this.f4840k.y = this.f4839j.y;
            this.f4837h.setStyle(Paint.Style.STROKE);
            this.f4837h.setStrokeWidth(this.f4835f);
            this.f4837h.setColor(this.f4842m);
            Path path = new Path();
            path.moveTo(this.f4832c.getLeft(), this.f4839j.y);
            path.lineTo(this.f4832c.getRight(), this.f4840k.y);
            canvas.drawPath(path, this.f4837h);
            Path path2 = new Path();
            this.f4837h.setColor(this.f4841l);
            path2.moveTo(this.f4839j.x, this.f4839j.y);
            path2.lineTo(this.f4840k.x, this.f4840k.y);
            canvas.drawPath(path2, this.f4837h);
        }
    }

    /* renamed from: a */
    public final void m3936a(int i) {
        this.f4841l = i;
    }

    /* renamed from: b */
    public final void m3940b(int i) {
        this.f4842m = i;
    }

    /* renamed from: c */
    public final void m3941c(int i) {
        this.f4833d = i;
    }

    /* renamed from: a */
    public final int m3935a() {
        return this.f4833d;
    }

    /* renamed from: d */
    public final void m3942d(int i) {
        this.f4834e = i;
    }

    /* renamed from: b */
    public final int m3939b() {
        return this.f4835f;
    }

    /* renamed from: a */
    public final void m3938a(boolean z) {
        this.f4843n = z;
        C0538w.m1874f(this.f4832c);
    }

    /* renamed from: e */
    public final void m3943e(int i) {
        this.f4836g = i;
    }

    /* renamed from: f */
    public final void m3944f(int i) {
        if (this.f4835f != i) {
            this.f4835f = i;
        }
    }
}
