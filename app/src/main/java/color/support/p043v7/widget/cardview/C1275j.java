package color.support.p043v7.widget.cardview;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import color.support.p043v7.appcompat.R;

/* compiled from: RoundRectDrawableWithShadow.java */
/* renamed from: color.support.v7.widget.cardview.j */
/* loaded from: classes.dex */
final class C1275j extends Drawable {

    /* renamed from: a */
    static InterfaceC1276k f5388a;

    /* renamed from: b */
    private static final double f5389b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final int f5390c;

    /* renamed from: e */
    private Paint f5392e;

    /* renamed from: f */
    private Paint f5393f;

    /* renamed from: g */
    private final RectF f5394g;

    /* renamed from: h */
    private float f5395h;

    /* renamed from: i */
    private Path f5396i;

    /* renamed from: j */
    private float f5397j;

    /* renamed from: k */
    private float f5398k;

    /* renamed from: l */
    private float f5399l;

    /* renamed from: m */
    private ColorStateList f5400m;

    /* renamed from: o */
    private final int f5402o;

    /* renamed from: p */
    private final int f5403p;

    /* renamed from: n */
    private boolean f5401n = true;

    /* renamed from: q */
    private boolean f5404q = true;

    /* renamed from: r */
    private boolean f5405r = false;

    /* renamed from: d */
    private Paint f5391d = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1275j(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f5402o = resources.getColor(R.color.cardview_shadow_start_color);
        this.f5403p = resources.getColor(R.color.cardview_shadow_end_color);
        this.f5390c = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        m4186b(colorStateList);
        this.f5392e = new Paint(5);
        this.f5392e.setStyle(Paint.Style.FILL);
        this.f5395h = (int) (f + 0.5f);
        this.f5394g = new RectF();
        this.f5393f = new Paint(this.f5392e);
        this.f5393f.setAntiAlias(false);
        m4184a(f2, f3);
    }

    /* renamed from: b */
    private void m4186b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5400m = colorStateList;
        this.f5391d.setColor(this.f5400m.getColorForState(getState(), this.f5400m.getDefaultColor()));
    }

    /* renamed from: d */
    private static int m4187d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4191a(boolean z) {
        this.f5404q = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5391d.setAlpha(i);
        this.f5392e.setAlpha(i);
        this.f5393f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5401n = true;
    }

    /* renamed from: a */
    private void m4184a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float m4187d = m4187d(f);
        float m4187d2 = m4187d(f2);
        if (m4187d > m4187d2) {
            if (!this.f5405r) {
                this.f5405r = true;
            }
            m4187d = m4187d2;
        }
        if (this.f5399l == m4187d && this.f5397j == m4187d2) {
            return;
        }
        this.f5399l = m4187d;
        this.f5397j = m4187d2;
        this.f5398k = (int) ((m4187d * 1.5f) + this.f5390c + 0.5f);
        this.f5401n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m4183a(this.f5397j, this.f5395h, this.f5404q));
        int ceil2 = (int) Math.ceil(m4185b(this.f5397j, this.f5395h, this.f5404q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m4183a(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f5389b) * f2)) : f * 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m4185b(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f5389b) * f2)) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.f5400m.getColorForState(iArr, this.f5400m.getDefaultColor());
        if (this.f5391d.getColor() == colorForState) {
            return false;
        }
        this.f5391d.setColor(colorForState);
        this.f5401n = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.f5400m != null && this.f5400m.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5391d.setColorFilter(colorFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4189a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f5395h == f2) {
            return;
        }
        this.f5395h = f2;
        this.f5401n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.f5401n) {
            Rect bounds = getBounds();
            float f = this.f5397j * 1.5f;
            this.f5394g.set(bounds.left + this.f5397j, bounds.top + f, bounds.right - this.f5397j, bounds.bottom - f);
            RectF rectF = new RectF(-this.f5395h, -this.f5395h, this.f5395h, this.f5395h);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f5398k, -this.f5398k);
            if (this.f5396i == null) {
                this.f5396i = new Path();
            } else {
                this.f5396i.reset();
            }
            this.f5396i.setFillType(Path.FillType.EVEN_ODD);
            this.f5396i.moveTo(-this.f5395h, 0.0f);
            this.f5396i.rLineTo(-this.f5398k, 0.0f);
            this.f5396i.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f5396i.arcTo(rectF, 270.0f, -90.0f, false);
            this.f5396i.close();
            this.f5392e.setShader(new RadialGradient(0.0f, 0.0f, this.f5395h + this.f5398k, new int[]{this.f5402o, this.f5402o, this.f5403p}, new float[]{0.0f, this.f5395h / (this.f5395h + this.f5398k), 1.0f}, Shader.TileMode.CLAMP));
            this.f5393f.setShader(new LinearGradient(0.0f, (-this.f5395h) + this.f5398k, 0.0f, (-this.f5395h) - this.f5398k, new int[]{this.f5402o, this.f5402o, this.f5403p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f5393f.setAntiAlias(false);
            this.f5401n = false;
        }
        canvas.translate(0.0f, this.f5399l / 2.0f);
        float f2 = (-this.f5395h) - this.f5398k;
        float f3 = this.f5395h + this.f5390c + (this.f5399l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f5394g.width() - f4 > 0.0f;
        boolean z2 = this.f5394g.height() - f4 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.f5394g.left + f3, this.f5394g.top + f3);
        canvas.drawPath(this.f5396i, this.f5392e);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f2, this.f5394g.width() - f4, -this.f5395h, this.f5393f);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        canvas.translate(this.f5394g.right - f3, this.f5394g.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f5396i, this.f5392e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f5394g.width() - f4, (-this.f5395h) + this.f5398k, this.f5393f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f5394g.left + f3, this.f5394g.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f5396i, this.f5392e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f5394g.height() - f4, -this.f5395h, this.f5393f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f5394g.right - f3, this.f5394g.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f5396i, this.f5392e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f5394g.height() - f4, -this.f5395h, this.f5393f);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f5399l) / 2.0f);
        f5388a.mo4149a(canvas, this.f5394g, this.f5395h, this.f5391d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m4188a() {
        return this.f5395h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m4193b(float f) {
        m4184a(f, this.f5397j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m4195c(float f) {
        m4184a(this.f5399l, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final float m4192b() {
        return this.f5399l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final float m4194c() {
        return this.f5397j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final float m4196d() {
        return (Math.max(this.f5397j, this.f5395h + this.f5390c + (this.f5397j / 2.0f)) * 2.0f) + ((this.f5397j + this.f5390c) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final float m4197e() {
        return (Math.max(this.f5397j, this.f5395h + this.f5390c + ((this.f5397j * 1.5f) / 2.0f)) * 2.0f) + (((this.f5397j * 1.5f) + this.f5390c) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4190a(ColorStateList colorStateList) {
        m4186b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final ColorStateList m4198f() {
        return this.f5400m;
    }
}
