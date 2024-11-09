package androidx.core.p024g;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewParentCompat.java */
/* renamed from: androidx.core.g.ag */
/* loaded from: classes.dex */
public final class C0506ag {
    @Deprecated
    /* renamed from: a */
    public static boolean m1749a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m1748a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0531p) {
            return ((InterfaceC0531p) viewParent).mo527a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }
        if (viewParent instanceof InterfaceC0530o) {
            return ((InterfaceC0530o) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* renamed from: b */
    public static void m1750b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0531p) {
            ((InterfaceC0531p) viewParent).mo529b(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0530o) {
                ((InterfaceC0530o) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static void m1743a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0531p) {
            ((InterfaceC0531p) viewParent).mo522a(view, i);
            return;
        }
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0530o) {
                ((InterfaceC0530o) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static void m1744a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof InterfaceC0532q) {
            ((InterfaceC0532q) viewParent).mo524a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC0531p) {
            ((InterfaceC0531p) viewParent).mo523a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0530o) {
                ((InterfaceC0530o) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m1745a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0531p) {
            ((InterfaceC0531p) viewParent).mo525a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0530o) {
                ((InterfaceC0530o) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static boolean m1747a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        }
        if (viewParent instanceof InterfaceC0530o) {
            return ((InterfaceC0530o) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m1746a(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        }
        if (viewParent instanceof InterfaceC0530o) {
            return ((InterfaceC0530o) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }
}
