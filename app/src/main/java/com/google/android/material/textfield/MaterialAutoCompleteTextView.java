package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.C0228bt;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: a */
    private final C0228bt f10432a;

    /* renamed from: b */
    private final AccessibilityManager f10433b;

    /* renamed from: c */
    private final Rect f10434c;

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, 0), attributeSet, i);
        this.f10434c = new Rect();
        Context context2 = getContext();
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.MaterialAutoCompleteTextView, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (m7095a.hasValue(R.styleable.MaterialAutoCompleteTextView_android_inputType) && m7095a.getInt(R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f10433b = (AccessibilityManager) context2.getSystemService("accessibility");
        this.f10432a = new C0228bt(context2);
        this.f10432a.m868j();
        this.f10432a.m862b(this);
        this.f10432a.m873o();
        this.f10432a.mo745a(getAdapter());
        this.f10432a.m858a(new C2401z(this));
        m7095a.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (getInputType() == 0 && this.f10433b != null && this.f10433b.isTouchExplorationEnabled()) {
            this.f10432a.mo391a_();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f10432a.mo745a(getAdapter());
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m7551a = m7551a();
        if (m7551a != null && m7551a.m7612a()) {
            return m7551a.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m7551a = m7551a();
            int i3 = 0;
            if (adapter != null && m7551a != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.f10432a.m877s()) + 15);
                int i4 = 0;
                View view = null;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, m7551a);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable m860b = this.f10432a.m860b();
                if (m860b != null) {
                    m860b.getPadding(this.f10434c);
                    i4 += this.f10434c.left + this.f10434c.right;
                }
                i3 = i4 + m7551a.getEndIconView().getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private TextInputLayout m7551a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m7552a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = materialAutoCompleteTextView.getAdapter();
        materialAutoCompleteTextView.setAdapter(null);
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj));
        materialAutoCompleteTextView.setAdapter(adapter);
    }
}
