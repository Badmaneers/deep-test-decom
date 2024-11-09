package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14.java */
/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
public class C0549d extends Drawable implements Drawable.Callback, InterfaceC0547b, InterfaceC0548c {

    /* renamed from: a */
    static final PorterDuff.Mode f2413a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0551f f2414b;

    /* renamed from: c */
    Drawable f2415c;

    /* renamed from: d */
    private int f2416d;

    /* renamed from: e */
    private PorterDuff.Mode f2417e;

    /* renamed from: f */
    private boolean f2418f;

    /* renamed from: g */
    private boolean f2419g;

    /* renamed from: b */
    protected boolean mo1940b() {
        return true;
    }

    public C0549d(C0551f c0551f, Resources resources) {
        this.f2414b = c0551f;
        if (this.f2414b == null || this.f2414b.f2422b == null) {
            return;
        }
        mo1937a(this.f2414b.f2422b.newDrawable(resources));
    }

    public C0549d(Drawable drawable) {
        this.f2414b = m1939c();
        mo1937a(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2415c.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2415c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f2415c != null) {
            this.f2415c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f2415c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f2415c.getChangingConfigurations() | super.getChangingConfigurations() | (this.f2414b != null ? this.f2414b.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2415c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2415c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2415c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2415c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1940b() || this.f2414b == null) ? null : this.f2414b.f2423c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2415c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1938a(iArr) || this.f2415c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2415c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2415c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2415c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2415c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2415c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2415c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2415c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2415c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2415c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2415c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f2415c.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2415c.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2414b == null) {
            return null;
        }
        if (!(this.f2414b.f2422b != null)) {
            return null;
        }
        this.f2414b.f2421a = getChangingConfigurations();
        return this.f2414b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2419g && super.mutate() == this) {
            this.f2414b = m1939c();
            if (this.f2415c != null) {
                this.f2415c.mutate();
            }
            if (this.f2414b != null) {
                this.f2414b.f2422b = this.f2415c != null ? this.f2415c.getConstantState() : null;
            }
            this.f2419g = true;
        }
        return this;
    }

    /* renamed from: c */
    private C0551f m1939c() {
        return new C0551f(this.f2414b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f2415c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTintList(ColorStateList colorStateList) {
        this.f2414b.f2423c = colorStateList;
        m1938a(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2414b.f2424d = mode;
        m1938a(getState());
    }

    /* renamed from: a */
    private boolean m1938a(int[] iArr) {
        if (!mo1940b()) {
            return false;
        }
        ColorStateList colorStateList = this.f2414b.f2423c;
        PorterDuff.Mode mode = this.f2414b.f2424d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2418f || colorForState != this.f2416d || mode != this.f2417e) {
                setColorFilter(colorForState, mode);
                this.f2416d = colorForState;
                this.f2417e = mode;
                this.f2418f = true;
                return true;
            }
        } else {
            this.f2418f = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0548c
    /* renamed from: a */
    public final Drawable mo1936a() {
        return this.f2415c;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0548c
    /* renamed from: a */
    public final void mo1937a(Drawable drawable) {
        if (this.f2415c != null) {
            this.f2415c.setCallback(null);
        }
        this.f2415c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f2414b != null) {
                this.f2414b.f2422b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
