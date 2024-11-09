package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.InterfaceC0217bi;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarActionBar.java */
/* renamed from: androidx.appcompat.app.aq */
/* loaded from: classes.dex */
public final class C0076aq extends AbstractC0059a {

    /* renamed from: a */
    InterfaceC0217bi f225a;

    /* renamed from: b */
    Window.Callback f226b;

    /* renamed from: c */
    private boolean f227c;

    /* renamed from: d */
    private boolean f228d;

    /* renamed from: e */
    private ArrayList<Object> f229e;

    /* renamed from: f */
    private final Runnable f230f;

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo157a(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: b */
    public final void mo161b(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo154a(float f) {
        C0538w.m1839a(this.f225a.mo817a(), f);
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: b */
    public final Context mo160b() {
        return this.f225a.mo827b();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo155a(Configuration configuration) {
        super.mo155a(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo156a(CharSequence charSequence) {
        this.f225a.mo825a(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final int mo152a() {
        return this.f225a.mo843o();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: d */
    public final boolean mo164d() {
        return this.f225a.mo839k();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: e */
    public final boolean mo165e() {
        return this.f225a.mo840l();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: f */
    public final boolean mo166f() {
        this.f225a.mo817a().removeCallbacks(this.f230f);
        C0538w.m1852a(this.f225a.mo817a(), this.f230f);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: g */
    public final boolean mo167g() {
        if (!this.f225a.mo830c()) {
            return false;
        }
        this.f225a.mo831d();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final boolean mo159a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo164d();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: h */
    public final void mo168h() {
        this.f225a.mo817a().removeCallbacks(this.f230f);
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: c */
    public final void mo163c(boolean z) {
        if (z == this.f228d) {
            return;
        }
        this.f228d = z;
        int size = this.f229e.size();
        for (int i = 0; i < size; i++) {
            this.f229e.get(i);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final boolean mo158a(int i, KeyEvent keyEvent) {
        if (!this.f227c) {
            this.f225a.mo823a(new C0077ar(this), new C0078as(this));
            this.f227c = true;
        }
        Menu mo845q = this.f225a.mo845q();
        if (mo845q == null) {
            return false;
        }
        mo845q.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo845q.performShortcut(i, keyEvent, 0);
    }
}
