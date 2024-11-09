package com.coloros.anim.p056c;

import com.coloros.anim.p056c.p058b.C1734q;
import java.util.List;

/* compiled from: FontCharacter.java */
/* renamed from: com.coloros.anim.c.f */
/* loaded from: classes.dex */
public final class C1761f {

    /* renamed from: a */
    private final List<C1734q> f8345a;

    /* renamed from: b */
    private final char f8346b;

    /* renamed from: c */
    private final double f8347c;

    /* renamed from: d */
    private final double f8348d;

    /* renamed from: e */
    private final String f8349e;

    /* renamed from: f */
    private final String f8350f;

    public C1761f(List<C1734q> list, char c, double d, double d2, String str, String str2) {
        this.f8345a = list;
        this.f8346b = c;
        this.f8347c = d;
        this.f8348d = d2;
        this.f8349e = str;
        this.f8350f = str2;
    }

    /* renamed from: a */
    public static int m5789a(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public final List<C1734q> m5790a() {
        return this.f8345a;
    }

    /* renamed from: b */
    public final double m5791b() {
        return this.f8348d;
    }

    public final int hashCode() {
        return m5789a(this.f8346b, this.f8350f, this.f8349e);
    }
}
