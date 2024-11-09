package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
final class RunnableC0163j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0164k f651a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f652b;

    /* renamed from: c */
    final /* synthetic */ C0168o f653c;

    /* renamed from: d */
    final /* synthetic */ C0162i f654d;

    public RunnableC0163j(C0162i c0162i, C0164k c0164k, MenuItem menuItem, C0168o c0168o) {
        this.f654d = c0162i;
        this.f651a = c0164k;
        this.f652b = menuItem;
        this.f653c = c0168o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f651a != null) {
            this.f654d.f650a.f628f = true;
            this.f651a.f656b.m452a(false);
            this.f654d.f650a.f628f = false;
        }
        if (this.f652b.isEnabled() && this.f652b.hasSubMenu()) {
            this.f653c.m453a(this.f652b, 4);
        }
    }
}
