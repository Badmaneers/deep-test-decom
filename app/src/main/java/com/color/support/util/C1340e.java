package com.color.support.util;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;

/* compiled from: ColorNavigationBarUtil.java */
/* renamed from: com.color.support.util.e */
/* loaded from: classes.dex */
public final class C1340e {

    /* renamed from: a */
    private static final Uri f5820a = Settings.Secure.getUriFor("nav_bar_immersive");

    /* renamed from: c */
    private static boolean m4382c(Context context) {
        String str;
        if (context == null) {
            return false;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
        } catch (Exception e) {
            Log.d("NavigationBarUtils", "fail to get navigation bar status message is " + e.getMessage());
        }
        if ("1".equals(str)) {
            return false;
        }
        if ("0".equals(str)) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m4380a(Context context) {
        if (!m4382c(context)) {
            return false;
        }
        int i = Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0);
        return i == 0 || (i == 1 && Settings.Secure.getInt(context.getContentResolver(), "manual_hide_navigationbar", 0) == 0);
    }

    /* renamed from: b */
    public static int m4381b(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }
}
