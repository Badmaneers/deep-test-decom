package com.heytap.shield.p088b;

import android.content.Context;
import com.heytap.shield.authcode.p087a.C2431b;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Base64;

/* compiled from: SignVerifyUtils.java */
/* renamed from: com.heytap.shield.b.f */
/* loaded from: classes.dex */
public final class C2447f {

    /* renamed from: a */
    private static final String f10728a = Signature.class.getSimpleName();

    /* renamed from: a */
    public static boolean m7802a(Context context, String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        boolean z;
        PublicKey m7801a;
        byte[] m7785a = C2442a.m7785a(str, C2442a.m7781a(context, str));
        byte[] bArr6 = new byte[m7785a.length + i + 10];
        C2448g.m7805a(bArr, 0, bArr6, 0, 1);
        C2448g.m7805a(bArr2, 0, bArr6, 1, 1);
        C2448g.m7805a(m7785a, 0, bArr6, 2, m7785a.length);
        C2448g.m7805a(bArr3, 0, bArr6, m7785a.length + 2, 4);
        C2448g.m7805a(bArr4, 0, bArr6, m7785a.length + 6, i);
        C2448g.m7805a(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)}, 0, bArr6, m7785a.length + i + 6, 4);
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            ArrayList arrayList = new ArrayList();
            C2431b c2431b = new C2431b();
            c2431b.m7743a("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEvE0DoqARwzQKOb/b0cx7B0BQ4Ux8mTdND8rX9KHproZAuOP/M049VdcJ53sjVujUF1URD4IGMtkId2QYwXoDHw==");
            c2431b.m7745b("OK");
            arrayList.add(c2431b);
            z = false;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    if ("OK".equals(((C2431b) arrayList.get(i2)).m7744b()) && (m7801a = C2446e.m7801a(Base64.getDecoder().decode(((C2431b) arrayList.get(i2)).m7742a()), "EC")) != null) {
                        signature.initVerify(m7801a);
                        signature.update(bArr6);
                        boolean verify = signature.verify(bArr5);
                        if (verify) {
                            return verify;
                        }
                        z = verify;
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                    e = e;
                    e.printStackTrace();
                    C2443b.m7791b("verify signing get an exception is " + e.getMessage());
                    return z;
                }
            }
            return z;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
            e = e2;
            z = false;
        }
    }
}
