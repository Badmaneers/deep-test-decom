package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* renamed from: androidx.appcompat.view.f */
/* loaded from: classes.dex */
public final class C0132f extends AbstractC0128b implements InterfaceC0169p {

    /* renamed from: a */
    private Context f449a;

    /* renamed from: b */
    private ActionBarContextView f450b;

    /* renamed from: c */
    private InterfaceC0129c f451c;

    /* renamed from: d */
    private WeakReference<View> f452d;

    /* renamed from: e */
    private boolean f453e;

    /* renamed from: f */
    private boolean f454f;

    /* renamed from: g */
    private C0168o f455g;

    public C0132f(Context context, ActionBarContextView actionBarContextView, InterfaceC0129c interfaceC0129c, boolean z) {
        this.f449a = context;
        this.f450b = actionBarContextView;
        this.f451c = interfaceC0129c;
        this.f455g = new C0168o(actionBarContextView.getContext()).m443a();
        this.f455g.mo395a(this);
        this.f454f = z;
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: b */
    public final void mo219b(CharSequence charSequence) {
        this.f450b.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo215a(CharSequence charSequence) {
        this.f450b.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo213a(int i) {
        mo219b(this.f449a.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: b */
    public final void mo218b(int i) {
        mo215a((CharSequence) this.f449a.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo216a(boolean z) {
        super.mo216a(z);
        this.f450b.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: h */
    public final boolean mo225h() {
        return this.f450b.m515d();
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final void mo214a(View view) {
        this.f450b.setCustomView(view);
        this.f452d = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: d */
    public final void mo221d() {
        this.f451c.mo176b(this, this.f455g);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: c */
    public final void mo220c() {
        if (this.f453e) {
            return;
        }
        this.f453e = true;
        this.f450b.sendAccessibilityEvent(32);
        this.f451c.mo173a(this);
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: b */
    public final Menu mo217b() {
        return this.f455g;
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: f */
    public final CharSequence mo223f() {
        return this.f450b.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: g */
    public final CharSequence mo224g() {
        return this.f450b.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: i */
    public final View mo226i() {
        if (this.f452d != null) {
            return this.f452d.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC0128b
    /* renamed from: a */
    public final MenuInflater mo212a() {
        return new C0135i(this.f450b.getContext());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        return this.f451c.mo175a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
        mo221d();
        this.f450b.mo512a();
    }
}
