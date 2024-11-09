package androidx.customview.p027a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: FocusStrategy.java */
/* renamed from: androidx.customview.a.e */
/* loaded from: classes.dex */
final class C0586e {
    /* renamed from: a */
    private static int m2089a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m2090a(L l, InterfaceC0588g<L, T> interfaceC0588g, InterfaceC0587f<T> interfaceC0587f, T t, int i, boolean z) {
        int mo2087a = interfaceC0588g.mo2087a(l);
        ArrayList arrayList = new ArrayList(mo2087a);
        for (int i2 = 0; i2 < mo2087a; i2++) {
            arrayList.add(interfaceC0588g.mo2088a(l, i2));
        }
        Collections.sort(arrayList, new C0589h(z, interfaceC0587f));
        switch (i) {
            case 1:
                int size = arrayList.size();
                if (t != null) {
                    size = arrayList.indexOf(t);
                }
                int i3 = size - 1;
                if (i3 >= 0) {
                    return (T) arrayList.get(i3);
                }
                return null;
            case 2:
                int size2 = arrayList.size();
                int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
                if (lastIndexOf < size2) {
                    return (T) arrayList.get(lastIndexOf);
                }
                return null;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
    }

    /* renamed from: a */
    public static <L, T> T m2091a(L l, InterfaceC0588g<L, T> interfaceC0588g, InterfaceC0587f<T> interfaceC0587f, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int mo2087a = interfaceC0588g.mo2087a(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < mo2087a; i2++) {
            T mo2088a = interfaceC0588g.mo2088a(l, i2);
            if (mo2088a != t) {
                interfaceC0587f.mo2086a(mo2088a, rect3);
                if (m2094a(rect, rect3, i) && (!m2094a(rect, rect2, i) || m2093a(i, rect, rect3, rect2) || (!m2093a(i, rect, rect2, rect3) && m2089a(m2096c(i, rect, rect3), m2100g(i, rect, rect3)) < m2089a(m2096c(i, rect, rect2), m2100g(i, rect, rect2))))) {
                    rect2.set(rect3);
                    t2 = mo2088a;
                }
            }
        }
        return t2;
    }

    /* renamed from: a */
    private static boolean m2093a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m2092a = m2092a(i, rect, rect2);
        if (m2092a(i, rect, rect3) || !m2092a) {
            return false;
        }
        return !m2095b(i, rect, rect3) || i == 17 || i == 66 || m2096c(i, rect, rect2) < m2098e(i, rect, rect3);
    }

    /* renamed from: a */
    private static boolean m2094a(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: a */
    private static boolean m2092a(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: b */
    private static boolean m2095b(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: c */
    private static int m2096c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m2097d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m2097d(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left - rect2.right;
        }
        if (i == 33) {
            return rect.top - rect2.bottom;
        }
        if (i == 66) {
            return rect2.left - rect.right;
        }
        if (i == 130) {
            return rect2.top - rect.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: e */
    private static int m2098e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m2099f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m2099f(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left - rect2.left;
        }
        if (i == 33) {
            return rect.top - rect2.top;
        }
        if (i == 66) {
            return rect2.right - rect.right;
        }
        if (i == 130) {
            return rect2.bottom - rect.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: g */
    private static int m2100g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
