package com.color.support.widget;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.aa */
/* loaded from: classes.dex */
public final class C1359aa implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ boolean f6898a;

    /* renamed from: b */
    final /* synthetic */ int f6899b;

    /* renamed from: c */
    final /* synthetic */ boolean f6900c;

    /* renamed from: d */
    final /* synthetic */ View f6901d;

    /* renamed from: e */
    final /* synthetic */ C1360ab f6902e;

    /* renamed from: f */
    final /* synthetic */ C1637z f6903f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1359aa(C1637z c1637z, boolean z, int i, boolean z2, View view, C1360ab c1360ab) {
        this.f6903f = c1637z;
        this.f6898a = z;
        this.f6899b = i;
        this.f6900c = z2;
        this.f6901d = view;
        this.f6902e = c1360ab;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        WeakReference weakReference;
        boolean z;
        boolean z2;
        boolean z3;
        weakReference = this.f6903f.f7811a;
        ColorExpandableListView colorExpandableListView = (ColorExpandableListView) weakReference.get();
        if (colorExpandableListView == null) {
            Log.e("ColorExpandableListView", "onAnimationUpdate: expandable list is null");
            C1637z.m5448b(this.f6903f);
            return;
        }
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(colorExpandableListView.getExpandableListPosition(colorExpandableListView.getFirstVisiblePosition()));
        long expandableListPosition = colorExpandableListView.getExpandableListPosition(colorExpandableListView.getLastVisiblePosition());
        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(expandableListPosition);
        int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
        z = this.f6903f.f7812b;
        if (z || this.f6898a || (packedPositionGroup <= this.f6899b && packedPositionGroup2 >= this.f6899b)) {
            z2 = this.f6903f.f7812b;
            if (z2 || this.f6898a || !this.f6900c || packedPositionGroup2 != this.f6899b || packedPositionChild != 0) {
                z3 = this.f6903f.f7812b;
                if (!z3 && this.f6898a && this.f6900c && this.f6901d.getBottom() > colorExpandableListView.getBottom()) {
                    Log.d("ColorExpandableListView", "onAnimationUpdate3: " + this.f6901d.getBottom() + "," + colorExpandableListView.getBottom());
                    C1637z.m5448b(this.f6903f);
                    return;
                }
                C1637z.m5450d(this.f6903f);
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6902e.f6909f = intValue;
                this.f6901d.getLayoutParams().height = intValue;
                this.f6901d.requestLayout();
                return;
            }
            Log.d("ColorExpandableListView", "onAnimationUpdate: expand is screen over, last:".concat(String.valueOf(packedPositionGroup2)));
            C1637z.m5448b(this.f6903f);
            return;
        }
        Log.d("ColorExpandableListView", "onAnimationUpdate: all is screen out, first:" + packedPositionGroup + ",groupPos:" + this.f6899b + ",last:" + packedPositionGroup2);
        C1637z.m5448b(this.f6903f);
    }
}
