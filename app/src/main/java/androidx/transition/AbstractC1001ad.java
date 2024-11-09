package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.p024g.C0538w;
import androidx.p011b.C0318a;
import androidx.p011b.C0323f;
import com.coloros.neton.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition.java */
/* renamed from: androidx.transition.ad */
/* loaded from: classes.dex */
public abstract class AbstractC1001ad implements Cloneable {

    /* renamed from: H */
    private AbstractC1006ai f4096H;

    /* renamed from: I */
    private C0318a<String, String> f4097I;

    /* renamed from: g */
    AbstractC1012ao f4105g;

    /* renamed from: y */
    private ArrayList<C1017at> f4121y;

    /* renamed from: z */
    private ArrayList<C1017at> f4122z;

    /* renamed from: h */
    private static final int[] f4088h = {2, 1, 3, 4};

    /* renamed from: i */
    private static final AbstractC1068z f4089i = new C1002ae();

    /* renamed from: A */
    private static ThreadLocal<C0318a<Animator, C1005ah>> f4087A = new ThreadLocal<>();

    /* renamed from: j */
    private String f4106j = getClass().getName();

    /* renamed from: k */
    private long f4107k = -1;

    /* renamed from: a */
    long f4099a = -1;

    /* renamed from: l */
    private TimeInterpolator f4108l = null;

    /* renamed from: b */
    ArrayList<Integer> f4100b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<View> f4101c = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<String> f4109m = null;

    /* renamed from: n */
    private ArrayList<Class<?>> f4110n = null;

    /* renamed from: o */
    private ArrayList<Integer> f4111o = null;

    /* renamed from: p */
    private ArrayList<View> f4112p = null;

    /* renamed from: q */
    private ArrayList<Class<?>> f4113q = null;

    /* renamed from: r */
    private ArrayList<String> f4114r = null;

    /* renamed from: s */
    private ArrayList<Integer> f4115s = null;

    /* renamed from: t */
    private ArrayList<View> f4116t = null;

    /* renamed from: u */
    private ArrayList<Class<?>> f4117u = null;

    /* renamed from: v */
    private C1018au f4118v = new C1018au();

    /* renamed from: w */
    private C1018au f4119w = new C1018au();

    /* renamed from: d */
    C1013ap f4102d = null;

    /* renamed from: x */
    private int[] f4120x = f4088h;

    /* renamed from: B */
    private ViewGroup f4090B = null;

    /* renamed from: e */
    boolean f4103e = false;

    /* renamed from: f */
    ArrayList<Animator> f4104f = new ArrayList<>();

    /* renamed from: C */
    private int f4091C = 0;

    /* renamed from: D */
    private boolean f4092D = false;

    /* renamed from: E */
    private boolean f4093E = false;

    /* renamed from: F */
    private ArrayList<InterfaceC1007aj> f4094F = null;

    /* renamed from: G */
    private ArrayList<Animator> f4095G = new ArrayList<>();

    /* renamed from: J */
    private AbstractC1068z f4098J = f4089i;

