package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p016a.p017a.InterfaceMenuItemC0401b;
import androidx.core.p024g.AbstractC0518c;
import com.coloros.neton.BuildConfig;

/* compiled from: MenuItemImpl.java */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
public final class C0172s implements InterfaceMenuItemC0401b {

    /* renamed from: A */
    private View f707A;

    /* renamed from: B */
    private AbstractC0518c f708B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f709C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f711E;

    /* renamed from: a */
    C0168o f712a;

    /* renamed from: b */
    private final int f713b;

    /* renamed from: c */
    private final int f714c;

    /* renamed from: d */
    private final int f715d;

    /* renamed from: e */
    private final int f716e;

    /* renamed from: f */
    private CharSequence f717f;

    /* renamed from: g */
    private CharSequence f718g;

    /* renamed from: h */
    private Intent f719h;

    /* renamed from: i */
    private char f720i;

    /* renamed from: k */
    private char f722k;

    /* renamed from: m */
    private Drawable f724m;

    /* renamed from: o */
    private SubMenuC0153am f726o;

    /* renamed from: p */
    private Runnable f727p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f728q;

    /* renamed from: r */
    private CharSequence f729r;

    /* renamed from: s */
    private CharSequence f730s;

    /* renamed from: z */
    private int f737z;

    /* renamed from: j */
    private int f721j = 4096;

    /* renamed from: l */
    private int f723l = 4096;

    /* renamed from: n */
    private int f725n = 0;

    /* renamed from: t */
    private ColorStateList f731t = null;

    /* renamed from: u */
    private PorterDuff.Mode f732u = null;

    /* renamed from: v */
    private boolean f733v = false;

    /* renamed from: w */
    private boolean f734w = false;

    /* renamed from: x */
    private boolean f735x = false;

    /* renamed from: y */
    private int f736y = 16;

    /* renamed from: D */
    private boolean f710D = false;

    public C0172s(C0168o c0168o, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f737z = 0;
        this.f712a = c0168o;
        this.f713b = i2;
        this.f714c = i;
        this.f715d = i3;
        this.f716e = i4;
        this.f717f = charSequence;
        this.f737z = i5;
    }

