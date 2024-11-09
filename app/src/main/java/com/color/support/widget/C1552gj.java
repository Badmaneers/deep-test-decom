package com.color.support.widget;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: SecurityKeyboardView.java */
/* renamed from: com.color.support.widget.gj */
/* loaded from: classes.dex */
final class C1552gj {

    /* renamed from: a */
    public String f7354a;

    /* renamed from: b */
    public Drawable f7355b;

    /* renamed from: c */
    final /* synthetic */ SecurityKeyboardView f7356c;

    /* renamed from: d */
    private int f7357d = 0;

    /* renamed from: e */
    private int f7358e = 0;

    /* renamed from: f */
    private float f7359f = 0.0f;

    /* renamed from: g */
    private float f7360g = 0.0f;

    /* renamed from: h */
    private TextPaint f7361h = new TextPaint(1);

    public C1552gj(SecurityKeyboardView securityKeyboardView, Drawable drawable, String str) {
        this.f7356c = securityKeyboardView;
        this.f7354a = null;
        this.f7355b = null;
        this.f7361h.setAntiAlias(true);
        this.f7361h.setTextSize(SecurityKeyboardView.m4857m(securityKeyboardView));
        this.f7361h.setTypeface(SecurityKeyboardView.m4858n(securityKeyboardView));
        this.f7354a = str;
        this.f7355b = drawable;
    }

    /* renamed from: a */
    public final float m5183a() {
        return this.f7359f;
    }

    /* renamed from: a */
    public final void m5184a(float f) {
        this.f7359f = f;
    }

    /* renamed from: b */
    public final float m5185b() {
        return this.f7360g;
    }

    /* renamed from: b */
    public final void m5186b(float f) {
        this.f7360g = f;
    }

    /* renamed from: c */
    public final String m5187c() {
        if (this.f7354a != null) {
            return this.f7354a;
        }
        return null;
    }

    /* renamed from: d */
    public final Drawable m5188d() {
        if (this.f7355b != null) {
            return this.f7355b;
        }
        return null;
    }
}
