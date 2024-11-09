package androidx.room.p038a;

import java.util.Collections;
import java.util.List;

/* compiled from: TableInfo.java */
/* renamed from: androidx.room.a.g */
/* loaded from: classes.dex */
public final class C0929g {

    /* renamed from: a */
    public final String f3815a;

    /* renamed from: b */
    public final String f3816b;

    /* renamed from: c */
    public final String f3817c;

    /* renamed from: d */
    public final List<String> f3818d;

    /* renamed from: e */
    public final List<String> f3819e;

    public C0929g(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.f3815a = str;
        this.f3816b = str2;
        this.f3817c = str3;
        this.f3818d = Collections.unmodifiableList(list);
        this.f3819e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0929g c0929g = (C0929g) obj;
        if (this.f3815a.equals(c0929g.f3815a) && this.f3816b.equals(c0929g.f3816b) && this.f3817c.equals(c0929g.f3817c) && this.f3818d.equals(c0929g.f3818d)) {
            return this.f3819e.equals(c0929g.f3819e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f3815a.hashCode() * 31) + this.f3816b.hashCode()) * 31) + this.f3817c.hashCode()) * 31) + this.f3818d.hashCode()) * 31) + this.f3819e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f3815a + "', onDelete='" + this.f3816b + "', onUpdate='" + this.f3817c + "', columnNames=" + this.f3818d + ", referenceColumnNames=" + this.f3819e + '}';
    }
}
