package com.color.support.util;

import android.content.Context;
import android.os.Build;
import android.view.View;

/* compiled from: ColorDarkModeUtil.java */
/* renamed from: com.color.support.util.c */
/* loaded from: classes.dex */
public final class C1338c {
    /* renamed from: a */
    public static boolean m4376a(Context context) {
        return 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    /* renamed from: a */
    public static void m4375a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setForceDarkAllowed(z);
        }
    }
}
