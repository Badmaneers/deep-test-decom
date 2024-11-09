package com.color.support.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import androidx.recyclerview.widget.AbstractC0845ay;
import androidx.recyclerview.widget.AbstractC0848ba;
import androidx.recyclerview.widget.AbstractC0879ce;
import androidx.recyclerview.widget.ColorLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ExpandableRecyclerConnector extends AbstractC0845ay {

    /* renamed from: e */
    private InterfaceC1365ag f6726e;

    /* renamed from: g */
    private int f6728g;

    /* renamed from: j */
    private ColorExpandableRecyclerView f6731j;

    /* renamed from: a */
    private SparseArray<C1529fn> f6722a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<C1505fl> f6723b = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<List<AbstractC0879ce>> f6724c = new SparseArray<>();

    /* renamed from: d */
    private SparseArray<List<AbstractC0879ce>> f6725d = new SparseArray<>();

    /* renamed from: h */
    private int f6729h = Integer.MAX_VALUE;

    /* renamed from: i */
    private final AbstractC0848ba f6730i = new C1531fp(this);

    /* renamed from: k */
    private SparseArray<Integer> f6732k = new SparseArray<>();

    /* renamed from: f */
    private ArrayList<GroupMetadata> f6727f = new ArrayList<>();

    public ExpandableRecyclerConnector(InterfaceC1365ag interfaceC1365ag, ColorExpandableRecyclerView colorExpandableRecyclerView) {
        this.f6731j = colorExpandableRecyclerView;
        this.f6726e = interfaceC1365ag;
    }

    /* renamed from: g */
    private C1529fn m4796g(int i) {
        C1529fn c1529fn = this.f6722a.get(i);
        if (c1529fn != null) {
            return c1529fn;
        }
        C1529fn c1529fn2 = new C1529fn((byte) 0);
        this.f6722a.put(i, c1529fn2);
        return c1529fn2;
    }

    /* renamed from: d */
    public final boolean m4801d(int i) {
        C1533fr m5155a = C1533fr.m5155a(2, i, -1, -1);
        C1532fq m4798a = m4798a(m5155a);
        m5155a.m5157a();
        View b = ((ColorLinearLayoutManager) this.f6731j.getLayoutManager()).mo2832b(m4798a.f7282a.f7288c);
        if (m4798a != null && b != null && b.getBottom() >= this.f6731j.getHeight() - this.f6731j.getPaddingBottom()) {
            int i2 = m4798a.f7283b.f6733a;
            this.f6727f.remove(m4798a.f7283b);
            m4792a(false, false);
            m3025c(i2);
            return false;
        }
        C1529fn m4796g = m4796g(i);
        if (m4796g.f7275a && m4796g.f7276b) {
            m4796g.f7276b = false;
            m4794b(m4796g.f7278d, m4798a.f7283b.f6733a, i, m4796g.f7279e);
            return false;
        }
        if (m4796g.f7275a && !m4796g.f7276b) {
            m4791a(m4796g.f7278d, m4798a.f7283b.f6733a, i, m4796g.f7277c);
            m4796g.f7276b = true;
            return false;
        }
        m4796g.f7275a = true;
        m4796g.f7276b = false;
        return true;
    }

    /* renamed from: e */
    public final C1532fq m4802e(int i) {
        int i2;
        ArrayList<GroupMetadata> arrayList = this.f6727f;
        int size = arrayList.size();
        int i3 = size - 1;
        if (size == 0) {
            return C1532fq.m5151a(i, 2, i, -1, null, 0);
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = ((i3 - i4) / 2) + i4;
            GroupMetadata groupMetadata = arrayList.get(i6);
            if (i > groupMetadata.f6734b) {
                i4 = i6 + 1;
            } else if (i < groupMetadata.f6733a) {
                i3 = i6 - 1;
            } else {
                if (i == groupMetadata.f6733a) {
                    return C1532fq.m5151a(i, 2, groupMetadata.f6735c, -1, groupMetadata, i6);
                }
                if (i <= groupMetadata.f6734b) {
                    return C1532fq.m5151a(i, 1, groupMetadata.f6735c, i - (groupMetadata.f6733a + 1), groupMetadata, i6);
                }
            }
            i5 = i6;
        }
        if (i4 > i5) {
            GroupMetadata groupMetadata2 = arrayList.get(i4 - 1);
            i2 = (i - groupMetadata2.f6734b) + groupMetadata2.f6735c;
        } else if (i3 < i5) {
            i4 = i3 + 1;
            GroupMetadata groupMetadata3 = arrayList.get(i4);
            i2 = groupMetadata3.f6735c - (groupMetadata3.f6733a - i);
        } else {
            throw new RuntimeException("Unknown state");
        }
        return C1532fq.m5151a(i, 2, i2, -1, null, i4);
    }

    /* renamed from: a */
    public final C1532fq m4798a(C1533fr c1533fr) {
        ArrayList<GroupMetadata> arrayList = this.f6727f;
        int size = arrayList.size();
        int i = size - 1;
        if (size == 0) {
            return C1532fq.m5151a(c1533fr.f7286a, c1533fr.f7289d, c1533fr.f7286a, c1533fr.f7287b, null, 0);
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = ((i - i3) / 2) + i3;
            GroupMetadata groupMetadata = arrayList.get(i4);
            if (c1533fr.f7286a > groupMetadata.f6735c) {
                i3 = i4 + 1;
            } else if (c1533fr.f7286a < groupMetadata.f6735c) {
                i = i4 - 1;
            } else if (c1533fr.f7286a == groupMetadata.f6735c) {
                if (c1533fr.f7289d == 2) {
                    return C1532fq.m5151a(groupMetadata.f6733a, c1533fr.f7289d, c1533fr.f7286a, c1533fr.f7287b, groupMetadata, i4);
                }
                if (c1533fr.f7289d == 1) {
                    return C1532fq.m5151a(groupMetadata.f6733a + c1533fr.f7287b + 1, c1533fr.f7289d, c1533fr.f7286a, c1533fr.f7287b, groupMetadata, i4);
                }
                return null;
            }
            i2 = i4;
        }
        if (c1533fr.f7289d != 2) {
            return null;
        }
        if (i3 > i2) {
            GroupMetadata groupMetadata2 = arrayList.get(i3 - 1);
            return C1532fq.m5151a(groupMetadata2.f6734b + (c1533fr.f7286a - groupMetadata2.f6735c), c1533fr.f7289d, c1533fr.f7286a, c1533fr.f7287b, null, i3);
        }
        if (i >= i2) {
            return null;
        }
        int i5 = i + 1;
        GroupMetadata groupMetadata3 = arrayList.get(i5);
        return C1532fq.m5151a(groupMetadata3.f6733a - (groupMetadata3.f6735c - c1533fr.f7286a), c1533fr.f7289d, c1533fr.f7286a, c1533fr.f7287b, null, i5);
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final int mo3020b() {
        return this.f6726e.m4880d() + this.f6728g;
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final long mo3021b(int i) {
        long m4882f;
        C1532fq m4802e = m4802e(i);
        if (m4802e.f7282a.f7289d == 2) {
            m4882f = this.f6726e.m4883g();
        } else if (m4802e.f7282a.f7289d == 1) {
            m4882f = this.f6726e.m4882f();
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        m4802e.m5154a();
        return m4882f;
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final void mo3019a(AbstractC0879ce abstractC0879ce, int i) {
        int bottom;
        int i2;
        int i3;
        int i4;
        char c;
        C1532fq m4802e = m4802e(i);
        int i5 = m4802e.f7282a.f7286a;
        C1529fn m4796g = m4796g(i5);
        abstractC0879ce.f3614a.setOnClickListener(null);
        if (m4802e.f7282a.f7289d == 2) {
            abstractC0879ce.f3614a.setOnClickListener(new ViewOnClickListenerC1498fe(this, i));
        } else if (m4796g.f7275a) {
            C1503fj c1503fj = (C1503fj) abstractC0879ce.f3614a;
            c1503fj.m5044a();
            boolean z = m4796g.f7276b;
            int m3121v = this.f6731j.getLayoutManager().m3121v();
            int i6 = 0;
            int bottom2 = m3121v > 0 ? this.f6731j.getLayoutManager().m3111f(m3121v - 1).getBottom() : 0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f6731j.getWidth(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            if (z && this.f6731j.getLayoutParams().height == -2) {
                bottom = this.f6731j.getContext().getResources().getDisplayMetrics().heightPixels;
            } else {
                bottom = this.f6731j.getBottom();
            }
            int m4881e = this.f6726e.m4881e();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= m4881e) {
                    i2 = i6;
                    i3 = i8;
                    break;
                }
                List<AbstractC0879ce> list = this.f6724c.get(m4795g());
                AbstractC0879ce remove = (list == null || list.isEmpty()) ? null : list.remove(i6);
                if (remove == null) {
                    remove = this.f6726e.m4878b();
                }
                int m4795g = m4795g();
                List<AbstractC0879ce> list2 = this.f6725d.get(m4795g);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(remove);
                int i9 = m4881e;
                this.f6725d.put(m4795g, list2);
                View view = remove.f3614a;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    i4 = makeMeasureSpec2;
                    c = 65534;
                    i2 = 0;
                    layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
                    view.setLayoutParams(layoutParams);
                } else {
                    i4 = makeMeasureSpec2;
                    c = 65534;
                    i2 = 0;
                }
                int i10 = layoutParams.height;
                int makeMeasureSpec3 = i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : i4;
                view.setLayoutDirection(this.f6731j.getLayoutDirection());
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                i3 = i8 + view.getMeasuredHeight();
                c1503fj.m5045a(view);
                if ((!z && i3 + bottom2 > bottom) || (z && i3 > (bottom - bottom2) * 2)) {
                    break;
                }
                i7++;
                i8 = i3;
                i6 = i2;
                m4881e = i9;
                makeMeasureSpec2 = i4;
            }
            m4796g.f7277c = i3;
            m4796g.f7278d = c1503fj;
            Object tag = c1503fj.getTag();
            if (tag != null) {
                i2 = ((Integer) tag).intValue();
            }
            if (m4796g.f7276b && i2 != 1) {
                m4791a(c1503fj, i, i5, i3);
            } else if (!m4796g.f7276b && i2 != 2) {
                m4794b(c1503fj, i, i5, i3);
            } else {
                Log.e("ExpandableRecyclerConnector", "onBindViewHolder: state is no match:".concat(String.valueOf(i2)));
            }
        } else if (m4802e.f7282a.f7289d == 1) {
            if (this.f6726e.m4879c()) {
                abstractC0879ce.f3614a.setOnClickListener(new ViewOnClickListenerC1499ff(this, i));
            }
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        m4802e.m5154a();
    }

    /* renamed from: h */
    private int m4797h(int i) {
        if (m4796g(i).f7275a) {
            return 1;
        }
        return this.f6726e.m4881e();
    }

    /* renamed from: a */
    private void m4791a(C1503fj c1503fj, int i, int i2, int i3) {
        Log.d("ExpandableRecyclerConnector", "expandAnimationStart:" + i + " ,groupPos:" + i2 + " , height:" + i3);
        C1529fn m4796g = m4796g(i2);
        C1505fl c1505fl = this.f6723b.get(i2);
        if (c1505fl == null) {
            c1505fl = new C1505fl(this.f6731j, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
            this.f6723b.put(i2, c1505fl);
        } else {
            c1505fl.removeAllListeners();
            c1505fl.cancel();
        }
        c1505fl.m5050a(true, i == mo3020b() - 1, i, c1503fj, m4796g, m4796g.f7279e == -1 ? 0 : m4796g.f7279e, i3);
        c1505fl.addListener(new C1500fg(this, c1503fj, i2, i));
        c1505fl.start();
        c1503fj.setTag(1);
    }

    /* renamed from: b */
    private void m4794b(C1503fj c1503fj, int i, int i2, int i3) {
        Log.d("ExpandableRecyclerConnector", "collapseAnimationStart:" + i + " ,groupPos:" + i2 + " , height:" + i3);
        C1529fn m4796g = m4796g(i2);
        C1505fl c1505fl = this.f6723b.get(i2);
        if (c1505fl == null) {
            c1505fl = new C1505fl(this.f6731j, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
            this.f6723b.put(i2, c1505fl);
        } else {
            c1505fl.removeAllListeners();
            c1505fl.cancel();
        }
        boolean z = i == mo3020b() - 1;
        if (m4796g.f7279e != -1) {
            i3 = m4796g.f7279e;
        }
        c1505fl.m5050a(false, z, i, c1503fj, m4796g, i3, 0);
        c1505fl.addListener(new C1501fh(this, c1503fj, i2));
        c1505fl.start();
        c1503fj.setTag(2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final AbstractC0879ce mo3015a(ViewGroup viewGroup, int i) {
        if (i == Integer.MIN_VALUE) {
            return new C1502fi(new C1503fj(viewGroup.getContext()));
        }
        if (this.f6732k.get(i).intValue() == 2) {
            return this.f6726e.m4877a();
        }
        if (this.f6732k.get(i).intValue() == 1) {
            return this.f6726e.m4878b();
        }
        throw new RuntimeException("Flat list position is of unknown type");
    }

    /* renamed from: e */
    public final void m4803e() {
        m4792a(true, true);
        m3016a(0, mo3020b());
    }

    /* renamed from: g */
    private int m4795g() {
        return this.f6726e.m4886j() + this.f6726e.m4887k();
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final int mo3014a(int i) {
        int m4795g;
        C1532fq m4802e = m4802e(i);
        C1533fr c1533fr = m4802e.f7282a;
        if (c1533fr.f7289d == 2) {
            m4795g = this.f6726e.m4885i();
        } else {
            m4795g = m4796g(c1533fr.f7286a).f7275a ? RecyclerView.UNDEFINED_DURATION : m4795g();
        }
        this.f6732k.put(m4795g, Integer.valueOf(c1533fr.f7289d));
        m4802e.m5154a();
        return m4795g;
    }

    /* renamed from: a */
    public void m4792a(boolean z, boolean z2) {
        int m4797h;
        ArrayList<GroupMetadata> arrayList = this.f6727f;
        int size = arrayList.size();
        this.f6728g = 0;
        if (z2) {
            int i = size;
            boolean z3 = false;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                GroupMetadata groupMetadata = arrayList.get(i2);
                int m4788a = m4788a(groupMetadata.f6736d, groupMetadata.f6735c);
                if (m4788a != groupMetadata.f6735c) {
                    if (m4788a == -1) {
                        arrayList.remove(i2);
                        i--;
                    }
                    groupMetadata.f6735c = m4788a;
                    if (!z3) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Collections.sort(arrayList);
            }
            size = i;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            GroupMetadata groupMetadata2 = arrayList.get(i5);
            if (groupMetadata2.f6734b == -1 || z) {
                m4797h = m4797h(groupMetadata2.f6735c);
            } else {
                m4797h = groupMetadata2.f6734b - groupMetadata2.f6733a;
            }
            this.f6728g += m4797h;
            int i6 = i3 + (groupMetadata2.f6735c - i4);
            i4 = groupMetadata2.f6735c;
            groupMetadata2.f6733a = i6;
            i3 = i6 + m4797h;
            groupMetadata2.f6734b = i3;
        }
    }

    /* renamed from: f */
    public final boolean m4805f(int i) {
        C1533fr m5155a = C1533fr.m5155a(2, i, -1, -1);
        C1532fq m4798a = m4798a(m5155a);
        m5155a.m5157a();
        if (m4798a == null || m4798a.f7283b == null) {
            return false;
        }
        this.f6727f.remove(m4798a.f7283b);
        m4792a(false, false);
        m3016a(0, mo3020b());
        return true;
    }

    /* renamed from: a */
    public final boolean m4800a(C1532fq c1532fq) {
        boolean z;
        if (c1532fq.f7282a.f7286a < 0) {
            throw new RuntimeException("Need group");
        }
        if (this.f6729h == 0 || c1532fq.f7283b != null) {
            return false;
        }
        if (this.f6727f.size() >= this.f6729h) {
            GroupMetadata groupMetadata = this.f6727f.get(0);
            int indexOf = this.f6727f.indexOf(groupMetadata);
            m4805f(groupMetadata.f6735c);
            if (c1532fq.f7284c > indexOf) {
                c1532fq.f7284c--;
            }
        }
        GroupMetadata m4806a = GroupMetadata.m4806a(-1, -1, c1532fq.f7282a.f7286a, this.f6726e.m4884h());
        View b = ((ColorLinearLayoutManager) this.f6731j.getLayoutManager()).mo2832b(c1532fq.f7282a.f7288c);
        if (b != null && b.getBottom() >= this.f6731j.getHeight() - this.f6731j.getPaddingBottom()) {
            this.f6727f.add(c1532fq.f7284c, m4806a);
            m4792a(false, false);
            m3025c(m4806a.f6733a);
            return false;
        }
        C1529fn m4796g = m4796g(m4806a.f6735c);
        if (m4796g.f7275a && m4796g.f7276b) {
            z = false;
        } else {
            m4796g.f7275a = true;
            m4796g.f7276b = true;
            z = true;
        }
        if (!z) {
            return false;
        }
        this.f6727f.add(c1532fq.f7284c, m4806a);
        m4792a(false, false);
        m3016a(0, mo3020b());
        return true;
    }

    /* renamed from: f */
    public final ArrayList<GroupMetadata> m4804f() {
        return this.f6727f;
    }

    /* renamed from: a */
    public final void m4799a(ArrayList<GroupMetadata> arrayList) {
        if (arrayList == null || this.f6726e == null) {
            return;
        }
        int m4880d = this.f6726e.m4880d();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f6735c >= m4880d) {
                return;
            }
        }
        this.f6727f = arrayList;
        m4792a(true, false);
    }

    /* renamed from: a */
    private int m4788a(long j, int i) {
        int m4880d = this.f6726e.m4880d();
        if (m4880d == 0 || j == Long.MIN_VALUE) {
            return -1;
        }
        int i2 = m4880d - 1;
        int min = Math.min(i2, Math.max(0, i));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        InterfaceC1365ag interfaceC1365ag = this.f6726e;
        if (interfaceC1365ag == null) {
            return -1;
        }
        int i3 = min;
        int i4 = i3;
        boolean z = false;
        while (SystemClock.uptimeMillis() <= uptimeMillis) {
            if (interfaceC1365ag.m4884h() != j) {
                boolean z2 = i3 == i2;
                boolean z3 = i4 == 0;
                if (z2 && z3) {
                    break;
                }
                if (z3 || (z && !z2)) {
                    i3++;
                    z = false;
                    min = i3;
                } else if (z2 || (!z && !z3)) {
                    i4--;
                    z = true;
                    min = i4;
                }
            } else {
                return min;
            }
        }
        return -1;
    }

    /* loaded from: classes.dex */
    public class GroupMetadata implements Parcelable, Comparable<GroupMetadata> {
        public static final Parcelable.Creator<GroupMetadata> CREATOR = new C1530fo();

        /* renamed from: a */
        int f6733a;

        /* renamed from: b */
        int f6734b;

        /* renamed from: c */
        int f6735c;

        /* renamed from: d */
        long f6736d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(GroupMetadata groupMetadata) {
            GroupMetadata groupMetadata2 = groupMetadata;
            if (groupMetadata2 == null) {
                throw new IllegalArgumentException();
            }
            return this.f6735c - groupMetadata2.f6735c;
        }

        private GroupMetadata() {
        }

        /* renamed from: a */
        public static GroupMetadata m4806a(int i, int i2, int i3, long j) {
            GroupMetadata groupMetadata = new GroupMetadata();
            groupMetadata.f6733a = i;
            groupMetadata.f6734b = i2;
            groupMetadata.f6735c = i3;
            groupMetadata.f6736d = j;
            return groupMetadata;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6733a);
            parcel.writeInt(this.f6734b);
            parcel.writeInt(this.f6735c);
            parcel.writeLong(this.f6736d);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4790a(ExpandableRecyclerConnector expandableRecyclerConnector, int i) {
        C1529fn m4796g = expandableRecyclerConnector.m4796g(i);
        m4796g.f7275a = false;
        m4796g.f7279e = -1;
        for (int i2 = 0; i2 < expandableRecyclerConnector.f6725d.size(); i2++) {
            List<AbstractC0879ce> valueAt = expandableRecyclerConnector.f6725d.valueAt(i2);
            int keyAt = expandableRecyclerConnector.f6725d.keyAt(i2);
            List<AbstractC0879ce> list = expandableRecyclerConnector.f6724c.get(keyAt);
            if (list == null) {
                list = new ArrayList<>();
                expandableRecyclerConnector.f6724c.put(keyAt, list);
            }
            list.addAll(valueAt);
        }
        expandableRecyclerConnector.f6725d.clear();
    }
}
