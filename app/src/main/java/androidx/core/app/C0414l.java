package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* compiled from: NavUtils.java */
/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public final class C0414l {
    /* renamed from: a */
    public static Intent m1469a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String m1471b = m1471b(activity);
        if (m1471b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m1471b);
        try {
            if (m1472b(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m1471b + "' in manifest");
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m1470a(Context context, ComponentName componentName) {
        String m1472b = m1472b(context, componentName);
        if (m1472b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m1472b);
        if (m1472b(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: b */
    public static String m1471b(Activity activity) {
        try {
            return m1472b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    private static String m1472b(Context context, ComponentName componentName) {
        int i;
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
