package com.color.support.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: ColorOrientationUtil.java */
/* renamed from: com.color.support.util.g */
/* loaded from: classes.dex */
public final class C1342g {
    /* renamed from: a */
    public static boolean m4384a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public static boolean m4385a(Context context) {
        return m4386b(context) == 1;
    }

    /* renamed from: b */
    public static int m4386b(Context context) {
        Point m4387c = m4387c(context);
        return (m4387c.x <= m4387c.y || m4388d(context)) ? 1 : 2;
    }

    /* renamed from: c */
    private static Point m4387c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: d */
    private static boolean m4388d(Context context) {
        if (!(context instanceof Activity) || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return ((Activity) context).isInMultiWindowMode();
    }
}
