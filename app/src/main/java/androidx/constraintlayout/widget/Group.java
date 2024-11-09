package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public final void mo1354a(AttributeSet attributeSet) {
        super.mo1354a(attributeSet);
        this.f1871e = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public final void mo1357a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1868b; i++) {
            View m1364a = constraintLayout.m1364a(this.f1867a[i]);
            if (m1364a != null) {
                m1364a.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    m1364a.setElevation(elevation);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: b */
    public final void mo1358b() {
        C0384a c0384a = (C0384a) getLayoutParams();
        c0384a.f1935al.m1222i(0);
        c0384a.f1935al.m1224j(0);
    }
}
