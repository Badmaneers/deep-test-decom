package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import androidx.core.content.p020a.C0425e;
import androidx.core.content.p020a.C0426f;
import androidx.core.p021d.C0446h;
import java.io.IOException;
import java.io.InputStream;
import neton.client.Utils.ResponseCode;

/* compiled from: TypefaceCompatApi29Impl.java */
/* renamed from: androidx.core.graphics.j */
/* loaded from: classes.dex */
public final class C0557j extends C0558k {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final C0446h mo1969a(C0446h[] c0446hArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1968a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface mo1954a(android.content.Context r10, androidx.core.p021d.C0446h[] r11, int r12) {
        /*
            r9 = this;
            android.content.ContentResolver r9 = r10.getContentResolver()
            int r10 = r11.length
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L9:
            if (r2 >= r10) goto L6c
            r4 = r11[r2]
            android.net.Uri r5 = r4.m1568a()     // Catch: java.io.IOException -> L69
            java.lang.String r6 = "r"
            android.os.ParcelFileDescriptor r5 = r9.openFileDescriptor(r5, r6, r1)     // Catch: java.io.IOException -> L69
            if (r5 != 0) goto L1f
            if (r5 == 0) goto L69
        L1b:
            r5.close()     // Catch: java.io.IOException -> L69
            goto L69
        L1f:
            android.graphics.fonts.Font$Builder r6 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            int r7 = r4.m1570c()     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            android.graphics.fonts.Font$Builder r6 = r6.setWeight(r7)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            boolean r7 = r4.m1571d()     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            android.graphics.fonts.Font$Builder r6 = r6.setSlant(r7)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            int r4 = r4.m1569b()     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            android.graphics.fonts.Font$Builder r4 = r6.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            if (r3 != 0) goto L49
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
            r3 = r6
            goto L4c
        L49:
            r3.addFont(r4)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52
        L4c:
            if (r5 == 0) goto L69
            goto L1b
        L4f:
            r4 = move-exception
            r6 = r1
            goto L58
        L52:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L54
        L54:
            r6 = move-exception
            r8 = r6
            r6 = r4
            r4 = r8
        L58:
            if (r5 == 0) goto L68
            if (r6 == 0) goto L65
            r5.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L69
            goto L68
        L60:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.io.IOException -> L69
            goto L68
        L65:
            r5.close()     // Catch: java.io.IOException -> L69
        L68:
            throw r4     // Catch: java.io.IOException -> L69
        L69:
            int r2 = r2 + 1
            goto L9
        L6c:
            if (r3 != 0) goto L6f
            return r1
        L6f:
            android.graphics.fonts.FontStyle r9 = new android.graphics.fonts.FontStyle
            r10 = r12 & 1
            if (r10 == 0) goto L78
            r10 = 700(0x2bc, float:9.81E-43)
            goto L7a
        L78:
            r10 = 400(0x190, float:5.6E-43)
        L7a:
            r11 = r12 & 2
            if (r11 == 0) goto L7f
            r0 = 1
        L7f:
            r9.<init>(r10, r0)
            android.graphics.Typeface$CustomFallbackBuilder r10 = new android.graphics.Typeface$CustomFallbackBuilder
            android.graphics.fonts.FontFamily r11 = r3.build()
            r10.<init>(r11)
            android.graphics.Typeface$CustomFallbackBuilder r9 = r10.setStyle(r9)
            android.graphics.Typeface r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0557j.mo1954a(android.content.Context, androidx.core.d.h[], int):android.graphics.Typeface");
    }

    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1953a(Context context, C0425e c0425e, Resources resources, int i) {
        FontFamily.Builder builder = null;
        for (C0426f c0426f : c0425e.m1509a()) {
            try {
                Font build = new Font.Builder(resources, c0426f.m1515f()).setWeight(c0426f.m1511b()).setSlant(c0426f.m1512c() ? 1 : 0).setTtcIndex(c0426f.m1514e()).setFontVariationSettings(c0426f.m1513d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : ResponseCode.CODE_4XX_BAD_REQUEST, (i & 2) != 0 ? 1 : 0)).build();
    }

    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1965a(Context context, Resources resources, int i, String str, int i2) {
        try {
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(new Font.Builder(resources, i).build()).build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : ResponseCode.CODE_4XX_BAD_REQUEST, (i2 & 2) != 0 ? 1 : 0)).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