    /* renamed from: a */
    public Animator mo3481a(ViewGroup viewGroup, C1017at c1017at, C1017at c1017at2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo3492a(C1017at c1017at);

    /* renamed from: a */
    public String[] mo3497a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo3503b(C1017at c1017at);

    /* renamed from: a */
    public AbstractC1001ad mo3482a(long j) {
        this.f4099a = j;
        return this;
    }

    /* renamed from: b */
    public AbstractC1001ad mo3499b(long j) {
        this.f4107k = j;
        return this;
    }

    /* renamed from: b */
    public final long m3498b() {
        return this.f4107k;
    }

    /* renamed from: a */
    public AbstractC1001ad mo3483a(TimeInterpolator timeInterpolator) {
        this.f4108l = timeInterpolator;
        return this;
    }

    /* renamed from: c */
    public final TimeInterpolator m3504c() {
        return this.f4108l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m3477a(C1018au c1018au, C1018au c1018au2) {
        C1017at c1017at;
        View view;
        View view2;
        View m1032a;
        C0318a c0318a = new C0318a(c1018au.f4152a);
        C0318a c0318a2 = new C0318a(c1018au2.f4152a);
        for (int i = 0; i < this.f4120x.length; i++) {
            switch (this.f4120x[i]) {
                case 1:
                    for (int size = c0318a.size() - 1; size >= 0; size--) {
                        View view3 = (View) c0318a.m1061b(size);
                        if (view3 != null && m3495a(view3) && (c1017at = (C1017at) c0318a2.remove(view3)) != null && m3495a(c1017at.f4150b)) {
                            this.f4121y.add((C1017at) c0318a.m1063d(size));
                            this.f4122z.add(c1017at);
                        }
                    }
                    break;
                case 2:
                    C0318a<String, View> c0318a3 = c1018au.f4155d;
                    C0318a<String, View> c0318a4 = c1018au2.f4155d;
                    int size2 = c0318a3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        View c = c0318a3.m1062c(i2);
                        if (c != null && m3495a(c) && (view = c0318a4.get(c0318a3.m1061b(i2))) != null && m3495a(view)) {
                            C1017at c1017at2 = (C1017at) c0318a.get(c);
                            C1017at c1017at3 = (C1017at) c0318a2.get(view);
                            if (c1017at2 != null && c1017at3 != null) {
                                this.f4121y.add(c1017at2);
                                this.f4122z.add(c1017at3);
                                c0318a.remove(c);
                                c0318a2.remove(view);
                            }
                        }
                    }
                    break;
                case 3:
                    SparseArray<View> sparseArray = c1018au.f4153b;
                    SparseArray<View> sparseArray2 = c1018au2.f4153b;
                    int size3 = sparseArray.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        View valueAt = sparseArray.valueAt(i3);
                        if (valueAt != null && m3495a(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i3))) != null && m3495a(view2)) {
                            C1017at c1017at4 = (C1017at) c0318a.get(valueAt);
                            C1017at c1017at5 = (C1017at) c0318a2.get(view2);
                            if (c1017at4 != null && c1017at5 != null) {
                                this.f4121y.add(c1017at4);
                                this.f4122z.add(c1017at5);
                                c0318a.remove(valueAt);
                                c0318a2.remove(view2);
                            }
                        }
                    }
                    break;
                case 4:
                    C0323f<View> c0323f = c1018au.f4154c;
                    C0323f<View> c0323f2 = c1018au2.f4154c;
                    int m1035b = c0323f.m1035b();
                    for (int i4 = 0; i4 < m1035b; i4++) {
                        View m1040c = c0323f.m1040c(i4);
                        if (m1040c != null && m3495a(m1040c) && (m1032a = c0323f2.m1032a(c0323f.m1036b(i4))) != null && m3495a(m1032a)) {
                            C1017at c1017at6 = (C1017at) c0318a.get(m1040c);
                            C1017at c1017at7 = (C1017at) c0318a2.get(m1032a);
                            if (c1017at6 != null && c1017at7 != null) {
                                this.f4121y.add(c1017at6);
                                this.f4122z.add(c1017at7);
                                c0318a.remove(m1040c);
                                c0318a2.remove(m1032a);
                            }
                        }
                    }
                    break;
            }
        }
        for (int i5 = 0; i5 < c0318a.size(); i5++) {
            C1017at c1017at8 = (C1017at) c0318a.m1062c(i5);
            if (m3495a(c1017at8.f4150b)) {
                this.f4121y.add(c1017at8);
                this.f4122z.add(null);
            }
        }
        for (int i6 = 0; i6 < c0318a2.size(); i6++) {
            C1017at c1017at9 = (C1017at) c0318a2.m1062c(i6);
            if (m3495a(c1017at9.f4150b)) {
                this.f4122z.add(c1017at9);
                this.f4121y.add(null);
            }
        }
    }

    /* renamed from: a */
    public void mo3488a(ViewGroup viewGroup, C1018au c1018au, C1018au c1018au2, ArrayList<C1017at> arrayList, ArrayList<C1017at> arrayList2) {
        int i;
        View view;
        Animator animator;
        C1017at c1017at;
        Animator animator2;
        C1017at c1017at2;
        C0318a<Animator, C1005ah> m3480m = m3480m();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            C1017at c1017at3 = arrayList.get(i2);
            C1017at c1017at4 = arrayList2.get(i2);
            if (c1017at3 != null && !c1017at3.f4151c.contains(this)) {
                c1017at3 = null;
            }
            if (c1017at4 != null && !c1017at4.f4151c.contains(this)) {
                c1017at4 = null;
            }
            if (c1017at3 != null || c1017at4 != null) {
                if (c1017at3 == null || c1017at4 == null || mo3496a(c1017at3, c1017at4)) {
                    Animator mo3481a = mo3481a(viewGroup, c1017at3, c1017at4);
                    if (mo3481a != null) {
                        if (c1017at4 != null) {
                            view = c1017at4.f4150b;
                            String[] mo3497a = mo3497a();
                            if (mo3497a != null && mo3497a.length > 0) {
                                c1017at2 = new C1017at(view);
                                C1017at c1017at5 = c1018au2.f4152a.get(view);
                                if (c1017at5 != null) {
                                    animator2 = mo3481a;
                                    i = size;
                                    int i3 = 0;
                                    while (i3 < mo3497a.length) {
                                        c1017at2.f4149a.put(mo3497a[i3], c1017at5.f4149a.get(mo3497a[i3]));
                                        i3++;
                                        c1017at5 = c1017at5;
                                    }
                                } else {
                                    animator2 = mo3481a;
                                    i = size;
                                }
                                int size2 = m3480m.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    C1005ah c1005ah = m3480m.get(m3480m.m1061b(i4));
                                    if (c1005ah.f4128c != null && c1005ah.f4126a == view && c1005ah.f4127b.equals(this.f4106j) && c1005ah.f4128c.equals(c1017at2)) {
                                        c1017at = c1017at2;
                                        animator = null;
                                        break;
                                    }
                                }
                            } else {
                                animator2 = mo3481a;
                                i = size;
                                c1017at2 = null;
                            }
                            c1017at = c1017at2;
                            animator = animator2;
                        } else {
                            i = size;
                            view = c1017at3.f4150b;
                            animator = mo3481a;
                            c1017at = null;
                        }
                        if (animator != null) {
                            if (this.f4105g != null) {
                                long m3527a = this.f4105g.m3527a();
                                sparseIntArray.put(this.f4095G.size(), (int) m3527a);
                                j = Math.min(m3527a, j);
                            }
                            m3480m.put(animator, new C1005ah(view, this.f4106j, this, C1030bf.m3557b(viewGroup), c1017at));
                            this.f4095G.add(animator);
                            j = j;
                        }
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.f4095G.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((sparseIntArray.valueAt(i5) - j) + animator3.getStartDelay());
            }
        }
    }

    /* renamed from: a */
    public final boolean m3495a(View view) {
        int id = view.getId();
        if (this.f4111o != null && this.f4111o.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f4112p != null && this.f4112p.contains(view)) {
            return false;
        }
        if (this.f4113q != null) {
            int size = this.f4113q.size();
            for (int i = 0; i < size; i++) {
                if (this.f4113q.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f4114r != null && C0538w.m1890s(view) != null && this.f4114r.contains(C0538w.m1890s(view))) {
            return false;
        }
        if ((this.f4100b.size() == 0 && this.f4101c.size() == 0 && ((this.f4110n == null || this.f4110n.isEmpty()) && (this.f4109m == null || this.f4109m.isEmpty()))) || this.f4100b.contains(Integer.valueOf(id)) || this.f4101c.contains(view)) {
            return true;
        }
        if (this.f4109m != null && this.f4109m.contains(C0538w.m1890s(view))) {
            return true;
        }
        if (this.f4110n != null) {
            for (int i2 = 0; i2 < this.f4110n.size(); i2++) {
                if (this.f4110n.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    private static C0318a<Animator, C1005ah> m3480m() {
        C0318a<Animator, C1005ah> c0318a = f4087A.get();
        if (c0318a != null) {
            return c0318a;
        }
        C0318a<Animator, C1005ah> c0318a2 = new C0318a<>();
        f4087A.set(c0318a2);
        return c0318a2;
    }

    /* renamed from: d */
    public void mo3507d() {
        m3512g();
        C0318a<Animator, C1005ah> m3480m = m3480m();
        Iterator<Animator> it = this.f4095G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m3480m.containsKey(next)) {
                m3512g();
                if (next != null) {
                    next.addListener(new C1003af(this, m3480m));
                    if (next == null) {
                        m3513h();
                    } else {
                        if (this.f4099a >= 0) {
                            next.setDuration(this.f4099a);
                        }
                        if (this.f4107k >= 0) {
                            next.setStartDelay(this.f4107k + next.getStartDelay());
                        }
                        if (this.f4108l != null) {
                            next.setInterpolator(this.f4108l);
                        }
                        next.addListener(new C1004ag(this));
                        next.start();
                    }
                }
            }
        }
        this.f4095G.clear();
        m3513h();
    }

    /* renamed from: b */
    public AbstractC1001ad mo3500b(View view) {
        this.f4101c.add(view);
        return this;
    }

    /* renamed from: c */
    public AbstractC1001ad mo3505c(View view) {
        this.f4101c.remove(view);
        return this;
    }

    /* renamed from: e */
    public final List<String> m3509e() {
        return this.f4109m;
    }

    /* renamed from: f */
    public final List<Class<?>> m3511f() {
        return this.f4110n;
    }

    /* renamed from: a */
    public final void m3489a(ViewGroup viewGroup, boolean z) {
        m3494a(z);
        if ((this.f4100b.size() > 0 || this.f4101c.size() > 0) && ((this.f4109m == null || this.f4109m.isEmpty()) && (this.f4110n == null || this.f4110n.isEmpty()))) {
            for (int i = 0; i < this.f4100b.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f4100b.get(i).intValue());
                if (findViewById != null) {
                    C1017at c1017at = new C1017at(findViewById);
                    if (z) {
                        mo3492a(c1017at);
                    } else {
                        mo3503b(c1017at);
                    }
                    c1017at.f4151c.add(this);
                    mo3506c(c1017at);
                    if (z) {
                        m3476a(this.f4118v, findViewById, c1017at);
                    } else {
                        m3476a(this.f4119w, findViewById, c1017at);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f4101c.size(); i2++) {
                View view = this.f4101c.get(i2);
                C1017at c1017at2 = new C1017at(view);
                if (z) {
                    mo3492a(c1017at2);
                } else {
                    mo3503b(c1017at2);
                }
                c1017at2.f4151c.add(this);
                mo3506c(c1017at2);
                if (z) {
                    m3476a(this.f4118v, view, c1017at2);
                } else {
                    m3476a(this.f4119w, view, c1017at2);
                }
            }
        } else {
            m3479c(viewGroup, z);
        }
        if (z || this.f4097I == null) {
            return;
        }
        int size = this.f4097I.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(this.f4118v.f4155d.remove(this.f4097I.m1061b(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList.get(i4);
            if (view2 != null) {
                this.f4118v.f4155d.put(this.f4097I.m1062c(i4), view2);
            }
        }
    }

    /* renamed from: a */
    private static void m3476a(C1018au c1018au, View view, C1017at c1017at) {
        c1018au.f4152a.put(view, c1017at);
        int id = view.getId();
        if (id >= 0) {
            if (c1018au.f4153b.indexOfKey(id) >= 0) {
                c1018au.f4153b.put(id, null);
            } else {
                c1018au.f4153b.put(id, view);
            }
        }
        String m1890s = C0538w.m1890s(view);
        if (m1890s != null) {
            if (c1018au.f4155d.containsKey(m1890s)) {
                c1018au.f4155d.put(m1890s, null);
            } else {
                c1018au.f4155d.put(m1890s, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1018au.f4154c.m1039c(itemIdAtPosition) >= 0) {
                    View m1032a = c1018au.f4154c.m1032a(itemIdAtPosition);
                    if (m1032a != null) {
                        C0538w.m1855a(m1032a, false);
                        c1018au.f4154c.m1038b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0538w.m1855a(view, true);
                c1018au.f4154c.m1038b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    public final void m3494a(boolean z) {
        if (z) {
            this.f4118v.f4152a.clear();
            this.f4118v.f4153b.clear();
            this.f4118v.f4154c.m1043d();
        } else {
            this.f4119w.f4152a.clear();
            this.f4119w.f4153b.clear();
            this.f4119w.f4154c.m1043d();
        }
    }

    /* renamed from: c */
    private void m3479c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.f4111o == null || !this.f4111o.contains(Integer.valueOf(id))) {
            if (this.f4112p == null || !this.f4112p.contains(view)) {
                if (this.f4113q != null) {
                    int size = this.f4113q.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f4113q.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C1017at c1017at = new C1017at(view);
                    if (z) {
                        mo3492a(c1017at);
                    } else {
                        mo3503b(c1017at);
                    }
                    c1017at.f4151c.add(this);
                    mo3506c(c1017at);
                    if (z) {
                        m3476a(this.f4118v, view, c1017at);
                    } else {
                        m3476a(this.f4119w, view, c1017at);
                    }
                }
                if (view instanceof ViewGroup) {
                    if (this.f4115s == null || !this.f4115s.contains(Integer.valueOf(id))) {
                        if (this.f4116t == null || !this.f4116t.contains(view)) {
                            if (this.f4117u != null) {
                                int size2 = this.f4117u.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f4117u.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m3479c(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1017at m3485a(View view, boolean z) {
        while (this.f4102d != null) {
            this = this.f4102d;
        }
        return (z ? this.f4118v : this.f4119w).f4152a.get(view);
    }

    /* renamed from: b */
    public final C1017at m3502b(View view, boolean z) {
        while (this.f4102d != null) {
            this = this.f4102d;
        }
        ArrayList<C1017at> arrayList = z ? this.f4121y : this.f4122z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1017at c1017at = arrayList.get(i2);
            if (c1017at == null) {
                return null;
            }
            if (c1017at.f4150b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f4122z : this.f4121y).get(i);
        }
        return null;
    }

    /* renamed from: d */
    public void mo3508d(View view) {
        int i;
        if (this.f4093E) {
            return;
        }
        C0318a<Animator, C1005ah> m3480m = m3480m();
        int size = m3480m.size();
        InterfaceC1045bu m3557b = C1030bf.m3557b(view);
        int i2 = size - 1;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            C1005ah c = m3480m.m1062c(i2);
            if (c.f4126a != null && m3557b.equals(c.f4129d)) {
                Animator b = m3480m.m1061b(i2);
                if (Build.VERSION.SDK_INT >= 19) {
                    b.pause();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = b.getListeners();
                    if (listeners != null) {
                        int size2 = listeners.size();
                        while (i < size2) {
                            Animator.AnimatorListener animatorListener = listeners.get(i);
                            if (animatorListener instanceof InterfaceC1024b) {
                                ((InterfaceC1024b) animatorListener).onAnimationPause(b);
                            }
                            i++;
                        }
                    }
                }
            }
            i2--;
        }
        if (this.f4094F != null && this.f4094F.size() > 0) {
            ArrayList arrayList = (ArrayList) this.f4094F.clone();
            int size3 = arrayList.size();
            while (i < size3) {
                ((InterfaceC1007aj) arrayList.get(i)).mo3521b();
                i++;
            }
        }
        this.f4092D = true;
    }

    /* renamed from: e */
    public void mo3510e(View view) {
        if (this.f4092D) {
            if (!this.f4093E) {
                C0318a<Animator, C1005ah> m3480m = m3480m();
                int size = m3480m.size();
                InterfaceC1045bu m3557b = C1030bf.m3557b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1005ah c = m3480m.m1062c(i);
                    if (c.f4126a != null && m3557b.equals(c.f4129d)) {
                        Animator b = m3480m.m1061b(i);
                        if (Build.VERSION.SDK_INT >= 19) {
                            b.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = b.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i2);
                                    if (animatorListener instanceof InterfaceC1024b) {
                                        ((InterfaceC1024b) animatorListener).onAnimationResume(b);
                                    }
                                }
                            }
                        }
                    }
                }
                if (this.f4094F != null && this.f4094F.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f4094F.clone();
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((InterfaceC1007aj) arrayList.get(i3)).mo3522c();
                    }
                }
            }
            this.f4092D = false;
        }
    }

    /* renamed from: a */
    public final void m3487a(ViewGroup viewGroup) {
        C1005ah c1005ah;
        this.f4121y = new ArrayList<>();
        this.f4122z = new ArrayList<>();
        m3477a(this.f4118v, this.f4119w);
        C0318a<Animator, C1005ah> m3480m = m3480m();
        int size = m3480m.size();
        InterfaceC1045bu m3557b = C1030bf.m3557b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b = m3480m.m1061b(i);
            if (b != null && (c1005ah = m3480m.get(b)) != null && c1005ah.f4126a != null && m3557b.equals(c1005ah.f4129d)) {
                C1017at c1017at = c1005ah.f4128c;
                View view = c1005ah.f4126a;
                C1017at m3485a = m3485a(view, true);
                C1017at m3502b = m3502b(view, true);
                if (m3485a == null && m3502b == null) {
                    m3502b = this.f4119w.f4152a.get(view);
                }
                if (!(m3485a == null && m3502b == null) && c1005ah.f4130e.mo3496a(c1017at, m3502b)) {
                    if (b.isRunning() || b.isStarted()) {
                        b.cancel();
                    } else {
                        m3480m.remove(b);
                    }
                }
            }
        }
        mo3488a(viewGroup, this.f4118v, this.f4119w, this.f4121y, this.f4122z);
        mo3507d();
    }

    /* renamed from: a */
    public boolean mo3496a(C1017at c1017at, C1017at c1017at2) {
        if (c1017at != null && c1017at2 != null) {
            String[] mo3497a = mo3497a();
            if (mo3497a != null) {
                for (String str : mo3497a) {
                    if (m3478a(c1017at, c1017at2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = c1017at.f4149a.keySet().iterator();
                while (it.hasNext()) {
                    if (m3478a(c1017at, c1017at2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3478a(C1017at c1017at, C1017at c1017at2, String str) {
        Object obj = c1017at.f4149a.get(str);
        Object obj2 = c1017at2.f4149a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        return obj == null || obj2 == null || !obj.equals(obj2);
    }

    /* renamed from: g */
    public final void m3512g() {
        if (this.f4091C == 0) {
            if (this.f4094F != null && this.f4094F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f4094F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1007aj) arrayList.get(i)).mo3523d();
                }
            }
            this.f4093E = false;
        }
        this.f4091C++;
    }

    /* renamed from: h */
    public final void m3513h() {
        this.f4091C--;
        if (this.f4091C == 0) {
            if (this.f4094F != null && this.f4094F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f4094F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1007aj) arrayList.get(i)).mo3520a(this);
                }
            }
            for (int i2 = 0; i2 < this.f4118v.f4154c.m1035b(); i2++) {
                View m1040c = this.f4118v.f4154c.m1040c(i2);
                if (m1040c != null) {
                    C0538w.m1855a(m1040c, false);
                }
            }
            for (int i3 = 0; i3 < this.f4119w.f4154c.m1035b(); i3++) {
                View m1040c2 = this.f4119w.f4154c.m1040c(i3);
                if (m1040c2 != null) {
                    C0538w.m1855a(m1040c2, false);
                }
            }
            this.f4093E = true;
        }
    }

    /* renamed from: i */
    public void mo3514i() {
        for (int size = this.f4104f.size() - 1; size >= 0; size--) {
            this.f4104f.get(size).cancel();
        }
        if (this.f4094F == null || this.f4094F.size() <= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f4094F.clone();
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC1007aj) arrayList.get(i)).mo3519a();
        }
    }

    /* renamed from: a */
    public AbstractC1001ad mo3484a(InterfaceC1007aj interfaceC1007aj) {
        if (this.f4094F == null) {
            this.f4094F = new ArrayList<>();
        }
        this.f4094F.add(interfaceC1007aj);
        return this;
    }

    /* renamed from: b */
    public AbstractC1001ad mo3501b(InterfaceC1007aj interfaceC1007aj) {
        if (this.f4094F == null) {
            return this;
        }
        this.f4094F.remove(interfaceC1007aj);
        if (this.f4094F.size() == 0) {
            this.f4094F = null;
        }
        return this;
    }

    /* renamed from: a */
    public void mo3493a(AbstractC1068z abstractC1068z) {
        if (abstractC1068z == null) {
            this.f4098J = f4089i;
        } else {
            this.f4098J = abstractC1068z;
        }
    }

    /* renamed from: j */
    public final AbstractC1068z m3515j() {
        return this.f4098J;
    }

    /* renamed from: a */
    public void mo3490a(AbstractC1006ai abstractC1006ai) {
        this.f4096H = abstractC1006ai;
    }

    /* renamed from: k */
    public final AbstractC1006ai m3516k() {
        return this.f4096H;
    }

    /* renamed from: a */
    public void mo3491a(AbstractC1012ao abstractC1012ao) {
        this.f4105g = abstractC1012ao;
    }

    /* renamed from: c */
    public void mo3506c(C1017at c1017at) {
        String[] m3528b;
        if (this.f4105g == null || c1017at.f4149a.isEmpty() || (m3528b = this.f4105g.m3528b()) == null) {
            return;
        }
        for (int i = 0; i < m3528b.length && c1017at.f4149a.containsKey(m3528b[i]); i++) {
        }
    }

    public String toString() {
        return mo3486a(BuildConfig.FLAVOR);
    }

    @Override // 
    /* renamed from: l */
    public AbstractC1001ad clone() {
        try {
            AbstractC1001ad abstractC1001ad = (AbstractC1001ad) super.clone();
            abstractC1001ad.f4095G = new ArrayList<>();
            abstractC1001ad.f4118v = new C1018au();
            abstractC1001ad.f4119w = new C1018au();
            abstractC1001ad.f4121y = null;
            abstractC1001ad.f4122z = null;
            return abstractC1001ad;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo3486a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f4099a != -1) {
            str2 = str2 + "dur(" + this.f4099a + ") ";
        }
        if (this.f4107k != -1) {
            str2 = str2 + "dly(" + this.f4107k + ") ";
        }
        if (this.f4108l != null) {
            str2 = str2 + "interp(" + this.f4108l + ") ";
        }
        if (this.f4100b.size() <= 0 && this.f4101c.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f4100b.size() > 0) {
            String str4 = str3;
            for (int i = 0; i < this.f4100b.size(); i++) {
                if (i > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f4100b.get(i);
            }
            str3 = str4;
        }
        if (this.f4101c.size() > 0) {
            for (int i2 = 0; i2 < this.f4101c.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f4101c.get(i2);
            }
        }
        return str3 + ")";
    }
}
