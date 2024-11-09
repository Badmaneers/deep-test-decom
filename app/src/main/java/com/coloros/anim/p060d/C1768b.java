package com.coloros.anim.p060d;

import android.content.Context;
import android.util.Pair;
import com.coloros.anim.C1692an;
import com.coloros.neton.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
/* renamed from: com.coloros.anim.d.b */
/* loaded from: classes.dex */
final class C1768b {

    /* renamed from: a */
    private final Context f8364a;

    /* renamed from: b */
    private final String f8365b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1768b(Context context, String str) {
        this.f8364a = context.getApplicationContext();
        this.f8365b = str;
    }

    /* renamed from: a */
    private static String m5803a(String str, EnumC1767a enumC1767a, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("effective_anim_cache_");
        sb.append(str.replaceAll("\\W+", BuildConfig.FLAVOR));
        if (!z) {
            str2 = enumC1767a.f8363c;
        } else {
            str2 = ".temp" + enumC1767a.f8363c;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair<EnumC1767a, InputStream> m5804a() {
        EnumC1767a enumC1767a;
        try {
            String str = this.f8365b;
            File file = new File(this.f8364a.getCacheDir(), m5803a(str, EnumC1767a.JSON, false));
            if (!file.exists()) {
                file = new File(this.f8364a.getCacheDir(), m5803a(str, EnumC1767a.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(".zip")) {
                    enumC1767a = EnumC1767a.ZIP;
                } else {
                    enumC1767a = EnumC1767a.JSON;
                }
                C1692an.m5562a("Cache hit for " + this.f8365b + " at " + file.getAbsolutePath());
                return new Pair<>(enumC1767a, fileInputStream);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final File m5805a(InputStream inputStream, EnumC1767a enumC1767a) {
        File file = new File(this.f8364a.getCacheDir(), m5803a(this.f8365b, enumC1767a, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5806a(EnumC1767a enumC1767a) {
        File file = new File(this.f8364a.getCacheDir(), m5803a(this.f8365b, enumC1767a, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
        boolean renameTo = file.renameTo(file2);
        C1692an.m5562a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        C1692an.m5563b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }
}
