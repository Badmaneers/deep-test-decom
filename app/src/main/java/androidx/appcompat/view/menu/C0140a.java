package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p016a.p017a.InterfaceMenuItemC0401b;
import androidx.core.p024g.AbstractC0518c;

/* compiled from: ActionMenuItem.java */
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public final class C0140a implements InterfaceMenuItemC0401b {

    /* renamed from: e */
    private CharSequence f548e;

    /* renamed from: f */
    private CharSequence f549f;

    /* renamed from: g */
    private Intent f550g;

    /* renamed from: h */
    private char f551h;

    /* renamed from: j */
    private char f553j;

    /* renamed from: l */
    private Drawable f555l;

    /* renamed from: n */
    private Context f557n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f558o;

    /* renamed from: p */
    private CharSequence f559p;

    /* renamed from: q */
    private CharSequence f560q;

    /* renamed from: i */
    private int f552i = 4096;

    /* renamed from: k */
    private int f554k = 4096;

    /* renamed from: m */
    private int f556m = 0;

    /* renamed from: r */
    private ColorStateList f561r = null;

    /* renamed from: s */
    private PorterDuff.Mode f562s = null;

    /* renamed from: t */
    private boolean f563t = false;

    /* renamed from: u */
    private boolean f564u = false;

    /* renamed from: v */
    private int f565v = 16;

    /* renamed from: a */
    private final int f544a = R.id.home;

    /* renamed from: b */
    private final int f545b = 0;

    /* renamed from: c */
    private final int f546c = 0;

    /* renamed from: d */
    private final int f547d = 0;

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b
    /* renamed from: a */
    public final AbstractC0518c mo351a() {
        return null;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean requiresActionButton() {
        return true;
    }

    public final boolean requiresOverflow() {
        return false;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    public C0140a(Context context, CharSequence charSequence) {
        this.f557n = context;
        this.f548e = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f553j;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f554k;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f545b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f555l;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f550g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f544a;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f551h;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f552i;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f547d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f548e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f549f != null ? this.f549f : this.f548e;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f565v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f565v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f565v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f565v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f553j = Character.toLowerCase(c);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f553j = Character.toLowerCase(c);
        this.f554k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f565v = (z ? 1 : 0) | (this.f565v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f565v = (z ? 2 : 0) | (this.f565v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f565v = (z ? 16 : 0) | (this.f565v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f555l = drawable;
        this.f556m = 0;
        m348b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f556m = i;
        this.f555l = C0420a.m1483a(this.f557n, i);
        m348b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f550g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f551h = c;
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f551h = c;
        this.f552i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f558o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f551h = c;
        this.f553j = Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f551h = c;
        this.f552i = KeyEvent.normalizeMetaState(i);
        this.f553j = Character.toLowerCase(c2);
        this.f554k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f548e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f548e = this.f557n.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f549f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f565v = (this.f565v & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b
    /* renamed from: a */
    public final InterfaceMenuItemC0401b mo349a(AbstractC0518c abstractC0518c) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b
    /* renamed from: a */
    public final InterfaceMenuItemC0401b setContentDescription(CharSequence charSequence) {
        this.f559p = charSequence;
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f559p;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b
    /* renamed from: b */
    public final InterfaceMenuItemC0401b setTooltipText(CharSequence charSequence) {
        this.f560q = charSequence;
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f560q;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f561r = colorStateList;
        this.f563t = true;
        m348b();
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f561r;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f562s = mode;
        this.f564u = true;
        m348b();
        return this;
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f562s;
    }

    /* renamed from: b */
    private void m348b() {
        if (this.f555l != null) {
            if (this.f563t || this.f564u) {
                this.f555l = C0546a.m1933f(this.f555l);
                this.f555l = this.f555l.mutate();
                if (this.f563t) {
                    C0546a.m1922a(this.f555l, this.f561r);
                }
                if (this.f564u) {
                    C0546a.m1925a(this.f555l, this.f562s);
                }
            }
        }
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p016a.p017a.InterfaceMenuItemC0401b, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f560q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f559p = charSequence;
        return this;
    }
}