    /* renamed from: b */
    public final boolean m484b() {
        if ((this.f728q != null && this.f728q.onMenuItemClick(this)) || this.f712a.mo396a(this.f712a, this)) {
            return true;
        }
        if (this.f727p != null) {
            this.f727p.run();
            return true;
        }
        if (this.f719h != null) {
            try {
                this.f712a.m462f().startActivity(this.f719h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f708B != null && this.f708B.mo500b();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f736y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f736y |= 16;
        } else {
            this.f736y &= -17;
        }
        this.f712a.mo458b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f714c;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f713b;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f715d;
    }

    /* renamed from: c */
    public final int m485c() {
        return this.f716e;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f719h;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f719h = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f722k;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f722k == c) {
            return this;
        }
        this.f722k = Character.toLowerCase(c);
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f722k == c && this.f723l == i) {
            return this;
        }
        this.f722k = Character.toLowerCase(c);
        this.f723l = KeyEvent.normalizeMetaState(i);
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f723l;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f720i;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f721j;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f720i == c) {
            return this;
        }
        this.f720i = c;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f720i == c && this.f721j == i) {
            return this;
        }
        this.f720i = c;
        this.f721j = KeyEvent.normalizeMetaState(i);
        this.f712a.mo458b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f720i = c;
        this.f722k = Character.toLowerCase(c2);
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f720i = c;
        this.f721j = KeyEvent.normalizeMetaState(i);
        this.f722k = Character.toLowerCase(c2);
        this.f723l = KeyEvent.normalizeMetaState(i2);
        this.f712a.mo458b(false);
        return this;
    }

    /* renamed from: k */
    private char m478k() {
        return this.f712a.mo401d() ? this.f722k : this.f720i;
    }

    /* renamed from: d */
    public final String m487d() {
        char m478k = m478k();
        if (m478k == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f712a.m462f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f712a.m462f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        int i = this.f712a.mo401d() ? this.f723l : this.f721j;
        m477a(sb, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        m477a(sb, i, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        m477a(sb, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        m477a(sb, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        m477a(sb, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        m477a(sb, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (m478k == '\b') {
            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        } else if (m478k == '\n') {
            sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
        } else if (m478k == ' ') {
            sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
        } else {
            sb.append(m478k);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m477a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    public final boolean m490e() {
        return this.f712a.mo402e() && m478k() != 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f726o;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f726o != null;
    }

    /* renamed from: a */
    public final void m481a(SubMenuC0153am subMenuC0153am) {
        this.f726o = subMenuC0153am;
        subMenuC0153am.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f717f;
    }

    /* renamed from: a */
    public final CharSequence m479a(InterfaceC0147ag interfaceC0147ag) {
        if (interfaceC0147ag.mo339a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f717f = charSequence;
        this.f712a.mo458b(false);
        if (this.f726o != null) {
            this.f726o.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.f712a.m462f().getString(i));
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f718g != null ? this.f718g : this.f717f;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f718g = charSequence;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        if (this.f724m != null) {
            return m475a(this.f724m);
        }
        if (this.f725n == 0) {
            return null;
        }
        Drawable m46b = C0057a.m46b(this.f712a.m462f(), this.f725n);
        this.f725n = 0;
        this.f724m = m46b;
        return m475a(m46b);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f725n = 0;
        this.f724m = drawable;
        this.f735x = true;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f724m = null;
        this.f725n = i;
        this.f735x = true;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f731t = colorStateList;
        this.f733v = true;
        this.f735x = true;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f731t;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f732u = mode;
        this.f734w = true;
        this.f735x = true;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f732u;
    }

    /* renamed from: a */
    private Drawable m475a(Drawable drawable) {
        if (drawable != null && this.f735x && (this.f733v || this.f734w)) {
            drawable = C0546a.m1933f(drawable).mutate();
            if (this.f733v) {
                C0546a.m1922a(drawable, this.f731t);
            }
            if (this.f734w) {
                C0546a.m1925a(drawable, this.f732u);
            }
            this.f735x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f736y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f736y;
        this.f736y = (z ? 1 : 0) | (this.f736y & (-2));
        if (i != this.f736y) {
            this.f712a.mo458b(false);
        }
        return this;
    }

    /* renamed from: a */
    public final void m482a(boolean z) {
        this.f736y = (z ? 4 : 0) | (this.f736y & (-5));
    }

    /* renamed from: f */
    public final boolean m491f() {
        return (this.f736y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f736y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f736y & 4) != 0) {
            this.f712a.m449a((MenuItem) this);
        } else {
            m483b(z);
        }
        return this;
    }

    /* renamed from: b */
    public final void m483b(boolean z) {
        int i = this.f736y;
        this.f736y = (z ? 2 : 0) | (this.f736y & (-3));
        if (i != this.f736y) {
            this.f712a.mo458b(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f708B == null || !this.f708B.mo504d()) ? (this.f736y & 8) == 0 : (this.f736y & 8) == 0 && this.f708B.mo505e();
    }

    /* renamed from: c */
    public final boolean m486c(boolean z) {
        int i = this.f736y;
        this.f736y = (z ? 0 : 8) | (this.f736y & (-9));
        return i != this.f736y;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (m486c(z)) {
            this.f712a.m466j();
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f728q = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        if (this.f717f != null) {
            return this.f717f.toString();
        }
        return null;
    }

    /* renamed from: a */
    public final void m480a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f711E = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f711E;
    }

    /* renamed from: g */
    public final boolean m492g() {
        return (this.f736y & 32) == 32;
    }

    /* renamed from: h */
    public final boolean m493h() {
        return (this.f737z & 1) == 1;
    }

    public final boolean requiresActionButton() {
        return (this.f737z & 2) == 2;
    }

    public final boolean requiresOverflow() {
        return (requiresActionButton() || m493h()) ? false : true;
    }

    /* renamed from: d */
    public final void m488d(boolean z) {
        if (z) {
            this.f736y |= 32;
        } else {
            this.f736y &= -33;
        }
    }

    /* renamed from: i */
    public final boolean m494i() {
        return (this.f737z & 4) == 4;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f737z = i;
                this.f712a.m467k();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    /* renamed from: a */
    public InterfaceMenuItemC0401b setActionView(View view) {
        this.f707A = view;
        this.f708B = null;
        if (view != null && view.getId() == -1 && this.f713b > 0) {
            view.setId(this.f713b);
        }
        this.f712a.m467k();
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final View getActionView() {
        if (this.f707A != null) {
            return this.f707A;
        }
        if (this.f708B == null) {
            return null;
        }
        this.f707A = this.f708B.mo502a(this);
        return this.f707A;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b
    /* renamed from: a */
    public final AbstractC0518c mo351a() {
        return this.f708B;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b
    /* renamed from: a */
    public final InterfaceMenuItemC0401b mo349a(AbstractC0518c abstractC0518c) {
        if (this.f708B != null) {
            this.f708B.m1776f();
        }
        this.f707A = null;
        this.f708B = abstractC0518c;
        this.f712a.mo458b(true);
        if (this.f708B != null) {
            this.f708B.mo503a(new C0173t(this));
        }
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!m495j()) {
            return false;
        }
        if (this.f709C == null || this.f709C.onMenuItemActionExpand(this)) {
            return this.f712a.mo397a(this);
        }
        return false;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f737z & 8) == 0) {
            return false;
        }
        if (this.f707A == null) {
            return true;
        }
        if (this.f709C == null || this.f709C.onMenuItemActionCollapse(this)) {
            return this.f712a.mo399b(this);
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m495j() {
        if ((this.f737z & 8) == 0) {
            return false;
        }
        if (this.f707A == null && this.f708B != null) {
            this.f707A = this.f708B.mo502a(this);
        }
        return this.f707A != null;
    }

    /* renamed from: e */
    public final void m489e(boolean z) {
        this.f710D = z;
        this.f712a.mo458b(false);
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f710D;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f709C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: a */
    public final InterfaceMenuItemC0401b setContentDescription(CharSequence charSequence) {
        this.f729r = charSequence;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f729r;
    }

    @Override // android.view.MenuItem
    /* renamed from: b */
    public final InterfaceMenuItemC0401b setTooltipText(CharSequence charSequence) {
        this.f730s = charSequence;
        this.f712a.mo458b(false);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f730s;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context m462f = this.f712a.m462f();
        setActionView(LayoutInflater.from(m462f).inflate(i, (ViewGroup) new LinearLayout(m462f), false));
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }
}
