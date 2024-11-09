package color.support.design.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.m */
/* loaded from: classes.dex */
public final class C1184m {

    /* renamed from: a */
    ColorTabLayout f4808a;

    /* renamed from: b */
    C1186o f4809b;

    /* renamed from: c */
    private Object f4810c;

    /* renamed from: d */
    private Drawable f4811d;

    /* renamed from: e */
    private CharSequence f4812e;

    /* renamed from: f */
    private CharSequence f4813f;

    /* renamed from: h */
    private View f4815h;

    /* renamed from: j */
    private int f4817j;

    /* renamed from: g */
    private int f4814g = -1;

    /* renamed from: i */
    private int f4816i = 0;

    /* renamed from: a */
    public final int m3915a() {
        return this.f4816i;
    }

    /* renamed from: b */
    public final int m3919b() {
        return this.f4817j;
    }

    /* renamed from: c */
    public final View m3921c() {
        return this.f4815h;
    }

    /* renamed from: d */
    public final Drawable m3922d() {
        return this.f4811d;
    }

    /* renamed from: e */
    public final int m3923e() {
        return this.f4814g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3918a(int i) {
        this.f4814g = i;
    }

    /* renamed from: f */
    public final CharSequence m3924f() {
        return this.f4812e;
    }

    /* renamed from: a */
    public final C1184m m3916a(Drawable drawable) {
        this.f4811d = drawable;
        m3928j();
        return this;
    }

    /* renamed from: a */
    public final C1184m m3917a(CharSequence charSequence) {
        this.f4812e = charSequence;
        m3928j();
        return this;
    }

    /* renamed from: g */
    public final void m3925g() {
        if (this.f4808a == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        this.f4808a.m3863a(this);
    }

    /* renamed from: h */
    public final boolean m3926h() {
        if (this.f4808a != null) {
            return this.f4808a.getSelectedTabPosition() == this.f4814g;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    /* renamed from: b */
    public final C1184m m3920b(CharSequence charSequence) {
        this.f4813f = charSequence;
        m3928j();
        return this;
    }

    /* renamed from: i */
    public final CharSequence m3927i() {
        return this.f4813f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m3928j() {
        if (this.f4809b != null) {
            this.f4809b.m3933a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m3929k() {
        this.f4808a = null;
        this.f4809b = null;
        this.f4810c = null;
        this.f4811d = null;
        this.f4812e = null;
        this.f4813f = null;
        this.f4814g = -1;
        this.f4815h = null;
        this.f4816i = 0;
        this.f4817j = 0;
    }
}
