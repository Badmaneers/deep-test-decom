package com.heytap.shield.authcode;

import android.content.Context;
import android.text.TextUtils;
import com.coloros.neton.BuildConfig;
import com.heytap.shield.authcode.dao.AuthenticationDb;
import com.heytap.shield.authcode.dao.C2439f;
import com.heytap.shield.authcode.p087a.C2430a;
import com.heytap.shield.p088b.C2443b;
import com.heytap.shield.p088b.C2444c;
import com.heytap.shield.p088b.C2445d;
import com.heytap.shield.p088b.C2447f;
import com.heytap.shield.p088b.C2448g;
import java.util.Base64;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.Executors;

/* compiled from: Authentication.java */
/* renamed from: com.heytap.shield.authcode.b */
/* loaded from: classes.dex */
public final class C2432b {
    /* renamed from: a */
    public static C2430a m7746a(final Context context, final String str) {
        final int m7793a = C2444c.m7793a(context, str);
        if (TextUtils.isEmpty(str)) {
            C2443b.m7792c("get target packageName is empty");
            return new C2430a(BuildConfig.FLAVOR, 1004, new byte[0]);
        }
        final String m7796a = C2444c.m7796a(context, str, "AppPlatformKey");
        if (TextUtils.isEmpty(m7796a)) {
            C2443b.m7792c("get target application authCode is empty");
            return new C2430a(BuildConfig.FLAVOR, 1004, new byte[0]);
        }
        try {
            byte[] decode = Base64.getDecoder().decode(m7796a);
            byte[] bArr = {decode[0]};
            byte[] bArr2 = {8};
            int m7803a = C2448g.m7803a(C2445d.m7797a(decode));
            final byte[] m7798a = C2445d.m7798a(decode, m7803a);
            byte[] m7799b = C2445d.m7799b(decode, m7803a);
            if (!C2447f.m7802a(context, str, bArr, m7803a, bArr2, m7799b, m7798a, C2445d.m7800c(decode, m7803a))) {
                C2443b.m7792c("signature verify failed.");
                return new C2430a(str, 1002, new byte[0]);
            }
            int i = ((m7799b[0] << 24) & (-16777216)) | ((m7799b[1] << 16) & 16711680) | ((m7799b[2] << 8) & 65280) | (m7799b[3] & 255);
            final GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(i * 1000);
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.heytap.shield.authcode.-$$Lambda$b$u6FvGzVma1KFU9x86u6sff2K6OY
                @Override // java.lang.Runnable
                public final void run() {
                    C2432b.m7747a(m7796a, m7793a, str, gregorianCalendar, m7798a, context);
                }
            });
            C2443b.m7792c("Auth code check ok");
            return new C2430a(str, 1001, m7798a);
        } catch (Exception e) {
            C2443b.m7791b("check key get exception " + e.getMessage());
            return new C2430a(str, 1002, new byte[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m7747a(String str, int i, String str2, Calendar calendar, byte[] bArr, Context context) {
        AuthenticationDb.m7749a(context).mo7750l().mo7763a(new C2439f(str, true, i, str2, "APP_PLATFORM_CLIENT", calendar.getTimeInMillis(), bArr, System.currentTimeMillis(), 0L));
    }
}
