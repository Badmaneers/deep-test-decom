package androidx.core.p024g;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.R;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.InterfaceC0491l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.w */
/* loaded from: classes.dex */
public final class C0538w {

    /* renamed from: b */
    private static Field f2382b;

    /* renamed from: c */
    private static boolean f2383c;

    /* renamed from: d */
    private static Field f2384d;

    /* renamed from: e */
    private static boolean f2385e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f2386f;

    /* renamed from: h */
    private static Field f2388h;

    /* renamed from: j */
    private static ThreadLocal<Rect> f2390j;

    /* renamed from: a */
    private static final AtomicInteger f2381a = new AtomicInteger(1);

    /* renamed from: g */
    private static WeakHashMap<View, C0507ah> f2387g = null;

    /* renamed from: i */
    private static boolean f2389i = false;

    /* renamed from: k */
    private static final int[] f2391k = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: l */
    private static ViewOnAttachStateChangeListenerC0501ab f2392l = new ViewOnAttachStateChangeListenerC0501ab();

    /* renamed from: b */
    private static Rect m1858b() {
        if (f2390j == null) {
            f2390j = new ThreadLocal<>();
        }
        Rect rect = f2390j.get();
        if (rect == null) {
            rect = new Rect();
            f2390j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static void m1847a(View view, C0482c c0482c) {
        view.onInitializeAccessibilityNodeInfo(c0482c.m1645a());
    }

    /* renamed from: a */
    public static void m1849a(View view, C0479a c0479a) {
        if (c0479a == null && (m1829M(view) instanceof C0515b)) {
            c0479a = new C0479a();
        }
        view.setAccessibilityDelegate(c0479a == null ? null : c0479a.getBridge());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m1836a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m1860b(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    /* renamed from: c */
    public static C0479a m1866c(View view) {
        View.AccessibilityDelegate m1829M = m1829M(view);
        if (m1829M == null) {
            return null;
        }
        if (m1829M instanceof C0515b) {
            return ((C0515b) m1829M).f2358a;
        }
        return new C0479a(m1829M);
    }

    /* renamed from: d */
    public static C0479a m1870d(View view) {
        C0479a m1866c = m1866c(view);
        if (m1866c == null) {
            m1866c = new C0479a();
        }
        m1849a(view, m1866c);
        return m1866c;
    }

    /* renamed from: M */
    private static View.AccessibilityDelegate m1829M(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m1830N(view);
    }

    /* renamed from: N */
    private static View.AccessibilityDelegate m1830N(View view) {
        if (f2389i) {
            return null;
        }
        if (f2388h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2388h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2389i = true;
                return null;
            }
        }
        try {
            Object obj = f2388h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2389i = true;
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m1873e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: a */
    public static void m1855a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: f */
    public static void m1874f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    public static void m1841a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1852a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m1853a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: g */
    public static int m1876g(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m1840a(View view, int i) {
        if (Build.VERSION.SDK_INT < 19) {
            if (Build.VERSION.SDK_INT < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: a */
    public static boolean m1856a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public static void m1848a(View view, C0483d c0483d, InterfaceC0491l interfaceC0491l) {
        if (interfaceC0491l == null) {
            m1862b(view, c0483d.m1709a());
            return;
        }
        C0483d m1710a = c0483d.m1710a(interfaceC0491l);
        if (Build.VERSION.SDK_INT >= 21) {
            m1870d(view);
            m1838a(m1710a.m1709a(), view);
            m1831O(view).add(m1710a);
            m1875f(view, 0);
        }
    }

    /* renamed from: b */
    public static void m1862b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m1838a(i, view);
            m1875f(view, 0);
        }
    }

    /* renamed from: a */
    private static void m1838a(int i, View view) {
        List<C0483d> m1831O = m1831O(view);
        for (int i2 = 0; i2 < m1831O.size(); i2++) {
            if (m1831O.get(i2).m1709a() == i) {
                m1831O.remove(i2);
                return;
            }
        }
    }

    /* renamed from: O */
    private static List<C0483d> m1831O(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public static void m1843a(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
        } else {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }
    }

    /* renamed from: h */
    public static int m1878h(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: i */
    public static ViewParent m1880i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    @Deprecated
    /* renamed from: a */
    public static int m1835a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    @Deprecated
    /* renamed from: j */
    public static int m1881j(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: P */
    private static int m1832P(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: k */
    public static void m1882k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(1);
        }
    }

    /* renamed from: l */
    public static int m1883l(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: m */
    public static int m1884m(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: b */
    public static void m1863b(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: n */
    public static int m1885n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f2383c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2382b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2383c = true;
        }
        if (f2382b == null) {
            return 0;
        }
        try {
            return ((Integer) f2382b.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: o */
    public static int m1886o(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f2385e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2384d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2385e = true;
        }
        if (f2384d == null) {
            return 0;
        }
        try {
            return ((Integer) f2384d.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: p */
    public static C0507ah m1887p(View view) {
        if (f2387g == null) {
            f2387g = new WeakHashMap<>();
        }
        C0507ah c0507ah = f2387g.get(view);
        if (c0507ah != null) {
            return c0507ah;
        }
        C0507ah c0507ah2 = new C0507ah(view);
        f2387g.put(view, c0507ah2);
        return c0507ah2;
    }

    /* renamed from: a */
    public static void m1839a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: q */
    public static float m1888q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static void m1861b(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: r */
    public static float m1889r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m1854a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2386f == null) {
            f2386f = new WeakHashMap<>();
        }
        f2386f.put(view, str);
    }

    /* renamed from: s */
    public static String m1890s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        if (f2386f == null) {
            return null;
        }
        return f2386f.get(view);
    }

    /* renamed from: t */
    public static int m1891t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: u */
    public static void m1892u(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: v */
    public static boolean m1893v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static void m1864b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static void m1850a(View view, InterfaceC0534s interfaceC0534s) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (interfaceC0534s == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0539x(interfaceC0534s));
            }
        }
    }

    /* renamed from: a */
    public static C0514ao m1837a(View view, C0514ao c0514ao) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0514ao;
        }
        WindowInsets m1772h = c0514ao.m1772h();
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(m1772h);
        if (!onApplyWindowInsets.equals(m1772h)) {
            m1772h = new WindowInsets(onApplyWindowInsets);
        }
        return C0514ao.m1763a(m1772h);
    }

    /* renamed from: b */
    public static C0514ao m1859b(View view, C0514ao c0514ao) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0514ao;
        }
        WindowInsets m1772h = c0514ao.m1772h();
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(m1772h);
        if (!dispatchApplyWindowInsets.equals(m1772h)) {
            m1772h = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0514ao.m1763a(m1772h);
    }

    /* renamed from: w */
    public static boolean m1894w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m1895x(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: a */
    public static void m1846a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static ColorStateList m1896y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0537v) {
            return ((InterfaceC0537v) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1842a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof InterfaceC0537v) {
            ((InterfaceC0537v) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static PorterDuff.Mode m1897z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceC0537v) {
            return ((InterfaceC0537v) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1844a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof InterfaceC0537v) {
            ((InterfaceC0537v) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m1817A(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC0526k) {
            return ((InterfaceC0526k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static void m1818B(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC0526k) {
            ((InterfaceC0526k) view).stopNestedScroll();
        }
    }

    /* renamed from: C */
    public static boolean m1819C(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: D */
    public static float m1820D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m1868c(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    /* renamed from: c */
    public static void m1869c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Rect m1858b = m1858b();
            boolean z = false;
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m1858b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m1858b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m1877g(view, i);
            if (z && m1858b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m1858b);
                return;
            }
            return;
        }
        m1877g(view, i);
    }

    /* renamed from: g */
    private static void m1877g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m1833Q(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m1833Q((View) parent);
            }
        }
    }

    /* renamed from: d */
    public static void m1871d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Rect m1858b = m1858b();
            boolean z = false;
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m1858b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m1858b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m1879h(view, i);
            if (z && m1858b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m1858b);
                return;
            }
            return;
        }
        m1879h(view, i);
    }

    /* renamed from: h */
    private static void m1879h(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m1833Q(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m1833Q((View) parent);
            }
        }
    }

    /* renamed from: Q */
    private static void m1833Q(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static void m1845a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: E */
    public static Rect m1821E(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: F */
    public static boolean m1822F(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: G */
    public static boolean m1823G(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: e */
    public static void m1872e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    /* renamed from: a */
    public static void m1851a(View view, C0536u c0536u) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c0536u != null ? c0536u.m1816a() : null));
        }
    }

    /* renamed from: H */
    public static Display m1824H(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m1822F(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    public static int m1834a() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f2381a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f2381a.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static boolean m1857a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0504ae.m1733a(view).m1736a(keyEvent);
    }

    /* renamed from: b */
    public static boolean m1865b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0504ae.m1733a(view).m1737a(view, keyEvent);
    }

    /* renamed from: K */
    public static boolean m1827K(View view) {
        Boolean m1729b = m1867c().m1729b(view);
        if (m1729b == null) {
            return false;
        }
        return m1729b.booleanValue();
    }

    /* renamed from: L */
    public static void m1828L(View view) {
        m1867c().m1730b(view, Boolean.TRUE);
    }

    /* renamed from: c */
    private static AbstractC0502ac<Boolean> m1867c() {
        return new C0500aa(R.id.tag_accessibility_heading, Boolean.class);
    }

    /* renamed from: f */
    public static void m1875f(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m1826J(view) != null;
            if (m1832P(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: I */
    public static boolean m1825I(View view) {
        Boolean m1729b = new C0540y(R.id.tag_screen_reader_focusable, Boolean.class).m1729b(view);
        if (m1729b == null) {
            return false;
        }
        return m1729b.booleanValue();
    }

    /* renamed from: J */
    public static CharSequence m1826J(View view) {
        return new C0541z(R.id.tag_accessibility_pane_title, CharSequence.class).m1729b(view);
    }
}
