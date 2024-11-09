package com.color.support.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* compiled from: ColorPanelMultiWindowUtils.java */
/* renamed from: com.color.support.util.h */
/* loaded from: classes.dex */
public final class C1343h {
    /* renamed from: a */
    public static int m4389a(Activity activity) {
        Rect rect;
        if (activity == null) {
            return 0;
        }
        if (!m4392b(activity)) {
            return m4390a((Context) activity);
        }
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
        } else {
            rect = null;
        }
        if (rect != null) {
            return rect.bottom - rect.top;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m4390a(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int m4393c = m4393c(context);
        int m4395d = m4395d(context);
        if (C1340e.m4380a(context) && m4396e(context)) {
            i = C1340e.m4381b(context);
        }
        return (m4393c - m4395d) - i;
    }

    /* renamed from: b */
    public static boolean m4392b(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity != null && activity.isInMultiWindowMode();
    }

    /* renamed from: c */
    public static boolean m4394c(Activity activity) {
        if (activity == null) {
            return true;
        }
        View decorView = activity.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return rect.top <= m4395d(activity);
    }

    /* renamed from: b */
    public static Activity m4391b(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: c */
    public static int m4393c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        return point.y;
    }

    /* renamed from: d */
    private static int m4395d(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    private static boolean m4396e(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}
