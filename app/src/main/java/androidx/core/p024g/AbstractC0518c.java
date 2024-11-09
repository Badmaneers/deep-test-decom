package androidx.core.p024g;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* renamed from: androidx.core.g.c */
/* loaded from: classes.dex */
public abstract class AbstractC0518c {

    /* renamed from: a */
    private final Context f2361a;

    /* renamed from: b */
    private InterfaceC0519d f2362b;

    /* renamed from: c */
    private InterfaceC0520e f2363c;

    /* renamed from: a */
    public abstract View mo498a();

    /* renamed from: a */
    public void mo499a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo500b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo501c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo504d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo505e() {
        return true;
    }

    public AbstractC0518c(Context context) {
        this.f2361a = context;
    }

    /* renamed from: a */
    public View mo502a(MenuItem menuItem) {
        return mo498a();
    }

    /* renamed from: a */
    public final void m1775a(boolean z) {
        if (this.f2362b != null) {
            this.f2362b.mo546c(z);
        }
    }

    /* renamed from: a */
    public final void m1774a(InterfaceC0519d interfaceC0519d) {
        this.f2362b = interfaceC0519d;
    }

    /* renamed from: a */
    public void mo503a(InterfaceC0520e interfaceC0520e) {
        if (this.f2363c != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2363c = interfaceC0520e;
    }

    /* renamed from: f */
    public final void m1776f() {
        this.f2363c = null;
        this.f2362b = null;
    }
}
