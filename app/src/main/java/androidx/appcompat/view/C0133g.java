package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.MenuC0148ah;
import androidx.core.p016a.p017a.InterfaceMenuC0400a;

/* compiled from: SupportActionModeWrapper.java */
/* renamed from: androidx.appcompat.view.g */
/* loaded from: classes.dex */
public final class C0133g extends ActionMode {

    /* renamed from: a */
    final Context f456a;

    /* renamed from: b */
    final AbstractC0128b f457b;

    public C0133g(Context context, AbstractC0128b abstractC0128b) {
        this.f456a = context;
        this.f457b = abstractC0128b;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f457b.m310j();
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f457b.m309a(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f457b.mo219b(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f457b.mo215a(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f457b.mo221d();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f457b.mo220c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0148ah(this.f456a, (InterfaceMenuC0400a) this.f457b.mo217b());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f457b.mo223f();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f457b.mo213a(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f457b.mo224g();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f457b.mo218b(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f457b.mo226i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f457b.mo214a(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f457b.mo212a();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f457b.m311k();
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f457b.mo216a(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f457b.mo225h();
    }
}
