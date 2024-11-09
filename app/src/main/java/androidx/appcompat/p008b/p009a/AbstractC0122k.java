package androidx.appcompat.p008b.p009a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* renamed from: androidx.appcompat.b.a.k */
/* loaded from: classes.dex */
public abstract class AbstractC0122k extends Drawable.ConstantState {

    /* renamed from: A */
    boolean f401A;

    /* renamed from: B */
    int f402B;

    /* renamed from: C */
    int f403C;

    /* renamed from: D */
    int f404D;

    /* renamed from: E */
    boolean f405E;

    /* renamed from: F */
    ColorFilter f406F;

    /* renamed from: G */
    boolean f407G;

    /* renamed from: H */
    ColorStateList f408H;

    /* renamed from: I */
    PorterDuff.Mode f409I;

    /* renamed from: J */
    boolean f410J;

    /* renamed from: K */
    boolean f411K;

    /* renamed from: c */
    final C0119h f412c;

    /* renamed from: d */
    Resources f413d;

    /* renamed from: e */
    int f414e;

    /* renamed from: f */
    int f415f;

    /* renamed from: g */
    int f416g;

    /* renamed from: h */
    SparseArray<Drawable.ConstantState> f417h;

    /* renamed from: i */
    Drawable[] f418i;

    /* renamed from: j */
    int f419j;

    /* renamed from: k */
    boolean f420k;

    /* renamed from: l */
    boolean f421l;

    /* renamed from: m */
    Rect f422m;

    /* renamed from: n */
    boolean f423n;

    /* renamed from: o */
    boolean f424o;

    /* renamed from: p */
    int f425p;

    /* renamed from: q */
    int f426q;

    /* renamed from: r */
    int f427r;

    /* renamed from: s */
    int f428s;

    /* renamed from: t */
    boolean f429t;

    /* renamed from: u */
    int f430u;

    /* renamed from: v */
    boolean f431v;

    /* renamed from: w */
    boolean f432w;

    /* renamed from: x */
    boolean f433x;

    /* renamed from: y */
    boolean f434y;

