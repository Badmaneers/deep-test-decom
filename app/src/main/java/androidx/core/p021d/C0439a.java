package androidx.core.p021d;

import android.util.Base64;
import androidx.core.p023f.C0478i;
import java.util.List;

/* compiled from: FontRequest.java */
/* renamed from: androidx.core.d.a */
/* loaded from: classes.dex */
public final class C0439a {

    /* renamed from: a */
    private final String f2177a;

    /* renamed from: b */
    private final String f2178b;

    /* renamed from: c */
    private final String f2179c;

    /* renamed from: d */
    private final List<List<byte[]>> f2180d;

    /* renamed from: e */
    private final int f2181e = 0;

    /* renamed from: f */
    private final String f2182f;

    public C0439a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2177a = (String) C0478i.m1620a(str);
        this.f2178b = (String) C0478i.m1620a(str2);
        this.f2179c = (String) C0478i.m1620a(str3);
        this.f2180d = (List) C0478i.m1620a(list);
        this.f2182f = this.f2177a + "-" + this.f2178b + "-" + this.f2179c;
    }

    /* renamed from: a */
    public final String m1553a() {
        return this.f2177a;
    }

    /* renamed from: b */
    public final String m1554b() {
        return this.f2178b;
    }

    /* renamed from: c */
    public final String m1555c() {
        return this.f2179c;
    }

    /* renamed from: d */
    public final List<List<byte[]>> m1556d() {
        return this.f2180d;
    }

    /* renamed from: e */
    public final int m1557e() {
        return this.f2181e;
    }

    /* renamed from: f */
    public final String m1558f() {
        return this.f2182f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2177a + ", mProviderPackage: " + this.f2178b + ", mQuery: " + this.f2179c + ", mCertificates:");
        for (int i = 0; i < this.f2180d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f2180d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2181e);
        return sb.toString();
    }
}
