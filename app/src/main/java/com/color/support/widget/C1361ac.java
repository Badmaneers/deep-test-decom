package com.color.support.widget;

import android.database.DataSetObserver;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.HeterogeneousExpandableList;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.ac */
/* loaded from: classes.dex */
public final class C1361ac extends BaseExpandableListAdapter {

    /* renamed from: b */
    private ColorExpandableListView f6911b;

    /* renamed from: f */
    private ExpandableListAdapter f6915f;

    /* renamed from: a */
    private SparseArray<C1360ab> f6910a = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<C1637z> f6912c = new SparseArray<>();

    /* renamed from: d */
    private SparseArray<List<View>> f6913d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<List<View>> f6914e = new SparseArray<>();

    /* renamed from: g */
    private final DataSetObserver f6916g = new C1364af(this);

    public C1361ac(ExpandableListAdapter expandableListAdapter, ColorExpandableListView colorExpandableListView) {
        this.f6911b = colorExpandableListView;
        if (this.f6915f != null) {
            this.f6915f.unregisterDataSetObserver(this.f6916g);
        }
        this.f6915f = expandableListAdapter;
        this.f6915f.registerDataSetObserver(this.f6916g);
    }

    /* renamed from: a */
    private C1360ab m4871a(int i) {
        C1360ab c1360ab = this.f6910a.get(i);
        if (c1360ab != null) {
            return c1360ab;
        }
        C1360ab c1360ab2 = new C1360ab((byte) 0);
        this.f6910a.put(i, c1360ab2);
        return c1360ab2;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildType(int i, int i2) {
        return m4871a(i).f6904a ? RecyclerView.UNDEFINED_DURATION : m4868a(i, i2);
    }

    /* renamed from: a */
    private int m4868a(int i, int i2) {
        if (!(this.f6915f instanceof HeterogeneousExpandableList)) {
            return 1;
        }
        int childType = ((HeterogeneousExpandableList) this.f6915f).getChildType(i, i2) + 1;
        if (childType >= 0) {
            return childType;
        }
        throw new RuntimeException("getChildType must is greater than 0");
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f6915f.getGroupCount();
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildTypeCount() {
        if (this.f6915f instanceof HeterogeneousExpandableList) {
            return ((HeterogeneousExpandableList) this.f6915f).getChildTypeCount() + 1;
        }
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C1360ab m4871a = m4871a(i);
        m4871a.f6906c = z;
        if (m4871a.f6904a) {
            boolean z2 = z && i == getGroupCount() - 1;
            C1360ab m4871a2 = m4871a(i);
            if (!(view instanceof C1635x)) {
                view = new C1635x(this.f6911b.getContext());
                view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            }
            C1635x c1635x = (C1635x) view;
            c1635x.m5444a();
            c1635x.m5445a(this.f6911b.getDivider(), this.f6911b.getMeasuredWidth(), this.f6911b.getDividerHeight());
            int m4869a = m4869a(m4871a2.f6905b, i, c1635x);
            m4871a2.f6907d = c1635x;
            m4871a2.f6908e = m4869a;
            Object tag = c1635x.getTag();
            int intValue = tag != null ? ((Integer) tag).intValue() : 0;
            if (m4871a2.f6905b && intValue != 1) {
                m4872a(c1635x, i, z2, m4869a);
            } else if (!m4871a2.f6905b && intValue != 2) {
                m4875b(c1635x, i, z2, m4869a);
            } else {
                Log.e("ColorExpandableListView", "getAnimationView: state is no match:".concat(String.valueOf(intValue)));
            }
            return view;
        }
        return this.f6915f.getChildView(i, i2, z, view, viewGroup);
    }

    /* renamed from: a */
    private int m4869a(boolean z, int i, C1635x c1635x) {
        int bottom;
        boolean z2 = true;
        if (this.f6911b.getChildCount() > 0) {
            this.f6911b.getChildAt(this.f6911b.getChildCount() - 1).getBottom();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f6911b.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (z && this.f6911b.getLayoutParams().height == -2) {
            bottom = this.f6911b.getContext().getResources().getDisplayMetrics().heightPixels;
        } else {
            bottom = this.f6911b.getBottom();
        }
        int i2 = bottom;
        int childrenCount = this.f6915f.getChildrenCount(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < childrenCount) {
            List<View> list = this.f6913d.get(m4868a(i, i3));
            View remove = (list == null || list.isEmpty()) ? null : list.remove(0);
            ExpandableListAdapter expandableListAdapter = this.f6915f;
            boolean z3 = i3 == childrenCount + (-1) ? z2 : false;
            int i5 = i3;
            int i6 = i3;
            View view = remove;
            int i7 = childrenCount;
            View childView = expandableListAdapter.getChildView(i, i5, z3, view, this.f6911b);
            int m4868a = m4868a(i, i6);
            List<View> list2 = this.f6914e.get(m4868a);
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            list2.add(childView);
            this.f6914e.put(m4868a, list2);
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) childView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
                childView.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            int makeMeasureSpec3 = i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : makeMeasureSpec2;
            childView.setLayoutDirection(this.f6911b.getLayoutDirection());
            childView.measure(makeMeasureSpec, makeMeasureSpec3);
            int measuredHeight = childView.getMeasuredHeight() + i4;
            c1635x.m5446a(childView);
            if ((!z && measuredHeight + 0 > i2) || (z && measuredHeight > (i2 + 0) * 2)) {
                return measuredHeight;
            }
            i3 = i6 + 1;
            i4 = measuredHeight;
            childrenCount = i7;
            z2 = true;
        }
        return i4;
    }

    /* renamed from: a */
    private void m4872a(C1635x c1635x, int i, boolean z, int i2) {
        C1360ab m4871a = m4871a(i);
        C1637z c1637z = this.f6912c.get(i);
        if (c1637z == null) {
            c1637z = new C1637z(this.f6911b, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
            this.f6912c.put(i, c1637z);
        } else {
            c1637z.removeAllListeners();
            c1637z.cancel();
        }
        C1637z c1637z2 = c1637z;
        c1637z2.m5451a(true, z, i, c1635x, m4871a, m4871a.f6909f == -1 ? 0 : m4871a.f6909f, i2);
        c1637z2.addListener(new C1362ad(this, c1635x, i));
        c1637z2.start();
        c1635x.setTag(1);
    }

    /* renamed from: b */
    private void m4875b(C1635x c1635x, int i, boolean z, int i2) {
        C1360ab m4871a = m4871a(i);
        C1637z c1637z = this.f6912c.get(i);
        if (c1637z == null) {
            c1637z = new C1637z(this.f6911b, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
            this.f6912c.put(i, c1637z);
        } else {
            c1637z.removeAllListeners();
            c1637z.cancel();
        }
        C1637z c1637z2 = c1637z;
        if (m4871a.f6909f != -1) {
            i2 = m4871a.f6909f;
        }
        c1637z2.m5451a(false, z, i, c1635x, m4871a, i2, 0);
        c1637z2.addListener(new C1363ae(this, c1635x, i));
        c1637z2.start();
        c1635x.setTag(2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        if (m4871a(i).f6904a) {
            return false;
        }
        return this.f6915f.isChildSelectable(i, i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        if (m4871a(i).f6904a) {
            return 1;
        }
        return this.f6915f.getChildrenCount(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f6915f.getGroup(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return this.f6915f.getChild(i, i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return this.f6915f.getGroupId(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return this.f6915f.getChildId(i, i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return this.f6915f.hasStableIds();
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        return this.f6915f.getGroupView(i, z, view, viewGroup);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4873a(C1361ac c1361ac, int i) {
        C1360ab m4871a = c1361ac.m4871a(i);
        if (m4871a.f6904a && m4871a.f6905b) {
            return false;
        }
        m4871a.f6904a = true;
        m4871a.f6905b = true;
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ void m4874b(C1361ac c1361ac, int i) {
        C1360ab m4871a = c1361ac.m4871a(i);
        m4871a.f6909f = -1;
        m4871a.f6904a = false;
        for (int i2 = 0; i2 < c1361ac.f6914e.size(); i2++) {
            List<View> valueAt = c1361ac.f6914e.valueAt(i2);
            int keyAt = c1361ac.f6914e.keyAt(i2);
            List<View> list = c1361ac.f6913d.get(keyAt);
            if (list == null) {
                list = new ArrayList<>();
                c1361ac.f6913d.put(keyAt, list);
            }
            list.addAll(valueAt);
        }
        c1361ac.f6914e.clear();
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m4876c(C1361ac c1361ac, int i) {
        C1360ab m4871a = c1361ac.m4871a(i);
        if (m4871a.f6904a && m4871a.f6905b && m4871a.f6907d != null) {
            m4871a.f6905b = false;
            c1361ac.m4875b(m4871a.f6907d, i, m4871a.f6906c, m4871a.f6909f);
            return false;
        }
        if (m4871a.f6904a && !m4871a.f6905b && m4871a.f6907d != null) {
            c1361ac.m4872a(m4871a.f6907d, i, m4871a.f6906c, m4871a.f6908e);
            m4871a.f6905b = true;
            return false;
        }
        m4871a.f6904a = true;
        m4871a.f6905b = false;
        return true;
    }
}
