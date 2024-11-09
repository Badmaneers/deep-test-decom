package androidx.appcompat.view;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.MenuItemC0174u;
import androidx.appcompat.widget.C0218bj;
import androidx.appcompat.widget.C0276dn;
import androidx.core.p016a.p017a.InterfaceMenuItemC0401b;
import androidx.core.p024g.AbstractC0518c;
import java.lang.reflect.Constructor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportMenuInflater.java */
/* renamed from: androidx.appcompat.view.k */
/* loaded from: classes.dex */
public final class C0137k {

    /* renamed from: A */
    private String f471A;

    /* renamed from: B */
    private String f472B;

    /* renamed from: C */
    private CharSequence f473C;

    /* renamed from: D */
    private CharSequence f474D;

    /* renamed from: E */
    private ColorStateList f475E = null;

    /* renamed from: F */
    private PorterDuff.Mode f476F = null;

    /* renamed from: a */
    AbstractC0518c f477a;

    /* renamed from: b */
    final /* synthetic */ C0135i f478b;

    /* renamed from: c */
    private Menu f479c;

    /* renamed from: d */
    private int f480d;

    /* renamed from: e */
    private int f481e;

    /* renamed from: f */
    private int f482f;

    /* renamed from: g */
    private int f483g;

    /* renamed from: h */
    private boolean f484h;

    /* renamed from: i */
    private boolean f485i;

    /* renamed from: j */
    private boolean f486j;

    /* renamed from: k */
    private int f487k;

    /* renamed from: l */
    private int f488l;

    /* renamed from: m */
    private CharSequence f489m;

    /* renamed from: n */
    private CharSequence f490n;

    /* renamed from: o */
    private int f491o;

    /* renamed from: p */
    private char f492p;

    /* renamed from: q */
    private int f493q;

    /* renamed from: r */
    private char f494r;

    /* renamed from: s */
    private int f495s;

    /* renamed from: t */
    private int f496t;

    /* renamed from: u */
    private boolean f497u;

    /* renamed from: v */
    private boolean f498v;

    /* renamed from: w */
    private boolean f499w;

    /* renamed from: x */
    private int f500x;

    /* renamed from: y */
    private int f501y;

    /* renamed from: z */
    private String f502z;

    public C0137k(C0135i c0135i, Menu menu) {
        this.f478b = c0135i;
        this.f479c = menu;
        m322a();
    }

    /* renamed from: a */
    public final void m322a() {
        this.f480d = 0;
        this.f481e = 0;
        this.f482f = 0;
        this.f483g = 0;
        this.f484h = true;
        this.f485i = true;
    }

