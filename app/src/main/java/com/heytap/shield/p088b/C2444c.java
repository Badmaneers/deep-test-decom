package com.heytap.shield.p088b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.coloros.neton.BuildConfig;

/* compiled from: PackageUtils.java */
/* renamed from: com.heytap.shield.b.c */
/* loaded from: classes.dex */
public class C2444c {

    /* renamed from: a */
    private static final String f10726a = "c";

    /* renamed from: a */
    public static int m7793a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).uid;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    private static String m7794a(Context context, int i) {
        String str;
        String str2 = BuildConfig.FLAVOR;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                try {
                    if (runningAppProcessInfo.pid == i) {
                        if (runningAppProcessInfo.pkgList != null && runningAppProcessInfo.pkgList.length != 0) {
                            str = runningAppProcessInfo.pkgList[0];
                        } else {
                            str = runningAppProcessInfo.processName;
                            try {
                                if (str.contains(":")) {
                                    str2 = str.substring(0, str.indexOf(":"));
                                }
                            } catch (Exception e) {
                                e = e;
                                str2 = str;
                                C2443b.m7791b("get exception " + e.getMessage());
                            }
                        }
                        str2 = str;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static String m7795a(Context context, int i, int i2) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length == 1) {
            return packagesForUid[0];
        }
        return m7794a(context, i2);
    }

    /* renamed from: a */
    public static String m7796a(Context context, String str, String str2) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            return (bundle == null || !bundle.containsKey(str2)) ? BuildConfig.FLAVOR : bundle.getString(str2);
        } catch (PackageManager.NameNotFoundException e) {
            C2443b.m7791b("Unable to fetch metadata from teh manifest " + e.getMessage());
            throw new RuntimeException("Unable to fetch metadata from teh manifest", e);
        }
    }
}
