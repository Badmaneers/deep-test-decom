package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.io.File;

/* compiled from: ContextCompat.java */
/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0420a {

    /* renamed from: a */
    private static final Object f2153a = new Object();

    /* renamed from: b */
    private static TypedValue f2154b;

    /* renamed from: a */
    public static boolean m1484a(Context context, Intent[] intentArr) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, null);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: a */
    public static File[] m1485a(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(null);
        }
        return new File[]{context.getExternalFilesDir(null)};
    }

    /* renamed from: b */
    public static File[] m1487b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: a */
    public static Drawable m1483a(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f2153a) {
            if (f2154b == null) {
                f2154b = new TypedValue();
            }
            context.getResources().getValue(i, f2154b, true);
            i2 = f2154b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: b */
    public static ColorStateList m1486b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static int m1488c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static Context m1489c(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }
}
