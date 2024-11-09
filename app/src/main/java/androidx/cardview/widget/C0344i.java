package androidx.cardview.widget;

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

/* compiled from: RoundRectDrawable.java */
/* renamed from: androidx.cardview.widget.i */
/* loaded from: classes.dex */
final class C0344i extends Drawable {

    /* renamed from: a */
    private float f1544a;

    /* renamed from: c */
    private final RectF f1546c;

    /* renamed from: d */
    private final Rect f1547d;

    /* renamed from: e */
    private float f1548e;

    /* renamed from: h */
    private ColorStateList f1551h;

    /* renamed from: i */
    private PorterDuffColorFilter f1552i;

    /* renamed from: j */
    private ColorStateList f1553j;

    /* renamed from: f */
    private boolean f1549f = false;

    /* renamed from: g */
    private boolean f1550g = true;

    /* renamed from: k */
    private PorterDuff.Mode f1554k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f1545b = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0344i(ColorStateList colorStateList, float f) {
        this.f1544a = f;
        m1111b(colorStateList);
        this.f1546c = new RectF();
        this.f1547d = new Rect();
    }

    /* renamed from: b */
    private void m1111b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1551h = colorStateList;
        this.f1545b.setColor(this.f1551h.getColorForState(getState(), this.f1551h.getDefaultColor()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1114a(float f, boolean z, boolean z2) {
        if (f == this.f1548e && this.f1549f == z && this.f1550g == z2) {
            return;
        }
        this.f1548e = f;
        this.f1549f = z;
        this.f1550g = z2;
        m1110a((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m1112a() {
        return this.f1548e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1545b;
        if (this.f1552i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1552i);
            z = true;
        }
        canvas.drawRoundRect(this.f1546c, this.f1544a, this.f1544a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private void m1110a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1546c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1547d.set(rect);
        if (this.f1549f) {
            this.f1547d.inset((int) Math.ceil(C0345j.m1120b(this.f1548e, this.f1544a, this.f1550g)), (int) Math.ceil(C0345j.m1118a(this.f1548e, this.f1544a, this.f1550g)));
            this.f1546c.set(this.f1547d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1110a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1547d, this.f1544a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1113a(float f) {
        if (f == this.f1544a) {
            return;
        }
        this.f1544a = f;
        m1110a((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1545b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1545b.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    public final float m1116b() {
        return this.f1544a;
    }

    /* renamed from: a */
    public final void m1115a(ColorStateList colorStateList) {
        m1111b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: c */
    public final ColorStateList m1117c() {
        return this.f1551h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f1553j = colorStateList;
        this.f1552i = m1109a(this.f1553j, this.f1554k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1554k = mode;
        this.f1552i = m1109a(this.f1553j, this.f1554k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.f1551h.getColorForState(iArr, this.f1551h.getDefaultColor());
        boolean z = colorForState != this.f1545b.getColor();
        if (z) {
            this.f1545b.setColor(colorForState);
        }
        if (this.f1553j == null || this.f1554k == null) {
            return z;
        }
        this.f1552i = m1109a(this.f1553j, this.f1554k);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.f1553j == null || !this.f1553j.isStateful()) {
            return (this.f1551h != null && this.f1551h.isStateful()) || super.isStateful();
        }
        return true;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1109a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
