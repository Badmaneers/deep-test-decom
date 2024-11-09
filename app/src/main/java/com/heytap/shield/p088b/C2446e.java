package com.heytap.shield.p088b;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: SecurityUtils.java */
/* renamed from: com.heytap.shield.b.e */
/* loaded from: classes.dex */
public class C2446e {

    /* renamed from: a */
    private static final String f10727a = "e";

    /* renamed from: a */
    public static PublicKey m7801a(byte[] bArr, String str) {
        try {
            return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            C2443b.m7791b("convertPublicKey get exception - " + e.getMessage());
            return null;
        }
    }
}
