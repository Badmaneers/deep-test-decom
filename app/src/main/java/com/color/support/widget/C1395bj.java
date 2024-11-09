package com.color.support.widget;

import com.coloros.neton.BuildConfig;
import java.util.List;

/* compiled from: ColorLockPatternUtils.java */
/* renamed from: com.color.support.widget.bj */
/* loaded from: classes.dex */
public final class C1395bj {
    /* renamed from: a */
    public static String m4915a(List<C1404bs> list) {
        if (list == null) {
            return BuildConfig.FLAVOR;
        }
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            C1404bs c1404bs = list.get(i);
            bArr[i] = (byte) ((c1404bs.m4920a() * 3) + c1404bs.m4921b() + 49);
        }
        return new String(bArr);
    }
}
