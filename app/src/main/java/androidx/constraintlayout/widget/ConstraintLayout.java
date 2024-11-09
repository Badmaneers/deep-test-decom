package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.p014a.C0378g;
import androidx.constraintlayout.p014a.p015a.C0357j;
import androidx.constraintlayout.p014a.p015a.C0360m;
import androidx.constraintlayout.p014a.p015a.C0362o;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f1873a;

    /* renamed from: b */
    C0360m f1874b;

    /* renamed from: c */
    int f1875c;

    /* renamed from: d */
    int f1876d;

    /* renamed from: e */
    int f1877e;

    /* renamed from: f */
    int f1878f;

    /* renamed from: g */
    private ArrayList<ConstraintHelper> f1879g;

    /* renamed from: h */
    private final ArrayList<C0357j> f1880h;

    /* renamed from: i */
    private int f1881i;

    /* renamed from: j */
    private int f1882j;

    /* renamed from: k */
    private int f1883k;

    /* renamed from: l */
    private int f1884l;

    /* renamed from: m */
    private boolean f1885m;

    /* renamed from: n */
    private int f1886n;

    /* renamed from: o */
    private C0386c f1887o;

    /* renamed from: p */
    private int f1888p;

    /* renamed from: q */
    private HashMap<String, Integer> f1889q;

    /* renamed from: r */
    private int f1890r;

    /* renamed from: s */
    private int f1891s;

    /* renamed from: t */
    private C0378g f1892t;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    private void m1361a(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1889q == null) {
                this.f1889q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1889q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: a */
    public final Object m1366a(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f1889q == null || !this.f1889q.containsKey(str)) {
            return null;
        }
        return this.f1889q.get(str);
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f1873a = new SparseArray<>();
        this.f1879g = new ArrayList<>(4);
        this.f1880h = new ArrayList<>(100);
        this.f1874b = new C0360m();
        this.f1881i = 0;
        this.f1882j = 0;
        this.f1883k = Integer.MAX_VALUE;
        this.f1884l = Integer.MAX_VALUE;
        this.f1885m = true;
        this.f1886n = 7;
        this.f1887o = null;
        this.f1888p = -1;
        this.f1889q = new HashMap<>();
        this.f1890r = -1;
        this.f1891s = -1;
        this.f1875c = -1;
        this.f1876d = -1;
        this.f1877e = 0;
        this.f1878f = 0;
        m1360a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1873a = new SparseArray<>();
        this.f1879g = new ArrayList<>(4);
        this.f1880h = new ArrayList<>(100);
        this.f1874b = new C0360m();
        this.f1881i = 0;
        this.f1882j = 0;
        this.f1883k = Integer.MAX_VALUE;
        this.f1884l = Integer.MAX_VALUE;
        this.f1885m = true;
        this.f1886n = 7;
        this.f1887o = null;
        this.f1888p = -1;
        this.f1889q = new HashMap<>();
        this.f1890r = -1;
        this.f1891s = -1;
        this.f1875c = -1;
        this.f1876d = -1;
        this.f1877e = 0;
        this.f1878f = 0;
        m1360a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1873a = new SparseArray<>();
        this.f1879g = new ArrayList<>(4);
        this.f1880h = new ArrayList<>(100);
        this.f1874b = new C0360m();
        this.f1881i = 0;
        this.f1882j = 0;
        this.f1883k = Integer.MAX_VALUE;
        this.f1884l = Integer.MAX_VALUE;
        this.f1885m = true;
        this.f1886n = 7;
        this.f1887o = null;
        this.f1888p = -1;
        this.f1889q = new HashMap<>();
        this.f1890r = -1;
        this.f1891s = -1;
        this.f1875c = -1;
        this.f1876d = -1;
        this.f1877e = 0;
        this.f1878f = 0;
        m1360a(attributeSet);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f1873a.remove(getId());
        super.setId(i);
        this.f1873a.put(getId(), this);
    }

    /* renamed from: a */
    private void m1360a(AttributeSet attributeSet) {
        this.f1874b.m1196a(this);
        this.f1873a.put(getId(), this);
        this.f1887o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f1881i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1881i);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f1882j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1882j);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1883k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1883k);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1884l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1884l);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1886n = obtainStyledAttributes.getInt(index, this.f1886n);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f1887o = new C0386c();
                        this.f1887o.m1374a(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f1887o = null;
                    }
                    this.f1888p = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1874b.m1260a(this.f1886n);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0357j m1365a = m1365a(view);
        if ((view instanceof Guideline) && !(m1365a instanceof C0362o)) {
            C0384a c0384a = (C0384a) view.getLayoutParams();
            c0384a.f1935al = new C0362o();
            c0384a.f1921Y = true;
            ((C0362o) c0384a.f1935al).m1270a(c0384a.f1915S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m1356a();
            ((C0384a) view.getLayoutParams()).f1922Z = true;
            if (!this.f1879g.contains(constraintHelper)) {
                this.f1879g.add(constraintHelper);
            }
        }
        this.f1873a.put(view.getId(), view);
        this.f1885m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1873a.remove(view.getId());
        C0357j m1365a = m1365a(view);
        this.f1874b.m1304b(m1365a);
        this.f1879g.remove(view);
        this.f1880h.remove(m1365a);
        this.f1885m = true;
    }

    public void setMinWidth(int i) {
        if (i == this.f1881i) {
            return;
        }
        this.f1881i = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1882j) {
            return;
        }
        this.f1882j = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.f1881i;
    }

    public int getMinHeight() {
        return this.f1882j;
    }

    public void setMaxWidth(int i) {
        if (i == this.f1883k) {
            return;
        }
        this.f1883k = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.f1884l) {
            return;
        }
        this.f1884l = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f1883k;
    }

    public int getMaxHeight() {
        return this.f1884l;
    }

    /* renamed from: b */
    private final C0357j m1362b(int i) {
        if (i == 0) {
            return this.f1874b;
        }
        View view = this.f1873a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1874b;
        }
        if (view == null) {
            return null;
        }
        return ((C0384a) view.getLayoutParams()).f1935al;
    }

    /* renamed from: a */
    public final C0357j m1365a(View view) {
        if (view == this) {
            return this.f1874b;
        }
        if (view == null) {
            return null;
        }
        return ((C0384a) view.getLayoutParams()).f1935al;
    }

    /* JADX WARN: Code restructure failed: missing block: B:676:0x092e, code lost:            if (r7.f1905I != 1) goto L1205;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x09c0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r55, int r56) {
        /*
            Method dump skipped, instructions count: 3461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    private void m1363b() {
        this.f1874b.mo1257K();
        if (this.f1892t != null) {
            this.f1892t.f1817c++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0384a c0384a = (C0384a) childAt.getLayoutParams();
            C0357j c0357j = c0384a.f1935al;
            if ((childAt.getVisibility() != 8 || c0384a.f1921Y || c0384a.f1922Z || isInEditMode) && !c0384a.f1924aa) {
                int m1241s = c0357j.m1241s();
                int m1243t = c0357j.m1243t();
                int m1233o = c0357j.m1233o() + m1241s;
                int m1237q = c0357j.m1237q() + m1243t;
                childAt.layout(m1241s, m1243t, m1233o, m1237q);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m1241s, m1243t, m1233o, m1237q);
                }
            }
        }
        int size = this.f1879g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f1879g.get(i6).mo1358b();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1874b.m1260a(i);
    }

    public int getOptimizationLevel() {
        return this.f1874b.m1254H();
    }

    /* renamed from: a */
    public static C0384a m1359a() {
        return new C0384a();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0384a(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0384a;
    }

    public void setConstraintSet(C0386c c0386c) {
        this.f1887o = c0386c;
    }

    /* renamed from: a */
    public final View m1364a(int i) {
        return this.f1873a.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((parseInt / 1080.0f) * width);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i2;
                        float f2 = i3;
                        float f3 = i2 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f1885m = true;
        this.f1890r = -1;
        this.f1891s = -1;
        this.f1875c = -1;
        this.f1876d = -1;
        this.f1877e = 0;
        this.f1878f = 0;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0384a();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0384a(getContext(), attributeSet);
    }
}
