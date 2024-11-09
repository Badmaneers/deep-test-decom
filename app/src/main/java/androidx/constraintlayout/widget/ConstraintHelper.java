package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.p014a.p015a.C0364q;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    protected int[] f1867a;

    /* renamed from: b */
    protected int f1868b;

    /* renamed from: c */
    protected Context f1869c;

    /* renamed from: d */
    protected C0364q f1870d;

    /* renamed from: e */
    protected boolean f1871e;

    /* renamed from: f */
    private String f1872f;

    /* renamed from: b */
    public void mo1358b() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.f1867a = new int[32];
        this.f1871e = false;
        this.f1869c = context;
        mo1354a((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1867a = new int[32];
        this.f1871e = false;
        this.f1869c = context;
        mo1354a(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1867a = new int[32];
        this.f1871e = false;
        this.f1869c = context;
        mo1354a(attributeSet);
    }

    /* renamed from: a */
    public void mo1354a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f1872f = obtainStyledAttributes.getString(index);
                    setIds(this.f1872f);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1867a, this.f1868b);
    }

    public void setReferencedIds(int[] iArr) {
        this.f1868b = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        if (this.f1868b + 1 > this.f1867a.length) {
            this.f1867a = Arrays.copyOf(this.f1867a, this.f1867a.length * 2);
        }
        this.f1867a[this.f1868b] = i;
        this.f1868b++;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1871e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: a */
    public final void m1356a() {
        if (this.f1870d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0384a) {
            ((C0384a) layoutParams).f1935al = this.f1870d;
        }
    }

    /* renamed from: a */
    private void m1355a(String str) {
        Object m1366a;
        if (str == null || this.f1869c == null) {
            return;
        }
        String trim = str.trim();
        int i = 0;
        try {
            i = R.id.class.getField(trim).getInt(null);
        } catch (Exception unused) {
        }
        if (i == 0) {
            i = this.f1869c.getResources().getIdentifier(trim, "id", this.f1869c.getPackageName());
        }
        if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (m1366a = ((ConstraintLayout) getParent()).m1366a(trim)) != null && (m1366a instanceof Integer)) {
            i = ((Integer) m1366a).intValue();
        }
        if (i != 0) {
            setTag(i, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m1355a(str.substring(i));
                return;
            } else {
                m1355a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* renamed from: a */
    public void mo1357a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1872f);
        }
        if (this.f1870d == null) {
            return;
        }
        this.f1870d.m1274H();
        for (int i = 0; i < this.f1868b; i++) {
            View m1364a = constraintLayout.m1364a(this.f1867a[i]);
            if (m1364a != null) {
                this.f1870d.m1275a(constraintLayout.m1365a(m1364a));
            }
        }
    }
}
