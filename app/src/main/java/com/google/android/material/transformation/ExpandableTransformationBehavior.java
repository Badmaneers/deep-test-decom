package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: a */
    private AnimatorSet f10608a;

    /* renamed from: b */
    protected abstract AnimatorSet mo7696b(View view, View view2, boolean z, boolean z2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ AnimatorSet m7695a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        expandableTransformationBehavior.f10608a = null;
        return null;
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo7694a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f10608a != null;
        if (z3) {
            this.f10608a.cancel();
        }
        this.f10608a = mo7696b(view, view2, z, z3);
        this.f10608a.addListener(new C2404b(this));
        this.f10608a.start();
        if (!z2) {
            this.f10608a.end();
        }
        return true;
    }
}
