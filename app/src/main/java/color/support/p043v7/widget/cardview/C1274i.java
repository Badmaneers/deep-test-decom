package color.support.p043v7.widget.cardview;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.color.support.util.C1344i;

/* compiled from: RoundRectDrawable.java */
/* renamed from: color.support.v7.widget.cardview.i */
/* loaded from: classes.dex */
final class C1274i extends Drawable {

    /* renamed from: a */
    private float f5377a;

    /* renamed from: c */
    private final RectF f5379c;

    /* renamed from: d */
    private final Rect f5380d;

    /* renamed from: e */
    private float f5381e;

    /* renamed from: h */
    private ColorStateList f5384h;

    /* renamed from: i */
    private PorterDuffColorFilter f5385i;

    /* renamed from: j */
    private ColorStateList f5386j;

    /* renamed from: f */
    private boolean f5382f = false;

    /* renamed from: g */
    private boolean f5383g = true;

    /* renamed from: k */
    private PorterDuff.Mode f5387k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f5378b = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1274i(ColorStateList colorStateList, float f) {
        this.f5377a = f;
        m4176b(colorStateList);
        this.f5379c = new RectF();
        this.f5380d = new Rect();
    }

    /* renamed from: b */
    private void m4176b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5384h = colorStateList;
        this.f5378b.setColor(this.f5384h.getColorForState(getState(), this.f5384h.getDefaultColor()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4179a(float f, boolean z, boolean z2) {
        if (f == this.f5381e && this.f5382f == z && this.f5383g == z2) {
            return;
        }
        this.f5381e = f;
        this.f5382f = z;
        this.f5383g = z2;
        m4175a((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m4177a() {
        return this.f5381e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5378b;
        if (this.f5385i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5385i);
            z = true;
        }
        canvas.drawPath(C1344i.m4397a().m4400a(this.f5379c, this.f5377a), this.f5378b);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private void m4175a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f5379c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f5380d.set(rect);
        if (this.f5382f) {
            this.f5380d.inset((int) Math.ceil(C1275j.m4185b(this.f5381e, this.f5377a, this.f5383g)), (int) Math.ceil(C1275j.m4183a(this.f5381e, this.f5377a, this.f5383g)));
            this.f5379c.set(this.f5380d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4175a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5380d, this.f5377a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4178a(float f) {
        if (f == this.f5377a) {
            return;
        }
        this.f5377a = f;
        m4175a((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5378b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5378b.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    public final float m4181b() {
        return this.f5377a;
    }

    /* renamed from: a */
    public final void m4180a(ColorStateList colorStateList) {
        m4176b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: c */
    public final ColorStateList m4182c() {
        return this.f5384h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5386j = colorStateList;
        this.f5385i = m4174a(this.f5386j, this.f5387k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5387k = mode;
        this.f5385i = m4174a(this.f5386j, this.f5387k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.f5384h.getColorForState(iArr, this.f5384h.getDefaultColor());
        boolean z = colorForState != this.f5378b.getColor();
        if (z) {
            this.f5378b.setColor(colorForState);
        }
        if (this.f5386j == null || this.f5387k == null) {
            return z;
        }
        this.f5385i = m4174a(this.f5386j, this.f5387k);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.f5386j == null || !this.f5386j.isStateful()) {
            return (this.f5384h != null && this.f5384h.isStateful()) || super.isStateful();
        }
        return true;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m4174a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
