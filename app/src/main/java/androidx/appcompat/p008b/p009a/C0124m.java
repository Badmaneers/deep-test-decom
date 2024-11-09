package androidx.appcompat.p008b.p009a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateListDrawable.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.b.a.m */
/* loaded from: classes.dex */
public class C0124m extends C0119h {

    /* renamed from: a */
    private C0125n f437a;

    /* renamed from: b */
    private boolean f438b;

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    C0124m() {
        this(null, null);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m300b = this.f437a.m300b(iArr);
        if (m300b < 0) {
            m300b = this.f437a.m300b(StateSet.WILD_CARD);
        }
        return m278a(m300b) || onStateChange;
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f438b && super.mutate() == this) {
            this.f437a.mo267a();
            this.f438b = true;
        }
        return this;
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h
    /* renamed from: a */
    public C0125n mo259b() {
        return new C0125n(this.f437a, this, null);
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h
    public void clearMutated() {
        super.clearMutated();
        this.f438b = false;
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.p008b.p009a.C0119h
    /* renamed from: a */
    public void mo258a(AbstractC0122k abstractC0122k) {
        super.mo258a(abstractC0122k);
        if (abstractC0122k instanceof C0125n) {
            this.f437a = (C0125n) abstractC0122k;
        }
    }

    public C0124m(C0125n c0125n, Resources resources) {
        mo258a(new C0125n(c0125n, this, resources));
        onStateChange(getState());
    }

    public C0124m(byte b) {
    }
}
