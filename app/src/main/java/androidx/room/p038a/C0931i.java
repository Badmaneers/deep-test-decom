package androidx.room.p038a;

import java.util.List;

/* compiled from: TableInfo.java */
/* renamed from: androidx.room.a.i */
/* loaded from: classes.dex */
public final class C0931i {

    /* renamed from: a */
    public final String f3824a;

    /* renamed from: b */
    public final boolean f3825b;

    /* renamed from: c */
    public final List<String> f3826c;

    public C0931i(String str, boolean z, List<String> list) {
        this.f3824a = str;
        this.f3825b = z;
        this.f3826c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0931i c0931i = (C0931i) obj;
        if (this.f3825b != c0931i.f3825b || !this.f3826c.equals(c0931i.f3826c)) {
            return false;
        }
        if (this.f3824a.startsWith("index_")) {
            return c0931i.f3824a.startsWith("index_");
        }
        return this.f3824a.equals(c0931i.f3824a);
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3824a.startsWith("index_")) {
            hashCode = "index_".hashCode();
        } else {
            hashCode = this.f3824a.hashCode();
        }
        return (((hashCode * 31) + (this.f3825b ? 1 : 0)) * 31) + this.f3826c.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.f3824a + "', unique=" + this.f3825b + ", columns=" + this.f3826c + '}';
    }
}
