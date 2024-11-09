package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0484e;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.theme.p084a.C2402a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: a */
    private static final int f9426a = R.style.Widget_MaterialComponents_ChipGroup;

    /* renamed from: b */
    private int f9427b;

    /* renamed from: c */
    private int f9428c;

    /* renamed from: d */
    private boolean f9429d;

    /* renamed from: e */
    private boolean f9430e;

    /* renamed from: f */
    private InterfaceC2118h f9431f;

    /* renamed from: g */
    private final C2116f f9432g;

    /* renamed from: h */
    private ViewGroupOnHierarchyChangeListenerC2119i f9433h;

    /* renamed from: i */
    private int f9434i;

    /* renamed from: j */
    private boolean f9435j;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9426a), attributeSet, i);
        this.f9432g = new C2116f(this, (byte) 0);
        this.f9433h = new ViewGroupOnHierarchyChangeListenerC2119i(this, (byte) 0);
        this.f9434i = -1;
        this.f9435j = false;
        TypedArray m7095a = C2243al.m7095a(getContext(), attributeSet, R.styleable.ChipGroup, i, f9426a, new int[0]);
        int dimensionPixelOffset = m7095a.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m7095a.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m7095a.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m7095a.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(m7095a.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(m7095a.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        int resourceId = m7095a.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f9434i = resourceId;
        }
        m7095a.recycle();
        super.setOnHierarchyChangeListener(this.f9433h);
        C0538w.m1840a((View) this, 1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0482c.m1635a(accessibilityNodeInfo).m1653a(C0484e.m1714a(getRowCount(), super.mo6645a() ? getChipCount() : -1, this.f9429d ? 1 : 2));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2117g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2117g(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2117g();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2117g);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9433h.f9505b = onHierarchyChangeListener;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f9434i != -1) {
            m6636a(this.f9434i, true);
            setCheckedId(this.f9434i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                if (this.f9434i != -1 && this.f9429d) {
                    m6636a(this.f9434i, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public int getCheckedChipId() {
        if (this.f9429d) {
            return this.f9434i;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f9429d) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public void setOnCheckedChangeListener(InterfaceC2118h interfaceC2118h) {
        this.f9431f = interfaceC2118h;
    }

    /* renamed from: a */
    public void m6636a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f9435j = true;
            ((Chip) findViewById).setChecked(z);
            this.f9435j = false;
        }
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public int getChipSpacingHorizontal() {
        return this.f9427b;
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f9427b != i) {
            this.f9427b = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public int getChipSpacingVertical() {
        return this.f9428c;
    }

    public void setChipSpacingVertical(int i) {
        if (this.f9428c != i) {
            this.f9428c = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: a */
    public final boolean mo6645a() {
        return super.mo6645a();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f9429d != z) {
            this.f9429d = z;
            this.f9435j = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f9435j = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSelectionRequired(boolean z) {
        this.f9430e = z;
    }

    public void setCheckedId(int i) {
        this.f9434i = i;
    }
}
