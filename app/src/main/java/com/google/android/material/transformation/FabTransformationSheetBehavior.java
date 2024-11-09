package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.p072a.C2039h;
import com.google.android.material.p072a.C2041j;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: a */
    private Map<View, Integer> f10617a;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: a */
    protected final C2409g mo7705a(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C2409g c2409g = new C2409g();
        c2409g.f10634a = C2039h.m6245a(context, i);
        c2409g.f10635b = new C2041j();
        return c2409g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public final boolean mo7694a(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f10617a = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof C0394f) && (((C0394f) childAt.getLayoutParams()).m1430b() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        if (this.f10617a != null && this.f10617a.containsKey(childAt)) {
                            C0538w.m1840a(childAt, this.f10617a.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f10617a.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0538w.m1840a(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f10617a = null;
            }
        }
        return super.mo7694a(view, view2, z, z2);
    }
}
