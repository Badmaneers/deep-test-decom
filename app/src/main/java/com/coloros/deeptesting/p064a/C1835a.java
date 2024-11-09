package com.coloros.deeptesting.p064a;

import android.text.TextUtils;
import com.google.p066a.C2015j;
import java.util.ArrayList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesEncryptUtils.java */
/* renamed from: com.coloros.deeptesting.a.a */
/* loaded from: classes.dex */
public final class C1835a {

    /* renamed from: a */
    private static final String[] f8543a = {"oppo1997", "baed2017", "java7865", "231uiedn", "09e32ji6", "0oiu3jdy", "0pej387l", "2dkliuyt", "20odiuye", "87j3id7w"};

    /* renamed from: b */
    private static Random f8544b = new Random();

    /* renamed from: b */
    public static String m5939b(String str) {
        C1839e c1839e;
        try {
            c1839e = (C1839e) new C2015j().m6220a(str, C1839e.class);
        } catch (Exception unused) {
            C1841g.m5952a("AesEncryptUtils", "parse json response error");
            c1839e = null;
        }
        if (c1839e == null || c1839e.f8559a == null || c1839e.f8559a.length() < 15) {
            return null;
        }
        return m5938a(c1839e.f8559a.substring(0, c1839e.f8559a.length() - 15), m5941c(c1839e.f8559a.substring(c1839e.f8559a.length() - 15, c1839e.f8559a.length())));
    }

    /* renamed from: a */
    private static String m5938a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(C1840f.m5951d(str.getBytes("UTF-8"))), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m5940b(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return C1840f.m5950c(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static String m5941c(String str) {
        return f8543a[m5942d(str.substring(0, 1))] + str.substring(4, 12);
    }

    /* renamed from: d */
    private static int m5942d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    /* renamed from: a */
    private static String m5936a(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 64; i2 <= 90; i2++) {
            arrayList.add(String.valueOf((char) i2));
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            arrayList.add(String.valueOf((char) i3));
        }
        for (int i4 = 33; i4 <= 43; i4++) {
            if (i4 != 34 && i4 != 39 && i4 != 42) {
                arrayList.add(String.valueOf((char) i4));
            }
        }
        arrayList.add("_");
        for (int i5 = 0; i5 < 10; i5++) {
            arrayList.add(String.valueOf(i5));
        }
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        do {
            sb.append((String) arrayList.get(f8544b.nextInt(size - 1) + 1));
            i--;
        } while (i > 0);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m5937a(String str) {
        String str2 = f8544b.nextInt(10) + m5936a(14);
        String m5940b = m5940b(str, m5941c(str2));
        if (m5940b == null) {
            C1841g.m5952a("AesEncryptUtils", "encryptText is null");
            return null;
        }
        return C1842h.m5955a(new C1838d(m5940b + str2));
    }
}
