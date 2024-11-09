package androidx.appcompat.p008b.p009a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.resources.R;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.drawable.InterfaceC0547b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.b.a.a */
/* loaded from: classes.dex */
public class C0112a extends C0124m implements InterfaceC0547b {

    /* renamed from: a */
    private static final String f371a = "a";

    /* renamed from: b */
    private C0114c f372b;

    /* renamed from: c */
    private AbstractC0118g f373c;

    /* renamed from: d */
    private int f374d;

    /* renamed from: e */
    private int f375e;

    /* renamed from: f */
    private boolean f376f;

    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C0112a() {
        this(null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0112a(C0114c c0114c, Resources resources) {
        super((byte) 0);
        this.f374d = -1;
        this.f375e = -1;
        mo258a(new C0114c(c0114c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0112a m253a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C0112a c0112a = new C0112a();
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        c0112a.setVisible(m1540a.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        C0114c c0114c = c0112a.f372b;
        if (Build.VERSION.SDK_INT >= 21) {
            c0114c.f415f |= m1540a.getChangingConfigurations();
        }
        c0114c.f420k = m1540a.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, c0114c.f420k);
        c0114c.f423n = m1540a.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, c0114c.f423n);
        c0114c.f403C = m1540a.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, c0114c.f403C);
        c0114c.f404D = m1540a.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, c0114c.f404D);
        c0112a.setDither(m1540a.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, c0114c.f435z));
        c0112a.m276a(resources);
        m1540a.recycle();
        c0112a.m254b(context, resources, xmlPullParser, attributeSet, theme);
        c0112a.onStateChange(c0112a.getState());
        return c0112a;
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f373c != null && (visible || z2)) {
            if (z) {
                this.f373c.mo260a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f373c != null) {
            this.f373c.mo261b();
            this.f373c = null;
            m278a(this.f374d);
            this.f374d = -1;
            this.f375e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0098, code lost:            if (m278a(r0) == false) goto L38;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStateChange(int[] r11) {
        /*
            r10 = this;
            androidx.appcompat.b.a.c r0 = r10.f372b
            int r0 = r0.m266a(r11)
            int r1 = r10.m279c()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L9b
            androidx.appcompat.b.a.g r1 = r10.f373c
            if (r1 == 0) goto L33
            int r4 = r10.f374d
            if (r0 != r4) goto L19
        L16:
            r1 = r2
            goto L92
        L19:
            int r4 = r10.f375e
            if (r0 != r4) goto L2d
            boolean r4 = r1.mo270c()
            if (r4 == 0) goto L2d
            r1.mo271d()
            int r1 = r10.f375e
            r10.f374d = r1
            r10.f375e = r0
            goto L16
        L2d:
            int r4 = r10.f374d
            r1.mo261b()
            goto L37
        L33:
            int r4 = r10.m279c()
        L37:
            r1 = 0
            r10.f373c = r1
            r1 = -1
            r10.f375e = r1
            r10.f374d = r1
            androidx.appcompat.b.a.c r1 = r10.f372b
            int r5 = r1.m263a(r4)
            int r6 = r1.m263a(r0)
            if (r6 == 0) goto L91
            if (r5 != 0) goto L4e
            goto L91
        L4e:
            int r7 = r1.m264a(r5, r6)
            if (r7 >= 0) goto L55
            goto L91
        L55:
            boolean r8 = r1.m269c(r5, r6)
            r10.m278a(r7)
            android.graphics.drawable.Drawable r7 = r10.getCurrent()
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L70
            boolean r1 = r1.m268b(r5, r6)
            androidx.appcompat.b.a.e r5 = new androidx.appcompat.b.a.e
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r1, r8)
            goto L87
        L70:
            boolean r1 = r7 instanceof androidx.vectordrawable.p039a.p040a.C1071c
            if (r1 == 0) goto L7c
            androidx.appcompat.b.a.d r5 = new androidx.appcompat.b.a.d
            androidx.vectordrawable.a.a.c r7 = (androidx.vectordrawable.p039a.p040a.C1071c) r7
            r5.<init>(r7)
            goto L87
        L7c:
            boolean r1 = r7 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L91
            androidx.appcompat.b.a.b r5 = new androidx.appcompat.b.a.b
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L87:
            r5.mo260a()
            r10.f373c = r5
            r10.f375e = r4
            r10.f374d = r0
            goto L16
        L91:
            r1 = r3
        L92:
            if (r1 != 0) goto L9c
            boolean r0 = r10.m278a(r0)
            if (r0 == 0) goto L9b
            goto L9c
        L9b:
            r2 = r3
        L9c:
            android.graphics.drawable.Drawable r10 = r10.getCurrent()
            if (r10 == 0) goto La7
            boolean r10 = r10.setState(r11)
            r2 = r2 | r10
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0112a.onStateChange(int[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:            if (r9 == null) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:            r8 = r20.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0088, code lost:            if (r8 == 4) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:            if (r8 != 2) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:            if (r20.getName().equals("vector") == false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0098, code lost:            r9 = androidx.vectordrawable.p039a.p040a.C1081m.m3604a(r19, r20, r21, r22);     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:            if (android.os.Build.VERSION.SDK_INT < 21) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:            r9 = android.graphics.drawable.Drawable.createFromXmlInner(r19, r20, r21, r22);     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a8, code lost:            r9 = android.graphics.drawable.Drawable.createFromXmlInner(r19, r20, r21);     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r20.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c8, code lost:            if (r9 == null) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ca, code lost:            r8 = r17.f372b;        r9 = r8.m285a(r9);        r8.f439L[r9] = r3;        r8.f379b.m1071b(r9, java.lang.Integer.valueOf(r7));     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r20.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m254b(android.content.Context r18, android.content.res.Resources r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.content.res.Resources.Theme r22) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0112a.m254b(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:            if (r0 != 2) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:            if (r10.getName().equals("animated-vector") == false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:            r4 = androidx.vectordrawable.p039a.p040a.C1071c.m3585a(r8, r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:            if (android.os.Build.VERSION.SDK_INT < 21) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:            r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:            r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:            if (r4 == null) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:            if (r1 == (-1)) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:            if (r3 == (-1)) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:            return r7.f372b.m265a(r1, r3, r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:            if (r4 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:            r0 = r10.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:            if (r0 == 4) goto L31;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m255c(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = androidx.core.content.p020a.C0435o.m1540a(r9, r12, r11, r0)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.cc r5 = androidx.appcompat.widget.C0238cc.m886a()
            android.graphics.drawable.Drawable r4 = r5.m891a(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            if (r4 != 0) goto L77
        L31:
            int r0 = r10.next()
            r4 = 4
            if (r0 == r4) goto L31
            r4 = 2
            if (r0 != r4) goto L5c
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L4c
            androidx.vectordrawable.a.a.c r4 = androidx.vectordrawable.p039a.p040a.C1071c.m3585a(r8, r9, r10, r11, r12)
            goto L77
        L4c:
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r8 < r0) goto L57
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L77
        L57:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L77
        L5c:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L77:
            if (r4 == 0) goto L9f
            if (r1 == r2) goto L84
            if (r3 == r2) goto L84
            androidx.appcompat.b.a.c r7 = r7.f372b
            int r7 = r7.m265a(r1, r3, r4, r5)
            return r7
        L84:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L9f:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0112a.m255c(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f376f && super.mutate() == this) {
            this.f372b.mo267a();
            this.f376f = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0114c mo259b() {
        return new C0114c(this.f372b, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h
    public void clearMutated() {
        super.clearMutated();
        this.f376f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.p008b.p009a.C0124m, androidx.appcompat.p008b.p009a.C0119h
    /* renamed from: a */
    public final void mo258a(AbstractC0122k abstractC0122k) {
        super.mo258a(abstractC0122k);
        if (abstractC0122k instanceof C0114c) {
            this.f372b = (C0114c) abstractC0122k;
        }
    }
}
