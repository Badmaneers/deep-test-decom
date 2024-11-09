package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.R;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.ViewOnAttachStateChangeListenerC0535t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.bb */
/* loaded from: classes.dex */
public abstract class AbstractC0685bb {
    /* renamed from: a */
    public abstract Object mo2400a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo2401a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo2402a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2403a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2404a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2405a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2406a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2407a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo2408a(Object obj);

    /* renamed from: b */
    public abstract Object mo2409b(Object obj);

    /* renamed from: b */
    public abstract Object mo2410b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2411b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2412b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2413b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2414c(Object obj);

    /* renamed from: c */
    public abstract void mo2415c(Object obj, View view);

    /* renamed from: a */
    public static void m2417a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public static ArrayList<String> m2416a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0538w.m1890s(view));
            C0538w.m1854a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void m2421a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m1890s = C0538w.m1890s(view2);
            arrayList4.add(m1890s);
            if (m1890s != null) {
                C0538w.m1854a(view2, (String) null);
                String str = map.get(m1890s);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        C0538w.m1854a(arrayList2.get(i2), m1890s);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewOnAttachStateChangeListenerC0535t.m1813a(view, new RunnableC0686bc(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: a */
    public final void m2422a(ArrayList<View> arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    z = viewGroup.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
                    z = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0538w.m1890s(viewGroup) == null) ? false : true;
                }
                if (z) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m2422a(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: a */
    public final void m2423a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m1890s = C0538w.m1890s(view);
            if (m1890s != null) {
                map.put(m1890s, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m2423a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2418a(List<View> list, View view) {
        int size = list.size();
        if (m2420a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m2420a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2420a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2419a(List list) {
        return list == null || list.isEmpty();
    }
}
