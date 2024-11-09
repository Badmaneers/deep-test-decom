package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.p078g.C2217a;

/* compiled from: CircularRevealHelper.java */
/* renamed from: com.google.android.material.circularreveal.c */
/* loaded from: classes.dex */
public final class C2122c {

    /* renamed from: a */
    public static final int f9511a;

    /* renamed from: b */
    private final InterfaceC2123d f9512b;

    /* renamed from: c */
    private final View f9513c;

    /* renamed from: d */
    private final Path f9514d;

    /* renamed from: e */
    private final Paint f9515e;

    /* renamed from: f */
    private final Paint f9516f;

    /* renamed from: g */
    private C2128i f9517g;

    /* renamed from: h */
    private Drawable f9518h;

    /* renamed from: i */
    private boolean f9519i;

    /* renamed from: j */
    private boolean f9520j;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f9511a = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            f9511a = 1;
        } else {
            f9511a = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2122c(InterfaceC2123d interfaceC2123d) {
        this.f9512b = interfaceC2123d;
        this.f9513c = (View) interfaceC2123d;
        this.f9513c.setWillNotDraw(false);
        this.f9514d = new Path();
        this.f9515e = new Paint(7);
        this.f9516f = new Paint(1);
        this.f9516f.setColor(0);
    }

    /* renamed from: a */
    public final void m6777a() {
        if (f9511a == 0) {
            this.f9519i = true;
            this.f9520j = false;
            this.f9513c.buildDrawingCache();
            Bitmap drawingCache = this.f9513c.getDrawingCache();
            if (drawingCache == null && this.f9513c.getWidth() != 0 && this.f9513c.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f9513c.getWidth(), this.f9513c.getHeight(), Bitmap.Config.ARGB_8888);
                this.f9513c.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f9515e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f9519i = false;
            this.f9520j = true;
        }
    }

    /* renamed from: b */
    public final void m6782b() {
        if (f9511a == 0) {
            this.f9520j = false;
            this.f9513c.destroyDrawingCache();
            this.f9515e.setShader(null);
            this.f9513c.invalidate();
        }
    }

    /* renamed from: a */
    public final void m6781a(C2128i c2128i) {
        if (c2128i == null) {
            this.f9517g = null;
        } else {
            if (this.f9517g == null) {
                this.f9517g = new C2128i(c2128i);
            } else {
                this.f9517g.m6787a(c2128i.f9527a, c2128i.f9528b, c2128i.f9529c);
            }
            if (c2128i.f9529c + 1.0E-4f >= m6774b(c2128i)) {
                this.f9517g.f9529c = Float.MAX_VALUE;
            }
        }
        if (f9511a == 1) {
            this.f9514d.rewind();
            if (this.f9517g != null) {
                this.f9514d.addCircle(this.f9517g.f9527a, this.f9517g.f9528b, this.f9517g.f9529c, Path.Direction.CW);
            }
        }
        this.f9513c.invalidate();
    }

    /* renamed from: c */
    public final C2128i m6783c() {
        if (this.f9517g == null) {
            return null;
        }
        C2128i c2128i = new C2128i(this.f9517g);
        if (c2128i.m6788a()) {
            c2128i.f9529c = m6774b(c2128i);
        }
        return c2128i;
    }

    /* renamed from: a */
    public final void m6778a(int i) {
        this.f9516f.setColor(i);
        this.f9513c.invalidate();
    }

    /* renamed from: d */
    public final int m6784d() {
        return this.f9516f.getColor();
    }

    /* renamed from: e */
    public final Drawable m6785e() {
        return this.f9518h;
    }

    /* renamed from: a */
    public final void m6780a(Drawable drawable) {
        this.f9518h = drawable;
        this.f9513c.invalidate();
    }

    /* renamed from: b */
    private float m6774b(C2128i c2128i) {
        return C2217a.m7036a(c2128i.f9527a, c2128i.f9528b, this.f9513c.getWidth(), this.f9513c.getHeight());
    }

    /* renamed from: a */
    public final void m6779a(Canvas canvas) {
        if (m6775g()) {
            switch (f9511a) {
                case 0:
                    canvas.drawCircle(this.f9517g.f9527a, this.f9517g.f9528b, this.f9517g.f9529c, this.f9515e);
                    if (m6776h()) {
                        canvas.drawCircle(this.f9517g.f9527a, this.f9517g.f9528b, this.f9517g.f9529c, this.f9516f);
                        break;
                    }
                    break;
                case 1:
                    int save = canvas.save();
                    canvas.clipPath(this.f9514d);
                    this.f9512b.mo6769a(canvas);
                    if (m6776h()) {
                        canvas.drawRect(0.0f, 0.0f, this.f9513c.getWidth(), this.f9513c.getHeight(), this.f9516f);
                    }
                    canvas.restoreToCount(save);
                    break;
                case 2:
                    this.f9512b.mo6769a(canvas);
                    if (m6776h()) {
                        canvas.drawRect(0.0f, 0.0f, this.f9513c.getWidth(), this.f9513c.getHeight(), this.f9516f);
                        break;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unsupported strategy " + f9511a);
            }
        } else {
            this.f9512b.mo6769a(canvas);
            if (m6776h()) {
                canvas.drawRect(0.0f, 0.0f, this.f9513c.getWidth(), this.f9513c.getHeight(), this.f9516f);
            }
        }
        if ((this.f9519i || this.f9518h == null || this.f9517g == null) ? false : true) {
            Rect bounds = this.f9518h.getBounds();
            float width = this.f9517g.f9527a - (bounds.width() / 2.0f);
            float height = this.f9517g.f9528b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f9518h.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: f */
    public final boolean m6786f() {
        return this.f9512b.mo6771c() && !m6775g();
    }

    /* renamed from: g */
    private boolean m6775g() {
        boolean z = this.f9517g == null || this.f9517g.m6788a();
        return f9511a == 0 ? !z && this.f9520j : !z;
    }

    /* renamed from: h */
    private boolean m6776h() {
        return (this.f9519i || Color.alpha(this.f9516f.getColor()) == 0) ? false : true;
    }
}
