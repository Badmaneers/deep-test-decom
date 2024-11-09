package androidx.cardview.widget;

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
import androidx.cardview.R;

/* compiled from: RoundRectDrawableWithShadow.java */
/* renamed from: androidx.cardview.widget.j */
/* loaded from: classes.dex */
final class C0345j extends Drawable {

    /* renamed from: a */
    static InterfaceC0346k f1555a;

    /* renamed from: b */
    private static final double f1556b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final int f1557c;

    /* renamed from: e */
    private Paint f1559e;

    /* renamed from: f */
    private Paint f1560f;

    /* renamed from: g */
    private final RectF f1561g;

    /* renamed from: h */
    private float f1562h;

    /* renamed from: i */
    private Path f1563i;

    /* renamed from: j */
    private float f1564j;

    /* renamed from: k */
    private float f1565k;

    /* renamed from: l */
    private float f1566l;

    /* renamed from: m */
    private ColorStateList f1567m;

    /* renamed from: o */
    private final int f1569o;

    /* renamed from: p */
    private final int f1570p;

    /* renamed from: n */
    private boolean f1568n = true;

    /* renamed from: q */
    private boolean f1571q = true;

    /* renamed from: r */
    private boolean f1572r = false;

    /* renamed from: d */
    private Paint f1558d = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0345j(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1569o = resources.getColor(R.color.cardview_shadow_start_color);
        this.f1570p = resources.getColor(R.color.cardview_shadow_end_color);
        this.f1557c = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        m1121b(colorStateList);
        this.f1559e = new Paint(5);
        this.f1559e.setStyle(Paint.Style.FILL);
        this.f1562h = (int) (f + 0.5f);
        this.f1561g = new RectF();
        this.f1560f = new Paint(this.f1559e);
        this.f1560f.setAntiAlias(false);
        m1119a(f2, f3);
    }

    /* renamed from: b */
    private void m1121b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1567m = colorStateList;
        this.f1558d.setColor(this.f1567m.getColorForState(getState(), this.f1567m.getDefaultColor()));
    }

    /* renamed from: d */
    private static int m1122d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1126a(boolean z) {
        this.f1571q = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1558d.setAlpha(i);
        this.f1559e.setAlpha(i);
        this.f1560f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1568n = true;
    }

    /* renamed from: a */
    private void m1119a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float m1122d = m1122d(f);
        float m1122d2 = m1122d(f2);
        if (m1122d > m1122d2) {
            if (!this.f1572r) {
                this.f1572r = true;
            }
            m1122d = m1122d2;
        }
        if (this.f1566l == m1122d && this.f1564j == m1122d2) {
            return;
        }
        this.f1566l = m1122d;
        this.f1564j = m1122d2;
        this.f1565k = (int) ((m1122d * 1.5f) + this.f1557c + 0.5f);
        this.f1568n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m1118a(this.f1564j, this.f1562h, this.f1571q));
        int ceil2 = (int) Math.ceil(m1120b(this.f1564j, this.f1562h, this.f1571q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m1118a(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f1556b) * f2)) : f * 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m1120b(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f1556b) * f2)) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.f1567m.getColorForState(iArr, this.f1567m.getDefaultColor());
        if (this.f1558d.getColor() == colorForState) {
            return false;
        }
        this.f1558d.setColor(colorForState);
        this.f1568n = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.f1567m != null && this.f1567m.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1558d.setColorFilter(colorFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1124a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f1562h == f2) {
            return;
        }
        this.f1562h = f2;
        this.f1568n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.f1568n) {
            Rect bounds = getBounds();
            float f = this.f1564j * 1.5f;
            this.f1561g.set(bounds.left + this.f1564j, bounds.top + f, bounds.right - this.f1564j, bounds.bottom - f);
            RectF rectF = new RectF(-this.f1562h, -this.f1562h, this.f1562h, this.f1562h);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f1565k, -this.f1565k);
            if (this.f1563i == null) {
                this.f1563i = new Path();
            } else {
                this.f1563i.reset();
            }
            this.f1563i.setFillType(Path.FillType.EVEN_ODD);
            this.f1563i.moveTo(-this.f1562h, 0.0f);
            this.f1563i.rLineTo(-this.f1565k, 0.0f);
            this.f1563i.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1563i.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1563i.close();
            this.f1559e.setShader(new RadialGradient(0.0f, 0.0f, this.f1562h + this.f1565k, new int[]{this.f1569o, this.f1569o, this.f1570p}, new float[]{0.0f, this.f1562h / (this.f1562h + this.f1565k), 1.0f}, Shader.TileMode.CLAMP));
            this.f1560f.setShader(new LinearGradient(0.0f, (-this.f1562h) + this.f1565k, 0.0f, (-this.f1562h) - this.f1565k, new int[]{this.f1569o, this.f1569o, this.f1570p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1560f.setAntiAlias(false);
            this.f1568n = false;
        }
        canvas.translate(0.0f, this.f1566l / 2.0f);
        float f2 = (-this.f1562h) - this.f1565k;
        float f3 = this.f1562h + this.f1557c + (this.f1566l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1561g.width() - f4 > 0.0f;
        boolean z2 = this.f1561g.height() - f4 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.f1561g.left + f3, this.f1561g.top + f3);
        canvas.drawPath(this.f1563i, this.f1559e);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f2, this.f1561g.width() - f4, -this.f1562h, this.f1560f);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        canvas.translate(this.f1561g.right - f3, this.f1561g.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1563i, this.f1559e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1561g.width() - f4, (-this.f1562h) + this.f1565k, this.f1560f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f1561g.left + f3, this.f1561g.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1563i, this.f1559e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1561g.height() - f4, -this.f1562h, this.f1560f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f1561g.right - f3, this.f1561g.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1563i, this.f1559e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1561g.height() - f4, -this.f1562h, this.f1560f);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1566l) / 2.0f);
        f1555a.mo1092a(canvas, this.f1561g, this.f1562h, this.f1558d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m1123a() {
        return this.f1562h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m1128b(float f) {
        m1119a(f, this.f1564j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m1130c(float f) {
        m1119a(this.f1566l, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final float m1127b() {
        return this.f1566l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final float m1129c() {
        return this.f1564j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final float m1131d() {
        return (Math.max(this.f1564j, this.f1562h + this.f1557c + (this.f1564j / 2.0f)) * 2.0f) + ((this.f1564j + this.f1557c) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final float m1132e() {
        return (Math.max(this.f1564j, this.f1562h + this.f1557c + ((this.f1564j * 1.5f) / 2.0f)) * 2.0f) + (((this.f1564j * 1.5f) + this.f1557c) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1125a(ColorStateList colorStateList) {
        m1121b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final ColorStateList m1133f() {
        return this.f1567m;
    }
}
