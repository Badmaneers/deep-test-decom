package androidx.room.p038a;

import android.os.Build;
import java.util.Locale;

/* compiled from: TableInfo.java */
/* renamed from: androidx.room.a.f */
/* loaded from: classes.dex */
public final class C0928f {

    /* renamed from: a */
    public final String f3808a;

    /* renamed from: b */
    public final String f3809b;

    /* renamed from: c */
    public final int f3810c;

    /* renamed from: d */
    public final boolean f3811d;

    /* renamed from: e */
    public final int f3812e;

    /* renamed from: f */
    public final String f3813f;

    /* renamed from: g */
    private final int f3814g;

    public C0928f(String str, String str2, boolean z, int i, String str3, int i2) {
        this.f3808a = str;
        this.f3809b = str2;
        this.f3811d = z;
        this.f3812e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f3810c = i3;
        this.f3813f = str3;
        this.f3814g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0928f c0928f = (C0928f) obj;
        if (Build.VERSION.SDK_INT >= 20) {
            if (this.f3812e != c0928f.f3812e) {
                return false;
            }
        } else if (m3346a() != c0928f.m3346a()) {
            return false;
        }
        if (!this.f3808a.equals(c0928f.f3808a) || this.f3811d != c0928f.f3811d) {
            return false;
        }
        if (this.f3814g == 1 && c0928f.f3814g == 2 && this.f3813f != null && !this.f3813f.equals(c0928f.f3813f)) {
            return false;
        }
        if (this.f3814g != 2 || c0928f.f3814g != 1 || c0928f.f3813f == null || c0928f.f3813f.equals(this.f3813f)) {
            return (this.f3814g == 0 || this.f3814g != c0928f.f3814g || (this.f3813f == null ? c0928f.f3813f == null : this.f3813f.equals(c0928f.f3813f))) && this.f3810c == c0928f.f3810c;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3346a() {
        return this.f3812e > 0;
    }

    public final int hashCode() {
        return (((((this.f3808a.hashCode() * 31) + this.f3810c) * 31) + (this.f3811d ? 1231 : 1237)) * 31) + this.f3812e;
    }

    public final String toString() {
        return "Column{name='" + this.f3808a + "', type='" + this.f3809b + "', affinity='" + this.f3810c + "', notNull=" + this.f3811d + ", primaryKeyPosition=" + this.f3812e + ", defaultValue='" + this.f3813f + "'}";
    }
}
