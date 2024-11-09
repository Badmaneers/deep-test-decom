package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0420a;
import androidx.core.p016a.p017a.InterfaceMenuC0400a;
import androidx.core.p024g.AbstractC0518c;
import androidx.core.p024g.C0505af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class C0168o implements InterfaceMenuC0400a {

    /* renamed from: d */
    private static final int[] f676d = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f677A;

    /* renamed from: a */
    CharSequence f678a;

    /* renamed from: b */
    Drawable f679b;

    /* renamed from: c */
    View f680c;

    /* renamed from: e */
    private final Context f681e;

    /* renamed from: f */
    private final Resources f682f;

    /* renamed from: g */
    private boolean f683g;

    /* renamed from: h */
    private boolean f684h;

    /* renamed from: i */
    private InterfaceC0169p f685i;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f693q;

    /* renamed from: y */
    private C0172s f701y;

    /* renamed from: p */
    private int f692p = 0;

    /* renamed from: r */
    private boolean f694r = false;

    /* renamed from: s */
    private boolean f695s = false;

    /* renamed from: t */
    private boolean f696t = false;

    /* renamed from: u */
    private boolean f697u = false;

    /* renamed from: v */
    private boolean f698v = false;

    /* renamed from: w */
    private ArrayList<C0172s> f699w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0144ad>> f700x = new CopyOnWriteArrayList<>();

    /* renamed from: z */
    private boolean f702z = false;

    /* renamed from: j */
    private ArrayList<C0172s> f686j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0172s> f687k = new ArrayList<>();

    /* renamed from: l */
    private boolean f688l = true;

    /* renamed from: m */
    private ArrayList<C0172s> f689m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<C0172s> f690n = new ArrayList<>();

    /* renamed from: o */
    private boolean f691o = true;

    /* renamed from: b */
    public String mo398b() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: p */
    public C0168o mo403p() {
        return this;
    }

    public C0168o(Context context) {
        this.f681e = context;
        this.f682f = context.getResources();
        this.f684h = this.f682f.getConfiguration().keyboard != 1 && C0505af.m1741c(ViewConfiguration.get(this.f681e), this.f681e);
    }

    /* renamed from: a */
    public final C0168o m443a() {
        this.f692p = 1;
        return this;
    }

    /* renamed from: a */
    public final void m450a(InterfaceC0144ad interfaceC0144ad) {
        m451a(interfaceC0144ad, this.f681e);
    }

    /* renamed from: a */
    public final void m451a(InterfaceC0144ad interfaceC0144ad, Context context) {
        this.f700x.add(new WeakReference<>(interfaceC0144ad));
        interfaceC0144ad.mo357a(context, this);
        this.f691o = true;
    }

    /* renamed from: b */
    public final void m457b(InterfaceC0144ad interfaceC0144ad) {
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad2 = next.get();
            if (interfaceC0144ad2 == null || interfaceC0144ad2 == interfaceC0144ad) {
                this.f700x.remove(next);
            }
        }
    }

    /* renamed from: a */
    private boolean m441a(SubMenuC0153am subMenuC0153am, InterfaceC0144ad interfaceC0144ad) {
        if (this.f700x.isEmpty()) {
            return false;
        }
        boolean mo388a = interfaceC0144ad != null ? interfaceC0144ad.mo388a(subMenuC0153am) : false;
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad2 = next.get();
            if (interfaceC0144ad2 == null) {
                this.f700x.remove(next);
            } else if (!mo388a) {
                mo388a = interfaceC0144ad2.mo388a(subMenuC0153am);
            }
        }
        return mo388a;
    }

    /* renamed from: c */
    public final void m459c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0153am) item.getSubMenu()).m459c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo398b(), sparseArray);
        }
    }

    /* renamed from: d */
    public final void m461d(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo398b());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0153am) item.getSubMenu()).m461d(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: a */
    public void mo395a(InterfaceC0169p interfaceC0169p) {
        this.f685i = interfaceC0169p;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo442a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo442a(0, 0, 0, this.f682f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo442a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo442a(i, i2, i3, this.f682f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f682f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0172s c0172s = (C0172s) mo442a(i, i2, i3, charSequence);
        SubMenuC0153am subMenuC0153am = new SubMenuC0153am(this.f681e, this, c0172s);
        c0172s.m481a(subMenuC0153am);
        return subMenuC0153am;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f682f.getString(i4));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f702z = z;
    }

    /* renamed from: c */
    public boolean mo400c() {
        return this.f702z;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f681e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    /* renamed from: a */
    private void m439a(int i, boolean z) {
        if (i < 0 || i >= this.f686j.size()) {
            return;
        }
        this.f686j.remove(i);
        if (z) {
            mo458b(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.f701y != null) {
            mo399b(this.f701y);
        }
        this.f686j.clear();
        mo458b(true);
    }

    /* renamed from: a */
    public final void m449a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f686j.size();
        m464h();
        for (int i = 0; i < size; i++) {
            C0172s c0172s = this.f686j.get(i);
            if (c0172s.getGroupId() == groupId && c0172s.m491f() && c0172s.isCheckable()) {
                c0172s.m483b(c0172s == menuItem);
            }
        }
        m465i();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f686j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0172s c0172s = this.f686j.get(i2);
            if (c0172s.getGroupId() == i) {
                c0172s.m482a(z2);
                c0172s.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f686j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0172s c0172s = this.f686j.get(i2);
            if (c0172s.getGroupId() == i && c0172s.m486c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo458b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f686j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0172s c0172s = this.f686j.get(i2);
            if (c0172s.getGroupId() == i) {
                c0172s.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f677A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f686j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0172s c0172s = this.f686j.get(i2);
            if (c0172s.getItemId() == i) {
                return c0172s;
            }
            if (c0172s.hasSubMenu() && (findItem = c0172s.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public int size() {
        return this.f686j.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f686j.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m437a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f683g = z;
        mo458b(false);
    }

    /* renamed from: d */
    public boolean mo401d() {
        return this.f683g;
    }

    /* renamed from: e */
    public boolean mo402e() {
        return this.f684h;
    }

    /* renamed from: f */
    public final Context m462f() {
        return this.f681e;
    }

    /* renamed from: a */
    public boolean mo396a(C0168o c0168o, MenuItem menuItem) {
        return this.f685i != null && this.f685i.mo109a(c0168o, menuItem);
    }

    /* renamed from: g */
    public final void m463g() {
        if (this.f685i != null) {
            this.f685i.mo105a(this);
        }
    }

    /* renamed from: a */
    private static int m436a(ArrayList<C0172s> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m485c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0172s m437a = m437a(i, keyEvent);
        boolean m454a = m437a != null ? m454a(m437a, (InterfaceC0144ad) null, i2) : false;
        if ((i2 & 2) != 0) {
            m452a(true);
        }
        return m454a;
    }

    /* renamed from: a */
    private void m440a(List<C0172s> list, int i, KeyEvent keyEvent) {
        boolean mo401d = mo401d();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f686j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0172s c0172s = this.f686j.get(i2);
                if (c0172s.hasSubMenu()) {
                    ((C0168o) c0172s.getSubMenu()).m440a(list, i, keyEvent);
                }
                char alphabeticShortcut = mo401d ? c0172s.getAlphabeticShortcut() : c0172s.getNumericShortcut();
                if (((modifiers & 69647) == ((mo401d ? c0172s.getAlphabeticModifiers() : c0172s.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (mo401d && alphabeticShortcut == '\b' && i == 67)) && c0172s.isEnabled())) {
                    list.add(c0172s);
                }
            }
        }
    }

    /* renamed from: a */
    private C0172s m437a(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C0172s> arrayList = this.f699w;
        arrayList.clear();
        m440a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo401d = mo401d();
        for (int i2 = 0; i2 < size; i2++) {
            C0172s c0172s = arrayList.get(i2);
            if (mo401d) {
                numericShortcut = c0172s.getAlphabeticShortcut();
            } else {
                numericShortcut = c0172s.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (mo401d && numericShortcut == '\b' && i == 67))) {
                return c0172s;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m454a(findItem(i), (InterfaceC0144ad) null, i2);
    }

    /* renamed from: a */
    public final boolean m453a(MenuItem menuItem, int i) {
        return m454a(menuItem, (InterfaceC0144ad) null, i);
    }

    /* renamed from: a */
    public final boolean m454a(MenuItem menuItem, InterfaceC0144ad interfaceC0144ad, int i) {
        C0172s c0172s = (C0172s) menuItem;
        if (c0172s == null || !c0172s.isEnabled()) {
            return false;
        }
        boolean m484b = c0172s.m484b();
        AbstractC0518c mo351a = c0172s.mo351a();
        boolean z = mo351a != null && mo351a.mo501c();
        if (c0172s.m495j()) {
            m484b |= c0172s.expandActionView();
            if (m484b) {
                m452a(true);
            }
        } else if (c0172s.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m452a(false);
            }
            if (!c0172s.hasSubMenu()) {
                c0172s.m481a(new SubMenuC0153am(this.f681e, this, c0172s));
            }
            SubMenuC0153am subMenuC0153am = (SubMenuC0153am) c0172s.getSubMenu();
            if (z) {
                mo351a.mo499a(subMenuC0153am);
            }
            m484b |= m441a(subMenuC0153am, interfaceC0144ad);
            if (!m484b) {
                m452a(true);
            }
        } else if ((i & 1) == 0) {
            m452a(true);
        }
        return m484b;
    }

    /* renamed from: a */
    public final void m452a(boolean z) {
        if (this.f698v) {
            return;
        }
        this.f698v = true;
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad = next.get();
            if (interfaceC0144ad == null) {
                this.f700x.remove(next);
            } else {
                interfaceC0144ad.mo386a(this, z);
            }
        }
        this.f698v = false;
    }

    @Override // android.view.Menu
    public void close() {
        m452a(true);
    }

    /* renamed from: b */
    public void mo458b(boolean z) {
        if (this.f694r) {
            this.f695s = true;
            if (z) {
                this.f696t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f688l = true;
            this.f691o = true;
        }
        if (this.f700x.isEmpty()) {
            return;
        }
        m464h();
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad = next.get();
            if (interfaceC0144ad == null) {
                this.f700x.remove(next);
            } else {
                interfaceC0144ad.mo387a(z);
            }
        }
        m465i();
    }

    /* renamed from: h */
    public final void m464h() {
        if (this.f694r) {
            return;
        }
        this.f694r = true;
        this.f695s = false;
        this.f696t = false;
    }

    /* renamed from: i */
    public final void m465i() {
        this.f694r = false;
        if (this.f695s) {
            this.f695s = false;
            mo458b(this.f696t);
        }
    }

    /* renamed from: j */
    public final void m466j() {
        this.f688l = true;
        mo458b(true);
    }

    /* renamed from: k */
    public final void m467k() {
        this.f691o = true;
        mo458b(true);
    }

    /* renamed from: l */
    public final ArrayList<C0172s> m468l() {
        if (!this.f688l) {
            return this.f687k;
        }
        this.f687k.clear();
        int size = this.f686j.size();
        for (int i = 0; i < size; i++) {
            C0172s c0172s = this.f686j.get(i);
            if (c0172s.isVisible()) {
                this.f687k.add(c0172s);
            }
        }
        this.f688l = false;
        this.f691o = true;
        return this.f687k;
    }

    /* renamed from: m */
    public final void m469m() {
        ArrayList<C0172s> m468l = m468l();
        if (this.f691o) {
            Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0144ad> next = it.next();
                InterfaceC0144ad interfaceC0144ad = next.get();
                if (interfaceC0144ad == null) {
                    this.f700x.remove(next);
                } else {
                    z |= interfaceC0144ad.mo389b();
                }
            }
            if (z) {
                this.f689m.clear();
                this.f690n.clear();
                int size = m468l.size();
                for (int i = 0; i < size; i++) {
                    C0172s c0172s = m468l.get(i);
                    if (c0172s.m492g()) {
                        this.f689m.add(c0172s);
                    } else {
                        this.f690n.add(c0172s);
                    }
                }
            } else {
                this.f689m.clear();
                this.f690n.clear();
                this.f690n.addAll(m468l());
            }
            this.f691o = false;
        }
    }

    /* renamed from: n */
    public final ArrayList<C0172s> m470n() {
        m469m();
        return this.f689m;
    }

    /* renamed from: o */
    public final ArrayList<C0172s> m471o() {
        m469m();
        return this.f690n;
    }

    public void clearHeader() {
        this.f679b = null;
        this.f678a = null;
        this.f680c = null;
        mo458b(false);
    }

    /* renamed from: a */
    public final C0168o m447a(CharSequence charSequence) {
        m438a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: a */
    public final C0168o m444a(int i) {
        m438a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: a */
    public final C0168o m445a(Drawable drawable) {
        m438a(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: b */
    public final C0168o m455b(int i) {
        m438a(0, null, i, null, null);
        return this;
    }

    /* renamed from: a */
    public final C0168o m446a(View view) {
        m438a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: q */
    public final boolean m472q() {
        return this.f697u;
    }

    /* renamed from: a */
    public boolean mo397a(C0172s c0172s) {
        boolean z = false;
        if (this.f700x.isEmpty()) {
            return false;
        }
        m464h();
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad = next.get();
            if (interfaceC0144ad == null) {
                this.f700x.remove(next);
            } else {
                z = interfaceC0144ad.mo364b(c0172s);
                if (z) {
                    break;
                }
            }
        }
        m465i();
        if (z) {
            this.f701y = c0172s;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo399b(C0172s c0172s) {
        boolean z = false;
        if (this.f700x.isEmpty() || this.f701y != c0172s) {
            return false;
        }
        m464h();
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad = next.get();
            if (interfaceC0144ad == null) {
                this.f700x.remove(next);
            } else {
                z = interfaceC0144ad.mo368c(c0172s);
                if (z) {
                    break;
                }
            }
        }
        m465i();
        if (z) {
            this.f701y = null;
        }
        return z;
    }

    /* renamed from: r */
    public final C0172s m473r() {
        return this.f701y;
    }

    /* renamed from: c */
    public final void m460c(boolean z) {
        this.f677A = z;
    }

    /* renamed from: a */
    public final void m448a(Bundle bundle) {
        Parcelable mo390f;
        if (this.f700x.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad = next.get();
            if (interfaceC0144ad == null) {
                this.f700x.remove(next);
            } else {
                int mo365c = interfaceC0144ad.mo365c();
                if (mo365c > 0 && (mo390f = interfaceC0144ad.mo390f()) != null) {
                    sparseArray.put(mo365c, mo390f);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: b */
    public final void m456b(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f700x.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC0144ad>> it = this.f700x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0144ad> next = it.next();
            InterfaceC0144ad interfaceC0144ad = next.get();
            if (interfaceC0144ad == null) {
                this.f700x.remove(next);
            } else {
                int mo365c = interfaceC0144ad.mo365c();
                if (mo365c > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(mo365c)) != null) {
                    interfaceC0144ad.mo384a(parcelable);
                }
            }
        }
    }

    /* renamed from: a */
    public MenuItem mo442a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = ((-65536) & i3) >> 16;
        if (i4 < 0 || i4 >= f676d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f676d[i4] << 16) | (65535 & i3);
        C0172s c0172s = new C0172s(this, i, i2, i3, i5, charSequence, this.f692p);
        if (this.f693q != null) {
            c0172s.m480a(this.f693q);
        }
        this.f686j.add(m436a(this.f686j, i5), c0172s);
        mo458b(true);
        return c0172s;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f686j.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        m439a(i2, true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f686j.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f686j.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f686j.get(i2).getGroupId() != i) {
                    break;
                }
                m439a(i2, false);
                i3 = i4;
            }
            mo458b(true);
        }
    }

    /* renamed from: a */
    private void m438a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f682f;
        if (view != null) {
            this.f680c = view;
            this.f678a = null;
            this.f679b = null;
        } else {
            if (i > 0) {
                this.f678a = resources.getText(i);
            } else if (charSequence != null) {
                this.f678a = charSequence;
            }
            if (i2 > 0) {
                this.f679b = C0420a.m1483a(this.f681e, i2);
            } else if (drawable != null) {
                this.f679b = drawable;
            }
            this.f680c = null;
        }
        mo458b(false);
    }
}
