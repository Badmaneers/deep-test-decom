package androidx.appcompat.p008b.p009a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.graphics.drawable.C0546a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* renamed from: androidx.appcompat.b.a.h */
/* loaded from: classes.dex */
public class C0119h extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private AbstractC0122k f386a;

    /* renamed from: b */
    private Rect f387b;

    /* renamed from: c */
    private Drawable f388c;

    /* renamed from: d */
    private Drawable f389d;

    /* renamed from: f */
    private boolean f391f;

    /* renamed from: i */
    private boolean f394i;

    /* renamed from: j */
    private Runnable f395j;

    /* renamed from: k */
    private long f396k;

    /* renamed from: l */
    private long f397l;

    /* renamed from: m */
    private C0121j f398m;

    /* renamed from: e */
    private int f390e = 255;

    /* renamed from: g */
    private int f392g = -1;

    /* renamed from: h */
    private int f393h = -1;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f388c != null) {
            this.f388c.draw(canvas);
        }
        if (this.f389d != null) {
            this.f389d.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f386a.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m290c = this.f386a.m290c();
        boolean z = false;
        if (m290c != null) {
            rect.set(m290c);
            padding = (m290c.right | ((m290c.left | m290c.top) | m290c.bottom)) != 0;
        } else if (this.f388c != null) {
            padding = this.f388c.getPadding(rect);
        } else {
            padding = super.getPadding(rect);
        }
        if (isAutoMirrored() && C0546a.m1935h(this) == 1) {
            z = true;
        }
        if (z) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f388c != null) {
            this.f388c.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f391f && this.f390e == i) {
            return;
        }
        this.f391f = true;
        this.f390e = i;
        if (this.f388c != null) {
            if (this.f396k == 0) {
                this.f388c.setAlpha(i);
            } else {
                m277a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f390e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.f386a.f435z != z) {
            this.f386a.f435z = z;
            if (this.f388c != null) {
                this.f388c.setDither(this.f386a.f435z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f386a.f407G = true;
        if (this.f386a.f406F != colorFilter) {
            this.f386a.f406F = colorFilter;
            if (this.f388c != null) {
                this.f388c.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTintList(ColorStateList colorStateList) {
        this.f386a.f410J = true;
        if (this.f386a.f408H != colorStateList) {
            this.f386a.f408H = colorStateList;
            C0546a.m1922a(this.f388c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f386a.f411K = true;
        if (this.f386a.f409I != mode) {
            this.f386a.f409I = mode;
            C0546a.m1925a(this.f388c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f389d != null) {
            this.f389d.setBounds(rect);
        }
        if (this.f388c != null) {
            this.f388c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f386a.m297i();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f386a.f405E != z) {
            this.f386a.f405E = z;
            if (this.f388c != null) {
                C0546a.m1926a(this.f388c, this.f386a.f405E);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f386a.f405E;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        if (this.f389d != null) {
            this.f389d.jumpToCurrentState();
            this.f389d = null;
            this.f393h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f388c != null) {
            this.f388c.jumpToCurrentState();
            if (this.f391f) {
                this.f388c.setAlpha(this.f390e);
            }
        }
        if (this.f397l != 0) {
            this.f397l = 0L;
            z = true;
        }
        if (this.f396k != 0) {
            this.f396k = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.f388c != null) {
            C0546a.m1919a(this.f388c, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f387b == null) {
            this.f387b = new Rect(i, i2, i3, i4);
        } else {
            this.f387b.set(i, i2, i3, i4);
        }
        if (this.f388c != null) {
            C0546a.m1921a(this.f388c, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        if (this.f387b != null) {
            rect.set(this.f387b);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f389d != null) {
            return this.f389d.setState(iArr);
        }
        if (this.f388c != null) {
            return this.f388c.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f389d != null) {
            return this.f389d.setLevel(i);
        }
        if (this.f388c != null) {
            return this.f388c.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        AbstractC0122k abstractC0122k = this.f386a;
        int i2 = this.f392g;
        int i3 = abstractC0122k.f419j;
        Drawable[] drawableArr = abstractC0122k.f418i;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        abstractC0122k.f402B = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f386a.f423n) {
            return this.f386a.m291d();
        }
        if (this.f388c != null) {
            return this.f388c.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f386a.f423n) {
            return this.f386a.m293e();
        }
        if (this.f388c != null) {
            return this.f388c.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f386a.f423n) {
            return this.f386a.m294f();
        }
        if (this.f388c != null) {
            return this.f388c.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f386a.f423n) {
            return this.f386a.m295g();
        }
        if (this.f388c != null) {
            return this.f388c.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f386a != null) {
            this.f386a.m289b();
        }
        if (drawable != this.f388c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f388c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f388c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f389d != null) {
            this.f389d.setVisible(z, z2);
        }
        if (this.f388c != null) {
            this.f388c.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f388c == null || !this.f388c.isVisible()) {
            return -2;
        }
        return this.f386a.m296h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m279c() {
        return this.f392g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m278a(int i) {
        if (i == this.f392g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f386a.f404D > 0) {
            if (this.f389d != null) {
                this.f389d.setVisible(false, false);
            }
            if (this.f388c != null) {
                this.f389d = this.f388c;
                this.f393h = this.f392g;
                this.f397l = this.f386a.f404D + uptimeMillis;
            } else {
                this.f389d = null;
                this.f393h = -1;
                this.f397l = 0L;
            }
        } else if (this.f388c != null) {
            this.f388c.setVisible(false, false);
        }
        if (i >= 0 && i < this.f386a.f419j) {
            Drawable m288b = this.f386a.m288b(i);
            this.f388c = m288b;
            this.f392g = i;
            if (m288b != null) {
                if (this.f386a.f403C > 0) {
                    this.f396k = uptimeMillis + this.f386a.f403C;
                }
                m275a(m288b);
            }
        } else {
            this.f388c = null;
            this.f392g = -1;
        }
        if (this.f396k != 0 || this.f397l != 0) {
            if (this.f395j == null) {
                this.f395j = new RunnableC0120i(this);
            } else {
                unscheduleSelf(this.f395j);
            }
            m277a(true);
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: a */
    private void m275a(Drawable drawable) {
        if (this.f398m == null) {
            this.f398m = new C0121j();
        }
        drawable.setCallback(this.f398m.m281a(drawable.getCallback()));
        try {
            if (this.f386a.f403C <= 0 && this.f391f) {
                drawable.setAlpha(this.f390e);
            }
            if (this.f386a.f407G) {
                drawable.setColorFilter(this.f386a.f406F);
            } else {
                if (this.f386a.f410J) {
                    C0546a.m1922a(drawable, this.f386a.f408H);
                }
                if (this.f386a.f411K) {
                    C0546a.m1925a(drawable, this.f386a.f409I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f386a.f435z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f386a.f405E);
            }
            Rect rect = this.f387b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f398m.m280a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m277a(boolean r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f391f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r11.f388c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L3c
            long r9 = r11.f396k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L3e
            long r9 = r11.f396k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L24
            android.graphics.drawable.Drawable r3 = r11.f388c
            int r9 = r11.f390e
            r3.setAlpha(r9)
            goto L3c
        L24:
            long r9 = r11.f396k
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            androidx.appcompat.b.a.k r9 = r11.f386a
            int r9 = r9.f403C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r11.f388c
            int r3 = 255 - r3
            int r10 = r11.f390e
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = r0
            goto L3f
        L3c:
            r11.f396k = r7
        L3e:
            r3 = r6
        L3f:
            android.graphics.drawable.Drawable r9 = r11.f389d
            if (r9 == 0) goto L70
            long r9 = r11.f397l
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L72
            long r9 = r11.f397l
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L5b
            android.graphics.drawable.Drawable r0 = r11.f389d
            r0.setVisible(r6, r6)
            r0 = 0
            r11.f389d = r0
            r0 = -1
            r11.f393h = r0
            goto L70
        L5b:
            long r6 = r11.f397l
            long r6 = r6 - r1
            long r6 = r6 * r4
            int r3 = (int) r6
            androidx.appcompat.b.a.k r4 = r11.f386a
            int r4 = r4.f404D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r11.f389d
            int r5 = r11.f390e
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L73
        L70:
            r11.f397l = r7
        L72:
            r0 = r3
        L73:
            if (r12 == 0) goto L7f
            if (r0 == 0) goto L7f
            java.lang.Runnable r12 = r11.f395j
            r3 = 16
            long r1 = r1 + r3
            r11.scheduleSelf(r12, r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0119h.m277a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f388c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m276a(Resources resources) {
        this.f386a.m287a(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f386a.m286a(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f386a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f386a.m298j()) {
            return null;
        }
        this.f386a.f415f = getChangingConfigurations();
        return this.f386a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f394i && super.mutate() == this) {
            AbstractC0122k mo259b = mo259b();
            mo259b.mo267a();
            mo258a(mo259b);
            this.f394i = true;
        }
        return this;
    }

    /* renamed from: b */
    AbstractC0122k mo259b() {
        return this.f386a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearMutated() {
        this.f386a.f401A = false;
        this.f394i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo258a(AbstractC0122k abstractC0122k) {
        this.f386a = abstractC0122k;
        if (this.f392g >= 0) {
            this.f388c = abstractC0122k.m288b(this.f392g);
            if (this.f388c != null) {
                m275a(this.f388c);
            }
        }
        this.f393h = -1;
        this.f389d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m274a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}