    /* renamed from: z */
    boolean f435z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0122k(AbstractC0122k abstractC0122k, C0119h c0119h, Resources resources) {
        Resources resources2;
        this.f414e = 160;
        this.f420k = false;
        this.f423n = false;
        this.f435z = true;
        this.f403C = 0;
        this.f404D = 0;
        this.f412c = c0119h;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = abstractC0122k != null ? abstractC0122k.f413d : null;
        }
        this.f413d = resources2;
        this.f414e = C0119h.m274a(resources, abstractC0122k != null ? abstractC0122k.f414e : 0);
        if (abstractC0122k != null) {
            this.f415f = abstractC0122k.f415f;
            this.f416g = abstractC0122k.f416g;
            this.f433x = true;
            this.f434y = true;
            this.f420k = abstractC0122k.f420k;
            this.f423n = abstractC0122k.f423n;
            this.f435z = abstractC0122k.f435z;
            this.f401A = abstractC0122k.f401A;
            this.f402B = abstractC0122k.f402B;
            this.f403C = abstractC0122k.f403C;
            this.f404D = abstractC0122k.f404D;
            this.f405E = abstractC0122k.f405E;
            this.f406F = abstractC0122k.f406F;
            this.f407G = abstractC0122k.f407G;
            this.f408H = abstractC0122k.f408H;
            this.f409I = abstractC0122k.f409I;
            this.f410J = abstractC0122k.f410J;
            this.f411K = abstractC0122k.f411K;
            if (abstractC0122k.f414e == this.f414e) {
                if (abstractC0122k.f421l) {
                    this.f422m = new Rect(abstractC0122k.f422m);
                    this.f421l = true;
                }
                if (abstractC0122k.f424o) {
                    this.f425p = abstractC0122k.f425p;
                    this.f426q = abstractC0122k.f426q;
                    this.f427r = abstractC0122k.f427r;
                    this.f428s = abstractC0122k.f428s;
                    this.f424o = true;
                }
            }
            if (abstractC0122k.f429t) {
                this.f430u = abstractC0122k.f430u;
                this.f429t = true;
            }
            if (abstractC0122k.f431v) {
                this.f432w = abstractC0122k.f432w;
                this.f431v = true;
            }
            Drawable[] drawableArr = abstractC0122k.f418i;
            this.f418i = new Drawable[drawableArr.length];
            this.f419j = abstractC0122k.f419j;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC0122k.f417h;
            if (sparseArray != null) {
                this.f417h = sparseArray.clone();
            } else {
                this.f417h = new SparseArray<>(this.f419j);
            }
            int i = this.f419j;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f417h.put(i2, constantState);
                    } else {
                        this.f418i[i2] = drawableArr[i2];
                    }
                }
            }
            return;
        }
        this.f418i = new Drawable[10];
        this.f419j = 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f416g | this.f415f;
    }

    /* renamed from: a */
    public final int m285a(Drawable drawable) {
        int i = this.f419j;
        if (i >= this.f418i.length) {
            mo292d(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f412c);
        this.f418i[i] = drawable;
        this.f419j++;
        this.f416g = drawable.getChangingConfigurations() | this.f416g;
        m289b();
        this.f422m = null;
        this.f421l = false;
        this.f424o = false;
        this.f433x = false;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m289b() {
        this.f429t = false;
        this.f431v = false;
    }

    /* renamed from: k */
    private void m283k() {
        if (this.f417h != null) {
            int size = this.f417h.size();
            for (int i = 0; i < size; i++) {
                this.f418i[this.f417h.keyAt(i)] = m282b(this.f417h.valueAt(i).newDrawable(this.f413d));
            }
            this.f417h = null;
        }
    }

    /* renamed from: b */
    private Drawable m282b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.setLayoutDirection(this.f402B);
        }
        Drawable mutate = drawable.mutate();
        mutate.setCallback(this.f412c);
        return mutate;
    }

    /* renamed from: b */
    public final Drawable m288b(int i) {
        int indexOfKey;
        Drawable drawable = this.f418i[i];
        if (drawable != null) {
            return drawable;
        }
        if (this.f417h == null || (indexOfKey = this.f417h.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable m282b = m282b(this.f417h.valueAt(indexOfKey).newDrawable(this.f413d));
        this.f418i[i] = m282b;
        this.f417h.removeAt(indexOfKey);
        if (this.f417h.size() == 0) {
            this.f417h = null;
        }
        return m282b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m287a(Resources resources) {
        if (resources != null) {
            this.f413d = resources;
            int m274a = C0119h.m274a(resources, this.f414e);
            int i = this.f414e;
            this.f414e = m274a;
            if (i != m274a) {
                this.f424o = false;
                this.f421l = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m286a(Resources.Theme theme) {
        if (theme != null) {
            m283k();
            int i = this.f419j;
            Drawable[] drawableArr = this.f418i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    this.f416g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            m287a(theme.getResources());
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = this.f417h.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo267a() {
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2] != null) {
                drawableArr[i2].mutate();
            }
        }
        this.f401A = true;
    }

    /* renamed from: c */
    public final Rect m290c() {
        if (this.f420k) {
            return null;
        }
        if (this.f422m != null || this.f421l) {
            return this.f422m;
        }
        m283k();
        Rect rect = new Rect();
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        Rect rect2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getPadding(rect)) {
                if (rect2 == null) {
                    rect2 = new Rect(0, 0, 0, 0);
                }
                if (rect.left > rect2.left) {
                    rect2.left = rect.left;
                }
                if (rect.top > rect2.top) {
                    rect2.top = rect.top;
                }
                if (rect.right > rect2.right) {
                    rect2.right = rect.right;
                }
                if (rect.bottom > rect2.bottom) {
                    rect2.bottom = rect.bottom;
                }
            }
        }
        this.f421l = true;
        this.f422m = rect2;
        return rect2;
    }

    /* renamed from: d */
    public final int m291d() {
        if (!this.f424o) {
            m284l();
        }
        return this.f425p;
    }

    /* renamed from: e */
    public final int m293e() {
        if (!this.f424o) {
            m284l();
        }
        return this.f426q;
    }

    /* renamed from: f */
    public final int m294f() {
        if (!this.f424o) {
            m284l();
        }
        return this.f427r;
    }

    /* renamed from: g */
    public final int m295g() {
        if (!this.f424o) {
            m284l();
        }
        return this.f428s;
    }

    /* renamed from: l */
    private void m284l() {
        this.f424o = true;
        m283k();
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        this.f426q = -1;
        this.f425p = -1;
        this.f428s = 0;
        this.f427r = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f425p) {
                this.f425p = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f426q) {
                this.f426q = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f427r) {
                this.f427r = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f428s) {
                this.f428s = minimumHeight;
            }
        }
    }

    /* renamed from: h */
    public final int m296h() {
        if (this.f429t) {
            return this.f430u;
        }
        m283k();
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.f430u = opacity;
        this.f429t = true;
        return opacity;
    }

    /* renamed from: i */
    public final boolean m297i() {
        if (this.f431v) {
            return this.f432w;
        }
        m283k();
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            }
            i2++;
        }
        this.f432w = z;
        this.f431v = true;
        return z;
    }

    /* renamed from: d */
    public void mo292d(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        System.arraycopy(this.f418i, 0, drawableArr, 0, i);
        this.f418i = drawableArr;
    }

    /* renamed from: j */
    public final synchronized boolean m298j() {
        if (this.f433x) {
            return this.f434y;
        }
        m283k();
        this.f433x = true;
        int i = this.f419j;
        Drawable[] drawableArr = this.f418i;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.f434y = false;
                return false;
            }
        }
        this.f434y = true;
        return true;
    }
}