    /* renamed from: a */
    public final void m323a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f478b.f466e.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
        this.f480d = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
        this.f481e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
        this.f482f = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
        this.f483g = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
        this.f484h = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
        this.f485i = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m325b(AttributeSet attributeSet) {
        C0276dn m943a = C0276dn.m943a(this.f478b.f466e, attributeSet, R.styleable.MenuItem);
        this.f487k = m943a.m962g(R.styleable.MenuItem_android_id, 0);
        this.f488l = (m943a.m946a(R.styleable.MenuItem_android_menuCategory, this.f481e) & (-65536)) | (m943a.m946a(R.styleable.MenuItem_android_orderInCategory, this.f482f) & 65535);
        this.f489m = m943a.m954c(R.styleable.MenuItem_android_title);
        this.f490n = m943a.m954c(R.styleable.MenuItem_android_titleCondensed);
        this.f491o = m943a.m962g(R.styleable.MenuItem_android_icon, 0);
        this.f492p = m319a(m943a.m956d(R.styleable.MenuItem_android_alphabeticShortcut));
        this.f493q = m943a.m946a(R.styleable.MenuItem_alphabeticModifiers, 4096);
        this.f494r = m319a(m943a.m956d(R.styleable.MenuItem_android_numericShortcut));
        this.f495s = m943a.m946a(R.styleable.MenuItem_numericModifiers, 4096);
        if (m943a.m964i(R.styleable.MenuItem_android_checkable)) {
            this.f496t = m943a.m949a(R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
        } else {
            this.f496t = this.f483g;
        }
        this.f497u = m943a.m949a(R.styleable.MenuItem_android_checked, false);
        this.f498v = m943a.m949a(R.styleable.MenuItem_android_visible, this.f484h);
        this.f499w = m943a.m949a(R.styleable.MenuItem_android_enabled, this.f485i);
        this.f500x = m943a.m946a(R.styleable.MenuItem_showAsAction, -1);
        this.f472B = m943a.m956d(R.styleable.MenuItem_android_onClick);
        this.f501y = m943a.m962g(R.styleable.MenuItem_actionLayout, 0);
        this.f502z = m943a.m956d(R.styleable.MenuItem_actionViewClass);
        this.f471A = m943a.m956d(R.styleable.MenuItem_actionProviderClass);
        boolean z = this.f471A != null;
        if (z && this.f501y == 0 && this.f502z == null) {
            this.f477a = (AbstractC0518c) m320a(this.f471A, C0135i.f463b, this.f478b.f465d);
        } else {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f477a = null;
        }
        this.f473C = m943a.m954c(R.styleable.MenuItem_contentDescription);
        this.f474D = m943a.m954c(R.styleable.MenuItem_tooltipText);
        if (m943a.m964i(R.styleable.MenuItem_iconTintMode)) {
            this.f476F = C0218bj.m846a(m943a.m946a(R.styleable.MenuItem_iconTintMode, -1), this.f476F);
        } else {
            this.f476F = null;
        }
        if (m943a.m964i(R.styleable.MenuItem_iconTint)) {
            this.f475E = m943a.m960f(R.styleable.MenuItem_iconTint);
        } else {
            this.f475E = null;
        }
        m943a.m952b();
        this.f486j = false;
    }

    /* renamed from: a */
    private static char m319a(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    /* renamed from: a */
    private void m321a(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f497u).setVisible(this.f498v).setEnabled(this.f499w).setCheckable(this.f496t > 0).setTitleCondensed(this.f490n).setIcon(this.f491o);
        if (this.f500x >= 0) {
            menuItem.setShowAsAction(this.f500x);
        }
        if (this.f472B != null) {
            if (this.f478b.f466e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0136j(this.f478b.m318a(), this.f472B));
        }
        if (this.f496t >= 2) {
            if (menuItem instanceof C0172s) {
                ((C0172s) menuItem).m482a(true);
            } else if (menuItem instanceof MenuItemC0174u) {
                ((MenuItemC0174u) menuItem).m497b();
            }
        }
        if (this.f502z != null) {
            menuItem.setActionView((View) m320a(this.f502z, C0135i.f462a, this.f478b.f464c));
            z = true;
        }
        if (this.f501y > 0) {
            if (!z) {
                menuItem.setActionView(this.f501y);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.f477a != null) {
            AbstractC0518c abstractC0518c = this.f477a;
            if (menuItem instanceof InterfaceMenuItemC0401b) {
                ((InterfaceMenuItemC0401b) menuItem).mo349a(abstractC0518c);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f473C;
        boolean z2 = menuItem instanceof InterfaceMenuItemC0401b;
        if (z2) {
            ((InterfaceMenuItemC0401b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f474D;
        if (z2) {
            ((InterfaceMenuItemC0401b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f492p;
        int i = this.f493q;
        if (z2) {
            ((InterfaceMenuItemC0401b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
        char c2 = this.f494r;
        int i2 = this.f495s;
        if (z2) {
            ((InterfaceMenuItemC0401b) menuItem).setNumericShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i2);
        }
        if (this.f476F != null) {
            PorterDuff.Mode mode = this.f476F;
            if (z2) {
                ((InterfaceMenuItemC0401b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        if (this.f475E != null) {
            ColorStateList colorStateList = this.f475E;
            if (z2) {
                ((InterfaceMenuItemC0401b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* renamed from: b */
    public final void m324b() {
        this.f486j = true;
        m321a(this.f479c.add(this.f480d, this.f487k, this.f488l, this.f489m));
    }

    /* renamed from: c */
    public final SubMenu m326c() {
        this.f486j = true;
        SubMenu addSubMenu = this.f479c.addSubMenu(this.f480d, this.f487k, this.f488l, this.f489m);
        m321a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: d */
    public final boolean m327d() {
        return this.f486j;
    }

    /* renamed from: a */
    private <T> T m320a(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f478b.f466e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(String.valueOf(str)), e);
            return null;
        }
    }
}
