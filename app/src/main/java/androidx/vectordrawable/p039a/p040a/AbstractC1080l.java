package androidx.vectordrawable.p039a.p040a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.graphics.drawable.InterfaceC0547b;

/* compiled from: VectorDrawableCommon.java */
/* renamed from: androidx.vectordrawable.a.a.l */
/* loaded from: classes.dex */
abstract class AbstractC1080l extends Drawable implements InterfaceC0547b {

    /* renamed from: c */
    Drawable f4288c;

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f4288c != null) {
            this.f4288c.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f4288c != null) {
            return this.f4288c.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f4288c != null) {
            this.f4288c.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.f4288c != null) {
            C0546a.m1919a(this.f4288c, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f4288c != null) {
            C0546a.m1921a(this.f4288c, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.f4288c != null) {
            this.f4288c.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (this.f4288c != null) {
            this.f4288c.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f4288c != null) {
            C0546a.m1923a(this.f4288c, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.f4288c != null) {
            this.f4288c.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        if (this.f4288c != null) {
            return this.f4288c.getCurrent();
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f4288c != null) {
            return this.f4288c.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f4288c != null) {
            return this.f4288c.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f4288c != null) {
            return this.f4288c.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        if (this.f4288c != null) {
            return this.f4288c.getState();
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        if (this.f4288c != null) {
            return this.f4288c.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.f4288c != null) {
            this.f4288c.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (this.f4288c != null) {
            return this.f4288c.setState(iArr);
        }
        return super.setState(iArr);
    }
}
