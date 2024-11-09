package com.coloros.anim.p056c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* renamed from: com.coloros.anim.c.g */
/* loaded from: classes.dex */
public final class C1762g {

    /* renamed from: a */
    private final List<String> f8351a;

    /* renamed from: b */
    private InterfaceC1763h f8352b;

    public C1762g(String... strArr) {
        this.f8351a = Arrays.asList(strArr);
    }

    private C1762g(C1762g c1762g) {
        this.f8351a = new ArrayList(c1762g.f8351a);
        this.f8352b = c1762g.f8352b;
    }

    /* renamed from: a */
    public final C1762g m5794a(String str) {
        C1762g c1762g = new C1762g(this);
        c1762g.f8351a.add(str);
        return c1762g;
    }

    /* renamed from: a */
    public final C1762g m5793a(InterfaceC1763h interfaceC1763h) {
        C1762g c1762g = new C1762g(this);
        c1762g.f8352b = interfaceC1763h;
        return c1762g;
    }

    /* renamed from: a */
    public final InterfaceC1763h m5795a() {
        return this.f8352b;
    }

    /* renamed from: c */
    public final boolean m5798c(String str, int i) {
        if (i >= this.f8351a.size()) {
            return false;
        }
        boolean z = i == this.f8351a.size() - 1;
        String str2 = this.f8351a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f8351a.size() + (-2) && m5792b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f8351a.get(i + 1).equals(str)) {
            return i == this.f8351a.size() + (-2) || (i == this.f8351a.size() + (-3) && m5792b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f8351a.size() - 1) {
            return false;
        }
        return this.f8351a.get(i2).equals(str);
    }

    /* renamed from: d */
    public final boolean m5799d(String str, int i) {
        return "__container".equals(str) || i < this.f8351a.size() - 1 || this.f8351a.get(i).equals("**");
    }

    /* renamed from: b */
    private boolean m5792b() {
        return this.f8351a.get(this.f8351a.size() - 1).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f8351a);
        sb.append(",resolved=");
        sb.append(this.f8352b != null);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean m5796a(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f8351a.size()) {
            return false;
        }
        return this.f8351a.get(i).equals(str) || this.f8351a.get(i).equals("**") || this.f8351a.get(i).equals("*");
    }

    /* renamed from: b */
    public final int m5797b(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.f8351a.get(i).equals("**")) {
            return (i != this.f8351a.size() - 1 && this.f8351a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }
}
