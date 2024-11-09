package androidx.vectordrawable.p039a.p040a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.drawable.C0546a;
import androidx.p011b.C0318a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.c */
/* loaded from: classes.dex */
public final class C1071c extends AbstractC1080l implements InterfaceC1070b {

    /* renamed from: a */
    ArrayList<Object> f4271a;

    /* renamed from: b */
    final Drawable.Callback f4272b;

    /* renamed from: d */
    private C1073e f4273d;

    /* renamed from: e */
    private Context f4274e;

    /* renamed from: f */
    private ArgbEvaluator f4275f;

    /* renamed from: g */
    private Animator.AnimatorListener f4276g;

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1071c() {
        this(null, (byte) 0);
    }

    private C1071c(Context context) {
        this(context, (byte) 0);
    }

    private C1071c(Context context, byte b) {
        this.f4275f = null;
        this.f4276g = null;
        this.f4271a = null;
        this.f4272b = new C1072d(this);
        this.f4274e = context;
        this.f4273d = new C1073e();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f4288c != null) {
            this.f4288c.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static C1071c m3585a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1071c c1071c = new C1071c(context);
        c1071c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1071c;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4288c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1074f(this.f4288c.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        if (this.f4288c != null) {
            return this.f4288c.getChangingConfigurations();
        }
        return this.f4273d.f4278a | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f4288c != null) {
            this.f4288c.draw(canvas);
            return;
        }
        this.f4273d.f4279b.draw(canvas);
        if (this.f4273d.f4280c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        if (this.f4288c != null) {
            this.f4288c.setBounds(rect);
        } else {
            this.f4273d.f4279b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.f4288c != null) {
            return this.f4288c.setState(iArr);
        }
        return this.f4273d.f4279b.setState(iArr);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.f4288c != null) {
            return this.f4288c.setLevel(i);
        }
        return this.f4273d.f4279b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        if (this.f4288c != null) {
            return C0546a.m1928b(this.f4288c);
        }
        return this.f4273d.f4279b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4288c != null) {
            this.f4288c.setAlpha(i);
        } else {
            this.f4273d.f4279b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4288c != null) {
            this.f4288c.setColorFilter(colorFilter);
        } else {
            this.f4273d.f4279b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        if (this.f4288c != null) {
            return C0546a.m1931d(this.f4288c);
        }
        return this.f4273d.f4279b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTint(int i) {
        if (this.f4288c != null) {
            C0546a.m1920a(this.f4288c, i);
        } else {
            this.f4273d.f4279b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4288c != null) {
            C0546a.m1922a(this.f4288c, colorStateList);
        } else {
            this.f4273d.f4279b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4288c != null) {
            C0546a.m1925a(this.f4288c, mode);
        } else {
            this.f4273d.f4279b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f4288c != null) {
            return this.f4288c.setVisible(z, z2);
        }
        this.f4273d.f4279b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.f4288c != null) {
            return this.f4288c.isStateful();
        }
        return this.f4273d.f4279b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f4288c != null) {
            return this.f4288c.getOpacity();
        }
        return this.f4273d.f4279b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f4288c != null) {
            return this.f4288c.getIntrinsicWidth();
        }
        return this.f4273d.f4279b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f4288c != null) {
            return this.f4288c.getIntrinsicHeight();
        }
        return this.f4273d.f4279b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        if (this.f4288c != null) {
            return C0546a.m1927a(this.f4288c);
        }
        return this.f4273d.f4279b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.f4288c != null) {
            C0546a.m1926a(this.f4288c, z);
        } else {
            this.f4273d.f4279b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator m3588a;
        if (this.f4288c != null) {
            C0546a.m1924a(this.f4288c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4263e);
                    int resourceId = m1540a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1081m m3603a = C1081m.m3603a(resources, resourceId, theme);
                        m3603a.m3607a();
                        m3603a.setCallback(this.f4272b);
                        if (this.f4273d.f4279b != null) {
                            this.f4273d.f4279b.setCallback(null);
                        }
                        this.f4273d.f4279b = m3603a;
                    }
                    m1540a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1069a.f4264f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f4274e != null) {
                            Context context = this.f4274e;
                            if (Build.VERSION.SDK_INT >= 24) {
                                m3588a = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                m3588a = C1076h.m3588a(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            m3588a.setTarget(this.f4273d.f4279b.m3606a(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                m3586a(m3588a);
                            }
                            if (this.f4273d.f4281d == null) {
                                this.f4273d.f4281d = new ArrayList<>();
                                this.f4273d.f4282e = new C0318a<>();
                            }
                            this.f4273d.f4281d.add(m3588a);
                            this.f4273d.f4282e.put(m3588a, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C1073e c1073e = this.f4273d;
        if (c1073e.f4280c == null) {
            c1073e.f4280c = new AnimatorSet();
        }
        c1073e.f4280c.playTogether(c1073e.f4281d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        if (this.f4288c != null) {
            C0546a.m1923a(this.f4288c, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        if (this.f4288c != null) {
            return C0546a.m1930c(this.f4288c);
        }
        return false;
    }

    /* renamed from: a */
    private void m3586a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m3586a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4275f == null) {
                    this.f4275f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4275f);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.f4288c != null) {
            return ((AnimatedVectorDrawable) this.f4288c).isRunning();
        }
        return this.f4273d.f4280c.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f4288c != null) {
            ((AnimatedVectorDrawable) this.f4288c).start();
        } else {
            if (this.f4273d.f4280c.isStarted()) {
                return;
            }
            this.f4273d.f4280c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f4288c != null) {
            ((AnimatedVectorDrawable) this.f4288c).stop();
        } else {
            this.f4273d.f4280c.end();
        }
    }
}
