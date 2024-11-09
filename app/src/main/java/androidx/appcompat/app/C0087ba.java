package androidx.appcompat.app;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.C0135i;
import androidx.appcompat.view.InterfaceC0129c;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;
import java.lang.ref.WeakReference;

/* compiled from: WindowDecorActionBar.java */
/* renamed from: androidx.appcompat.app.ba */
/* loaded from: classes.dex */
public final class C0087ba extends AbstractC0128b implements InterfaceC0169p {

    /* renamed from: a */
    final /* synthetic */ C0082aw f286a;

    /* renamed from: b */
    private final Context f287b;

    /* renamed from: c */
    private final C0168o f288c;

    /* renamed from: d */
    private InterfaceC0129c f289d;

    /* renamed from: e */
    private WeakReference<View> f290e;

    public C0087ba(C0082aw c0082aw, Context context, InterfaceC0129c interfaceC0129c) {
        this.f286a = c0082aw;
        this.f287b = context;
        this.f289d = interfaceC0129c;
        this.f288c = new C0168o(context).m443a();
        this.f288c.mo395a(this);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final MenuInflater mo212a() {
        return new C0135i(this.f287b);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: b */
    public final Menu mo217b() {
        return this.f288c;
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: c */
    public final void mo220c() {
        if (this.f286a.f266h != this) {
            return;
        }
        if (!C0082aw.m196a(this.f286a.f270l, this.f286a.f271m, false)) {
            this.f286a.f267i = this;
            this.f286a.f268j = this.f289d;
        } else {
            this.f289d.mo173a(this);
        }
        this.f289d = null;
        this.f286a.m207e(false);
        this.f286a.f263e.m513b();
        this.f286a.f262d.mo817a().sendAccessibilityEvent(32);
        this.f286a.f260b.setHideOnContentScrollEnabled(this.f286a.f273o);
        this.f286a.f266h = null;
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: d */
    public final void mo221d() {
        if (this.f286a.f266h != this) {
            return;
        }
        this.f288c.m464h();
        try {
            this.f289d.mo176b(this, this.f288c);
        } finally {
            this.f288c.m465i();
        }
    }

    /* renamed from: e */
    public final boolean m222e() {
        this.f288c.m464h();
        try {
            return this.f289d.mo174a(this, this.f288c);
        } finally {
            this.f288c.m465i();
        }
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo214a(View view) {
        this.f286a.f263e.setCustomView(view);
        this.f290e = new WeakReference<>(view);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo215a(CharSequence charSequence) {
        this.f286a.f263e.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: b */
    public final void mo219b(CharSequence charSequence) {
        this.f286a.f263e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo213a(int i) {
        mo219b(this.f286a.f259a.getResources().getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: b */
    public final void mo218b(int i) {
        mo215a((CharSequence) this.f286a.f259a.getResources().getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: f */
    public final CharSequence mo223f() {
        return this.f286a.f263e.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: g */
    public final CharSequence mo224g() {
        return this.f286a.f263e.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo216a(boolean z) {
        super.mo216a(z);
        this.f286a.f263e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: h */
    public final boolean mo225h() {
        return this.f286a.f263e.m515d();
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: i */
    public final View mo226i() {
        if (this.f290e != null) {
            return this.f290e.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        if (this.f289d != null) {
            return this.f289d.mo175a(this, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
        if (this.f289d == null) {
            return;
        }
        mo221d();
        this.f286a.f263e.mo512a();
    }
}
