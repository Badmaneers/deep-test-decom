package androidx.core.p024g.p025a;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: androidx.core.g.a.d */
/* loaded from: classes.dex */
public final class C0483d {

    /* renamed from: A */
    public static final C0483d f2288A;

    /* renamed from: B */
    public static final C0483d f2289B;

    /* renamed from: C */
    public static final C0483d f2290C;

    /* renamed from: D */
    public static final C0483d f2291D;

    /* renamed from: E */
    public static final C0483d f2292E;

    /* renamed from: F */
    public static final C0483d f2293F;

    /* renamed from: G */
    public static final C0483d f2294G;

    /* renamed from: H */
    public static final C0483d f2295H;

    /* renamed from: I */
    public static final C0483d f2296I;

    /* renamed from: J */
    public static final C0483d f2297J;

    /* renamed from: K */
    public static final C0483d f2298K;

    /* renamed from: a */
    public static final C0483d f2299a = new C0483d(1);

    /* renamed from: b */
    public static final C0483d f2300b = new C0483d(2);

    /* renamed from: c */
    public static final C0483d f2301c = new C0483d(4);

    /* renamed from: d */
    public static final C0483d f2302d = new C0483d(8);

    /* renamed from: e */
    public static final C0483d f2303e = new C0483d(16);

    /* renamed from: f */
    public static final C0483d f2304f = new C0483d(32);

    /* renamed from: g */
    public static final C0483d f2305g = new C0483d(64);

    /* renamed from: h */
    public static final C0483d f2306h = new C0483d(128);

    /* renamed from: i */
    public static final C0483d f2307i = new C0483d(256, C0493n.class);

    /* renamed from: j */
    public static final C0483d f2308j = new C0483d(512, C0493n.class);

    /* renamed from: k */
    public static final C0483d f2309k = new C0483d(1024, C0494o.class);

    /* renamed from: l */
    public static final C0483d f2310l = new C0483d(2048, C0494o.class);

    /* renamed from: m */
    public static final C0483d f2311m = new C0483d(4096);

    /* renamed from: n */
    public static final C0483d f2312n = new C0483d(8192);

    /* renamed from: o */
    public static final C0483d f2313o = new C0483d(16384);

    /* renamed from: p */
    public static final C0483d f2314p = new C0483d(32768);

    /* renamed from: q */
    public static final C0483d f2315q = new C0483d(65536);

    /* renamed from: r */
    public static final C0483d f2316r = new C0483d(131072, C0498s.class);

    /* renamed from: s */
    public static final C0483d f2317s = new C0483d(262144);

    /* renamed from: t */
    public static final C0483d f2318t = new C0483d(524288);

    /* renamed from: u */
    public static final C0483d f2319u = new C0483d(1048576);

    /* renamed from: v */
    public static final C0483d f2320v = new C0483d(2097152, C0499t.class);

    /* renamed from: w */
    public static final C0483d f2321w;

    /* renamed from: x */
    public static final C0483d f2322x;

    /* renamed from: y */
    public static final C0483d f2323y;

    /* renamed from: z */
    public static final C0483d f2324z;

    /* renamed from: L */
    final Object f2325L;

    /* renamed from: M */
    protected final InterfaceC0491l f2326M;

    /* renamed from: N */
    private final int f2327N;

    /* renamed from: O */
    private final Class<? extends AbstractC0492m> f2328O;

    static {
        f2321w = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null);
        f2322x = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, C0496q.class);
        f2323y = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null);
        f2324z = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null);
        f2288A = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null);
        f2289B = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null);
        f2290C = new C0483d(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        f2291D = new C0483d(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        f2292E = new C0483d(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        f2293F = new C0483d(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        f2294G = new C0483d(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null);
        f2295H = new C0483d(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, C0497r.class);
        f2296I = new C0483d(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, C0495p.class);
        f2297J = new C0483d(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        f2298K = new C0483d(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
    }

    public C0483d(int i) {
        this(null, i, null, null);
    }

    public C0483d(Object obj) {
        this(obj, 0, null, null);
    }

    private C0483d(int i, Class<? extends AbstractC0492m> cls) {
        this(null, i, null, cls);
    }

    private C0483d(Object obj, int i, InterfaceC0491l interfaceC0491l, Class<? extends AbstractC0492m> cls) {
        this.f2327N = i;
        this.f2326M = interfaceC0491l;
        if (Build.VERSION.SDK_INT >= 21 && obj == null) {
            this.f2325L = new AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            this.f2325L = obj;
        }
        this.f2328O = cls;
    }

    /* renamed from: a */
    public final int m1709a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2325L).getId();
        }
        return 0;
    }

    /* renamed from: b */
    public final CharSequence m1712b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2325L).getLabel();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m1711a(View view, Bundle bundle) {
        if (this.f2326M == null) {
            return false;
        }
        if (this.f2328O != null) {
            try {
                this.f2328O.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).f2335a = bundle;
            } catch (Exception e) {
                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(this.f2328O == null ? "null" : this.f2328O.getName())), e);
            }
        }
        return this.f2326M.mo1722a(view);
    }

    /* renamed from: a */
    public final C0483d m1710a(InterfaceC0491l interfaceC0491l) {
        return new C0483d(null, this.f2327N, interfaceC0491l, this.f2328O);
    }

    public final int hashCode() {
        if (this.f2325L != null) {
            return this.f2325L.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0483d)) {
            return false;
        }
        C0483d c0483d = (C0483d) obj;
        return this.f2325L == null ? c0483d.f2325L == null : this.f2325L.equals(c0483d.f2325L);
    }
}
