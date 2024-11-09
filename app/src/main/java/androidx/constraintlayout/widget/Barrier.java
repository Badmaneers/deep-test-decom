package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.constraintlayout.p014a.p015a.C0349b;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: f */
    private int f1864f;

    /* renamed from: g */
    private int f1865g;

    /* renamed from: h */
    private C0349b f1866h;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f1864f;
    }

    public void setType(int i) {
        this.f1864f = i;
        this.f1865g = i;
        if (Build.VERSION.SDK_INT < 17) {
            if (this.f1864f == 5) {
                this.f1865g = 0;
            } else if (this.f1864f == 6) {
                this.f1865g = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                if (this.f1864f == 5) {
                    this.f1865g = 1;
                } else if (this.f1864f == 6) {
                    this.f1865g = 0;
                }
            } else if (this.f1864f == 5) {
                this.f1865g = 0;
            } else if (this.f1864f == 6) {
                this.f1865g = 1;
            }
        }
        this.f1866h.m1158a(this.f1865g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public final void mo1354a(AttributeSet attributeSet) {
        super.mo1354a(attributeSet);
        this.f1866h = new C0349b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1866h.m1160a(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f1870d = this.f1866h;
        m1356a();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1866h.m1160a(z);
    }
}
