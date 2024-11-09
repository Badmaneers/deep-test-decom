package com.google.android.material.tabs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.badge.C2065b;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.i */
/* loaded from: classes.dex */
public final class C2358i {

    /* renamed from: a */
    public TabLayout f10417a;

    /* renamed from: b */
    public TabLayout.TabView f10418b;

    /* renamed from: c */
    private Object f10419c;

    /* renamed from: d */
    private Drawable f10420d;

    /* renamed from: e */
    private CharSequence f10421e;

    /* renamed from: f */
    private CharSequence f10422f;

    /* renamed from: h */
    private View f10424h;

    /* renamed from: g */
    private int f10423g = -1;

    /* renamed from: i */
    private int f10425i = 1;

    /* renamed from: a */
    public final View m7535a() {
        return this.f10424h;
    }

    /* renamed from: a */
    public final C2358i m7537a(View view) {
        this.f10424h = view;
        m7547h();
        return this;
    }

    /* renamed from: b */
    public final Drawable m7540b() {
        return this.f10420d;
    }

    /* renamed from: c */
    public final int m7542c() {
        return this.f10423g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7539a(int i) {
        this.f10423g = i;
    }

    /* renamed from: d */
    public final CharSequence m7543d() {
        return this.f10421e;
    }

    /* renamed from: a */
    public final C2358i m7536a(Drawable drawable) {
        this.f10420d = drawable;
        if (this.f10417a.f10376p == 1 || this.f10417a.f10379s == 2) {
            this.f10417a.m7498a(true);
        }
        m7547h();
        if (C2065b.f9124a && TabLayout.TabView.m7506a(this.f10418b) && TabLayout.TabView.m7507b(this.f10418b).isVisible()) {
            this.f10418b.invalidate();
        }
        return this;
    }

    /* renamed from: a */
    public final C2358i m7538a(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f10422f) && !TextUtils.isEmpty(charSequence)) {
            this.f10418b.setContentDescription(charSequence);
        }
        this.f10421e = charSequence;
        m7547h();
        return this;
    }

    /* renamed from: e */
    public final int m7544e() {
        return this.f10425i;
    }

    /* renamed from: f */
    public final void m7545f() {
        if (this.f10417a == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        this.f10417a.m7496a(this);
    }

    /* renamed from: g */
    public final boolean m7546g() {
        if (this.f10417a != null) {
            return this.f10417a.getSelectedTabPosition() == this.f10423g;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    /* renamed from: b */
    public final C2358i m7541b(CharSequence charSequence) {
        this.f10422f = charSequence;
        m7547h();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m7547h() {
        if (this.f10418b != null) {
            this.f10418b.m7518a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m7548i() {
        this.f10417a = null;
        this.f10418b = null;
        this.f10419c = null;
        this.f10420d = null;
        this.f10421e = null;
        this.f10422f = null;
        this.f10423g = -1;
        this.f10424h = null;
    }
}
