package androidx.vectordrawable.p039a.p040a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.p020a.C0421a;
import androidx.core.content.p020a.C0431k;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.drawable.C0546a;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.m */
/* loaded from: classes.dex */
public final class C1081m extends AbstractC1080l {

    /* renamed from: a */
    static final PorterDuff.Mode f4289a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private C1088t f4290b;

    /* renamed from: d */
    private PorterDuffColorFilter f4291d;

    /* renamed from: e */
    private ColorFilter f4292e;

    /* renamed from: f */
    private boolean f4293f;

    /* renamed from: g */
    private boolean f4294g;

    /* renamed from: h */
    private Drawable.ConstantState f4295h;

    /* renamed from: i */
    private final float[] f4296i;

    /* renamed from: j */
    private final Matrix f4297j;

    /* renamed from: k */
    private final Rect f4298k;

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

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

    public C1081m() {
        this.f4294g = true;
        this.f4296i = new float[9];
        this.f4297j = new Matrix();
        this.f4298k = new Rect();
        this.f4290b = new C1088t();
    }

    public C1081m(C1088t c1088t) {
        this.f4294g = true;
        this.f4296i = new float[9];
        this.f4297j = new Matrix();
        this.f4298k = new Rect();
        this.f4290b = c1088t;
        this.f4291d = m3602a(c1088t.f4347c, c1088t.f4348d);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f4288c != null) {
            this.f4288c.mutate();
            return this;
        }
        if (!this.f4293f && super.mutate() == this) {
            this.f4290b = new C1088t(this.f4290b);
            this.f4293f = true;
        }
        return this;
    }

    /* renamed from: a */
    public final Object m3606a(String str) {
        return this.f4290b.f4346b.f4339k.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4288c != null && Build.VERSION.SDK_INT >= 24) {
            return new C1089u(this.f4288c.getConstantState());
        }
        this.f4290b.f4345a = getChangingConfigurations();
        return this.f4290b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:            if ((r1 == r6.f4350f.getWidth() && r3 == r6.f4350f.getHeight()) == false) goto L121;     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.p039a.p040a.C1081m.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        if (this.f4288c != null) {
            return C0546a.m1928b(this.f4288c);
        }
        return this.f4290b.f4346b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4288c != null) {
            this.f4288c.setAlpha(i);
        } else if (this.f4290b.f4346b.getRootAlpha() != i) {
            this.f4290b.f4346b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4288c != null) {
            this.f4288c.setColorFilter(colorFilter);
        } else {
            this.f4292e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        if (this.f4288c != null) {
            return C0546a.m1931d(this.f4288c);
        }
        return this.f4292e;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m3602a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTint(int i) {
        if (this.f4288c != null) {
            C0546a.m1920a(this.f4288c, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4288c != null) {
            C0546a.m1922a(this.f4288c, colorStateList);
            return;
        }
        C1088t c1088t = this.f4290b;
        if (c1088t.f4347c != colorStateList) {
            c1088t.f4347c = colorStateList;
            this.f4291d = m3602a(colorStateList, c1088t.f4348d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4288c != null) {
            C0546a.m1925a(this.f4288c, mode);
            return;
        }
        C1088t c1088t = this.f4290b;
        if (c1088t.f4348d != mode) {
            c1088t.f4348d = mode;
            this.f4291d = m3602a(c1088t.f4347c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.f4288c != null) {
            return this.f4288c.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        if (this.f4290b == null) {
            return false;
        }
        if (this.f4290b.f4346b.m3618a()) {
            return true;
        }
        return this.f4290b.f4347c != null && this.f4290b.f4347c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.f4288c != null) {
            return this.f4288c.setState(iArr);
        }
        boolean z = false;
        C1088t c1088t = this.f4290b;
        if (c1088t.f4347c != null && c1088t.f4348d != null) {
            this.f4291d = m3602a(c1088t.f4347c, c1088t.f4348d);
            invalidateSelf();
            z = true;
        }
        if (!c1088t.f4346b.m3618a()) {
            return z;
        }
        boolean mo3611a = c1088t.f4346b.f4331c.mo3611a(iArr);
        c1088t.f4355k |= mo3611a;
        if (!mo3611a) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f4288c != null) {
            return this.f4288c.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f4288c != null) {
            return this.f4288c.getIntrinsicWidth();
        }
        return (int) this.f4290b.f4346b.f4332d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f4288c != null) {
            return this.f4288c.getIntrinsicHeight();
        }
        return (int) this.f4290b.f4346b.f4333e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        if (this.f4288c == null) {
            return false;
        }
        C0546a.m1930c(this.f4288c);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        if (this.f4288c != null) {
            return C0546a.m1927a(this.f4288c);
        }
        return this.f4290b.f4349e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.f4288c != null) {
            C0546a.m1926a(this.f4288c, z);
        } else {
            this.f4290b.f4349e = z;
        }
    }

    /* renamed from: a */
    public static C1081m m3603a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1081m c1081m = new C1081m();
            c1081m.f4288c = C0431k.m1529a(resources, i, theme);
            c1081m.f4295h = new C1089u(c1081m.f4288c.getConstantState());
            return c1081m;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m3604a(resources, xml, asAttributeSet, theme);
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static C1081m m3604a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1081m c1081m = new C1081m();
        c1081m.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1081m;
    }

    /* renamed from: a */
    public static int m3601a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f4288c != null) {
            this.f4288c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        if (this.f4288c != null) {
            C0546a.m1924a(this.f4288c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1088t c1088t = this.f4290b;
        c1088t.f4346b = new C1087s();
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4259a);
        C1088t c1088t2 = this.f4290b;
        C1087s c1087s = c1088t2.f4346b;
        int m1539a = C0435o.m1539a(m1540a, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (m1539a == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (m1539a == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (m1539a == 9) {
            mode = PorterDuff.Mode.SRC_ATOP;
        } else {
            switch (m1539a) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        }
        c1088t2.f4348d = mode;
        if (C0435o.m1544a(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            m1540a.getValue(1, typedValue);
            if (typedValue.type == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(String.valueOf(typedValue)));
            }
            if (typedValue.type < 28 || typedValue.type > 31) {
                colorStateList = C0421a.m1490a(m1540a.getResources(), m1540a.getResourceId(1, 0), theme);
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            c1088t2.f4347c = colorStateList;
        }
        boolean z = c1088t2.f4349e;
        if (C0435o.m1544a(xmlPullParser, "autoMirrored")) {
            z = m1540a.getBoolean(5, z);
        }
        c1088t2.f4349e = z;
        c1087s.f4334f = C0435o.m1534a(m1540a, xmlPullParser, "viewportWidth", 7, c1087s.f4334f);
        c1087s.f4335g = C0435o.m1534a(m1540a, xmlPullParser, "viewportHeight", 8, c1087s.f4335g);
        if (c1087s.f4334f <= 0.0f) {
            throw new XmlPullParserException(m1540a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (c1087s.f4335g <= 0.0f) {
            throw new XmlPullParserException(m1540a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c1087s.f4332d = m1540a.getDimension(3, c1087s.f4332d);
        c1087s.f4333e = m1540a.getDimension(2, c1087s.f4333e);
        if (c1087s.f4332d <= 0.0f) {
            throw new XmlPullParserException(m1540a.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (c1087s.f4333e <= 0.0f) {
            throw new XmlPullParserException(m1540a.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c1087s.setAlpha(C0435o.m1534a(m1540a, xmlPullParser, "alpha", 4, c1087s.getAlpha()));
        String string = m1540a.getString(0);
        if (string != null) {
            c1087s.f4337i = string;
            c1087s.f4339k.put(string, c1087s);
        }
        m1540a.recycle();
        c1088t.f4345a = getChangingConfigurations();
        c1088t.f4355k = true;
        m3605b(resources, xmlPullParser, attributeSet, theme);
        this.f4291d = m3602a(c1088t.f4347c, c1088t.f4348d);
    }

    /* renamed from: b */
    private void m3605b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1088t c1088t = this.f4290b;
        C1087s c1087s = c1088t.f4346b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1087s.f4331c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1084p c1084p = (C1084p) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1083o c1083o = new C1083o();
                    c1083o.m3610a(resources, attributeSet, theme, xmlPullParser);
                    c1084p.f4312b.add(c1083o);
                    if (c1083o.getPathName() != null) {
                        c1087s.f4339k.put(c1083o.getPathName(), c1083o);
                    }
                    z = false;
                    c1088t.f4345a = c1083o.f4327o | c1088t.f4345a;
                } else if ("clip-path".equals(name)) {
                    C1082n c1082n = new C1082n();
                    c1082n.m3608a(resources, attributeSet, theme, xmlPullParser);
                    c1084p.f4312b.add(c1082n);
                    if (c1082n.getPathName() != null) {
                        c1087s.f4339k.put(c1082n.getPathName(), c1082n);
                    }
                    c1088t.f4345a = c1082n.f4327o | c1088t.f4345a;
                } else if ("group".equals(name)) {
                    C1084p c1084p2 = new C1084p();
                    c1084p2.m3614a(resources, attributeSet, theme, xmlPullParser);
                    c1084p.f4312b.add(c1084p2);
                    arrayDeque.push(c1084p2);
                    if (c1084p2.getGroupName() != null) {
                        c1087s.f4339k.put(c1084p2.getGroupName(), c1084p2);
                    }
                    c1088t.f4345a = c1084p2.f4315e | c1088t.f4345a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    public final void m3607a() {
        this.f4294g = false;
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1080l, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        if (this.f4288c != null) {
            this.f4288c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        if (this.f4288c != null) {
            return this.f4288c.getChangingConfigurations();
        }
        return this.f4290b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f4288c != null) {
            this.f4288c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.f4288c != null) {
            this.f4288c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f4288c != null) {
            return this.f4288c.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        if (this.f4288c != null) {
            this.f4288c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
