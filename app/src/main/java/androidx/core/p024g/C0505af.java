package androidx.core.p024g;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: ViewConfigurationCompat.java */
/* renamed from: androidx.core.g.af */
/* loaded from: classes.dex */
public final class C0505af {

    /* renamed from: a */
    private static Method f2344a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2344a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static float m1738a(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return m1742d(viewConfiguration, context);
    }

    /* renamed from: b */
    public static float m1740b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return m1742d(viewConfiguration, context);
    }

    /* renamed from: d */
    private static float m1742d(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 25 && f2344a != null) {
            try {
                return ((Integer) f2344a.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static int m1739a(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: c */
    public static boolean m1741c(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
