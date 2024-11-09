package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a */
    C0386c f1893a;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1367a();
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1367a();
        super.setVisibility(8);
    }

    /* renamed from: a */
    private static void m1367a() {
        Log.v("Constraints", " ################# init");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0384a(layoutParams);
    }

    public C0386c getConstraintSet() {
        if (this.f1893a == null) {
            this.f1893a = new C0386c();
        }
        this.f1893a.m1376a(this);
        return this.f1893a;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0388e();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0388e(getContext(), attributeSet);
    }
}
