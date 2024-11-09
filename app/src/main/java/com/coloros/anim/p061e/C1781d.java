package com.coloros.anim.p061e;

import android.util.JsonReader;
import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1703a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1705c;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p057a.C1709g;
import com.coloros.anim.p056c.p057a.C1710h;
import com.coloros.anim.p056c.p057a.C1712j;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1815c;
import com.coloros.anim.p063g.C1816d;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* renamed from: com.coloros.anim.e.d */
/* loaded from: classes.dex */
public final class C1781d {
    /* renamed from: a */
    public static C1704b m5818a(JsonReader jsonReader, C1638a c1638a) {
        return m5819a(jsonReader, c1638a, true);
    }

    /* renamed from: a */
    public static C1704b m5819a(JsonReader jsonReader, C1638a c1638a, boolean z) {
        return new C1704b(m5821a(jsonReader, z ? C1811g.m5901a() : 1.0f, c1638a, C1787j.f8376a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1706d m5823b(JsonReader jsonReader, C1638a c1638a) {
        return new C1706d(m5822a(jsonReader, c1638a, C1791n.f8378a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1708f m5824c(JsonReader jsonReader, C1638a c1638a) {
        return new C1708f(m5821a(jsonReader, C1811g.m5901a(), c1638a, C1800w.f8383a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C1709g m5825d(JsonReader jsonReader, C1638a c1638a) {
        return new C1709g((List<C1815c<C1816d>>) m5822a(jsonReader, c1638a, C1772aa.f8372a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1710h m5826e(JsonReader jsonReader, C1638a c1638a) {
        return new C1710h(m5821a(jsonReader, C1811g.m5901a(), c1638a, C1773ab.f8373a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C1712j m5827f(JsonReader jsonReader, C1638a c1638a) {
        return new C1712j(m5822a(jsonReader, c1638a, C1785h.f8375a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C1703a m5828g(JsonReader jsonReader, C1638a c1638a) {
        return new C1703a(m5822a(jsonReader, c1638a, C1783f.f8374a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1705c m5820a(JsonReader jsonReader, C1638a c1638a, int i) {
        return new C1705c(m5822a(jsonReader, c1638a, new C1788k(i)));
    }

    /* renamed from: a */
    private static <T> List<C1815c<T>> m5822a(JsonReader jsonReader, C1638a c1638a, InterfaceC1778ag<T> interfaceC1778ag) {
        return C1795r.m5851a(jsonReader, c1638a, 1.0f, interfaceC1778ag);
    }

    /* renamed from: a */
    private static <T> List<C1815c<T>> m5821a(JsonReader jsonReader, float f, C1638a c1638a, InterfaceC1778ag<T> interfaceC1778ag) {
        return C1795r.m5851a(jsonReader, c1638a, f, interfaceC1778ag);
    }
}
