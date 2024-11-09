package com.coloros.anim.p060d;

import android.content.Context;

/* compiled from: NetworkFetcher.java */
/* renamed from: com.coloros.anim.d.c */
/* loaded from: classes.dex */
public final class C1769c {

    /* renamed from: a */
    private final Context f8366a;

    /* renamed from: b */
    private final String f8367b;

    /* renamed from: c */
    private final C1768b f8368c;

    private C1769c(Context context, String str) {
        this.f8366a = context.getApplicationContext();
        this.f8367b = str;
        this.f8368c = new C1768b(this.f8366a, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.coloros.anim.C1829u<com.coloros.anim.C1638a> m5808a(android.content.Context r2, java.lang.String r3) {
        /*
            com.coloros.anim.d.c r0 = new com.coloros.anim.d.c
            r0.<init>(r2, r3)
            com.coloros.anim.d.b r2 = r0.f8368c
            android.util.Pair r2 = r2.m5804a()
            if (r2 == 0) goto L38
            java.lang.Object r3 = r2.first
            com.coloros.anim.d.a r3 = (com.coloros.anim.p060d.EnumC1767a) r3
            java.lang.Object r2 = r2.second
            java.io.InputStream r2 = (java.io.InputStream) r2
            com.coloros.anim.d.a r1 = com.coloros.anim.p060d.EnumC1767a.ZIP
            if (r3 != r1) goto L25
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream
            r3.<init>(r2)
            java.lang.String r2 = r0.f8367b
            com.coloros.anim.u r2 = com.coloros.anim.C1681ac.m5544a(r3, r2)
            goto L2b
        L25:
            java.lang.String r3 = r0.f8367b
            com.coloros.anim.u r2 = com.coloros.anim.C1681ac.m5543a(r2, r3)
        L2b:
            java.lang.Object r3 = r2.m5924a()
            if (r3 == 0) goto L38
            java.lang.Object r2 = r2.m5924a()
            com.coloros.anim.a r2 = (com.coloros.anim.C1638a) r2
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L41
            com.coloros.anim.u r3 = new com.coloros.anim.u
            r3.<init>(r2)
            return r3
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Animation for "
            r2.<init>(r3)
            java.lang.String r3 = r0.f8367b
            r2.append(r3)
            java.lang.String r3 = " not found in cache. Fetching from network."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.coloros.anim.C1692an.m5562a(r2)
            com.coloros.anim.u r2 = r0.m5807a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.anim.p060d.C1769c.m5808a(android.content.Context, java.lang.String):com.coloros.anim.u");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:            com.coloros.anim.C1692an.m5562a("Received json response.");        r1 = com.coloros.anim.p060d.EnumC1767a.JSON;        r0 = com.coloros.anim.C1681ac.m5543a(new java.io.FileInputStream(new java.io.File(r7.f8368c.m5805a(r0.getInputStream(), r1).getAbsolutePath())), r7.f8367b);     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.coloros.anim.C1829u<com.coloros.anim.C1638a> m5807a() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.anim.p060d.C1769c.m5807a():com.coloros.anim.u");
    }
}
