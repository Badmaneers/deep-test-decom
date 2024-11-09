package com.heytap.shield.p088b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.coloros.neton.BuildConfig;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: CertUtils.java */
/* renamed from: com.heytap.shield.b.a */
/* loaded from: classes.dex */
public class C2442a {

    /* renamed from: a */
    private static final String f10724a = "a";

    /* renamed from: a */
    public static String m7781a(Context context, String str) {
        return m7782a(context, "SHA1", str);
    }

    /* renamed from: b */
    public static String m7786b(Context context, String str) {
        return m7782a(context, "SHA256", str);
    }

    /* renamed from: a */
    private static String m7782a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT < 28) {
            Signature[] m7788d = m7788d(context, str2);
            return (m7788d == null || m7788d.length <= 0) ? BuildConfig.FLAVOR : m7784a(m7788d[0].toByteArray(), str);
        }
        SigningInfo m7787c = m7787c(context, str2);
        if (m7787c == null) {
            return BuildConfig.FLAVOR;
        }
        Signature[] apkContentsSigners = m7787c.getApkContentsSigners();
        if (apkContentsSigners.length == 1) {
            return m7784a(apkContentsSigners[0].toByteArray(), str);
        }
        if (m7787c.hasMultipleSigners()) {
            C2443b.m7792c("has multiple signers");
            String[] strArr = new String[apkContentsSigners.length];
            for (int i = 0; i < apkContentsSigners.length; i++) {
                strArr[i] = m7784a(apkContentsSigners[i].toByteArray(), str);
            }
            Arrays.sort(strArr);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (i2 != strArr.length - 1) {
                    sb.append(strArr[i2]);
                    sb.append(":");
                } else {
                    sb.append(strArr[i2]);
                }
            }
            return sb.toString();
        }
        return m7784a(apkContentsSigners[0].toByteArray(), str);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static SigningInfo m7787c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.signingInfo;
    }

    /* renamed from: d */
    private static Signature[] m7788d(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.signatures;
    }

    /* renamed from: a */
    private static String m7784a(byte[] bArr, String str) {
        CertificateFactory certificateFactory;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        X509Certificate x509Certificate = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (Exception e) {
            e.printStackTrace();
            certificateFactory = null;
        }
        if (certificateFactory != null) {
            try {
                x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            return x509Certificate != null ? m7783a(MessageDigest.getInstance(str).digest(x509Certificate.getEncoded())) : BuildConfig.FLAVOR;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return BuildConfig.FLAVOR;
        } catch (CertificateEncodingException e4) {
            e4.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    private static String m7783a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m7785a(String str, String str2) {
        if (str2.contains(":")) {
            str2 = str2.replaceAll(":", BuildConfig.FLAVOR);
        }
        return (str + str2).getBytes(StandardCharsets.UTF_8);
    }
}
