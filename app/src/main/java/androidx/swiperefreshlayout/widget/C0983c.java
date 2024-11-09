package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.p023f.C0478i;
import androidx.p028d.p029a.p030a.C0597b;

/* compiled from: CircularProgressDrawable.java */
/* renamed from: androidx.swiperefreshlayout.widget.c */
/* loaded from: classes.dex */
public final class C0983c extends Drawable implements Animatable {

    /* renamed from: c */
    private static final Interpolator f4034c = new LinearInterpolator();

    /* renamed from: d */
    private static final Interpolator f4035d = new C0597b();

    /* renamed from: e */
    private static final int[] f4036e = {-16777216};

    /* renamed from: a */
    float f4037a;

    /* renamed from: b */
    boolean f4038b;

    /* renamed from: f */
    private final C0986f f4039f = new C0986f();

    /* renamed from: g */
    private float f4040g;

    /* renamed from: h */
    private Resources f4041h;

    /* renamed from: i */
    private Animator f4042i;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C0983c(Context context) {
        this.f4041h = ((Context) C0478i.m1620a(context)).getResources();
        this.f4039f.m3469a(f4036e);
        this.f4039f.m3466a(2.5f);
        invalidateSelf();
        C0986f c0986f = this.f4039f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0984d(this, c0986f));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4034c);
        ofFloat.addListener(new C0985e(this, c0986f));
        this.f4042i = ofFloat;
    }

    /* renamed from: a */
    private void m3456a(float f, float f2, float f3, float f4) {
        C0986f c0986f = this.f4039f;
        float f5 = this.f4041h.getDisplayMetrics().density;
        c0986f.m3466a(f2 * f5);
        c0986f.f4063q = f * f5;
        c0986f.m3467a(0);
        c0986f.f4064r = (int) (f3 * f5);
        c0986f.f4065s = (int) (f4 * f5);
    }

    /* renamed from: a */
    public final void m3460a(int i) {
        if (i == 0) {
            m3456a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m3456a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m3461a(boolean z) {
        this.f4039f.m3468a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m3458a(float f) {
        C0986f c0986f = this.f4039f;
        if (f != c0986f.f4062p) {
            c0986f.f4062p = f;
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m3463b(float f) {
        this.f4039f.f4051e = 0.0f;
        this.f4039f.f4052f = f;
        invalidateSelf();
    }

    /* renamed from: c */
    public final void m3464c(float f) {
        this.f4039f.f4053g = f;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m3462a(int... iArr) {
        this.f4039f.m3469a(iArr);
        this.f4039f.m3467a(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4040g, bounds.exactCenterX(), bounds.exactCenterY());
        C0986f c0986f = this.f4039f;
        RectF rectF = c0986f.f4047a;
        float f = c0986f.f4063q + (c0986f.f4054h / 2.0f);
        if (c0986f.f4063q <= 0.0f) {
            f = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c0986f.f4064r * c0986f.f4062p) / 2.0f, c0986f.f4054h / 2.0f);
        }
        rectF.set(bounds.centerX() - f, bounds.centerY() - f, bounds.centerX() + f, bounds.centerY() + f);
        float f2 = (c0986f.f4051e + c0986f.f4053g) * 360.0f;
        float f3 = ((c0986f.f4052f + c0986f.f4053g) * 360.0f) - f2;
        c0986f.f4048b.setColor(c0986f.f4067u);
        c0986f.f4048b.setAlpha(c0986f.f4066t);
        float f4 = c0986f.f4054h / 2.0f;
        rectF.inset(f4, f4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c0986f.f4050d);
        float f5 = -f4;
        rectF.inset(f5, f5);
        canvas.drawArc(rectF, f2, f3, false, c0986f.f4048b);
        if (c0986f.f4060n) {
            if (c0986f.f4061o == null) {
                c0986f.f4061o = new Path();
                c0986f.f4061o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                c0986f.f4061o.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f6 = (c0986f.f4064r * c0986f.f4062p) / 2.0f;
            c0986f.f4061o.moveTo(0.0f, 0.0f);
            c0986f.f4061o.lineTo(c0986f.f4064r * c0986f.f4062p, 0.0f);
            c0986f.f4061o.lineTo((c0986f.f4064r * c0986f.f4062p) / 2.0f, c0986f.f4065s * c0986f.f4062p);
            c0986f.f4061o.offset((min + rectF.centerX()) - f6, rectF.centerY() + (c0986f.f4054h / 2.0f));
            c0986f.f4061o.close();
            c0986f.f4049c.setColor(c0986f.f4067u);
            c0986f.f4049c.setAlpha(c0986f.f4066t);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c0986f.f4061o, c0986f.f4049c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f4039f.f4066t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4039f.f4066t;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4039f.f4048b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4042i.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4042i.cancel();
        this.f4039f.m3471c();
        if (this.f4039f.f4052f != this.f4039f.f4051e) {
            this.f4038b = true;
            this.f4042i.setDuration(666L);
            this.f4042i.start();
        } else {
            this.f4039f.m3467a(0);
            this.f4039f.m3472d();
            this.f4042i.setDuration(1332L);
            this.f4042i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4042i.cancel();
        this.f4040g = 0.0f;
        this.f4039f.m3468a(false);
        this.f4039f.m3467a(0);
        this.f4039f.m3472d();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3457a(float f, C0986f c0986f) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int m3470b = c0986f.m3470b();
            int i = c0986f.f4055i[c0986f.m3465a()];
            c0986f.f4067u = ((((m3470b >> 24) & 255) + ((int) ((((i >> 24) & 255) - r2) * f2))) << 24) | ((((m3470b >> 16) & 255) + ((int) ((((i >> 16) & 255) - r3) * f2))) << 16) | ((((m3470b >> 8) & 255) + ((int) ((((i >> 8) & 255) - r4) * f2))) << 8) | ((m3470b & 255) + ((int) (f2 * ((i & 255) - r0))));
            return;
        }
        c0986f.f4067u = c0986f.m3470b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3459a(float f, C0986f c0986f, boolean z) {
        float f2;
        float interpolation;
        if (this.f4038b) {
            m3457a(f, c0986f);
            float floor = (float) (Math.floor(c0986f.f4059m / 0.8f) + 1.0d);
            c0986f.f4051e = c0986f.f4057k + (((c0986f.f4058l - 0.01f) - c0986f.f4057k) * f);
            c0986f.f4052f = c0986f.f4058l;
            c0986f.f4053g = c0986f.f4059m + ((floor - c0986f.f4059m) * f);
            return;
        }
        if (f != 1.0f || z) {
            float f3 = c0986f.f4059m;
            if (f < 0.5f) {
                float f4 = c0986f.f4057k;
                f2 = (f4035d.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f4;
                interpolation = f4;
            } else {
                f2 = c0986f.f4057k + 0.79f;
                interpolation = f2 - (((1.0f - f4035d.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f5 = f3 + (0.20999998f * f);
            float f6 = (f + this.f4037a) * 216.0f;
            c0986f.f4051e = interpolation;
            c0986f.f4052f = f2;
            c0986f.f4053g = f5;
            this.f4040g = f6;
        }
    }
}
