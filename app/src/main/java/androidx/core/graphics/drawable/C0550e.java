package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
public final class C0550e extends C0549d {

    /* renamed from: d */
    private static Method f2420d;

    public C0550e(Drawable drawable) {
        super(drawable);
        m1941c();
    }

    public C0550e(C0551f c0551f, Resources resources) {
        super(c0551f, resources);
        m1941c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f2415c.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2415c.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f2415c.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f2415c.getDirtyBounds();
    }

    @Override // androidx.core.graphics.drawable.C0549d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintList(ColorStateList colorStateList) {
        if (mo1940b()) {
            super.setTintList(colorStateList);
        } else {
            this.f2415c.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0549d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTint(int i) {
        if (mo1940b()) {
            super.setTint(i);
        } else {
            this.f2415c.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0549d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo1940b()) {
            super.setTintMode(mode);
        } else {
            this.f2415c.setTintMode(mode);
        }
    }

    @Override // androidx.core.graphics.drawable.C0549d, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0549d
    /* renamed from: b */
    protected final boolean mo1940b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2415c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        if (this.f2415c != null && f2420d != null) {
            try {
                return ((Boolean) f2420d.invoke(this.f2415c, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m1941c() {
        if (f2420d == null) {
            try {
                f2420d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
