package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.p024g.C0525j;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0484e;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.C2304q;
import com.google.android.material.theme.p084a.C2402a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: a */
    private static final String f9327a = "MaterialButtonToggleGroup";

    /* renamed from: b */
    private static final int f9328b = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: c */
    private final List<C2105h> f9329c;

    /* renamed from: d */
    private final C2104g f9330d;

    /* renamed from: e */
    private final C2106i f9331e;

    /* renamed from: f */
    private final LinkedHashSet<Object> f9332f;

    /* renamed from: g */
    private final Comparator<MaterialButton> f9333g;

    /* renamed from: h */
    private Integer[] f9334h;

    /* renamed from: i */
    private boolean f9335i;

    /* renamed from: j */
    private boolean f9336j;

    /* renamed from: k */
    private boolean f9337k;

    /* renamed from: l */
    private int f9338l;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9328b), attributeSet, i);
        this.f9329c = new ArrayList();
        this.f9330d = new C2104g(this, (byte) 0);
        this.f9331e = new C2106i(this, (byte) 0);
        this.f9332f = new LinkedHashSet<>();
        this.f9333g = new C2102e(this);
        this.f9335i = false;
        TypedArray m7095a = C2243al.m7095a(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i, f9328b, new int[0]);
        setSingleSelection(m7095a.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f9338l = m7095a.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f9337k = m7095a.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        m7095a.recycle();
        C0538w.m1840a((View) this, 1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f9338l != -1) {
            int i = this.f9338l;
            m6515a(i, true);
            m6521b(i, true);
            setCheckedId(i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f9327a, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m6521b(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C2303p shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9329c.add(new C2105h(shapeAppearanceModel.m7308f(), shapeAppearanceModel.m7311i(), shapeAppearanceModel.m7309g(), shapeAppearanceModel.m7310h()));
        C0538w.m1849a(materialButton, new C2103f(this));
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.m6508b(this.f9330d);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9329c.remove(indexOfChild);
        }
        m6519b();
        m6514a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m6519b();
        m6514a();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0482c.m1635a(accessibilityNodeInfo).m1653a(C0484e.m1714a(1, getVisibleButtonCount(), this.f9336j ? 1 : 2));
    }

    public int getCheckedButtonId() {
        if (this.f9336j) {
            return this.f9338l;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m6512a = m6512a(i);
            if (m6512a.isChecked()) {
                arrayList.add(Integer.valueOf(m6512a.getId()));
            }
        }
        return arrayList;
    }

    public void setSingleSelection(boolean z) {
        if (this.f9336j != z) {
            this.f9336j = z;
            this.f9335i = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton m6512a = m6512a(i);
                m6512a.setChecked(false);
                m6512a.getId();
                m6523c();
            }
            this.f9335i = false;
            setCheckedId(-1);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f9337k = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* renamed from: a */
    private void m6515a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f9335i = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f9335i = false;
        }
    }

    private void setCheckedId(int i) {
        this.f9338l = i;
        m6523c();
    }

    /* renamed from: a */
    private void m6514a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m6512a = m6512a(i);
            int min = Math.min(m6512a.getStrokeWidth(), m6512a(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m6511a = m6511a(m6512a);
            if (getOrientation() == 0) {
                C0525j.m1788b(m6511a, 0);
                C0525j.m1786a(m6511a, -min);
            } else {
                m6511a.bottomMargin = 0;
                m6511a.topMargin = -min;
            }
            m6512a.setLayoutParams(m6511a);
        }
        m6520b(firstVisibleChildIndex);
    }

    /* renamed from: a */
    private MaterialButton m6512a(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: b */
    private void m6520b(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m6512a(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            C0525j.m1788b(layoutParams, 0);
            C0525j.m1786a(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: b */
    private void m6519b() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m6512a = m6512a(i);
            if (m6512a.getVisibility() != 8) {
                C2304q m7313k = m6512a.getShapeAppearanceModel().m7313k();
                m6517a(m7313k, m6513a(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m6512a.setShapeAppearanceModel(m7313k.m7327a());
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m6525c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m6525c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private boolean m6525c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m6525c(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private C2105h m6513a(int i, int i2, int i3) {
        int childCount = getChildCount();
        C2105h c2105h = this.f9329c.get(i);
        if (childCount == 1) {
            return c2105h;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C2105h.m6556a(c2105h, this) : C2105h.m6555a(c2105h);
        }
        if (i == i3) {
            return z ? C2105h.m6558b(c2105h, this) : C2105h.m6557b(c2105h);
        }
        return null;
    }

    /* renamed from: a */
    private static void m6517a(C2304q c2304q, C2105h c2105h) {
        if (c2105h == null) {
            c2304q.m7332b(0.0f);
        } else {
            c2304q.m7333b(c2105h.f9362a).m7343e(c2105h.f9365d).m7337c(c2105h.f9363b).m7340d(c2105h.f9364c);
        }
    }

    /* renamed from: b */
    public void m6521b(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f9337k && checkedButtonIds.isEmpty()) {
            m6515a(i, true);
            this.f9338l = i;
        } else if (z && this.f9336j) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                m6515a(it.next().intValue(), false);
                m6523c();
            }
        }
    }

    /* renamed from: c */
    public void m6523c() {
        Iterator<Object> it = this.f9332f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C0538w.m1834a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.m6507a(this.f9330d);
        materialButton.setOnPressedChangeListenerInternal(this.f9331e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    private static LinearLayout.LayoutParams m6511a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f9334h == null || i2 >= this.f9334h.length) {
            Log.w(f9327a, "Child order wasn't updated");
            return i2;
        }
        return this.f9334h[i2].intValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9333g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m6512a(i), Integer.valueOf(i));
        }
        this.f9334h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public static /* synthetic */ int m6510a(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < materialButtonToggleGroup.getChildCount(); i2++) {
            if (materialButtonToggleGroup.getChildAt(i2) == view) {
                return i;
            }
            if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.m6525c(i2)) {
                i++;
            }
        }
        return -1;
    }
}
