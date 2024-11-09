package com.color.support.widget;

import android.text.TextPaint;
import com.color.support.widget.p051a.C1357a;

/* compiled from: ColorInternetLabel.java */
/* renamed from: com.color.support.widget.aw */
/* loaded from: classes.dex */
public final class C1381aw {

    /* renamed from: a */
    final /* synthetic */ ColorInternetLabel f6943a;

    /* renamed from: b */
    private C1357a f6944b;

    /* renamed from: c */
    private TextPaint f6945c;

    /* renamed from: d */
    private int f6946d;

    /* renamed from: e */
    private int f6947e;

    /* renamed from: f */
    private int f6948f;

    /* renamed from: g */
    private int f6949g;

    /* renamed from: h */
    private String f6950h;

    /* renamed from: i */
    private boolean f6951i = false;

    public C1381aw(ColorInternetLabel colorInternetLabel, C1357a c1357a) {
        this.f6943a = colorInternetLabel;
        this.f6944b = null;
        this.f6945c = null;
        this.f6945c = new TextPaint(1);
        this.f6945c.setAntiAlias(true);
        this.f6944b = c1357a;
        this.f6945c.setTextSize(ColorInternetLabel.m4509a(colorInternetLabel) == -1 ? ColorInternetLabel.m4514b(colorInternetLabel) : r4);
        this.f6945c.density = colorInternetLabel.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final void m4901a() {
        this.f6951i = !this.f6951i;
    }

    /* renamed from: b */
    public final void m4904b() {
        this.f6951i = !this.f6951i;
    }

    /* renamed from: c */
    public final int[] m4907c() {
        return this.f6951i ? ColorInternetLabel.m4515b() : ColorInternetLabel.m4513a();
    }

    /* renamed from: d */
    public final C1357a m4908d() {
        return this.f6944b;
    }

    /* renamed from: a */
    public final void m4902a(int i) {
        this.f6946d = i;
    }

    /* renamed from: e */
    public final int m4910e() {
        return this.f6946d;
    }

    /* renamed from: b */
    public final void m4905b(int i) {
        this.f6947e = i;
    }

    /* renamed from: f */
    public final int m4911f() {
        return this.f6947e;
    }

    /* renamed from: c */
    public final void m4906c(int i) {
        this.f6948f = i;
    }

    /* renamed from: g */
    public final int m4912g() {
        return this.f6948f;
    }

    /* renamed from: d */
    public final void m4909d(int i) {
        this.f6949g = i;
    }

    /* renamed from: h */
    public final int m4913h() {
        return this.f6949g;
    }

    /* renamed from: a */
    public final void m4903a(String str) {
        this.f6950h = str;
    }

    /* renamed from: i */
    public final String m4914i() {
        return this.f6950h;
    }
}
