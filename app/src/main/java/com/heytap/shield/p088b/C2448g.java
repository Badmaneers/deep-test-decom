package com.heytap.shield.p088b;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: SystemUtils.java */
/* renamed from: com.heytap.shield.b.g */
/* loaded from: classes.dex */
public final class C2448g {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7805a(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* renamed from: a */
    public static int m7803a(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    /* renamed from: a */
    public static List<String> m7804a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return arrayList;
    }
}
