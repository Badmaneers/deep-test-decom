package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: DrawableCompat.java */
/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0546a {

    /* renamed from: a */
    private static Method f2409a;

    /* renamed from: b */
    private static boolean f2410b;

    /* renamed from: c */
    private static Method f2411c;

    /* renamed from: d */
    private static boolean f2412d;

    /* renamed from: a */
    public static void m1926a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static boolean m1927a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: a */
    public static void m1919a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1921a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1920a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0547b) {
            ((InterfaceC0547b) drawable).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1922a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0547b) {
            ((InterfaceC0547b) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1925a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0547b) {
            ((InterfaceC0547b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: b */
    public static int m1928b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m1923a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: c */
    public static boolean m1930c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: d */
    public static ColorFilter m1931d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static void m1932e(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        while (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof InterfaceC0548c) {
                drawable = ((InterfaceC0548c) drawable).mo1936a();
            } else {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        m1932e(child);
                    }
                }
                return;
            }
        }
        drawable.clearColorFilter();
    }

    /* renamed from: a */
    public static void m1924a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: f */
    public static Drawable m1933f(Drawable drawable) {
        return Build.VERSION.SDK_INT >= 23 ? drawable : Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof InterfaceC0547b) ? new C0550e(drawable) : drawable : !(drawable instanceof InterfaceC0547b) ? new C0549d(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static <T extends Drawable> T m1934g(Drawable drawable) {
        return drawable instanceof InterfaceC0548c ? (T) ((InterfaceC0548c) drawable).mo1936a() : drawable;
    }

    /* renamed from: b */
    public static boolean m1929b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f2410b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2409a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f2410b = true;
        }
        if (f2409a != null) {
            try {
                f2409a.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f2409a = null;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static int m1935h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f2412d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2411c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f2412d = true;
        }
        if (f2411c != null) {
            try {
                return ((Integer) f2411c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f2411c = null;
            }
        }
        return 0;
    }
}
