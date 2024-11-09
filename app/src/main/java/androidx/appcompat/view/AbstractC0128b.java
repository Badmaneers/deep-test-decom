package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: ActionMode.java */
/* renamed from: androidx.appcompat.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0128b {

    /* renamed from: a */
    private Object f442a;

    /* renamed from: b */
    private boolean f443b;

    /* renamed from: a */
    public abstract MenuInflater mo212a();

    /* renamed from: a */
    public abstract void mo213a(int i);

    /* renamed from: a */
    public abstract void mo214a(View view);

    /* renamed from: a */
    public abstract void mo215a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo217b();

    /* renamed from: b */
    public abstract void mo218b(int i);

    /* renamed from: b */
    public abstract void mo219b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo220c();

    /* renamed from: d */
    public abstract void mo221d();

    /* renamed from: f */
    public abstract CharSequence mo223f();

    /* renamed from: g */
    public abstract CharSequence mo224g();

    /* renamed from: h */
    public boolean mo225h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo226i();

    /* renamed from: a */
    public final void m309a(Object obj) {
        this.f442a = obj;
    }

    /* renamed from: j */
    public final Object m310j() {
        return this.f442a;
    }

    /* renamed from: a */
    public void mo216a(boolean z) {
        this.f443b = z;
    }

    /* renamed from: k */
    public final boolean m311k() {
        return this.f443b;
    }
}
