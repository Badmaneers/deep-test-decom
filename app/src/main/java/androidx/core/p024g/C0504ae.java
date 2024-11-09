package androidx.core.p024g;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.ae */
/* loaded from: classes.dex */
public final class C0504ae {

    /* renamed from: a */
    private static final ArrayList<WeakReference<View>> f2340a = new ArrayList<>();

    /* renamed from: b */
    private WeakHashMap<View, Boolean> f2341b = null;

    /* renamed from: c */
    private SparseArray<WeakReference<View>> f2342c = null;

    /* renamed from: d */
    private WeakReference<KeyEvent> f2343d = null;

    C0504ae() {
    }

    /* renamed from: a */
    private SparseArray<WeakReference<View>> m1732a() {
        if (this.f2342c == null) {
            this.f2342c = new SparseArray<>();
        }
        return this.f2342c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0504ae m1733a(View view) {
        C0504ae c0504ae = (C0504ae) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0504ae != null) {
            return c0504ae;
        }
        C0504ae c0504ae2 = new C0504ae();
        view.setTag(R.id.tag_unhandled_key_event_manager, c0504ae2);
        return c0504ae2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m1737a(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (this.f2341b != null) {
                this.f2341b.clear();
            }
            if (!f2340a.isEmpty()) {
                synchronized (f2340a) {
                    if (this.f2341b == null) {
                        this.f2341b = new WeakHashMap<>();
                    }
                    for (int size = f2340a.size() - 1; size >= 0; size--) {
                        View view2 = f2340a.get(size).get();
                        if (view2 == null) {
                            f2340a.remove(size);
                        } else {
                            this.f2341b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2341b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m1734b = m1734b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m1734b != null && !KeyEvent.isModifierKey(keyCode)) {
                m1732a().put(keyCode, new WeakReference<>(m1734b));
            }
        }
        return m1734b != null;
    }

    /* renamed from: b */
    private View m1734b(View view, KeyEvent keyEvent) {
        if (this.f2341b == null || !this.f2341b.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View m1734b = m1734b(viewGroup.getChildAt(childCount), keyEvent);
                if (m1734b != null) {
                    return m1734b;
                }
            }
        }
        if (m1735b(view)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m1736a(KeyEvent keyEvent) {
        int indexOfKey;
        if (this.f2343d != null && this.f2343d.get() == keyEvent) {
            return false;
        }
        this.f2343d = new WeakReference<>(keyEvent);
        WeakReference<View> weakReference = null;
        SparseArray<WeakReference<View>> m1732a = m1732a();
        if (keyEvent.getAction() == 1 && (indexOfKey = m1732a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = m1732a.valueAt(indexOfKey);
            m1732a.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = m1732a.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view = weakReference.get();
        if (view != null && C0538w.m1822F(view)) {
            m1735b(view);
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m1735b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((InterfaceC0503ad) arrayList.get(size)).m1731a()) {
                return true;
            }
        }
        return false;
    }
}
